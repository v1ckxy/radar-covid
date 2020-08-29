package p002es.gob.radarcovid.models.domain;

import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;

/* renamed from: es.gob.radarcovid.models.domain.ExposureConfiguration */
public final class ExposureConfiguration {
    public final SettingsItem attenuation;
    public final SettingsItem days;
    public final SettingsItem duration;
    public final SettingsItem transmission;

    public ExposureConfiguration() {
        this(null, null, null, null, 15, null);
    }

    public ExposureConfiguration(SettingsItem settingsItem, SettingsItem settingsItem2, SettingsItem settingsItem3, SettingsItem settingsItem4) {
        if (settingsItem == null) {
            C4638h.m10271a("transmission");
            throw null;
        } else if (settingsItem2 == null) {
            C4638h.m10271a("duration");
            throw null;
        } else if (settingsItem3 == null) {
            C4638h.m10271a("days");
            throw null;
        } else if (settingsItem4 != null) {
            this.transmission = settingsItem;
            this.duration = settingsItem2;
            this.days = settingsItem3;
            this.attenuation = settingsItem4;
        } else {
            C4638h.m10271a("attenuation");
            throw null;
        }
    }

    public /* synthetic */ ExposureConfiguration(SettingsItem settingsItem, SettingsItem settingsItem2, SettingsItem settingsItem3, SettingsItem settingsItem4, int i, C4636f fVar) {
        if ((i & 1) != 0) {
            settingsItem = new SettingsItem(null, 0.0f, 3, null);
        }
        if ((i & 2) != 0) {
            settingsItem2 = new SettingsItem(null, 0.0f, 3, null);
        }
        if ((i & 4) != 0) {
            settingsItem3 = new SettingsItem(null, 0.0f, 3, null);
        }
        if ((i & 8) != 0) {
            settingsItem4 = new SettingsItem(null, 0.0f, 3, null);
        }
        this(settingsItem, settingsItem2, settingsItem3, settingsItem4);
    }

    public static /* synthetic */ ExposureConfiguration copy$default(ExposureConfiguration exposureConfiguration, SettingsItem settingsItem, SettingsItem settingsItem2, SettingsItem settingsItem3, SettingsItem settingsItem4, int i, Object obj) {
        if ((i & 1) != 0) {
            settingsItem = exposureConfiguration.transmission;
        }
        if ((i & 2) != 0) {
            settingsItem2 = exposureConfiguration.duration;
        }
        if ((i & 4) != 0) {
            settingsItem3 = exposureConfiguration.days;
        }
        if ((i & 8) != 0) {
            settingsItem4 = exposureConfiguration.attenuation;
        }
        return exposureConfiguration.copy(settingsItem, settingsItem2, settingsItem3, settingsItem4);
    }

    public final SettingsItem component1() {
        return this.transmission;
    }

    public final SettingsItem component2() {
        return this.duration;
    }

    public final SettingsItem component3() {
        return this.days;
    }

    public final SettingsItem component4() {
        return this.attenuation;
    }

    public final ExposureConfiguration copy(SettingsItem settingsItem, SettingsItem settingsItem2, SettingsItem settingsItem3, SettingsItem settingsItem4) {
        if (settingsItem == null) {
            C4638h.m10271a("transmission");
            throw null;
        } else if (settingsItem2 == null) {
            C4638h.m10271a("duration");
            throw null;
        } else if (settingsItem3 == null) {
            C4638h.m10271a("days");
            throw null;
        } else if (settingsItem4 != null) {
            return new ExposureConfiguration(settingsItem, settingsItem2, settingsItem3, settingsItem4);
        } else {
            C4638h.m10271a("attenuation");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (p392u.p401r.p403c.C4638h.m10272a((java.lang.Object) r2.attenuation, (java.lang.Object) r3.attenuation) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof p002es.gob.radarcovid.models.domain.ExposureConfiguration
            if (r0 == 0) goto L_0x0031
            es.gob.radarcovid.models.domain.ExposureConfiguration r3 = (p002es.gob.radarcovid.models.domain.ExposureConfiguration) r3
            es.gob.radarcovid.models.domain.SettingsItem r0 = r2.transmission
            es.gob.radarcovid.models.domain.SettingsItem r1 = r3.transmission
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x0031
            es.gob.radarcovid.models.domain.SettingsItem r0 = r2.duration
            es.gob.radarcovid.models.domain.SettingsItem r1 = r3.duration
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x0031
            es.gob.radarcovid.models.domain.SettingsItem r0 = r2.days
            es.gob.radarcovid.models.domain.SettingsItem r1 = r3.days
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x0031
            es.gob.radarcovid.models.domain.SettingsItem r0 = r2.attenuation
            es.gob.radarcovid.models.domain.SettingsItem r3 = r3.attenuation
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
        throw new UnsupportedOperationException("Method not decompiled: p002es.gob.radarcovid.models.domain.ExposureConfiguration.equals(java.lang.Object):boolean");
    }

    public final SettingsItem getAttenuation() {
        return this.attenuation;
    }

    public final SettingsItem getDays() {
        return this.days;
    }

    public final SettingsItem getDuration() {
        return this.duration;
    }

    public final SettingsItem getTransmission() {
        return this.transmission;
    }

    public int hashCode() {
        SettingsItem settingsItem = this.transmission;
        int i = 0;
        int hashCode = (settingsItem != null ? settingsItem.hashCode() : 0) * 31;
        SettingsItem settingsItem2 = this.duration;
        int hashCode2 = (hashCode + (settingsItem2 != null ? settingsItem2.hashCode() : 0)) * 31;
        SettingsItem settingsItem3 = this.days;
        int hashCode3 = (hashCode2 + (settingsItem3 != null ? settingsItem3.hashCode() : 0)) * 31;
        SettingsItem settingsItem4 = this.attenuation;
        if (settingsItem4 != null) {
            i = settingsItem4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("ExposureConfiguration(transmission=");
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
