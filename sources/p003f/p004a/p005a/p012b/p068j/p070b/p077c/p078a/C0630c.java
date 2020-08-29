package p003f.p004a.p005a.p012b.p068j.p070b.p077c.p078a;

import p003f.p004a.p005a.p012b.p068j.p070b.p077c.p080c.C0635b;
import p003f.p004a.p005a.p012b.p068j.p070b.p077c.p081d.C0637a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p390t.p391a.C4547a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.j.b.c.a.c */
public final class C0630c implements C4427b<C0635b> {

    /* renamed from: a */
    public final C0628a f2070a;

    /* renamed from: b */
    public final C4547a<C0637a> f2071b;

    public C0630c(C0628a aVar, C4547a<C0637a> aVar2) {
        this.f2070a = aVar;
        this.f2071b = aVar2;
    }

    public Object get() {
        C0637a aVar = (C0637a) this.f2071b.get();
        if (this.f2070a == null) {
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
