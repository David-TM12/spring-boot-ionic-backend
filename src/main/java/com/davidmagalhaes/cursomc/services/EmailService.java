package com.davidmagalhaes.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.davidmagalhaes.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
