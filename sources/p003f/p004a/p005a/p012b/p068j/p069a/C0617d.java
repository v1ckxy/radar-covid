package p003f.p004a.p005a.p012b.p068j.p069a;

import p003f.p004a.p005a.p012b.p068j.p084d.C0646b;
import p003f.p004a.p005a.p012b.p068j.p085e.C0648a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p390t.p391a.C4547a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.j.a.d */
public final class C0617d implements C4427b<C0646b> {

    /* renamed from: a */
    public final C0614a f2057a;

    /* renamed from: b */
    public final C4547a<C0648a> f2058b;

    public C0617d(C0614a aVar, C4547a<C0648a> aVar2) {
        this.f2057a = aVar;
        this.f2058b = aVar2;
    }

    public Object get() {
        C0648a aVar = (C0648a) this.f2058b.get();
        if (this.f2057a == null) {
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
