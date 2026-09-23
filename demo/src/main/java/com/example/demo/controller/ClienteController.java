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
    
    @Autowired 
    private ClienteService clienteService;
    
    @GetMapping()
    @ResponseBody 
    public String listarClientes() {
        return "clientes";
    }

    @GetMapping ("/listar")
    @ResponseBody
    public ResponseEntity<List<Cliente>> listar() {
        List<Cliente> clientes = clienteService.listarClientes();
        return ResponseEntity.status(HttpStatus.OK).body(clientes);
    }
}
