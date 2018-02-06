package com.quinn.yfq.model.entity;


import com.quinn.Base;
import java.util.*;
import java.math.BigDecimal;

/**
 * @author Quinn
 * @date 2018/02/06
 */
public class User extends Base {


        private Long ID;
        private String USERID;
        private String MOBILE;
        private String REALNAME;
        private String IDCARD;
        private Integer EDUCATIONOPT;
        private Integer MARRIAGEOPT;
        private String LIVEPROVINCE;
        private String LIVECITY;
        private String LIVEAREA;
        private String LIVEADDRESS;
        private Integer LIVETYPE;
        private Integer PROFESSIONOPT;
        private String COMPANYNAME;
        private Integer COMPANYNATURE;
        private String COMPANYADDRPROVINCE;
        private String COMPANYADDRCITY;
        private String COMPANYADDRAREA;
        private String COMPANYADDRADDRESS;
        private String COMPANYTEL;
        private String COMPANYDEPART;
        private String STUDENTADMISTIME;
        private String STUDENTSCHOOL;
        private BigDecimal MONTHINCOME;
        private String SOURCEINCOME;
        private String ZMSCORE;
        private Integer USERSTATE;
        private Date AUTHTIME;
        private Date CREATETIME;

        public Long getID() {
            return ID;
        }
        public void setID (Long ID) {
            this.ID = ID;
        }
        public String getUSERID() {
            return USERID;
        }
        public void setUSERID (String USERID) {
            this.USERID = USERID;
        }
        public String getMOBILE() {
            return MOBILE;
        }
        public void setMOBILE (String MOBILE) {
            this.MOBILE = MOBILE;
        }
        public String getREALNAME() {
            return REALNAME;
        }
        public void setREALNAME (String REALNAME) {
            this.REALNAME = REALNAME;
        }
        public String getIDCARD() {
            return IDCARD;
        }
        public void setIDCARD (String IDCARD) {
            this.IDCARD = IDCARD;
        }
        public Integer getEDUCATIONOPT() {
            return EDUCATIONOPT;
        }
        public void setEDUCATIONOPT (Integer EDUCATIONOPT) {
            this.EDUCATIONOPT = EDUCATIONOPT;
        }
        public Integer getMARRIAGEOPT() {
            return MARRIAGEOPT;
        }
        public void setMARRIAGEOPT (Integer MARRIAGEOPT) {
            this.MARRIAGEOPT = MARRIAGEOPT;
        }
        public String getLIVEPROVINCE() {
            return LIVEPROVINCE;
        }
        public void setLIVEPROVINCE (String LIVEPROVINCE) {
            this.LIVEPROVINCE = LIVEPROVINCE;
        }
        public String getLIVECITY() {
            return LIVECITY;
        }
        public void setLIVECITY (String LIVECITY) {
            this.LIVECITY = LIVECITY;
        }
        public String getLIVEAREA() {
            return LIVEAREA;
        }
        public void setLIVEAREA (String LIVEAREA) {
            this.LIVEAREA = LIVEAREA;
        }
        public String getLIVEADDRESS() {
            return LIVEADDRESS;
        }
        public void setLIVEADDRESS (String LIVEADDRESS) {
            this.LIVEADDRESS = LIVEADDRESS;
        }
        public Integer getLIVETYPE() {
            return LIVETYPE;
        }
        public void setLIVETYPE (Integer LIVETYPE) {
            this.LIVETYPE = LIVETYPE;
        }
        public Integer getPROFESSIONOPT() {
            return PROFESSIONOPT;
        }
        public void setPROFESSIONOPT (Integer PROFESSIONOPT) {
            this.PROFESSIONOPT = PROFESSIONOPT;
        }
        public String getCOMPANYNAME() {
            return COMPANYNAME;
        }
        public void setCOMPANYNAME (String COMPANYNAME) {
            this.COMPANYNAME = COMPANYNAME;
        }
        public Integer getCOMPANYNATURE() {
            return COMPANYNATURE;
        }
        public void setCOMPANYNATURE (Integer COMPANYNATURE) {
            this.COMPANYNATURE = COMPANYNATURE;
        }
        public String getCOMPANYADDRPROVINCE() {
            return COMPANYADDRPROVINCE;
        }
        public void setCOMPANYADDRPROVINCE (String COMPANYADDRPROVINCE) {
            this.COMPANYADDRPROVINCE = COMPANYADDRPROVINCE;
        }
        public String getCOMPANYADDRCITY() {
            return COMPANYADDRCITY;
        }
        public void setCOMPANYADDRCITY (String COMPANYADDRCITY) {
            this.COMPANYADDRCITY = COMPANYADDRCITY;
        }
        public String getCOMPANYADDRAREA() {
            return COMPANYADDRAREA;
        }
        public void setCOMPANYADDRAREA (String COMPANYADDRAREA) {
            this.COMPANYADDRAREA = COMPANYADDRAREA;
        }
        public String getCOMPANYADDRADDRESS() {
            return COMPANYADDRADDRESS;
        }
        public void setCOMPANYADDRADDRESS (String COMPANYADDRADDRESS) {
            this.COMPANYADDRADDRESS = COMPANYADDRADDRESS;
        }
        public String getCOMPANYTEL() {
            return COMPANYTEL;
        }
        public void setCOMPANYTEL (String COMPANYTEL) {
            this.COMPANYTEL = COMPANYTEL;
        }
        public String getCOMPANYDEPART() {
            return COMPANYDEPART;
        }
        public void setCOMPANYDEPART (String COMPANYDEPART) {
            this.COMPANYDEPART = COMPANYDEPART;
        }
        public String getSTUDENTADMISTIME() {
            return STUDENTADMISTIME;
        }
        public void setSTUDENTADMISTIME (String STUDENTADMISTIME) {
            this.STUDENTADMISTIME = STUDENTADMISTIME;
        }
        public String getSTUDENTSCHOOL() {
            return STUDENTSCHOOL;
        }
        public void setSTUDENTSCHOOL (String STUDENTSCHOOL) {
            this.STUDENTSCHOOL = STUDENTSCHOOL;
        }
        public BigDecimal getMONTHINCOME() {
            return MONTHINCOME;
        }
        public void setMONTHINCOME (BigDecimal MONTHINCOME) {
            this.MONTHINCOME = MONTHINCOME;
        }
        public String getSOURCEINCOME() {
            return SOURCEINCOME;
        }
        public void setSOURCEINCOME (String SOURCEINCOME) {
            this.SOURCEINCOME = SOURCEINCOME;
        }
        public String getZMSCORE() {
            return ZMSCORE;
        }
        public void setZMSCORE (String ZMSCORE) {
            this.ZMSCORE = ZMSCORE;
        }
        public Integer getUSERSTATE() {
            return USERSTATE;
        }
        public void setUSERSTATE (Integer USERSTATE) {
            this.USERSTATE = USERSTATE;
        }
        public Date getAUTHTIME() {
            return AUTHTIME;
        }
        public void setAUTHTIME (Date AUTHTIME) {
            this.AUTHTIME = AUTHTIME;
        }
        public Date getCREATETIME() {
            return CREATETIME;
        }
        public void setCREATETIME (Date CREATETIME) {
            this.CREATETIME = CREATETIME;
        }


