package org.dpppt.android.sdk.models;

public class ExposeeAuthMethodJson implements ExposeeAuthMethod {
    public String value;

    public ExposeeAuthMethodJson(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
