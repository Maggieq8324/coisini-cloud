package com.coisini.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class CoisiniZuulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoisiniZuulServerApplication.class, args);
	}

}
