package com.example.tinhh;

import com.example.tinhh.Model.Account;
import com.example.tinhh.Repo.InterfaceAccount;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class TinhhApplication {

	public static void main(String[] args) {
		SpringApplication.run(TinhhApplication.class, args);
	}

}
