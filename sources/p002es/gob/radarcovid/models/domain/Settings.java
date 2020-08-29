package p002es.gob.radarcovid.models.domain;

import java.util.List;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p393n.C4570i;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;

/* renamed from: es.gob.radarcovid.models.domain.Settings */
public final class Settings {
    public final SettingsAppInfo appInfo;
    public final float attenuationFactorLow;
    public final float attenuationFactorMedium;
    public final int attenuationThresholdLow;
    public final int attenuationThresholdMedium;
    public final ExposureConfiguration exposureConfiguration;
    public final int minDurationForExposure;
    public final int minRiskScore;
    public final List<SettingsRiskScore> riskScoreClassification;

    public Settings() {
        this(null, 0, 0, 0, 0.0f, 0.0f, 0, null, null, 511, null);
    }

    public Settings(ExposureConfiguration exposureConfiguration2, int i, int i2, int i3, float f, float f2, int i4, List<SettingsRiskScore> list, SettingsAppInfo settingsAppInfo) {
        if (exposureConfiguration2 == null) {
            C4638h.m10271a("exposureConfiguration");
            throw null;
        } else if (list == null) {
            C4638h.m10271a("riskScoreClassification");
            throw null;
        } else if (settingsAppInfo != null) {
            this.exposureConfiguration = exposureConfiguration2;
            this.minRiskScore = i;
            this.attenuationThresholdLow = i2;
            this.attenuationThresholdMedium = i3;
            this.attenuationFactorLow = f;
            this.attenuationFactorMedium = f2;
            this.minDurationForExposure = i4;
            this.riskScoreClassification = list;
            this.appInfo = settingsAppInfo;
        } else {
            C4638h.m10271a("appInfo");
            throw null;
        }
    }

    public static /* synthetic */ Settings copy$default(Settings settings, ExposureConfiguration exposureConfiguration2, int i, int i2, int i3, float f, float f2, int i4, List list, SettingsAppInfo settingsAppInfo, int i5, Object obj) {
        Settings settings2 = settings;
        int i6 = i5;
        return settings.copy((i6 & 1) != 0 ? settings2.exposureConfiguration : exposureConfiguration2, (i6 & 2) != 0 ? settings2.minRiskScore : i, (i6 & 4) != 0 ? settings2.attenuationThresholdLow : i2, (i6 & 8) != 0 ? settings2.attenuationThresholdMedium : i3, (i6 & 16) != 0 ? settings2.attenuationFactorLow : f, (i6 & 32) != 0 ? settings2.attenuationFactorMedium : f2, (i6 & 64) != 0 ? settings2.minDurationForExposure : i4, (i6 & 128) != 0 ? settings2.riskScoreClassification : list, (i6 & 256) != 0 ? settings2.appInfo : settingsAppInfo);
    }

    public final ExposureConfiguration component1() {
        return this.exposureConfiguration;
    }

    public final int component2() {
        return this.minRiskScore;
    }

    public final int component3() {
        return this.attenuationThresholdLow;
    }

    public final int component4() {
        return this.attenuationThresholdMedium;
    }

    public final float component5() {
        return this.attenuationFactorLow;
    }

    public final float component6() {
        return this.attenuationFactorMedium;
    }

    public final int component7() {
        return this.minDurationForExposure;
    }

    public final List<SettingsRiskScore> component8() {
        return this.riskScoreClassification;
    }

    public final SettingsAppInfo component9() {
        return this.appInfo;
    }

