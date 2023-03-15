package com.jawaidhakim.repository;

import com.jawaidhakim.model.bank.AccountHolder;
import org.springframework.data.repository.ListCrudRepository;

public interface AccountHolderRepository extends ListCrudRepository<AccountHolder, Long>
{
}
