package p392u.p395p;

import p392u.p395p.C4583f.C4584a;
import p392u.p395p.C4583f.C4584a.C4585a;
import p392u.p395p.C4583f.C4586b;
import p392u.p401r.p402b.C4622p;
import p392u.p401r.p403c.C4638h;

/* renamed from: u.p.a */
public abstract class C4576a implements C4584a {
    public final C4586b<?> key;

    public C4576a(C4586b<?> bVar) {
        if (bVar != null) {
            this.key = bVar;
        } else {
            C4638h.m10271a("key");
            throw null;
        }
    }

    public <R> R fold(R r, C4622p<? super R, ? super C4584a, ? extends R> pVar) {
        if (pVar != null) {
            return C4585a.m10230a(this, r, pVar);
        }
        C4638h.m10271a("operation");
        throw null;
    }

    public <E extends C4584a> E get(C4586b<E> bVar) {
        if (bVar != null) {
            return C4585a.m10231a((C4584a) this, bVar);
        }
        C4638h.m10271a("key");
        throw null;
    }

    public C4586b<?> getKey() {
        return this.key;
    }

    public C4583f minusKey(C4586b<?> bVar) {
        if (bVar != null) {
            return C4585a.m10233b(this, bVar);
        }
        C4638h.m10271a("key");
        throw null;
    }

    public C4583f plus(C4583f fVar) {
        if (fVar != null) {
            return C4585a.m10232a((C4584a) this, fVar);
        }
        C4638h.m10271a("context");
        throw null;
    }
}
