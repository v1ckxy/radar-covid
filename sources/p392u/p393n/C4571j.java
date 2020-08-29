package p392u.p393n;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p116io.jsonwebtoken.lang.Objects;
import p392u.p401r.p403c.C4638h;
import p392u.p401r.p403c.p404p.C4646a;

/* renamed from: u.n.j */
public final class C4571j implements Map, Serializable, C4646a {

    /* renamed from: e */
    public static final C4571j f10780e = new C4571j();

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return false;
    }

    public final boolean containsValue(Object obj) {
        if (!(obj instanceof Void) || ((Void) obj) != null) {
            return false;
        }
        C4638h.m10271a("value");
        throw null;
    }

    public final Set<Entry> entrySet() {
        return C4572k.f10781e;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    public final Object get(Object obj) {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public final Set<Object> keySet() {
        return C4572k.f10781e;
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return 0;
    }

    public String toString() {
        return Objects.EMPTY_ARRAY;
    }

    public final Collection values() {
        return C4570i.f10779e;
    }
}
