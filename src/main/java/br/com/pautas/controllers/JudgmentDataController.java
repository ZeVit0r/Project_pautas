package br.com.pautas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pautas.model.JudgmentDate;
import br.com.pautas.repository.JudgmentDateRepository;

@RestController
@RequestMapping("/judgment")
public class JudgmentDataController {

    @Autowired
    private JudgmentDateRepository judgmentDateRepository;

    @PostMapping("/")
    public ResponseEntity<JudgmentDate> judgmentDate(@RequestBody JudgmentDate judgmentDateDATA){

        JudgmentDate judgmentDate = new JudgmentDate();
        judgmentDate.setDate(judgmentDateDATA.getDate());
        judgmentDate.setSessionName(judgmentDateDATA.getSessionName());

        return ResponseEntity.ok(judgmentDateRepository.save(judgmentDate));
    }
}
