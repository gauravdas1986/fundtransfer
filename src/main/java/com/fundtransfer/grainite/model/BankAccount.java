package com.fundtransfer.grainite.model;

import com.fundtransfer.grainite.model.AccountStatus;
import com.fundtransfer.grainite.model.AccountType;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class BankAccount {

    private Long id;
    private String number;
    private AccountType type;
    private AccountStatus status;
    private BigDecimal availableBalance;
    private BigDecimal actualBalance;
    private User user;

}
