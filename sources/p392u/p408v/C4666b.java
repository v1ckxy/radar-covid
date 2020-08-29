package p392u.p408v;

import java.util.Iterator;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4638h;
import p392u.p401r.p403c.p404p.C4646a;

/* renamed from: u.v.b */
public final class C4666b<T> implements C4669d<T>, C4668c<T> {

    /* renamed from: a */
    public final C4669d<T> f10849a;

    /* renamed from: b */
    public final int f10850b;

    /* renamed from: u.v.b$a */
    public static final class C4667a implements Iterator<T>, C4646a {

        /* renamed from: e */
        public final Iterator<T> f10851e;

        /* renamed from: f */
        public int f10852f;

        public C4667a(C4666b bVar) {
            this.f10851e = bVar.f10849a.iterator();
            this.f10852f = bVar.f10850b;
        }

        /* renamed from: b */
        public final void mo10952b() {
            while (this.f10852f > 0 && this.f10851e.hasNext()) {
                this.f10851e.next();
                this.f10852f--;
            }
        }

        public boolean hasNext() {
            mo10952b();
            return this.f10851e.hasNext();
        }

        public T next() {
            mo10952b();
            return this.f10851e.next();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C4666b(C4669d<? extends T> dVar, int i) {
        if (dVar != null) {
            this.f10849a = dVar;
            this.f10850b = i;
            if (!(i >= 0)) {
                StringBuilder a = C1965a.m4756a("count must be non-negative, but was ");
                a.append(this.f10850b);
                a.append('.');
                throw new IllegalArgumentException(a.toString().toString());
            }
            return;
        }
        C4638h.m10271a("sequence");
        throw null;
    }

    /* renamed from: a */
    public C4669d<T> mo10951a(int i) {
        int i2 = this.f10850b + i;
        return i2 < 0 ? new C4666b(this, i) : new C4666b(this.f10849a, i2);
    }

    public Iterator<T> iterator() {
        return new C4667a(this);
    }
}
