package fr.nguyen.springboot.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

    final Logger logger = LogManager.getLogger(SimpleController.class);

    @RequestMapping("/")
    public String home() {
        logger.debug("Hello world");
        return "Hello world";
    }


}
