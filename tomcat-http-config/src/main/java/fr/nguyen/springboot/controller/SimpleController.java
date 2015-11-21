package fr.nguyen.springboot.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tungnguyen on 21/11/2015.
 */
@RestController
public class SimpleController {

    @RequestMapping("/")
    public String home() {
        return "Hello world";
    }


}
