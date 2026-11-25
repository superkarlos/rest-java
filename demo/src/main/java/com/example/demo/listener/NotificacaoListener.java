package com.example.demo.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.example.demo.enumerador.NivelUrgencia;
import com.example.demo.notificacao.Notificador;
import com.example.demo.notificacao.TipoQualificador;
import com.example.demo.service.ClienteAtivoEvent;

@Component 
public class NotificacaoListener {
    
    @Autowired 
    @TipoQualificador(NivelUrgencia.EMAIL)
    private  Notificador notificador;

    // public NotificacaoListener( @TipoQualificador(NivelUrgencia.EMAIL) Notificador notificador){
    //     this.notificador = notificador;
    // }

    @EventListener 
    private void clienteAtivadoListener(ClienteAtivoEvent event){
        notificador.enviarNotificacao(event.getCliente(), "oiiiiiiii");
        System.out.println("ACHEI " + event.getCliente());
    }
    
}
