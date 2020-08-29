package p002es.gob.radarcovid.models.response;

import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4636f;

/* renamed from: es.gob.radarcovid.models.response.ResponseSettingsExposureConfiguration */
public final class ResponseSettingsExposureConfiguration {
    public final ResponseSettingsItem attenuation;
    public final ResponseSettingsItem days;
    public final ResponseSettingsItem duration;
    public final ResponseSettingsItem transmission;

    public ResponseSettingsExposureConfiguration() {
        this(null, null, null, null, 15, null);
    }

    public ResponseSettingsExposureConfiguration(ResponseSettingsItem responseSettingsItem, ResponseSettingsItem responseSettingsItem2, ResponseSettingsItem responseSettingsItem3, ResponseSettingsItem responseSettingsItem4) {
        this.transmission = responseSettingsItem;
        this.duration = responseSettingsItem2;
        this.days = responseSettingsItem3;
        this.attenuation = responseSettingsItem4;
    }

    public /* synthetic */ ResponseSettingsExposureConfiguration(ResponseSettingsItem responseSettingsItem, ResponseSettingsItem responseSettingsItem2, ResponseSettingsItem responseSettingsItem3, ResponseSettingsItem responseSettingsItem4, int i, C4636f fVar) {
        ResponseSettingsExposureConfiguration responseSettingsExposureConfiguration;
        ResponseSettingsItem responseSettingsItem5;
        ResponseSettingsItem responseSettingsItem6 = (i & 1) != 0 ? new ResponseSettingsItem(null, null, null, null, null, null, null, null, null, 511, null) : responseSettingsItem;
        ResponseSettingsItem responseSettingsItem7 = (i & 2) != 0 ? new ResponseSettingsItem(null, null, null, null, null, null, null, null, null, 511, null) : responseSettingsItem2;
        ResponseSettingsItem responseSettingsItem8 = (i & 4) != 0 ? new ResponseSettingsItem(null, null, null, null, null, null, null, null, null, 511, null) : responseSettingsItem3;
        if ((i & 8) != 0) {
            responseSettingsItem5 = new ResponseSettingsItem(null, null, null, null, null, null, null, null, null, 511, null);
            responseSettingsExposureConfiguration = this;
        } else {
            responseSettingsExposureConfiguration = this;
            responseSettingsItem5 = responseSettingsItem4;
        }
        new ResponseSettingsExposureConfiguration(responseSettingsItem6, responseSettingsItem7, responseSettingsItem8, responseSettingsItem5);
    }

    public static /* synthetic */ ResponseSettingsExposureConfiguration copy$default(ResponseSettingsExposureConfiguration responseSettingsExposureConfiguration, ResponseSettingsItem responseSettingsItem, ResponseSettingsItem responseSettingsItem2, ResponseSettingsItem responseSettingsItem3, ResponseSettingsItem responseSettingsItem4, int i, Object obj) {
        if ((i & 1) != 0) {
            responseSettingsItem = responseSettingsExposureConfiguration.transmission;
        }
        if ((i & 2) != 0) {
            responseSettingsItem2 = responseSettingsExposureConfiguration.duration;
        }
        if ((i & 4) != 0) {
            responseSettingsItem3 = responseSettingsExposureConfiguration.days;
        }
        if ((i & 8) != 0) {
            responseSettingsItem4 = responseSettingsExposureConfiguration.attenuation;
        }
        return responseSettingsExposureConfiguration.copy(responseSettingsItem, responseSettingsItem2, responseSettingsItem3, responseSettingsItem4);
    }

    public final ResponseSettingsItem component1() {
        return this.transmission;
    }

    public final ResponseSettingsItem component2() {
        return this.duration;
    }

    public final ResponseSettingsItem component3() {
        return this.days;
    }

    public final ResponseSettingsItem component4() {
        return this.attenuation;
    }

    public final ResponseSettingsExposureConfiguration copy(ResponseSettingsItem responseSettingsItem, ResponseSettingsItem responseSettingsItem2, ResponseSettingsItem responseSettingsItem3, ResponseSettingsItem responseSettingsItem4) {
        return new ResponseSettingsExposureConfiguration(responseSettingsItem, responseSettingsItem2, responseSettingsItem3, responseSettingsItem4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (p392u.p401r.p403c.C4638h.m10272a((java.lang.Object) r2.attenuation, (java.lang.Object) r3.attenuation) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof p002es.gob.radarcovid.models.response.ResponseSettingsExposureConfiguration
            if (r0 == 0) goto L_0x0031
            es.gob.radarcovid.models.response.ResponseSettingsExposureConfiguration r3 = (p002es.gob.radarcovid.models.response.ResponseSettingsExposureConfiguration) r3
            es.gob.radarcovid.models.response.ResponseSettingsItem r0 = r2.transmission
            es.gob.radarcovid.models.response.ResponseSettingsItem r1 = r3.transmission
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x0031
            es.gob.radarcovid.models.response.ResponseSettingsItem r0 = r2.duration
            es.gob.radarcovid.models.response.ResponseSettingsItem r1 = r3.duration
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x0031
            es.gob.radarcovid.models.response.ResponseSettingsItem r0 = r2.days
            es.gob.radarcovid.models.response.ResponseSettingsItem r1 = r3.days
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x0031
            es.gob.radarcovid.models.response.ResponseSettingsItem r0 = r2.attenuation
            es.gob.radarcovid.models.response.ResponseSettingsItem r3 = r3.attenuation
            boolean r3 = p392u.p401r.p403c.C4638h.m10272a(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p002es.gob.radarcovid.models.response.ResponseSettingsExposureConfiguration.equals(java.lang.Object):boolean");
    }

    public final ResponseSettingsItem getAttenuation() {
        return this.attenuation;
    }

    public final ResponseSettingsItem getDays() {
        return this.days;
    }

    public final ResponseSettingsItem getDuration() {
        return this.duration;
    }

    public final ResponseSettingsItem getTransmission() {
        return this.transmission;
    }

    public int hashCode() {
        ResponseSettingsItem responseSettingsItem = this.transmission;
        int i = 0;
        int hashCode = (responseSettingsItem != null ? responseSettingsItem.hashCode() : 0) * 31;
        ResponseSettingsItem responseSettingsItem2 = this.duration;
        int hashCode2 = (hashCode + (responseSettingsItem2 != null ? responseSettingsItem2.hashCode() : 0)) * 31;
        ResponseSettingsItem responseSettingsItem3 = this.days;
        int hashCode3 = (hashCode2 + (responseSettingsItem3 != null ? responseSettingsItem3.hashCode() : 0)) * 31;
        ResponseSettingsItem responseSettingsItem4 = this.attenuation;
        if (responseSettingsItem4 != null) {
            i = responseSettingsItem4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("ResponseSettingsExposureConfiguration(transmission=");
        a.append(this.transmission);
        a.append(", duration=");
        a.append(this.duration);
        a.append(", days=");
        a.append(this.days);
        a.append(", attenuation=");
        a.append(this.attenuation);
        a.append(")");
        return a.toString();
    }
}
