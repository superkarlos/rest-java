package com.example.demo.listener;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import com.example.demo.service.ClienteAtivoEvent;
@Component 
public class NotaFiscalListener {
    @Value ("${notificacao.tipo.server-porta}")
    private String protadata;

    @EventListener 
    private void emitirnotafiscal(ClienteAtivoEvent event){
        System.out.println("portaaaaaaaaaa "+protadata);
       System.out.println("Emitindo nota fiscal de "+ event.getCliente().getName());
    }
    
}
