/**
 * @Copyright 2022, Key Bank pvt ltd, All rights are reserved. You should not disclose the information outside 
 * otherwise terms and condition will apply
 */
package com.keybank.accountinfo.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.keybank.accountinfo.exception.AccountsRequestInvalidException;
import com.keybank.accountinfo.exception.BusinessException;
import com.keybank.accountinfo.exception.SystemException;
import com.keybank.accountinfo.model.AccountInfoResponse;
import com.keybank.accountinfo.model.StatusBlock;

/**
 * @author jatin, 23-Sep-2022
 *         Description:
 */
@ControllerAdvice
public class AccountInfoControllerAdvice {

    AccountInfoResponse accountInfoResponse = null;

    @ExceptionHandler(value = AccountsRequestInvalidException.class)
    @ResponseBody
    public AccountInfoResponse handleRequestData(AccountsRequestInvalidException exception) {

        return buildErrorResp(exception.getRespCode(), exception.getRespMsg());
    }

    @ExceptionHandler(value = BusinessException.class)
    @ResponseBody
    public AccountInfoResponse handleDataErrors(BusinessException exception) {

        return buildErrorResp(exception.getRespCode(), exception.getRespMsg());

    }

    @ExceptionHandler(value = SystemException.class)
    @ResponseBody
    public AccountInfoResponse handleSystemErrors(SystemException exception) {

        return buildErrorResp(exception.getRespCode(), exception.getRespMsg());

    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public AccountInfoResponse handleGenricErrors(Exception exception) {

        return buildErrorResp("acct777", "Unknown error from database");
        ;
    }

    private AccountInfoResponse buildErrorResp(String respCode, String respMsg) {
        AccountInfoResponse accountInfoResponse = new AccountInfoResponse();

        StatusBlock statusBlock = new StatusBlock();
        statusBlock.setRespCode(respCode);
        statusBlock.setRespMsg(respMsg);

        accountInfoResponse.setStatusBlock(statusBlock);
        return accountInfoResponse;
    }

}
