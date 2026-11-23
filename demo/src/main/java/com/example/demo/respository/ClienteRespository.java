package com.example.demo.respository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Cliente;

@Repository 
public class ClienteRespository {
    

    private List<Cliente> clientes() {
        return List.of(
            new Cliente("Carlos", "carlos@example.com","123456789"),
            new Cliente("Ana", "ana@example.com","987654321")
        );
    }

    public List<Cliente> listarClientes() {
        return clientes();
    }
}
