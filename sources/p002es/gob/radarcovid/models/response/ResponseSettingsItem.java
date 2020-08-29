package p002es.gob.radarcovid.models.response;

import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4636f;

/* renamed from: es.gob.radarcovid.models.response.ResponseSettingsItem */
public final class ResponseSettingsItem {
    public final Integer riskLevelValue1;
    public final Integer riskLevelValue2;
    public final Integer riskLevelValue3;
    public final Integer riskLevelValue4;
    public final Integer riskLevelValue5;
    public final Integer riskLevelValue6;
    public final Integer riskLevelValue7;
    public final Integer riskLevelValue8;
    public final Float riskLevelWeight;

    public ResponseSettingsItem() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public ResponseSettingsItem(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Float f) {
        this.riskLevelValue1 = num;
        this.riskLevelValue2 = num2;
        this.riskLevelValue3 = num3;
        this.riskLevelValue4 = num4;
        this.riskLevelValue5 = num5;
        this.riskLevelValue6 = num6;
        this.riskLevelValue7 = num7;
        this.riskLevelValue8 = num8;
        this.riskLevelWeight = f;
    }

    public /* synthetic */ ResponseSettingsItem(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Float f, int i, C4636f fVar) {
        int i2 = i;
        int i3 = i2 & 1;
        Integer valueOf = Integer.valueOf(0);
        Integer num9 = i3 != 0 ? valueOf : num;
        Integer num10 = (i2 & 2) != 0 ? valueOf : num2;
        Integer num11 = (i2 & 4) != 0 ? valueOf : num3;
        Integer num12 = (i2 & 8) != 0 ? valueOf : num4;
        Integer num13 = (i2 & 16) != 0 ? valueOf : num5;
        Integer num14 = (i2 & 32) != 0 ? valueOf : num6;
        Integer num15 = (i2 & 64) != 0 ? valueOf : num7;
        if ((i2 & 128) == 0) {
            valueOf = num8;
        }
        this(num9, num10, num11, num12, num13, num14, num15, valueOf, (i2 & 256) != 0 ? Float.valueOf(0.0f) : f);
    }

    public static /* synthetic */ ResponseSettingsItem copy$default(ResponseSettingsItem responseSettingsItem, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Float f, int i, Object obj) {
        ResponseSettingsItem responseSettingsItem2 = responseSettingsItem;
        int i2 = i;
        return responseSettingsItem.copy((i2 & 1) != 0 ? responseSettingsItem2.riskLevelValue1 : num, (i2 & 2) != 0 ? responseSettingsItem2.riskLevelValue2 : num2, (i2 & 4) != 0 ? responseSettingsItem2.riskLevelValue3 : num3, (i2 & 8) != 0 ? responseSettingsItem2.riskLevelValue4 : num4, (i2 & 16) != 0 ? responseSettingsItem2.riskLevelValue5 : num5, (i2 & 32) != 0 ? responseSettingsItem2.riskLevelValue6 : num6, (i2 & 64) != 0 ? responseSettingsItem2.riskLevelValue7 : num7, (i2 & 128) != 0 ? responseSettingsItem2.riskLevelValue8 : num8, (i2 & 256) != 0 ? responseSettingsItem2.riskLevelWeight : f);
    }

    public final Integer component1() {
        return this.riskLevelValue1;
    }

    public final Integer component2() {
        return this.riskLevelValue2;
    }

    public final Integer component3() {
        return this.riskLevelValue3;
    }

    public final Integer component4() {
        return this.riskLevelValue4;
    }

    public final Integer component5() {
        return this.riskLevelValue5;
    }

    public final Integer component6() {
        return this.riskLevelValue6;
    }

    public final Integer component7() {
        return this.riskLevelValue7;
    }

    public final Integer component8() {
        return this.riskLevelValue8;
    }

    public final Float component9() {
        return this.riskLevelWeight;
    }

