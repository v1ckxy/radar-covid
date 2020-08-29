package p425x.p426a.p445e.p447b.p455h;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import p425x.p426a.p427a.C4967n;

/* renamed from: x.a.e.b.h.b */
public class C5080b implements Serializable {

    /* renamed from: e */
    public final Map<Integer, C5079a> f12160e = new TreeMap();

    /* renamed from: f */
    public transient long f12161f;

    public C5080b(long j) {
        this.f12161f = j;
    }

    public C5080b(C5080b bVar, long j) {
        for (Integer num : bVar.f12160e.keySet()) {
            this.f12160e.put(num, new C5079a((C5079a) bVar.f12160e.get(num)));
        }
        this.f12161f = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0139 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5080b(p425x.p426a.p445e.p447b.p455h.C5103r r28, long r29, byte[] r31, byte[] r32) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r31
            r3 = r32
            r27.<init>()
            java.util.TreeMap r4 = new java.util.TreeMap
            r4.<init>()
            r0.f12160e = r4
            int r4 = r1.f12223c
            r5 = 1
            long r7 = r5 << r4
            long r7 = r7 - r5
            r0.f12161f = r7
            r9 = 0
        L_0x001d:
            int r4 = (r9 > r29 ? 1 : (r9 == r29 ? 0 : -1))
            if (r4 >= 0) goto L_0x0154
            x.a.e.b.h.w r4 = r1.f12222b
            int r11 = r4.f12254b
            long r12 = r9 >> r11
            long r14 = r5 << r11
            long r14 = r14 - r5
            long r5 = r9 & r14
            int r5 = (int) r5
            x.a.e.b.h.j$b r6 = new x.a.e.b.h.j$b
            r6.<init>()
            x.a.e.b.h.o$a r6 = r6.mo11757a(r12)
            x.a.e.b.h.j$b r6 = (p425x.p426a.p445e.p447b.p455h.C5092j.C5094b) r6
            r6.f12192e = r5
            x.a.e.b.h.o r6 = r6.mo11750b()
            x.a.e.b.h.j r6 = (p425x.p426a.p445e.p447b.p455h.C5092j) r6
            r16 = 1
            int r7 = r16 << r11
            int r8 = r7 + -1
            r19 = r12
            r12 = 0
            if (r5 >= r8) goto L_0x0086
            java.util.Map<java.lang.Integer, x.a.e.b.h.a> r13 = r0.f12160e
            r21 = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)
            java.lang.Object r8 = r13.get(r8)
            x.a.e.b.h.a r8 = (p425x.p426a.p445e.p447b.p455h.C5079a) r8
            if (r8 == 0) goto L_0x0062
            if (r5 != 0) goto L_0x005e
            goto L_0x0062
        L_0x005e:
            r23 = r4
            r8 = r12
            goto L_0x0082
        L_0x0062:
            x.a.e.b.h.a r5 = new x.a.e.b.h.a
            x.a.e.b.h.k r8 = r4.mo11762a()
            int r13 = r4.f12254b
            int r12 = r4.f12255c
            int r22 = r16 << r13
            r23 = r4
            int r4 = r22 + -1
            r5.<init>(r8, r13, r12, r4)
            r5.mo11735a(r2, r3, r6)
            java.util.Map<java.lang.Integer, x.a.e.b.h.a> r4 = r0.f12160e
            r8 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            r4.put(r12, r5)
        L_0x0082:
            r0.mo11737a(r8, r2, r3, r6)
            goto L_0x008b
        L_0x0086:
            r23 = r4
            r21 = r8
            r8 = r12
        L_0x008b:
            r4 = r16
            r12 = r19
        L_0x008f:
            int r5 = r1.f12224d
            if (r4 >= r5) goto L_0x014a
            long r5 = r12 & r14
            int r5 = (int) r5
            long r12 = r12 >> r11
            x.a.e.b.h.j$b r6 = new x.a.e.b.h.j$b
            r6.<init>()
            x.a.e.b.h.o$a r6 = r6.mo11758b(r4)
            x.a.e.b.h.j$b r6 = (p425x.p426a.p445e.p447b.p455h.C5092j.C5094b) r6
            x.a.e.b.h.o$a r6 = r6.mo11757a(r12)
            x.a.e.b.h.j$b r6 = (p425x.p426a.p445e.p447b.p455h.C5092j.C5094b) r6
            r6.f12192e = r5
            x.a.e.b.h.o r6 = r6.mo11750b()
            x.a.e.b.h.j r6 = (p425x.p426a.p445e.p447b.p455h.C5092j) r6
            java.util.Map<java.lang.Integer, x.a.e.b.h.a> r8 = r0.f12160e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Object r1 = r8.get(r1)
            if (r1 == 0) goto L_0x00ea
            r17 = 0
            int r1 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r1 != 0) goto L_0x00c8
            r1 = r11
            r19 = r12
            r24 = r14
            goto L_0x00df
        L_0x00c8:
            r1 = r11
            r19 = r12
            double r11 = (double) r7
            int r8 = r4 + 1
            r24 = r14
            double r13 = (double) r8
            double r11 = java.lang.Math.pow(r11, r13)
            long r11 = (long) r11
            long r11 = r9 % r11
            int r8 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r8 != 0) goto L_0x00df
            r8 = r16
            goto L_0x00e0
        L_0x00df:
            r8 = 0
        L_0x00e0:
            if (r8 == 0) goto L_0x00e3
            goto L_0x00ef
        L_0x00e3:
            r22 = r1
            r1 = r21
            r26 = r23
            goto L_0x0114
        L_0x00ea:
            r1 = r11
            r19 = r12
            r24 = r14
        L_0x00ef:
            java.util.Map<java.lang.Integer, x.a.e.b.h.a> r8 = r0.f12160e
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            x.a.e.b.h.a r12 = new x.a.e.b.h.a
            x.a.e.b.h.k r13 = r23.mo11762a()
            r14 = r23
            int r15 = r14.f12254b
            r22 = r1
            int r1 = r14.f12255c
            int r23 = r16 << r15
            r26 = r14
            int r14 = r23 + -1
            r12.<init>(r13, r15, r1, r14)
            r12.mo11735a(r2, r3, r6)
            r8.put(r11, r12)
            r1 = r21
        L_0x0114:
            r11 = 0
            if (r5 >= r1) goto L_0x0139
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r5 != 0) goto L_0x011d
            goto L_0x0133
        L_0x011d:
            r13 = 1
            long r17 = r9 + r13
            double r13 = (double) r7
            double r11 = (double) r4
            double r11 = java.lang.Math.pow(r13, r11)
            long r11 = (long) r11
            long r17 = r17 % r11
            r11 = 0
            int r5 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r5 != 0) goto L_0x0133
            r5 = r16
            goto L_0x0134
        L_0x0133:
            r5 = 0
        L_0x0134:
            if (r5 == 0) goto L_0x0139
            r0.mo11737a(r4, r2, r3, r6)
        L_0x0139:
            int r4 = r4 + 1
            r21 = r1
            r12 = r19
            r11 = r22
            r14 = r24
            r23 = r26
            r8 = 0
            r1 = r28
            goto L_0x008f
        L_0x014a:
            r11 = 0
            r4 = 1
            long r9 = r9 + r4
            r1 = r28
            r5 = r4
            goto L_0x001d
        L_0x0154:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p425x.p426a.p445e.p447b.p455h.C5080b.<init>(x.a.e.b.h.r, long, byte[], byte[]):void");
    }

    /* renamed from: a */
    public C5079a mo11737a(int i, byte[] bArr, byte[] bArr2, C5092j jVar) {
        Map<Integer, C5079a> map = this.f12160e;
        Integer valueOf = Integer.valueOf(i);
        C5079a aVar = (C5079a) this.f12160e.get(Integer.valueOf(i));
        if (aVar != null) {
            return (C5079a) map.put(valueOf, new C5079a(aVar, bArr, bArr2, jVar));
        }
        throw null;
    }

    /* renamed from: a */
    public C5080b mo11738a(C4967n nVar) {
        C5080b bVar = new C5080b(this.f12161f);
        for (Integer num : this.f12160e.keySet()) {
            Map<Integer, C5079a> map = bVar.f12160e;
            C5079a aVar = (C5079a) this.f12160e.get(num);
            if (aVar != null) {
                map.put(num, new C5079a(aVar, nVar));
            } else {
                throw null;
            }
        }
        return bVar;
    }
}
