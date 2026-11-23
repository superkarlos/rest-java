package com.example.demo.notificacao;

import org.springframework.stereotype.Component;

import com.example.demo.model.Cliente;

 @Component 
public class NotificarEmail implements Notificador  {
   // @Override 

    private String smtpServer;
    private boolean caixaAlta;
    public NotificarEmail() {
       
    }
    public  void enviarNotificacao(Cliente cliente,String mensagem) {
        // Lógica para enviar email para o cliente
        
        System.out.println("Enviando email para: " + cliente.getEmail() + " via servidor SMTP: " );
        System.out.println("Mensagem: " + mensagem);
    }
}
