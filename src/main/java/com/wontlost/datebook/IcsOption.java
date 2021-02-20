package com.wontlost.datebook;

import elemental.json.JsonObject;
import elemental.json.impl.JreJsonFactory;

public class IcsOption {

    private String delegatedFrom;

    private String partStat;

    private String role;

    private Boolean rsvp;

    private String sentBy;

    JsonObject getJson() {
        JsonObject icsOptionResult = new JreJsonFactory().createObject();
        if(getDelegatedFrom() != null)
            icsOptionResult.put("delegatedFrom", getDelegatedFrom());
        if(getPartStat() != null)
            icsOptionResult.put("partStat", getPartStat());
        if(getRole() != null)
            icsOptionResult.put("role", getRole());
        if(isRsvp() != null)
            icsOptionResult.put("rsvp", isRsvp());
        if(getSentBy() != null)
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

    public Boolean isRsvp() {
        return rsvp;
    }

    public void setRsvp(Boolean rsvp) {
        this.rsvp = rsvp;
    }

    public String getSentBy() {
        return sentBy;
    }

    public void setSentBy(String sentBy) {
        this.sentBy = sentBy;
    }
}
