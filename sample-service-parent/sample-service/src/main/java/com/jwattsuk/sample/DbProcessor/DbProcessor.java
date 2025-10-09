package com.jwattsuk.sample.DbProcessor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DbProcessor {

    public void processData() {
        // Simulate database processing logic
        log.info("Processing data in the database...");
        // Add actual database processing code here
        log.info("Database processing complete.");
    }
}
