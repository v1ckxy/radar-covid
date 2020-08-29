package p213q.p217b.p301c.p302a.p311j0.p312a;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: q.b.c.a.j0.a.p1 */
public class C3686p1 extends AbstractList<String> implements C3627h0, RandomAccess {

    /* renamed from: e */
    public final C3627h0 f9128e;

    /* renamed from: q.b.c.a.j0.a.p1$a */
    public class C3687a implements ListIterator<String> {

        /* renamed from: e */
        public ListIterator<String> f9129e = C3686p1.this.f9128e.listIterator(this.f9130f);

        /* renamed from: f */
        public final /* synthetic */ int f9130f;

        public C3687a(int i) {
            this.f9130f = i;
        }

        public void add(Object obj) {
            String str = (String) obj;
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f9129e.hasNext();
        }

        public boolean hasPrevious() {
            return this.f9129e.hasPrevious();
        }

        public Object next() {
            return (String) this.f9129e.next();
        }

        public int nextIndex() {
            return this.f9129e.nextIndex();
        }

        public Object previous() {
            return (String) this.f9129e.previous();
        }

        public int previousIndex() {
            return this.f9129e.previousIndex();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public void set(Object obj) {
            String str = (String) obj;
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: q.b.c.a.j0.a.p1$b */
    public class C3688b implements Iterator<String> {

        /* renamed from: e */
        public Iterator<String> f9132e = C3686p1.this.f9128e.iterator();

        public C3688b() {
        }

        public boolean hasNext() {
            return this.f9132e.hasNext();
        }

        public Object next() {
            return (String) this.f9132e.next();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C3686p1(C3627h0 h0Var) {
        this.f9128e = h0Var;
    }

    /* renamed from: a */
    public void mo9633a(C3635j jVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public Object mo9635d(int i) {
        return this.f9128e.mo9635d(i);
    }

    public Object get(int i) {
        return (String) this.f9128e.get(i);
    }

    public Iterator<String> iterator() {
        return new C3688b();
    }

    public ListIterator<String> listIterator(int i) {
        return new C3687a(i);
    }

    /* renamed from: n */
    public C3627h0 mo9637n() {
        return this;
    }

    /* renamed from: q */
    public List<?> mo9638q() {
        return this.f9128e.mo9638q();
    }

    public int size() {
        return this.f9128e.size();
    }
}
