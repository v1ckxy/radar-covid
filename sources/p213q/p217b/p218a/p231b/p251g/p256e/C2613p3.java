package p213q.p217b.p218a.p231b.p251g.p256e;

import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: q.b.a.b.g.e.p3 */
public final class C2613p3 extends C2526k3<E> {

    /* renamed from: g */
    public final transient int f6796g;

    /* renamed from: h */
    public final transient int f6797h;

    /* renamed from: i */
    public final /* synthetic */ C2526k3 f6798i;

    public C2613p3(C2526k3 k3Var, int i, int i2) {
        this.f6798i = k3Var;
        this.f6796g = i;
        this.f6797h = i2;
    }

    /* renamed from: a */
    public final C2526k3<E> subList(int i, int i2) {
        C2286e.m5226a(i, i2, this.f6797h);
        C2526k3 k3Var = this.f6798i;
        int i3 = this.f6796g;
        return (C2526k3) k3Var.subList(i + i3, i2 + i3);
    }

    /* renamed from: c */
    public final int mo7500c() {
        return this.f6798i.mo7500c() + this.f6796g;
    }

    /* renamed from: e */
    public final Object[] mo7501e() {
        return this.f6798i.mo7501e();
    }

    /* renamed from: f */
    public final int mo7502f() {
        return this.f6798i.mo7500c() + this.f6796g + this.f6797h;
    }

    /* renamed from: g */
    public final boolean mo7503g() {
        return true;
    }

    public final E get(int i) {
        C2286e.m5272b(i, this.f6797h);
        return this.f6798i.get(i + this.f6796g);
    }

    public final int size() {
        return this.f6797h;
    }
}
