package p213q.p217b.p218a.p231b.p251g.p256e;

import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.a.b.g.e.k4 */
public final class C2527k4<E> extends C2648r3<E> {

    /* renamed from: g */
    public final transient E f6682g;

    /* renamed from: h */
    public transient int f6683h;

    public C2527k4(E e) {
        if (e != null) {
            this.f6682g = e;
            return;
        }
        throw null;
    }

    public C2527k4(E e, int i) {
        this.f6682g = e;
        this.f6683h = i;
    }

    /* renamed from: a */
    public final int mo7499a(Object[] objArr, int i) {
        objArr[i] = this.f6682g;
        return i + 1;
    }

    /* renamed from: a */
    public final boolean mo7790a() {
        return this.f6683h != 0;
    }

    /* renamed from: b */
    public final C2579n4<E> iterator() {
        return new C2760y3(this.f6682g);
    }

    public final boolean contains(Object obj) {
        return this.f6682g.equals(obj);
    }

    /* renamed from: d */
    public final C2526k3<E> mo7636d() {
        return C2526k3.m6072a(this.f6682g);
    }

    /* renamed from: g */
    public final boolean mo7503g() {
        return false;
    }

    public final int hashCode() {
        int i = this.f6683h;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f6682g.hashCode();
        this.f6683h = hashCode;
        return hashCode;
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        String obj = this.f6682g.toString();
        StringBuilder sb = new StringBuilder(C1965a.m4743a(obj, 2));
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
}
