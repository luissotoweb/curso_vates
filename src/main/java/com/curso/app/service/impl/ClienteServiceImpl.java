package com.curso.app.service.impl;

import com.curso.app.model.Cliente;
import com.curso.app.repository.ClienteRepository;
import com.curso.app.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente findById(Long id) {
        return clienteRepository.getReferenceById(id);
    }

    @Override
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente save(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    @Override
    public void deleteCliente(Cliente cliente) {
        clienteRepository.delete(cliente);
    }

    @Override
    public Cliente findByDni(Long dni){
        return clienteRepository.findByDni(dni);
    }

}
