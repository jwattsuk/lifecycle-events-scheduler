package com.jwattsuk.sample.jobprocessor;

import com.jwattsuk.sample.beans.LifecycleJob;
import org.springframework.stereotype.Component;

@Component
public class IndexSpecificJobExecutor extends AbstractJobExecutor {
    private final TradeProcessor tradeProcessor;

    IndexSpecificJobExecutor(TradeProcessor tradeProcessor) {
        super();
        this.tradeProcessor = tradeProcessor;
    }

    @Override
    public void executeJob(LifecycleJob lifecycleJob) {
        // Simulate job execution
        System.out.println("Executing job: " + lifecycleJob.getJobName());
        tradeProcessor.processTrades();
        // After execution, send a notification
        sendNotification("Job " + lifecycleJob.getJobName() + " executed successfully.");
    }
}
