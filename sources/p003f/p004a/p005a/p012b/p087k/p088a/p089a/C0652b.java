package p003f.p004a.p005a.p012b.p087k.p088a.p089a;

import p003f.p004a.p005a.p012b.p087k.p088a.p090b.C0654a;
import p003f.p004a.p005a.p012b.p087k.p088a.p091c.C0656a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p390t.p391a.C4547a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.k.a.a.b */
public final class C0652b implements C4427b<C0656a> {

    /* renamed from: a */
    public final C0651a f2089a;

    /* renamed from: b */
    public final C4547a<C0654a> f2090b;

    public C0652b(C0651a aVar, C4547a<C0654a> aVar2) {
        this.f2089a = aVar;
        this.f2090b = aVar2;
    }

    public Object get() {
        C0654a aVar = (C0654a) this.f2090b.get();
        if (this.f2089a == null) {
            throw null;
        } else if (aVar != null) {
            C2286e.m5279b(aVar, "Cannot return null from a non-@Nullable @Provides method");
            return aVar;
        } else {
            C4638h.m10271a("presenter");
            throw null;
        }
    }
}
