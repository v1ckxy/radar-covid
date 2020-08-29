package p213q.p217b.p218a.p231b.p251g.p256e;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: q.b.a.b.g.e.m3 */
public final class C2560m3<E> extends C2526k3<E> {

    /* renamed from: g */
    public final transient C2526k3<E> f6715g;

    public C2560m3(C2526k3<E> k3Var) {
        this.f6715g = k3Var;
    }

    /* renamed from: a */
    public final int mo7865a(int i) {
        return (size() - 1) - i;
    }

    /* renamed from: a */
    public final C2526k3<E> subList(int i, int i2) {
        C2286e.m5226a(i, i2, size());
        return ((C2526k3) this.f6715g.subList(size() - i2, size() - i)).mo7822d();
    }

    public final boolean contains(@NullableDecl Object obj) {
        return this.f6715g.contains(obj);
    }

    /* renamed from: d */
    public final C2526k3<E> mo7822d() {
        return this.f6715g;
    }

    /* renamed from: g */
    public final boolean mo7503g() {
        return this.f6715g.mo7503g();
    }

    public final E get(int i) {
        C2286e.m5272b(i, size());
        return this.f6715g.get((size() - 1) - i);
    }

    public final int indexOf(@NullableDecl Object obj) {
        int lastIndexOf = this.f6715g.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return mo7865a(lastIndexOf);
        }
        return -1;
    }

    public final int lastIndexOf(@NullableDecl Object obj) {
        int indexOf = this.f6715g.indexOf(obj);
        if (indexOf >= 0) {
            return mo7865a(indexOf);
        }
        return -1;
    }

    public final int size() {
        return this.f6715g.size();
    }
}
