package com.wontlost.datebook;

import elemental.json.JsonObject;
import elemental.json.impl.JreJsonFactory;

import java.util.Optional;

public class Attach {

    private String params;

    private String url;

    JsonObject getJson() {
        JsonObject attachResult = new JreJsonFactory().createObject();
        if(getParams() != null)
            attachResult.put("params", getParams());
        if(getUrl() != null)
            attachResult.put("url", getUrl());
        return attachResult;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
