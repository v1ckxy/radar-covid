package p410v.p411m0.p413d;

import java.util.LinkedHashSet;
import java.util.Set;
import p392u.p401r.p403c.C4638h;
import p410v.C4730k0;

/* renamed from: v.m0.d.j */
public final class C4764j {

    /* renamed from: a */
    public final Set<C4730k0> f11264a = new LinkedHashSet();

    /* renamed from: a */
    public final synchronized void mo11142a(C4730k0 k0Var) {
        String str = "route";
        if (k0Var != null) {
            this.f11264a.remove(k0Var);
        } else {
            C4638h.m10271a(str);
            throw null;
        }
    }

    /* renamed from: b */
    public final synchronized void mo11143b(C4730k0 k0Var) {
        String str = "failedRoute";
        if (k0Var != null) {
            this.f11264a.add(k0Var);
        } else {
            C4638h.m10271a(str);
            throw null;
        }
    }

    /* renamed from: c */
    public final synchronized boolean mo11144c(C4730k0 k0Var) {
        String str = "route";
        if (k0Var != null) {
        } else {
            C4638h.m10271a(str);
            throw null;
        }
        return this.f11264a.contains(k0Var);
    }
}
