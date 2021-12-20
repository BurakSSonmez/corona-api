package com.sonmez.coronaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CoronaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronaApiApplication.class, args);
	}

}
