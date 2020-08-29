package p213q.p217b.p301c.p302a.p311j0.p312a;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3603i;

/* renamed from: q.b.c.a.j0.a.c */
public abstract class C3605c<E> extends AbstractList<E> implements C3603i<E> {

    /* renamed from: e */
    public boolean f8977e = true;

    public boolean add(E e) {
        mo9533c();
        return super.add(e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo9533c();
        return super.addAll(i, collection);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo9533c();
        return super.addAll(collection);
    }

    /* renamed from: c */
    public void mo9533c() {
        if (!this.f8977e) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        mo9533c();
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

    /* renamed from: j */
    public final void mo9530j() {
        this.f8977e = false;
    }

    public boolean remove(Object obj) {
        mo9533c();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        mo9533c();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        mo9533c();
        return super.retainAll(collection);
    }

    /* renamed from: s */
    public boolean mo9531s() {
        return this.f8977e;
    }
}
