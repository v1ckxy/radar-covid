package p213q.p217b.p218a.p231b.p251g.p256e;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: q.b.a.b.g.e.v6 */
public final class C2716v6<K> implements Iterator<Entry<K, Object>> {

    /* renamed from: e */
    public Iterator<Entry<K, Object>> f6931e;

    public C2716v6(Iterator<Entry<K, Object>> it) {
        this.f6931e = it;
    }

    public final boolean hasNext() {
        return this.f6931e.hasNext();
    }

    public final /* synthetic */ Object next() {
        Entry entry = (Entry) this.f6931e.next();
        return entry.getValue() instanceof C2700u6 ? new C2732w6(entry, null) : entry;
    }

    public final void remove() {
        this.f6931e.remove();
    }
}
