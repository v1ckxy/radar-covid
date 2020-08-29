package p213q.p217b.p218a.p231b.p251g.p256e;

import java.util.Map.Entry;

/* renamed from: q.b.a.b.g.e.f4 */
public final class C2434f4<K, V> extends C2648r3<Entry<K, V>> {

    /* renamed from: g */
    public final transient C2595o3<K, V> f6522g;

    /* renamed from: h */
    public final transient Object[] f6523h;

    /* renamed from: i */
    public final transient int f6524i;

    public C2434f4(C2595o3 o3Var, Object[] objArr, int i) {
        this.f6522g = o3Var;
        this.f6523h = objArr;
        this.f6524i = i;
    }

    /* renamed from: a */
    public final int mo7499a(Object[] objArr, int i) {
        return mo7702h().mo7499a(objArr, i);
    }

    /* renamed from: b */
    public final C2579n4<Entry<K, V>> iterator() {
        return (C2579n4) mo7702h().iterator();
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Entry) {
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f6522g.get(key))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final C2526k3<Entry<K, V>> mo7636d() {
        return new C2416e4(this);
    }

    /* renamed from: g */
    public final boolean mo7503g() {
        return true;
    }

    public final int size() {
        return this.f6524i;
    }
}
