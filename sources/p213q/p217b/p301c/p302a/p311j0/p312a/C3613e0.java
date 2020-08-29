package p213q.p217b.p301c.p302a.p311j0.p312a;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: q.b.c.a.j0.a.e0 */
public class C3613e0 extends C3621f0 {

    /* renamed from: q.b.c.a.j0.a.e0$b */
    public static class C3615b<K> implements Entry<K, Object> {

        /* renamed from: e */
        public Entry<K, C3613e0> f9003e;

        public /* synthetic */ C3615b(Entry entry, C3614a aVar) {
            this.f9003e = entry;
        }

        public K getKey() {
            return this.f9003e.getKey();
        }

        public Object getValue() {
            C3613e0 e0Var = (C3613e0) this.f9003e.getValue();
            if (e0Var == null) {
                return null;
            }
            return e0Var.mo9546b();
        }

        public Object setValue(Object obj) {
            if (obj instanceof C3706s0) {
                C3613e0 e0Var = (C3613e0) this.f9003e.getValue();
                C3706s0 s0Var = (C3706s0) obj;
                C3706s0 s0Var2 = e0Var.f9017b;
                e0Var.f9016a = null;
                e0Var.f9018c = null;
                e0Var.f9017b = s0Var;
                return s0Var2;
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* renamed from: q.b.c.a.j0.a.e0$c */
    public static class C3616c<K> implements Iterator<Entry<K, Object>> {

        /* renamed from: e */
        public Iterator<Entry<K, Object>> f9004e;

        public C3616c(Iterator<Entry<K, Object>> it) {
            this.f9004e = it;
        }

        public boolean hasNext() {
            return this.f9004e.hasNext();
        }

        public Object next() {
            Entry entry = (Entry) this.f9004e.next();
            return entry.getValue() instanceof C3613e0 ? new C3615b(entry, null) : entry;
        }

        public void remove() {
            this.f9004e.remove();
        }
    }

    /* renamed from: b */
    public C3706s0 mo9546b() {
        mo9623a(null);
        return this.f9017b;
    }

    public boolean equals(Object obj) {
        return mo9546b().equals(obj);
    }

    public int hashCode() {
        return mo9546b().hashCode();
    }

    public String toString() {
        return mo9546b().toString();
    }
}
