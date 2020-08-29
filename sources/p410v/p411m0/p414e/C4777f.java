package p410v.p411m0.p414e;

import p392u.p401r.p403c.C4638h;

/* renamed from: v.m0.e.f */
public final class C4777f {
    /* renamed from: a */
    public static final boolean m10584a(String str) {
        if (str != null) {
            return !C4638h.m10272a((Object) str, (Object) "GET") && !C4638h.m10272a((Object) str, (Object) "HEAD");
        }
        C4638h.m10271a("method");
        throw null;
    }

    /* renamed from: b */
    public static final boolean m10585b(String str) {
        if (str != null) {
            return C4638h.m10272a((Object) str, (Object) "POST") || C4638h.m10272a((Object) str, (Object) "PUT") || C4638h.m10272a((Object) str, (Object) "PATCH") || C4638h.m10272a((Object) str, (Object) "PROPPATCH") || C4638h.m10272a((Object) str, (Object) "REPORT");
        }
        C4638h.m10271a("method");
        throw null;
    }
}
