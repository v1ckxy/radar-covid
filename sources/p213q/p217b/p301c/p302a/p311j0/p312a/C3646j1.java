package p213q.p217b.p301c.p302a.p311j0.p312a;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3719v.C3720a;

/* renamed from: q.b.c.a.j0.a.j1 */
public class C3646j1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: e */
    public final int f9045e;

    /* renamed from: f */
    public List<C3653e> f9046f = Collections.emptyList();

    /* renamed from: g */
    public Map<K, V> f9047g = Collections.emptyMap();

    /* renamed from: h */
    public boolean f9048h;

    /* renamed from: i */
    public volatile C3655g f9049i;

    /* renamed from: j */
    public Map<K, V> f9050j = Collections.emptyMap();

    /* renamed from: k */
    public volatile C3649c f9051k;

    /* renamed from: q.b.c.a.j0.a.j1$a */
    public class C3647a extends C3646j1<FieldDescriptorType, Object> {
        public C3647a(int i) {
            super(i, null);
        }

        /* renamed from: e */
        public void mo9699e() {
            if (!this.f9048h) {
                for (int i = 0; i < mo9693b(); i++) {
                    Entry a = mo9691a(i);
                    if (((C3720a) a.getKey()).mo9977i()) {
                        a.setValue(Collections.unmodifiableList((List) a.getValue()));
                    }
                }
                for (Entry entry : mo9695c()) {
                    if (((C3720a) entry.getKey()).mo9977i()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            C3646j1.super.mo9699e();
        }
    }

    /* renamed from: q.b.c.a.j0.a.j1$b */
    public class C3648b implements Iterator<Entry<K, V>> {

        /* renamed from: e */
        public int f9052e = C3646j1.this.f9046f.size();

        /* renamed from: f */
        public Iterator<Entry<K, V>> f9053f;

        public /* synthetic */ C3648b(C3647a aVar) {
        }

        /* renamed from: b */
        public final Iterator<Entry<K, V>> mo9707b() {
            if (this.f9053f == null) {
                this.f9053f = C3646j1.this.f9050j.entrySet().iterator();
            }
            return this.f9053f;
        }

        public boolean hasNext() {
            int i = this.f9052e;
            return (i > 0 && i <= C3646j1.this.f9046f.size()) || mo9707b().hasNext();
        }

        public Object next() {
            Object obj;
            if (mo9707b().hasNext()) {
                obj = mo9707b().next();
            } else {
                List<C3653e> list = C3646j1.this.f9046f;
                int i = this.f9052e - 1;
                this.f9052e = i;
                obj = list.get(i);
            }
            return (Entry) obj;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: q.b.c.a.j0.a.j1$c */
    public class C3649c extends C3655g {
        public /* synthetic */ C3649c(C3647a aVar) {
            super(null);
        }

        public Iterator<Entry<K, V>> iterator() {
            return new C3648b(null);
        }
    }

    /* renamed from: q.b.c.a.j0.a.j1$d */
    public static class C3650d {

        /* renamed from: a */
        public static final Iterator<Object> f9056a = new C3651a();

        /* renamed from: b */
        public static final Iterable<Object> f9057b = new C3652b();

        /* renamed from: q.b.c.a.j0.a.j1$d$a */
        public class C3651a implements Iterator<Object> {
            public boolean hasNext() {
                return false;
            }

            public Object next() {
                throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: q.b.c.a.j0.a.j1$d$b */
        public class C3652b implements Iterable<Object> {
            public Iterator<Object> iterator() {
                return C3650d.f9056a;
            }
        }
    }

    /* renamed from: q.b.c.a.j0.a.j1$e */
    public class C3653e implements Entry<K, V>, Comparable<C3653e> {

        /* renamed from: e */
        public final K f9058e;

        /* renamed from: f */
        public V f9059f;

        public C3653e(K k, V v) {
            this.f9058e = k;
            this.f9059f = v;
        }

        public C3653e(C3646j1 j1Var, Entry<K, V> entry) {
            K k = (Comparable) entry.getKey();
            V value = entry.getValue();
            C3646j1.this = j1Var;
            this.f9058e = k;
            this.f9059f = value;
        }

        public int compareTo(Object obj) {
            return this.f9058e.compareTo(((C3653e) obj).f9058e);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
            if (r5 != false) goto L_0x0036;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r5) {
            /*
                r4 = this;
                r0 = 1
                if (r5 != r4) goto L_0x0004
                return r0
            L_0x0004:
                boolean r1 = r5 instanceof java.util.Map.Entry
                r2 = 0
                if (r1 != 0) goto L_0x000a
                return r2
            L_0x000a:
                java.util.Map$Entry r5 = (java.util.Map.Entry) r5
                K r1 = r4.f9058e
                java.lang.Object r3 = r5.getKey()
                if (r1 != 0) goto L_0x001a
                if (r3 != 0) goto L_0x0018
                r1 = r0
                goto L_0x001e
            L_0x0018:
                r1 = r2
                goto L_0x001e
            L_0x001a:
                boolean r1 = r1.equals(r3)
            L_0x001e:
                if (r1 == 0) goto L_0x0035
                V r1 = r4.f9059f
                java.lang.Object r5 = r5.getValue()
                if (r1 != 0) goto L_0x002e
                if (r5 != 0) goto L_0x002c
                r5 = r0
                goto L_0x0032
            L_0x002c:
                r5 = r2
                goto L_0x0032
            L_0x002e:
                boolean r5 = r1.equals(r5)
            L_0x0032:
                if (r5 == 0) goto L_0x0035
                goto L_0x0036
            L_0x0035:
                r0 = r2
            L_0x0036:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p301c.p302a.p311j0.p312a.C3646j1.C3653e.equals(java.lang.Object):boolean");
        }

        public Object getKey() {
            return this.f9058e;
        }

        public V getValue() {
            return this.f9059f;
        }

        public int hashCode() {
            K k = this.f9058e;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f9059f;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            C3646j1.this.mo9692a();
            V v2 = this.f9059f;
            this.f9059f = v;
            return v2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f9058e);
            sb.append("=");
            sb.append(this.f9059f);
            return sb.toString();
        }
    }

    /* renamed from: q.b.c.a.j0.a.j1$f */
    public class C3654f implements Iterator<Entry<K, V>> {

        /* renamed from: e */
        public int f9061e = -1;

        /* renamed from: f */
        public boolean f9062f;

        /* renamed from: g */
        public Iterator<Entry<K, V>> f9063g;

        public /* synthetic */ C3654f(C3647a aVar) {
        }

        /* renamed from: b */
        public final Iterator<Entry<K, V>> mo9723b() {
            if (this.f9063g == null) {
                this.f9063g = C3646j1.this.f9047g.entrySet().iterator();
            }
            return this.f9063g;
        }

        public boolean hasNext() {
            if (this.f9061e + 1 < C3646j1.this.f9046f.size()) {
                return true;
            }
            if (C3646j1.this.f9047g.isEmpty() || !mo9723b().hasNext()) {
                return false;
            }
            return true;
        }

        public Object next() {
            this.f9062f = true;
            int i = this.f9061e + 1;
            this.f9061e = i;
            return (Entry) (i < C3646j1.this.f9046f.size() ? C3646j1.this.f9046f.get(this.f9061e) : mo9723b().next());
        }

        public void remove() {
            if (this.f9062f) {
                this.f9062f = false;
                C3646j1.this.mo9692a();
                if (this.f9061e < C3646j1.this.f9046f.size()) {
                    C3646j1 j1Var = C3646j1.this;
                    int i = this.f9061e;
                    this.f9061e = i - 1;
                    j1Var.mo9694b(i);
                    return;
                }
                mo9723b().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    /* renamed from: q.b.c.a.j0.a.j1$g */
    public class C3655g extends AbstractSet<Entry<K, V>> {
        public /* synthetic */ C3655g(C3647a aVar) {
        }

        public boolean add(Object obj) {
            Entry entry = (Entry) obj;
            if (contains(entry)) {
                return false;
            }
            C3646j1.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public void clear() {
            C3646j1.this.clear();
        }

        public boolean contains(Object obj) {
            Entry entry = (Entry) obj;
            Object obj2 = C3646j1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        public Iterator<Entry<K, V>> iterator() {
            return new C3654f(null);
        }

        public boolean remove(Object obj) {
            Entry entry = (Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C3646j1.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return C3646j1.this.size();
        }
    }

    public /* synthetic */ C3646j1(int i, C3647a aVar) {
        this.f9045e = i;
    }

    /* renamed from: c */
    public static <FieldDescriptorType extends C3720a<FieldDescriptorType>> C3646j1<FieldDescriptorType, Object> m8430c(int i) {
        return new C3647a(i);
    }

    /* renamed from: a */
    public final int mo9689a(K k) {
        int size = this.f9046f.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(((C3653e) this.f9046f.get(size)).f9058e);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(((C3653e) this.f9046f.get(i2)).f9058e);
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: a */
    public Entry<K, V> mo9691a(int i) {
        return (Entry) this.f9046f.get(i);
    }

    /* renamed from: a */
    public final void mo9692a() {
        if (this.f9048h) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b */
    public int mo9693b() {
        return this.f9046f.size();
    }

    /* renamed from: b */
    public final V mo9694b(int i) {
        mo9692a();
        V v = ((C3653e) this.f9046f.remove(i)).f9059f;
        if (!this.f9047g.isEmpty()) {
            Iterator it = mo9698d().entrySet().iterator();
            this.f9046f.add(new C3653e(this, (Entry) it.next()));
            it.remove();
        }
        return v;
    }

    /* renamed from: c */
    public Iterable<Entry<K, V>> mo9695c() {
        if (this.f9047g.isEmpty()) {
            return C3650d.f9057b;
        }
        return this.f9047g.entrySet();
    }

    public void clear() {
        mo9692a();
        if (!this.f9046f.isEmpty()) {
            this.f9046f.clear();
        }
        if (!this.f9047g.isEmpty()) {
            this.f9047g.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return mo9689a((K) comparable) >= 0 || this.f9047g.containsKey(comparable);
    }

    /* renamed from: d */
    public final SortedMap<K, V> mo9698d() {
        mo9692a();
        if (this.f9047g.isEmpty() && !(this.f9047g instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f9047g = treeMap;
            this.f9050j = treeMap.descendingMap();
        }
        return (SortedMap) this.f9047g;
    }

    /* renamed from: e */
    public void mo9699e() {
        if (!this.f9048h) {
            this.f9047g = this.f9047g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f9047g);
            this.f9050j = this.f9050j.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f9050j);
            this.f9048h = true;
        }
    }

    public Set<Entry<K, V>> entrySet() {
        if (this.f9049i == null) {
            this.f9049i = new C3655g<>(null);
        }
        return this.f9049i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3646j1)) {
            return super.equals(obj);
        }
        C3646j1 j1Var = (C3646j1) obj;
        int size = size();
        if (size != j1Var.size()) {
            return false;
        }
        int b = mo9693b();
        if (b != j1Var.mo9693b()) {
            return entrySet().equals(j1Var.entrySet());
        }
        for (int i = 0; i < b; i++) {
            if (!mo9691a(i).equals(j1Var.mo9691a(i))) {
                return false;
            }
        }
        if (b != size) {
            return this.f9047g.equals(j1Var.f9047g);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = mo9689a((K) comparable);
        if (a >= 0) {
            return ((C3653e) this.f9046f.get(a)).f9059f;
        }
        return this.f9047g.get(comparable);
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < mo9693b(); i2++) {
            i += ((C3653e) this.f9046f.get(i2)).hashCode();
        }
        return this.f9047g.size() > 0 ? i + this.f9047g.hashCode() : i;
    }

    public V remove(Object obj) {
        mo9692a();
        Comparable comparable = (Comparable) obj;
        int a = mo9689a((K) comparable);
        if (a >= 0) {
            return mo9694b(a);
        }
        if (this.f9047g.isEmpty()) {
            return null;
        }
        return this.f9047g.remove(comparable);
    }

    public int size() {
        return this.f9047g.size() + this.f9046f.size();
    }

    /* renamed from: a */
    public V put(K k, V v) {
        mo9692a();
        int a = mo9689a(k);
        if (a >= 0) {
            C3653e eVar = (C3653e) this.f9046f.get(a);
            C3646j1.this.mo9692a();
            V v2 = eVar.f9059f;
            eVar.f9059f = v;
            return v2;
        }
        mo9692a();
        if (this.f9046f.isEmpty() && !(this.f9046f instanceof ArrayList)) {
            this.f9046f = new ArrayList(this.f9045e);
        }
        int i = -(a + 1);
        if (i >= this.f9045e) {
            return mo9698d().put(k, v);
        }
        int size = this.f9046f.size();
        int i2 = this.f9045e;
        if (size == i2) {
            C3653e eVar2 = (C3653e) this.f9046f.remove(i2 - 1);
            mo9698d().put(eVar2.f9058e, eVar2.f9059f);
        }
        this.f9046f.add(i, new C3653e(k, v));
        return null;
    }
}
