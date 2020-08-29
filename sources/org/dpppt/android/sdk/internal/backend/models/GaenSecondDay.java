package org.dpppt.android.sdk.internal.backend.models;

public class GaenSecondDay {
    public GaenKey delayedKey;
    public int fake;

    public GaenSecondDay(GaenKey gaenKey) {
        this.delayedKey = gaenKey;
        this.fake = gaenKey.fake;
    }
}
