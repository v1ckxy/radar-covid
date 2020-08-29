package p003f.p004a.p005a.p012b.p062i.p063a;

import androidx.fragment.app.Fragment;
import p003f.p004a.p005a.p012b.p062i.p067e.C0613a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p390t.p391a.C4547a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.i.a.b */
public final class C0602b implements C4427b<Fragment> {

    /* renamed from: a */
    public final C0601a f2035a;

    /* renamed from: b */
    public final C4547a<C0613a> f2036b;

    public C0602b(C0601a aVar, C4547a<C0613a> aVar2) {
        this.f2035a = aVar;
        this.f2036b = aVar2;
    }

    public Object get() {
        C0613a aVar = (C0613a) this.f2036b.get();
        if (this.f2035a == null) {
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
