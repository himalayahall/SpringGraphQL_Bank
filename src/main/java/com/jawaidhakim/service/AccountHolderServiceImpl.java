package com.jawaidhakim.service;

import com.jawaidhakim.model.bank.AccountHolder;
import com.jawaidhakim.model.bank.BankAccount;
import com.jawaidhakim.repository.AccountHolderRepository;
import com.jawaidhakim.repository.BankAccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountHolderServiceImpl implements AccountHolderService
{
    private AccountHolderRepository repo;

    public AccountHolderServiceImpl(AccountHolderRepository repo)
    {
        this.repo = repo;
    }
    @Override
    public List<AccountHolder> findAll()
    {
        return repo.findAll();
    }

    @Override
    public Optional<AccountHolder> findById(Long id)
    {
        return repo.findById(id);
    }

    @Override
    public  Long delete(Long id)
    {
        repo.deleteById(id);
        return id;
    }

    public AccountHolder update(AccountHolder accountHolder)
    {
        return repo.save(accountHolder);
    }
}
