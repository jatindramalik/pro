/**
 * @Copyright 2022, Key Bank pvt ltd, All rights are reserved. You should not disclose the information outside 
 * otherwise terms and condition will apply
 */
package com.keybank.accountinfo.dao;

import org.springframework.stereotype.Component;


import com.keybank.accountinfo.model.AccountInfoForfietedPtsDaoResp;
import com.keybank.accountinfo.model.AccountInfoDaoRequest;

/**
 * @author jatin, 23-Sep-2022
 * Description:
 */
@Component
public class AccountsForfietedPtsDaoImpl implements IAccountsForfietedPtsDao {

    @Override
    public AccountInfoForfietedPtsDaoResp getForfietedRewardPts(AccountInfoDaoRequest daoRequest) {
        AccountInfoForfietedPtsDaoResp daoResp = new AccountInfoForfietedPtsDaoResp();

        daoResp.setRespCode("0");
        daoResp.setRespCode("success");
        daoResp.setForfietedPts(20000);
        
        return daoResp;
    }

}
