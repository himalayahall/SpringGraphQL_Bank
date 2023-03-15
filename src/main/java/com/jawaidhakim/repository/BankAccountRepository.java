package com.jawaidhakim.repository;

import com.jawaidhakim.model.bank.BankAccount;
import org.springframework.data.repository.ListCrudRepository;

public interface BankAccountRepository extends ListCrudRepository<BankAccount, Long>
{
}
