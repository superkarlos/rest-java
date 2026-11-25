package com.example.demo.notificacao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.example.demo.enumerador.NivelUrgencia;
import com.example.demo.model.Cliente;

@Component 
@Profile("prod")
@TipoQualificador(value = NivelUrgencia.EMAIL)
public class NotificarEmailPro implements Notificador  {
   // @Override 

    private String smtpServer;
    private boolean caixaAlta;
    
    public  void enviarNotificacao(Cliente cliente,String mensagem) {
        // Lógica para enviar email para o cliente
        System.out.println("enviando msg do EMAIL (EM PRODUCAO)");
    }

    public String getSmtpServer() {
        return smtpServer;
    }
    public void setSmtpServer(String smtpServer) {
        this.smtpServer = smtpServer;
    }
    public boolean isCaixaAlta() {
        return caixaAlta;
    }
    public void setCaixaAlta(boolean caixaAlta) {
        this.caixaAlta = caixaAlta;
    }
   
    
}
