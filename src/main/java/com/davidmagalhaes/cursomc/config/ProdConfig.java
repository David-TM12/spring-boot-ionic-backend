package com.davidmagalhaes.cursomc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.davidmagalhaes.cursomc.services.EmailService;
import com.davidmagalhaes.cursomc.services.SmtpEmailService;

@Configuration
@Profile("prod")
public class ProdConfig {

	@Bean
	public EmailService emailService() {
		return new SmtpEmailService();
	}
}
