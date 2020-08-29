package p392u.p393n;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.p401r.p403c.C4630a;
import p392u.p401r.p403c.C4635e;
import p392u.p401r.p403c.C4638h;
import p392u.p401r.p403c.p404p.C4646a;

/* renamed from: u.n.a */
public final class C4562a<T> implements Collection<T>, C4646a {

    /* renamed from: e */
    public final T[] f10775e;

    /* renamed from: f */
    public final boolean f10776f;

    public C4562a(T[] tArr, boolean z) {
        if (tArr != null) {
            this.f10775e = tArr;
            this.f10776f = z;
            return;
        }
        C4638h.m10271a("values");
        throw null;
    }

    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        T[] tArr = this.f10775e;
        if (tArr != null) {
            return C2286e.m5170a(tArr, obj) >= 0;
        }
        C4638h.m10271a("$this$contains");
        throw null;
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        if (collection == null) {
            C4638h.m10271a("elements");
            throw null;
        } else if (collection.isEmpty()) {
            return true;
        } else {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }
    }

    public boolean isEmpty() {
        return this.f10775e.length == 0;
    }

    public Iterator<T> iterator() {
        T[] tArr = this.f10775e;
        if (tArr != null) {
            return new C4630a(tArr);
        }
        C4638h.m10271a("array");
        throw null;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.f10775e.length;
    }

    public final Object[] toArray() {
        T[] tArr = this.f10775e;
        boolean z = this.f10776f;
        Class<Object[]> cls = Object[].class;
        if (tArr == null) {
            C4638h.m10271a("$this$copyToArrayOfAny");
            throw null;
        } else if (z && C4638h.m10272a((Object) tArr.getClass(), (Object) cls)) {
            return tArr;
        } else {
            Object[] copyOf = Arrays.copyOf(tArr, tArr.length, cls);
            C4638h.m10270a((Object) copyOf, "java.util.Arrays.copyOf(… Array<Any?>::class.java)");
            return copyOf;
        }
    }

    public <T> T[] toArray(T[] tArr) {
        return C4635e.m10265a(this, tArr);
    }
}
