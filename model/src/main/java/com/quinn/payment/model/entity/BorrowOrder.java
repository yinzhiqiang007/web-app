package com.quinn.payment.model.entity;


import com.quinn.Base;
import java.util.*;
import java.math.BigDecimal;

/**
 * @author Quinn
 * @date 2018/1/15
 */
public class BorrowOrder extends Base {


        private Long id;
        private String title;
        private String borrowOrderid;
        private String mobile;
        private Long hosId;
        private BigDecimal targetMoney;
        private Integer period;
        private Integer state;
        private String auditDscp;
        private String auditDscpPrel;
        private String auditDscpAgain;
        private Integer sendType;
        private Date createTime;
        private Date successTime;
        private String remark;
        private String haierSeq;
        private String haierCde;
        private BigDecimal loanaMount;
        private String contractNumber;
        private String repaymentMethod;
        private BigDecimal repaymentAmount;
        private Integer projectId;
        private String projectName;
        private String guarantee;
        private BigDecimal applyAmount;
        private Integer maintainId;
        private Integer extendId;
        private String sendPhone;
        private String phoneDescribe;
        private String latitude;
        private String longitude;
        private String orderChannel;
        private String applyNo;
        private Integer isSend;
        private String realname;
        private String idcard;

        public Long getId() {
            return id;
        }
        public void setId (Long id) {
            this.id = id;
        }
        public String getTitle() {
            return title;
        }
        public void setTitle (String title) {
            this.title = title;
        }
        public String getBorrowOrderid() {
            return borrowOrderid;
        }
        public void setBorrowOrderid (String borrowOrderid) {
            this.borrowOrderid = borrowOrderid;
        }
        public String getMobile() {
            return mobile;
        }
        public void setMobile (String mobile) {
            this.mobile = mobile;
        }
        public Long getHosId() {
            return hosId;
        }
        public void setHosId (Long hosId) {
            this.hosId = hosId;
        }
        public BigDecimal getTargetMoney() {
            return targetMoney;
        }
        public void setTargetMoney (BigDecimal targetMoney) {
            this.targetMoney = targetMoney;
        }
        public Integer getPeriod() {
            return period;
        }
        public void setPeriod (Integer period) {
            this.period = period;
        }
        public Integer getState() {
            return state;
        }
        public void setState (Integer state) {
            this.state = state;
        }
        public String getAuditDscp() {
            return auditDscp;
        }
        public void setAuditDscp (String auditDscp) {
            this.auditDscp = auditDscp;
        }
        public String getAuditDscpPrel() {
            return auditDscpPrel;
        }
        public void setAuditDscpPrel (String auditDscpPrel) {
            this.auditDscpPrel = auditDscpPrel;
        }
        public String getAuditDscpAgain() {
            return auditDscpAgain;
        }
        public void setAuditDscpAgain (String auditDscpAgain) {
            this.auditDscpAgain = auditDscpAgain;
        }
        public Integer getSendType() {
            return sendType;
        }
        public void setSendType (Integer sendType) {
            this.sendType = sendType;
        }
        public Date getCreateTime() {
            return createTime;
        }
        public void setCreateTime (Date createTime) {
            this.createTime = createTime;
        }
        public Date getSuccessTime() {
            return successTime;
        }
        public void setSuccessTime (Date successTime) {
            this.successTime = successTime;
        }
        public String getRemark() {
            return remark;
        }
        public void setRemark (String remark) {
            this.remark = remark;
        }
        public String getHaierSeq() {
            return haierSeq;
        }
        public void setHaierSeq (String haierSeq) {
            this.haierSeq = haierSeq;
        }
        public String getHaierCde() {
            return haierCde;
        }
        public void setHaierCde (String haierCde) {
            this.haierCde = haierCde;
        }
        public BigDecimal getLoanaMount() {
            return loanaMount;
        }
        public void setLoanaMount (BigDecimal loanaMount) {
            this.loanaMount = loanaMount;
        }
        public String getContractNumber() {
            return contractNumber;
        }
        public void setContractNumber (String contractNumber) {
            this.contractNumber = contractNumber;
        }
        public String getRepaymentMethod() {
            return repaymentMethod;
        }
        public void setRepaymentMethod (String repaymentMethod) {
            this.repaymentMethod = repaymentMethod;
        }
        public BigDecimal getRepaymentAmount() {
            return repaymentAmount;
        }
        public void setRepaymentAmount (BigDecimal repaymentAmount) {
            this.repaymentAmount = repaymentAmount;
        }
        public Integer getProjectId() {
            return projectId;
        }
        public void setProjectId (Integer projectId) {
            this.projectId = projectId;
        }
        public String getProjectName() {
            return projectName;
        }
        public void setProjectName (String projectName) {
            this.projectName = projectName;
        }
        public String getGuarantee() {
            return guarantee;
        }
        public void setGuarantee (String guarantee) {
            this.guarantee = guarantee;
        }
        public BigDecimal getApplyAmount() {
            return applyAmount;
        }
        public void setApplyAmount (BigDecimal applyAmount) {
            this.applyAmount = applyAmount;
        }
        public Integer getMaintainId() {
            return maintainId;
        }
        public void setMaintainId (Integer maintainId) {
            this.maintainId = maintainId;
        }
        public Integer getExtendId() {
            return extendId;
        }
        public void setExtendId (Integer extendId) {
            this.extendId = extendId;
        }
        public String getSendPhone() {
            return sendPhone;
        }
        public void setSendPhone (String sendPhone) {
            this.sendPhone = sendPhone;
        }
        public String getPhoneDescribe() {
            return phoneDescribe;
        }
        public void setPhoneDescribe (String phoneDescribe) {
            this.phoneDescribe = phoneDescribe;
        }
        public String getLatitude() {
            return latitude;
        }
        public void setLatitude (String latitude) {
            this.latitude = latitude;
        }
        public String getLongitude() {
            return longitude;
        }
        public void setLongitude (String longitude) {
            this.longitude = longitude;
        }
        public String getOrderChannel() {
            return orderChannel;
        }
        public void setOrderChannel (String orderChannel) {
            this.orderChannel = orderChannel;
        }
        public String getApplyNo() {
            return applyNo;
        }
        public void setApplyNo (String applyNo) {
            this.applyNo = applyNo;
        }
        public Integer getIsSend() {
            return isSend;
        }
        public void setIsSend (Integer isSend) {
            this.isSend = isSend;
        }
        public String getRealname() {
            return realname;
        }
        public void setRealname (String realname) {
            this.realname = realname;
        }
        public String getIdcard() {
            return idcard;
        }
        public void setIdcard (String idcard) {
            this.idcard = idcard;
        }


