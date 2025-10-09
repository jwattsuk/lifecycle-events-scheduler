package com.jwattsuk.sample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Slf4j
@SpringBootApplication(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
@EnableScheduling
public class LifecycleEventsService {
    public static void main(String[] args) throws Exception {
        log.info("Starting Lifecycle Events Service with process id {}", System.getProperty("PID"));
        SpringApplication.run(LifecycleEventsService.class, args);
    }
}