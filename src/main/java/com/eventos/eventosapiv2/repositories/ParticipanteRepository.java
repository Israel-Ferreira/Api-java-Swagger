package com.eventos.eventosapiv2.repositories;

import com.eventos.eventosapiv2.models.Participante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipanteRepository extends JpaRepository<Participante,Long> {
}
