package p423w;

import java.util.concurrent.TimeUnit;
import p392u.p401r.p403c.C4638h;

/* renamed from: w.m */
public class C4901m extends C4886b0 {

    /* renamed from: e */
    public C4886b0 f11671e;

    public C4901m(C4886b0 b0Var) {
        if (b0Var != null) {
            this.f11671e = b0Var;
        } else {
            C4638h.m10271a("delegate");
            throw null;
        }
    }

    /* renamed from: a */
    public C4886b0 mo11423a() {
        return this.f11671e.mo11423a();
    }

    /* renamed from: a */
    public C4886b0 mo11424a(long j) {
        return this.f11671e.mo11424a(j);
    }

    /* renamed from: a */
    public C4886b0 mo11425a(long j, TimeUnit timeUnit) {
        if (timeUnit != null) {
            return this.f11671e.mo11425a(j, timeUnit);
        }
        C4638h.m10271a("unit");
        throw null;
    }

    /* renamed from: b */
    public C4886b0 mo11426b() {
        return this.f11671e.mo11426b();
    }

    /* renamed from: c */
    public long mo11427c() {
        return this.f11671e.mo11427c();
    }

    /* renamed from: d */
    public boolean mo11428d() {
        return this.f11671e.mo11428d();
    }

    /* renamed from: e */
    public void mo11429e() {
        this.f11671e.mo11429e();
    }
}
