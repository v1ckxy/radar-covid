package p124p.p137c.p138a.p140b;

import java.util.HashMap;
import p124p.p137c.p138a.p140b.C1235b.C1238c;

/* renamed from: p.c.a.b.a */
public class C1234a<K, V> extends C1235b<K, V> {

    /* renamed from: i */
    public HashMap<K, C1238c<K, V>> f3514i = new HashMap<>();

    /* renamed from: a */
    public C1238c<K, V> mo5410a(K k) {
        return (C1238c) this.f3514i.get(k);
    }

    /* renamed from: b */
    public V mo5411b(K k, V v) {
        C1238c cVar = (C1238c) this.f3514i.get(k);
        if (cVar != null) {
            return cVar.f3520f;
        }
        this.f3514i.put(k, mo5414a(k, v));
        return null;
    }

    public boolean contains(K k) {
        return this.f3514i.containsKey(k);
    }

    public V remove(K k) {
        V remove = super.remove(k);
        this.f3514i.remove(k);
        return remove;
    }
}
