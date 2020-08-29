package p213q.p217b.p218a.p231b.p251g.p256e;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: q.b.a.b.g.e.i4 */
public final class C2488i4<E> extends C2729w3<E> {

    /* renamed from: j */
    public static final C2488i4<Comparable> f6615j = new C2488i4<>(C2526k3.m6071a(), C2776z3.f7006e);

    /* renamed from: i */
    public final transient C2526k3<E> f6616i;

    public C2488i4(C2526k3<E> k3Var, Comparator<? super E> comparator) {
        super(comparator);
        this.f6616i = k3Var;
    }

    /* renamed from: a */
    public final int mo7740a(E e, boolean z) {
        C2526k3<E> k3Var = this.f6616i;
        if (e != null) {
            int binarySearch = Collections.binarySearch(k3Var, e, this.f6939g);
            if (binarySearch < 0) {
                return ~binarySearch;
            }
            if (z) {
                binarySearch++;
            }
            return binarySearch;
        }
        throw null;
    }

    /* renamed from: a */
    public final int mo7741a(Object[] objArr, int i) {
        return this.f6616i.mo7499a(objArr, i);
    }

    /* renamed from: a */
    public final C2488i4<E> mo7742a(int i, int i2) {
        return (i == 0 && i2 == size()) ? this : i < i2 ? new C2488i4<>((C2526k3) this.f6616i.subList(i, i2), this.f6939g) : C2729w3.m6510a(this.f6939g);
    }

    /* renamed from: b */
    public final int mo7743b(E e, boolean z) {
        C2526k3<E> k3Var = this.f6616i;
        if (e != null) {
            int binarySearch = Collections.binarySearch(k3Var, e, this.f6939g);
            if (binarySearch >= 0) {
                return z ? binarySearch : binarySearch + 1;
            }
            return ~binarySearch;
        }
        throw null;
    }

    /* renamed from: b */
    public final C2579n4<E> iterator() {
        return (C2579n4) this.f6616i.iterator();
    }

    /* renamed from: c */
    public final int mo7745c() {
        return this.f6616i.mo7500c();
    }

    public final E ceiling(E e) {
        int b = mo7743b(e, true);
        if (b == size()) {
            return null;
        }
        return this.f6616i.get(b);
    }

    public final boolean contains(@NullableDecl Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f6616i, obj, this.f6939g) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.util.AbstractCollection, q.b.a.b.g.e.w3, q.b.a.b.g.e.i4] */
    public final boolean containsAll(Collection<?> collection) {
        if (collection instanceof C2344a4) {
            collection = ((C2344a4) collection).mo7386a();
        }
        if (!C2286e.m5264a(this.f6939g, (Iterable<?>) collection) || collection.size() <= 1) {
            return C2488i4.super.containsAll(collection);
        }
        C2579n4 b = iterator();
        Iterator it = collection.iterator();
        if (!b.hasNext()) {
            return false;
        }
        Object next = it.next();
        Object next2 = b.next();
        while (true) {
            try {
                int compare = this.f6939g.compare(next2, next);
                if (compare < 0) {
                    if (!b.hasNext()) {
                        return false;
                    }
                    next2 = b.next();
                } else if (compare == 0) {
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                } else if (compare > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final /* synthetic */ Iterator descendingIterator() {
        return this.f6616i.mo7822d().iterator();
    }

    /* renamed from: e */
    public final Object[] mo7750e() {
        return this.f6616i.mo7501e();
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.util.AbstractCollection, q.b.a.b.g.e.w3, q.b.a.b.g.e.i4] */
    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!C2286e.m5264a(this.f6939g, (Iterable<?>) set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            C2579n4 b = iterator();
            while (b.hasNext()) {
                Object next = b.next();
                Object next2 = it.next();
                if (next2 != null) {
                    if (this.f6939g.compare(next, next2) != 0) {
                    }
                }
                return false;
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    /* renamed from: f */
    public final int mo7752f() {
        return this.f6616i.mo7502f();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.AbstractCollection, q.b.a.b.g.e.i4] */
    public final E first() {
        if (!isEmpty()) {
            return this.f6616i.get(0);
        }
        throw new NoSuchElementException();
    }

    public final E floor(E e) {
        int a = mo7740a(e, true) - 1;
        if (a == -1) {
            return null;
        }
        return this.f6616i.get(a);
    }

    /* renamed from: g */
    public final boolean mo7755g() {
        return this.f6616i.mo7503g();
    }

    /* renamed from: h */
    public final C2526k3<E> mo7756h() {
        return this.f6616i;
    }

    public final E higher(E e) {
        int b = mo7743b(e, false);
        if (b == size()) {
            return null;
        }
        return this.f6616i.get(b);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.AbstractCollection, q.b.a.b.g.e.i4] */
    public final E last() {
        if (!isEmpty()) {
            return this.f6616i.get(size() - 1);
        }
        throw new NoSuchElementException();
    }

    public final E lower(E e) {
        int a = mo7740a(e, false) - 1;
        if (a == -1) {
            return null;
        }
        return this.f6616i.get(a);
    }

    public final int size() {
        return this.f6616i.size();
    }
}