    public final Settings copy(ExposureConfiguration exposureConfiguration2, int i, int i2, int i3, float f, float f2, int i4, List<SettingsRiskScore> list, SettingsAppInfo settingsAppInfo) {
        if (exposureConfiguration2 == null) {
            C4638h.m10271a("exposureConfiguration");
            throw null;
        } else if (list == null) {
            C4638h.m10271a("riskScoreClassification");
            throw null;
        } else if (settingsAppInfo != null) {
            Settings settings = new Settings(exposureConfiguration2, i, i2, i3, f, f2, i4, list, settingsAppInfo);
            return settings;
        } else {
            C4638h.m10271a("appInfo");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        if (p392u.p401r.p403c.C4638h.m10272a((java.lang.Object) r2.appInfo, (java.lang.Object) r3.appInfo) != false) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0055
            boolean r0 = r3 instanceof p002es.gob.radarcovid.models.domain.Settings
            if (r0 == 0) goto L_0x0053
            es.gob.radarcovid.models.domain.Settings r3 = (p002es.gob.radarcovid.models.domain.Settings) r3
            es.gob.radarcovid.models.domain.ExposureConfiguration r0 = r2.exposureConfiguration
            es.gob.radarcovid.models.domain.ExposureConfiguration r1 = r3.exposureConfiguration
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x0053
            int r0 = r2.minRiskScore
            int r1 = r3.minRiskScore
            if (r0 != r1) goto L_0x0053
            int r0 = r2.attenuationThresholdLow
            int r1 = r3.attenuationThresholdLow
            if (r0 != r1) goto L_0x0053
            int r0 = r2.attenuationThresholdMedium
            int r1 = r3.attenuationThresholdMedium
            if (r0 != r1) goto L_0x0053
            float r0 = r2.attenuationFactorLow
            float r1 = r3.attenuationFactorLow
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 != 0) goto L_0x0053
            float r0 = r2.attenuationFactorMedium
            float r1 = r3.attenuationFactorMedium
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 != 0) goto L_0x0053
            int r0 = r2.minDurationForExposure
            int r1 = r3.minDurationForExposure
            if (r0 != r1) goto L_0x0053
            java.util.List<es.gob.radarcovid.models.domain.SettingsRiskScore> r0 = r2.riskScoreClassification
            java.util.List<es.gob.radarcovid.models.domain.SettingsRiskScore> r1 = r3.riskScoreClassification
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x0053
            es.gob.radarcovid.models.domain.SettingsAppInfo r0 = r2.appInfo
            es.gob.radarcovid.models.domain.SettingsAppInfo r3 = r3.appInfo
            boolean r3 = p392u.p401r.p403c.C4638h.m10272a(r0, r3)
            if (r3 == 0) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r3 = 0
            return r3
        L_0x0055:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p002es.gob.radarcovid.models.domain.Settings.equals(java.lang.Object):boolean");
    }

    public final SettingsAppInfo getAppInfo() {
        return this.appInfo;
    }

    public final float getAttenuationFactorLow() {
        return this.attenuationFactorLow;
    }

    public final float getAttenuationFactorMedium() {
        return this.attenuationFactorMedium;
    }

    public final int getAttenuationThresholdLow() {
        return this.attenuationThresholdLow;
    }

    public final int getAttenuationThresholdMedium() {
        return this.attenuationThresholdMedium;
    }

    public final ExposureConfiguration getExposureConfiguration() {
        return this.exposureConfiguration;
    }

    public final int getMinDurationForExposure() {
        return this.minDurationForExposure;
    }

    public final int getMinRiskScore() {
        return this.minRiskScore;
    }

    public final List<SettingsRiskScore> getRiskScoreClassification() {
        return this.riskScoreClassification;
    }

    public int hashCode() {
        ExposureConfiguration exposureConfiguration2 = this.exposureConfiguration;
        int i = 0;
        int floatToIntBits = (((Float.floatToIntBits(this.attenuationFactorMedium) + ((Float.floatToIntBits(this.attenuationFactorLow) + ((((((((exposureConfiguration2 != null ? exposureConfiguration2.hashCode() : 0) * 31) + this.minRiskScore) * 31) + this.attenuationThresholdLow) * 31) + this.attenuationThresholdMedium) * 31)) * 31)) * 31) + this.minDurationForExposure) * 31;
        List<SettingsRiskScore> list = this.riskScoreClassification;
        int hashCode = (floatToIntBits + (list != null ? list.hashCode() : 0)) * 31;
        SettingsAppInfo settingsAppInfo = this.appInfo;
        if (settingsAppInfo != null) {
            i = settingsAppInfo.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("Settings(exposureConfiguration=");
        a.append(this.exposureConfiguration);
        a.append(", minRiskScore=");
        a.append(this.minRiskScore);
        a.append(", attenuationThresholdLow=");
        a.append(this.attenuationThresholdLow);
        a.append(", attenuationThresholdMedium=");
        a.append(this.attenuationThresholdMedium);
        a.append(", attenuationFactorLow=");
        a.append(this.attenuationFactorLow);
        a.append(", attenuationFactorMedium=");
        a.append(this.attenuationFactorMedium);
        a.append(", minDurationForExposure=");
        a.append(this.minDurationForExposure);
        a.append(", riskScoreClassification=");
        a.append(this.riskScoreClassification);
        a.append(", appInfo=");
        a.append(this.appInfo);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ Settings(ExposureConfiguration exposureConfiguration2, int i, int i2, int i3, float f, float f2, int i4, List list, SettingsAppInfo settingsAppInfo, int i5, C4636f fVar) {
        int i6 = i5;
        ExposureConfiguration exposureConfiguration3 = (i6 & 1) != 0 ? new ExposureConfiguration(null, null, null, null, 15, null) : exposureConfiguration2;
        this(exposureConfiguration3, (i6 & 2) != 0 ? 0 : i, (i6 & 4) != 0 ? 0 : i2, (i6 & 8) != 0 ? 0 : i3, (i6 & 16) != 0 ? 1.0f : f, (i6 & 32) != 0 ? 0.5f : f2, (i6 & 64) != 0 ? 15 : i4, (i6 & 128) != 0 ? C4570i.f10779e : list, (i6 & 256) != 0 ? new SettingsAppInfo(null, 0, 3, null) : settingsAppInfo);
    }
}
