package com.br.davyson.GerenciamentoPedidos.exceptions;

import java.time.LocalDateTime;

public class StandardError {
    private LocalDateTime timestamp;
    private Integer status;
    private String message;
    private String path;

    public StandardError(LocalDateTime timestamp, Integer status, String mensage, String path) {
        this.timestamp = timestamp;
        this.status = status;
        this.message = mensage;
        this.path = path;
    }
    public StandardError(){}

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMensage() {
        return message;
    }

    public void setMensage(String mensage) {
        this.message = mensage;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
