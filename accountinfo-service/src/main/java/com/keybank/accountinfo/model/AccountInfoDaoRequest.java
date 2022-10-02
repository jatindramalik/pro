/**
 * @Copyright 2022, Key Bank pvt ltd, All rights are reserved. You should not disclose the information outside 
 * otherwise terms and condition will apply
 */
package com.keybank.accountinfo.model;

/**
 * @author jatin, 23-Sep-2022
 * Description:
 */

public class AccountInfoDaoRequest {

    private String cardNum;
    private String cvv;
    private String nameOnCard;
    private String expDate;
    private String clientId;

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
    public String getClientId() {
        return clientId;
    }
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
    @Override
    public String toString() {
        return "AccountInfoDaoRequest [cardNum=" + cardNum + ", clientId=" + clientId + ", cvv=" + cvv + ", expDate="
                + expDate + ", nameOnCard=" + nameOnCard + "]";
    }

    
    
    
}
