package com.groupId;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by utkarshbodake on 10/11/16.
 */
@SpringBootApplication
public class Main1 extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Main1.class);
    }

    public static void main(String [] args) {
        SpringApplication.run(Main1.class, args);
    }
}
