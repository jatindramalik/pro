/**
 * @Copyright 2022, Key Bank pvt ltd, All rights are reserved. You should not disclose the information outside 
 * otherwise terms and condition will apply
 */
package com.keybank.accountinfo.validator;

import org.springframework.stereotype.Component;

import com.keybank.accountinfo.exception.AccountsRequestInvalidException;
import com.keybank.accountinfo.model.AccountInfoRequest;

/**
 * @author jatin, 23-Sep-2022
 * Description:
 */
@Component
public class AccountsInfoServiceRequestValidator {

    public void validateRequest(AccountInfoRequest request) throws AccountsRequestInvalidException {

       if(request == null){
        throw new AccountsRequestInvalidException("acct001", "request object is null");
       }
    }

}
