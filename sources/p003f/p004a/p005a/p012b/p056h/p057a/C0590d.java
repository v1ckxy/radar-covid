package p003f.p004a.p005a.p012b.p056h.p057a;

import p003f.p004a.p005a.p012b.p056h.p058b.C0593a;
import p003f.p004a.p005a.p012b.p056h.p059c.C0595a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p390t.p391a.C4547a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.h.a.d */
public final class C0590d implements C4427b<C0595a> {

    /* renamed from: a */
    public final C0587a f2020a;

    /* renamed from: b */
    public final C4547a<C0593a> f2021b;

    public C0590d(C0587a aVar, C4547a<C0593a> aVar2) {
        this.f2020a = aVar;
        this.f2021b = aVar2;
    }

    public Object get() {
        C0593a aVar = (C0593a) this.f2021b.get();
        if (this.f2020a == null) {
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
