package p003f.p004a.p005a.p012b.p087k.p098c.p099a;

import p003f.p004a.p005a.p012b.p087k.p098c.p101c.C0675b;
import p003f.p004a.p005a.p012b.p087k.p098c.p102d.C0676a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p390t.p391a.C4547a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.k.c.a.c */
public final class C0671c implements C4427b<C0675b> {

    /* renamed from: a */
    public final C0669a f2109a;

    /* renamed from: b */
    public final C4547a<C0676a> f2110b;

    public C0671c(C0669a aVar, C4547a<C0676a> aVar2) {
        this.f2109a = aVar;
        this.f2110b = aVar2;
    }

    public Object get() {
        C0676a aVar = (C0676a) this.f2110b.get();
        if (this.f2109a == null) {
            throw null;
        } else if (aVar != null) {
            C2286e.m5279b(aVar, "Cannot return null from a non-@Nullable @Provides method");
            return aVar;
        } else {
            C4638h.m10271a("fragment");
            throw null;
        }
    }
}
