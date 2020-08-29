package p124p.p144f.p145a;

import p124p.p144f.p145a.C1267e.C1268a;

/* renamed from: p.f.a.b */
public class C1264b implements C1268a {

    /* renamed from: a */
    public C1270g f3606a = null;

    /* renamed from: b */
    public float f3607b = 0.0f;

    /* renamed from: c */
    public boolean f3608c;

    /* renamed from: d */
    public final C1263a f3609d;

    /* renamed from: e */
    public boolean f3610e = false;

    public C1264b(C1265c cVar) {
        this.f3609d = new C1263a(this, cVar);
    }

    /* renamed from: a */
    public C1264b mo5633a(C1267e eVar, int i) {
        this.f3609d.mo5628a(eVar.mo5642a(i, "ep"), 1.0f);
        this.f3609d.mo5628a(eVar.mo5642a(i, "em"), -1.0f);
        return this;
    }

    /* renamed from: a */
    public C1264b mo5634a(C1270g gVar, C1270g gVar2, C1270g gVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f3607b = (float) i;
        }
        if (!z) {
            this.f3609d.mo5628a(gVar, -1.0f);
            this.f3609d.mo5628a(gVar2, 1.0f);
            this.f3609d.mo5628a(gVar3, 1.0f);
        } else {
            this.f3609d.mo5628a(gVar, 1.0f);
            this.f3609d.mo5628a(gVar2, -1.0f);
            this.f3609d.mo5628a(gVar3, -1.0f);
        }
        return this;
    }

    /* renamed from: a */
    public C1264b mo5635a(C1270g gVar, C1270g gVar2, C1270g gVar3, C1270g gVar4, float f) {
        this.f3609d.mo5628a(gVar, -1.0f);
        this.f3609d.mo5628a(gVar2, 1.0f);
        this.f3609d.mo5628a(gVar3, f);
        this.f3609d.mo5628a(gVar4, -f);
        return this;
    }

    /* renamed from: a */
    public void mo5636a(C1270g gVar) {
        int i = gVar.f3636d;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.f3609d.mo5628a(gVar, f);
    }

    /* renamed from: b */
    public C1264b mo5637b(C1270g gVar, C1270g gVar2, C1270g gVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f3607b = (float) i;
        }
        if (!z) {
            this.f3609d.mo5628a(gVar, -1.0f);
            this.f3609d.mo5628a(gVar2, 1.0f);
            this.f3609d.mo5628a(gVar3, -1.0f);
        } else {
            this.f3609d.mo5628a(gVar, 1.0f);
            this.f3609d.mo5628a(gVar2, -1.0f);
            this.f3609d.mo5628a(gVar3, 1.0f);
        }
        return this;
    }

    /* renamed from: b */
    public C1264b mo5638b(C1270g gVar, C1270g gVar2, C1270g gVar3, C1270g gVar4, float f) {
        this.f3609d.mo5628a(gVar3, 0.5f);
        this.f3609d.mo5628a(gVar4, 0.5f);
        this.f3609d.mo5628a(gVar, -0.5f);
        this.f3609d.mo5628a(gVar2, -0.5f);
        this.f3607b = -f;
        return this;
    }

    /* renamed from: b */
    public void mo5639b(C1270g gVar) {
        C1270g gVar2 = this.f3606a;
        if (gVar2 != null) {
            this.f3609d.mo5628a(gVar2, -1.0f);
            this.f3606a = null;
        }
        float a = this.f3609d.mo5624a(gVar, true) * -1.0f;
        this.f3606a = gVar;
        if (a != 1.0f) {
            this.f3607b /= a;
            C1263a aVar = this.f3609d;
            int i = aVar.f3603i;
            int i2 = 0;
            while (i != -1 && i2 < aVar.f3595a) {
                float[] fArr = aVar.f3602h;
                fArr[i] = fArr[i] / a;
                i = aVar.f3601g[i];
                i2++;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r10 = this;
            p.f.a.g r0 = r10.f3606a
            if (r0 != 0) goto L_0x0007
            java.lang.String r0 = "0"
            goto L_0x0016
        L_0x0007:
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = p213q.p214a.p215a.p216a.C1965a.m4756a(r0)
            p.f.a.g r1 = r10.f3606a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0016:
            java.lang.String r1 = " = "
            java.lang.String r0 = p213q.p214a.p215a.p216a.C1965a.m4751a(r0, r1)
            float r1 = r10.f3607b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0034
            java.lang.StringBuilder r0 = p213q.p214a.p215a.p216a.C1965a.m4756a(r0)
            float r1 = r10.f3607b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r4
            goto L_0x0035
        L_0x0034:
            r1 = r3
        L_0x0035:
            p.f.a.a r5 = r10.f3609d
            int r5 = r5.f3595a
        L_0x0039:
            if (r3 >= r5) goto L_0x009d
            p.f.a.a r6 = r10.f3609d
            p.f.a.g r6 = r6.mo5625a(r3)
            if (r6 != 0) goto L_0x0044
            goto L_0x009a
        L_0x0044:
            p.f.a.a r7 = r10.f3609d
            float r7 = r7.mo5630b(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x004f
            goto L_0x009a
        L_0x004f:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0062
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x007c
            java.lang.StringBuilder r0 = p213q.p214a.p215a.p216a.C1965a.m4756a(r0)
            java.lang.String r1 = "- "
            goto L_0x0074
        L_0x0062:
            java.lang.StringBuilder r0 = p213q.p214a.p215a.p216a.C1965a.m4756a(r0)
            if (r8 <= 0) goto L_0x0072
            java.lang.String r1 = " + "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x007c
        L_0x0072:
            java.lang.String r1 = " - "
        L_0x0074:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            float r7 = r7 * r9
        L_0x007c:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0088
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L_0x0095
        L_0x0088:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        L_0x0095:
            java.lang.String r0 = p213q.p214a.p215a.p216a.C1965a.m4754a(r1, r0, r6)
            r1 = r4
        L_0x009a:
            int r3 = r3 + 1
            goto L_0x0039
        L_0x009d:
            if (r1 != 0) goto L_0x00a5
            java.lang.String r1 = "0.0"
            java.lang.String r0 = p213q.p214a.p215a.p216a.C1965a.m4751a(r0, r1)
        L_0x00a5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p144f.p145a.C1264b.toString():java.lang.String");
    }
}
