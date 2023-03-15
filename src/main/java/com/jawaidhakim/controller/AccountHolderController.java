package com.jawaidhakim.controller;

import com.jawaidhakim.model.bank.AccountHolder;

import com.jawaidhakim.service.AccountHolderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.*;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

@Controller
@Slf4j
public class AccountHolderController
{
    private final AccountHolderService svc;

    public AccountHolderController(AccountHolderService svc)
    {
        this.svc = svc;
    }

    @QueryMapping(name="allAccountHolders")
    public List<AccountHolder> allAccountHolders()
    {
        log.info("fetch all account holders");
        return svc.findAll();
    }

    @QueryMapping(name="accountHolder")
    public AccountHolder accountHolder(@Argument Long id)
    {
        log.info("fetch by id: {id}");
        Optional<AccountHolder> opt = svc.findById(id);
        if (opt.isPresent())
            return opt.get();
        return null;
    }

    @MutationMapping(name="addAccountHolder")
    public AccountHolder addAccountHolder(@Argument AccountHolder acctHolder)
    {
        return svc.update(acctHolder);
    }

    @MutationMapping(name="deleteAccountHolder")
    public Long deleteAccountHolder(@Argument Long id)
    {
        svc.delete(id);
        return id;
    }

//    @SubscriptionMapping
//    public Flux<ModelChangeEvent> modelChanges()
//    {
//        log.info("modelChangeSubscription");
//        return Flux.fromStream(Stream.generate(() -> new ModelChangeEvent(ModelType.ACCOUNT_HOLDER, 1L)))
//        .delayElements(Duration.ofSeconds(1))
//                .take(10);
//    }
}
