package com.example.demo.service;

import com.example.demo.model.Cliente;
import com.example.demo.notificacao.Notificador;
import com.example.demo.notificacao.NotificarEmail;

public class AtivarClienteService {
    
    private Notificador notificador;
    public AtivarClienteService(Notificador notificador) {
        this.notificador = notificador;
    }
    
    public void ativarCliente(Cliente cliente) {
        cliente.setActive(true);
        notificador.enviarNotificacao(cliente, "Seu cadastro foi ativado com sucesso!");
    }
}
