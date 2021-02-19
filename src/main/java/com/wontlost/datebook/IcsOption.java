package com.wontlost.datebook;

import elemental.json.JsonObject;
import elemental.json.impl.JreJsonFactory;

public class IcsOption {

    private String delegatedFrom;

    private String partStat;

    private String role;

    private boolean rsvp;

    private String sentBy;

    JsonObject getJson() {
        JsonObject icsOptionResult = new JreJsonFactory().createObject();
        icsOptionResult.put("delegatedFrom", getDelegatedFrom());
        icsOptionResult.put("partStat", getPartStat());
        icsOptionResult.put("role", getRole());
        icsOptionResult.put("rsvp", isRsvp());
        icsOptionResult.put("sentBy", getSentBy());
        return icsOptionResult;
    }

    public String getDelegatedFrom() {
        return delegatedFrom;
    }

    public void setDelegatedFrom(String delegatedFrom) {
        this.delegatedFrom = delegatedFrom;
    }

    public String getPartStat() {
        return partStat;
    }

    public void setPartStat(String partStat) {
        this.partStat = partStat;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isRsvp() {
        return rsvp;
    }

    public void setRsvp(boolean rsvp) {
        this.rsvp = rsvp;
    }

    public String getSentBy() {
        return sentBy;
    }

    public void setSentBy(String sentBy) {
        this.sentBy = sentBy;
    }
}
