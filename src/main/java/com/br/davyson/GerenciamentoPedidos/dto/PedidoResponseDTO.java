package com.br.davyson.GerenciamentoPedidos.dto;

import com.br.davyson.GerenciamentoPedidos.entitys.Comida;
import com.br.davyson.GerenciamentoPedidos.entitys.Pedido;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class PedidoResponseDTO {
    private Long id;
    private Integer mesa;
    private String nomeAtendente;
    private List<String> comidas;
    private String observacao;
    private BigDecimal subTotal;
    private BigDecimal taxaServico;
    private BigDecimal valorTotal;
    private BigDecimal valorPago;
    private BigDecimal saldoRestante;


    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime data;

    public PedidoResponseDTO(Pedido pedido) {
        this.id = pedido.getId();
        this.mesa = pedido.getMesa();
        this.nomeAtendente = pedido.getAtendente().getNome();
        this.comidas = pedido.getComidas().stream().map(Comida::getNome).toList();
        this.observacao = pedido.getObservacao();
        this.subTotal = pedido.getSubtotal();
        this.taxaServico = pedido.getTaxaServico();
        this.valorTotal = pedido.getValorTotal();
        this.valorPago = pedido.getValorPago();
        this.saldoRestante = this.valorTotal.subtract(this.valorPago).max(BigDecimal.ZERO);
        this.data = pedido.getData();
    }

    public PedidoResponseDTO(Long id, Integer mesa, String nomeAtendente, List<String> comidas, String observacao, BigDecimal taxaServico, BigDecimal valorTotal, LocalDateTime data) {
        this.id = id;
        this.mesa = mesa;
        this.nomeAtendente = nomeAtendente;
        this.comidas = comidas;
        this.observacao = observacao;
        this.taxaServico = taxaServico;
        this.valorTotal = valorTotal;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMesa() {
        return mesa;
    }

    public void setMesa(Integer mesa) {
        this.mesa = mesa;
    }

    public String getNomeAtendente() {
        return nomeAtendente;
    }

    public void setNomeAtendente(String nomeAtendente) {
        this.nomeAtendente = nomeAtendente;
    }

    public List<String> getComidas() {
        return comidas;
    }

    public void setComidas(List<String> comidas) {
        this.comidas = comidas;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public BigDecimal getTaxaServico() {
        return taxaServico;
    }

    public void setTaxaServico(BigDecimal taxaServico) {
        this.taxaServico = taxaServico;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public LocalDateTime getData() {
        return this.data;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PedidoResponseDTO that = (PedidoResponseDTO) o;
        return Objects.equals(id, that.id) && Objects.equals(mesa, that.mesa) && Objects.equals(nomeAtendente, that.nomeAtendente) && Objects.equals(comidas, that.comidas) && Objects.equals(observacao, that.observacao) && Objects.equals(taxaServico, that.taxaServico) && Objects.equals(valorTotal, that.valorTotal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mesa, nomeAtendente, comidas, observacao, taxaServico, valorTotal);
    }

    @Override
    public String toString() {
        return "PedidoResponseDTO{" +
                "id=" + id +
                ", mesa=" + mesa +
                ", nomeAtendente='" + nomeAtendente + '\'' +
                ", comidas=" + comidas +
                ", observacao='" + observacao + '\'' +
                ", taxaServico=" + taxaServico +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
