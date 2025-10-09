package com.jwattsuk.sample.beans;

public class LifecycleJob {

    private String jobName;
    private String jobTiming;

    public LifecycleJob() {
    }

    public LifecycleJob(String jobName, String jobTiming) {
        this.jobName = jobName;
        this.jobTiming = jobTiming;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobTiming() {
        return jobTiming;
    }

    public void setJobTiming(String jobTiming) {
        this.jobTiming = jobTiming;
    }

    @Override
    public String toString() {
        return "LifecycleJob{" +
                ", jobName='" + jobName + '\'' +
                ", jobTiming='" + jobTiming + '\'' +
                '}';
    }
}
