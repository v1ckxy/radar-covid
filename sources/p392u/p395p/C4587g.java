package p392u.p395p;

import p392u.p395p.C4583f.C4584a;
import p392u.p401r.p402b.C4622p;
import p392u.p401r.p403c.C4638h;
import p392u.p401r.p403c.C4639i;

/* renamed from: u.p.g */
public final class C4587g extends C4639i implements C4622p<C4583f, C4584a, C4583f> {

    /* renamed from: f */
    public static final C4587g f10791f = new C4587g();

    public C4587g() {
        super(2);
    }

    /* renamed from: a */
    public Object mo3781a(Object obj, Object obj2) {
        C4583f fVar = (C4583f) obj;
        C4584a aVar = (C4584a) obj2;
        if (fVar == null) {
            C4638h.m10271a("acc");
            throw null;
        } else if (aVar != null) {
            C4583f minusKey = fVar.minusKey(aVar.getKey());
            if (minusKey == C4588h.f10792e) {
                return aVar;
            }
            C4581e eVar = (C4581e) minusKey.get(C4581e.f10789b);
            if (eVar == null) {
                return new C4578c(minusKey, aVar);
            }
            C4583f minusKey2 = minusKey.minusKey(C4581e.f10789b);
            return minusKey2 == C4588h.f10792e ? new C4578c(aVar, eVar) : new C4578c(new C4578c(minusKey2, aVar), eVar);
        } else {
            C4638h.m10271a("element");
            throw null;
        }
    }
}
