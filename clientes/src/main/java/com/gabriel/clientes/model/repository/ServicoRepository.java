package com.gabriel.clientes.model.repository;

import com.gabriel.clientes.model.entities.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
