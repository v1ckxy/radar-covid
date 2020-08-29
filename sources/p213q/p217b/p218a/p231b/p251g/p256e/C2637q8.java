package p213q.p217b.p218a.p231b.p251g.p256e;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: q.b.a.b.g.e.q8 */
public class C2637q8 extends AbstractSet<Entry<K, V>> {

    /* renamed from: e */
    public final /* synthetic */ C2475h8 f6816e;

    public /* synthetic */ C2637q8(C2475h8 h8Var, C2514j8 j8Var) {
        this.f6816e = h8Var;
    }

    public /* synthetic */ boolean add(Object obj) {
        Entry entry = (Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f6816e.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.f6816e.clear();
    }

    public boolean contains(Object obj) {
        Entry entry = (Entry) obj;
        Object obj2 = this.f6816e.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public Iterator<Entry<K, V>> iterator() {
        return new C2583n8(this.f6816e, null);
    }

    public boolean remove(Object obj) {
        Entry entry = (Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f6816e.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.f6816e.size();
    }
}
