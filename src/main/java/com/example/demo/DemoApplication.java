package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner, ApplicationContextAware {

	public static final Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);

	private ApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		LOGGER.info("Application Stop");
		System.out.println("Application Stop");
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info("Hello World!");
		String[] beans = context.getBeanDefinitionNames();
		for (String bean : beans) {
			LOGGER.info(bean);
		}
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		context = applicationContext;
	}

	public void setAnimal(@Qualifier("tygrysSyberyjski") Ssak ssak) {

	}
}
