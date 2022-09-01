package br.com.pautas.model;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "judgmentDate")
public class JudgmentDate {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    // @ElementCollection
    // private User user;
    private String date;

}
