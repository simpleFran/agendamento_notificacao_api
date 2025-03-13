package com.frank.agendamento_notificacao_api.business;

import org.springframework.stereotype.Service;

import com.frank.agendamento_notificacao_api.business.mapper.IAgendamentoMapper;
import com.frank.agendamento_notificacao_api.controller.dto.in.AgendamentoRecord;
import com.frank.agendamento_notificacao_api.controller.dto.out.AgendamentoRecordOut;
import com.frank.agendamento_notificacao_api.infrastructure.entities.Agendamento;
import com.frank.agendamento_notificacao_api.infrastructure.repositories.AgendamentoRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AgendamentoService {

    private final AgendamentoRepository repository;
    private final IAgendamentoMapper agendamentoMapper;

    public AgendamentoRecordOut gravarAgendamento(AgendamentoRecord agendamento) {

       //CONVERTE  DTO DE ENTRADA PARA ENTIDADE

        Agendamento agendamentoEntity = agendamentoMapper.paraEntity(agendamento);
        
        //SALVA NO BANCO

        Agendamento agendamentoSalvo = repository.save(agendamentoEntity);

        //CONVERTE A ENTIDADE SALVA PARA DTO DE SAÍDA

        return agendamentoMapper.paraOut(agendamentoSalvo);

        

    }

}
