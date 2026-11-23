package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.model.Cliente;
import com.example.demo.notificacao.Notificador;
import com.example.demo.notificacao.NotificarEmail;
import com.example.demo.respository.ClienteRespository;

 @Component 
public class ClienteService {
 
    private final Notificador notificador;
   // private final ClienteRespository clienteRespository;

    public ClienteService(Notificador notificador) {
        System.out.println("ClienteService inicializado.");
        this.notificador = notificador;
        
    }

    
    public void ativarCliente(Cliente cliente) {
        cliente.setActive(true);
        notificador.enviarNotificacao(cliente, "Seu cadastro foi ativado com sucesso!");
    }
    // public List<Cliente> listarClientes() {
    //     return clienteRespository.listarClientes();
    // }
} 
