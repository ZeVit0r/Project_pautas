package br.com.pautas.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pautas.dtos.ProcessDto;
import br.com.pautas.model.JudgmentDate;
import br.com.pautas.model.Process;
import br.com.pautas.services.JudgmentDateService;
import br.com.pautas.services.ProcessService;

@RestController
@RequestMapping("/process")
public class ProcessController {

    final ProcessService processService;
    final JudgmentDateService judgmentDateService;

    public ProcessController(ProcessService processService, JudgmentDateService judgmentDateService){
        this.processService = processService;
        this.judgmentDateService = judgmentDateService;
    }

    @PostMapping("/")
    public ResponseEntity<Object> process(@RequestBody ProcessDto processDto){

        Process process = new Process();
        var judgmentDate = new JudgmentDate();
       
        BeanUtils.copyProperties(processDto, process);

        Optional<JudgmentDate> judgment = judgmentDateService.findById(processDto.getJudgmentDateId());
        
        BeanUtils.copyProperties(judgment.get(), judgmentDate);

        process.setJudgmentDate(judgmentDate);
        
        return ResponseEntity.status(HttpStatus.OK).body(processService.save(process));
        
        // if(judgment.isPresent()){
        //     process.setJudgmentDate(judgmentDate);
        //     return ResponseEntity.status(HttpStatus.OK).body(processService.save(process));
        // } else {
        //     return ResponseEntity.status(HttpStatus.NOT_FOUND).body("judgment date not found.");
        // }

    }

    @GetMapping("/")
    public ResponseEntity<List<Process>> process(){
        return ResponseEntity.status(HttpStatus.OK).body(processService.findAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Process> process(@PathVariable("id") Long id, @RequestBody ProcessDto processDto) {

        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Process> process(@PathVariable("id") Long id) {

        return null;
    }
}
