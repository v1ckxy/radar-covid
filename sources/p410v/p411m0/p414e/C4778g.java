package p410v.p411m0.p414e;

import java.util.List;
import p392u.p401r.p403c.C4638h;
import p410v.C4706e0;
import p410v.C4708f;
import p410v.C4720i0;
import p410v.C4729k;
import p410v.C4877y;
import p410v.C4877y.C4878a;
import p410v.p411m0.p413d.C4754c;
import p410v.p411m0.p413d.C4768m;

/* renamed from: v.m0.e.g */
public final class C4778g implements C4878a {

    /* renamed from: a */
    public int f11299a;

    /* renamed from: b */
    public final List<C4877y> f11300b;

    /* renamed from: c */
    public final C4768m f11301c;

    /* renamed from: d */
    public final C4754c f11302d;

    /* renamed from: e */
    public final int f11303e;

    /* renamed from: f */
    public final C4706e0 f11304f;

    /* renamed from: g */
    public final C4708f f11305g;

    /* renamed from: h */
    public final int f11306h;

    /* renamed from: i */
    public final int f11307i;

    /* renamed from: j */
    public final int f11308j;

    public C4778g(List<? extends C4877y> list, C4768m mVar, C4754c cVar, int i, C4706e0 e0Var, C4708f fVar, int i2, int i3, int i4) {
        if (list == null) {
            C4638h.m10271a("interceptors");
            throw null;
        } else if (mVar == null) {
            C4638h.m10271a("transmitter");
            throw null;
        } else if (e0Var == null) {
            C4638h.m10271a("request");
            throw null;
        } else if (fVar != null) {
            this.f11300b = list;
            this.f11301c = mVar;
            this.f11302d = cVar;
            this.f11303e = i;
            this.f11304f = e0Var;
            this.f11305g = fVar;
            this.f11306h = i2;
            this.f11307i = i3;
            this.f11308j = i4;
        } else {
            C4638h.m10271a("call");
            throw null;
        }
    }

    /* renamed from: a */
    public C4720i0 mo11170a(C4706e0 e0Var) {
        if (e0Var != null) {
            return mo11171a(e0Var, this.f11301c, this.f11302d);
        }
        C4638h.m10271a("request");
        throw null;
    }

    /* renamed from: a */
    public C4729k mo11172a() {
        C4754c cVar = this.f11302d;
        if (cVar != null) {
            return cVar.mo11110a();
        }
        return null;
    }

    /* renamed from: b */
    public int mo11173b() {
        return this.f11306h;
    }

    /* renamed from: c */
    public int mo11174c() {
        return this.f11307i;
    }

    /* renamed from: d */
    public int mo11175d() {
        return this.f11308j;
    }

    /* renamed from: g */
    public C4706e0 mo11176g() {
        return this.f11304f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p410v.C4720i0 mo11171a(p410v.C4706e0 r17, p410v.p411m0.p413d.C4768m r18, p410v.p411m0.p413d.C4754c r19) {
        /*
            r16 = this;
            r0 = r16
            r6 = r17
            r1 = 0
            if (r6 == 0) goto L_0x013c
            if (r18 == 0) goto L_0x0136
            int r2 = r0.f11303e
            java.util.List<v.y> r3 = r0.f11300b
            int r3 = r3.size()
            if (r2 >= r3) goto L_0x0130
            int r2 = r0.f11299a
            r11 = 1
            int r2 = r2 + r11
            r0.f11299a = r2
            v.m0.d.c r2 = r0.f11302d
            r12 = 0
            if (r2 == 0) goto L_0x0033
            v.m0.d.h r2 = r2.mo11110a()
            if (r2 == 0) goto L_0x002f
            v.x r1 = r6.f11029b
            boolean r1 = r2.mo11130a(r1)
            if (r1 == 0) goto L_0x002d
            goto L_0x0033
        L_0x002d:
            r1 = r12
            goto L_0x0034
        L_0x002f:
            p392u.p401r.p403c.C4638h.m10269a()
            throw r1
        L_0x0033:
            r1 = r11
        L_0x0034:
            java.lang.String r13 = "network interceptor "
            if (r1 == 0) goto L_0x010b
            v.m0.d.c r1 = r0.f11302d
            if (r1 == 0) goto L_0x0043
            int r1 = r0.f11299a
            if (r1 > r11) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            r1 = r12
            goto L_0x0044
        L_0x0043:
            r1 = r11
        L_0x0044:
            java.lang.String r14 = " must call proceed() exactly once"
            if (r1 == 0) goto L_0x00e8
            v.m0.e.g r15 = new v.m0.e.g
            java.util.List<v.y> r2 = r0.f11300b
            int r1 = r0.f11303e
            int r5 = r1 + 1
            v.f r7 = r0.f11305g
            int r8 = r0.f11306h
            int r9 = r0.f11307i
            int r10 = r0.f11308j
            r1 = r15
            r3 = r18
            r4 = r19
            r6 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.util.List<v.y> r1 = r0.f11300b
            int r2 = r0.f11303e
            java.lang.Object r1 = r1.get(r2)
            v.y r1 = (p410v.C4877y) r1
            v.i0 r2 = r1.mo11074a(r15)
            java.lang.String r3 = "interceptor "
            if (r2 == 0) goto L_0x00ce
            if (r19 == 0) goto L_0x0088
            int r4 = r0.f11303e
            int r4 = r4 + r11
            java.util.List<v.y> r5 = r0.f11300b
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0088
            int r4 = r15.f11299a
            if (r4 != r11) goto L_0x0086
            goto L_0x0088
        L_0x0086:
            r4 = r12
            goto L_0x0089
        L_0x0088:
            r4 = r11
        L_0x0089:
            if (r4 == 0) goto L_0x00b2
            v.j0 r4 = r2.f11066l
            if (r4 == 0) goto L_0x0090
            goto L_0x0091
        L_0x0090:
            r11 = r12
        L_0x0091:
            if (r11 == 0) goto L_0x0094
            return r2
        L_0x0094:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " returned a response with no body"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L_0x00b2:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            r2.append(r1)
            r2.append(r14)
            java.lang.String r1 = r2.toString()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L_0x00ce:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = " returned null"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r2.<init>(r1)
            throw r2
        L_0x00e8:
            java.lang.StringBuilder r1 = p213q.p214a.p215a.p216a.C1965a.m4756a(r13)
            java.util.List<v.y> r2 = r0.f11300b
            int r3 = r0.f11303e
            int r3 = r3 - r11
            java.lang.Object r2 = r2.get(r3)
            v.y r2 = (p410v.C4877y) r2
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L_0x010b:
            java.lang.StringBuilder r1 = p213q.p214a.p215a.p216a.C1965a.m4756a(r13)
            java.util.List<v.y> r2 = r0.f11300b
            int r3 = r0.f11303e
            int r3 = r3 - r11
            java.lang.Object r2 = r2.get(r3)
            v.y r2 = (p410v.C4877y) r2
            r1.append(r2)
            java.lang.String r2 = " must retain the same host and port"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L_0x0130:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L_0x0136:
            java.lang.String r2 = "transmitter"
            p392u.p401r.p403c.C4638h.m10271a(r2)
            throw r1
        L_0x013c:
            java.lang.String r2 = "request"
            p392u.p401r.p403c.C4638h.m10271a(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p410v.p411m0.p414e.C4778g.mo11171a(v.e0, v.m0.d.m, v.m0.d.c):v.i0");
    }
}
