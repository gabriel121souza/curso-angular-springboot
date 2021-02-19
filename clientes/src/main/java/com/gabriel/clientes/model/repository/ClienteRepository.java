package com.gabriel.clientes.model.repository;

import com.gabriel.clientes.model.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
