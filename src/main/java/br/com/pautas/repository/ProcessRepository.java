package br.com.pautas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pautas.model.Process;

@Repository
public interface ProcessRepository extends JpaRepository<Process, Long>{


}
