package com.quinn;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

/**
 * @author Quinn
 * @date 2018/1/12
 * @package com.qiaorong.app.model
 */
public class Base {

    //已知数据
    private Integer pageNum;    //当前页,从请求那边传过来。
    private Integer pageSize;    //每页显示的数据条数。

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Page initPage() {
        if (pageNum == null) {
            this.pageNum = 1;
        }
        if (this.pageSize == null) {
            this.pageSize = 10;
        }
        return PageHelper.startPage(getPageNum(), getPageSize());
    }
}
