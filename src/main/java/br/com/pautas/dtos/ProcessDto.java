package br.com.pautas.dtos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProcessDto {
    private Integer judgmentDateId;
    private List<String> nameParties;
    private String numberProcess;
    private String nameMinister;
    private String resumeProcess;
}
