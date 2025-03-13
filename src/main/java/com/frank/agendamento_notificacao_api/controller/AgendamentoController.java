package com.frank.agendamento_notificacao_api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frank.agendamento_notificacao_api.business.AgendamentoService;
import com.frank.agendamento_notificacao_api.controller.dto.in.AgendamentoRecord;
import com.frank.agendamento_notificacao_api.controller.dto.out.AgendamentoRecordOut;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/agendamento")
public class AgendamentoController {

    private AgendamentoService agendamentoService;

    @PostMapping
    public ResponseEntity<AgendamentoRecordOut> gravarAgendamento(@RequestBody AgendamentoRecord agendamento) {

        return ResponseEntity.ok(agendamentoService.gravarAgendamento(agendamento));

    }
}
