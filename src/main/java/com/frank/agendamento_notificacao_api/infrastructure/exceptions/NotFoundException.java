package com.frank.agendamento_notificacao_api.infrastructure.exceptions;

public class NotFoundException extends RuntimeException {

    public NotFoundException(String message){
        super(message);
    }
    
}
