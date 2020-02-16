package com.pablos.psfttservicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PsFttServiceDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(PsFttServiceDiscoveryApplication.class, args);
    }

}
