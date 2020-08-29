package p003f.p004a.p005a.p012b.p013a.p016c;

import p003f.p004a.p005a.p012b.p013a.p015b.C0506a;
import p003f.p004a.p005a.p012b.p013a.p017d.C0517c;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p390t.p391a.C4547a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.a.c.e */
public final class C0514e implements C4427b<C0517c> {

    /* renamed from: a */
    public final C0510a f1927a;

    /* renamed from: b */
    public final C4547a<C0506a> f1928b;

    public C0514e(C0510a aVar, C4547a<C0506a> aVar2) {
        this.f1927a = aVar;
        this.f1928b = aVar2;
    }

    public Object get() {
        C0506a aVar = (C0506a) this.f1928b.get();
        if (this.f1927a == null) {
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
