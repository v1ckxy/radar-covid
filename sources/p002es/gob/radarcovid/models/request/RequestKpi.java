package p002es.gob.radarcovid.models.request;

import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;

/* renamed from: es.gob.radarcovid.models.request.RequestKpi */
public final class RequestKpi {
    public static final String ATTENUATION_DURATIONS_1 = "ATTENUATION_DURATIONS_1";
    public static final String ATTENUATION_DURATIONS_2 = "ATTENUATION_DURATIONS_2";
    public static final String ATTENUATION_DURATIONS_3 = "ATTENUATION_DURATIONS_3";
    public static final String BLUETOOTH_ACTIVATED = "BLUETOOTH_ACTIVATED";
    public static final Companion Companion = new Companion(null);
    public static final String DAYS_SINCE_LAST_EXPOSURE = "DAYS_SINCE_LAST_EXPOSURE";
    public static final String MATCHED_KEY_COUNT = "MATCHED_KEY_COUNT";
    public static final String MATCH_CONFIRMED = "MATCH_CONFIRMED";
    public static final String MAXIMUM_RISK_SCORE = "MAXIMUM_RISK_SCORE";
    public static final String SUMMATION_RISK_SCORE = "SUMMATION_RISK_SCORE";
    public final String kpi;
    public final String timestamp;
    public final int value;

    /* renamed from: es.gob.radarcovid.models.request.RequestKpi$Companion */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C4636f fVar) {
            this();
        }
    }

    public RequestKpi(String str, String str2, int i) {
        if (str == null) {
            C4638h.m10271a("kpi");
            throw null;
        } else if (str2 != null) {
            this.kpi = str;
            this.timestamp = str2;
            this.value = i;
        } else {
            C4638h.m10271a("timestamp");
            throw null;
        }
    }

    public static /* synthetic */ RequestKpi copy$default(RequestKpi requestKpi, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = requestKpi.kpi;
        }
        if ((i2 & 2) != 0) {
            str2 = requestKpi.timestamp;
        }
        if ((i2 & 4) != 0) {
            i = requestKpi.value;
        }
        return requestKpi.copy(str, str2, i);
    }

    public final String component1() {
        return this.kpi;
    }

    public final String component2() {
        return this.timestamp;
    }

    public final int component3() {
        return this.value;
    }

    public final RequestKpi copy(String str, String str2, int i) {
        if (str == null) {
            C4638h.m10271a("kpi");
            throw null;
        } else if (str2 != null) {
            return new RequestKpi(str, str2, i);
        } else {
            C4638h.m10271a("timestamp");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (r2.value == r3.value) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0025
            boolean r0 = r3 instanceof p002es.gob.radarcovid.models.request.RequestKpi
            if (r0 == 0) goto L_0x0023
            es.gob.radarcovid.models.request.RequestKpi r3 = (p002es.gob.radarcovid.models.request.RequestKpi) r3
            java.lang.String r0 = r2.kpi
            java.lang.String r1 = r3.kpi
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = r2.timestamp
            java.lang.String r1 = r3.timestamp
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x0023
            int r0 = r2.value
            int r3 = r3.value
            if (r0 != r3) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r3 = 0
            return r3
        L_0x0025:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p002es.gob.radarcovid.models.request.RequestKpi.equals(java.lang.Object):boolean");
    }

    public final String getKpi() {
        return this.kpi;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.kpi;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.timestamp;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + this.value;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("RequestKpi(kpi=");
        a.append(this.kpi);
        a.append(", timestamp=");
        a.append(this.timestamp);
        a.append(", value=");
        return C1965a.m4753a(a, this.value, ")");
    }
}
