package com.eventos.eventosapiv2.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;


@Data
@Entity
public class Participante {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    @Email
    private String email;

    @ManyToOne
    @JoinColumn(name = "evento_id")
    private Evento evento;
}
