package p213q.p217b.p218a.p231b.p251g.p256e;

import java.util.Map.Entry;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.a.b.g.e.o8 */
public final class C2600o8 implements Comparable<C2600o8>, Entry<K, V> {

    /* renamed from: e */
    public final K f6764e;

    /* renamed from: f */
    public V f6765f;

    /* renamed from: g */
    public final /* synthetic */ C2475h8 f6766g;

    public C2600o8(C2475h8 h8Var, K k, V v) {
        this.f6766g = h8Var;
        this.f6764e = k;
        this.f6765f = v;
    }

    public C2600o8(C2475h8 h8Var, Entry<K, V> entry) {
        K k = (Comparable) entry.getKey();
        V value = entry.getValue();
        this.f6766g = h8Var;
        this.f6764e = k;
        this.f6765f = value;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return this.f6764e.compareTo(((C2600o8) obj).f6764e);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        K k = this.f6764e;
        Object key = entry.getKey();
        boolean z = k == null ? key == null : k.equals(key);
        if (z) {
            V v = this.f6765f;
            Object value = entry.getValue();
            boolean z2 = v == null ? value == null : v.equals(value);
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ Object getKey() {
        return this.f6764e;
    }

    public final V getValue() {
        return this.f6765f;
    }

    public final int hashCode() {
        K k = this.f6764e;
        int i = 0;
        int hashCode = k == null ? 0 : k.hashCode();
        V v = this.f6765f;
        if (v != null) {
            i = v.hashCode();
        }
        return hashCode ^ i;
    }

    public final V setValue(V v) {
        this.f6766g.mo7715d();
        V v2 = this.f6765f;
        this.f6765f = v;
        return v2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f6764e);
        String valueOf2 = String.valueOf(this.f6765f);
        return C1965a.m4745a(valueOf2.length() + valueOf.length() + 1, valueOf, "=", valueOf2);
    }
}
