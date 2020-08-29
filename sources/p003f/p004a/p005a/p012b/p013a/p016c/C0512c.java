package p003f.p004a.p005a.p012b.p013a.p016c;

import p003f.p004a.p005a.p012b.p013a.p014a.C0502a;
import p003f.p004a.p005a.p012b.p013a.p017d.C0515a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p390t.p391a.C4547a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.a.c.c */
public final class C0512c implements C4427b<C0515a> {

    /* renamed from: a */
    public final C0510a f1923a;

    /* renamed from: b */
    public final C4547a<C0502a> f1924b;

    public C0512c(C0510a aVar, C4547a<C0502a> aVar2) {
        this.f1923a = aVar;
        this.f1924b = aVar2;
    }

    public Object get() {
        C0502a aVar = (C0502a) this.f1924b.get();
        if (this.f1923a == null) {
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
