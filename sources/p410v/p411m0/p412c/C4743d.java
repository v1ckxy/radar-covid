package p410v.p411m0.p412c;

import p392u.p401r.p403c.C4638h;
import p410v.C4706e0;
import p410v.C4720i0;

/* renamed from: v.m0.c.d */
public final class C4743d {

    /* renamed from: a */
    public final C4706e0 f11154a;

    /* renamed from: b */
    public final C4720i0 f11155b;

    public C4743d(C4706e0 e0Var, C4720i0 i0Var) {
        this.f11154a = e0Var;
        this.f11155b = i0Var;
    }

    /* renamed from: a */
    public static final boolean m10486a(C4720i0 i0Var, C4706e0 e0Var) {
        if (i0Var == null) {
            C4638h.m10271a("response");
            throw null;
        } else if (e0Var != null) {
            int i = i0Var.f11063i;
            boolean z = false;
            if (!(i == 200 || i == 410 || i == 414 || i == 501 || i == 203 || i == 204)) {
                if (i != 307) {
                    if (!(i == 308 || i == 404 || i == 405)) {
                        switch (i) {
                            case 300:
                            case 301:
                                break;
                            case 302:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (C4720i0.m10406a(i0Var, "Expires", null, 2) == null && i0Var.mo11032a().f11017c == -1 && !i0Var.mo11032a().f11020f && !i0Var.mo11032a().f11019e) {
                    return false;
                }
            }
            if (!i0Var.mo11032a().f11016b && !e0Var.mo11013a().f11016b) {
                z = true;
            }
            return z;
        } else {
            C4638h.m10271a("request");
            throw null;
        }
    }
}
