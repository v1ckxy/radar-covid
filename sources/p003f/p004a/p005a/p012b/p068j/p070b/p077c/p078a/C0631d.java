package p003f.p004a.p005a.p012b.p068j.p070b.p077c.p078a;

import p003f.p004a.p005a.p012b.p068j.p070b.p077c.p080c.C0636c;
import p003f.p004a.p005a.p012b.p068j.p070b.p077c.p082e.C0640b;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p390t.p391a.C4547a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.j.b.c.a.d */
public final class C0631d implements C4427b<C0636c> {

    /* renamed from: a */
    public final C0628a f2072a;

    /* renamed from: b */
    public final C4547a<C0640b> f2073b;

    public C0631d(C0628a aVar, C4547a<C0640b> aVar2) {
        this.f2072a = aVar;
        this.f2073b = aVar2;
    }

    public Object get() {
        C0640b bVar = (C0640b) this.f2073b.get();
        if (this.f2072a == null) {
            throw null;
        } else if (bVar != null) {
            C2286e.m5279b(bVar, "Cannot return null from a non-@Nullable @Provides method");
            return bVar;
        } else {
            C4638h.m10271a("fragment");
            throw null;
        }
    }
}
