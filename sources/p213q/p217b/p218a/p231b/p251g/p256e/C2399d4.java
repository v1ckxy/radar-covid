package p213q.p217b.p218a.p231b.p251g.p256e;

import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: q.b.a.b.g.e.d4 */
public final class C2399d4<E> extends C2526k3<E> {

    /* renamed from: i */
    public static final C2526k3<Object> f6437i = new C2399d4(new Object[0], 0);

    /* renamed from: g */
    public final transient Object[] f6438g;

    /* renamed from: h */
    public final transient int f6439h;

    public C2399d4(Object[] objArr, int i) {
        this.f6438g = objArr;
        this.f6439h = i;
    }

    /* renamed from: a */
    public final int mo7499a(Object[] objArr, int i) {
        System.arraycopy(this.f6438g, 0, objArr, i, this.f6439h);
        return i + this.f6439h;
    }

    /* renamed from: c */
    public final int mo7500c() {
        return 0;
    }

    /* renamed from: e */
    public final Object[] mo7501e() {
        return this.f6438g;
    }

    /* renamed from: f */
    public final int mo7502f() {
        return this.f6439h;
    }

    /* renamed from: g */
    public final boolean mo7503g() {
        return false;
    }

    public final E get(int i) {
        C2286e.m5272b(i, this.f6439h);
        return this.f6438g[i];
    }

    public final int size() {
        return this.f6439h;
    }
}
