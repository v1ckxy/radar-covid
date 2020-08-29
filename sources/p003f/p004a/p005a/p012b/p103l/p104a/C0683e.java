package p003f.p004a.p005a.p012b.p103l.p104a;

import p003f.p004a.p005a.p012b.p103l.p105b.C0687b;
import p003f.p004a.p005a.p012b.p103l.p106c.C0693a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p390t.p391a.C4547a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.l.a.e */
public final class C0683e implements C4427b<C0693a> {

    /* renamed from: a */
    public final C0679a f2122a;

    /* renamed from: b */
    public final C4547a<C0687b> f2123b;

    public C0683e(C0679a aVar, C4547a<C0687b> aVar2) {
        this.f2122a = aVar;
        this.f2123b = aVar2;
    }

    public Object get() {
        C0687b bVar = (C0687b) this.f2123b.get();
        if (this.f2122a == null) {
            throw null;
        } else if (bVar != null) {
            C2286e.m5279b(bVar, "Cannot return null from a non-@Nullable @Provides method");
            return bVar;
        } else {
            C4638h.m10271a("presenter");
            throw null;
        }
    }
}
