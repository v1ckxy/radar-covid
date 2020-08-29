package p003f.p004a.p005a.p006a.p009c;

import java.util.Comparator;
import p002es.gob.radarcovid.models.response.ResponseQuestion;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: f.a.a.a.c.e */
public final class C0443e {

    /* renamed from: f.a.a.a.c.e$a */
    public static final class C0444a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C2286e.m5157a(((ResponseQuestion) t).getOrder(), ((ResponseQuestion) t2).getOrder());
        }
    }

    /* JADX WARNING: type inference failed for: r10v1, types: [u.n.i] */
    /* JADX WARNING: type inference failed for: r10v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r11v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r10v7, types: [java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r10v8 */
    /* JADX WARNING: type inference failed for: r10v9 */
    /* JADX WARNING: type inference failed for: r10v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x016a A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<p002es.gob.radarcovid.models.domain.Question> mo3702a(p002es.gob.radarcovid.models.response.ResponseQuestions r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 0
            if (r0 == 0) goto L_0x0187
            f.a.a.a.c.e$a r2 = new f.a.a.a.c.e$a
            r2.<init>()
            java.util.List r0 = p392u.p393n.C4568g.m10216a(r0, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0017:
            boolean r3 = r0.hasNext()
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0046
            java.lang.Object r3 = r0.next()
            r6 = r3
            es.gob.radarcovid.models.response.ResponseQuestion r6 = (p002es.gob.radarcovid.models.response.ResponseQuestion) r6
            java.lang.String r6 = r6.getQuestionType()
            if (r6 != 0) goto L_0x002d
            goto L_0x0040
        L_0x002d:
            int r7 = r6.hashCode()
            r8 = -66646941(0xfffffffffc070c63, float:-2.8048452E36)
            if (r7 == r8) goto L_0x0037
            goto L_0x0040
        L_0x0037:
            java.lang.String r7 = "OPEN_ENDED_NUMBER"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0040
            r4 = r5
        L_0x0040:
            if (r4 == 0) goto L_0x0017
            r2.add(r3)
            goto L_0x0017
        L_0x0046:
            java.util.ArrayList r0 = new java.util.ArrayList
            r3 = 10
            int r6 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5158a(r2, r3)
            r0.<init>(r6)
            java.util.Iterator r2 = r2.iterator()
        L_0x0055:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0186
            java.lang.Object r6 = r2.next()
            es.gob.radarcovid.models.response.ResponseQuestion r6 = (p002es.gob.radarcovid.models.response.ResponseQuestion) r6
            if (r6 == 0) goto L_0x0180
            es.gob.radarcovid.models.domain.Question r15 = new es.gob.radarcovid.models.domain.Question
            java.lang.Integer r7 = r6.getId()
            r8 = -1
            if (r7 == 0) goto L_0x0072
            int r7 = r7.intValue()
            r9 = r7
            goto L_0x0073
        L_0x0072:
            r9 = r8
        L_0x0073:
            java.lang.String r7 = r6.getQuestionType()
            java.lang.String r10 = "OPEN_ENDED_TEXT"
            if (r7 != 0) goto L_0x007c
            goto L_0x00af
        L_0x007c:
            int r11 = r7.hashCode()
            r12 = -1975322425(0xffffffff8a42f8c7, float:-9.38755E-33)
            if (r11 == r12) goto L_0x00a6
            r12 = -1378308088(0xffffffffadd8b008, float:-2.463453E-11)
            if (r11 == r12) goto L_0x009b
            r12 = 1121961648(0x42dfc6b0, float:111.88806)
            if (r11 == r12) goto L_0x0090
            goto L_0x00af
        L_0x0090:
            java.lang.String r11 = "MULTIPLE_CHOICE"
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L_0x00af
            es.gob.radarcovid.models.domain.Question$Type r7 = p002es.gob.radarcovid.models.domain.Question.Type.MULTIPLE_SELECTION
            goto L_0x00b1
        L_0x009b:
            java.lang.String r11 = "RATING_SCALE"
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L_0x00af
            es.gob.radarcovid.models.domain.Question$Type r7 = p002es.gob.radarcovid.models.domain.Question.Type.RATE
            goto L_0x00b1
        L_0x00a6:
            boolean r7 = r7.equals(r10)
            if (r7 == 0) goto L_0x00af
            es.gob.radarcovid.models.domain.Question$Type r7 = p002es.gob.radarcovid.models.domain.Question.Type.FIELD
            goto L_0x00b1
        L_0x00af:
            es.gob.radarcovid.models.domain.Question$Type r7 = p002es.gob.radarcovid.models.domain.Question.Type.SINGLE_SELECTION
        L_0x00b1:
            r11 = r7
            java.lang.String r7 = r6.getQuestion()
            java.lang.String r12 = ""
            if (r7 == 0) goto L_0x00bc
            r13 = r7
            goto L_0x00bd
        L_0x00bc:
            r13 = r12
        L_0x00bd:
            java.lang.String r7 = r6.getQuestionType()
            boolean r7 = p392u.p401r.p403c.C4638h.m10272a(r7, r10)
            if (r7 == 0) goto L_0x00dd
            es.gob.radarcovid.models.domain.Answer[] r7 = new p002es.gob.radarcovid.models.domain.Answer[r4]
            es.gob.radarcovid.models.domain.Answer r10 = new es.gob.radarcovid.models.domain.Answer
            r12 = 2
            r10.<init>(r5, r1, r12, r1)
            r7[r5] = r10
            java.util.ArrayList r10 = new java.util.ArrayList
            u.n.a r12 = new u.n.a
            r12.<init>(r7, r4)
            r10.<init>(r12)
        L_0x00db:
            r3 = r10
            goto L_0x012c
        L_0x00dd:
            java.util.List r7 = r6.getOptions()
            if (r7 == 0) goto L_0x0129
            f.a.a.a.c.f r10 = new f.a.a.a.c.f
            r10.<init>()
            java.util.List r7 = p392u.p393n.C4568g.m10216a(r7, r10)
            if (r7 == 0) goto L_0x0129
            java.util.ArrayList r10 = new java.util.ArrayList
            int r14 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5158a(r7, r3)
            r10.<init>(r14)
            java.util.Iterator r7 = r7.iterator()
        L_0x00fb:
            boolean r14 = r7.hasNext()
            if (r14 == 0) goto L_0x00db
            java.lang.Object r14 = r7.next()
            es.gob.radarcovid.models.response.ResponseQuestionOption r14 = (p002es.gob.radarcovid.models.response.ResponseQuestionOption) r14
            es.gob.radarcovid.models.domain.Answer r3 = new es.gob.radarcovid.models.domain.Answer
            java.lang.Integer r16 = r14.getId()
            if (r16 == 0) goto L_0x0116
            int r16 = r16.intValue()
            r4 = r16
            goto L_0x0117
        L_0x0116:
            r4 = r8
        L_0x0117:
            java.lang.String r14 = r14.getOption()
            if (r14 == 0) goto L_0x011e
            goto L_0x011f
        L_0x011e:
            r14 = r12
        L_0x011f:
            r3.<init>(r4, r14)
            r10.add(r3)
            r3 = 10
            r4 = 1
            goto L_0x00fb
        L_0x0129:
            u.n.i r10 = p392u.p393n.C4570i.f10779e
            goto L_0x00db
        L_0x012c:
            java.lang.Integer r4 = r6.getMinValue()
            if (r4 == 0) goto L_0x0138
            int r4 = r4.intValue()
            r12 = r4
            goto L_0x0139
        L_0x0138:
            r12 = r5
        L_0x0139:
            java.lang.Integer r4 = r6.getMaxValue()
            if (r4 == 0) goto L_0x0144
            int r4 = r4.intValue()
            goto L_0x0145
        L_0x0144:
            r4 = r5
        L_0x0145:
            java.lang.Boolean r7 = r6.getMandatory()
            if (r7 == 0) goto L_0x0151
            boolean r7 = r7.booleanValue()
            r14 = r7
            goto L_0x0152
        L_0x0151:
            r14 = r5
        L_0x0152:
            java.lang.Integer r7 = r6.getParentId()
            if (r7 == 0) goto L_0x0159
            goto L_0x015d
        L_0x0159:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
        L_0x015d:
            r16 = r7
            java.lang.Integer r6 = r6.getParentOptionId()
            if (r6 == 0) goto L_0x0166
            goto L_0x016a
        L_0x0166:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
        L_0x016a:
            r7 = r15
            r8 = r9
            r9 = r11
            r10 = r13
            r11 = r3
            r13 = r4
            r3 = r15
            r15 = r16
            r16 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0.add(r3)
            r3 = 10
            r4 = 1
            goto L_0x0055
        L_0x0180:
            java.lang.String r0 = "responseQuestion"
            p392u.p401r.p403c.C4638h.m10271a(r0)
            throw r1
        L_0x0186:
            return r0
        L_0x0187:
            java.lang.String r0 = "responseQuestions"
            p392u.p401r.p403c.C4638h.m10271a(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p003f.p004a.p005a.p006a.p009c.C0443e.mo3702a(es.gob.radarcovid.models.response.ResponseQuestions):java.util.List");
    }
}
