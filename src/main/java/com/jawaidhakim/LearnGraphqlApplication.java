package com.jawaidhakim;

import graphql.scalars.ExtendedScalars;
import graphql.schema.idl.RuntimeWiring;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.graphql.execution.RuntimeWiringConfigurer;

@SpringBootApplication
public class LearnGraphqlApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(LearnGraphqlApplication.class, args);
	}

}
