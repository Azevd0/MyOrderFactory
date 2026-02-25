package com.br.davyson.GerenciamentoPedidos.exceptions;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError{
    private final List<FieldMessage> fieldMessageList = new ArrayList<>();

    public ValidationError(LocalDateTime timestamp, Integer status, String mensage, String path) {
        super(timestamp, status, mensage, path);
    }

    public List<FieldMessage> getFieldMessageList() {
        return fieldMessageList;
    }

    public void addError(String defaultMessage, String field) {
        this.fieldMessageList.add(new FieldMessage(field, defaultMessage));
    }
}
