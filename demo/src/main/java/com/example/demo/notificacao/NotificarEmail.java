package com.example.demo.notificacao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.demo.model.Cliente;

@Qualifier("email")
@Component 
public class NotificarEmail implements Notificador  {
   // @Override 

    private String smtpServer;
    private boolean caixaAlta;
    
    public  void enviarNotificacao(Cliente cliente,String mensagem) {
        // Lógica para enviar email para o cliente
        mensagem = "teste sts";
        if(caixaAlta == true){
            mensagem = mensagem.toUpperCase();
        }
        System.out.println("Enviando email para: " + cliente.getEmail() + " via servidor SMTP: " );
        System.out.println("Mensagem: " + mensagem);
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
    public NotificarEmail() {
       
    }
    
}
