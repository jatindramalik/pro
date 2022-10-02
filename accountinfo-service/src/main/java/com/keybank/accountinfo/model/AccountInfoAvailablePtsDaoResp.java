package com.keybank.accountinfo.model;

public class AccountInfoAvailablePtsDaoResp {

    private String respCode;
    private String respMsg;
    private long availPts;
    private long earnedPts;
    
    public String getRespCode() {
        return respCode;
    }
    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }
    public String getRespMsg() {
        return respMsg;
    }
    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg;
    }
    public long getAvailPts() {
        return availPts;
    }
    public void setAvailPts(long availPts) {
        this.availPts = availPts;
    }
    public long getEarnedPts() {
        return earnedPts;
    }
    public void setEarnedPts(long earnedPts) {
        this.earnedPts = earnedPts;
    }
    @Override
    public String toString() {
        return "AccountInfoDaoResponse [availPts=" + availPts + ", earnedPts=" + earnedPts + ", respCode=" + respCode
                + ", respMsg=" + respMsg + "]";
    }
    
}
