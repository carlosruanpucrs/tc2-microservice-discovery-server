package com.carlosruanpucrs.tc2_microsservico_discovery_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Tc2MicrosservicoDiscoveryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tc2MicrosservicoDiscoveryServerApplication.class, args);
    }

}
