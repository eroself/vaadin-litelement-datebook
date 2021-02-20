package com.wontlost.datebook;

import com.vaadin.flow.component.*;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;

import javax.validation.constraints.NotNull;
import java.util.Optional;

@Tag("vaadin-datebook")
@JsModule("./vaadin-datebook.js")
public class DatebookVaadin extends Button {

    public DatebookVaadin() {
        setId("datebook");
        setText("Add to calendar");
    }

    public DatebookVaadin(@NotNull String text) {
        setId("datebook");
        setText(text);
    }

    @Override
    public void setText(String text) {
        super.setText(text);
        getElement().setProperty("buttonText", Optional.of(text).orElse("Add to calendar"));
    }

    public void setCalendarOptions(BasicConfig config) {
        getElement().setPropertyJson("calendarOptions", config==null?new BasicConfig().getJson():config.getJson());
    }

    public void setCalendarAlarm(Alarm alarm) {
        getElement().setPropertyJson("calendarAlarm", alarm==null?new Alarm().getJson():alarm.getJson());
    }

}
