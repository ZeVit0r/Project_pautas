package br.com.pautas.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pautas.model.Schedule;
import br.com.pautas.repository.ScheduleRepository;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {

    @Autowired
    private ScheduleRepository scheduleRepository;

    @PostMapping("/")
    public ResponseEntity<Schedule> schedule(@RequestBody Schedule schedule) {
        return ResponseEntity.ok(scheduleRepository.save(schedule));
    }

    @GetMapping("/")
    public ResponseEntity<List<Schedule>> schedule(){
        return ResponseEntity.ok(scheduleRepository.findAll());
    }

    @GetMapping("/{id}")
    public Schedule schedule(@PathVariable("id") Long id) {
        Optional<Schedule> scheduleFind = this.scheduleRepository.findById(id);

        if(scheduleFind.isPresent()){
            return scheduleFind.get();
        }
        
        return null;
    }
}
