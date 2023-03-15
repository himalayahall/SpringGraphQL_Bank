package com.jawaidhakim;

import com.jawaidhakim.model.bank.AccountHolder;
import com.jawaidhakim.repository.AccountHolderRepository;
import com.jawaidhakim.service.AccountHolderService;
import graphql.scalars.ExtendedScalars;
import graphql.schema.idl.RuntimeWiring;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.graphql.execution.RuntimeWiringConfigurer;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@Slf4j
public class LearnGraphqlApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(LearnGraphqlApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(AccountHolderService svc)
	{
		return (args) -> {
			// save a few customers
			svc.update(AccountHolder.builder().firstName("jawaid").lastName("hakim").dob(LocalDate.of(1963, 12, 10)).build());

			List<AccountHolder> holders = svc.findAll();
			for (AccountHolder h : holders)
			{
				log.info(h.toString());
			}
		};
	}
}