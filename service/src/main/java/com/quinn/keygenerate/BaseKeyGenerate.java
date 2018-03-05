package com.quinn.keygenerate;

import com.quinn.app.common.util.CommonUtil;

import java.util.Calendar;

/**
 * @author Quinn
 * @date 2018/3/2
 * @package com.quinn.keygenerate
 */
public class BaseKeyGenerate implements KeyGenerate {
    @Override
    public String generateStringKey(KeyGenerateEnum em) {
        return CommonUtil.getUUIDString();
    }

    @Override
    public Long generateLongKey(KeyGenerateEnum em) {
        long d = System.currentTimeMillis();
        int dd = (int) ((Math.random() * 9 + 1) * 100000);
        return Long.parseLong(d+""+dd);
    }

}
