package p002es.gob.radarcovid.models.response.entity;

import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4638h;

/* renamed from: es.gob.radarcovid.models.response.entity.RiskScoreClassificationEntity */
public final class RiskScoreClassificationEntity {
    public final String label;
    public final int maxValue;
    public final int minValue;

    public RiskScoreClassificationEntity(String str, int i, int i2) {
        if (str != null) {
            this.label = str;
            this.minValue = i;
            this.maxValue = i2;
            return;
        }
        C4638h.m10271a("label");
        throw null;
    }

    public static /* synthetic */ RiskScoreClassificationEntity copy$default(RiskScoreClassificationEntity riskScoreClassificationEntity, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = riskScoreClassificationEntity.label;
        }
        if ((i3 & 2) != 0) {
            i = riskScoreClassificationEntity.minValue;
        }
        if ((i3 & 4) != 0) {
            i2 = riskScoreClassificationEntity.maxValue;
        }
        return riskScoreClassificationEntity.copy(str, i, i2);
    }

    public final String component1() {
        return this.label;
    }

    public final int component2() {
        return this.minValue;
    }

    public final int component3() {
        return this.maxValue;
    }

    public final RiskScoreClassificationEntity copy(String str, int i, int i2) {
        if (str != null) {
            return new RiskScoreClassificationEntity(str, i, i2);
        }
        C4638h.m10271a("label");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r2.maxValue == r3.maxValue) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0021
            boolean r0 = r3 instanceof p002es.gob.radarcovid.models.response.entity.RiskScoreClassificationEntity
            if (r0 == 0) goto L_0x001f
            es.gob.radarcovid.models.response.entity.RiskScoreClassificationEntity r3 = (p002es.gob.radarcovid.models.response.entity.RiskScoreClassificationEntity) r3
            java.lang.String r0 = r2.label
            java.lang.String r1 = r3.label
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x001f
            int r0 = r2.minValue
            int r1 = r3.minValue
            if (r0 != r1) goto L_0x001f
            int r0 = r2.maxValue
            int r3 = r3.maxValue
            if (r0 != r3) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            r3 = 0
            return r3
        L_0x0021:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p002es.gob.radarcovid.models.response.entity.RiskScoreClassificationEntity.equals(java.lang.Object):boolean");
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getMaxValue() {
        return this.maxValue;
    }

    public final int getMinValue() {
        return this.minValue;
    }

    public int hashCode() {
        String str = this.label;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.minValue) * 31) + this.maxValue;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("RiskScoreClassificationEntity(label=");
        a.append(this.label);
        a.append(", minValue=");
        a.append(this.minValue);
        a.append(", maxValue=");
        return C1965a.m4753a(a, this.maxValue, ")");
    }
}
