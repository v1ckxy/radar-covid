package p002es.gob.radarcovid.models.response;

import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4636f;

/* renamed from: es.gob.radarcovid.models.response.ResponseSettingsAppVersionItem */
public final class ResponseSettingsAppVersionItem {
    public final Integer compilation;
    public final String version;

    public ResponseSettingsAppVersionItem() {
        this(null, null, 3, null);
    }

    public ResponseSettingsAppVersionItem(String str, Integer num) {
        this.version = str;
        this.compilation = num;
    }

    public /* synthetic */ ResponseSettingsAppVersionItem(String str, Integer num, int i, C4636f fVar) {
        if ((i & 1) != 0) {
            str = "1.0";
        }
        if ((i & 2) != 0) {
            num = Integer.valueOf(1);
        }
        this(str, num);
    }

    public static /* synthetic */ ResponseSettingsAppVersionItem copy$default(ResponseSettingsAppVersionItem responseSettingsAppVersionItem, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = responseSettingsAppVersionItem.version;
        }
        if ((i & 2) != 0) {
            num = responseSettingsAppVersionItem.compilation;
        }
        return responseSettingsAppVersionItem.copy(str, num);
    }

    public final String component1() {
        return this.version;
    }

    public final Integer component2() {
        return this.compilation;
    }

    public final ResponseSettingsAppVersionItem copy(String str, Integer num) {
        return new ResponseSettingsAppVersionItem(str, num);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p392u.p401r.p403c.C4638h.m10272a((java.lang.Object) r2.compilation, (java.lang.Object) r3.compilation) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof p002es.gob.radarcovid.models.response.ResponseSettingsAppVersionItem
            if (r0 == 0) goto L_0x001d
            es.gob.radarcovid.models.response.ResponseSettingsAppVersionItem r3 = (p002es.gob.radarcovid.models.response.ResponseSettingsAppVersionItem) r3
            java.lang.String r0 = r2.version
            java.lang.String r1 = r3.version
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.Integer r0 = r2.compilation
            java.lang.Integer r3 = r3.compilation
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
        throw new UnsupportedOperationException("Method not decompiled: p002es.gob.radarcovid.models.response.ResponseSettingsAppVersionItem.equals(java.lang.Object):boolean");
    }

    public final Integer getCompilation() {
        return this.compilation;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.version;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.compilation;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("ResponseSettingsAppVersionItem(version=");
        a.append(this.version);
        a.append(", compilation=");
        a.append(this.compilation);
        a.append(")");
        return a.toString();
    }
}
