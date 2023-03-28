package com.gaucimaistre.rssthenews.infrastructure;

import com.gaucimaistre.rssthenews.model.User;
import com.gaucimaistre.rssthenews.repository.RssFeedRepository;
import com.gaucimaistre.rssthenews.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.GrantedAuthority;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(UserRepository userRepository, RssFeedRepository rssFeedRepository) {
        return args -> {
            log.info("Preloading " + userRepository.save(new User("test", "test@test.com", )));
            log.info("Preloading " + userRepository.save(new User("test", "test@test.com", )));
        };
    }
}