    public final ResponseSettingsItem copy(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Float f) {
        ResponseSettingsItem responseSettingsItem = new ResponseSettingsItem(num, num2, num3, num4, num5, num6, num7, num8, f);
        return responseSettingsItem;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0060, code lost:
        if (p392u.p401r.p403c.C4638h.m10272a((java.lang.Object) r2.riskLevelWeight, (java.lang.Object) r3.riskLevelWeight) != false) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0065
            boolean r0 = r3 instanceof p002es.gob.radarcovid.models.response.ResponseSettingsItem
            if (r0 == 0) goto L_0x0063
            es.gob.radarcovid.models.response.ResponseSettingsItem r3 = (p002es.gob.radarcovid.models.response.ResponseSettingsItem) r3
            java.lang.Integer r0 = r2.riskLevelValue1
            java.lang.Integer r1 = r3.riskLevelValue1
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x0063
            java.lang.Integer r0 = r2.riskLevelValue2
            java.lang.Integer r1 = r3.riskLevelValue2
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x0063
            java.lang.Integer r0 = r2.riskLevelValue3
            java.lang.Integer r1 = r3.riskLevelValue3
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x0063
            java.lang.Integer r0 = r2.riskLevelValue4
            java.lang.Integer r1 = r3.riskLevelValue4
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x0063
            java.lang.Integer r0 = r2.riskLevelValue5
            java.lang.Integer r1 = r3.riskLevelValue5
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x0063
            java.lang.Integer r0 = r2.riskLevelValue6
            java.lang.Integer r1 = r3.riskLevelValue6
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x0063
            java.lang.Integer r0 = r2.riskLevelValue7
            java.lang.Integer r1 = r3.riskLevelValue7
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x0063
            java.lang.Integer r0 = r2.riskLevelValue8
            java.lang.Integer r1 = r3.riskLevelValue8
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x0063
            java.lang.Float r0 = r2.riskLevelWeight
            java.lang.Float r3 = r3.riskLevelWeight
            boolean r3 = p392u.p401r.p403c.C4638h.m10272a(r0, r3)
            if (r3 == 0) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r3 = 0
            return r3
        L_0x0065:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p002es.gob.radarcovid.models.response.ResponseSettingsItem.equals(java.lang.Object):boolean");
    }

    public final Integer getRiskLevelValue1() {
        return this.riskLevelValue1;
    }

    public final Integer getRiskLevelValue2() {
        return this.riskLevelValue2;
    }

    public final Integer getRiskLevelValue3() {
        return this.riskLevelValue3;
    }

    public final Integer getRiskLevelValue4() {
        return this.riskLevelValue4;
    }

    public final Integer getRiskLevelValue5() {
        return this.riskLevelValue5;
    }

    public final Integer getRiskLevelValue6() {
        return this.riskLevelValue6;
    }

    public final Integer getRiskLevelValue7() {
        return this.riskLevelValue7;
    }

    public final Integer getRiskLevelValue8() {
        return this.riskLevelValue8;
    }

    public final Float getRiskLevelWeight() {
        return this.riskLevelWeight;
    }

    public int hashCode() {
        Integer num = this.riskLevelValue1;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.riskLevelValue2;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.riskLevelValue3;
        int hashCode3 = (hashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = this.riskLevelValue4;
        int hashCode4 = (hashCode3 + (num4 != null ? num4.hashCode() : 0)) * 31;
        Integer num5 = this.riskLevelValue5;
        int hashCode5 = (hashCode4 + (num5 != null ? num5.hashCode() : 0)) * 31;
        Integer num6 = this.riskLevelValue6;
        int hashCode6 = (hashCode5 + (num6 != null ? num6.hashCode() : 0)) * 31;
        Integer num7 = this.riskLevelValue7;
        int hashCode7 = (hashCode6 + (num7 != null ? num7.hashCode() : 0)) * 31;
        Integer num8 = this.riskLevelValue8;
        int hashCode8 = (hashCode7 + (num8 != null ? num8.hashCode() : 0)) * 31;
        Float f = this.riskLevelWeight;
        if (f != null) {
            i = f.hashCode();
        }
        return hashCode8 + i;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("ResponseSettingsItem(riskLevelValue1=");
        a.append(this.riskLevelValue1);
        a.append(", riskLevelValue2=");
        a.append(this.riskLevelValue2);
        a.append(", riskLevelValue3=");
        a.append(this.riskLevelValue3);
        a.append(", riskLevelValue4=");
        a.append(this.riskLevelValue4);
        a.append(", riskLevelValue5=");
        a.append(this.riskLevelValue5);
        a.append(", riskLevelValue6=");
        a.append(this.riskLevelValue6);
        a.append(", riskLevelValue7=");
        a.append(this.riskLevelValue7);
        a.append(", riskLevelValue8=");
        a.append(this.riskLevelValue8);
        a.append(", riskLevelWeight=");
        a.append(this.riskLevelWeight);
        a.append(")");
        return a.toString();
    }
}
