package com.example.demo.notificacao;

import com.example.demo.model.Cliente;

public class NotificarEmail implements Notificador {
    
    @Override 
    public  void enviarNotificacao(Cliente cliente,String mensagem) {
        // Lógica para enviar email para o cliente
        System.out.println("Enviando email para: " + cliente.getEmail());
        System.out.println("Mensagem: " + mensagem);
    }
}
