package com.jwattsuk.sample.utils;

import lombok.Getter;

@Getter
public enum LifecycleJobDetails {
    JOB1("job1", "*/10 * * * * *"), // every 10 seconds
    JOB2("job2", "*/30 * * * * *"), // every 30 seconds
    JOB3("job3", "0 * * * * *"); // every minute

    private final String jobName;
    private final String jobTiming;

    LifecycleJobDetails(String jobName, String jobTiming) {
        this.jobName = jobName;
        this.jobTiming = jobTiming;
    }

}
