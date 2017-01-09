package org.digitalsandpit.garden;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class Bootstrap {

    public static void main (String args[]) {
        SpringApplication.run(Bootstrap.class, args);
    }
}
