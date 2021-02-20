package com.wontlost.datebook;

import com.fasterxml.jackson.annotation.JsonFormat;
import elemental.json.JsonObject;
import elemental.json.impl.JreJsonFactory;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class BasicConfig {

    private String title;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd@HH:mm:ss")
    private LocalDateTime start;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd@HH:mm:ss")
    private LocalDateTime end;

    private String location;

    private String description;

    private Recurrence recurrence;

    private List<Attendee> attendees;

    JsonObject getJson() {
        LocalDateTime date = LocalDateTime.now();
        JsonObject configResult = new JreJsonFactory().createObject();
        if(getTitle() != null)
            configResult.put("title", getTitle());
        configResult.put("start", Optional.of(getStart().toString()).orElse(date.toString()));
        configResult.put("end", Optional.of(getEnd().toString())
                .orElse(DatebookUtil.someTime(date, 1, 0, 0).toString()));
        if(getLocation() != null)
            configResult.put("location", getLocation());
        if(getDescription() != null)
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

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
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
