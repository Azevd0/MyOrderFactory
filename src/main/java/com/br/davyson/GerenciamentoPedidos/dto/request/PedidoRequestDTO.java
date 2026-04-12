package com.br.davyson.GerenciamentoPedidos.dto.request;
import java.util.List;

public record PedidoRequestDTO(Integer numeroMesa, List<String> nomesComidas, String observacao){}
