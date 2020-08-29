package p423w;

import p392u.p401r.p403c.C4638h;

/* renamed from: w.w */
public final class C4913w {

    /* renamed from: a */
    public static C4912v f11708a;

    /* renamed from: b */
    public static long f11709b;

    /* renamed from: c */
    public static final C4913w f11710c = new C4913w();

    /* renamed from: a */
    public static final C4912v m11090a() {
        synchronized (f11710c) {
            C4912v vVar = f11708a;
            if (vVar == null) {
                return new C4912v();
            }
            f11708a = vVar.f11706f;
            vVar.f11706f = null;
            f11709b -= (long) 8192;
            return vVar;
        }
    }

    /* renamed from: a */
    public static final void m11091a(C4912v vVar) {
        if (vVar != null) {
            if (!(vVar.f11706f == null && vVar.f11707g == null)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            } else if (!vVar.f11704d) {
                synchronized (f11710c) {
                    long j = (long) 8192;
                    if (f11709b + j <= 65536) {
                        f11709b += j;
                        vVar.f11706f = f11708a;
                        vVar.f11703c = 0;
                        vVar.f11702b = 0;
                        f11708a = vVar;
                    }
                }
            }
        } else {
            C4638h.m10271a("segment");
            throw null;
        }
    }
}
