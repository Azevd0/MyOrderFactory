package com.br.davyson.GerenciamentoPedidos.dto;

import com.br.davyson.GerenciamentoPedidos.entitys.Recibo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class ReciboResponseDTO {
    private Long id;
    private LocalDateTime dataFechamento;
    private BigDecimal valorTotal;
    private String formaPagamento;

    public ReciboResponseDTO(Recibo recibo) {
        this.id = recibo.getId();
        this.dataFechamento = recibo.getDataFechamento();
        this.valorTotal = recibo.getValorTotal();

        if (recibo.getFormaPagamento() != null) {
            this.formaPagamento = recibo.getFormaPagamento().name();
        }
    }


    public Long getId() { return id; }
    public LocalDateTime getDataFechamento() { return dataFechamento; }
    public BigDecimal getValorTotal() { return valorTotal; }
    public String getFormaPagamento() { return formaPagamento; }

    public void setId(Long id) { this.id = id; }
    public void setDataFechamento(LocalDateTime dataFechamento) { this.dataFechamento = dataFechamento; }
    public void setValorTotal(BigDecimal valorTotal) { this.valorTotal = valorTotal; }
    public void setFormaPagamento(String formaPagamento) { this.formaPagamento = formaPagamento; }


}
