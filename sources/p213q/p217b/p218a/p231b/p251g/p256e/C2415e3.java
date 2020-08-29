package p213q.p217b.p218a.p231b.p251g.p256e;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: q.b.a.b.g.e.e3 */
public final class C2415e3 extends AbstractSet<Entry<K, V>> {

    /* renamed from: e */
    public final /* synthetic */ C2343a3 f6455e;

    public C2415e3(C2343a3 a3Var) {
        this.f6455e = a3Var;
    }

    public final void clear() {
        this.f6455e.clear();
    }

    public final boolean contains(@NullableDecl Object obj) {
        Map b = this.f6455e.mo7372b();
        if (b != null) {
            return b.entrySet().contains(obj);
        }
        if (obj instanceof Entry) {
            Entry entry = (Entry) obj;
            int a = this.f6455e.mo7368a(entry.getKey());
            if (a != -1 && C2286e.m5238a(this.f6455e.f6307h[a], entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    public final Iterator<Entry<K, V>> iterator() {
        C2343a3 a3Var = this.f6455e;
        Map b = a3Var.mo7372b();
        return b != null ? b.entrySet().iterator() : new C2381c3(a3Var);
    }

    public final boolean remove(@NullableDecl Object obj) {
        Map b = this.f6455e.mo7372b();
        if (b != null) {
            return b.entrySet().remove(obj);
        }
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        if (this.f6455e.mo7370a()) {
            return false;
        }
        int d = this.f6455e.mo7377d();
        Object key = entry.getKey();
        Object value = entry.getValue();
        C2343a3 a3Var = this.f6455e;
        int a = C2470h3.m5892a(key, value, d, a3Var.f6304e, a3Var.f6305f, a3Var.f6306g, a3Var.f6307h);
        if (a == -1) {
            return false;
        }
        this.f6455e.mo7369a(a, d);
        C2343a3 a3Var2 = this.f6455e;
        a3Var2.f6309j--;
        a3Var2.mo7373c();
        return true;
    }

    public final int size() {
        return this.f6455e.size();
    }
}
