package com.jawaidhakim.service;

import com.jawaidhakim.model.bank.AccountHolder;
import com.jawaidhakim.model.bank.BankAccount;

import java.util.List;
import java.util.Optional;

public interface BankAccountService
{
    List<BankAccount> findAll();

    Optional<BankAccount> findById(Long id);

    Long delete(Long id);

    BankAccount update(BankAccount bankAccount);}
