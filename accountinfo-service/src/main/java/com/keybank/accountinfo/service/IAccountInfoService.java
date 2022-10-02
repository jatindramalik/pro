/**
 * @Copyright 2022, Key Bank pvt ltd, All rights are reserved. You should not disclose the information outside 
 * otherwise terms and condition will apply
 */
package com.keybank.accountinfo.service;

import java.util.concurrent.ExecutionException;

import com.keybank.accountinfo.model.AccountInfoRequest;
import com.keybank.accountinfo.model.AccountInfoResponse;

/**
 * @author jatin, 23-Sep-2022
 * Description:
 */
public interface IAccountInfoService {

    AccountInfoResponse getRewardSummary(AccountInfoRequest accountInfoReq) throws InterruptedException, ExecutionException;

}
