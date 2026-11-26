package com.example.demo.service;

import org.springframework.beans.factory.annotation.Value;

import com.example.demo.model.Cliente;

public class ClienteAtivoEvent {
  
  @Value("${notificacao.tipo.server-porta}")
  private String protadata;

  private Cliente cliente;

  public ClienteAtivoEvent(Cliente cliente){
    super();
    this.cliente = cliente;  
    System.out.println("CLIENTE ATIVO " + cliente.getName());
  }

  public Cliente getCliente() {
        return cliente;
  }

}
