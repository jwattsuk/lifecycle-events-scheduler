package com.jwattsuk.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class LifecycleEventsService {
    private static final Logger LOG = LoggerFactory.getLogger(LifecycleEventsService.class);

    public static void main(String[] args) throws Exception {
        LOG.info("Starting Lifecycle Events Service with process id {}", System.getProperty("PID"));
        SpringApplication.run(LifecycleEventsService.class, args);
    }
}