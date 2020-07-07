package com.nicholasnkk.test.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Feature {

    private final String featureName;
    private final String email;
    private final boolean enable;

    public Feature(@JsonProperty("featureName") String featureName,
                   @JsonProperty("email") String email,
                   @JsonProperty("enable") boolean enable) {
        this.featureName = featureName;
        this.email = email;
        this.enable = enable;
    }

    public String getFeatureName() {
        return featureName;
    }

    public String getEmail() {
        return email;
    }

    public boolean isEnable() {
        return enable;
    }
}