        @Override
        public String toString() {
            return "{" +
            "\"id\":" + "\"" + id + "\"" + "," +
            "\"title\":" + "\"" + title + "\"" + "," +
            "\"borrowOrderid\":" + "\"" + borrowOrderid + "\"" + "," +
            "\"mobile\":" + "\"" + mobile + "\"" + "," +
            "\"hosId\":" + "\"" + hosId + "\"" + "," +
            "\"targetMoney\":" + "\"" + targetMoney + "\"" + "," +
            "\"period\":" + "\"" + period + "\"" + "," +
            "\"state\":" + "\"" + state + "\"" + "," +
            "\"auditDscp\":" + "\"" + auditDscp + "\"" + "," +
            "\"auditDscpPrel\":" + "\"" + auditDscpPrel + "\"" + "," +
            "\"auditDscpAgain\":" + "\"" + auditDscpAgain + "\"" + "," +
            "\"sendType\":" + "\"" + sendType + "\"" + "," +
            "\"createTime\":" + "\"" + createTime + "\"" + "," +
            "\"successTime\":" + "\"" + successTime + "\"" + "," +
            "\"remark\":" + "\"" + remark + "\"" + "," +
            "\"haierSeq\":" + "\"" + haierSeq + "\"" + "," +
            "\"haierCde\":" + "\"" + haierCde + "\"" + "," +
            "\"loanaMount\":" + "\"" + loanaMount + "\"" + "," +
            "\"contractNumber\":" + "\"" + contractNumber + "\"" + "," +
            "\"repaymentMethod\":" + "\"" + repaymentMethod + "\"" + "," +
            "\"repaymentAmount\":" + "\"" + repaymentAmount + "\"" + "," +
            "\"projectId\":" + "\"" + projectId + "\"" + "," +
            "\"projectName\":" + "\"" + projectName + "\"" + "," +
            "\"guarantee\":" + "\"" + guarantee + "\"" + "," +
            "\"applyAmount\":" + "\"" + applyAmount + "\"" + "," +
            "\"maintainId\":" + "\"" + maintainId + "\"" + "," +
            "\"extendId\":" + "\"" + extendId + "\"" + "," +
            "\"sendPhone\":" + "\"" + sendPhone + "\"" + "," +
            "\"phoneDescribe\":" + "\"" + phoneDescribe + "\"" + "," +
            "\"latitude\":" + "\"" + latitude + "\"" + "," +
            "\"longitude\":" + "\"" + longitude + "\"" + "," +
            "\"orderChannel\":" + "\"" + orderChannel + "\"" + "," +
            "\"applyNo\":" + "\"" + applyNo + "\"" + "," +
            "\"isSend\":" + "\"" + isSend + "\"" + "," +
            "\"realname\":" + "\"" + realname + "\"" + "," +
            "\"idcard\":" + "\"" + idcard + "\"" +
            '}';
        }
}
