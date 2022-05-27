package com.fundtransfer.grainite.service;

import org.springframework.stereotype.Service;

import com.fundtransfer.grainite.entity.BankAccountEntity;
import com.fundtransfer.grainite.exception.EntityNotFoundException;
import com.fundtransfer.grainite.model.BankAccount;
import com.fundtransfer.grainite.model.mapper.BankAccountMapper;
import com.fundtransfer.grainite.repository.BankAccountRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AccountService {

    private BankAccountMapper bankAccountMapper = new BankAccountMapper();

    private final BankAccountRepository bankAccountRepository;

    public BankAccount readBankAccount(String accountNumber) {
        BankAccountEntity entity = bankAccountRepository.findByNumber(accountNumber).orElseThrow(EntityNotFoundException::new);
        return bankAccountMapper.convertToDto(entity);
    }

}
