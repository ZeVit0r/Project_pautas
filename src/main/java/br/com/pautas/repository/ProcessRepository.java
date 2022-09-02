package br.com.pautas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pautas.model.Process;

public interface ProcessRepository extends JpaRepository<Process, Long>{


}
