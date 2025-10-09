package com.jwattsuk.sample.jobprocessor;

import com.jwattsuk.sample.DbProcessor.DbProcessor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class TradeProcessor {

    private final DbProcessor dbProcessor;

    @Autowired
    public TradeProcessor(DbProcessor dbProcessor) {
        this.dbProcessor = dbProcessor;
    }

    public void processTrades() {
        // Simulate trade processing logic
        log.info("Processing trades...");
        dbProcessor.processData();
        log.info("Trades processed.");
    }
}
