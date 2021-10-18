package com.kpsec.clienttargetservice.controller;

import com.kpsec.clienttargetservice.model.AccountResult;
import com.kpsec.clienttargetservice.service.AccountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "Sample")
@RestController
@RequestMapping("/test/")
public class SampleController {
    @Autowired
    private AccountService accountService;

    @ApiOperation(value = "sample")
    @GetMapping(value = "/acount")
    public List<AccountResult> getAccountInfo(String branchCode) {
        return accountService.getAccountByBranchCode(branchCode);
    }
}
