package p002es.gob.radarcovid.models.domain;

import java.util.List;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p393n.C4570i;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;

/* renamed from: es.gob.radarcovid.models.domain.Question */
public final class Question {
    public final List<Answer> answers;

    /* renamed from: id */
    public final int f1775id;
    public final boolean isMandatory;
    public final int maxValue;
    public final int minValue;
    public final Integer parentAnswerId;
    public final Integer parentQuestionId;
    public final String question;
    public final Type type;

    /* renamed from: es.gob.radarcovid.models.domain.Question$Type */
    public enum Type {
        RATE,
        SINGLE_SELECTION,
        MULTIPLE_SELECTION,
        FIELD
    }

    public Question() {
        this(0, null, null, null, 0, 0, false, null, null, 511, null);
    }

    public Question(int i, Type type2, String str, List<Answer> list, int i2, int i3, boolean z, Integer num, Integer num2) {
        if (type2 == null) {
            C4638h.m10271a("type");
            throw null;
        } else if (str == null) {
            C4638h.m10271a("question");
            throw null;
        } else if (list != null) {
            this.f1775id = i;
            this.type = type2;
            this.question = str;
            this.answers = list;
            this.minValue = i2;
            this.maxValue = i3;
            this.isMandatory = z;
            this.parentQuestionId = num;
            this.parentAnswerId = num2;
        } else {
            C4638h.m10271a("answers");
            throw null;
        }
    }

    public static /* synthetic */ Question copy$default(Question question2, int i, Type type2, String str, List list, int i2, int i3, boolean z, Integer num, Integer num2, int i4, Object obj) {
        Question question3 = question2;
        int i5 = i4;
        return question2.copy((i5 & 1) != 0 ? question3.f1775id : i, (i5 & 2) != 0 ? question3.type : type2, (i5 & 4) != 0 ? question3.question : str, (i5 & 8) != 0 ? question3.answers : list, (i5 & 16) != 0 ? question3.minValue : i2, (i5 & 32) != 0 ? question3.maxValue : i3, (i5 & 64) != 0 ? question3.isMandatory : z, (i5 & 128) != 0 ? question3.parentQuestionId : num, (i5 & 256) != 0 ? question3.parentAnswerId : num2);
    }

    public final int component1() {
        return this.f1775id;
    }

    public final Type component2() {
        return this.type;
    }

    public final String component3() {
        return this.question;
    }

    public final List<Answer> component4() {
        return this.answers;
    }

    public final int component5() {
        return this.minValue;
    }

    public final int component6() {
        return this.maxValue;
    }

    public final boolean component7() {
        return this.isMandatory;
    }

    public final Integer component8() {
        return this.parentQuestionId;
    }

    public final Integer component9() {
        return this.parentAnswerId;
    }

