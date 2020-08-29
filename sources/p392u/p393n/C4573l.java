package p392u.p393n;

import java.util.Iterator;
import p392u.p401r.p403c.p404p.C4646a;

/* renamed from: u.n.l */
public abstract class C4573l implements Iterator<Integer>, C4646a {
    /* renamed from: b */
    public abstract int mo10900b();

    public Object next() {
        return Integer.valueOf(mo10900b());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
