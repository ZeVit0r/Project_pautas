package br.com.pautas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pautas.repository.ProcessRepository;

@RestController
@RequestMapping("/process")
public class ProcessController {
    
    @Autowired
    private ProcessRepository processRepository;

    @PostMapping("/")
    public ResponseEntity<Process> process(@RequestBody Process process){

        return null;

    }
}
