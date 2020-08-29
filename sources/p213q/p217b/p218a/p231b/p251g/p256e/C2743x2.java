package p213q.p217b.p218a.p231b.p251g.p256e;

import java.util.Map.Entry;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: q.b.a.b.g.e.x2 */
public abstract class C2743x2<K, V> implements Entry<K, V> {
    public boolean equals(@NullableDecl Object obj) {
        if (obj instanceof Entry) {
            Entry entry = (Entry) obj;
            if (C2286e.m5238a((Object) ((C2433f3) this).f6519e, entry.getKey()) && C2286e.m5238a(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    public abstract V getValue();

    public int hashCode() {
        K k = ((C2433f3) this).f6519e;
        Object value = getValue();
        int i = 0;
        int hashCode = k == null ? 0 : k.hashCode();
        if (value != null) {
            i = value.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        String valueOf = String.valueOf(((C2433f3) this).f6519e);
        String valueOf2 = String.valueOf(getValue());
        return C1965a.m4745a(valueOf2.length() + valueOf.length() + 1, valueOf, "=", valueOf2);
    }
}
