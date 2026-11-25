package com.example.demo.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.notificacao.NotificarEmail;
import com.example.demo.service.ClienteService;

 @Configuration 
 public class NotificadorConfiguration {
    
    // @Bean 
    // @Qualifier("email")
    // public NotificarEmail notificarEmail(){
    //     NotificarEmail notificarEmail = new NotificarEmail();
    //     notificarEmail.setCaixaAlta(true);
    //     return  notificarEmail;
    // }
 }
