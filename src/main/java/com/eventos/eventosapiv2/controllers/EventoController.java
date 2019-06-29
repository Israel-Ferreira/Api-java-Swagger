package com.eventos.eventosapiv2.controllers;

import com.eventos.eventosapiv2.models.Evento;
import com.eventos.eventosapiv2.services.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("eventos")
public class EventoController implements ICrudController<Evento> {
    @Autowired
    private EventoService eventoService;

    @Override
    @GetMapping
    public List<Evento> getAll() {
        return eventoService.getAll();
    }

    @Override
    @GetMapping("/{id}")
    public Evento getById(@PathVariable  Long id) {
        return eventoService.getById(id);
    }

    @Override
    @PostMapping
    public void create(@RequestBody @Valid Evento entity) {
        eventoService.create(entity);
    }

    @Override
    @PutMapping("{id}")
    public void update(@PathVariable Long id, @RequestBody @Valid Evento entity) {
        eventoService.update(id,entity);
    }

    @Override
    @DeleteMapping("/eventos/{id}")
    public void delete(@PathVariable Long id) {
        eventoService.delete(id);
    }
}

