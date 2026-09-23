package com.example.demo.notificacao;

import com.example.demo.model.Cliente;

public class NotificarSmS implements Notificador {
    
    @Override
    public  void enviarNotificacao(Cliente cliente,String mensagem) {
        // Lógica para enviar sms para o cliente
        System.out.println("Enviando sms para: " + cliente.getPhone());
        System.out.println("Mensagem: " + mensagem);
    }
}
