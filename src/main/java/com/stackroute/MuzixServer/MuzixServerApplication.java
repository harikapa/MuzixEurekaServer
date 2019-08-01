package com.stackroute.MuzixServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MuzixServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MuzixServerApplication.class, args);
	}
}
