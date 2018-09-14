package com.quinn.app.model.entity;


import com.quinn.Base;
import java.util.*;
import java.math.BigDecimal;

/**
 * @author Quinn
 * @date 2018/09/14
 */
public class SysConfig extends Base {


        private Long id;
        private String code;
        private String name;
        private String value;
        private String createUserId;
        private Date createTime;

        public Long getId() {
            return id;
        }
        public void setId (Long id) {
            this.id = id;
        }
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
        public String getValue() {
            return value;
        }
        public void setValue (String value) {
            this.value = value;
        }
        public String getCreateUserId() {
            return createUserId;
        }
        public void setCreateUserId (String createUserId) {
            this.createUserId = createUserId;
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
            "\"id\":" + "\"" + id + "\"" + "," +
            "\"code\":" + "\"" + code + "\"" + "," +
            "\"name\":" + "\"" + name + "\"" + "," +
            "\"value\":" + "\"" + value + "\"" + "," +
            "\"createUserId\":" + "\"" + createUserId + "\"" + "," +
            "\"createTime\":" + "\"" + createTime + "\"" +
            '}';
        }
}
