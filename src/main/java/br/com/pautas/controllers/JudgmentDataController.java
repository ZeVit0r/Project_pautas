package br.com.pautas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
import br.com.pautas.repository.JudgmentDateRepository;
import br.com.pautas.services.JudgmentDateService;

@RestController
@RequestMapping("/judgmentDate")
public class JudgmentDataController {

    final JudgmentDateService judgmentDateService;

    public JudgmentDataController(JudgmentDateService judgmentDateService){
        this.judgmentDateService = judgmentDateService;
    }

    @Autowired
    private JudgmentDateRepository judgmentDateRepository;

    @CrossOrigin
    @PostMapping
    public ResponseEntity<Object> judgmentDate(@RequestBody JudgmentDate judgmentDate){
        var teste = judgmentDateRepository.findByDate(judgmentDate.getDate());
        if(teste == null){
            return ResponseEntity.ok(judgmentDateService.save(judgmentDate));
        }

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(false);
    }

    @CrossOrigin
    @GetMapping
    public ResponseEntity<List<JudgmentDate>> judgmentDate(){
        return ResponseEntity.ok(judgmentDateRepository.findAll());
    }

    @CrossOrigin
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> judgmentDate(@PathVariable("id") Integer id){
        judgmentDateService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).body(judgmentDateService.all());
    }
}
