package p003f.p004a.p005a.p012b.p027c.p028a;

import p003f.p004a.p005a.p012b.p027c.p029b.C0546a;
import p003f.p004a.p005a.p012b.p027c.p030c.C0548a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p390t.p391a.C4547a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.c.a.e */
public final class C0543e implements C4427b<C0548a> {

    /* renamed from: a */
    public final C0539a f1965a;

    /* renamed from: b */
    public final C4547a<C0546a> f1966b;

    public C0543e(C0539a aVar, C4547a<C0546a> aVar2) {
        this.f1965a = aVar;
        this.f1966b = aVar2;
    }

    public Object get() {
        C0546a aVar = (C0546a) this.f1966b.get();
        if (this.f1965a == null) {
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
