package org.dpppt.android.sdk.internal.backend.models;

public class GaenKey {
    public int fake;
    public String keyData;
    public int rollingPeriod;
    public int rollingStartNumber;
    public int transmissionRiskLevel;

    public GaenKey(String str, Integer num, Integer num2, Integer num3) {
        this(str, num, num2, num3, 0);
    }

    public GaenKey(String str, Integer num, Integer num2, Integer num3, int i) {
        this.keyData = str;
        this.rollingStartNumber = num.intValue();
        this.rollingPeriod = num2.intValue();
        this.transmissionRiskLevel = num3.intValue();
        this.fake = i;
    }

    public String getKeyData() {
        return this.keyData;
    }

    public Integer getRollingPeriod() {
        return Integer.valueOf(this.rollingPeriod);
    }

    public Integer getRollingStartNumber() {
        return Integer.valueOf(this.rollingStartNumber);
    }

    public Integer getTransmissionRiskLevel() {
        return Integer.valueOf(this.transmissionRiskLevel);
    }

    public boolean isFake() {
        return this.fake == 1;
    }
}
