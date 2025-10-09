package com.jwattsuk.sample.services;

import com.jwattsuk.sample.beans.LifecycleJob;
import com.jwattsuk.sample.jobprocessor.JobExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class LifecycleJobsScheduler {

    // Potentially, you could have multiple executors for different job types
    private final JobExecutor indexSpecificJobExecutor;

    @Autowired
    Map<String, LifecycleJob> allJobDetails;

    @Autowired
    public LifecycleJobsScheduler(JobExecutor indexSpecificJobExecutor) {
        this.indexSpecificJobExecutor = indexSpecificJobExecutor;
    }

    @Scheduled(cron = "#{@allJobDetails.get('job1').getJobTiming()}")
    public void scheduleJob1() {
        indexSpecificJobExecutor.executeJob(allJobDetails.get("job1"));
    }

    @Scheduled(cron = "#{@allJobDetails.get('job2').getJobTiming()}")
    public void scheduleJob2() {
        indexSpecificJobExecutor.executeJob(allJobDetails.get("job2"));
    }

    @Scheduled(cron = "#{@allJobDetails.get('job3').getJobTiming()}")
    public void scheduleJob3() {
        indexSpecificJobExecutor.executeJob(allJobDetails.get("job2"));
    }
}
