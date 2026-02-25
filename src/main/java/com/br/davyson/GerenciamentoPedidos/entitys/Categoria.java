package com.br.davyson.GerenciamentoPedidos.entitys;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome da categoria é obrigatório")
    @Column(unique = true)
    private String nome;


    public Categoria( String nome) {this.nome = nome;}
    public Categoria(){}

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

}
