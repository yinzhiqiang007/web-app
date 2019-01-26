package com.quinn.app.service.impl;

import com.quinn.app.common.constans.ResponseEnum;
import com.quinn.app.common.constans.ResponseUtils;
import com.quinn.app.common.util.CommonUtils;
import com.quinn.app.model.entity.SysConfig;
import com.quinn.app.service.SysConfigService;
import com.quinn.redis.IRedisService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.quinn.app.dao.SysConfigDao;
import com.quinn.BaseServiceImpl;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @author Quinn
 * @date 2018/09/14
 */
@Service("sysConfigService")
public class SysConfigServiceImpl extends BaseServiceImpl<SysConfigDao> implements SysConfigService {

    @Autowired
    private SysConfigDao sysConfigDao;

    @Autowired
    private IRedisService dbCacheRedisService;


    @PostConstruct
    public void init(){
        boolean b = this.dbCacheRedisService.lock("tb_sys_config",20000);
        if(b){
            List<SysConfig> list = this.sysConfigDao.listByEntity(null);
            for(SysConfig sysConfig : list){
                this.dbCacheRedisService.put(sysConfig.getCode(),sysConfig.getValue(),-1);
            }
        }

    }

    @Override
    public ResponseUtils updateByCode(SysConfig sysConfig) {
        SysConfig para = new SysConfig();
        para.setCode(sysConfig.getCode());
        List<SysConfig> list = this.sysConfigDao.listByEntity(para);
        if(CommonUtils.isNotEmptyList(list)){
            sysConfig.setId(list.get(0).getId());
            int i = this.sysConfigDao.updateByIdSelective(sysConfig);
            if(i>0){
                this.dbCacheRedisService.put(sysConfig.getCode(),sysConfig.getValue(),-1);
            }
        }
        return ResponseEnum.code_000000.result();
    }
}
