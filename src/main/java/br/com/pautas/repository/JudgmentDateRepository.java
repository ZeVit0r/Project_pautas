package br.com.pautas.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pautas.model.JudgmentDate;

@Repository
public interface JudgmentDateRepository extends JpaRepository<JudgmentDate, Integer>{


}
