package com.frank.agendamento_notificacao_api.business.mapper;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.frank.agendamento_notificacao_api.controller.dto.in.AgendamentoRecord;
import com.frank.agendamento_notificacao_api.controller.dto.out.AgendamentoRecordOut;
import com.frank.agendamento_notificacao_api.infrastructure.entities.Agendamento;

@Mapper(componentModel = SPRING)
public interface IAgendamentoMapper {

    Agendamento paraEntity(AgendamentoRecord agendamento);

    AgendamentoRecordOut paraOut(Agendamento agendamento);

    @Mapping(target = "dataHoraModificacao",expression = "java(LocalDateTime.now())")
    @Mapping(target = "statusNotificacao",expression = "java(StatusNotificacaoEnum.CANCELADO)")
    Agendamento paraEntityCancelamento(Agendamento agendamento);
}