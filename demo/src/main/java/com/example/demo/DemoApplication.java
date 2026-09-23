package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Cliente;
import com.example.demo.notificacao.NotificarEmail;
import com.example.demo.notificacao.NotificarSmS;
import com.example.demo.service.AtivarClienteService;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Cliente cliente = new Cliente("John Doe", "john.doe@example.com", "123456789", false);

		AtivarClienteService ativarClienteService = new AtivarClienteService(new NotificarSmS());
		ativarClienteService.ativarCliente(cliente);

	}

}
