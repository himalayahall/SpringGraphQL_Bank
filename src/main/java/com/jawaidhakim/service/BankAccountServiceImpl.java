package com.jawaidhakim.service;

import com.jawaidhakim.model.bank.AccountHolder;
import com.jawaidhakim.model.bank.BankAccount;
import com.jawaidhakim.repository.AccountHolderRepository;
import com.jawaidhakim.repository.BankAccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BankAccountServiceImpl implements BankAccountService
{
    private BankAccountRepository repo;

    public BankAccountServiceImpl(BankAccountRepository repo)
    {
        this.repo = repo;
    }

    @Override
    public List<BankAccount> findAll()
    {
        return repo.findAll();
    }

    @Override
    public Optional<BankAccount> findById(Long id)
    {
        return repo.findById(id);
    }
    @Override
    public  Long delete(Long id)
    {
        repo.deleteById(id);
        return id;
    }

    public BankAccount update(BankAccount bankAccount)
    {
        return repo.save(bankAccount);
    }}
