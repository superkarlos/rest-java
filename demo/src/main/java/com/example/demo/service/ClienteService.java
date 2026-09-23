package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Cliente;
import com.example.demo.notificacao.NotificarEmail;
import com.example.demo.respository.ClienteRespository;

@Service 
public class ClienteService {
 
    private final NotificarEmail notificador;
    private final ClienteRespository clienteRespository;

    public ClienteService(NotificarEmail notificador, ClienteRespository clienteRespository) {
        this.notificador = notificador;
        this.clienteRespository = clienteRespository;
    }

    
    public void ativarCliente(Cliente cliente) {
        cliente.setActive(true);
        notificador.enviarNotificacao(cliente, "Seu cadastro foi ativado com sucesso!");
    }
    public List<Cliente> listarClientes() {
        return clienteRespository.listarClientes();
    }
} 
