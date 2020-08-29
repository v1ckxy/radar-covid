package p124p.p137c.p138a.p140b;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: p.c.a.b.b */
public class C1235b<K, V> implements Iterable<Entry<K, V>> {

    /* renamed from: e */
    public C1238c<K, V> f3515e;

    /* renamed from: f */
    public C1238c<K, V> f3516f;

    /* renamed from: g */
    public WeakHashMap<C1241f<K, V>, Boolean> f3517g = new WeakHashMap<>();

    /* renamed from: h */
    public int f3518h = 0;

    /* renamed from: p.c.a.b.b$a */
    public static class C1236a<K, V> extends C1240e<K, V> {
        public C1236a(C1238c<K, V> cVar, C1238c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* renamed from: b */
        public C1238c<K, V> mo5420b(C1238c<K, V> cVar) {
            return cVar.f3522h;
        }

        /* renamed from: c */
        public C1238c<K, V> mo5421c(C1238c<K, V> cVar) {
            return cVar.f3521g;
        }
    }

    /* renamed from: p.c.a.b.b$b */
    public static class C1237b<K, V> extends C1240e<K, V> {
        public C1237b(C1238c<K, V> cVar, C1238c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* renamed from: b */
        public C1238c<K, V> mo5420b(C1238c<K, V> cVar) {
            return cVar.f3521g;
        }

        /* renamed from: c */
        public C1238c<K, V> mo5421c(C1238c<K, V> cVar) {
            return cVar.f3522h;
        }
    }

    /* renamed from: p.c.a.b.b$c */
    public static class C1238c<K, V> implements Entry<K, V> {

        /* renamed from: e */
        public final K f3519e;

        /* renamed from: f */
        public final V f3520f;

        /* renamed from: g */
        public C1238c<K, V> f3521g;

        /* renamed from: h */
        public C1238c<K, V> f3522h;

        public C1238c(K k, V v) {
            this.f3519e = k;
            this.f3520f = v;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C1238c)) {
                return false;
            }
            C1238c cVar = (C1238c) obj;
            if (!this.f3519e.equals(cVar.f3519e) || !this.f3520f.equals(cVar.f3520f)) {
                z = false;
            }
            return z;
        }

        public K getKey() {
            return this.f3519e;
        }

        public V getValue() {
            return this.f3520f;
        }

