package com.kpsec.clienttargetservice.model.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import com.kpsec.clienttargetservice.model.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Surmmary {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String summaryId;

    private String date;

    private String accountNo;

    private int transactionId;

    private int amount;

    private int fees;

    private String cancel;
}
