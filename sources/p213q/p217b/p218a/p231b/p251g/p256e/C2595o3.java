package p213q.p217b.p218a.p231b.p251g.p256e;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: q.b.a.b.g.e.o3 */
public abstract class C2595o3<K, V> implements Serializable, Map<K, V> {

    /* renamed from: e */
    public transient C2648r3<Entry<K, V>> f6759e;

    /* renamed from: f */
    public transient C2648r3<K> f6760f;

    /* renamed from: g */
    public transient C2543l3<V> f6761g;

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(@NullableDecl Object obj) {
        return ((C2543l3) values()).contains(obj);
    }

    public /* synthetic */ Set entrySet() {
        C2648r3<Entry<K, V>> r3Var = this.f6759e;
        if (r3Var != null) {
            return r3Var;
        }
        C2382c4 c4Var = (C2382c4) this;
        C2434f4 f4Var = new C2434f4(c4Var, c4Var.f6360i, c4Var.f6361j);
        this.f6759e = f4Var;
        return f4Var;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    public abstract V get(@NullableDecl Object obj);

    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    public int hashCode() {
        return C2286e.m5159a((Set<?>) (C2648r3) entrySet());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public /* synthetic */ Set keySet() {
        C2648r3<K> r3Var = this.f6760f;
        if (r3Var != null) {
            return r3Var;
        }
        C2382c4 c4Var = (C2382c4) this;
        C2471h4 h4Var = new C2471h4(c4Var, new C2451g4(c4Var.f6360i, 0, c4Var.f6361j));
        this.f6760f = h4Var;
        return h4Var;
    }

    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        int size = size();
        if (size >= 0) {
            StringBuilder sb = new StringBuilder((int) Math.min(((long) size) << 3, 1073741824));
            sb.append('{');
            boolean z = true;
            for (Entry entry : entrySet()) {
                if (!z) {
                    sb.append(Objects.ARRAY_ELEMENT_SEPARATOR);
                }
                z = false;
                sb.append(entry.getKey());
                sb.append('=');
                sb.append(entry.getValue());
            }
            sb.append('}');
            return sb.toString();
        }
        String str = "size";
        StringBuilder sb2 = new StringBuilder(str.length() + 40);
        sb2.append(str);
        sb2.append(" cannot be negative but was: ");
        sb2.append(size);
        throw new IllegalArgumentException(sb2.toString());
    }

    public /* synthetic */ Collection values() {
        C2543l3<V> l3Var = this.f6761g;
        if (l3Var != null) {
            return l3Var;
        }
        C2382c4 c4Var = (C2382c4) this;
        C2451g4 g4Var = new C2451g4(c4Var.f6360i, 1, c4Var.f6361j);
        this.f6761g = g4Var;
        return g4Var;
    }
}
