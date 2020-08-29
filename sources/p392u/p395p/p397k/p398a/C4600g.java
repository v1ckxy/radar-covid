package p392u.p395p.p397k.p398a;

import p392u.p395p.C4580d;
import p392u.p395p.C4583f;
import p392u.p395p.C4588h;

/* renamed from: u.p.k.a.g */
public abstract class C4600g extends C4593a {
    public C4600g(C4580d<Object> dVar) {
        super(dVar);
        if (dVar != null) {
            if (!(dVar.mo4219b() == C4588h.f10792e)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    /* renamed from: b */
    public C4583f mo4219b() {
        return C4588h.f10792e;
    }
}
