package com.quinn.app.model.entity;


import com.quinn.Base;
import java.util.*;
import java.math.BigDecimal;

/**
 * @author Quinn
 * @date 2018/09/14
 */
public class SysArea extends Base {


        private String code;
        private String name;
        private String parentCode;
        private String fullName;
        private String version;
        private Date createTime;

        public String getCode() {
            return code;
        }
        public void setCode (String code) {
            this.code = code;
        }
        public String getName() {
            return name;
        }
        public void setName (String name) {
            this.name = name;
        }
        public String getParentCode() {
            return parentCode;
        }
        public void setParentCode (String parentCode) {
            this.parentCode = parentCode;
        }
        public String getFullName() {
            return fullName;
        }
        public void setFullName (String fullName) {
            this.fullName = fullName;
        }
        public String getVersion() {
            return version;
        }
        public void setVersion (String version) {
            this.version = version;
        }
        public Date getCreateTime() {
            return createTime;
        }
        public void setCreateTime (Date createTime) {
            this.createTime = createTime;
        }


        @Override
        public String toString() {
            return "{" +
            "\"code\":" + "\"" + code + "\"" + "," +
            "\"name\":" + "\"" + name + "\"" + "," +
            "\"parentCode\":" + "\"" + parentCode + "\"" + "," +
            "\"fullName\":" + "\"" + fullName + "\"" + "," +
            "\"version\":" + "\"" + version + "\"" + "," +
            "\"createTime\":" + "\"" + createTime + "\"" +
            '}';
        }
}
