package com.examle.demo;


import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class RestTemplateApplication {

	private static final Logger log=LoggerFactory.getLogger(RestTemplate.class);
	public static void main(String args[]) {
		
//		
//		RestTemplate restTemplate=new RestTemplate();
//		String quote=restTemplate.getForObject("http://localhost:8090", String.class);
//		log.info(quote.toString());
//		
		
		
		SpringApplication.run(RestTemplateApplication.class);
	}
	
	@Bean
public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
}
