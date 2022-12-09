package com.example.vphoto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@Profile("dev")
public class VphotoApplication {

    public static void main(String[] args) {
        SpringApplication.run(VphotoApplication.class, args);
    }

}
