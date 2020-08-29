package p423w;

import p392u.p401r.p403c.C4638h;

/* renamed from: w.s */
public final class C4908s implements C4882a0 {

    /* renamed from: e */
    public final C4892f f11688e;

    /* renamed from: f */
    public C4912v f11689f;

    /* renamed from: g */
    public int f11690g;

    /* renamed from: h */
    public boolean f11691h;

    /* renamed from: i */
    public long f11692i;

    /* renamed from: j */
    public final C4896i f11693j;

    public C4908s(C4896i iVar) {
        if (iVar != null) {
            this.f11693j = iVar;
            C4892f buffer = iVar.getBuffer();
            this.f11688e = buffer;
            C4912v vVar = buffer.f11660e;
            this.f11689f = vVar;
            this.f11690g = vVar != null ? vVar.f11702b : -1;
            return;
        }
        C4638h.m10271a("upstream");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        if (r1 == r3.f11702b) goto L_0x0021;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo11077b(p423w.C4892f r9, long r10) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x007d
            boolean r1 = r8.f11691h
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x0071
            w.v r1 = r8.f11689f
            if (r1 == 0) goto L_0x0021
            w.f r3 = r8.f11688e
            w.v r3 = r3.f11660e
            if (r1 != r3) goto L_0x0020
            int r1 = r8.f11690g
            if (r3 == 0) goto L_0x001c
            int r3 = r3.f11702b
            if (r1 != r3) goto L_0x0020
            goto L_0x0021
        L_0x001c:
            p392u.p401r.p403c.C4638h.m10269a()
            throw r0
        L_0x0020:
            r2 = 0
        L_0x0021:
            if (r2 == 0) goto L_0x0065
            w.i r1 = r8.f11693j
            long r2 = r8.f11692i
            long r2 = r2 + r10
            r1.mo11447c(r2)
            w.v r1 = r8.f11689f
            if (r1 != 0) goto L_0x0042
            w.f r1 = r8.f11688e
            w.v r1 = r1.f11660e
            if (r1 == 0) goto L_0x0042
            r8.f11689f = r1
            if (r1 == 0) goto L_0x003e
            int r0 = r1.f11702b
            r8.f11690g = r0
            goto L_0x0042
        L_0x003e:
            p392u.p401r.p403c.C4638h.m10269a()
            throw r0
        L_0x0042:
            w.f r0 = r8.f11688e
            long r0 = r0.f11661f
            long r2 = r8.f11692i
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            r0 = 0
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0056
            r9 = -1
            return r9
        L_0x0056:
            w.f r2 = r8.f11688e
            long r4 = r8.f11692i
            r3 = r9
            r6 = r10
            r2.mo11442a(r3, r4, r6)
            long r0 = r8.f11692i
            long r0 = r0 + r10
            r8.f11692i = r0
            return r10
        L_0x0065:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0071:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x007d:
            java.lang.String r9 = "sink"
            p392u.p401r.p403c.C4638h.m10271a(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p423w.C4908s.mo11077b(w.f, long):long");
    }

    /* renamed from: b */
    public C4886b0 mo11078b() {
        return this.f11693j.mo11078b();
    }

    public void close() {
        this.f11691h = true;
    }
}
