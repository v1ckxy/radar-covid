package p003f.p004a.p005a.p108g.p111b.p113b;

import p003f.p004a.p005a.p006a.p008b.C0436a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p390t.p391a.C4547a;
import p392u.p401r.p403c.C4638h;
import p484y.C5265d0.C5267b;

/* renamed from: f.a.a.g.b.b.p */
public final class C0819p implements C4427b<C0436a> {

    /* renamed from: a */
    public final C0818o f2379a;

    /* renamed from: b */
    public final C4547a<C5267b> f2380b;

    public C0819p(C0818o oVar, C4547a<C5267b> aVar) {
        this.f2379a = oVar;
        this.f2380b = aVar;
    }

    public Object get() {
        C5267b bVar = (C5267b) this.f2380b.get();
        if (this.f2379a == null) {
            throw null;
        } else if (bVar != null) {
            bVar.mo12000a("https://radarcovid.covid19.gob.es/");
            Object a = bVar.mo12002a().mo11993a(C0436a.class);
            C4638h.m10270a(a, "retrofitBuilder.baseUrl(…ApiInterface::class.java)");
            C0436a aVar = (C0436a) a;
            C2286e.m5279b(aVar, "Cannot return null from a non-@Nullable @Provides method");
            return aVar;
        } else {
            C4638h.m10271a("retrofitBuilder");
            throw null;
        }
    }
}
