package p392u.p394o;

import java.util.Comparator;
import p392u.p401r.p403c.C4638h;

/* renamed from: u.o.b */
public final class C4575b implements Comparator<Comparable<? super Object>> {

    /* renamed from: e */
    public static final C4575b f10783e = new C4575b();

    public int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        if (comparable == null) {
            C4638h.m10271a("a");
            throw null;
        } else if (comparable2 != null) {
            return comparable2.compareTo(comparable);
        } else {
            C4638h.m10271a("b");
            throw null;
        }
    }

    public final Comparator<Comparable<Object>> reversed() {
        return C4574a.f10782e;
    }
}
