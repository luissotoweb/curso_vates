package com.curso.app.service;

import com.curso.app.model.Cliente;
import com.curso.app.model.Vendedor;

import java.util.List;
import java.util.Optional;

public interface VendedorService {

    Vendedor save(Vendedor vendedor);

    Vendedor update(Vendedor vendedor);

    void delete(Long id);

    Vendedor getById(Long id);

    List<Vendedor> findAll();
}
