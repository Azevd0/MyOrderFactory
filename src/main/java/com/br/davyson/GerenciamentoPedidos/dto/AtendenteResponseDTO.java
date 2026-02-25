package com.br.davyson.GerenciamentoPedidos.dto;

import com.br.davyson.GerenciamentoPedidos.entitys.Atendente;

import java.util.Objects;

public class AtendenteResponseDTO {

    private Long id;
    private String nome;

    public AtendenteResponseDTO() {
    }
    public AtendenteResponseDTO(Atendente atendente) {
        this.id = atendente.getId();
        this.nome = atendente.getNome();
    }

    public AtendenteResponseDTO(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AtendenteResponseDTO that = (AtendenteResponseDTO) o;
        return Objects.equals(id, that.id) && Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    @Override
    public String toString() {
        return "AtendenteResponseDTO{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
