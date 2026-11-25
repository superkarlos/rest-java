package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.enumerador.NivelUrgencia;
import com.example.demo.model.Cliente;
import com.example.demo.notificacao.Notificador;
import com.example.demo.notificacao.NotificarEmail;
import com.example.demo.notificacao.TipoQualificador;
import com.example.demo.respository.ClienteRespository;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

//@Component 
public class ClienteService {

/* 
forma 1
    @Autowired 
    @TipoQualificador (NivelUrgencia.EMAIL)
    private  Notificador notificador;
    public void ativarCliente(Cliente cliente) {
        cliente.setActive(true);
        notificador.enviarNotificacao(cliente, "oi");   
        // dizer para o container que o cliente ta alivo
    }
*/    

//forma 2

@Autowired 
private  ApplicationEventPublisher eventPublisher;

public void ativarCliente(Cliente cliente){
    cliente.setActive(true);
    eventPublisher.publishEvent(new ClienteAtivoEvent(cliente));
}
 
} 
