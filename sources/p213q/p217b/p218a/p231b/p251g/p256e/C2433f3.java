package p213q.p217b.p218a.p231b.p251g.p256e;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: q.b.a.b.g.e.f3 */
public final class C2433f3 extends C2743x2<K, V> {
    @NullableDecl

    /* renamed from: e */
    public final K f6519e;

    /* renamed from: f */
    public int f6520f;

    /* renamed from: g */
    public final /* synthetic */ C2343a3 f6521g;

    public C2433f3(C2343a3 a3Var, int i) {
        this.f6521g = a3Var;
        this.f6519e = a3Var.f6306g[i];
        this.f6520f = i;
    }

    /* renamed from: a */
    public final void mo7630a() {
        int i = this.f6520f;
        if (i == -1 || i >= this.f6521g.size() || !C2286e.m5238a((Object) this.f6519e, this.f6521g.f6306g[this.f6520f])) {
            this.f6520f = this.f6521g.mo7368a(this.f6519e);
        }
    }

    @NullableDecl
    public final K getKey() {
        return this.f6519e;
    }

    @NullableDecl
    public final V getValue() {
        Map b = this.f6521g.mo7372b();
        if (b != null) {
            return b.get(this.f6519e);
        }
        mo7630a();
        int i = this.f6520f;
        if (i == -1) {
            return null;
        }
        return this.f6521g.f6307h[i];
    }

    public final V setValue(V v) {
        Map b = this.f6521g.mo7372b();
        if (b != null) {
            return b.put(this.f6519e, v);
        }
        mo7630a();
        int i = this.f6520f;
        if (i == -1) {
            this.f6521g.put(this.f6519e, v);
            return null;
        }
        V[] vArr = this.f6521g.f6307h;
        V v2 = vArr[i];
        vArr[i] = v;
        return v2;
    }
}
