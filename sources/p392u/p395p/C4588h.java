package p392u.p395p;

import java.io.Serializable;
import p392u.p395p.C4583f.C4584a;
import p392u.p395p.C4583f.C4586b;
import p392u.p401r.p402b.C4622p;
import p392u.p401r.p403c.C4638h;

/* renamed from: u.p.h */
public final class C4588h implements C4583f, Serializable {

    /* renamed from: e */
    public static final C4588h f10792e = new C4588h();

    public <R> R fold(R r, C4622p<? super R, ? super C4584a, ? extends R> pVar) {
        if (pVar != null) {
            return r;
        }
        C4638h.m10271a("operation");
        throw null;
    }

    public <E extends C4584a> E get(C4586b<E> bVar) {
        if (bVar != null) {
            return null;
        }
        C4638h.m10271a("key");
        throw null;
    }

    public int hashCode() {
        return 0;
    }

    public C4583f minusKey(C4586b<?> bVar) {
        if (bVar != null) {
            return this;
        }
        C4638h.m10271a("key");
        throw null;
    }

    public C4583f plus(C4583f fVar) {
        if (fVar != null) {
            return fVar;
        }
        C4638h.m10271a("context");
        throw null;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
