package br.leonardo.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import br.leonardo.cursomc.domain.Pedido;

public interface EmailService {
	
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
		
	
	

}
