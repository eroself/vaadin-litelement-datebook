package com.wontlost.datebook;

import elemental.json.JsonObject;
import elemental.json.impl.JreJsonFactory;

import java.util.Optional;

public class Alarm {

    private Action action;

    private String description;

    private String summary;

    private Duration duration;

    private Trigger trigger;

    private int repeat;

    private Attach attach;

    JsonObject getJson() {
        JsonObject alarmResult = new JreJsonFactory().createObject();
        alarmResult.put("action", Optional.of(getAction().name()).orElse(Action.DISPLAY.name()));
        alarmResult.put("description", Optional.of(getDescription()).orElse(""));
        alarmResult.put("summary", Optional.of(getSummary()).orElse(""));
        if(getDuration() != null) {
            alarmResult.put("duration", getDuration().getJson());
        }
        if(getTrigger().getDate() != null) {
            alarmResult.put("trigger", getTrigger().getDate().toString());
        } else {
            alarmResult.put("trigger", getTrigger().getDuration().getJson());
        }
        if(getRepeat() != null) {
            alarmResult.put("repeat", getRepeat());
        }

        if(getAttach()!=null) {
            alarmResult.put("attach", getAttach().getJson());
        }
        return alarmResult;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public Trigger getTrigger() {
        return trigger;
    }

    public void setTrigger(Trigger trigger) {
        this.trigger = trigger;
    }

    public Integer getRepeat() {
        return repeat;
    }

    public void setRepeat(Integer repeat) {
        this.repeat = repeat;
    }

    public Attach getAttach() {
        return attach;
    }

    public void setAttach(Attach attach) {
        this.attach = attach;
    }

}
