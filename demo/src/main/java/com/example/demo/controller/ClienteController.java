package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Cliente;
import com.example.demo.service.ClienteService;

@Controller 
@RequestMapping ("/clientes")
public class ClienteController {
    
    @Autowired(required = false) 
    private ClienteService clienteService;

    
    @GetMapping()
    @ResponseBody 
    public String listarClientes() {
        Cliente cliente1 = new Cliente( "Carlos Silva", "jaa","ssa");
        clienteService.ativarCliente(cliente1);
        return "Clientes listados com sucesso!";
    }

    
}
