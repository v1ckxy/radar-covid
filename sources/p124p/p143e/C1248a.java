package p124p.p143e;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p124p.p143e.C1255g.C1257b;
import p124p.p143e.C1255g.C1258c;
import p124p.p143e.C1255g.C1260e;

/* renamed from: p.e.a */
public class C1248a<K, V> extends C1261h<K, V> implements Map<K, V> {

    /* renamed from: l */
    public C1255g<K, V> f3540l;

    /* renamed from: p.e.a$a */
    public class C1249a extends C1255g<K, V> {
        public C1249a() {
        }

        /* renamed from: a */
        public int mo5481a(Object obj) {
            return C1248a.this.mo5587a(obj);
        }

        /* renamed from: a */
        public Object mo5482a(int i, int i2) {
            return C1248a.this.f3588f[(i << 1) + i2];
        }

        /* renamed from: a */
        public V mo5483a(int i, V v) {
            int i2 = (i << 1) + 1;
            V[] vArr = C1248a.this.f3588f;
            V v2 = vArr[i2];
            vArr[i2] = v;
            return v2;
        }

        /* renamed from: a */
        public void mo5484a() {
            C1248a.this.clear();
        }

        /* renamed from: a */
        public void mo5485a(int i) {
            C1248a.this.mo5597d(i);
        }

        /* renamed from: a */
        public void mo5486a(K k, V v) {
            C1248a.this.put(k, v);
        }

        /* renamed from: b */
        public int mo5487b(Object obj) {
            return C1248a.this.mo5591b(obj);
        }

        /* renamed from: b */
        public Map<K, V> mo5488b() {
            return C1248a.this;
        }

        /* renamed from: c */
        public int mo5489c() {
            return C1248a.this.f3589g;
        }
    }

    public C1248a() {
    }

    public C1248a(int i) {
        super(i);
    }

    public C1248a(C1261h hVar) {
        if (hVar != null) {
            int i = hVar.f3589g;
            mo5592b(this.f3589g + i);
            if (this.f3589g != 0) {
                for (int i2 = 0; i2 < i; i2++) {
                    put(hVar.mo5593c(i2), hVar.mo5598e(i2));
                }
            } else if (i > 0) {
                System.arraycopy(hVar.f3587e, 0, this.f3587e, 0, i);
                System.arraycopy(hVar.f3588f, 0, this.f3588f, 0, i << 1);
                this.f3589g = i;
            }
        }
    }

    /* renamed from: b */
    public final C1255g<K, V> mo5476b() {
        if (this.f3540l == null) {
            this.f3540l = new C1249a();
        }
        return this.f3540l;
    }

    public Set<Entry<K, V>> entrySet() {
        C1255g b = mo5476b();
        if (b.f3568a == null) {
            b.f3568a = new C1257b<>();
        }
        return b.f3568a;
    }

    public Set<K> keySet() {
        C1255g b = mo5476b();
        if (b.f3569b == null) {
            b.f3569b = new C1258c<>();
        }
        return b.f3569b;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo5592b(map.size() + this.f3589g);
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public Collection<V> values() {
        C1255g b = mo5476b();
        if (b.f3570c == null) {
            b.f3570c = new C1260e<>();
        }
        return b.f3570c;
    }
}
