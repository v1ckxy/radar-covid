package p003f.p004a.p005a.p108g.p111b.p113b;

import p003f.p004a.p005a.p006a.p007a.C0427g;
import p003f.p004a.p005a.p006a.p007a.C0428h;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p390t.p391a.C4547a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.g.b.b.a0 */
public final class C0782a0 implements C4427b<C0427g> {

    /* renamed from: a */
    public final C0832y f2375a;

    /* renamed from: b */
    public final C4547a<C0428h> f2376b;

    public C0782a0(C0832y yVar, C4547a<C0428h> aVar) {
        this.f2375a = yVar;
        this.f2376b = aVar;
    }

    public Object get() {
        C0428h hVar = (C0428h) this.f2376b.get();
        if (this.f2375a == null) {
            throw null;
        } else if (hVar != null) {
            C2286e.m5279b(hVar, "Cannot return null from a non-@Nullable @Provides method");
            return hVar;
        } else {
            C4638h.m10271a("repository");
            throw null;
        }
    }
}
