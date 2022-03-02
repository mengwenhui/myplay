package com.allan.play.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication application = new SpringApplication(DemoApplication.class);
        application.run(args);

//        SpringApplication.run
//                (DemoApplication.class, args);
    }

    @RequestMapping("/")
    public String home() {
        return "Haa World!";
    }

    @GetMapping("/account")
    public String account() {
        return "my accoutn";
    }
}
