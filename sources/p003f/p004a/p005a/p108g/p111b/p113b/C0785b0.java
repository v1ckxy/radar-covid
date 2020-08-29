package p003f.p004a.p005a.p108g.p111b.p113b;

import p003f.p004a.p005a.p006a.p007a.C0433j;
import p003f.p004a.p005a.p006a.p007a.C0434k;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p390t.p391a.C4547a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.g.b.b.b0 */
public final class C0785b0 implements C4427b<C0433j> {

    /* renamed from: a */
    public final C0832y f2377a;

    /* renamed from: b */
    public final C4547a<C0434k> f2378b;

    public C0785b0(C0832y yVar, C4547a<C0434k> aVar) {
        this.f2377a = yVar;
        this.f2378b = aVar;
    }

    public Object get() {
        C0434k kVar = (C0434k) this.f2378b.get();
        if (this.f2377a == null) {
            throw null;
        } else if (kVar != null) {
            C2286e.m5279b(kVar, "Cannot return null from a non-@Nullable @Provides method");
            return kVar;
        } else {
            C4638h.m10271a("repository");
            throw null;
        }
    }
}
