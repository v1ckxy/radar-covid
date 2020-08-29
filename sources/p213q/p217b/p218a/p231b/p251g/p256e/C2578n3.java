package p213q.p217b.p218a.p231b.p251g.p256e;

import java.util.NoSuchElementException;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: q.b.a.b.g.e.n3 */
public final class C2578n3<E> extends C2578n3<E> {

    /* renamed from: e */
    public final int f6741e;

    /* renamed from: f */
    public int f6742f;

    /* renamed from: g */
    public final C2526k3<E> f6743g;

    public C2578n3(C2526k3<E> k3Var, int i) {
        int size = k3Var.size();
        C2286e.m5319d(i, size);
        this.f6741e = size;
        this.f6742f = i;
        this.f6743g = k3Var;
    }

    public final boolean hasNext() {
        return this.f6742f < this.f6741e;
    }

    public final boolean hasPrevious() {
        return this.f6742f > 0;
    }

    public final Object next() {
        if (this.f6742f < this.f6741e) {
            int i = this.f6742f;
            this.f6742f = i + 1;
            return this.f6743g.get(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f6742f;
    }

    public final Object previous() {
        if (this.f6742f > 0) {
            int i = this.f6742f - 1;
            this.f6742f = i;
            return this.f6743g.get(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f6742f - 1;
    }
}
