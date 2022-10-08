/**
 * @Copyright 2022, Key Bank pvt ltd, All rights are reserved. You should not disclose the information outside 
 * otherwise terms and condition will apply
 */
package com.keybank.accountinfo.dao;

import org.springframework.stereotype.Component;

import com.keybank.accountinfo.exception.BusinessException;
import com.keybank.accountinfo.exception.SystemException;
import com.keybank.accountinfo.model.AccountInfoAvailablePtsDaoResp;
import com.keybank.accountinfo.model.AccountInfoDaoRequest;

/**
 * @author jatin, 23-Sep-2022
 * Description:
 */
@Component
public class AccountsAvailablePtsDaoImpl implements IAccounstAvailablePtsDao {

    @Override
    public AccountInfoAvailablePtsDaoResp getAvailableRewardPts(AccountInfoDaoRequest daoRequest) throws BusinessException,SystemException  {

        AccountInfoAvailablePtsDaoResp daoResp = null;

        try{
        //1. Prepare the request for backend system
        //2. call backend and get the response

        String dbRespCode = "0";
        String dbRespMsg = "success";

        if("0".equals(dbRespCode)){

            //Prepare the dao responce with the help of ResultSet

        daoResp = new AccountInfoAvailablePtsDaoResp();
        daoResp.setRespCode("0");
        daoResp.setRespCode("success");
        daoResp.setAvailPts(100000);
        daoResp.setEarnedPts(1500);

        }else if("100".equals(dbRespCode) || "101".equals(dbRespCode) || "102".equals(dbRespCode) || "103".equals(dbRespCode)){
            throw new BusinessException(dbRespCode, dbRespMsg);
        }else if("111".equals(dbRespCode) || "222".equals(dbRespCode) || "333".equals(dbRespCode) || "444".equals(dbRespCode)){
            throw new SystemException(dbRespCode, dbRespMsg);
        }else{
            throw new SystemException("777", "Unknown error from database");
        }
    }catch(BusinessException | SystemException e){
        e.printStackTrace();
        throw e;
    }
        
        return daoResp;
        
    }

}
