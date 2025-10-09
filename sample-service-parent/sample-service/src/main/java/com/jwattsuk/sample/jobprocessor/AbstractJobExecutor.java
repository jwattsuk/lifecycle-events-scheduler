package com.jwattsuk.sample.jobprocessor;

import com.jwattsuk.sample.beans.LifecycleJob;

public abstract class AbstractJobExecutor implements JobExecutor {

    void sendNotification(String message) {
        // Simulate sending a notification
        System.out.println("Notification: " + message);
    }
}
