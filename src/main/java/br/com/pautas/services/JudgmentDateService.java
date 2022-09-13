package br.com.pautas.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pautas.model.JudgmentDate;
import br.com.pautas.repository.JudgmentDateRepository;

@Service
public class JudgmentDateService {

    @Autowired
    private JudgmentDateRepository judgmentDateRepository;
    
    public Optional<JudgmentDate> findById(Integer id){
        return judgmentDateRepository.findById(id);
    }

    @Transactional
    public JudgmentDate save(JudgmentDate judgmentDate){

        return judgmentDateRepository.save(judgmentDate);
 
    }

    public List<JudgmentDate> all(){
        return judgmentDateRepository.findAll();
    }

    @Transactional
    public void delete(Integer id){
        judgmentDateRepository.deleteById(id);
    }
}
