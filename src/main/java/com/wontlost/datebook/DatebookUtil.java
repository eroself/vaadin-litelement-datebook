package com.wontlost.datebook;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DatebookUtil {

    public static LocalDateTime someTime(LocalDateTime dateTime, int hours, int minute, int second) {
        dateTime = dateTime.plus(java.time.Duration.of(hours, ChronoUnit.HOURS));
        dateTime = dateTime.plus(java.time.Duration.of(minute, ChronoUnit.MINUTES));
        dateTime = dateTime.plus(java.time.Duration.of(second, ChronoUnit.SECONDS));
        return dateTime;
    }

}
