package p002es.gob.radarcovid.models.response;

import java.util.List;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4636f;

/* renamed from: es.gob.radarcovid.models.response.ResponseQuestion */
public final class ResponseQuestion {

    /* renamed from: id */
    public final Integer f1777id;
    public final Boolean mandatory;
    public final Integer maxValue;
    public final Integer minValue;
    public final List<ResponseQuestionOption> options;
    public final Integer order;
    public final Integer parentId;
    public final Integer parentOptionId;
    public final String question;
    public final String questionType;

    public ResponseQuestion() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public ResponseQuestion(Integer num, Integer num2, String str, String str2, List<ResponseQuestionOption> list, Integer num3, Integer num4, Boolean bool, Integer num5, Integer num6) {
        this.f1777id = num;
        this.order = num2;
        this.question = str;
        this.questionType = str2;
        this.options = list;
        this.minValue = num3;
        this.maxValue = num4;
        this.mandatory = bool;
        this.parentId = num5;
        this.parentOptionId = num6;
    }

    public /* synthetic */ ResponseQuestion(Integer num, Integer num2, String str, String str2, List list, Integer num3, Integer num4, Boolean bool, Integer num5, Integer num6, int i, C4636f fVar) {
        int i2 = i;
        Boolean bool2 = null;
        Integer num7 = (i2 & 1) != 0 ? null : num;
        Integer num8 = (i2 & 2) != 0 ? null : num2;
        String str3 = (i2 & 4) != 0 ? null : str;
        String str4 = (i2 & 8) != 0 ? null : str2;
        List list2 = (i2 & 16) != 0 ? null : list;
        Integer num9 = (i2 & 32) != 0 ? null : num3;
        Integer num10 = (i2 & 64) != 0 ? null : num4;
        if ((i2 & 128) == 0) {
            bool2 = bool;
        }
        this(num7, num8, str3, str4, list2, num9, num10, bool2, (i2 & 256) != 0 ? Integer.valueOf(-1) : num5, (i2 & 512) != 0 ? Integer.valueOf(-1) : num6);
    }

    public static /* synthetic */ ResponseQuestion copy$default(ResponseQuestion responseQuestion, Integer num, Integer num2, String str, String str2, List list, Integer num3, Integer num4, Boolean bool, Integer num5, Integer num6, int i, Object obj) {
        ResponseQuestion responseQuestion2 = responseQuestion;
        int i2 = i;
        return responseQuestion.copy((i2 & 1) != 0 ? responseQuestion2.f1777id : num, (i2 & 2) != 0 ? responseQuestion2.order : num2, (i2 & 4) != 0 ? responseQuestion2.question : str, (i2 & 8) != 0 ? responseQuestion2.questionType : str2, (i2 & 16) != 0 ? responseQuestion2.options : list, (i2 & 32) != 0 ? responseQuestion2.minValue : num3, (i2 & 64) != 0 ? responseQuestion2.maxValue : num4, (i2 & 128) != 0 ? responseQuestion2.mandatory : bool, (i2 & 256) != 0 ? responseQuestion2.parentId : num5, (i2 & 512) != 0 ? responseQuestion2.parentOptionId : num6);
    }

    public final Integer component1() {
        return this.f1777id;
    }

    public final Integer component10() {
        return this.parentOptionId;
    }

    public final Integer component2() {
        return this.order;
    }

    public final String component3() {
        return this.question;
    }

    public final String component4() {
        return this.questionType;
    }

    public final List<ResponseQuestionOption> component5() {
        return this.options;
    }

    public final Integer component6() {
        return this.minValue;
    }

    public final Integer component7() {
        return this.maxValue;
    }

    public final Boolean component8() {
        return this.mandatory;
    }

    public final Integer component9() {
        return this.parentId;
    }

