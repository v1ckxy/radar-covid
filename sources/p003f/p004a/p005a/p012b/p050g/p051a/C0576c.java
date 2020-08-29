package p003f.p004a.p005a.p012b.p050g.p051a;

import p003f.p004a.p005a.p012b.p050g.p053c.C0581b;
import p003f.p004a.p005a.p012b.p050g.p054d.C0583a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p390t.p391a.C4547a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.g.a.c */
public final class C0576c implements C4427b<C0581b> {

    /* renamed from: a */
    public final C0574a f2001a;

    /* renamed from: b */
    public final C4547a<C0583a> f2002b;

    public C0576c(C0574a aVar, C4547a<C0583a> aVar2) {
        this.f2001a = aVar;
        this.f2002b = aVar2;
    }

    public Object get() {
        C0583a aVar = (C0583a) this.f2002b.get();
        if (this.f2001a == null) {
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
