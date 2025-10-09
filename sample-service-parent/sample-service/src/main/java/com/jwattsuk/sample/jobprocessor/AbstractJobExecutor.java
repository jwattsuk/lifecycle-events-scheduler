package com.jwattsuk.sample.jobprocessor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractJobExecutor implements JobExecutor {

    void sendNotification(String message) {
        // Simulate sending a notification
        log.info("Notification: " + message);
    }
}
