package p003f.p004a.p005a.p012b.p013a.p016c;

import p003f.p004a.p005a.p012b.p013a.p017d.C0516b;
import p003f.p004a.p005a.p012b.p013a.p018e.C0518a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p390t.p391a.C4547a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.a.c.d */
public final class C0513d implements C4427b<C0516b> {

    /* renamed from: a */
    public final C0510a f1925a;

    /* renamed from: b */
    public final C4547a<C0518a> f1926b;

    public C0513d(C0510a aVar, C4547a<C0518a> aVar2) {
        this.f1925a = aVar;
        this.f1926b = aVar2;
    }

    public Object get() {
        C0518a aVar = (C0518a) this.f1926b.get();
        if (this.f1925a == null) {
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
