package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.listener.NotaFiscalListener;
import com.example.demo.notificacao.Notificador;
import com.example.demo.service.ClienteService;

@Configuration 
//Também faz a instancia
public class ServiceConfig {
    
    @Bean 
    public ClienteService clienteService(){
        return  new ClienteService();
    }

//     @Bean 
//     public NotaFiscalListener notaFiscalListener(){
//         return new NotaFiscalListener();
//     }
}
