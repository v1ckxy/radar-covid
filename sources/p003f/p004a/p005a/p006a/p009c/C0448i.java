package p003f.p004a.p005a.p006a.p009c;

import p002es.gob.radarcovid.models.domain.SettingsItem;
import p002es.gob.radarcovid.models.response.ResponseSettingsItem;

/* renamed from: f.a.a.a.c.i */
public final class C0448i {
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r10v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r1v3, types: [u.n.i] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x011d, code lost:
        if (r3 != null) goto L_0x0122;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0138  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p002es.gob.radarcovid.models.domain.Settings mo3706a(p002es.gob.radarcovid.models.response.ResponseSettings r21) {
        /*
            r20 = this;
            r0 = r20
            if (r21 == 0) goto L_0x0144
            es.gob.radarcovid.models.domain.Settings r12 = new es.gob.radarcovid.models.domain.Settings
            es.gob.radarcovid.models.response.ResponseSettingsExposureConfiguration r2 = r21.getExposureConfiguration()
            es.gob.radarcovid.models.domain.ExposureConfiguration r10 = new es.gob.radarcovid.models.domain.ExposureConfiguration
            if (r2 == 0) goto L_0x0032
            es.gob.radarcovid.models.response.ResponseSettingsItem r3 = r2.getTransmission()
            es.gob.radarcovid.models.domain.SettingsItem r3 = r0.mo3707a(r3)
            es.gob.radarcovid.models.response.ResponseSettingsItem r4 = r2.getDuration()
            es.gob.radarcovid.models.domain.SettingsItem r4 = r0.mo3707a(r4)
            es.gob.radarcovid.models.response.ResponseSettingsItem r5 = r2.getDays()
            es.gob.radarcovid.models.domain.SettingsItem r5 = r0.mo3707a(r5)
            es.gob.radarcovid.models.response.ResponseSettingsItem r2 = r2.getAttenuation()
            es.gob.radarcovid.models.domain.SettingsItem r2 = r0.mo3707a(r2)
            r10.<init>(r3, r4, r5, r2)
            goto L_0x003d
        L_0x0032:
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 15
            r9 = 0
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
        L_0x003d:
            java.lang.Integer r2 = r21.getMinRiskScore()
            r3 = 0
            if (r2 == 0) goto L_0x004a
            int r2 = r2.intValue()
            r4 = r2
            goto L_0x004b
        L_0x004a:
            r4 = r3
        L_0x004b:
            es.gob.radarcovid.models.response.ResponseSettingsAttenuationThresholds r2 = r21.getAttenuationDurationThresholds()
            if (r2 == 0) goto L_0x005c
            java.lang.Integer r2 = r2.getLow()
            if (r2 == 0) goto L_0x005c
            int r2 = r2.intValue()
            goto L_0x005e
        L_0x005c:
            r2 = 50
        L_0x005e:
            r5 = r2
            es.gob.radarcovid.models.response.ResponseSettingsAttenuationThresholds r2 = r21.getAttenuationDurationThresholds()
            if (r2 == 0) goto L_0x0070
            java.lang.Integer r2 = r2.getMedium()
            if (r2 == 0) goto L_0x0070
            int r2 = r2.intValue()
            goto L_0x0072
        L_0x0070:
            r2 = 55
        L_0x0072:
            r6 = r2
            es.gob.radarcovid.models.response.ResponseSettingsAttenuationFactor r2 = r21.getAttenuationFactor()
            if (r2 == 0) goto L_0x0084
            java.lang.Float r2 = r2.getLow()
            if (r2 == 0) goto L_0x0084
            float r2 = r2.floatValue()
            goto L_0x0086
        L_0x0084:
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x0086:
            r7 = r2
            es.gob.radarcovid.models.response.ResponseSettingsAttenuationFactor r2 = r21.getAttenuationFactor()
            if (r2 == 0) goto L_0x0098
            java.lang.Float r2 = r2.getMedium()
            if (r2 == 0) goto L_0x0098
            float r2 = r2.floatValue()
            goto L_0x009a
        L_0x0098:
            r2 = 1056964608(0x3f000000, float:0.5)
        L_0x009a:
            r8 = r2
            java.lang.Integer r2 = r21.getMinDurationForExposure()
            if (r2 == 0) goto L_0x00a6
            int r2 = r2.intValue()
            goto L_0x00a8
        L_0x00a6:
            r2 = 15
        L_0x00a8:
            r9 = r2
            java.util.List r2 = r21.getRiskScoreClassification()
            if (r2 == 0) goto L_0x0109
            java.util.ArrayList r11 = new java.util.ArrayList
            r13 = 10
            int r13 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5158a(r2, r13)
            r11.<init>(r13)
            java.util.Iterator r2 = r2.iterator()
        L_0x00be:
            boolean r13 = r2.hasNext()
            if (r13 == 0) goto L_0x0107
            java.lang.Object r13 = r2.next()
            es.gob.radarcovid.models.response.ResponseSettingsRiskScore r13 = (p002es.gob.radarcovid.models.response.ResponseSettingsRiskScore) r13
            es.gob.radarcovid.models.domain.SettingsRiskScore r15 = new es.gob.radarcovid.models.domain.SettingsRiskScore
            if (r13 == 0) goto L_0x00f4
            java.lang.String r14 = r13.getLabel()
            if (r14 == 0) goto L_0x00d5
            goto L_0x00d7
        L_0x00d5:
            java.lang.String r14 = "LOW"
        L_0x00d7:
            java.lang.Integer r16 = r13.getMinValue()
            if (r16 == 0) goto L_0x00de
            goto L_0x00e2
        L_0x00de:
            java.lang.Integer r16 = java.lang.Integer.valueOf(r3)
        L_0x00e2:
            r1 = r16
            java.lang.Integer r13 = r13.getMaxValue()
            if (r13 == 0) goto L_0x00eb
            goto L_0x00ef
        L_0x00eb:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
        L_0x00ef:
            r15.<init>(r14, r1, r13)
            r13 = r15
            goto L_0x0103
        L_0x00f4:
            r1 = 0
            r16 = 0
            r17 = 0
            r18 = 7
            r19 = 0
            r14 = r15
            r13 = r15
            r15 = r1
            r14.<init>(r15, r16, r17, r18, r19)
        L_0x0103:
            r11.add(r13)
            goto L_0x00be
        L_0x0107:
            r1 = r11
            goto L_0x010b
        L_0x0109:
            u.n.i r1 = p392u.p393n.C4570i.f10779e
        L_0x010b:
            es.gob.radarcovid.models.response.ResponseSettingsAppVersion r2 = r21.getApplicationVersion()
            es.gob.radarcovid.models.domain.SettingsAppInfo r11 = new es.gob.radarcovid.models.domain.SettingsAppInfo
            if (r2 == 0) goto L_0x0138
            es.gob.radarcovid.models.response.ResponseSettingsAppVersionItem r3 = r2.getAndroid()
            if (r3 == 0) goto L_0x0120
            java.lang.String r3 = r3.getVersion()
            if (r3 == 0) goto L_0x0120
            goto L_0x0122
        L_0x0120:
            java.lang.String r3 = "1.0"
        L_0x0122:
            es.gob.radarcovid.models.response.ResponseSettingsAppVersionItem r2 = r2.getAndroid()
            if (r2 == 0) goto L_0x0133
            java.lang.Integer r2 = r2.getCompilation()
            if (r2 == 0) goto L_0x0133
            int r2 = r2.intValue()
            goto L_0x0134
        L_0x0133:
            r2 = 1
        L_0x0134:
            r11.<init>(r3, r2)
            goto L_0x013d
        L_0x0138:
            r2 = 3
            r13 = 0
            r11.<init>(r13, r3, r2, r13)
        L_0x013d:
            r2 = r12
            r3 = r10
            r10 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r12
        L_0x0144:
            java.lang.String r1 = "responseSettings"
            p392u.p401r.p403c.C4638h.m10271a(r1)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p003f.p004a.p005a.p006a.p009c.C0448i.mo3706a(es.gob.radarcovid.models.response.ResponseSettings):es.gob.radarcovid.models.domain.Settings");
    }

    /* renamed from: a */
    public final SettingsItem mo3707a(ResponseSettingsItem responseSettingsItem) {
        SettingsItem settingsItem;
        float f = 0.0f;
        if (responseSettingsItem != null) {
            int[] iArr = new int[8];
            Integer riskLevelValue1 = responseSettingsItem.getRiskLevelValue1();
            int i = 1;
            iArr[0] = riskLevelValue1 != null ? riskLevelValue1.intValue() : 1;
            Integer riskLevelValue2 = responseSettingsItem.getRiskLevelValue2();
            iArr[1] = riskLevelValue2 != null ? riskLevelValue2.intValue() : 1;
            Integer riskLevelValue3 = responseSettingsItem.getRiskLevelValue3();
            iArr[2] = riskLevelValue3 != null ? riskLevelValue3.intValue() : 1;
            Integer riskLevelValue4 = responseSettingsItem.getRiskLevelValue4();
            iArr[3] = riskLevelValue4 != null ? riskLevelValue4.intValue() : 1;
            Integer riskLevelValue5 = responseSettingsItem.getRiskLevelValue5();
            iArr[4] = riskLevelValue5 != null ? riskLevelValue5.intValue() : 1;
            Integer riskLevelValue6 = responseSettingsItem.getRiskLevelValue6();
            iArr[5] = riskLevelValue6 != null ? riskLevelValue6.intValue() : 1;
            Integer riskLevelValue7 = responseSettingsItem.getRiskLevelValue7();
            iArr[6] = riskLevelValue7 != null ? riskLevelValue7.intValue() : 1;
            Integer riskLevelValue8 = responseSettingsItem.getRiskLevelValue8();
            if (riskLevelValue8 != null) {
                i = riskLevelValue8.intValue();
            }
            iArr[7] = i;
            Float riskLevelWeight = responseSettingsItem.getRiskLevelWeight();
            if (riskLevelWeight != null) {
                f = riskLevelWeight.floatValue();
            }
            settingsItem = new SettingsItem(iArr, f);
        } else {
            settingsItem = new SettingsItem(null, 0.0f, 3, null);
        }
        return settingsItem;
    }
}
