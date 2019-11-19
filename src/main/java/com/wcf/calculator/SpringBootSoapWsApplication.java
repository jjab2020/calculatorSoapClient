package com.wcf.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class SpringBootSoapWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSoapWsApplication.class, args);
	}
	
	@Bean
    CommandLineRunner lookup(CalculatorClient calculator) {
        return args -> {
        	int result;
        	result = calculator.Somme(3, 5);
        	System.out.println("The result is : "+ result);
        	result = calculator.substractNumber(15,10);
        	System.out.println("The result is : "+ result);
    		
        };
    }

}
