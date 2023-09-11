package com.javawhizz.App.customer;

public class Endpoint {

    private String slack_name;

    private String currentDay;

    private String utcTime;

    private String track;

    private String githubFileUrl;

    private String githubRepoUrl;

    private int statusCode;

    public String getSlack_name() {
        return slack_name;
    }

    public void setSlack_name(String slack_name) {
        this.slack_name = slack_name;
    }

    public String getCurrentDay() {
        return currentDay;
    }

    public void setCurrentDay(String currentDay) {
        this.currentDay = currentDay;
    }

    public String getUtcTime() {
        return utcTime;
    }

    public void setUtcTime(String utcTime) {
        this.utcTime = utcTime;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public String getGithubFileUrl() {
        return githubFileUrl;
    }

    public void setGithubFileUrl(String githubFileUrl) {
        this.githubFileUrl = githubFileUrl;
    }

    public String getGithubRepoUrl() {
        return githubRepoUrl;
    }

    public void setGithubRepoUrl(String githubRepoUrl) {
        this.githubRepoUrl = githubRepoUrl;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public Endpoint(String slack_name, String currentDay, String utcTime, String track, String githubFileUrl, String githubRepoUrl, int statusCode) {
        this.slack_name = slack_name;
        this.currentDay = currentDay;
        this.utcTime = utcTime;
        this.track = track;
        this.githubFileUrl = githubFileUrl;
        this.githubRepoUrl = githubRepoUrl;
        this.statusCode = statusCode;


    }

    public Endpoint() {
    }
}
