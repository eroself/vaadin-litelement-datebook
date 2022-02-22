package com.wontlost.datebook;

import com.vaadin.flow.component.*;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

import javax.validation.constraints.NotNull;

@Tag("vaadin-datebook")
@JsModule("./vaadin-datebook.js")
@NpmPackage(value = "datebook", version = "^7.0.8")
public class DatebookVaadin extends Button {

    public DatebookVaadin() {
        setId("datebook");
        setText("Add to calendar");
    }

    public DatebookVaadin(@NotNull String text) {
        setId("datebook");
        setText(text);
    }

    public void setCalendarOptions(BasicConfig config) {
        getElement().setPropertyJson("calendarOptions", config==null?new BasicConfig().getJson():config.getJson());
    }

    public void setCalendarAlarm(Alarm alarm) {
        getElement().setPropertyJson("calendarAlarm", alarm==null?new Alarm().getJson():alarm.getJson());
    }

}
