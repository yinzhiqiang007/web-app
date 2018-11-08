package com.quinn.app.common.util;


import lombok.Data;

@Data
public class ResponseUtils {

    public enum RestEnum {
        code_000000("success"),
        code_100000("系统异常");

        private String message;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        RestEnum(String message) {
            this.message = message;
        }

        public ResponseUtils result() {
            return result(null);
        }

        public ResponseUtils result(Object data) {
            return result(data, null);
        }

        public ResponseUtils result(Object data, Object param) {
            ResponseUtils restResult = new ResponseUtils();
            restResult.setCode(this.name().replace("code_", ""));
            restResult.setMessage(this.message);
            restResult.setData(data);
            restResult.setParam(param);
            return restResult;
        }
    }

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


    public ResponseUtils() {

    }


}
