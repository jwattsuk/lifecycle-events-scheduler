package com.jwattsuk.sample.jobprocessor;

import com.jwattsuk.sample.DbProcessor.DbProcessor;
import com.jwattsuk.sample.beans.LifecycleJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TradeProcessor {

    private final DbProcessor dbProcessor;

    @Autowired
    public TradeProcessor(DbProcessor dbProcessor) {
        this.dbProcessor = dbProcessor;
    }

    public void processTrades() {
        // Simulate trade processing logic
        System.out.println("Processing trades...");
        dbProcessor.processData();
        System.out.println("Trades processed.");
    }
}
