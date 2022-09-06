package br.com.pautas.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pautas.model.Process;
import br.com.pautas.repository.ProcessRepository;

@Service
public class ProcessService {
    @Autowired
    private ProcessRepository processRepository;

    @Transactional
    public Process save(Process process){
        return processRepository.save(process);
    }

    public List<Process> findAll(){
        return processRepository.findAll();
    }
}
