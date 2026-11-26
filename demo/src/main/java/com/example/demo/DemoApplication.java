package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Cliente;
import com.example.demo.notificacao.NotificarEmail;
import com.example.demo.service.ClienteService;

@SpringBootApplication
public class DemoApplication {

    @Value("${infor.tipo.ambiente}")
    private String ambiente;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean 
    CommandLineRunner executar() {
        return args -> System.out.println("Ambiente = " + ambiente);
    }
}