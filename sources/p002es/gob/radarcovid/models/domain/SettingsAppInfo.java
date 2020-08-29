package p002es.gob.radarcovid.models.domain;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;

/* renamed from: es.gob.radarcovid.models.domain.SettingsAppInfo */
public final class SettingsAppInfo {
    public final int minVersionCode;
    public final String minVersionName;

    public SettingsAppInfo() {
        this(null, 0, 3, null);
    }

    public SettingsAppInfo(String str, int i) {
        if (str != null) {
            this.minVersionName = str;
            this.minVersionCode = i;
            return;
        }
        C4638h.m10271a("minVersionName");
        throw null;
    }

    public /* synthetic */ SettingsAppInfo(String str, int i, int i2, C4636f fVar) {
        if ((i2 & 1) != 0) {
            str = Objects.EMPTY_STRING;
        }
        if ((i2 & 2) != 0) {
            i = 1;
        }
        this(str, i);
    }

    public static /* synthetic */ SettingsAppInfo copy$default(SettingsAppInfo settingsAppInfo, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = settingsAppInfo.minVersionName;
        }
        if ((i2 & 2) != 0) {
            i = settingsAppInfo.minVersionCode;
        }
        return settingsAppInfo.copy(str, i);
    }

    public final String component1() {
        return this.minVersionName;
    }

    public final int component2() {
        return this.minVersionCode;
    }

    public final SettingsAppInfo copy(String str, int i) {
        if (str != null) {
            return new SettingsAppInfo(str, i);
        }
        C4638h.m10271a("minVersionName");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r2.minVersionCode == r3.minVersionCode) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001b
            boolean r0 = r3 instanceof p002es.gob.radarcovid.models.domain.SettingsAppInfo
            if (r0 == 0) goto L_0x0019
            es.gob.radarcovid.models.domain.SettingsAppInfo r3 = (p002es.gob.radarcovid.models.domain.SettingsAppInfo) r3
            java.lang.String r0 = r2.minVersionName
            java.lang.String r1 = r3.minVersionName
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x0019
            int r0 = r2.minVersionCode
            int r3 = r3.minVersionCode
            if (r0 != r3) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r3 = 0
            return r3
        L_0x001b:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p002es.gob.radarcovid.models.domain.SettingsAppInfo.equals(java.lang.Object):boolean");
    }

    public final int getMinVersionCode() {
        return this.minVersionCode;
    }

    public final String getMinVersionName() {
        return this.minVersionName;
    }

    public int hashCode() {
        String str = this.minVersionName;
        return ((str != null ? str.hashCode() : 0) * 31) + this.minVersionCode;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("SettingsAppInfo(minVersionName=");
        a.append(this.minVersionName);
        a.append(", minVersionCode=");
        return C1965a.m4753a(a, this.minVersionCode, ")");
    }
}
