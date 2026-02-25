package com.br.davyson.GerenciamentoPedidos.dto;
import java.util.List;

public record PedidoRequestDTO(Integer numeroMesa, List<String> nomesComidas, String observacao){}
