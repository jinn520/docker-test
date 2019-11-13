package com.gzport.dockertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerTestApplication {

    @GetMapping(value = "/test")
    public Object test() {
        return "Hello SpringBoot with Docker!";
    }

    @GetMapping(value = "/hi")
    public Object hi() {
        return "Hi! I'm chenjin";
    }

    public static void main(String[] args) {
        SpringApplication.run(DockerTestApplication.class, args);
    }

}
