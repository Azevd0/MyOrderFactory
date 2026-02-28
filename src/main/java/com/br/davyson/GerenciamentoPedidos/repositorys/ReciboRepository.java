package com.br.davyson.GerenciamentoPedidos.repositorys;

import com.br.davyson.GerenciamentoPedidos.entitys.Recibo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ReciboRepository extends JpaRepository<Recibo, Long> {
    List<Recibo> findByDataFechamentoAfter(LocalDateTime data);
}
