package com.frank.agendamento_notificacao_api.infrastructure.entities;

import java.time.LocalDateTime;

import com.frank.agendamento_notificacao_api.infrastructure.enums.StatusNotificacaoEnum;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "agendamentos")
@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Agendamento {

    private String mensagem;
    private String telefoneDestinatario;
    private String emailDestinatario;
    private LocalDateTime dataHoraAgendamento;
    private LocalDateTime dataHoraEnvio;
    private LocalDateTime dataHoraModificacao;
    private StatusNotificacaoEnum statusNotificacao;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @PrePersist
    private void onCreate() {
        dataHoraAgendamento = LocalDateTime.now();
        statusNotificacao = StatusNotificacaoEnum.AGENDADO;
    }

}
