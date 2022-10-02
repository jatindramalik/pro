/**
 * @Copyright 2022, Key Bank pvt ltd, All rights are reserved. You should not disclose the information outside 
 * otherwise terms and condition will apply
 */
package com.keybank.accountinfo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.keybank.accountinfo.model.AccountInfoRequest;
import com.keybank.accountinfo.model.AccountInfoResponse;
import com.keybank.accountinfo.model.StatusBlock;
import com.keybank.accountinfo.service.IAccountInfoService;
import com.keybank.accountinfo.validator.AccountsInfoServiceRequestValidator;

/**
 * @author jatin, 23-Sep-2022
 * Description:
 */
@RestController
public class AccountInfoController {

    @Autowired
    AccountsInfoServiceRequestValidator reqValidator;

    @Autowired
    IAccountInfoService accountInfoService;

    @GetMapping("/rewardssummary/{cardnum}/{cvv}/{nameoncard}/{expdate}")
    public AccountInfoResponse getRewardSummary(@PathVariable("cardnum")String cardnum,
                                                @PathVariable("cvv")String cvv,
                                                @PathVariable("nameoncard")String nameOnCard,
                                                @PathVariable("expdate")String expdate,
                                                @RequestParam("typeOfRewards")String typeOfRewards,
                                                @RequestHeader("clientId")String clientId,
                                                @RequestHeader("channelId")String channelId,
                                                @RequestHeader("reqId")String reqId,
                                                @RequestHeader("msgTs")String msgTs
                                                ) throws InterruptedException{
                                                 
        AccountInfoResponse accountInfoResponse = null;

        try {
        //1.*Get the request from service
        AccountInfoRequest request = new AccountInfoRequest();

        //2.validate the request, if the request is invalid then throw userdefined exception eles proceed to service layer
        reqValidator.validateRequest(request);
        //3.prepare the request for service layer
        //4.call the service layer and get the response
       accountInfoResponse = accountInfoService.getRewardSummary(request);
       StatusBlock statusBlock = new StatusBlock();
       statusBlock.setRespCode("0");
       statusBlock.setRespMsg("success");
       accountInfoResponse.setStatusBlock(statusBlock);
        //5.prepare the controller response and send to consumer/client
        
            
        } catch (Exception e) {
            e.printStackTrace();
        }
                                                    
        return accountInfoResponse;
    }
    

}
