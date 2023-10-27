package com.curso.app.controller;

import com.curso.app.model.Cliente;
import com.curso.app.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping("/")
    public List<Cliente> listarClientes(){
        return clienteService.findAll();
    }

    @GetMapping("/{id}")
    public Cliente getClienteById(@PathVariable Long id){
        return clienteService.findById(id);
    }

    @GetMapping("/{dni}")
    public Cliente findClienteByDni(@PathVariable Long dni){
        return clienteService.findByDni(dni);
    }

    @PostMapping
    public Cliente crearCliente(@RequestBody Cliente cliente){
        return clienteService.save(cliente);
    }

    @PutMapping
    public Cliente actualizarCliente(@RequestBody Cliente cliente){
        return clienteService.save(cliente);
    }

    @DeleteMapping("/{id}")
    public void eliminarCliente(@PathVariable Long id){
        Cliente cliente = new Cliente();
        cliente.setId(id);
        clienteService.deleteCliente(cliente);
    }

}
