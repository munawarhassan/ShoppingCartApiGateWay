package com.ibm.demo.shoppingcartapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ShoppingCartApiGatetewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCartApiGatetewayApplication.class, args);
	}

}
