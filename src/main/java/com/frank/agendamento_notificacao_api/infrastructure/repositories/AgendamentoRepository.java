package com.frank.agendamento_notificacao_api.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.frank.agendamento_notificacao_api.infrastructure.entities.Agendamento;


public interface AgendamentoRepository extends JpaRepository<Agendamento,Long> {
    
}