        public int hashCode() {
            return this.f3519e.hashCode() ^ this.f3520f.hashCode();
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f3519e);
            sb.append("=");
            sb.append(this.f3520f);
            return sb.toString();
        }
    }

    /* renamed from: p.c.a.b.b$d */
    public class C1239d implements Iterator<Entry<K, V>>, C1241f<K, V> {

        /* renamed from: e */
        public C1238c<K, V> f3523e;

        /* renamed from: f */
        public boolean f3524f = true;

        public C1239d() {
        }

        /* renamed from: a */
        public void mo5428a(C1238c<K, V> cVar) {
            C1238c<K, V> cVar2 = this.f3523e;
            if (cVar == cVar2) {
                C1238c<K, V> cVar3 = cVar2.f3522h;
                this.f3523e = cVar3;
                this.f3524f = cVar3 == null;
            }
        }

        public boolean hasNext() {
            boolean z = true;
            if (this.f3524f) {
                if (C1235b.this.f3515e == null) {
                    z = false;
                }
                return z;
            }
            C1238c<K, V> cVar = this.f3523e;
            if (cVar == null || cVar.f3521g == null) {
                z = false;
            }
            return z;
        }

        public Object next() {
            C1238c<K, V> cVar;
            if (this.f3524f) {
                this.f3524f = false;
                cVar = C1235b.this.f3515e;
            } else {
                C1238c<K, V> cVar2 = this.f3523e;
                cVar = cVar2 != null ? cVar2.f3521g : null;
            }
            this.f3523e = cVar;
            return cVar;
        }
    }

    /* renamed from: p.c.a.b.b$e */
    public static abstract class C1240e<K, V> implements Iterator<Entry<K, V>>, C1241f<K, V> {

        /* renamed from: e */
        public C1238c<K, V> f3526e;

        /* renamed from: f */
        public C1238c<K, V> f3527f;

        public C1240e(C1238c<K, V> cVar, C1238c<K, V> cVar2) {
            this.f3526e = cVar2;
            this.f3527f = cVar;
        }

        /* renamed from: a */
        public void mo5428a(C1238c<K, V> cVar) {
            C1238c<K, V> cVar2 = null;
            if (this.f3526e == cVar && cVar == this.f3527f) {
                this.f3527f = null;
                this.f3526e = null;
            }
            C1238c<K, V> cVar3 = this.f3526e;
            if (cVar3 == cVar) {
                this.f3526e = mo5420b(cVar3);
            }
            C1238c<K, V> cVar4 = this.f3527f;
            if (cVar4 == cVar) {
                C1238c<K, V> cVar5 = this.f3526e;
                if (!(cVar4 == cVar5 || cVar5 == null)) {
                    cVar2 = mo5421c(cVar4);
                }
                this.f3527f = cVar2;
            }
        }

        /* renamed from: b */
        public abstract C1238c<K, V> mo5420b(C1238c<K, V> cVar);

        /* renamed from: c */
        public abstract C1238c<K, V> mo5421c(C1238c<K, V> cVar);

        public boolean hasNext() {
            return this.f3527f != null;
        }

        public Object next() {
            C1238c<K, V> cVar = this.f3527f;
            C1238c<K, V> cVar2 = this.f3526e;
            this.f3527f = (cVar == cVar2 || cVar2 == null) ? null : mo5421c(cVar);
            return cVar;
        }
    }

    /* renamed from: p.c.a.b.b$f */
    public interface C1241f<K, V> {
        /* renamed from: a */
        void mo5428a(C1238c<K, V> cVar);
    }

    /* renamed from: a */
    public C1238c<K, V> mo5410a(K k) {
        C1238c<K, V> cVar = this.f3515e;
        while (cVar != null && !cVar.f3519e.equals(k)) {
            cVar = cVar.f3521g;
        }
        return cVar;
    }

    /* renamed from: a */
    public C1238c<K, V> mo5414a(K k, V v) {
        C1238c<K, V> cVar = new C1238c<>(k, v);
        this.f3518h++;
        C1238c<K, V> cVar2 = this.f3516f;
        if (cVar2 == null) {
            this.f3515e = cVar;
        } else {
            cVar2.f3521g = cVar;
            cVar.f3522h = cVar2;
        }
        this.f3516f = cVar;
        return cVar;
    }

    /* renamed from: b */
    public V mo5411b(K k, V v) {
        C1238c a = mo5410a(k);
        if (a != null) {
            return a.f3520f;
        }
        mo5414a(k, v);
        return null;
    }

    /* renamed from: c */
    public C1239d mo5415c() {
        C1239d dVar = new C1239d<>();
        this.f3517g.put(dVar, Boolean.valueOf(false));
        return dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r3.hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (((p124p.p137c.p138a.p140b.C1235b.C1240e) r7).hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0054, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof p124p.p137c.p138a.p140b.C1235b
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            p.c.a.b.b r7 = (p124p.p137c.p138a.p140b.C1235b) r7
            int r1 = r6.f3518h
            int r3 = r7.f3518h
            if (r1 == r3) goto L_0x0013
            return r2
        L_0x0013:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L_0x001b:
            r3 = r1
            p.c.a.b.b$e r3 = (p124p.p137c.p138a.p140b.C1235b.C1240e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0044
            r4 = r7
            p.c.a.b.b$e r4 = (p124p.p137c.p138a.p140b.C1235b.C1240e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0044
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L_0x003b
            if (r4 != 0) goto L_0x0043
        L_0x003b:
            if (r3 == 0) goto L_0x001b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x001b
        L_0x0043:
            return r2
        L_0x0044:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L_0x0053
            p.c.a.b.b$e r7 = (p124p.p137c.p138a.p140b.C1235b.C1240e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = r2
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p137c.p138a.p140b.C1235b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            C1240e eVar = (C1240e) it;
            if (!eVar.hasNext()) {
                return i;
            }
            i += ((Entry) eVar.next()).hashCode();
        }
    }

    public Iterator<Entry<K, V>> iterator() {
        C1236a aVar = new C1236a(this.f3515e, this.f3516f);
        this.f3517g.put(aVar, Boolean.valueOf(false));
        return aVar;
    }

    public V remove(K k) {
        C1238c a = mo5410a(k);
        if (a == null) {
            return null;
        }
        this.f3518h--;
        if (!this.f3517g.isEmpty()) {
            for (C1241f a2 : this.f3517g.keySet()) {
                a2.mo5428a(a);
            }
        }
        C1238c<K, V> cVar = a.f3522h;
        if (cVar != null) {
            cVar.f3521g = a.f3521g;
        } else {
            this.f3515e = a.f3521g;
        }
        C1238c<K, V> cVar2 = a.f3521g;
        if (cVar2 != null) {
            cVar2.f3522h = a.f3522h;
        } else {
            this.f3516f = a.f3522h;
        }
        a.f3521g = null;
        a.f3522h = null;
        return a.f3520f;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("[");
        Iterator it = iterator();
        while (true) {
            C1240e eVar = (C1240e) it;
            if (eVar.hasNext()) {
                a.append(((Entry) eVar.next()).toString());
                if (eVar.hasNext()) {
                    a.append(Objects.ARRAY_ELEMENT_SEPARATOR);
                }
            } else {
                a.append("]");
                return a.toString();
            }
        }
    }
}
