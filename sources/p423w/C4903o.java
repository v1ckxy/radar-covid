package p423w;

import java.util.zip.Inflater;
import p392u.p401r.p403c.C4638h;

/* renamed from: w.o */
public final class C4903o implements C4882a0 {

    /* renamed from: e */
    public int f11677e;

    /* renamed from: f */
    public boolean f11678f;

    /* renamed from: g */
    public final C4896i f11679g;

    /* renamed from: h */
    public final Inflater f11680h;

    public C4903o(C4896i iVar, Inflater inflater) {
        if (iVar == null) {
            C4638h.m10271a("source");
            throw null;
        } else if (inflater != null) {
            this.f11679g = iVar;
            this.f11680h = inflater;
        } else {
            C4638h.m10271a("inflater");
            throw null;
        }
    }

    /* renamed from: a */
    public final void mo11516a() {
        int i = this.f11677e;
        if (i != 0) {
            int remaining = i - this.f11680h.getRemaining();
            this.f11677e -= remaining;
            this.f11679g.skip((long) remaining);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x007a A[Catch:{ DataFormatException -> 0x00ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x006e A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo11077b(p423w.C4892f r10, long r11) {
        /*
            r9 = this;
            r0 = 0
            if (r10 == 0) goto L_0x00de
            r1 = 0
            int r3 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            r4 = 0
            r5 = 1
            if (r3 < 0) goto L_0x000d
            r6 = r5
            goto L_0x000e
        L_0x000d:
            r6 = r4
        L_0x000e:
            if (r6 == 0) goto L_0x00ce
            boolean r6 = r9.f11678f
            r6 = r6 ^ r5
            if (r6 == 0) goto L_0x00c2
            if (r3 != 0) goto L_0x0018
            return r1
        L_0x0018:
            java.util.zip.Inflater r1 = r9.f11680h
            boolean r1 = r1.needsInput()
            if (r1 != 0) goto L_0x0021
            goto L_0x0053
        L_0x0021:
            r9.mo11516a()
            java.util.zip.Inflater r1 = r9.f11680h
            int r1 = r1.getRemaining()
            if (r1 != 0) goto L_0x002e
            r1 = r5
            goto L_0x002f
        L_0x002e:
            r1 = r4
        L_0x002f:
            if (r1 == 0) goto L_0x00b6
            w.i r1 = r9.f11679g
            boolean r1 = r1.mo11460i()
            if (r1 == 0) goto L_0x003b
            r1 = r5
            goto L_0x0054
        L_0x003b:
            w.i r1 = r9.f11679g
            w.f r1 = r1.getBuffer()
            w.v r1 = r1.f11660e
            if (r1 == 0) goto L_0x00b2
            int r2 = r1.f11703c
            int r3 = r1.f11702b
            int r2 = r2 - r3
            r9.f11677e = r2
            java.util.zip.Inflater r6 = r9.f11680h
            byte[] r1 = r1.f11701a
            r6.setInput(r1, r3, r2)
        L_0x0053:
            r1 = r4
        L_0x0054:
            w.v r2 = r10.mo11444a(r5)     // Catch:{ DataFormatException -> 0x00ab }
            int r3 = r2.f11703c     // Catch:{ DataFormatException -> 0x00ab }
            int r3 = 8192 - r3
            long r6 = (long) r3     // Catch:{ DataFormatException -> 0x00ab }
            long r6 = java.lang.Math.min(r11, r6)     // Catch:{ DataFormatException -> 0x00ab }
            int r3 = (int) r6     // Catch:{ DataFormatException -> 0x00ab }
            java.util.zip.Inflater r6 = r9.f11680h     // Catch:{ DataFormatException -> 0x00ab }
            byte[] r7 = r2.f11701a     // Catch:{ DataFormatException -> 0x00ab }
            int r8 = r2.f11703c     // Catch:{ DataFormatException -> 0x00ab }
            int r3 = r6.inflate(r7, r8, r3)     // Catch:{ DataFormatException -> 0x00ab }
            if (r3 <= 0) goto L_0x007a
            int r11 = r2.f11703c     // Catch:{ DataFormatException -> 0x00ab }
            int r11 = r11 + r3
            r2.f11703c = r11     // Catch:{ DataFormatException -> 0x00ab }
            long r11 = r10.f11661f     // Catch:{ DataFormatException -> 0x00ab }
            long r0 = (long) r3     // Catch:{ DataFormatException -> 0x00ab }
            long r11 = r11 + r0
            r10.f11661f = r11     // Catch:{ DataFormatException -> 0x00ab }
            return r0
        L_0x007a:
            java.util.zip.Inflater r3 = r9.f11680h     // Catch:{ DataFormatException -> 0x00ab }
            boolean r3 = r3.finished()     // Catch:{ DataFormatException -> 0x00ab }
            if (r3 != 0) goto L_0x0096
            java.util.zip.Inflater r3 = r9.f11680h     // Catch:{ DataFormatException -> 0x00ab }
            boolean r3 = r3.needsDictionary()     // Catch:{ DataFormatException -> 0x00ab }
            if (r3 == 0) goto L_0x008b
            goto L_0x0096
        L_0x008b:
            if (r1 != 0) goto L_0x008e
            goto L_0x0018
        L_0x008e:
            java.io.EOFException r10 = new java.io.EOFException     // Catch:{ DataFormatException -> 0x00ab }
            java.lang.String r11 = "source exhausted prematurely"
            r10.<init>(r11)     // Catch:{ DataFormatException -> 0x00ab }
            throw r10     // Catch:{ DataFormatException -> 0x00ab }
        L_0x0096:
            r9.mo11516a()     // Catch:{ DataFormatException -> 0x00ab }
            int r11 = r2.f11702b     // Catch:{ DataFormatException -> 0x00ab }
            int r12 = r2.f11703c     // Catch:{ DataFormatException -> 0x00ab }
            if (r11 != r12) goto L_0x00a8
            w.v r11 = r2.mo11541a()     // Catch:{ DataFormatException -> 0x00ab }
            r10.f11660e = r11     // Catch:{ DataFormatException -> 0x00ab }
            p423w.C4913w.m11091a(r2)     // Catch:{ DataFormatException -> 0x00ab }
        L_0x00a8:
            r10 = -1
            return r10
        L_0x00ab:
            r10 = move-exception
            java.io.IOException r11 = new java.io.IOException
            r11.<init>(r10)
            throw r11
        L_0x00b2:
            p392u.p401r.p403c.C4638h.m10269a()
            throw r0
        L_0x00b6:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "?"
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x00c2:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "closed"
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x00ce:
            java.lang.String r10 = "byteCount < 0: "
            java.lang.String r10 = p213q.p214a.p215a.p216a.C1965a.m4748a(r10, r11)
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        L_0x00de:
            java.lang.String r10 = "sink"
            p392u.p401r.p403c.C4638h.m10271a(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p423w.C4903o.mo11077b(w.f, long):long");
    }

    /* renamed from: b */
    public C4886b0 mo11078b() {
        return this.f11679g.mo11078b();
    }

    public void close() {
        if (!this.f11678f) {
            this.f11680h.end();
            this.f11678f = true;
            this.f11679g.close();
        }
    }
}
