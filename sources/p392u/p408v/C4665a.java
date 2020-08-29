package p392u.p408v;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import p392u.p401r.p403c.C4638h;

/* renamed from: u.v.a */
public final class C4665a<T> implements C4669d<T> {

    /* renamed from: a */
    public final AtomicReference<C4669d<T>> f10848a;

    public C4665a(C4669d<? extends T> dVar) {
        if (dVar != null) {
            this.f10848a = new AtomicReference<>(dVar);
        } else {
            C4638h.m10271a("sequence");
            throw null;
        }
    }

    public Iterator<T> iterator() {
        C4669d dVar = (C4669d) this.f10848a.getAndSet(null);
        if (dVar != null) {
            return dVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
