package org.matt.sandbox.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class NUmberPrinterRestApp {

    public static void main(String [] args) {
        ApplicationContext ctx = SpringApplication.run(NUmberPrinterRestApp.class, args);

    }
}
