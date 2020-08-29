package p003f.p004a.p005a.p012b.p050g.p051a;

import p003f.p004a.p005a.p012b.p050g.p052b.C0578a;
import p003f.p004a.p005a.p012b.p050g.p053c.C0580a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p390t.p391a.C4547a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.g.a.b */
public final class C0575b implements C4427b<C0580a> {

    /* renamed from: a */
    public final C0574a f1999a;

    /* renamed from: b */
    public final C4547a<C0578a> f2000b;

    public C0575b(C0574a aVar, C4547a<C0578a> aVar2) {
        this.f1999a = aVar;
        this.f2000b = aVar2;
    }

    public Object get() {
        C0578a aVar = (C0578a) this.f2000b.get();
        if (this.f1999a == null) {
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
