package com.eventos.eventosapiv2.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Data
@Entity
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    private String endereco;

    private int qtdeParticipantes;


    @OneToMany(targetEntity = Participante.class,fetch = FetchType.LAZY)
    private List<Participante> participantes;


    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate data;

    private boolean isLotado;
}
