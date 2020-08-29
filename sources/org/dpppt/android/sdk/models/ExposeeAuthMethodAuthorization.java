package org.dpppt.android.sdk.models;

public class ExposeeAuthMethodAuthorization implements ExposeeAuthMethod {
    public String authorization;

    public ExposeeAuthMethodAuthorization(String str) {
        this.authorization = str;
    }

    public String getAuthorization() {
        return this.authorization;
    }
}
