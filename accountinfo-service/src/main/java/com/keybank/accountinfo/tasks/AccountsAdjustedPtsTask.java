/**
 * @Copyright 2022, Key Bank pvt ltd, All rights are reserved. You should not disclose the information outside 
 * otherwise terms and condition will apply
 */
package com.keybank.accountinfo.tasks;

import java.util.concurrent.Callable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.keybank.accountinfo.dao.IAccountsAdjustPendingPtsDao;
import com.keybank.accountinfo.model.AccountInfoAdjustPendingPtDaoResp;
import com.keybank.accountinfo.model.AccountInfoDaoRequest;

import com.keybank.accountinfo.model.TaskResult;

/**
 * @author jatin, 27-Sep-2022
 *         Description:
 */
@Component
public class AccountsAdjustedPtsTask implements Callable<TaskResult> {

	@Autowired
	private IAccountsAdjustPendingPtsDao accountsAdjustPendingPtsDao;
	private AccountInfoDaoRequest daoRequest;
	
	public void setDaoRequest(AccountInfoDaoRequest daoRequest) {
		this.daoRequest = daoRequest;
	}

	@Override
	public TaskResult call() throws Exception {

		System.out.println("Entered into AccountsAdjustedPtsTask");

		AccountInfoAdjustPendingPtDaoResp daoResponse = accountsAdjustPendingPtsDao.getAdjustedRewardPts(daoRequest);

		TaskResult tk = new TaskResult();
		tk.setTaskName("adjustptsTask");
		tk.setResult(daoResponse);

		System.out.println("Exit from AccountsAdjustedPtsTask");

		return tk;
	}

}
