package p003f.p004a.p005a.p012b.p027c.p028a;

import p003f.p004a.p005a.p012b.p027c.p030c.C0549b;
import p003f.p004a.p005a.p012b.p027c.p037e.C0558a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p390t.p391a.C4547a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.c.a.f */
public final class C0544f implements C4427b<C0549b> {

    /* renamed from: a */
    public final C0539a f1967a;

    /* renamed from: b */
    public final C4547a<C0558a> f1968b;

    public C0544f(C0539a aVar, C4547a<C0558a> aVar2) {
        this.f1967a = aVar;
        this.f1968b = aVar2;
    }

    public Object get() {
        C0558a aVar = (C0558a) this.f1968b.get();
        if (this.f1967a == null) {
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
