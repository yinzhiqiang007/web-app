package com.quinn.yfq.model.entity;


import com.quinn.Base;
import java.util.*;
import java.math.BigDecimal;

/**
 * @author Quinn
 * @date 2018/02/06
 */
public class UserInf extends Base {


        private String ID;
        private String LOGINNAME;
        private String LOGINPASSWORD;
        private String USERNAME;
        private String NICKNAME;
        private String IDNO;
        private String CARDNO;
        private String PASSPORTNO;
        private String EMAIL;
        private String MOBILE;
        private String BELONGORGID;
        private String TELNO;
        private String INNERTELNO;
        private String INITSTATUS;
        private String LASTEDMODIFY;
        private Integer ISACCESSCONTROL;
        private Date CREATEDATETIME;
        private String CREATEOPERATORID;
        private Date LASTUPDATEDATETIME;
        private String LASTUPDATEOPERATORID;
        private Integer DATASTATUS;

        public String getID() {
            return ID;
        }
        public void setID (String ID) {
            this.ID = ID;
        }
        public String getLOGINNAME() {
            return LOGINNAME;
        }
        public void setLOGINNAME (String LOGINNAME) {
            this.LOGINNAME = LOGINNAME;
        }
        public String getLOGINPASSWORD() {
            return LOGINPASSWORD;
        }
        public void setLOGINPASSWORD (String LOGINPASSWORD) {
            this.LOGINPASSWORD = LOGINPASSWORD;
        }
        public String getUSERNAME() {
            return USERNAME;
        }
        public void setUSERNAME (String USERNAME) {
            this.USERNAME = USERNAME;
        }
        public String getNICKNAME() {
            return NICKNAME;
        }
        public void setNICKNAME (String NICKNAME) {
            this.NICKNAME = NICKNAME;
        }
        public String getIDNO() {
            return IDNO;
        }
        public void setIDNO (String IDNO) {
            this.IDNO = IDNO;
        }
        public String getCARDNO() {
            return CARDNO;
        }
        public void setCARDNO (String CARDNO) {
            this.CARDNO = CARDNO;
        }
        public String getPASSPORTNO() {
            return PASSPORTNO;
        }
        public void setPASSPORTNO (String PASSPORTNO) {
            this.PASSPORTNO = PASSPORTNO;
        }
        public String getEMAIL() {
            return EMAIL;
        }
        public void setEMAIL (String EMAIL) {
            this.EMAIL = EMAIL;
        }
        public String getMOBILE() {
            return MOBILE;
        }
        public void setMOBILE (String MOBILE) {
            this.MOBILE = MOBILE;
        }
        public String getBELONGORGID() {
            return BELONGORGID;
        }
        public void setBELONGORGID (String BELONGORGID) {
            this.BELONGORGID = BELONGORGID;
        }
        public String getTELNO() {
            return TELNO;
        }
        public void setTELNO (String TELNO) {
            this.TELNO = TELNO;
        }
        public String getINNERTELNO() {
            return INNERTELNO;
        }
        public void setINNERTELNO (String INNERTELNO) {
            this.INNERTELNO = INNERTELNO;
        }
        public String getINITSTATUS() {
            return INITSTATUS;
        }
        public void setINITSTATUS (String INITSTATUS) {
            this.INITSTATUS = INITSTATUS;
        }
        public String getLASTEDMODIFY() {
            return LASTEDMODIFY;
        }
        public void setLASTEDMODIFY (String LASTEDMODIFY) {
            this.LASTEDMODIFY = LASTEDMODIFY;
        }
        public Integer getISACCESSCONTROL() {
            return ISACCESSCONTROL;
        }
        public void setISACCESSCONTROL (Integer ISACCESSCONTROL) {
            this.ISACCESSCONTROL = ISACCESSCONTROL;
        }
        public Date getCREATEDATETIME() {
            return CREATEDATETIME;
        }
        public void setCREATEDATETIME (Date CREATEDATETIME) {
            this.CREATEDATETIME = CREATEDATETIME;
        }
        public String getCREATEOPERATORID() {
            return CREATEOPERATORID;
        }
        public void setCREATEOPERATORID (String CREATEOPERATORID) {
            this.CREATEOPERATORID = CREATEOPERATORID;
        }
        public Date getLASTUPDATEDATETIME() {
            return LASTUPDATEDATETIME;
        }
        public void setLASTUPDATEDATETIME (Date LASTUPDATEDATETIME) {
            this.LASTUPDATEDATETIME = LASTUPDATEDATETIME;
        }
        public String getLASTUPDATEOPERATORID() {
            return LASTUPDATEOPERATORID;
        }
        public void setLASTUPDATEOPERATORID (String LASTUPDATEOPERATORID) {
            this.LASTUPDATEOPERATORID = LASTUPDATEOPERATORID;
        }
        public Integer getDATASTATUS() {
            return DATASTATUS;
        }
        public void setDATASTATUS (Integer DATASTATUS) {
            this.DATASTATUS = DATASTATUS;
        }


        @Override
        public String toString() {
            return "{" +
            "\"ID\":" + "\"" + ID + "\"" + "," +
            "\"LOGINNAME\":" + "\"" + LOGINNAME + "\"" + "," +
            "\"LOGINPASSWORD\":" + "\"" + LOGINPASSWORD + "\"" + "," +
            "\"USERNAME\":" + "\"" + USERNAME + "\"" + "," +
            "\"NICKNAME\":" + "\"" + NICKNAME + "\"" + "," +
            "\"IDNO\":" + "\"" + IDNO + "\"" + "," +
            "\"CARDNO\":" + "\"" + CARDNO + "\"" + "," +
            "\"PASSPORTNO\":" + "\"" + PASSPORTNO + "\"" + "," +
            "\"EMAIL\":" + "\"" + EMAIL + "\"" + "," +
            "\"MOBILE\":" + "\"" + MOBILE + "\"" + "," +
            "\"BELONGORGID\":" + "\"" + BELONGORGID + "\"" + "," +
            "\"TELNO\":" + "\"" + TELNO + "\"" + "," +
            "\"INNERTELNO\":" + "\"" + INNERTELNO + "\"" + "," +
            "\"INITSTATUS\":" + "\"" + INITSTATUS + "\"" + "," +
            "\"LASTEDMODIFY\":" + "\"" + LASTEDMODIFY + "\"" + "," +
            "\"ISACCESSCONTROL\":" + "\"" + ISACCESSCONTROL + "\"" + "," +
            "\"CREATEDATETIME\":" + "\"" + CREATEDATETIME + "\"" + "," +
            "\"CREATEOPERATORID\":" + "\"" + CREATEOPERATORID + "\"" + "," +
            "\"LASTUPDATEDATETIME\":" + "\"" + LASTUPDATEDATETIME + "\"" + "," +
            "\"LASTUPDATEOPERATORID\":" + "\"" + LASTUPDATEOPERATORID + "\"" + "," +
            "\"DATASTATUS\":" + "\"" + DATASTATUS + "\"" +
            '}';
        }
}
