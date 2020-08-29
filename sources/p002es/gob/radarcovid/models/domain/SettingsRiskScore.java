package p002es.gob.radarcovid.models.domain;

import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4636f;

/* renamed from: es.gob.radarcovid.models.domain.SettingsRiskScore */
public final class SettingsRiskScore {
    public final String label;
    public final Integer maxValue;
    public final Integer minValue;

    public SettingsRiskScore() {
        this(null, null, null, 7, null);
    }

    public SettingsRiskScore(String str, Integer num, Integer num2) {
        this.label = str;
        this.minValue = num;
        this.maxValue = num2;
    }

    public /* synthetic */ SettingsRiskScore(String str, Integer num, Integer num2, int i, C4636f fVar) {
        if ((i & 1) != 0) {
            str = "LOW";
        }
        if ((i & 2) != 0) {
            num = Integer.valueOf(0);
        }
        if ((i & 4) != 0) {
            num2 = Integer.valueOf(0);
        }
        this(str, num, num2);
    }

    public static /* synthetic */ SettingsRiskScore copy$default(SettingsRiskScore settingsRiskScore, String str, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = settingsRiskScore.label;
        }
        if ((i & 2) != 0) {
            num = settingsRiskScore.minValue;
        }
        if ((i & 4) != 0) {
            num2 = settingsRiskScore.maxValue;
        }
        return settingsRiskScore.copy(str, num, num2);
    }

    public final String component1() {
        return this.label;
    }

    public final Integer component2() {
        return this.minValue;
    }

    public final Integer component3() {
        return this.maxValue;
    }

    public final SettingsRiskScore copy(String str, Integer num, Integer num2) {
        return new SettingsRiskScore(str, num, num2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (p392u.p401r.p403c.C4638h.m10272a((java.lang.Object) r2.maxValue, (java.lang.Object) r3.maxValue) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof p002es.gob.radarcovid.models.domain.SettingsRiskScore
            if (r0 == 0) goto L_0x0027
            es.gob.radarcovid.models.domain.SettingsRiskScore r3 = (p002es.gob.radarcovid.models.domain.SettingsRiskScore) r3
            java.lang.String r0 = r2.label
            java.lang.String r1 = r3.label
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.Integer r0 = r2.minValue
            java.lang.Integer r1 = r3.minValue
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.Integer r0 = r2.maxValue
            java.lang.Integer r3 = r3.maxValue
            boolean r3 = p392u.p401r.p403c.C4638h.m10272a(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p002es.gob.radarcovid.models.domain.SettingsRiskScore.equals(java.lang.Object):boolean");
    }

    public final String getLabel() {
        return this.label;
    }

    public final Integer getMaxValue() {
        return this.maxValue;
    }

    public final Integer getMinValue() {
        return this.minValue;
    }

    public int hashCode() {
        String str = this.label;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.minValue;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.maxValue;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("SettingsRiskScore(label=");
        a.append(this.label);
        a.append(", minValue=");
        a.append(this.minValue);
        a.append(", maxValue=");
        a.append(this.maxValue);
        a.append(")");
        return a.toString();
    }
}
