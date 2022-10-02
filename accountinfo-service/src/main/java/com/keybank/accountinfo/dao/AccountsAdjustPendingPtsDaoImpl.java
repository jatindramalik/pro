/**
 * @Copyright 2022, Key Bank pvt ltd, All rights are reserved. You should not disclose the information outside 
 * otherwise terms and condition will apply
 */
package com.keybank.accountinfo.dao;

import org.springframework.stereotype.Component;


import com.keybank.accountinfo.model.AccountInfoAdjustPendingPtDaoResp;
import com.keybank.accountinfo.model.AccountInfoDaoRequest;

/**
 * @author jatin, 23-Sep-2022
 *         Description:
 */
@Component
public class AccountsAdjustPendingPtsDaoImpl implements IAccountsAdjustPendingPtsDao {

    @Override
    public AccountInfoAdjustPendingPtDaoResp getAdjustedRewardPts(AccountInfoDaoRequest daoRequest) {
        AccountInfoAdjustPendingPtDaoResp daoResp = new AccountInfoAdjustPendingPtDaoResp();

        daoResp.setRespCode("0");
        daoResp.setRespCode("success");
        daoResp.setAdjustedPts(1000);
        daoResp.setPendingPts(1500);
        
        return daoResp;
    }

}
