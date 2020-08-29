package p003f.p004a.p005a.p108g.p111b.p113b;

import java.util.Objects;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p390t.p391a.C4547a;
import p392u.p401r.p403c.C4638h;
import p410v.C4690b0;
import p484y.C5265d0.C5267b;
import p484y.C5280h.C5281a;
import p484y.p485i0.p486a.C5290a;
import p484y.p485i0.p487b.C5303k;

/* renamed from: f.a.a.g.b.b.t */
public final class C0823t implements C4427b<C5267b> {

    /* renamed from: a */
    public final C0818o f2386a;

    /* renamed from: b */
    public final C4547a<C4690b0> f2387b;

    public C0823t(C0818o oVar, C4547a<C4690b0> aVar) {
        this.f2386a = oVar;
        this.f2387b = aVar;
    }

    public Object get() {
        C4690b0 b0Var = (C4690b0) this.f2387b.get();
        if (this.f2386a == null) {
            throw null;
        } else if (b0Var != null) {
            C5267b bVar = new C5267b();
            bVar.mo12001a(b0Var);
            String str = "factory == null";
            bVar.f12565d.add((C5281a) Objects.requireNonNull(new C5303k(), str));
            bVar.f12565d.add((C5281a) Objects.requireNonNull(C5290a.m11782a(), str));
            C4638h.m10270a((Object) bVar, "Retrofit.Builder()\n     …onverterFactory.create())");
            C2286e.m5279b(bVar, "Cannot return null from a non-@Nullable @Provides method");
            return bVar;
        } else {
            C4638h.m10271a("httpClient");
            throw null;
        }
    }
}
