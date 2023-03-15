package com.jawaidhakim.controller;

import com.jawaidhakim.model.bank.AccountHolder;
import com.jawaidhakim.model.bank.BankAccount;
import com.jawaidhakim.service.BankAccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@Controller
@Slf4j
public class BankAccountController
{
    private final BankAccountService svc;

    public BankAccountController(BankAccountService svc)
    {
        this.svc = svc;
    }

    @QueryMapping(name="allBankAccounts")
    public List<BankAccount> allBankAccounts()
    {
        log.info("fetch all bank accounts");
        return svc.findAll();
    }

    @QueryMapping(name="bankAccount")
    public BankAccount bankAccount(@Argument Long id)
    {
        log.info("fetch by id: {id}");
        Optional<BankAccount> opt = svc.findById(id);
        if (opt.isPresent())
            return opt.get();
        return null;
    }


    @MutationMapping(name="addBankAccount")
    public BankAccount addBankAccount(@Argument BankAccount bankAccount)
    {
        return svc.update(bankAccount);
    }

    @MutationMapping(name="deleteBankAccount")
    public Long deleteBankAccount(@Argument Long id)
    {
        svc.delete(id);
        return id;
    }

}
