package com.wontlost.datebook;

import elemental.json.Json;
import elemental.json.JsonObject;
import elemental.json.impl.JreJsonFactory;

import java.util.Date;
import java.util.List;

public class BasicConfig {

    private String title;

    private Date start;

    private Date end;

    private String location;

    private String description;

    private Recurrence recurrence;

    private List<Attendee> attendees;

    JsonObject getJson() {
        JsonObject configResult = new JreJsonFactory().createObject();
        configResult.put("title", getTitle());
        configResult.put("start", getStart().toString());
        configResult.put("end", getEnd().toString());
        configResult.put("location", getLocation());
        configResult.put("description", getDescription());
//        configResult.put("recurrence", /*recurrence.getJson()*/Json.createObject());
//        configResult.put("attendees", Json.createArray().);
        return configResult;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Recurrence getRecurrence() {
        return recurrence;
    }

    public void setRecurrence(Recurrence recurrence) {
        this.recurrence = recurrence;
    }

    public List<Attendee> getAttendees() {
        return attendees;
    }

    public void setAttendees(List<Attendee> attendees) {
        this.attendees = attendees;
    }
}
