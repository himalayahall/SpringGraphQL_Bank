package com.jawaidhakim.service;

import com.jawaidhakim.model.bank.AccountHolder;
import com.jawaidhakim.model.bank.BankAccount;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface AccountHolderService
{
    List<AccountHolder> findAll();

    Optional<AccountHolder> findById(Long id);

    Long delete(Long id);

    AccountHolder update(AccountHolder accountHolder);
}
