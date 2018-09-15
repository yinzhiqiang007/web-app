package com.quinn.app.common.util;


import lombok.Data;

@Data
public class RestResult {

    /**
     * 消息码
     */
    private String code;
    /**
     * 消息内容
     */
    private String message;
    /**
     * 返回数据
     */
    private Object data;
    private Object param;

    public RestResult(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public RestResult(String code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public RestResult(String code, String message, Object data, Object param) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.param = param;
    }

    public RestResult() {
    }
}
