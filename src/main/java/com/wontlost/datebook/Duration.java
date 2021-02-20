package com.wontlost.datebook;

import elemental.json.JsonObject;
import elemental.json.impl.JreJsonFactory;

public class Duration {

    private Boolean after;

    private Integer weeks;

    private Integer days;

    private Integer hours;

    private Integer minutes;

    private Integer seconds;

    public JsonObject getJson() {
        JsonObject durationResult = new JreJsonFactory().createObject();
        if(isAfter() != null)
            durationResult.put("after", isAfter());
        if(getWeeks() != null)
            durationResult.put("weeks", getWeeks());
        if(getDays() != null)
            durationResult.put("days", getDays());
        if(getHours() != null)
            durationResult.put("hours", getHours());
        if(getMinutes() != null)
            durationResult.put("minutes", getMinutes());
        if(getSeconds() != null)
            durationResult.put("seconds", getSeconds());
        return durationResult;
    }

    public Boolean isAfter() {
        return after;
    }

    public void setAfter(Boolean after) {
        this.after = after;
    }

    public Integer getWeeks() {
        return weeks;
    }

    public void setWeeks(Integer weeks) {
        this.weeks = weeks;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public Integer getSeconds() {
        return seconds;
    }

    public void setSeconds(Integer seconds) {
        this.seconds = seconds;
    }
}
