package p213q.p217b.p218a.p231b.p251g.p256e;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: q.b.a.b.g.e.h4 */
public final class C2471h4<K> extends C2648r3<K> {

    /* renamed from: g */
    public final transient C2595o3<K, ?> f6571g;

    /* renamed from: h */
    public final transient C2526k3<K> f6572h;

    public C2471h4(C2595o3<K, ?> o3Var, C2526k3<K> k3Var) {
        this.f6571g = o3Var;
        this.f6572h = k3Var;
    }

    /* renamed from: a */
    public final int mo7499a(Object[] objArr, int i) {
        return this.f6572h.mo7499a(objArr, i);
    }

    /* renamed from: b */
    public final C2579n4<K> iterator() {
        return (C2579n4) this.f6572h.iterator();
    }

    public final boolean contains(@NullableDecl Object obj) {
        return this.f6571g.get(obj) != null;
    }

    /* renamed from: g */
    public final boolean mo7503g() {
        return true;
    }

    /* renamed from: h */
    public final C2526k3<K> mo7702h() {
        return this.f6572h;
    }

    public final int size() {
        return this.f6571g.size();
    }
}
