package p213q.p217b.p355e;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: q.b.e.f */
public final class C4329f extends C4332i implements Iterable<C4332i> {

    /* renamed from: e */
    public final List<C4332i> f10381e = new ArrayList();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C4329f) && ((C4329f) obj).f10381e.equals(this.f10381e));
    }

    public int hashCode() {
        return this.f10381e.hashCode();
    }

    public Iterator<C4332i> iterator() {
        return this.f10381e.iterator();
    }
}
