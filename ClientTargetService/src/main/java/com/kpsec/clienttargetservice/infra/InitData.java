package com.kpsec.clienttargetservice.infra;

import com.kpsec.clienttargetservice.model.entity.Account;
import com.kpsec.clienttargetservice.model.entity.Branch;
import com.kpsec.clienttargetservice.model.entity.Surmmary;
import com.kpsec.clienttargetservice.repository.AccountRepository;
import com.kpsec.clienttargetservice.repository.BranchRepository;
import com.kpsec.clienttargetservice.repository.SurmmaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class InitData {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    SurmmaryRepository surmmaryRepository;

    @Autowired
    BranchRepository branchRepository;

    @PostConstruct
    private void initAccount() throws IOException {
        if (accountRepository.count() == 0) {
            Resource resource = new ClassPathResource("계좌정보.csv");
            List<Account> accountList = Files.readAllLines(resource.getFile().toPath(), StandardCharsets.UTF_8)
                    .stream().skip(1).map(line -> {
                        String[] split = line.split(",");
                        return Account.builder().accountNo(split[0]).accountName(split[1]).branchCode(split[2])
                                .build();
                    }).collect(Collectors.toList());
            accountRepository.saveAll(accountList);
        }

        if (surmmaryRepository.count() == 0) {
            Resource resource = new ClassPathResource("거래내역.csv");
            List<Surmmary> surmmaryList = Files.readAllLines(resource.getFile().toPath(), StandardCharsets.UTF_8)
                    .stream().skip(1).map(line -> {
                        String[] split = line.split(",");
                        return Surmmary.builder()
                                .date(split[0])
                                .accountNo(split[1])
                                .transactionId(Integer.parseInt(split[2]))
                                .amount(Integer.parseInt(split[3]))
                                .fees(Integer.parseInt(split[4]))
                                .cancel(split[5])
                                .build();
                    }).collect(Collectors.toList());
            surmmaryRepository.saveAll(surmmaryList);
        }

        if (branchRepository.count() == 0) {
            Resource resource = new ClassPathResource("관리점정보.csv");
            List<Branch> branchList = Files.readAllLines(resource.getFile().toPath(), StandardCharsets.UTF_8)
                    .stream().skip(1).map(line -> {
                        String[] split = line.split(",");
                        return Branch.builder()
                                .branchCode(split[0])
                                .branchName(split[1])
                                .build();
                    }).collect(Collectors.toList());
            branchRepository.saveAll(branchList);
        }

    }
}
