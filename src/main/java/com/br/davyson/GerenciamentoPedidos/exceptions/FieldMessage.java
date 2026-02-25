package com.br.davyson.GerenciamentoPedidos.exceptions;

public class FieldMessage {
    private String defaultMessage;
    private String field;

    public FieldMessage(String defaultMessage, String field) {
        this.defaultMessage = defaultMessage;
        this.field = field;
    }
    public FieldMessage(){}

    public String getDefaultMessage() {
        return defaultMessage;
    }

    public void setDefaultMessage(String defaultMessage) {
        this.defaultMessage = defaultMessage;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
