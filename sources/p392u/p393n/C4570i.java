package p392u.p393n;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4635e;
import p392u.p401r.p403c.C4638h;
import p392u.p401r.p403c.p404p.C4646a;

/* renamed from: u.n.i */
public final class C4570i implements List, Serializable, RandomAccess, C4646a {

    /* renamed from: e */
    public static final C4570i f10779e = new C4570i();

    public /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection collection) {
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
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    public Object get(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty list doesn't contain element at index ");
        sb.append(i);
        sb.append('.');
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public int hashCode() {
        return 1;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Void) || ((Void) obj) != null) {
            return -1;
        }
        C4638h.m10271a("element");
        throw null;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return C4569h.f10778e;
    }

    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Void) || ((Void) obj) != null) {
            return -1;
        }
        C4638h.m10271a("element");
        throw null;
    }

    public ListIterator listIterator() {
        return C4569h.f10778e;
    }

    public ListIterator listIterator(int i) {
        if (i == 0) {
            return C4569h.f10778e;
        }
        throw new IndexOutOfBoundsException(C1965a.m4761b("Index: ", i));
    }

    public /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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

    public /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return 0;
    }

    public List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("fromIndex: ");
        sb.append(i);
        sb.append(", toIndex: ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
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
