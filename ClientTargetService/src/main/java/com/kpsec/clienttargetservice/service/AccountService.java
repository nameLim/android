package com.kpsec.clienttargetservice.service;

import com.kpsec.clienttargetservice.model.AccountResult;
import com.kpsec.clienttargetservice.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public List<AccountResult> getAccountByBranchCode(String branchCode){
        List<AccountResult> accountResultList = accountRepository.getAccountByBranchCode(branchCode);
        return accountResultList;
    }
}
