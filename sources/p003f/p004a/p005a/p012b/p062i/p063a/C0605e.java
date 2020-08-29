package p003f.p004a.p005a.p012b.p062i.p063a;

import p003f.p004a.p005a.p012b.p062i.p065c.C0610c;
import p003f.p004a.p005a.p012b.p062i.p067e.C0613a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p390t.p391a.C4547a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.i.a.e */
public final class C0605e implements C4427b<C0610c> {

    /* renamed from: a */
    public final C0601a f2041a;

    /* renamed from: b */
    public final C4547a<C0613a> f2042b;

    public C0605e(C0601a aVar, C4547a<C0613a> aVar2) {
        this.f2041a = aVar;
        this.f2042b = aVar2;
    }

    public Object get() {
        C0613a aVar = (C0613a) this.f2042b.get();
        if (this.f2041a == null) {
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
