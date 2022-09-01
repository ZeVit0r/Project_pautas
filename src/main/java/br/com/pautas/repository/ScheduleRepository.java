package br.com.pautas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pautas.model.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule, Long>{


}
