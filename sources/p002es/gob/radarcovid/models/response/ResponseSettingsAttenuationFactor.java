package p002es.gob.radarcovid.models.response;

import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4636f;

/* renamed from: es.gob.radarcovid.models.response.ResponseSettingsAttenuationFactor */
public final class ResponseSettingsAttenuationFactor {
    public final Float low;
    public final Float medium;

    public ResponseSettingsAttenuationFactor() {
        this(null, null, 3, null);
    }

    public ResponseSettingsAttenuationFactor(Float f, Float f2) {
        this.low = f;
        this.medium = f2;
    }

    public /* synthetic */ ResponseSettingsAttenuationFactor(Float f, Float f2, int i, C4636f fVar) {
        int i2 = i & 1;
        Float valueOf = Float.valueOf(0.0f);
        if (i2 != 0) {
            f = valueOf;
        }
        if ((i & 2) != 0) {
            f2 = valueOf;
        }
        this(f, f2);
    }

    public static /* synthetic */ ResponseSettingsAttenuationFactor copy$default(ResponseSettingsAttenuationFactor responseSettingsAttenuationFactor, Float f, Float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = responseSettingsAttenuationFactor.low;
        }
        if ((i & 2) != 0) {
            f2 = responseSettingsAttenuationFactor.medium;
        }
        return responseSettingsAttenuationFactor.copy(f, f2);
    }

    public final Float component1() {
        return this.low;
    }

    public final Float component2() {
        return this.medium;
    }

    public final ResponseSettingsAttenuationFactor copy(Float f, Float f2) {
        return new ResponseSettingsAttenuationFactor(f, f2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p392u.p401r.p403c.C4638h.m10272a((java.lang.Object) r2.medium, (java.lang.Object) r3.medium) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof p002es.gob.radarcovid.models.response.ResponseSettingsAttenuationFactor
            if (r0 == 0) goto L_0x001d
            es.gob.radarcovid.models.response.ResponseSettingsAttenuationFactor r3 = (p002es.gob.radarcovid.models.response.ResponseSettingsAttenuationFactor) r3
            java.lang.Float r0 = r2.low
            java.lang.Float r1 = r3.low
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.Float r0 = r2.medium
            java.lang.Float r3 = r3.medium
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
        throw new UnsupportedOperationException("Method not decompiled: p002es.gob.radarcovid.models.response.ResponseSettingsAttenuationFactor.equals(java.lang.Object):boolean");
    }

    public final Float getLow() {
        return this.low;
    }

    public final Float getMedium() {
        return this.medium;
    }

    public int hashCode() {
        Float f = this.low;
        int i = 0;
        int hashCode = (f != null ? f.hashCode() : 0) * 31;
        Float f2 = this.medium;
        if (f2 != null) {
            i = f2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("ResponseSettingsAttenuationFactor(low=");
        a.append(this.low);
        a.append(", medium=");
        a.append(this.medium);
        a.append(")");
        return a.toString();
    }
}
