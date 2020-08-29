package p003f.p004a.p005a.p012b.p027c.p028a;

import p003f.p004a.p005a.p006a.p007a.C0407a;
import p003f.p004a.p005a.p006a.p007a.C0425e;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p390t.p391a.C4547a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.c.a.c */
public final class C0541c implements C4427b<C0425e> {

    /* renamed from: a */
    public final C0539a f1961a;

    /* renamed from: b */
    public final C4547a<C0407a> f1962b;

    public C0541c(C0539a aVar, C4547a<C0407a> aVar2) {
        this.f1961a = aVar;
        this.f1962b = aVar2;
    }

    public Object get() {
        C0407a aVar = (C0407a) this.f1962b.get();
        if (this.f1961a == null) {
            throw null;
        } else if (aVar != null) {
            C2286e.m5279b(aVar, "Cannot return null from a non-@Nullable @Provides method");
            return aVar;
        } else {
            C4638h.m10271a("repository");
            throw null;
        }
    }
}
