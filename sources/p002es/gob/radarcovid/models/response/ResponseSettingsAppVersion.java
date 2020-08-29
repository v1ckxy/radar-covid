package p002es.gob.radarcovid.models.response;

import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4636f;

/* renamed from: es.gob.radarcovid.models.response.ResponseSettingsAppVersion */
public final class ResponseSettingsAppVersion {

    /* renamed from: android reason: collision with root package name */
    public final ResponseSettingsAppVersionItem f12686android;

    public ResponseSettingsAppVersion() {
        this(null, 1, null);
    }

    public ResponseSettingsAppVersion(ResponseSettingsAppVersionItem responseSettingsAppVersionItem) {
        this.f12686android = responseSettingsAppVersionItem;
    }

    public /* synthetic */ ResponseSettingsAppVersion(ResponseSettingsAppVersionItem responseSettingsAppVersionItem, int i, C4636f fVar) {
        if ((i & 1) != 0) {
            responseSettingsAppVersionItem = new ResponseSettingsAppVersionItem(null, null, 3, null);
        }
        this(responseSettingsAppVersionItem);
    }

    public static /* synthetic */ ResponseSettingsAppVersion copy$default(ResponseSettingsAppVersion responseSettingsAppVersion, ResponseSettingsAppVersionItem responseSettingsAppVersionItem, int i, Object obj) {
        if ((i & 1) != 0) {
            responseSettingsAppVersionItem = responseSettingsAppVersion.f12686android;
        }
        return responseSettingsAppVersion.copy(responseSettingsAppVersionItem);
    }

    public final ResponseSettingsAppVersionItem component1() {
        return this.f12686android;
    }

    public final ResponseSettingsAppVersion copy(ResponseSettingsAppVersionItem responseSettingsAppVersionItem) {
        return new ResponseSettingsAppVersion(responseSettingsAppVersionItem);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p392u.p401r.p403c.C4638h.m10272a((java.lang.Object) r1.f12686android, (java.lang.Object) ((p002es.gob.radarcovid.models.response.ResponseSettingsAppVersion) r2).f12686android) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof p002es.gob.radarcovid.models.response.ResponseSettingsAppVersion
            if (r0 == 0) goto L_0x0013
            es.gob.radarcovid.models.response.ResponseSettingsAppVersion r2 = (p002es.gob.radarcovid.models.response.ResponseSettingsAppVersion) r2
            es.gob.radarcovid.models.response.ResponseSettingsAppVersionItem r0 = r1.f12686android
            es.gob.radarcovid.models.response.ResponseSettingsAppVersionItem r2 = r2.f12686android
            boolean r2 = p392u.p401r.p403c.C4638h.m10272a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p002es.gob.radarcovid.models.response.ResponseSettingsAppVersion.equals(java.lang.Object):boolean");
    }

    public final ResponseSettingsAppVersionItem getAndroid() {
        return this.f12686android;
    }

    public int hashCode() {
        ResponseSettingsAppVersionItem responseSettingsAppVersionItem = this.f12686android;
        if (responseSettingsAppVersionItem != null) {
            return responseSettingsAppVersionItem.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("ResponseSettingsAppVersion(android=");
        a.append(this.f12686android);
        a.append(")");
        return a.toString();
    }
}
