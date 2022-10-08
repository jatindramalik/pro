/**
 * @Copyright 2022, Key Bank pvt ltd, All rights are reserved. You should not disclose the information outside 
 * otherwise terms and condition will apply
 */
package com.keybank.accountinfo.tasks;

import java.util.concurrent.Callable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.keybank.accountinfo.dao.IAccounstAvailablePtsDao;
import com.keybank.accountinfo.exception.BusinessException;
import com.keybank.accountinfo.exception.SystemException;
import com.keybank.accountinfo.model.AccountInfoAvailablePtsDaoResp;
import com.keybank.accountinfo.model.AccountInfoDaoRequest;
import com.keybank.accountinfo.model.TaskResult;

/**
 * @author jatin, 27-Sep-2022
 *         Description:
 */
@Component
public class AccountsAvailablePtsTask implements Callable<TaskResult> {

    @Autowired
    private IAccounstAvailablePtsDao availablePtsDao;
    private AccountInfoDaoRequest daoRequest;

    public void setDaoRequest(AccountInfoDaoRequest daoRequest) {
        this.daoRequest = daoRequest;
    }



    @Override
    public TaskResult call() throws BusinessException, SystemException   {
		System.out.println("Entered into AccountsAvailablePtsTask");


        AccountInfoAvailablePtsDaoResp daoResponse = availablePtsDao.getAvailableRewardPts(daoRequest);

        TaskResult tr = new TaskResult();
        tr.setTaskName("availableptsTask");
        tr.setResult(daoResponse);
		System.out.println("Exit from AccountsAvailablePtsTask");

        return tr;
    }

}
