package com.keybank.accountinfo.model;

public class AccountInfoForfietedPtsDaoResp {

    private String respCode;
    private String respMsg;
    private long forfietedPts;

    
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
    public long getForfietedPts() {
        return forfietedPts;
    }
    public void setForfietedPts(long forfietedPts) {
        this.forfietedPts = forfietedPts;
    }
    @Override
    public String toString() {
        return "AccountInfoForfietedPtsDaoResp [forfietedPts=" + forfietedPts + ", respCode=" + respCode + ", respMsg="
                + respMsg + "]";
    }

    
    

}
