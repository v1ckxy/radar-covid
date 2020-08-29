package p410v.p411m0.p416g;

import p392u.p401r.p403c.C4638h;
import p423w.C4897j;
import p423w.p424c0.C4889a;

/* renamed from: v.m0.g.c */
public final class C4792c {

    /* renamed from: d */
    public static final C4897j f11348d = C4897j.f11665i.mo11511c(":");

    /* renamed from: e */
    public static final C4897j f11349e = C4897j.f11665i.mo11511c(":status");

    /* renamed from: f */
    public static final C4897j f11350f = C4897j.f11665i.mo11511c(":method");

    /* renamed from: g */
    public static final C4897j f11351g = C4897j.f11665i.mo11511c(":path");

    /* renamed from: h */
    public static final C4897j f11352h = C4897j.f11665i.mo11511c(":scheme");

    /* renamed from: i */
    public static final C4897j f11353i = C4897j.f11665i.mo11511c(":authority");

    /* renamed from: a */
    public final int f11354a;

    /* renamed from: b */
    public final C4897j f11355b;

    /* renamed from: c */
    public final C4897j f11356c;

    public C4792c(String str, String str2) {
        if (str == null) {
            C4638h.m10271a("name");
            throw null;
        } else if (str2 != null) {
            this(C4897j.f11665i.mo11511c(str), C4897j.f11665i.mo11511c(str2));
        } else {
            C4638h.m10271a("value");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p392u.p401r.p403c.C4638h.m10272a((java.lang.Object) r2.f11356c, (java.lang.Object) r3.f11356c) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof p410v.p411m0.p416g.C4792c
            if (r0 == 0) goto L_0x001d
            v.m0.g.c r3 = (p410v.p411m0.p416g.C4792c) r3
            w.j r0 = r2.f11355b
            w.j r1 = r3.f11355b
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x001d
            w.j r0 = r2.f11356c
            w.j r3 = r3.f11356c
            boolean r3 = p392u.p401r.p403c.C4638h.m10272a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p410v.p411m0.p416g.C4792c.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        C4897j jVar = this.f11355b;
        int i = 0;
        int hashCode = (jVar != null ? jVar.hashCode() : 0) * 31;
        C4897j jVar2 = this.f11356c;
        if (jVar2 != null) {
            i = jVar2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        C4897j jVar = this.f11355b;
        if (jVar != null) {
            sb.append(C4889a.m10953h(jVar));
            sb.append(": ");
            C4897j jVar2 = this.f11356c;
            if (jVar2 != null) {
                sb.append(C4889a.m10953h(jVar2));
                return sb.toString();
            }
            throw null;
        }
        throw null;
    }

    public C4792c(C4897j jVar, String str) {
        if (jVar == null) {
            C4638h.m10271a("name");
            throw null;
        } else if (str != null) {
            this(jVar, C4897j.f11665i.mo11511c(str));
        } else {
            C4638h.m10271a("value");
            throw null;
        }
    }

    public C4792c(C4897j jVar, C4897j jVar2) {
        if (jVar == null) {
            C4638h.m10271a("name");
            throw null;
        } else if (jVar2 != null) {
            this.f11355b = jVar;
            this.f11356c = jVar2;
            this.f11354a = jVar.mo11503g() + 32 + this.f11356c.mo11503g();
        } else {
            C4638h.m10271a("value");
            throw null;
        }
    }
}
