package com.curso.app.service;

import com.curso.app.model.Cliente;

import java.util.List;

public interface ClienteService {

    Cliente findById(Long id);

    List<Cliente> findAll();

    Cliente save(Cliente cliente);

    void deleteCliente(Cliente cliente);

    Cliente findByDni(Long dni);
}
