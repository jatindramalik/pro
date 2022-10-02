/**
 * @Copyright 2022, Key Bank pvt ltd, All rights are reserved. You should not disclose the information outside 
 * otherwise terms and condition will apply
 */
package com.keybank.accountinfo.dao;

import org.springframework.stereotype.Component;


import com.keybank.accountinfo.model.AccountInfoAvailablePtsDaoResp;
import com.keybank.accountinfo.model.AccountInfoDaoRequest;

/**
 * @author jatin, 23-Sep-2022
 * Description:
 */
@Component
public class AccountsAvailablePtsDaoImpl implements IAccounstAvailablePtsDao {

    @Override
    public AccountInfoAvailablePtsDaoResp getAvailableRewardPts(AccountInfoDaoRequest daoRequest) {
        AccountInfoAvailablePtsDaoResp daoResp = new AccountInfoAvailablePtsDaoResp();

        daoResp.setRespCode("0");
        daoResp.setRespCode("success");
        daoResp.setAvailPts(100000);
        daoResp.setEarnedPts(1500);
        
        return daoResp;
        
    }

}
