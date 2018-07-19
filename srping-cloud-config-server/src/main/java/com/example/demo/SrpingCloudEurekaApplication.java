package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SrpingCloudEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SrpingCloudEurekaApplication.class, args);
	}
}
