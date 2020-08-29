package p002es.gob.radarcovid.models.domain;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;

/* renamed from: es.gob.radarcovid.models.domain.Answer */
public final class Answer {
    public final String answer;

    /* renamed from: id */
    public final int f1774id;

    public Answer() {
        this(0, null, 3, null);
    }

    public Answer(int i, String str) {
        if (str != null) {
            this.f1774id = i;
            this.answer = str;
            return;
        }
        C4638h.m10271a("answer");
        throw null;
    }

    public /* synthetic */ Answer(int i, String str, int i2, C4636f fVar) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        if ((i2 & 2) != 0) {
            str = Objects.EMPTY_STRING;
        }
        this(i, str);
    }

    public static /* synthetic */ Answer copy$default(Answer answer2, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = answer2.f1774id;
        }
        if ((i2 & 2) != 0) {
            str = answer2.answer;
        }
        return answer2.copy(i, str);
    }

    public final int component1() {
        return this.f1774id;
    }

    public final String component2() {
        return this.answer;
    }

    public final Answer copy(int i, String str) {
        if (str != null) {
            return new Answer(i, str);
        }
        C4638h.m10271a("answer");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (p392u.p401r.p403c.C4638h.m10272a((java.lang.Object) r2.answer, (java.lang.Object) r3.answer) != false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001b
            boolean r0 = r3 instanceof p002es.gob.radarcovid.models.domain.Answer
            if (r0 == 0) goto L_0x0019
            es.gob.radarcovid.models.domain.Answer r3 = (p002es.gob.radarcovid.models.domain.Answer) r3
            int r0 = r2.f1774id
            int r1 = r3.f1774id
            if (r0 != r1) goto L_0x0019
            java.lang.String r0 = r2.answer
            java.lang.String r3 = r3.answer
            boolean r3 = p392u.p401r.p403c.C4638h.m10272a(r0, r3)
            if (r3 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r3 = 0
            return r3
        L_0x001b:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p002es.gob.radarcovid.models.domain.Answer.equals(java.lang.Object):boolean");
    }

    public final String getAnswer() {
        return this.answer;
    }

    public final int getId() {
        return this.f1774id;
    }

    public int hashCode() {
        int i = this.f1774id * 31;
        String str = this.answer;
        return i + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("Answer(id=");
        a.append(this.f1774id);
        a.append(", answer=");
        return C1965a.m4754a(a, this.answer, ")");
    }
}
