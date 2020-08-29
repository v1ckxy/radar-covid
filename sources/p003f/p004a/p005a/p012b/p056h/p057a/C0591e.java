package p003f.p004a.p005a.p012b.p056h.p057a;

import p003f.p004a.p005a.p012b.p056h.p059c.C0596b;
import p003f.p004a.p005a.p012b.p056h.p060d.C0598a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p390t.p391a.C4547a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.h.a.e */
public final class C0591e implements C4427b<C0596b> {

    /* renamed from: a */
    public final C0587a f2022a;

    /* renamed from: b */
    public final C4547a<C0598a> f2023b;

    public C0591e(C0587a aVar, C4547a<C0598a> aVar2) {
        this.f2022a = aVar;
        this.f2023b = aVar2;
    }

    public Object get() {
        C0598a aVar = (C0598a) this.f2023b.get();
        if (this.f2022a == null) {
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