    public final Question copy(int i, Type type2, String str, List<Answer> list, int i2, int i3, boolean z, Integer num, Integer num2) {
        if (type2 == null) {
            C4638h.m10271a("type");
            throw null;
        } else if (str == null) {
            C4638h.m10271a("question");
            throw null;
        } else if (list != null) {
            Question question2 = new Question(i, type2, str, list, i2, i3, z, num, num2);
            return question2;
        } else {
            C4638h.m10271a("answers");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        if (p392u.p401r.p403c.C4638h.m10272a((java.lang.Object) r2.parentAnswerId, (java.lang.Object) r3.parentAnswerId) != false) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0055
            boolean r0 = r3 instanceof p002es.gob.radarcovid.models.domain.Question
            if (r0 == 0) goto L_0x0053
            es.gob.radarcovid.models.domain.Question r3 = (p002es.gob.radarcovid.models.domain.Question) r3
            int r0 = r2.f1775id
            int r1 = r3.f1775id
            if (r0 != r1) goto L_0x0053
            es.gob.radarcovid.models.domain.Question$Type r0 = r2.type
            es.gob.radarcovid.models.domain.Question$Type r1 = r3.type
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x0053
            java.lang.String r0 = r2.question
            java.lang.String r1 = r3.question
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x0053
            java.util.List<es.gob.radarcovid.models.domain.Answer> r0 = r2.answers
            java.util.List<es.gob.radarcovid.models.domain.Answer> r1 = r3.answers
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x0053
            int r0 = r2.minValue
            int r1 = r3.minValue
            if (r0 != r1) goto L_0x0053
            int r0 = r2.maxValue
            int r1 = r3.maxValue
            if (r0 != r1) goto L_0x0053
            boolean r0 = r2.isMandatory
            boolean r1 = r3.isMandatory
            if (r0 != r1) goto L_0x0053
            java.lang.Integer r0 = r2.parentQuestionId
            java.lang.Integer r1 = r3.parentQuestionId
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x0053
            java.lang.Integer r0 = r2.parentAnswerId
            java.lang.Integer r3 = r3.parentAnswerId
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
        throw new UnsupportedOperationException("Method not decompiled: p002es.gob.radarcovid.models.domain.Question.equals(java.lang.Object):boolean");
    }

    public final List<Answer> getAnswers() {
        return this.answers;
    }

    public final int getId() {
        return this.f1775id;
    }

    public final int getMaxValue() {
        return this.maxValue;
    }

    public final int getMinValue() {
        return this.minValue;
    }

    public final Integer getParentAnswerId() {
        return this.parentAnswerId;
    }

    public final Integer getParentQuestionId() {
        return this.parentQuestionId;
    }

    public final String getQuestion() {
        return this.question;
    }

    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        int i = this.f1775id * 31;
        Type type2 = this.type;
        int i2 = 0;
        int hashCode = (i + (type2 != null ? type2.hashCode() : 0)) * 31;
        String str = this.question;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<Answer> list = this.answers;
        int hashCode3 = (((((hashCode2 + (list != null ? list.hashCode() : 0)) * 31) + this.minValue) * 31) + this.maxValue) * 31;
        boolean z = this.isMandatory;
        if (z) {
            z = true;
        }
        int i3 = (hashCode3 + (z ? 1 : 0)) * 31;
        Integer num = this.parentQuestionId;
        int hashCode4 = (i3 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.parentAnswerId;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        return hashCode4 + i2;
    }

    public final boolean isMandatory() {
        return this.isMandatory;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("Question(id=");
        a.append(this.f1775id);
        a.append(", type=");
        a.append(this.type);
        a.append(", question=");
        a.append(this.question);
        a.append(", answers=");
        a.append(this.answers);
        a.append(", minValue=");
        a.append(this.minValue);
        a.append(", maxValue=");
        a.append(this.maxValue);
        a.append(", isMandatory=");
        a.append(this.isMandatory);
        a.append(", parentQuestionId=");
        a.append(this.parentQuestionId);
        a.append(", parentAnswerId=");
        a.append(this.parentAnswerId);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ Question(int i, Type type2, String str, List list, int i2, int i3, boolean z, Integer num, Integer num2, int i4, C4636f fVar) {
        int i5 = i4;
        int i6 = i5 & 1;
        int i7 = -1;
        Integer valueOf = Integer.valueOf(-1);
        if (i6 == 0) {
            i7 = i;
        }
        Type type3 = (i5 & 2) != 0 ? Type.RATE : type2;
        String str2 = (i5 & 4) != 0 ? Objects.EMPTY_STRING : str;
        List list2 = (i5 & 8) != 0 ? C4570i.f10779e : list;
        boolean z2 = false;
        int i8 = (i5 & 16) != 0 ? 0 : i2;
        int i9 = (i5 & 32) != 0 ? 0 : i3;
        if ((i5 & 64) == 0) {
            z2 = z;
        }
        Integer num3 = (i5 & 128) != 0 ? valueOf : num;
        if ((i5 & 256) == 0) {
            valueOf = num2;
        }
        this(i7, type3, str2, list2, i8, i9, z2, num3, valueOf);
    }
}
