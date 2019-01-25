package com.example.helpdesk.apigateway.helpdeskgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class HelpdeskGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelpdeskGatewayApplication.class, args);
	}

}

