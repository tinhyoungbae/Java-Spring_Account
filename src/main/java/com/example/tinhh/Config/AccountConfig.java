package com.example.tinhh.Config;

import com.example.tinhh.Model.AccountValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AccountConfig {
    @Bean
    public AccountValidator accountValidator(){
        return new AccountValidator();
    }
}
