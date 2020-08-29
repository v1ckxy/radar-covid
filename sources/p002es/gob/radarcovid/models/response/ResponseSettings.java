package p002es.gob.radarcovid.models.response;

import java.util.List;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p393n.C4570i;
import p392u.p401r.p403c.C4636f;

/* renamed from: es.gob.radarcovid.models.response.ResponseSettings */
public final class ResponseSettings {
    public final ResponseSettingsAppVersion applicationVersion;
    public final ResponseSettingsAttenuationThresholds attenuationDurationThresholds;
    public final ResponseSettingsAttenuationFactor attenuationFactor;
    public final ResponseSettingsExposureConfiguration exposureConfiguration;
    public final Integer minDurationForExposure;
    public final Integer minRiskScore;
    public final List<ResponseSettingsRiskScore> riskScoreClassification;

    public ResponseSettings() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public ResponseSettings(ResponseSettingsExposureConfiguration responseSettingsExposureConfiguration, Integer num, Integer num2, List<ResponseSettingsRiskScore> list, ResponseSettingsAttenuationThresholds responseSettingsAttenuationThresholds, ResponseSettingsAttenuationFactor responseSettingsAttenuationFactor, ResponseSettingsAppVersion responseSettingsAppVersion) {
        this.exposureConfiguration = responseSettingsExposureConfiguration;
        this.minRiskScore = num;
        this.minDurationForExposure = num2;
        this.riskScoreClassification = list;
        this.attenuationDurationThresholds = responseSettingsAttenuationThresholds;
        this.attenuationFactor = responseSettingsAttenuationFactor;
        this.applicationVersion = responseSettingsAppVersion;
    }

