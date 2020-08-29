package p213q.p217b.p218a.p231b.p251g.p256e;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: q.b.a.b.g.e.i3 */
public final class C2487i3 extends AbstractCollection<V> {

    /* renamed from: e */
    public final /* synthetic */ C2343a3 f6614e;

    public C2487i3(C2343a3 a3Var) {
        this.f6614e = a3Var;
    }

    public final void clear() {
        this.f6614e.clear();
    }

    public final Iterator<V> iterator() {
        C2343a3 a3Var = this.f6614e;
        Map b = a3Var.mo7372b();
        return b != null ? b.values().iterator() : new C2360b3(a3Var);
    }

    public final int size() {
        return this.f6614e.size();
    }
}
