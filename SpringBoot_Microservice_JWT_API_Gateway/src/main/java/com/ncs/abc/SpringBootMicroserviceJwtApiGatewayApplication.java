package com.ncs.abc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootMicroserviceJwtApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroserviceJwtApiGatewayApplication.class, args);
	}

}
