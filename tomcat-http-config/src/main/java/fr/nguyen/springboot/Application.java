package fr.nguyen.springboot;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by tungnguyen on 21/11/2015.
 */
@SpringBootApplication
@PropertySource("classpath:server.properties")
public class Application {

    static final Logger logger = LogManager.getLogger(Application.class);

    public static void main(String[] args) {
        logger.debug("Start application");
        SpringApplication.run(Application.class, args);
    }
}
