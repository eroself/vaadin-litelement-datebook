package com.wontlost.datebook;

import com.vaadin.flow.component.*;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;

import java.util.Optional;
import java.util.Random;

import javax.validation.constraints.NotNull;

@Tag("vaadin-datebook")
@JsModule("./vaadin-datebook.js")
public class DatebookVaadin extends Button {


    private String id;

    /**
     * id will be override to 'video' if set From.camera
     */
    public DatebookVaadin() {
        this("datebook");
    }

    /**
     * id will be override to 'video' if set From.camera
     */
    public DatebookVaadin(@NotNull String id) {
        setId(id);
    }

    @Override
    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    @Override
    public void setId(String id) {
        this.id = id;
        getElement().setProperty("id", id==null || id.length()==0? "add2calendar_"+Math.abs(new Random().nextInt()): id);
    }

    @Override
    public void setWidth(String width) {
        super.setWidth(width);
        getElement().setProperty("width", width==null ? "100%" : width);
    }

    @Override
    public void setHeight(String height) {
        super.setHeight(height);
        getElement().setProperty("height", height==null ? "100%" : height);
    }

}
