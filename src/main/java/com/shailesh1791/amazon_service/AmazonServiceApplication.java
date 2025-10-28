package com.shailesh1791.amazon_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
//@EnableDiscoveryClient
@EnableCaching
public class AmazonServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmazonServiceApplication.class, args);
	}

}
