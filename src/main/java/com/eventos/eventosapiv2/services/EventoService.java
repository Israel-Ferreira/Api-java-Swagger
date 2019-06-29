package com.eventos.eventosapiv2.services;

import com.eventos.eventosapiv2.models.Evento;
import com.eventos.eventosapiv2.repositories.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoService implements ICrudService<Evento> {

    private final EventoRepository eventoRepository;

    @Autowired
    public EventoService(EventoRepository eventoRepository){
        this.eventoRepository = eventoRepository;
    }


    @Override
    public List<Evento> getAll() {
        return eventoRepository.findAll();
    }

    @Override
    public Evento getById(Long id) {
        return eventoRepository.findById(id).get();
    }

    @Override
    public void create(Evento entity) {
        this.eventoRepository.save(entity);
    }

    @Override
    public void update(Long id, Evento entity) {
        eventoRepository.findById(id)
                .map(evento -> {
                    evento.setNome(entity.getNome());
                    evento.setEndereco(entity.getEndereco());
                    evento.setData(entity.getData());
                    evento.setQtdeParticipantes(entity.getQtdeParticipantes());
                    evento.setParticipantes(entity.getParticipantes());
                    return eventoRepository.save(evento);
                });
    }

    @Override
    public void delete(Long id) {
        eventoRepository.deleteById(id);
    }
}