    public final ResponseQuestion copy(Integer num, Integer num2, String str, String str2, List<ResponseQuestionOption> list, Integer num3, Integer num4, Boolean bool, Integer num5, Integer num6) {
        ResponseQuestion responseQuestion = new ResponseQuestion(num, num2, str, str2, list, num3, num4, bool, num5, num6);
        return responseQuestion;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        if (p392u.p401r.p403c.C4638h.m10272a((java.lang.Object) r2.parentOptionId, (java.lang.Object) r3.parentOptionId) != false) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x006f
            boolean r0 = r3 instanceof p002es.gob.radarcovid.models.response.ResponseQuestion
            if (r0 == 0) goto L_0x006d
            es.gob.radarcovid.models.response.ResponseQuestion r3 = (p002es.gob.radarcovid.models.response.ResponseQuestion) r3
            java.lang.Integer r0 = r2.f1777id
            java.lang.Integer r1 = r3.f1777id
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x006d
            java.lang.Integer r0 = r2.order
            java.lang.Integer r1 = r3.order
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = r2.question
            java.lang.String r1 = r3.question
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = r2.questionType
            java.lang.String r1 = r3.questionType
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x006d
            java.util.List<es.gob.radarcovid.models.response.ResponseQuestionOption> r0 = r2.options
            java.util.List<es.gob.radarcovid.models.response.ResponseQuestionOption> r1 = r3.options
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x006d
            java.lang.Integer r0 = r2.minValue
            java.lang.Integer r1 = r3.minValue
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x006d
            java.lang.Integer r0 = r2.maxValue
            java.lang.Integer r1 = r3.maxValue
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x006d
            java.lang.Boolean r0 = r2.mandatory
            java.lang.Boolean r1 = r3.mandatory
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x006d
            java.lang.Integer r0 = r2.parentId
            java.lang.Integer r1 = r3.parentId
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x006d
            java.lang.Integer r0 = r2.parentOptionId
            java.lang.Integer r3 = r3.parentOptionId
            boolean r3 = p392u.p401r.p403c.C4638h.m10272a(r0, r3)
            if (r3 == 0) goto L_0x006d
            goto L_0x006f
        L_0x006d:
            r3 = 0
            return r3
        L_0x006f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p002es.gob.radarcovid.models.response.ResponseQuestion.equals(java.lang.Object):boolean");
    }

    public final Integer getId() {
        return this.f1777id;
    }

    public final Boolean getMandatory() {
        return this.mandatory;
    }

    public final Integer getMaxValue() {
        return this.maxValue;
    }

    public final Integer getMinValue() {
        return this.minValue;
    }

    public final List<ResponseQuestionOption> getOptions() {
        return this.options;
    }

    public final Integer getOrder() {
        return this.order;
    }

    public final Integer getParentId() {
        return this.parentId;
    }

    public final Integer getParentOptionId() {
        return this.parentOptionId;
    }

    public final String getQuestion() {
        return this.question;
    }

    public final String getQuestionType() {
        return this.questionType;
    }

    public int hashCode() {
        Integer num = this.f1777id;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.order;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str = this.question;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.questionType;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<ResponseQuestionOption> list = this.options;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        Integer num3 = this.minValue;
        int hashCode6 = (hashCode5 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = this.maxValue;
        int hashCode7 = (hashCode6 + (num4 != null ? num4.hashCode() : 0)) * 31;
        Boolean bool = this.mandatory;
        int hashCode8 = (hashCode7 + (bool != null ? bool.hashCode() : 0)) * 31;
        Integer num5 = this.parentId;
        int hashCode9 = (hashCode8 + (num5 != null ? num5.hashCode() : 0)) * 31;
        Integer num6 = this.parentOptionId;
        if (num6 != null) {
            i = num6.hashCode();
        }
        return hashCode9 + i;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("ResponseQuestion(id=");
        a.append(this.f1777id);
        a.append(", order=");
        a.append(this.order);
        a.append(", question=");
        a.append(this.question);
        a.append(", questionType=");
        a.append(this.questionType);
        a.append(", options=");
        a.append(this.options);
        a.append(", minValue=");
        a.append(this.minValue);
        a.append(", maxValue=");
        a.append(this.maxValue);
        a.append(", mandatory=");
        a.append(this.mandatory);
        a.append(", parentId=");
        a.append(this.parentId);
        a.append(", parentOptionId=");
        a.append(this.parentOptionId);
        a.append(")");
        return a.toString();
    }
}
