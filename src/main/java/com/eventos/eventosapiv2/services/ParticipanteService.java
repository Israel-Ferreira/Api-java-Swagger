package com.eventos.eventosapiv2.services;

import com.eventos.eventosapiv2.models.Participante;
import com.eventos.eventosapiv2.repositories.ParticipanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParticipanteService implements ICrudService<Participante> {

    private final ParticipanteRepository participanteRepository;

    @Autowired
    public ParticipanteService(ParticipanteRepository participanteRepository){
        this.participanteRepository = participanteRepository;
    }


    @Override
    public List<Participante> getAll() {
        return participanteRepository.findAll();
    }

    @Override
    public Participante getById(Long id) {
        return  participanteRepository.findById(id).get();
    }

    @Override
    public void create(Participante entity) {
        participanteRepository.save(entity);
    }

    @Override
    public void update(Long id, Participante entity) {
        participanteRepository.findById(id)
                .map(participante ->  {
                    participante.setEmail(participante.getEmail());
                    participante.setEvento(entity.getEvento());
                    participante.setNome(entity.getNome());
                    return participanteRepository.save(participante);
                });
    }

    @Override
    public void delete(Long id) {
        this.participanteRepository.deleteById(id);
    }
}
