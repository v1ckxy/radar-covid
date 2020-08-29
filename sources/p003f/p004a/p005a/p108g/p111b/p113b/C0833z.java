package p003f.p004a.p005a.p108g.p111b.p113b;

import p003f.p004a.p005a.p006a.p007a.C0413b;
import p003f.p004a.p005a.p006a.p007a.C0414c;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p390t.p391a.C4547a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.g.b.b.z */
public final class C0833z implements C4427b<C0413b> {

    /* renamed from: a */
    public final C0832y f2388a;

    /* renamed from: b */
    public final C4547a<C0414c> f2389b;

    public C0833z(C0832y yVar, C4547a<C0414c> aVar) {
        this.f2388a = yVar;
        this.f2389b = aVar;
    }

    public Object get() {
        C0414c cVar = (C0414c) this.f2389b.get();
        if (this.f2388a == null) {
            throw null;
        } else if (cVar != null) {
            C2286e.m5279b(cVar, "Cannot return null from a non-@Nullable @Provides method");
            return cVar;
        } else {
            C4638h.m10271a("repository");
            throw null;
        }
    }
}
