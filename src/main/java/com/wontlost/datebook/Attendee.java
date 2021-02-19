package com.wontlost.datebook;

import elemental.json.JsonObject;
import elemental.json.impl.JreJsonFactory;

public class Attendee {

    private String name;

    private String email;

    private IcsOption icsOption;

    JsonObject getJson() {
        JsonObject attendeeResult = new JreJsonFactory().createObject();
        attendeeResult.put("name", getName());
        attendeeResult.put("email", getEmail());
        attendeeResult.put("icsOption", getIcsOption().getJson());
        return attendeeResult;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public IcsOption getIcsOption() {
        return icsOption;
    }

    public void setIcsOption(IcsOption icsOption) {
        this.icsOption = icsOption;
    }
}
