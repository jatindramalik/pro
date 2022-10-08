/**
 * @Copyright 2022, Key Bank pvt ltd, All rights are reserved. You should not disclose the information outside 
 * otherwise terms and condition will apply
 */
package com.keybank.accountinfo.dao;


import com.keybank.accountinfo.exception.BusinessException;
import com.keybank.accountinfo.exception.SystemException;
import com.keybank.accountinfo.model.AccountInfoAvailablePtsDaoResp;
import com.keybank.accountinfo.model.AccountInfoDaoRequest;

/**
 * @author jatin, 23-Sep-2022
 * Description:
 */
public interface IAccounstAvailablePtsDao {

    AccountInfoAvailablePtsDaoResp getAvailableRewardPts(AccountInfoDaoRequest daoRequest) throws BusinessException, SystemException;

}
