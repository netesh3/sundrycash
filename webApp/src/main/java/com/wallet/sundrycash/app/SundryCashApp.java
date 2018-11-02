package com.wallet.sundrycash.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@Configuration

@EnableJpaRepositories(basePackages = { "com.wallet.sundrycash.repository"})

@EntityScan(basePackages = { "com.wallet.sundrycash.domain",
                             "com.wallet.sundrycash.service",
                             "com.wallet.sundrycash.restcontroller"})

@ComponentScan(basePackages = { "com.wallet.sundrycash.repository",
                                "com.wallet.sundrycash.domain",
                                "com.wallet.sundrycash.service",
                                "com.wallet.sundrycash.restcontroller",
                                "com.wallet.sundrycash.serviceImpl"})

public class SundryCashApp {
    public static void main(String[] args) {
        SpringApplication.run(SundryCashApp.class);
    }
}
