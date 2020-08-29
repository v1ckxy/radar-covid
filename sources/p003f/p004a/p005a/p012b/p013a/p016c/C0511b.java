package p003f.p004a.p005a.p012b.p013a.p016c;

import android.content.Context;
import p003f.p004a.p005a.p012b.p013a.p015b.C0506a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p390t.p391a.C4547a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.a.c.b */
public final class C0511b implements C4427b<Context> {

    /* renamed from: a */
    public final C0510a f1921a;

    /* renamed from: b */
    public final C4547a<C0506a> f1922b;

    public C0511b(C0510a aVar, C4547a<C0506a> aVar2) {
        this.f1921a = aVar;
        this.f1922b = aVar2;
    }

    public Object get() {
        C0506a aVar = (C0506a) this.f1922b.get();
        if (this.f1921a == null) {
            throw null;
        } else if (aVar != null) {
            Context U = aVar.mo781U();
            if (U != null) {
                C2286e.m5279b(U, "Cannot return null from a non-@Nullable @Provides method");
                return U;
            }
            C4638h.m10269a();
            throw null;
        } else {
            C4638h.m10271a("fragment");
            throw null;
        }
    }
}
