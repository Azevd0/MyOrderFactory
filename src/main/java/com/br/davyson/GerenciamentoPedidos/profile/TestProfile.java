package com.br.davyson.GerenciamentoPedidos.profile;

import com.br.davyson.GerenciamentoPedidos.database.DbMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestProfile {

    @Autowired
    public DbMenu dbMenu;

    @Bean
    public CommandLineRunner instanciarMenu() {
        return args -> {
            dbMenu.instanciarMenu();
        };
    }
}
