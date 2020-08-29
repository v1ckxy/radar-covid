package p392u.p393n;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p392u.p401r.p403c.C4635e;
import p392u.p401r.p403c.C4638h;
import p392u.p401r.p403c.p404p.C4646a;

/* renamed from: u.n.k */
public final class C4572k implements Set, Serializable, C4646a {

    /* renamed from: e */
    public static final C4572k f10781e = new C4572k();

    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Void) || ((Void) obj) != null) {
            return false;
        }
        C4638h.m10271a("element");
        throw null;
    }

    public boolean containsAll(Collection collection) {
        if (collection != null) {
            return collection.isEmpty();
        }
        C4638h.m10271a("elements");
        throw null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return C4569h.f10778e;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return 0;
    }

    public Object[] toArray() {
        return C4635e.m10264a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        return C4635e.m10265a(this, tArr);
    }

    public String toString() {
        return "[]";
    }
}
