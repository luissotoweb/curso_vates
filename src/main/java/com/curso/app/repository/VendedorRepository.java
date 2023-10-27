package com.curso.app.repository;

import com.curso.app.model.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Clase que se encarga de realizar las
 * operaciones sobre Vendedor en la base de datos.
 */
@Repository
public interface VendedorRepository extends JpaRepository<Vendedor, Long> {

}
