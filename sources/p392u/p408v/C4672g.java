package p392u.p408v;

import java.util.Iterator;
import p392u.p401r.p402b.C4618l;
import p392u.p401r.p403c.C4638h;
import p392u.p401r.p403c.p404p.C4646a;

/* renamed from: u.v.g */
public final class C4672g<T, R> implements C4669d<R> {

    /* renamed from: a */
    public final C4669d<T> f10855a;

    /* renamed from: b */
    public final C4618l<T, R> f10856b;

    /* renamed from: u.v.g$a */
    public static final class C4673a implements Iterator<R>, C4646a {

        /* renamed from: e */
        public final Iterator<T> f10857e;

        /* renamed from: f */
        public final /* synthetic */ C4672g f10858f;

        public C4673a(C4672g gVar) {
            this.f10858f = gVar;
            this.f10857e = gVar.f10855a.iterator();
        }

        public boolean hasNext() {
            return this.f10857e.hasNext();
        }

        public R next() {
            return this.f10858f.f10856b.mo3153b(this.f10857e.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C4672g(C4669d<? extends T> dVar, C4618l<? super T, ? extends R> lVar) {
        if (dVar == null) {
            C4638h.m10271a("sequence");
            throw null;
        } else if (lVar != null) {
            this.f10855a = dVar;
            this.f10856b = lVar;
        } else {
            C4638h.m10271a("transformer");
            throw null;
        }
    }

    public Iterator<R> iterator() {
        return new C4673a(this);
    }
}
