package com.br.davyson.GerenciamentoPedidos.dto.response;

import com.br.davyson.GerenciamentoPedidos.entitys.Atendente;

public class AtendenteRegisterResponse {
    private Long id;
    private String nome;
    private String email;

    public AtendenteRegisterResponse() {}

    public AtendenteRegisterResponse(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public AtendenteRegisterResponse(Atendente atendente) {
        this.id = atendente.getId();
        this.nome = atendente.getNome();
        this.email = atendente.getEmail();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
