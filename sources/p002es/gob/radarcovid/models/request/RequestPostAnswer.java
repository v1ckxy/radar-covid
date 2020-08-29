package p002es.gob.radarcovid.models.request;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;

/* renamed from: es.gob.radarcovid.models.request.RequestPostAnswer */
public final class RequestPostAnswer {
    public final String answer;
    public final int option;
    public final int question;

    public RequestPostAnswer() {
        this(0, 0, null, 7, null);
    }

    public RequestPostAnswer(int i, int i2, String str) {
        if (str != null) {
            this.question = i;
            this.option = i2;
            this.answer = str;
            return;
        }
        C4638h.m10271a("answer");
        throw null;
    }

    public /* synthetic */ RequestPostAnswer(int i, int i2, String str, int i3, C4636f fVar) {
        if ((i3 & 1) != 0) {
            i = -1;
        }
        if ((i3 & 2) != 0) {
            i2 = -1;
        }
        if ((i3 & 4) != 0) {
            str = Objects.EMPTY_STRING;
        }
        this(i, i2, str);
    }

    public static /* synthetic */ RequestPostAnswer copy$default(RequestPostAnswer requestPostAnswer, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = requestPostAnswer.question;
        }
        if ((i3 & 2) != 0) {
            i2 = requestPostAnswer.option;
        }
        if ((i3 & 4) != 0) {
            str = requestPostAnswer.answer;
        }
        return requestPostAnswer.copy(i, i2, str);
    }

    public final int component1() {
        return this.question;
    }

    public final int component2() {
        return this.option;
    }

    public final String component3() {
        return this.answer;
    }

    public final RequestPostAnswer copy(int i, int i2, String str) {
        if (str != null) {
            return new RequestPostAnswer(i, i2, str);
        }
        C4638h.m10271a("answer");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (p392u.p401r.p403c.C4638h.m10272a((java.lang.Object) r2.answer, (java.lang.Object) r3.answer) != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0021
            boolean r0 = r3 instanceof p002es.gob.radarcovid.models.request.RequestPostAnswer
            if (r0 == 0) goto L_0x001f
            es.gob.radarcovid.models.request.RequestPostAnswer r3 = (p002es.gob.radarcovid.models.request.RequestPostAnswer) r3
            int r0 = r2.question
            int r1 = r3.question
            if (r0 != r1) goto L_0x001f
            int r0 = r2.option
            int r1 = r3.option
            if (r0 != r1) goto L_0x001f
            java.lang.String r0 = r2.answer
            java.lang.String r3 = r3.answer
            boolean r3 = p392u.p401r.p403c.C4638h.m10272a(r0, r3)
            if (r3 == 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            r3 = 0
            return r3
        L_0x0021:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p002es.gob.radarcovid.models.request.RequestPostAnswer.equals(java.lang.Object):boolean");
    }

    public final String getAnswer() {
        return this.answer;
    }

    public final int getOption() {
        return this.option;
    }

    public final int getQuestion() {
        return this.question;
    }

    public int hashCode() {
        int i = ((this.question * 31) + this.option) * 31;
        String str = this.answer;
        return i + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("RequestPostAnswer(question=");
        a.append(this.question);
        a.append(", option=");
        a.append(this.option);
        a.append(", answer=");
        return C1965a.m4754a(a, this.answer, ")");
    }
}
