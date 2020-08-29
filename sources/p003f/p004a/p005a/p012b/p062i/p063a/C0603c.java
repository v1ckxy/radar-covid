package p003f.p004a.p005a.p012b.p062i.p063a;

import p003f.p004a.p005a.p012b.p062i.p064b.C0606a;
import p003f.p004a.p005a.p012b.p062i.p065c.C0608a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p390t.p391a.C4547a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.i.a.c */
public final class C0603c implements C4427b<C0608a> {

    /* renamed from: a */
    public final C0601a f2037a;

    /* renamed from: b */
    public final C4547a<C0606a> f2038b;

    public C0603c(C0601a aVar, C4547a<C0606a> aVar2) {
        this.f2037a = aVar;
        this.f2038b = aVar2;
    }

    public Object get() {
        C0606a aVar = (C0606a) this.f2038b.get();
        if (this.f2037a == null) {
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
