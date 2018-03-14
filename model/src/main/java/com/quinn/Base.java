package com.quinn;

/**
 * @author Quinn
 * @date 2018/1/12
 * @package com.quinn.app.model
 */
public class Base {

    //已知数据
    private int pageNum = 1;    //当前页,从请求那边传过来。
    private int pageSize = 10;    //每页显示的数据条数。

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
