package com.example.demo.notificacao;

import org.springframework.stereotype.Component;

import com.example.demo.model.Cliente;

@Component 
public class NotificarEmail {
   // @Override 
    public  void enviarNotificacao(Cliente cliente,String mensagem) {
        // Lógica para enviar email para o cliente
        System.out.println("Enviando email para: " + cliente.getEmail());
        System.out.println("Mensagem: " + mensagem);
    }
}
