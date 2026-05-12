package com.br.davyson.GerenciamentoPedidos;

import com.br.davyson.GerenciamentoPedidos.dto.response.FaturamentoResponseDTO;
import com.br.davyson.GerenciamentoPedidos.dto.response.PedidoResponseDTO;
import com.br.davyson.GerenciamentoPedidos.wrapper.ListWrapper;
import jakarta.annotation.PostConstruct;
import org.springframework.aot.hint.annotation.RegisterReflectionForBinding;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import java.util.ArrayList;
import java.util.TimeZone;

@SpringBootApplication
@EnableCaching
@RegisterReflectionForBinding({
        FaturamentoResponseDTO.class,
        PedidoResponseDTO.class,
        ListWrapper.class,
        ArrayList.class
})
public class OrderFactoryApplication {

    @PostConstruct
    public void init() {
        TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"));
    }

	public static void main(String[] args) {
		SpringApplication.run(OrderFactoryApplication.class, args);
	}

}
