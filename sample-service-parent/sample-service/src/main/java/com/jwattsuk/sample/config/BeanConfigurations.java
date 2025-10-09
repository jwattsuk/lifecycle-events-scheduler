package com.jwattsuk.sample.config;

import com.jwattsuk.sample.beans.LifecycleJob;
import com.jwattsuk.sample.utils.LifecycleJobDetails;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

@Configuration
public class BeanConfigurations {

    @Bean
    public ExecutorService executorService() {
        return Executors.newFixedThreadPool(10);
    }

    @Bean
    public ThreadPoolTaskScheduler threadPoolTaskScheduler() {
        ThreadPoolTaskScheduler threadPoolTaskScheduler = new ThreadPoolTaskScheduler();
        threadPoolTaskScheduler.setPoolSize(10);
        threadPoolTaskScheduler.setThreadNamePrefix("LifecycleEventScheduler-");
        return threadPoolTaskScheduler;
    }

    @Bean(name = "allJobDetails")
    public Map<String, LifecycleJob> getAllJobDetails() {
        return EnumSet.allOf(LifecycleJobDetails.class).stream()
                .map(jobDetail -> new LifecycleJob(jobDetail.getJobName(), jobDetail.getJobTiming()))
                .collect(Collectors.toMap(LifecycleJob::getJobName, job -> job));
    }
}
