package com.frank.agendamento_notificacao_api.controller.dto.in;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public record AgendamentoRecord(String emailDestinatario,
                                String telefoneDestinatario,
                                String mensagem,
                                @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
                                LocalDateTime dataHoraEnvio) {
}
