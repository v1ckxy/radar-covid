package p213q.p217b.p355e.p357v;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: q.b.e.v.r */
public final class C4375r<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: l */
    public static final Comparator<Comparable> f10414l = new C4376a();

    /* renamed from: e */
    public Comparator<? super K> f10415e;

    /* renamed from: f */
    public C4382e<K, V> f10416f;

    /* renamed from: g */
    public int f10417g = 0;

    /* renamed from: h */
    public int f10418h = 0;

    /* renamed from: i */
    public final C4382e<K, V> f10419i = new C4382e<>();

    /* renamed from: j */
    public C4377b f10420j;

    /* renamed from: k */
    public C4379c f10421k;

    /* renamed from: q.b.e.v.r$a */
    public static class C4376a implements Comparator<Comparable> {
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }

    /* renamed from: q.b.e.v.r$b */
    public class C4377b extends AbstractSet<Entry<K, V>> {

        /* renamed from: q.b.e.v.r$b$a */
        public class C4378a extends C4381d<Entry<K, V>> {
            public C4378a(C4377b bVar) {
                super();
            }

            public Object next() {
                return mo10615b();
            }
        }

        public C4377b() {
        }

        public void clear() {
            C4375r.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Entry) && C4375r.this.mo10588a((Entry) obj) != null;
        }

        public Iterator<Entry<K, V>> iterator() {
            return new C4378a(this);
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            C4382e a = C4375r.this.mo10588a((Entry) obj);
            if (a == null) {
                return false;
            }
            C4375r.this.mo10593b(a, true);
            return true;
        }

        public int size() {
            return C4375r.this.f10417g;
        }
    }

    /* renamed from: q.b.e.v.r$c */
    public final class C4379c extends AbstractSet<K> {

        /* renamed from: q.b.e.v.r$c$a */
        public class C4380a extends C4381d<K> {
            public C4380a(C4379c cVar) {
                super();
            }

            public K next() {
                return mo10615b().f10433j;
            }
        }

        public C4379c() {
        }

        public void clear() {
            C4375r.this.clear();
        }

        public boolean contains(Object obj) {
            return C4375r.this.mo10586a(obj) != null;
        }

        public Iterator<K> iterator() {
            return new C4380a(this);
        }

        public boolean remove(Object obj) {
            C4375r rVar = C4375r.this;
            C4382e a = rVar.mo10586a(obj);
            if (a != null) {
                rVar.mo10593b(a, true);
            }
            return a != null;
        }

        public int size() {
            return C4375r.this.f10417g;
        }
    }

    /* renamed from: q.b.e.v.r$d */
    public abstract class C4381d<T> implements Iterator<T> {

        /* renamed from: e */
        public C4382e<K, V> f10424e;

        /* renamed from: f */
        public C4382e<K, V> f10425f = null;

        /* renamed from: g */
        public int f10426g;

        public C4381d() {
            C4375r rVar = C4375r.this;
            this.f10424e = rVar.f10419i.f10431h;
            this.f10426g = rVar.f10418h;
        }

        /* renamed from: b */
        public final C4382e<K, V> mo10615b() {
            C4382e<K, V> eVar = this.f10424e;
            C4375r rVar = C4375r.this;
            if (eVar == rVar.f10419i) {
                throw new NoSuchElementException();
            } else if (rVar.f10418h == this.f10426g) {
                this.f10424e = eVar.f10431h;
                this.f10425f = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f10424e != C4375r.this.f10419i;
        }

        public final void remove() {
            C4382e<K, V> eVar = this.f10425f;
            if (eVar != null) {
                C4375r.this.mo10593b(eVar, true);
                this.f10425f = null;
                this.f10426g = C4375r.this.f10418h;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: q.b.e.v.r$e */
    public static final class C4382e<K, V> implements Entry<K, V> {

        /* renamed from: e */
        public C4382e<K, V> f10428e;

        /* renamed from: f */
        public C4382e<K, V> f10429f;

        /* renamed from: g */
        public C4382e<K, V> f10430g;

        /* renamed from: h */
        public C4382e<K, V> f10431h;

        /* renamed from: i */
        public C4382e<K, V> f10432i;

        /* renamed from: j */
        public final K f10433j;

        /* renamed from: k */
        public V f10434k;

        /* renamed from: l */
        public int f10435l;

        public C4382e() {
            this.f10433j = null;
            this.f10432i = this;
            this.f10431h = this;
        }

        public C4382e(C4382e<K, V> eVar, K k, C4382e<K, V> eVar2, C4382e<K, V> eVar3) {
            this.f10428e = eVar;
            this.f10433j = k;
            this.f10435l = 1;
            this.f10431h = eVar2;
            this.f10432i = eVar3;
            eVar3.f10431h = this;
            eVar2.f10432i = this;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            K k = this.f10433j;
            if (k == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k.equals(entry.getKey())) {
                return false;
            }
            V v = this.f10434k;
            Object value = entry.getValue();
            if (v == null) {
                if (value != null) {
                    return false;
                }
            } else if (!v.equals(value)) {
                return false;
            }
            return true;
        }

        public K getKey() {
            return this.f10433j;
        }

        public V getValue() {
            return this.f10434k;
        }

        public int hashCode() {
            K k = this.f10433j;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f10434k;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            V v2 = this.f10434k;
            this.f10434k = v;
            return v2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f10433j);
            sb.append("=");
            sb.append(this.f10434k);
            return sb.toString();
        }
    }

    static {
        Class<C4375r> cls = C4375r.class;
    }

    public C4375r() {
        Comparator<Comparable> comparator = f10414l;
        if (comparator == null) {
            comparator = f10414l;
        }
        this.f10415e = comparator;
    }

    /* renamed from: a */
    public C4382e<K, V> mo10586a(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return mo10587a((K) obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public C4382e<K, V> mo10587a(K k, boolean z) {
        int i;
        C4382e<K, V> eVar;
        Comparator<? super K> comparator = this.f10415e;
        C4382e<K, V> eVar2 = this.f10416f;
        if (eVar2 != null) {
            Comparable comparable = comparator == f10414l ? (Comparable) k : null;
            while (true) {
                K k2 = eVar2.f10433j;
                i = comparable != null ? comparable.compareTo(k2) : comparator.compare(k, k2);
                if (i == 0) {
                    return eVar2;
                }
                C4382e<K, V> eVar3 = i < 0 ? eVar2.f10429f : eVar2.f10430g;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        C4382e<K, V> eVar4 = this.f10419i;
        if (eVar2 != null) {
            eVar = new C4382e<>(eVar2, k, eVar4, eVar4.f10432i);
            if (i < 0) {
                eVar2.f10429f = eVar;
            } else {
                eVar2.f10430g = eVar;
            }
            mo10591a(eVar2, true);
        } else if (comparator != f10414l || (k instanceof Comparable)) {
            eVar = new C4382e<>(eVar2, k, eVar4, eVar4.f10432i);
            this.f10416f = eVar;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(k.getClass().getName());
            sb.append(" is not Comparable");
            throw new ClassCastException(sb.toString());
        }
        this.f10417g++;
        this.f10418h++;
        return eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if ((r3 == r5 || (r3 != null && r3.equals(r5))) != false) goto L_0x0024;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p213q.p217b.p355e.p357v.C4375r.C4382e<K, V> mo10588a(java.util.Map.Entry<?, ?> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            q.b.e.v.r$e r0 = r4.mo10586a(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0023
            V r3 = r0.f10434k
            java.lang.Object r5 = r5.getValue()
            if (r3 == r5) goto L_0x001f
            if (r3 == 0) goto L_0x001d
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r5 = r2
            goto L_0x0020
        L_0x001f:
            r5 = r1
        L_0x0020:
            if (r5 == 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r1 = r2
        L_0x0024:
            if (r1 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p355e.p357v.C4375r.mo10588a(java.util.Map$Entry):q.b.e.v.r$e");
    }

    /* renamed from: a */
    public final void mo10589a(C4382e<K, V> eVar) {
        C4382e<K, V> eVar2 = eVar.f10429f;
        C4382e<K, V> eVar3 = eVar.f10430g;
        C4382e<K, V> eVar4 = eVar3.f10429f;
        C4382e<K, V> eVar5 = eVar3.f10430g;
        eVar.f10430g = eVar4;
        if (eVar4 != null) {
            eVar4.f10428e = eVar;
        }
        mo10590a(eVar, eVar3);
        eVar3.f10429f = eVar;
        eVar.f10428e = eVar3;
        int i = 0;
        int max = Math.max(eVar2 != null ? eVar2.f10435l : 0, eVar4 != null ? eVar4.f10435l : 0) + 1;
        eVar.f10435l = max;
        if (eVar5 != null) {
            i = eVar5.f10435l;
        }
        eVar3.f10435l = Math.max(max, i) + 1;
    }

    /* renamed from: a */
    public final void mo10590a(C4382e<K, V> eVar, C4382e<K, V> eVar2) {
        C4382e<K, V> eVar3 = eVar.f10428e;
        eVar.f10428e = null;
        if (eVar2 != null) {
            eVar2.f10428e = eVar3;
        }
        if (eVar3 == null) {
            this.f10416f = eVar2;
        } else if (eVar3.f10429f == eVar) {
            eVar3.f10429f = eVar2;
        } else {
            eVar3.f10430g = eVar2;
        }
    }

    /* renamed from: a */
    public final void mo10591a(C4382e<K, V> eVar, boolean z) {
        while (eVar != null) {
            C4382e<K, V> eVar2 = eVar.f10429f;
            C4382e<K, V> eVar3 = eVar.f10430g;
            int i = 0;
            int i2 = eVar2 != null ? eVar2.f10435l : 0;
            int i3 = eVar3 != null ? eVar3.f10435l : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                C4382e<K, V> eVar4 = eVar3.f10429f;
                C4382e<K, V> eVar5 = eVar3.f10430g;
                int i5 = eVar5 != null ? eVar5.f10435l : 0;
                if (eVar4 != null) {
                    i = eVar4.f10435l;
                }
                int i6 = i - i5;
                if (i6 != -1 && (i6 != 0 || z)) {
                    mo10592b(eVar3);
                }
                mo10589a(eVar);
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                C4382e<K, V> eVar6 = eVar2.f10429f;
                C4382e<K, V> eVar7 = eVar2.f10430g;
                int i7 = eVar7 != null ? eVar7.f10435l : 0;
                if (eVar6 != null) {
                    i = eVar6.f10435l;
                }
                int i8 = i - i7;
                if (i8 != 1 && (i8 != 0 || z)) {
                    mo10589a(eVar2);
                }
                mo10592b(eVar);
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                eVar.f10435l = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.f10435l = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.f10428e;
        }
    }

    /* renamed from: b */
    public final void mo10592b(C4382e<K, V> eVar) {
        C4382e<K, V> eVar2 = eVar.f10429f;
        C4382e<K, V> eVar3 = eVar.f10430g;
        C4382e<K, V> eVar4 = eVar2.f10429f;
        C4382e<K, V> eVar5 = eVar2.f10430g;
        eVar.f10429f = eVar5;
        if (eVar5 != null) {
            eVar5.f10428e = eVar;
        }
        mo10590a(eVar, eVar2);
        eVar2.f10430g = eVar;
        eVar.f10428e = eVar2;
        int i = 0;
        int max = Math.max(eVar3 != null ? eVar3.f10435l : 0, eVar5 != null ? eVar5.f10435l : 0) + 1;
        eVar.f10435l = max;
        if (eVar4 != null) {
            i = eVar4.f10435l;
        }
        eVar2.f10435l = Math.max(max, i) + 1;
    }

    /* renamed from: b */
    public void mo10593b(C4382e<K, V> eVar, boolean z) {
        C4382e<K, V> eVar2;
        int i;
        C4382e<K, V> eVar3;
        if (z) {
            C4382e<K, V> eVar4 = eVar.f10432i;
            eVar4.f10431h = eVar.f10431h;
            eVar.f10431h.f10432i = eVar4;
        }
        C4382e<K, V> eVar5 = eVar.f10429f;
        C4382e<K, V> eVar6 = eVar.f10430g;
        C4382e<K, V> eVar7 = eVar.f10428e;
        int i2 = 0;
        if (eVar5 == null || eVar6 == null) {
            if (eVar5 != null) {
                mo10590a(eVar, eVar5);
                eVar.f10429f = null;
            } else if (eVar6 != null) {
                mo10590a(eVar, eVar6);
                eVar.f10430g = null;
            } else {
                mo10590a(eVar, null);
            }
            mo10591a(eVar7, false);
            this.f10417g--;
            this.f10418h++;
            return;
        }
        if (eVar5.f10435l > eVar6.f10435l) {
            do {
                eVar2 = eVar5;
                eVar5 = eVar5.f10430g;
            } while (eVar5 != null);
        } else {
            do {
                C4382e<K, V> eVar8 = eVar6;
                eVar6 = eVar6.f10429f;
                eVar3 = eVar8;
            } while (eVar6 != null);
            eVar2 = eVar3;
        }
        mo10593b(eVar2, false);
        C4382e<K, V> eVar9 = eVar.f10429f;
        if (eVar9 != null) {
            i = eVar9.f10435l;
            eVar2.f10429f = eVar9;
            eVar9.f10428e = eVar2;
            eVar.f10429f = null;
        } else {
            i = 0;
        }
        C4382e<K, V> eVar10 = eVar.f10430g;
        if (eVar10 != null) {
            i2 = eVar10.f10435l;
            eVar2.f10430g = eVar10;
            eVar10.f10428e = eVar2;
            eVar.f10430g = null;
        }
        eVar2.f10435l = Math.max(i, i2) + 1;
        mo10590a(eVar, eVar2);
    }

    public void clear() {
        this.f10416f = null;
        this.f10417g = 0;
        this.f10418h++;
        C4382e<K, V> eVar = this.f10419i;
        eVar.f10432i = eVar;
        eVar.f10431h = eVar;
    }

    public boolean containsKey(Object obj) {
        return mo10586a(obj) != null;
    }

    public Set<Entry<K, V>> entrySet() {
        C4377b bVar = this.f10420j;
        if (bVar != null) {
            return bVar;
        }
        C4377b bVar2 = new C4377b<>();
        this.f10420j = bVar2;
        return bVar2;
    }

    public V get(Object obj) {
        C4382e a = mo10586a(obj);
        if (a != null) {
            return a.f10434k;
        }
        return null;
    }

    public Set<K> keySet() {
        C4379c cVar = this.f10421k;
        if (cVar != null) {
            return cVar;
        }
        C4379c cVar2 = new C4379c<>();
        this.f10421k = cVar2;
        return cVar2;
    }

    public V put(K k, V v) {
        if (k != null) {
            C4382e a = mo10587a(k, true);
            V v2 = a.f10434k;
            a.f10434k = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    public V remove(Object obj) {
        C4382e a = mo10586a(obj);
        if (a != null) {
            mo10593b(a, true);
        }
        if (a != null) {
            return a.f10434k;
        }
        return null;
    }

    public int size() {
        return this.f10417g;
    }
}
