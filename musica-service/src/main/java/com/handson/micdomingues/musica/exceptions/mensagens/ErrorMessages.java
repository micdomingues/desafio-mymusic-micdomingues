package com.handson.micdomingues.musica.exceptions.mensagens;

public enum ErrorMessages {

    MINIMO_CARACATERES_NAO_ATINGIDO("validacoes.limite_minimo_nao_atingido");

    private String value;

    ErrorMessages(String messagem) {
        this.value = messagem;
    }

    public String getValue() {
        return value;
    }
}
