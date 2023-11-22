package com.web.icare.SpringWeb;

import com.web.icare.SpringWeb.models.Administrador;
import com.web.icare.SpringWeb.repositorio.AdministradoresRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringWebApplication.class, args);
    }

    @Bean
    public CommandLineRunner inicializarDados(AdministradoresRepo administradoresRepo) {
        return args -> {
            // Verifica se não existem administradores no banco de dados
            if (administradoresRepo.count() == 0) {
                // Cria um usuário padrão
                Administrador administradorPadrao = new Administrador("Pedro Félix", "pedro@email.com", "123456", "Administrador");

                // Salva o usuário no banco de dados
                administradoresRepo.save(administradorPadrao);
            }
        };
    }
}
