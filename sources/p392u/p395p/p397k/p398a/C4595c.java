package p392u.p395p.p397k.p398a;

import p392u.p395p.C4580d;
import p392u.p395p.C4581e;
import p392u.p395p.C4583f;
import p392u.p395p.C4583f.C4584a;
import p392u.p401r.p403c.C4638h;

/* renamed from: u.p.k.a.c */
public abstract class C4595c extends C4593a {

    /* renamed from: f */
    public transient C4580d<Object> f10807f;

    /* renamed from: g */
    public final C4583f f10808g;

    public C4595c(C4580d<Object> dVar) {
        C4583f b = dVar != null ? dVar.mo4219b() : null;
        super(dVar);
        this.f10808g = b;
    }

    public C4595c(C4580d<Object> dVar, C4583f fVar) {
        super(dVar);
        this.f10808g = fVar;
    }

    /* renamed from: b */
    public C4583f mo4219b() {
        C4583f fVar = this.f10808g;
        if (fVar != null) {
            return fVar;
        }
        C4638h.m10269a();
        throw null;
    }

    /* renamed from: f */
    public void mo10916f() {
        C4580d<Object> dVar = this.f10807f;
        if (!(dVar == null || dVar == this)) {
            C4584a aVar = mo4219b().get(C4581e.f10789b);
            if (aVar != null) {
                ((C4581e) aVar).mo4365a(dVar);
            } else {
                C4638h.m10269a();
                throw null;
            }
        }
        this.f10807f = C4594b.f10806e;
    }
}
