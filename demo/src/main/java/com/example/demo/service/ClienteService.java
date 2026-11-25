package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.enumerador.NivelUrgencia;
import com.example.demo.model.Cliente;
import com.example.demo.notificacao.Notificador;
import com.example.demo.notificacao.NotificarEmail;
import com.example.demo.notificacao.TipoQualificador;
import com.example.demo.respository.ClienteRespository;

 @Component 
public class ClienteService {

    
    @Autowired 
    @TipoQualificador (NivelUrgencia.SMS)
    private  Notificador notificador;
   // private final ClienteRespository clienteRespository;

    
    public void ativarCliente(Cliente cliente) {
        cliente.setActive(true);
            notificador.enviarNotificacao(cliente, "oi");   
    }
    // public List<Cliente> listarClientes() {
    //     return clienteRespository.listarClientes();
    // }
} 
