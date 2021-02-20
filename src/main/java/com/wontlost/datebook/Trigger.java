package com.wontlost.datebook;

import java.time.LocalDateTime;

public class Trigger {

    private Duration duration;

    private LocalDateTime date;

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
