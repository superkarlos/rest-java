package com.example.demo.notificacao;

import com.example.demo.model.Cliente;

public interface Notificador {
    void enviarNotificacao(Cliente cliente, String mensagem);
}