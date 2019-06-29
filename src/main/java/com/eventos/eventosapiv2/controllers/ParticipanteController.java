package com.eventos.eventosapiv2.controllers;

import com.eventos.eventosapiv2.models.Participante;
import com.eventos.eventosapiv2.services.ParticipanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping(value = "/participantes")
public class ParticipanteController implements ICrudController<Participante> {

    @Autowired
    private ParticipanteService participanteService;

    @Override
    @GetMapping
    public List<Participante> getAll() {
        return participanteService.getAll();
    }

    @Override
    @GetMapping("/{id}")
    public Participante getById(@PathVariable  Long id) {
        return participanteService.getById(id);
    }

    @Override
    @PostMapping
    public void create(@RequestBody @Valid Participante entity) {
        participanteService.create(entity);
    }

    @Override
    @PutMapping("/{id}")
    public void update(@PathVariable Long id,@RequestBody @Valid Participante entity) {
        participanteService.update(id,entity);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        participanteService.delete(id);
    }
}
