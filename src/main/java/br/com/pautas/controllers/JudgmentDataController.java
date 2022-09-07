package br.com.pautas.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pautas.model.JudgmentDate;
import br.com.pautas.services.JudgmentDateService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/judgmentDate")
public class JudgmentDataController {

    final JudgmentDateService judgmentDateService;

    public JudgmentDataController(JudgmentDateService judgmentDateService){
        this.judgmentDateService = judgmentDateService;
    }

    @PostMapping
    public ResponseEntity<JudgmentDate> judgmentDate(@RequestBody JudgmentDate judgmentDate){
        return ResponseEntity.ok(judgmentDateService.save(judgmentDate));
    }

    @GetMapping
    public ResponseEntity<List<JudgmentDate>> judgmentDate(){
        return ResponseEntity.ok(judgmentDateService.all());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> judgmentDate(@PathVariable("id") Integer id){
        judgmentDateService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).body(judgmentDateService.all());
    }
}
