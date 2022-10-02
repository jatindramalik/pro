package com.keybank.accountinfo.model;

public class RewardSummary {

    private long availPts;
    private long pendingPts;
    private long forfietedPts;
    private long adjustedPts;
    private long earnedPts;

    public long getAvailPts() {
        return availPts;
    }
    public void setAvailPts(long availPts) {
        this.availPts = availPts;
    }
    public long getPendingPts() {
        return pendingPts;
    }
    public void setPendingPts(long pendingPts) {
        this.pendingPts = pendingPts;
    }
    public long getForfietedPts() {
        return forfietedPts;
    }
    public void setForfietedPts(long forfietedPts) {
        this.forfietedPts = forfietedPts;
    }
    public long getAdjustedPts() {
        return adjustedPts;
    }
    public void setAdjustedPts(long adjustedPts) {
        this.adjustedPts = adjustedPts;
    }
    public long getEarnedPts() {
        return earnedPts;
    }
    public void setEarnedPts(long earnedPts) {
        this.earnedPts = earnedPts;
    }
    @Override
    public String toString() {
        return "RewardSummary [availPts=" + availPts + ", pendingPts=" + pendingPts + ", forfietedPts=" + forfietedPts
                + ", adjustedPts=" + adjustedPts + ", earnedPts=" + earnedPts + "]";
    }

    
    
    
}
