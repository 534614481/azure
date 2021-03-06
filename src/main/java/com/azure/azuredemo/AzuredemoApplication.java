package com.azure.azuredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzuredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzuredemoApplication.class, args);
	}
	
	
	@GetMapping("/fromAzure")
	public String fromAzure() {
		return "Congrats for successfully depolyed first spring boot applications";
	}
	
	@GetMapping("/testAzureDemo")
	public String testAzureDemo() {
		return "Congrats!!! you have successfully deployed service in azure";
	}

}
