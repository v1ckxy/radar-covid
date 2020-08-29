package p213q.p217b.p218a.p231b.p251g.p256e;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: q.b.a.b.g.e.j4 */
public final class C2510j4<E> extends C2648r3<E> {

    /* renamed from: l */
    public static final C2510j4<Object> f6640l;

    /* renamed from: g */
    public final transient Object[] f6641g;

    /* renamed from: h */
    public final transient Object[] f6642h;

    /* renamed from: i */
    public final transient int f6643i;

    /* renamed from: j */
    public final transient int f6644j;

    /* renamed from: k */
    public final transient int f6645k;

    static {
        C2510j4 j4Var = new C2510j4(new Object[0], 0, null, 0, 0);
        f6640l = j4Var;
    }

    public C2510j4(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f6641g = objArr;
        this.f6642h = objArr2;
        this.f6643i = i2;
        this.f6644j = i;
        this.f6645k = i3;
    }

    /* renamed from: a */
    public final int mo7499a(Object[] objArr, int i) {
        System.arraycopy(this.f6641g, 0, objArr, i, this.f6645k);
        return i + this.f6645k;
    }

    /* renamed from: a */
    public final boolean mo7790a() {
        return true;
    }

    /* renamed from: b */
    public final C2579n4<E> iterator() {
        return (C2579n4) mo7702h().iterator();
    }

    /* renamed from: c */
    public final int mo7500c() {
        return 0;
    }

    public final boolean contains(@NullableDecl Object obj) {
        Object[] objArr = this.f6642h;
        if (obj == null || objArr == null) {
            return false;
        }
        int i = C2286e.m5350i(obj);
        while (true) {
            int i2 = i & this.f6643i;
            Object obj2 = objArr[i2];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            i = i2 + 1;
        }
    }

    /* renamed from: d */
    public final C2526k3<E> mo7636d() {
        return C2526k3.m6074b(this.f6641g, this.f6645k);
    }

    /* renamed from: e */
    public final Object[] mo7501e() {
        return this.f6641g;
    }

    /* renamed from: f */
    public final int mo7502f() {
        return this.f6645k;
    }

    /* renamed from: g */
    public final boolean mo7503g() {
        return false;
    }

    public final int hashCode() {
        return this.f6644j;
    }

    public final int size() {
        return this.f6645k;
    }
}
