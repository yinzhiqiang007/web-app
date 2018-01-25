package com.quinn.payment.model.entity;


import com.quinn.Base;
import java.util.*;

/**
 * @author Quinn
 * @date 2018/1/15
 */
public class CallbackLog extends Base {


        private Long id;
        private String orderId;
        private String content;
        private String status;
        private Date createTime;

        public Long getId() {
            return id;
        }
        public void setId (Long id) {
            this.id = id;
        }
        public String getOrderId() {
            return orderId;
        }
        public void setOrderId (String orderId) {
            this.orderId = orderId;
        }
        public String getContent() {
            return content;
        }
        public void setContent (String content) {
            this.content = content;
        }
        public String getStatus() {
            return status;
        }
        public void setStatus (String status) {
            this.status = status;
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
            "\"orderId\":" + "\"" + orderId + "\"" + "," +
            "\"content\":" + "\"" + content + "\"" + "," +
            "\"status\":" + "\"" + status + "\"" + "," +
            "\"createTime\":" + "\"" + createTime + "\"" +
            '}';
        }
}
