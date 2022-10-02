/**
 * @Copyright 2022, Key Bank pvt ltd, All rights are reserved. You should not disclose the information outside 
 * otherwise terms and condition will apply
 */
package com.keybank.accountinfo.model;

/**
 * @author jatin, 23-Sep-2022
 * Description:
 */
public class AccountInfoResponse {
	
    private StatusBlock statusBlock;
    private RewardSummary rewardSummary;
    
    public StatusBlock getStatusBlock() {
        return statusBlock;
    }
    public void setStatusBlock(StatusBlock statusBlock) {
        this.statusBlock = statusBlock;
    }
    public RewardSummary getRewardSummary() {
        return rewardSummary;
    }
    public void setRewardSummary(RewardSummary rewardSummary) {
        this.rewardSummary = rewardSummary;
    }
    @Override
    public String toString() {
        return "AccountInfoResponse [statusBlock=" + statusBlock + ", rewardSummary=" + rewardSummary + "]";
    }
   
}