    public /* synthetic */ ResponseSettings(ResponseSettingsExposureConfiguration responseSettingsExposureConfiguration, Integer num, Integer num2, List list, ResponseSettingsAttenuationThresholds responseSettingsAttenuationThresholds, ResponseSettingsAttenuationFactor responseSettingsAttenuationFactor, ResponseSettingsAppVersion responseSettingsAppVersion, int i, C4636f fVar) {
        ResponseSettingsExposureConfiguration responseSettingsExposureConfiguration2 = (i & 1) != 0 ? new ResponseSettingsExposureConfiguration(null, null, null, null, 15, null) : responseSettingsExposureConfiguration;
        this(responseSettingsExposureConfiguration2, (i & 2) != 0 ? Integer.valueOf(0) : num, (i & 4) != 0 ? Integer.valueOf(15) : num2, (i & 8) != 0 ? C4570i.f10779e : list, (i & 16) != 0 ? new ResponseSettingsAttenuationThresholds(null, null, 3, null) : responseSettingsAttenuationThresholds, (i & 32) != 0 ? new ResponseSettingsAttenuationFactor(null, null, 3, null) : responseSettingsAttenuationFactor, (i & 64) != 0 ? new ResponseSettingsAppVersion(null, 1, null) : responseSettingsAppVersion);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<es.gob.radarcovid.models.response.ResponseSettingsRiskScore>, for r9v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ p002es.gob.radarcovid.models.response.ResponseSettings copy$default(p002es.gob.radarcovid.models.response.ResponseSettings r5, p002es.gob.radarcovid.models.response.ResponseSettingsExposureConfiguration r6, java.lang.Integer r7, java.lang.Integer r8, java.util.List<p002es.gob.radarcovid.models.response.ResponseSettingsRiskScore> r9, p002es.gob.radarcovid.models.response.ResponseSettingsAttenuationThresholds r10, p002es.gob.radarcovid.models.response.ResponseSettingsAttenuationFactor r11, p002es.gob.radarcovid.models.response.ResponseSettingsAppVersion r12, int r13, java.lang.Object r14) {
        /*
            r14 = r13 & 1
            if (r14 == 0) goto L_0x0006
            es.gob.radarcovid.models.response.ResponseSettingsExposureConfiguration r6 = r5.exposureConfiguration
        L_0x0006:
            r14 = r13 & 2
            if (r14 == 0) goto L_0x000c
            java.lang.Integer r7 = r5.minRiskScore
        L_0x000c:
            r14 = r7
            r7 = r13 & 4
            if (r7 == 0) goto L_0x0013
            java.lang.Integer r8 = r5.minDurationForExposure
        L_0x0013:
            r0 = r8
            r7 = r13 & 8
            if (r7 == 0) goto L_0x001a
            java.util.List<es.gob.radarcovid.models.response.ResponseSettingsRiskScore> r9 = r5.riskScoreClassification
        L_0x001a:
            r1 = r9
            r7 = r13 & 16
            if (r7 == 0) goto L_0x0021
            es.gob.radarcovid.models.response.ResponseSettingsAttenuationThresholds r10 = r5.attenuationDurationThresholds
        L_0x0021:
            r2 = r10
            r7 = r13 & 32
            if (r7 == 0) goto L_0x0028
            es.gob.radarcovid.models.response.ResponseSettingsAttenuationFactor r11 = r5.attenuationFactor
        L_0x0028:
            r3 = r11
            r7 = r13 & 64
            if (r7 == 0) goto L_0x002f
            es.gob.radarcovid.models.response.ResponseSettingsAppVersion r12 = r5.applicationVersion
        L_0x002f:
            r4 = r12
            r7 = r5
            r8 = r6
            r9 = r14
            r10 = r0
            r11 = r1
            r12 = r2
            r13 = r3
            r14 = r4
            es.gob.radarcovid.models.response.ResponseSettings r5 = r7.copy(r8, r9, r10, r11, r12, r13, r14)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p002es.gob.radarcovid.models.response.ResponseSettings.copy$default(es.gob.radarcovid.models.response.ResponseSettings, es.gob.radarcovid.models.response.ResponseSettingsExposureConfiguration, java.lang.Integer, java.lang.Integer, java.util.List, es.gob.radarcovid.models.response.ResponseSettingsAttenuationThresholds, es.gob.radarcovid.models.response.ResponseSettingsAttenuationFactor, es.gob.radarcovid.models.response.ResponseSettingsAppVersion, int, java.lang.Object):es.gob.radarcovid.models.response.ResponseSettings");
    }

    public final ResponseSettingsExposureConfiguration component1() {
        return this.exposureConfiguration;
    }

    public final Integer component2() {
        return this.minRiskScore;
    }

    public final Integer component3() {
        return this.minDurationForExposure;
    }

    public final List<ResponseSettingsRiskScore> component4() {
        return this.riskScoreClassification;
    }

    public final ResponseSettingsAttenuationThresholds component5() {
        return this.attenuationDurationThresholds;
    }

    public final ResponseSettingsAttenuationFactor component6() {
        return this.attenuationFactor;
    }

    public final ResponseSettingsAppVersion component7() {
        return this.applicationVersion;
    }

    public final ResponseSettings copy(ResponseSettingsExposureConfiguration responseSettingsExposureConfiguration, Integer num, Integer num2, List<ResponseSettingsRiskScore> list, ResponseSettingsAttenuationThresholds responseSettingsAttenuationThresholds, ResponseSettingsAttenuationFactor responseSettingsAttenuationFactor, ResponseSettingsAppVersion responseSettingsAppVersion) {
        ResponseSettings responseSettings = new ResponseSettings(responseSettingsExposureConfiguration, num, num2, list, responseSettingsAttenuationThresholds, responseSettingsAttenuationFactor, responseSettingsAppVersion);
        return responseSettings;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        if (p392u.p401r.p403c.C4638h.m10272a((java.lang.Object) r2.applicationVersion, (java.lang.Object) r3.applicationVersion) != false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0051
            boolean r0 = r3 instanceof p002es.gob.radarcovid.models.response.ResponseSettings
            if (r0 == 0) goto L_0x004f
            es.gob.radarcovid.models.response.ResponseSettings r3 = (p002es.gob.radarcovid.models.response.ResponseSettings) r3
            es.gob.radarcovid.models.response.ResponseSettingsExposureConfiguration r0 = r2.exposureConfiguration
            es.gob.radarcovid.models.response.ResponseSettingsExposureConfiguration r1 = r3.exposureConfiguration
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.lang.Integer r0 = r2.minRiskScore
            java.lang.Integer r1 = r3.minRiskScore
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.lang.Integer r0 = r2.minDurationForExposure
            java.lang.Integer r1 = r3.minDurationForExposure
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.util.List<es.gob.radarcovid.models.response.ResponseSettingsRiskScore> r0 = r2.riskScoreClassification
            java.util.List<es.gob.radarcovid.models.response.ResponseSettingsRiskScore> r1 = r3.riskScoreClassification
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x004f
            es.gob.radarcovid.models.response.ResponseSettingsAttenuationThresholds r0 = r2.attenuationDurationThresholds
            es.gob.radarcovid.models.response.ResponseSettingsAttenuationThresholds r1 = r3.attenuationDurationThresholds
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x004f
            es.gob.radarcovid.models.response.ResponseSettingsAttenuationFactor r0 = r2.attenuationFactor
            es.gob.radarcovid.models.response.ResponseSettingsAttenuationFactor r1 = r3.attenuationFactor
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x004f
            es.gob.radarcovid.models.response.ResponseSettingsAppVersion r0 = r2.applicationVersion
            es.gob.radarcovid.models.response.ResponseSettingsAppVersion r3 = r3.applicationVersion
            boolean r3 = p392u.p401r.p403c.C4638h.m10272a(r0, r3)
            if (r3 == 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r3 = 0
            return r3
        L_0x0051:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p002es.gob.radarcovid.models.response.ResponseSettings.equals(java.lang.Object):boolean");
    }

    public final ResponseSettingsAppVersion getApplicationVersion() {
        return this.applicationVersion;
    }

    public final ResponseSettingsAttenuationThresholds getAttenuationDurationThresholds() {
        return this.attenuationDurationThresholds;
    }

    public final ResponseSettingsAttenuationFactor getAttenuationFactor() {
        return this.attenuationFactor;
    }

    public final ResponseSettingsExposureConfiguration getExposureConfiguration() {
        return this.exposureConfiguration;
    }

    public final Integer getMinDurationForExposure() {
        return this.minDurationForExposure;
    }

    public final Integer getMinRiskScore() {
        return this.minRiskScore;
    }

    public final List<ResponseSettingsRiskScore> getRiskScoreClassification() {
        return this.riskScoreClassification;
    }

    public int hashCode() {
        ResponseSettingsExposureConfiguration responseSettingsExposureConfiguration = this.exposureConfiguration;
        int i = 0;
        int hashCode = (responseSettingsExposureConfiguration != null ? responseSettingsExposureConfiguration.hashCode() : 0) * 31;
        Integer num = this.minRiskScore;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.minDurationForExposure;
        int hashCode3 = (hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31;
        List<ResponseSettingsRiskScore> list = this.riskScoreClassification;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        ResponseSettingsAttenuationThresholds responseSettingsAttenuationThresholds = this.attenuationDurationThresholds;
        int hashCode5 = (hashCode4 + (responseSettingsAttenuationThresholds != null ? responseSettingsAttenuationThresholds.hashCode() : 0)) * 31;
        ResponseSettingsAttenuationFactor responseSettingsAttenuationFactor = this.attenuationFactor;
        int hashCode6 = (hashCode5 + (responseSettingsAttenuationFactor != null ? responseSettingsAttenuationFactor.hashCode() : 0)) * 31;
        ResponseSettingsAppVersion responseSettingsAppVersion = this.applicationVersion;
        if (responseSettingsAppVersion != null) {
            i = responseSettingsAppVersion.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("ResponseSettings(exposureConfiguration=");
        a.append(this.exposureConfiguration);
        a.append(", minRiskScore=");
        a.append(this.minRiskScore);
        a.append(", minDurationForExposure=");
        a.append(this.minDurationForExposure);
        a.append(", riskScoreClassification=");
        a.append(this.riskScoreClassification);
        a.append(", attenuationDurationThresholds=");
        a.append(this.attenuationDurationThresholds);
        a.append(", attenuationFactor=");
        a.append(this.attenuationFactor);
        a.append(", applicationVersion=");
        a.append(this.applicationVersion);
        a.append(")");
        return a.toString();
    }
}
