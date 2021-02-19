package com.wontlost.datebook;

import elemental.json.JsonObject;
import elemental.json.impl.JreJsonFactory;

public class Duration {

    private boolean after;

    private int weeks;

    private int days;

    private int hours;

    private int minutes;

    private int seconds;

    public JsonObject getJson() {
        JsonObject durationResult = new JreJsonFactory().createObject();
        durationResult.put("after", isAfter());
        durationResult.put("weeks", getWeeks());
        durationResult.put("days", getDays());
        durationResult.put("hours", getHours());
        durationResult.put("minutes", getMinutes());
        durationResult.put("seconds", getSeconds());
        return durationResult;
    }

    public boolean isAfter() {
        return after;
    }

    public void setAfter(boolean after) {
        this.after = after;
    }

    public int getWeeks() {
        return weeks;
    }

    public void setWeeks(int weeks) {
        this.weeks = weeks;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}
