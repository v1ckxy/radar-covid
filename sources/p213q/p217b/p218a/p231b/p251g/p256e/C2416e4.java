package p213q.p217b.p218a.p231b.p251g.p256e;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Map.Entry;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: q.b.a.b.g.e.e4 */
public final class C2416e4 extends C2526k3<Entry<K, V>> {

    /* renamed from: g */
    public final /* synthetic */ C2434f4 f6456g;

    public C2416e4(C2434f4 f4Var) {
        this.f6456g = f4Var;
    }

    /* renamed from: g */
    public final boolean mo7503g() {
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        C2286e.m5272b(i, this.f6456g.f6524i);
        Object[] objArr = this.f6456g.f6523h;
        int i2 = i * 2;
        return new SimpleImmutableEntry(objArr[i2], objArr[i2 + 1]);
    }

    public final int size() {
        return this.f6456g.f6524i;
    }
}
