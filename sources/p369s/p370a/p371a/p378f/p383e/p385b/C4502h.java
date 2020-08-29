package p369s.p370a.p371a.p378f.p383e.p385b;

import java.util.Objects;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p369s.p370a.p371a.p374b.C4440g;
import p369s.p370a.p371a.p374b.C4443j;
import p369s.p370a.p371a.p374b.C4444k;
import p369s.p370a.p371a.p375c.C4450c;
import p369s.p370a.p371a.p377e.C4461d;
import p369s.p370a.p371a.p377e.C4462e;
import p369s.p370a.p371a.p378f.p379a.C4464b;

/* renamed from: s.a.a.f.e.b.h */
public final class C4502h<T, R> extends C4440g<R> {

    /* renamed from: a */
    public final T f10638a;

    /* renamed from: b */
    public final C4461d<? super T, ? extends C4443j<? extends R>> f10639b;

    public C4502h(T t, C4461d<? super T, ? extends C4443j<? extends R>> dVar) {
        this.f10638a = t;
        this.f10639b = dVar;
    }

    /* renamed from: b */
    public void mo10721b(C4444k<? super R> kVar) {
        try {
            C4443j jVar = (C4443j) Objects.requireNonNull(this.f10639b.mo3712a(this.f10638a), "The mapper returned a null ObservableSource");
            if (jVar instanceof C4462e) {
                try {
                    Object obj = ((C4462e) jVar).get();
                    if (obj == null) {
                        kVar.mo10724a((C4450c) C4464b.INSTANCE);
                        kVar.mo10722a();
                        return;
                    }
                    C4501g gVar = new C4501g(kVar, obj);
                    kVar.mo10724a((C4450c) gVar);
                    gVar.run();
                } catch (Throwable th) {
                    C2286e.m5312c(th);
                    kVar.mo10724a((C4450c) C4464b.INSTANCE);
                    kVar.mo10723a(th);
                }
            } else {
                jVar.mo10720a(kVar);
            }
        } catch (Throwable th2) {
            C2286e.m5312c(th2);
            kVar.mo10724a((C4450c) C4464b.INSTANCE);
            kVar.mo10723a(th2);
        }
    }
}