        @Override
        public String toString() {
            return "{" +
            "\"ID\":" + "\"" + ID + "\"" + "," +
            "\"USERID\":" + "\"" + USERID + "\"" + "," +
            "\"MOBILE\":" + "\"" + MOBILE + "\"" + "," +
            "\"REALNAME\":" + "\"" + REALNAME + "\"" + "," +
            "\"IDCARD\":" + "\"" + IDCARD + "\"" + "," +
            "\"EDUCATIONOPT\":" + "\"" + EDUCATIONOPT + "\"" + "," +
            "\"MARRIAGEOPT\":" + "\"" + MARRIAGEOPT + "\"" + "," +
            "\"LIVEPROVINCE\":" + "\"" + LIVEPROVINCE + "\"" + "," +
            "\"LIVECITY\":" + "\"" + LIVECITY + "\"" + "," +
            "\"LIVEAREA\":" + "\"" + LIVEAREA + "\"" + "," +
            "\"LIVEADDRESS\":" + "\"" + LIVEADDRESS + "\"" + "," +
            "\"LIVETYPE\":" + "\"" + LIVETYPE + "\"" + "," +
            "\"PROFESSIONOPT\":" + "\"" + PROFESSIONOPT + "\"" + "," +
            "\"COMPANYNAME\":" + "\"" + COMPANYNAME + "\"" + "," +
            "\"COMPANYNATURE\":" + "\"" + COMPANYNATURE + "\"" + "," +
            "\"COMPANYADDRPROVINCE\":" + "\"" + COMPANYADDRPROVINCE + "\"" + "," +
            "\"COMPANYADDRCITY\":" + "\"" + COMPANYADDRCITY + "\"" + "," +
            "\"COMPANYADDRAREA\":" + "\"" + COMPANYADDRAREA + "\"" + "," +
            "\"COMPANYADDRADDRESS\":" + "\"" + COMPANYADDRADDRESS + "\"" + "," +
            "\"COMPANYTEL\":" + "\"" + COMPANYTEL + "\"" + "," +
            "\"COMPANYDEPART\":" + "\"" + COMPANYDEPART + "\"" + "," +
            "\"STUDENTADMISTIME\":" + "\"" + STUDENTADMISTIME + "\"" + "," +
            "\"STUDENTSCHOOL\":" + "\"" + STUDENTSCHOOL + "\"" + "," +
            "\"MONTHINCOME\":" + "\"" + MONTHINCOME + "\"" + "," +
            "\"SOURCEINCOME\":" + "\"" + SOURCEINCOME + "\"" + "," +
            "\"ZMSCORE\":" + "\"" + ZMSCORE + "\"" + "," +
            "\"USERSTATE\":" + "\"" + USERSTATE + "\"" + "," +
            "\"AUTHTIME\":" + "\"" + AUTHTIME + "\"" + "," +
            "\"CREATETIME\":" + "\"" + CREATETIME + "\"" +
            '}';
        }
}
