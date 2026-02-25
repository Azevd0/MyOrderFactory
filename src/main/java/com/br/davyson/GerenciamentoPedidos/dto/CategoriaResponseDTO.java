package com.br.davyson.GerenciamentoPedidos.dto;

import com.br.davyson.GerenciamentoPedidos.entitys.Categoria;

import java.util.Objects;

public class CategoriaResponseDTO {
    private Long id;
    private String nome;

    public CategoriaResponseDTO(){}
    public CategoriaResponseDTO(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    public CategoriaResponseDTO(Categoria categoria){
        this.id = categoria.getId();
        this.nome = categoria.getNome();
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CategoriaResponseDTO that = (CategoriaResponseDTO) o;
        return Objects.equals(id, that.id) && Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }
}
