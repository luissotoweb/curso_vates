package com.curso.app.service.impl;

import com.curso.app.model.Vendedor;
import com.curso.app.repository.VendedorRepository;
import com.curso.app.service.VendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VendedorServiceImpl implements VendedorService {

    @Autowired
    private VendedorRepository vendedorRepository;

    @Override
    public Vendedor save(Vendedor vendedor) {
        return vendedorRepository.save(vendedor);
    }

    @Override
    public Vendedor update(Vendedor vendedor) {
        return vendedorRepository.save(vendedor);
    }

    @Override
    public void delete(Long id) {
        Vendedor vendedor = new Vendedor();
        vendedor.setId(id);
        vendedorRepository.delete(vendedor);
    }

    @Override
    public Vendedor getById(Long id) {
        return vendedorRepository.findById(id).orElse(new Vendedor());
    }

    @Override
    public List<Vendedor> findAll(){
        return vendedorRepository.findAll();
    }
}
