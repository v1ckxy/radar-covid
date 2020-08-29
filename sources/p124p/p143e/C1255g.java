package p124p.p143e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: p.e.g */
public abstract class C1255g<K, V> {

    /* renamed from: a */
    public C1257b f3568a;

    /* renamed from: b */
    public C1258c f3569b;

    /* renamed from: c */
    public C1260e f3570c;

    /* renamed from: p.e.g$a */
    public final class C1256a<T> implements Iterator<T> {

        /* renamed from: e */
        public final int f3571e;

        /* renamed from: f */
        public int f3572f;

        /* renamed from: g */
        public int f3573g;

        /* renamed from: h */
        public boolean f3574h = false;

        public C1256a(int i) {
            this.f3571e = i;
            this.f3572f = C1255g.this.mo5489c();
        }

        public boolean hasNext() {
            return this.f3573g < this.f3572f;
        }

        public T next() {
            if (hasNext()) {
                T a = C1255g.this.mo5482a(this.f3573g, this.f3571e);
                this.f3573g++;
                this.f3574h = true;
                return a;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f3574h) {
                int i = this.f3573g - 1;
                this.f3573g = i;
                this.f3572f--;
                this.f3574h = false;
                C1255g.this.mo5485a(i);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: p.e.g$b */
    public final class C1257b implements Set<Entry<K, V>> {
        public C1257b() {
        }

        public boolean add(Object obj) {
            Entry entry = (Entry) obj;
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends Entry<K, V>> collection) {
            int c = C1255g.this.mo5489c();
            for (Entry entry : collection) {
                C1255g.this.mo5486a(entry.getKey(), entry.getValue());
            }
            return c != C1255g.this.mo5489c();
        }

        public void clear() {
            C1255g.this.mo5484a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            int a = C1255g.this.mo5481a(entry.getKey());
            if (a < 0) {
                return false;
            }
            return C1252d.m3161a(C1255g.this.mo5482a(a, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return C1255g.m3180a((Set<T>) this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int c = C1255g.this.mo5489c() - 1; c >= 0; c--) {
                Object a = C1255g.this.mo5482a(c, 0);
                Object a2 = C1255g.this.mo5482a(c, 1);
                i += (a == null ? 0 : a.hashCode()) ^ (a2 == null ? 0 : a2.hashCode());
            }
            return i;
        }

        public boolean isEmpty() {
            return C1255g.this.mo5489c() == 0;
        }

        public Iterator<Entry<K, V>> iterator() {
            return new C1259d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return C1255g.this.mo5489c();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: p.e.g$c */
    public final class C1258c implements Set<K> {
        public C1258c() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C1255g.this.mo5484a();
        }

        public boolean contains(Object obj) {
            return C1255g.this.mo5481a(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            Map b = C1255g.this.mo5488b();
            for (Object containsKey : collection) {
                if (!b.containsKey(containsKey)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return C1255g.m3180a((Set<T>) this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int c = C1255g.this.mo5489c() - 1; c >= 0; c--) {
                Object a = C1255g.this.mo5482a(c, 0);
                i += a == null ? 0 : a.hashCode();
            }
            return i;
        }

        public boolean isEmpty() {
            return C1255g.this.mo5489c() == 0;
        }

        public Iterator<K> iterator() {
            return new C1256a(0);
        }

        public boolean remove(Object obj) {
            int a = C1255g.this.mo5481a(obj);
            if (a < 0) {
                return false;
            }
            C1255g.this.mo5485a(a);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            Map b = C1255g.this.mo5488b();
            int size = b.size();
            for (Object remove : collection) {
                b.remove(remove);
            }
            return size != b.size();
        }

        public boolean retainAll(Collection<?> collection) {
            return C1255g.m3179a(C1255g.this.mo5488b(), collection);
        }

        public int size() {
            return C1255g.this.mo5489c();
        }

        public Object[] toArray() {
            return C1255g.this.mo5530b(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return C1255g.this.mo5529a(tArr, 0);
        }
    }

    /* renamed from: p.e.g$d */
    public final class C1259d implements Iterator<Entry<K, V>>, Entry<K, V> {

        /* renamed from: e */
        public int f3578e;

        /* renamed from: f */
        public int f3579f;

        /* renamed from: g */
        public boolean f3580g = false;

        public C1259d() {
            this.f3578e = C1255g.this.mo5489c() - 1;
            this.f3579f = -1;
        }

        public boolean equals(Object obj) {
            if (this.f3580g) {
                boolean z = false;
                if (!(obj instanceof Entry)) {
                    return false;
                }
                Entry entry = (Entry) obj;
                if (C1252d.m3161a(entry.getKey(), C1255g.this.mo5482a(this.f3579f, 0)) && C1252d.m3161a(entry.getValue(), C1255g.this.mo5482a(this.f3579f, 1))) {
                    z = true;
                }
                return z;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public K getKey() {
            if (this.f3580g) {
                return C1255g.this.mo5482a(this.f3579f, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f3580g) {
                return C1255g.this.mo5482a(this.f3579f, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f3579f < this.f3578e;
        }

        public int hashCode() {
            if (this.f3580g) {
                int i = 0;
                Object a = C1255g.this.mo5482a(this.f3579f, 0);
                Object a2 = C1255g.this.mo5482a(this.f3579f, 1);
                int hashCode = a == null ? 0 : a.hashCode();
                if (a2 != null) {
                    i = a2.hashCode();
                }
                return hashCode ^ i;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public Object next() {
            if (hasNext()) {
                this.f3579f++;
                this.f3580g = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f3580g) {
                C1255g.this.mo5485a(this.f3579f);
                this.f3579f--;
                this.f3578e--;
                this.f3580g = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v) {
            if (this.f3580g) {
                return C1255g.this.mo5483a(this.f3579f, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append("=");
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* renamed from: p.e.g$e */
    public final class C1260e implements Collection<V> {
        public C1260e() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C1255g.this.mo5484a();
        }

        public boolean contains(Object obj) {
            return C1255g.this.mo5487b(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return C1255g.this.mo5489c() == 0;
        }

        public Iterator<V> iterator() {
            return new C1256a(1);
        }

        public boolean remove(Object obj) {
            int b = C1255g.this.mo5487b(obj);
            if (b < 0) {
                return false;
            }
            C1255g.this.mo5485a(b);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int c = C1255g.this.mo5489c();
            int i = 0;
            boolean z = false;
            while (i < c) {
                if (collection.contains(C1255g.this.mo5482a(i, 1))) {
                    C1255g.this.mo5485a(i);
                    i--;
                    c--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int c = C1255g.this.mo5489c();
            int i = 0;
            boolean z = false;
            while (i < c) {
                if (!collection.contains(C1255g.this.mo5482a(i, 1))) {
                    C1255g.this.mo5485a(i);
                    i--;
                    c--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return C1255g.this.mo5489c();
        }

        public Object[] toArray() {
            return C1255g.this.mo5530b(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return C1255g.this.mo5529a(tArr, 1);
        }
    }

    /* renamed from: a */
    public static <K, V> boolean m3179a(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* renamed from: a */
    public static <T> boolean m3180a(Set<T> set, Object obj) {
        boolean z = true;
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    z = false;
                }
                return z;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public abstract int mo5481a(Object obj);

    /* renamed from: a */
    public abstract Object mo5482a(int i, int i2);

    /* renamed from: a */
    public abstract V mo5483a(int i, V v);

    /* renamed from: a */
    public abstract void mo5484a();

    /* renamed from: a */
    public abstract void mo5485a(int i);

    /* renamed from: a */
    public abstract void mo5486a(K k, V v);

    /* renamed from: a */
    public <T> T[] mo5529a(T[] tArr, int i) {
        int c = mo5489c();
        if (tArr.length < c) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), c);
        }
        for (int i2 = 0; i2 < c; i2++) {
            tArr[i2] = mo5482a(i2, i);
        }
        if (tArr.length > c) {
            tArr[c] = null;
        }
        return tArr;
    }

    /* renamed from: b */
    public abstract int mo5487b(Object obj);

    /* renamed from: b */
    public abstract Map<K, V> mo5488b();

    /* renamed from: b */
    public Object[] mo5530b(int i) {
        int c = mo5489c();
        Object[] objArr = new Object[c];
        for (int i2 = 0; i2 < c; i2++) {
            objArr[i2] = mo5482a(i2, i);
        }
        return objArr;
    }

    /* renamed from: c */
    public abstract int mo5489c();
}
