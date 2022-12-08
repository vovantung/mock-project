package com.example.mockproject;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@Log
@SpringBootApplication
public class MockProjectApplication {
    @Value("${test}")
    private String urlCallApiUser;

    public static void main(String[] args) {
        SpringApplication.run(MockProjectApplication.class, args);
//        SpringApplication app = new SpringApplication(MovieApplication.class);
//        app.setDefaultProperties(Collections.singletonMap("server.port", "8083"));
//        app.run(args);
    }

    @Bean
    ApplicationRunner applicationRunner(Environment environment) {
        return args -> {
            log.info("url: " + urlCallApiUser);

        };
    }

}
