package p410v.p411m0.p414e;

import p392u.p401r.p403c.C4638h;
import p410v.C4725j0;
import p410v.C4879z;
import p410v.C4879z.C4880a;
import p423w.C4896i;

/* renamed from: v.m0.e.h */
public final class C4779h extends C4725j0 {

    /* renamed from: g */
    public final String f11309g;

    /* renamed from: h */
    public final long f11310h;

    /* renamed from: i */
    public final C4896i f11311i;

    public C4779h(String str, long j, C4896i iVar) {
        if (iVar != null) {
            this.f11309g = str;
            this.f11310h = j;
            this.f11311i = iVar;
            return;
        }
        C4638h.m10271a("source");
        throw null;
    }

    /* renamed from: f */
    public long mo10989f() {
        return this.f11310h;
    }

    /* renamed from: g */
    public C4879z mo10990g() {
        String str = this.f11309g;
        if (str == null) {
            return null;
        }
        C4880a aVar = C4879z.f11637f;
        return C4880a.m10909b(str);
    }

    /* renamed from: h */
    public C4896i mo10991h() {
        return this.f11311i;
    }
}
