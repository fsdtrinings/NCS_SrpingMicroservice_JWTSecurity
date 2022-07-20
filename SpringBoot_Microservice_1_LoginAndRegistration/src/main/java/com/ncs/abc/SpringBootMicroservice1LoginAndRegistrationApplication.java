package com.ncs.abc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootMicroservice1LoginAndRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroservice1LoginAndRegistrationApplication.class, args);
	}

}
