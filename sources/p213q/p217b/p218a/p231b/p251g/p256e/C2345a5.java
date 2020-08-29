package p213q.p217b.p218a.p231b.p251g.p256e;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: q.b.a.b.g.e.a5 */
public abstract class C2345a5<E> extends AbstractList<E> implements C2635q6<E> {

    /* renamed from: e */
    public boolean f6313e = true;

    /* renamed from: a */
    public boolean mo7387a() {
        return this.f6313e;
    }

    public boolean add(E e) {
        mo7392c();
        return super.add(e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo7392c();
        return super.addAll(i, collection);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo7392c();
        return super.addAll(collection);
    }

    /* renamed from: b */
    public final void mo7391b() {
        this.f6313e = false;
    }

    /* renamed from: c */
    public final void mo7392c() {
        if (!this.f6313e) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        mo7392c();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < size(); i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public boolean remove(Object obj) {
        mo7392c();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        mo7392c();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        mo7392c();
        return super.retainAll(collection);
    }
}
