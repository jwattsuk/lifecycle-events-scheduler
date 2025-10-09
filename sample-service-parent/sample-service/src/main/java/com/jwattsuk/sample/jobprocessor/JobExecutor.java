package com.jwattsuk.sample.jobprocessor;

import com.jwattsuk.sample.beans.LifecycleJob;

public interface JobExecutor {
    void executeJob(LifecycleJob lifecycleJob);
}
