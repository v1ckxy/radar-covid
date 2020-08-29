package p003f.p004a.p005a.p012b.p068j.p069a;

import p003f.p004a.p005a.p012b.p068j.p083c.C0643a;
import p003f.p004a.p005a.p012b.p068j.p084d.C0645a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p390t.p391a.C4547a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.j.a.c */
public final class C0616c implements C4427b<C0645a> {

    /* renamed from: a */
    public final C0614a f2055a;

    /* renamed from: b */
    public final C4547a<C0643a> f2056b;

    public C0616c(C0614a aVar, C4547a<C0643a> aVar2) {
        this.f2055a = aVar;
        this.f2056b = aVar2;
    }

    public Object get() {
        C0643a aVar = (C0643a) this.f2056b.get();
        if (this.f2055a == null) {
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
