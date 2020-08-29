package p003f.p004a.p005a.p108g.p111b.p113b;

import java.util.List;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p390t.p391a.C4547a;
import p392u.p401r.p403c.C4638h;
import p410v.C4690b0;
import p410v.C4690b0.C4691a;
import p410v.C4713h;
import p410v.C4734m;
import p410v.C4877y;
import p410v.p411m0.C4737b;

/* renamed from: f.a.a.g.b.b.r */
public final class C0821r implements C4427b<C4690b0> {

    /* renamed from: a */
    public final C0818o f2382a;

    /* renamed from: b */
    public final C4547a<C4877y> f2383b;

    /* renamed from: c */
    public final C4547a<C4713h> f2384c;

    public C0821r(C0818o oVar, C4547a<C4877y> aVar, C4547a<C4713h> aVar2) {
        this.f2382a = oVar;
        this.f2383b = aVar;
        this.f2384c = aVar2;
    }

    public Object get() {
        C4877y yVar = (C4877y) this.f2383b.get();
        C4713h hVar = (C4713h) this.f2384c.get();
        if (this.f2382a == null) {
            throw null;
        } else if (yVar == null) {
            C4638h.m10271a("interceptor");
            throw null;
        } else if (hVar != null) {
            C4691a aVar = new C4691a();
            aVar.mo10981a(yVar);
            aVar.f10962v = hVar;
            List e = C2286e.m5332e(C4734m.f11129g);
            if (e != null) {
                aVar.f10959s = C4737b.m10474b(e);
                C4690b0 b0Var = new C4690b0(aVar);
                C2286e.m5279b(b0Var, "Cannot return null from a non-@Nullable @Provides method");
                return b0Var;
            }
            C4638h.m10271a("connectionSpecs");
            throw null;
        } else {
            C4638h.m10271a("certificatePinner");
            throw null;
        }
    }
}
