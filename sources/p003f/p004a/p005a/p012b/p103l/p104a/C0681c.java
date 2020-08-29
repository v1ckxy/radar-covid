package p003f.p004a.p005a.p012b.p103l.p104a;

import p003f.p004a.p005a.p006a.p007a.C0407a;
import p003f.p004a.p005a.p006a.p007a.C0425e;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p390t.p391a.C4547a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.l.a.c */
public final class C0681c implements C4427b<C0425e> {

    /* renamed from: a */
    public final C0679a f2118a;

    /* renamed from: b */
    public final C4547a<C0407a> f2119b;

    public C0681c(C0679a aVar, C4547a<C0407a> aVar2) {
        this.f2118a = aVar;
        this.f2119b = aVar2;
    }

    public Object get() {
        C0407a aVar = (C0407a) this.f2119b.get();
        if (this.f2118a == null) {
            throw null;
        } else if (aVar != null) {
            C2286e.m5279b(aVar, "Cannot return null from a non-@Nullable @Provides method");
            return aVar;
        } else {
            C4638h.m10271a("repository");
            throw null;
        }
    }
}
