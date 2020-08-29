package p002es.gob.radarcovid.models.domain;

import java.util.Date;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;

/* renamed from: es.gob.radarcovid.models.domain.ExposureInfo */
public final class ExposureInfo {
    public boolean exposureNotificationsEnabled;
    public Date lastExposureDate;
    public Date lastUpdateTime;
    public Level level;

    /* renamed from: es.gob.radarcovid.models.domain.ExposureInfo$Level */
    public enum Level {
        LOW,
        INFECTED,
        HIGH
    }

    public ExposureInfo() {
        this(null, null, null, false, 15, null);
    }

    public ExposureInfo(Level level2, Date date, Date date2, boolean z) {
        if (level2 == null) {
            C4638h.m10271a("level");
            throw null;
        } else if (date == null) {
            C4638h.m10271a("lastUpdateTime");
            throw null;
        } else if (date2 != null) {
            this.level = level2;
            this.lastUpdateTime = date;
            this.lastExposureDate = date2;
            this.exposureNotificationsEnabled = z;
        } else {
            C4638h.m10271a("lastExposureDate");
            throw null;
        }
    }

    public /* synthetic */ ExposureInfo(Level level2, Date date, Date date2, boolean z, int i, C4636f fVar) {
        if ((i & 1) != 0) {
            level2 = Level.LOW;
        }
        if ((i & 2) != 0) {
            date = new Date();
        }
        if ((i & 4) != 0) {
            date2 = new Date();
        }
        if ((i & 8) != 0) {
            z = true;
        }
        this(level2, date, date2, z);
    }

    public static /* synthetic */ ExposureInfo copy$default(ExposureInfo exposureInfo, Level level2, Date date, Date date2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            level2 = exposureInfo.level;
        }
        if ((i & 2) != 0) {
            date = exposureInfo.lastUpdateTime;
        }
        if ((i & 4) != 0) {
            date2 = exposureInfo.lastExposureDate;
        }
        if ((i & 8) != 0) {
            z = exposureInfo.exposureNotificationsEnabled;
        }
        return exposureInfo.copy(level2, date, date2, z);
    }

    public final Level component1() {
        return this.level;
    }

    public final Date component2() {
        return this.lastUpdateTime;
    }

    public final Date component3() {
        return this.lastExposureDate;
    }

    public final boolean component4() {
        return this.exposureNotificationsEnabled;
    }

    public final ExposureInfo copy(Level level2, Date date, Date date2, boolean z) {
        if (level2 == null) {
            C4638h.m10271a("level");
            throw null;
        } else if (date == null) {
            C4638h.m10271a("lastUpdateTime");
            throw null;
        } else if (date2 != null) {
            return new ExposureInfo(level2, date, date2, z);
        } else {
            C4638h.m10271a("lastExposureDate");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r2.exposureNotificationsEnabled == r3.exposureNotificationsEnabled) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x002f
            boolean r0 = r3 instanceof p002es.gob.radarcovid.models.domain.ExposureInfo
            if (r0 == 0) goto L_0x002d
            es.gob.radarcovid.models.domain.ExposureInfo r3 = (p002es.gob.radarcovid.models.domain.ExposureInfo) r3
            es.gob.radarcovid.models.domain.ExposureInfo$Level r0 = r2.level
            es.gob.radarcovid.models.domain.ExposureInfo$Level r1 = r3.level
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x002d
            java.util.Date r0 = r2.lastUpdateTime
            java.util.Date r1 = r3.lastUpdateTime
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x002d
            java.util.Date r0 = r2.lastExposureDate
            java.util.Date r1 = r3.lastExposureDate
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x002d
            boolean r0 = r2.exposureNotificationsEnabled
            boolean r3 = r3.exposureNotificationsEnabled
            if (r0 != r3) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            r3 = 0
            return r3
        L_0x002f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p002es.gob.radarcovid.models.domain.ExposureInfo.equals(java.lang.Object):boolean");
    }

    public final boolean getExposureNotificationsEnabled() {
        return this.exposureNotificationsEnabled;
    }

    public final Date getLastExposureDate() {
        return this.lastExposureDate;
    }

    public final Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    public final Level getLevel() {
        return this.level;
    }

    public int hashCode() {
        Level level2 = this.level;
        int i = 0;
        int hashCode = (level2 != null ? level2.hashCode() : 0) * 31;
        Date date = this.lastUpdateTime;
        int hashCode2 = (hashCode + (date != null ? date.hashCode() : 0)) * 31;
        Date date2 = this.lastExposureDate;
        if (date2 != null) {
            i = date2.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.exposureNotificationsEnabled;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public final void setExposureNotificationsEnabled(boolean z) {
        this.exposureNotificationsEnabled = z;
    }

    public final void setLastExposureDate(Date date) {
        if (date != null) {
            this.lastExposureDate = date;
        } else {
            C4638h.m10271a("<set-?>");
            throw null;
        }
    }

    public final void setLastUpdateTime(Date date) {
        if (date != null) {
            this.lastUpdateTime = date;
        } else {
            C4638h.m10271a("<set-?>");
            throw null;
        }
    }

    public final void setLevel(Level level2) {
        if (level2 != null) {
            this.level = level2;
        } else {
            C4638h.m10271a("<set-?>");
            throw null;
        }
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("ExposureInfo(level=");
        a.append(this.level);
        a.append(", lastUpdateTime=");
        a.append(this.lastUpdateTime);
        a.append(", lastExposureDate=");
        a.append(this.lastExposureDate);
        a.append(", exposureNotificationsEnabled=");
        a.append(this.exposureNotificationsEnabled);
        a.append(")");
        return a.toString();
    }
}
