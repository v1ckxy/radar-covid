package p003f.p004a.p005a.p012b.p087k.p098c.p099a;

import p003f.p004a.p005a.p012b.p087k.p098c.p100b.C0672a;
import p003f.p004a.p005a.p012b.p087k.p098c.p101c.C0674a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p390t.p391a.C4547a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.k.c.a.b */
public final class C0670b implements C4427b<C0674a> {

    /* renamed from: a */
    public final C0669a f2107a;

    /* renamed from: b */
    public final C4547a<C0672a> f2108b;

    public C0670b(C0669a aVar, C4547a<C0672a> aVar2) {
        this.f2107a = aVar;
        this.f2108b = aVar2;
    }

    public Object get() {
        C0672a aVar = (C0672a) this.f2108b.get();
        if (this.f2107a == null) {
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
