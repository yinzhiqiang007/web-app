package com.quinn.app.common.constans;


import lombok.Data;

@Data
public class ResponseUtils {



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

    public ResponseUtils() {

    }


}
