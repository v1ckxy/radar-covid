package p002es.gob.radarcovid.models.response;

import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4636f;

/* renamed from: es.gob.radarcovid.models.response.ResponseQuestionOption */
public final class ResponseQuestionOption {

    /* renamed from: id */
    public final Integer f1778id;
    public final String option;
    public final Integer order;
    public final Boolean other;

    public ResponseQuestionOption() {
        this(null, null, null, null, 15, null);
    }

    public ResponseQuestionOption(Integer num, Integer num2, String str, Boolean bool) {
        this.f1778id = num;
        this.order = num2;
        this.option = str;
        this.other = bool;
    }

    public /* synthetic */ ResponseQuestionOption(Integer num, Integer num2, String str, Boolean bool, int i, C4636f fVar) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            bool = Boolean.valueOf(false);
        }
        this(num, num2, str, bool);
    }

    public static /* synthetic */ ResponseQuestionOption copy$default(ResponseQuestionOption responseQuestionOption, Integer num, Integer num2, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            num = responseQuestionOption.f1778id;
        }
        if ((i & 2) != 0) {
            num2 = responseQuestionOption.order;
        }
        if ((i & 4) != 0) {
            str = responseQuestionOption.option;
        }
        if ((i & 8) != 0) {
            bool = responseQuestionOption.other;
        }
        return responseQuestionOption.copy(num, num2, str, bool);
    }

    public final Integer component1() {
        return this.f1778id;
    }

    public final Integer component2() {
        return this.order;
    }

    public final String component3() {
        return this.option;
    }

    public final Boolean component4() {
        return this.other;
    }

    public final ResponseQuestionOption copy(Integer num, Integer num2, String str, Boolean bool) {
        return new ResponseQuestionOption(num, num2, str, bool);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (p392u.p401r.p403c.C4638h.m10272a((java.lang.Object) r2.other, (java.lang.Object) r3.other) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof p002es.gob.radarcovid.models.response.ResponseQuestionOption
            if (r0 == 0) goto L_0x0031
            es.gob.radarcovid.models.response.ResponseQuestionOption r3 = (p002es.gob.radarcovid.models.response.ResponseQuestionOption) r3
            java.lang.Integer r0 = r2.f1778id
            java.lang.Integer r1 = r3.f1778id
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.Integer r0 = r2.order
            java.lang.Integer r1 = r3.order
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.option
            java.lang.String r1 = r3.option
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.Boolean r0 = r2.other
            java.lang.Boolean r3 = r3.other
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
        throw new UnsupportedOperationException("Method not decompiled: p002es.gob.radarcovid.models.response.ResponseQuestionOption.equals(java.lang.Object):boolean");
    }

    public final Integer getId() {
        return this.f1778id;
    }

    public final String getOption() {
        return this.option;
    }

    public final Integer getOrder() {
        return this.order;
    }

    public final Boolean getOther() {
        return this.other;
    }

    public int hashCode() {
        Integer num = this.f1778id;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.order;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str = this.option;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.other;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("ResponseQuestionOption(id=");
        a.append(this.f1778id);
        a.append(", order=");
        a.append(this.order);
        a.append(", option=");
        a.append(this.option);
        a.append(", other=");
        a.append(this.other);
        a.append(")");
        return a.toString();
    }
}
