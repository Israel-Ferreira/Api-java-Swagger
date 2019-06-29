package com.eventos.eventosapiv2.repositories;

import com.eventos.eventosapiv2.models.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento,Long> {
}
