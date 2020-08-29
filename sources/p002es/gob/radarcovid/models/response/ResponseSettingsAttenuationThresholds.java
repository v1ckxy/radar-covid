package p002es.gob.radarcovid.models.response;

import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4636f;

/* renamed from: es.gob.radarcovid.models.response.ResponseSettingsAttenuationThresholds */
public final class ResponseSettingsAttenuationThresholds {
    public final Integer low;
    public final Integer medium;

    public ResponseSettingsAttenuationThresholds() {
        this(null, null, 3, null);
    }

    public ResponseSettingsAttenuationThresholds(Integer num, Integer num2) {
        this.low = num;
        this.medium = num2;
    }

    public /* synthetic */ ResponseSettingsAttenuationThresholds(Integer num, Integer num2, int i, C4636f fVar) {
        if ((i & 1) != 0) {
            num = Integer.valueOf(50);
        }
        if ((i & 2) != 0) {
            num2 = Integer.valueOf(55);
        }
        this(num, num2);
    }

    public static /* synthetic */ ResponseSettingsAttenuationThresholds copy$default(ResponseSettingsAttenuationThresholds responseSettingsAttenuationThresholds, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = responseSettingsAttenuationThresholds.low;
        }
        if ((i & 2) != 0) {
            num2 = responseSettingsAttenuationThresholds.medium;
        }
        return responseSettingsAttenuationThresholds.copy(num, num2);
    }

    public final Integer component1() {
        return this.low;
    }

    public final Integer component2() {
        return this.medium;
    }

    public final ResponseSettingsAttenuationThresholds copy(Integer num, Integer num2) {
        return new ResponseSettingsAttenuationThresholds(num, num2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p392u.p401r.p403c.C4638h.m10272a((java.lang.Object) r2.medium, (java.lang.Object) r3.medium) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof p002es.gob.radarcovid.models.response.ResponseSettingsAttenuationThresholds
            if (r0 == 0) goto L_0x001d
            es.gob.radarcovid.models.response.ResponseSettingsAttenuationThresholds r3 = (p002es.gob.radarcovid.models.response.ResponseSettingsAttenuationThresholds) r3
            java.lang.Integer r0 = r2.low
            java.lang.Integer r1 = r3.low
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.Integer r0 = r2.medium
            java.lang.Integer r3 = r3.medium
            boolean r3 = p392u.p401r.p403c.C4638h.m10272a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p002es.gob.radarcovid.models.response.ResponseSettingsAttenuationThresholds.equals(java.lang.Object):boolean");
    }

    public final Integer getLow() {
        return this.low;
    }

    public final Integer getMedium() {
        return this.medium;
    }

    public int hashCode() {
        Integer num = this.low;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.medium;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("ResponseSettingsAttenuationThresholds(low=");
        a.append(this.low);
        a.append(", medium=");
        a.append(this.medium);
        a.append(")");
        return a.toString();
    }
}
