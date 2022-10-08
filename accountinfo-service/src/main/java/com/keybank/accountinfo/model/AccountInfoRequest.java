/**
 * @Copyright 2022, Key Bank pvt ltd, All rights are reserved. You should not disclose the information outside 
 * otherwise terms and condition will apply
 */
package com.keybank.accountinfo.model;

/**
 * @author jatin, 23-Sep-2022
 * Description:
 */
public class AccountInfoRequest {

    private String cardNum;
    private String cvv;
    private String nameOnCard;
    private String expDate;
    private String typeOfRewards;
    private String clienId;
    private String channelId;
    private String reqId;
    private String msgTs;
    public String getCardNum() {
        return cardNum;
    }
    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }
    public String getCvv() {
        return cvv;
    }
    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
    public String getNameOnCard() {
        return nameOnCard;
    }
    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }
    public String getExpDate() {
        return expDate;
    }
    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }
    public String getTypeOfRewards() {
        return typeOfRewards;
    }
    public void setTypeOfRewards(String typeOfRewards) {
        this.typeOfRewards = typeOfRewards;
    }
    public String getClienId() {
        return clienId;
    }
    public void setClienId(String clienId) {
        this.clienId = clienId;
    }
    public String getChannelId() {
        return channelId;
    }
    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }
    public String getReqId() {
        return reqId;
    }
    public void setReqId(String reqId) {
        this.reqId = reqId;
    }
    public String getMsgTs() {
        return msgTs;
    }
    public void setMsgTs(String msgTs) {
        this.msgTs = msgTs;
    }
   
    
    

    

}
