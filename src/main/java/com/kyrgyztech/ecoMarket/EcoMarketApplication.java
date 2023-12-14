package com.kyrgyztech.ecoMarket;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Eco Market Project",
				description = "This project for #NeobookChallenge",
				contact = @Contact(
						name = "Almaz Zhanybekov",
						email = "zhanybekovalmaz23@gmail.com"
				)
		)
)
public class EcoMarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcoMarketApplication.class, args);
	}

}
