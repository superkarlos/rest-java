package com.example.demo.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.example.demo.service.ClienteAtivoEvent;

@Component 
public class NotaFiscalListener {

    @EventListener 
    private void emitirnotafiscal(ClienteAtivoEvent event){
       System.out.println("Emitindo nota fiscal de "+ event.getCliente().getName());
    }
    
}
