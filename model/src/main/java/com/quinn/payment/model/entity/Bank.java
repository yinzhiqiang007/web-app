package com.quinn.payment.model.entity;


import com.quinn.Base;

/**
 * @author Quinn
 * @date 2018/1/15
 */
public class Bank extends Base {


        private Long id;
        private String bankCode;
        private String bankName;
        private Integer level;
        private Integer publicFlag;
        private String desc;

        public Long getId() {
            return id;
        }
        public void setId (Long id) {
            this.id = id;
        }
        public String getBankCode() {
            return bankCode;
        }
        public void setBankCode (String bankCode) {
            this.bankCode = bankCode;
        }
        public String getBankName() {
            return bankName;
        }
        public void setBankName (String bankName) {
            this.bankName = bankName;
        }
        public Integer getLevel() {
            return level;
        }
        public void setLevel (Integer level) {
            this.level = level;
        }
        public Integer getPublicFlag() {
            return publicFlag;
        }
        public void setPublicFlag (Integer publicFlag) {
            this.publicFlag = publicFlag;
        }
        public String getDesc() {
            return desc;
        }
        public void setDesc (String desc) {
            this.desc = desc;
        }


        @Override
        public String toString() {
            return "{" +
            "\"id\":" + "\"" + id + "\"" + "," +
            "\"bankCode\":" + "\"" + bankCode + "\"" + "," +
            "\"bankName\":" + "\"" + bankName + "\"" + "," +
            "\"level\":" + "\"" + level + "\"" + "," +
            "\"publicFlag\":" + "\"" + publicFlag + "\"" + "," +
            "\"desc\":" + "\"" + desc + "\"" +
            '}';
        }
}
