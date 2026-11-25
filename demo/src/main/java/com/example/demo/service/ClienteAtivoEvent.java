package com.example.demo.service;

import com.example.demo.model.Cliente;

public class ClienteAtivoEvent {

  
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
