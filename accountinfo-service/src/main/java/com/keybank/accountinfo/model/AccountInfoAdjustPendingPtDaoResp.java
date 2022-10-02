package com.keybank.accountinfo.model;

public class AccountInfoAdjustPendingPtDaoResp {

    private String respCode;
    private String respMsg;
    private long adjustedPts;
    private long pendingPts;

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
    public long getAdjustedPts() {
        return adjustedPts;
    }
    public void setAdjustedPts(long adjustedPts) {
        this.adjustedPts = adjustedPts;
    }
    public long getPendingPts() {
        return pendingPts;
    }
    public void setPendingPts(long pendingPts) {
        this.pendingPts = pendingPts;
    }
    
    @Override
    public String toString() {
        return "AccountInfoAdjustPendingPtDaoResp [adjustedPts=" + adjustedPts + ", pendingPts=" + pendingPts
                + ", respCode=" + respCode + ", respMsg=" + respMsg + "]";
    }

    
    
    
}
