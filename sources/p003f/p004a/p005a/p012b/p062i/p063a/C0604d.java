package p003f.p004a.p005a.p012b.p062i.p063a;

import p003f.p004a.p005a.p012b.p062i.p065c.C0609b;
import p003f.p004a.p005a.p012b.p062i.p066d.C0611a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p390t.p391a.C4547a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.i.a.d */
public final class C0604d implements C4427b<C0609b> {

    /* renamed from: a */
    public final C0601a f2039a;

    /* renamed from: b */
    public final C4547a<C0611a> f2040b;

    public C0604d(C0601a aVar, C4547a<C0611a> aVar2) {
        this.f2039a = aVar;
        this.f2040b = aVar2;
    }

    public Object get() {
        C0611a aVar = (C0611a) this.f2040b.get();
        if (this.f2039a == null) {
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
