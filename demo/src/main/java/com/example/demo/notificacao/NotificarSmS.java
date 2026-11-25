package com.example.demo.notificacao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.demo.enumerador.NivelUrgencia;
import com.example.demo.model.Cliente;

@Component 
//@Qualifier("smss")
@TipoQualificador(value = NivelUrgencia.SMS)
public class NotificarSmS implements Notificador {
    
    @Override
    public  void enviarNotificacao(Cliente cliente,String mensagem) {
        System.out.println("Enviando mensagem do SMS");
    }
}
