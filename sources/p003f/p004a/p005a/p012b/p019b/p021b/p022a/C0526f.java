package p003f.p004a.p005a.p012b.p019b.p021b.p022a;

import p003f.p004a.p005a.p012b.p019b.p021b.p023b.C0530c;
import p003f.p004a.p005a.p012b.p019b.p021b.p024c.C0532a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p390t.p391a.C4547a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.b.b.a.f */
public final class C0526f implements C4427b<C0532a> {

    /* renamed from: a */
    public final C0521a f1941a;

    /* renamed from: b */
    public final C4547a<C0530c> f1942b;

    public C0526f(C0521a aVar, C4547a<C0530c> aVar2) {
        this.f1941a = aVar;
        this.f1942b = aVar2;
    }

    public Object get() {
        C0530c cVar = (C0530c) this.f1942b.get();
        if (this.f1941a == null) {
            throw null;
        } else if (cVar != null) {
            C2286e.m5279b(cVar, "Cannot return null from a non-@Nullable @Provides method");
            return cVar;
        } else {
            C4638h.m10271a("presenter");
            throw null;
        }
    }
}
