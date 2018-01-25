package com.quinn.payment.model.entity;


import com.quinn.Base;

import java.math.BigDecimal;
import java.util.*;

/**
 * @author Quinn
 * @date 2018/1/15
 * @package com.quinn.app.dao
 */
public class Payment extends Base {


        private Long id;
        private String payDate;
        private Integer seq;
        private String patientName;
        private BigDecimal money;
        private String hospitalName;
        private String bankCode;
        private String bankCard;
        private String bankName;
        private String bankFullName;
        private String currency;
        private String acctName;
        private Integer cardFlag;
        private String desc;
        private Integer status;
        private String resultCode;
        private String resultMsg;
        private String payBillId;
        private Date createTime;
        private Date updateTime;
        private String lock;
        private String confirmCode;
        private String mail;
        private String contractNumber;
        private String patientIdcard;
        private Integer deleteFlag;

        public Long getId() {
            return id;
        }
        public void setId (Long id) {
            this.id = id;
        }
        public String getPayDate() {
            return payDate;
        }
        public void setPayDate (String payDate) {
            this.payDate = payDate;
        }
        public Integer getSeq() {
            return seq;
        }
        public void setSeq (Integer seq) {
            this.seq = seq;
        }
        public String getPatientName() {
            return patientName;
        }
        public void setPatientName (String patientName) {
            this.patientName = patientName;
        }
        public BigDecimal getMoney() {
            return money;
        }
        public void setMoney (BigDecimal money) {
            this.money = money;
        }
        public String getHospitalName() {
            return hospitalName;
        }
        public void setHospitalName (String hospitalName) {
            this.hospitalName = hospitalName;
        }
        public String getBankCode() {
            return bankCode;
        }
        public void setBankCode (String bankCode) {
            this.bankCode = bankCode;
        }
        public String getBankCard() {
            return bankCard;
        }
        public void setBankCard (String bankCard) {
            this.bankCard = bankCard;
        }
        public String getBankName() {
            return bankName;
        }
        public void setBankName (String bankName) {
            this.bankName = bankName;
        }
        public String getBankFullName() {
            return bankFullName;
        }
        public void setBankFullName (String bankFullName) {
            this.bankFullName = bankFullName;
        }
        public String getCurrency() {
            return currency;
        }
        public void setCurrency (String currency) {
            this.currency = currency;
        }
        public String getAcctName() {
            return acctName;
        }
        public void setAcctName (String acctName) {
            this.acctName = acctName;
        }
        public Integer getCardFlag() {
            return cardFlag;
        }
        public void setCardFlag (Integer cardFlag) {
            this.cardFlag = cardFlag;
        }
        public String getDesc() {
            return desc;
        }
        public void setDesc (String desc) {
            this.desc = desc;
        }
        public Integer getStatus() {
            return status;
        }
        public void setStatus (Integer status) {
            this.status = status;
        }
        public String getResultCode() {
            return resultCode;
        }
        public void setResultCode (String resultCode) {
            this.resultCode = resultCode;
        }
        public String getResultMsg() {
            return resultMsg;
        }
        public void setResultMsg (String resultMsg) {
            this.resultMsg = resultMsg;
        }
        public String getPayBillId() {
            return payBillId;
        }
        public void setPayBillId (String payBillId) {
            this.payBillId = payBillId;
        }
        public Date getCreateTime() {
            return createTime;
        }
        public void setCreateTime (Date createTime) {
            this.createTime = createTime;
        }
        public Date getUpdateTime() {
            return updateTime;
        }
        public void setUpdateTime (Date updateTime) {
            this.updateTime = updateTime;
        }
        public String getLock() {
            return lock;
        }
        public void setLock (String lock) {
            this.lock = lock;
        }
        public String getConfirmCode() {
            return confirmCode;
        }
        public void setConfirmCode (String confirmCode) {
            this.confirmCode = confirmCode;
        }
        public String getMail() {
            return mail;
        }
        public void setMail (String mail) {
            this.mail = mail;
        }
        public String getContractNumber() {
            return contractNumber;
        }
        public void setContractNumber (String contractNumber) {
            this.contractNumber = contractNumber;
        }
        public String getPatientIdcard() {
            return patientIdcard;
        }
        public void setPatientIdcard (String patientIdcard) {
            this.patientIdcard = patientIdcard;
        }
        public Integer getDeleteFlag() {
            return deleteFlag;
        }
        public void setDeleteFlag (Integer deleteFlag) {
            this.deleteFlag = deleteFlag;
        }


        @Override
        public String toString() {
            return "{" +
            "\"id\":" + "\"" + id + "\"" + "," +
            "\"payDate\":" + "\"" + payDate + "\"" + "," +
            "\"seq\":" + "\"" + seq + "\"" + "," +
            "\"patientName\":" + "\"" + patientName + "\"" + "," +
            "\"money\":" + "\"" + money + "\"" + "," +
            "\"hospitalName\":" + "\"" + hospitalName + "\"" + "," +
            "\"bankCode\":" + "\"" + bankCode + "\"" + "," +
            "\"bankCard\":" + "\"" + bankCard + "\"" + "," +
            "\"bankName\":" + "\"" + bankName + "\"" + "," +
            "\"bankFullName\":" + "\"" + bankFullName + "\"" + "," +
            "\"currency\":" + "\"" + currency + "\"" + "," +
            "\"acctName\":" + "\"" + acctName + "\"" + "," +
            "\"cardFlag\":" + "\"" + cardFlag + "\"" + "," +
            "\"desc\":" + "\"" + desc + "\"" + "," +
            "\"status\":" + "\"" + status + "\"" + "," +
            "\"resultCode\":" + "\"" + resultCode + "\"" + "," +
            "\"resultMsg\":" + "\"" + resultMsg + "\"" + "," +
            "\"payBillId\":" + "\"" + payBillId + "\"" + "," +
            "\"createTime\":" + "\"" + createTime + "\"" + "," +
            "\"updateTime\":" + "\"" + updateTime + "\"" + "," +
            "\"lock\":" + "\"" + lock + "\"" + "," +
            "\"confirmCode\":" + "\"" + confirmCode + "\"" + "," +
            "\"mail\":" + "\"" + mail + "\"" + "," +
            "\"contractNumber\":" + "\"" + contractNumber + "\"" + "," +
            "\"patientIdcard\":" + "\"" + patientIdcard + "\"" + "," +
            "\"deleteFlag\":" + "\"" + deleteFlag + "\"" +
            '}';
        }
}
