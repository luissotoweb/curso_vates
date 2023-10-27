package com.curso.app.controller;

import com.curso.app.model.Vendedor;
import com.curso.app.service.VendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendedores")
public class VendedorController {
    //get, put, post, update, delete, patch
    @Autowired
    VendedorService vendedorService;

    @GetMapping("/")
    public List<Vendedor> listarVendedores(){
        return vendedorService.findAll();
    }

    @GetMapping("/{id}")
    public Vendedor getById(@PathVariable Long id){
        return vendedorService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteVendedor(@PathVariable Long id){
        vendedorService.delete(id);
    }

    @PostMapping
    public Vendedor crearVendedor(@RequestBody Vendedor vendedor){
        return vendedorService.save(vendedor);
    }

    @PatchMapping
    public Vendedor actualizarVendedor(@RequestBody Vendedor vendedor){
        return vendedorService.update(vendedor);
    }
}
