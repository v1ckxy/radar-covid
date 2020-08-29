package p213q.p217b.p218a.p231b.p251g.p256e;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: q.b.a.b.g.e.g3 */
public final class C2450g3 extends AbstractSet<K> {

    /* renamed from: e */
    public final /* synthetic */ C2343a3 f6541e;

    public C2450g3(C2343a3 a3Var) {
        this.f6541e = a3Var;
    }

    public final void clear() {
        this.f6541e.clear();
    }

    public final boolean contains(Object obj) {
        return this.f6541e.containsKey(obj);
    }

    public final Iterator<K> iterator() {
        C2343a3 a3Var = this.f6541e;
        Map b = a3Var.mo7372b();
        return b != null ? b.keySet().iterator() : new C2775z2(a3Var);
    }

    public final boolean remove(@NullableDecl Object obj) {
        Map b = this.f6541e.mo7372b();
        if (b != null) {
            return b.keySet().remove(obj);
        }
        return this.f6541e.mo7371b(obj) != C2343a3.f6303n;
    }

    public final int size() {
        return this.f6541e.size();
    }
}
