/**
 * @Copyright 2022, Key Bank pvt ltd, All rights are reserved. You should not disclose the information outside 
 * otherwise terms and condition will apply
 */
package com.keybank.accountinfo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.keybank.accountinfo.dao.IAccounstAvailablePtsDao;
import com.keybank.accountinfo.dao.IAccountsAdjustPendingPtsDao;
import com.keybank.accountinfo.dao.IAccountsForfietedPtsDao;
import com.keybank.accountinfo.model.AccountInfoAdjustPendingPtDaoResp;
import com.keybank.accountinfo.model.AccountInfoAvailablePtsDaoResp;
import com.keybank.accountinfo.model.AccountInfoDaoRequest;
import com.keybank.accountinfo.model.AccountInfoForfietedPtsDaoResp;
import com.keybank.accountinfo.model.AccountInfoRequest;
import com.keybank.accountinfo.model.AccountInfoResponse;
import com.keybank.accountinfo.model.RewardSummary;
import com.keybank.accountinfo.model.TaskResult;
import com.keybank.accountinfo.tasks.AccountsAdjustedPtsTask;
import com.keybank.accountinfo.tasks.AccountsAvailablePtsTask;
import com.keybank.accountinfo.tasks.AccountsForfietedPtsTask;

/**
 * @author jatin, 23-Sep-2022
 *         Description:
 */
@Component
public class AccountInfoServiceImpl implements IAccountInfoService {

    @Autowired
    IAccountsAdjustPendingPtsDao adjustedDao;

    @Autowired
    IAccounstAvailablePtsDao availableDao;

    @Autowired
    IAccountsForfietedPtsDao forfietedDao;

    @Autowired
    AccountsAvailablePtsTask accountsAvailablePtsTask;

    @Autowired
    AccountsAdjustedPtsTask accountsAdjustedPtsTask;

    @Autowired
    AccountsForfietedPtsTask accountsForfietedPtsTask;

    @Override
    public AccountInfoResponse getRewardSummary(AccountInfoRequest accountInfoReq) throws InterruptedException, ExecutionException {
        
        AccountInfoResponse accountInfoResp = new AccountInfoResponse();

        RewardSummary rewardSummary = new RewardSummary();

        ExecutorService service = Executors.newFixedThreadPool(3);

        List list = new ArrayList<>();

        AccountInfoDaoRequest daoRequest = new AccountInfoDaoRequest();
        accountsAvailablePtsTask.setDaoRequest(daoRequest);
        accountsAdjustedPtsTask.setDaoRequest(daoRequest);
        accountsForfietedPtsTask.setDaoRequest(daoRequest);

        list.add(accountsAvailablePtsTask);
        list.add(accountsAdjustedPtsTask);
        list.add(accountsForfietedPtsTask);

        List<Future<TaskResult>> futureList = service.invokeAll(list);

        for (Future future : futureList) {

            TaskResult tr = (TaskResult)future.get();

            if("availableptsTask".equals(tr.getTaskName())){
                AccountInfoAvailablePtsDaoResp availablePtsDao = (AccountInfoAvailablePtsDaoResp)tr.getResult();
                rewardSummary.setAvailPts(availablePtsDao.getAvailPts());
                rewardSummary.setEarnedPts(availablePtsDao.getEarnedPts());
            }else if("adjustptsTask".equals(tr.getTaskName())){
                AccountInfoAdjustPendingPtDaoResp audjustedPendingPtsDao = (AccountInfoAdjustPendingPtDaoResp)tr.getResult();
                rewardSummary.setAdjustedPts(audjustedPendingPtsDao.getAdjustedPts());
                rewardSummary.setPendingPts(audjustedPendingPtsDao.getPendingPts());
            }else{
                AccountInfoForfietedPtsDaoResp forfietedPtsDao = (AccountInfoForfietedPtsDaoResp)tr.getResult();
                rewardSummary.setForfietedPts(forfietedPtsDao.getForfietedPts());
            }
            
        }
        accountInfoResp.setRewardSummary(rewardSummary);

        System.out.println("After invoking parallel calls");
        System.out.println("accountInfoResp in service layer is : " + accountInfoResp);
        return accountInfoResp;
    }
}
