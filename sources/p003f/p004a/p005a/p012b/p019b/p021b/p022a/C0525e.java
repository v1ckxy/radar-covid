package p003f.p004a.p005a.p012b.p019b.p021b.p022a;

import p003f.p004a.p005a.p012b.p019b.p021b.p024c.C0533b;
import p003f.p004a.p005a.p012b.p019b.p021b.p025d.C0535a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p390t.p391a.C4547a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.b.b.a.e */
public final class C0525e implements C4427b<C0533b> {

    /* renamed from: a */
    public final C0521a f1939a;

    /* renamed from: b */
    public final C4547a<C0535a> f1940b;

    public C0525e(C0521a aVar, C4547a<C0535a> aVar2) {
        this.f1939a = aVar;
        this.f1940b = aVar2;
    }

    public Object get() {
        C0535a aVar = (C0535a) this.f1940b.get();
        if (this.f1939a == null) {
            throw null;
        } else if (aVar != null) {
            C2286e.m5279b(aVar, "Cannot return null from a non-@Nullable @Provides method");
            return aVar;
        } else {
            C4638h.m10271a("router");
            throw null;
        }
    }
}
