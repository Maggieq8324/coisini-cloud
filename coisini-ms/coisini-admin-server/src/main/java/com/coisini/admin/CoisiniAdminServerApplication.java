package com.coisini.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"com.coisini.admin"})
public class CoisiniAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoisiniAdminServerApplication.class, args);
	}

}
