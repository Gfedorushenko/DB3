package ru.netology.db3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.db3.repository.Repository;

@Configuration
public class JavaConfig {
    @Bean
    public Repository repository() {
        return new Repository();
    }
}
