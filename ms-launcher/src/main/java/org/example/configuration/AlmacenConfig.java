package org.example.configuration;

import org.example.adapters.AlmacenJpaAdapter;
import org.example.ports.api.AlmacenServicePort;
import org.example.ports.spi.AlmacenPersistencePort;
import org.example.service.AlmacenServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AlmacenConfig {

    @Bean
    public AlmacenPersistencePort almacenPersistence() {
        return new AlmacenJpaAdapter();
    }

    @Bean
    public AlmacenServicePort almacenServicePort() {
        return new AlmacenServiceImpl(almacenPersistence());
    }
}
