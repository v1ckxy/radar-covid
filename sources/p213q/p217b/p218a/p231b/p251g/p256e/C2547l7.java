package p213q.p217b.p218a.p231b.p251g.p256e;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: q.b.a.b.g.e.l7 */
public final class C2547l7 implements C2564m7 {
    /* renamed from: a */
    public final int mo7847a(int i, Object obj, Object obj2) {
        C2513j7 j7Var = (C2513j7) obj;
        C2474h7 h7Var = (C2474h7) obj2;
        if (j7Var.isEmpty()) {
            return 0;
        }
        Iterator it = j7Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Entry entry = (Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    public final Object mo7848a(Object obj, Object obj2) {
        C2513j7 j7Var = (C2513j7) obj;
        C2513j7 j7Var2 = (C2513j7) obj2;
        if (!j7Var2.isEmpty()) {
            if (!j7Var.f6650e) {
                j7Var = j7Var.isEmpty() ? new C2513j7() : new C2513j7(j7Var);
            }
            j7Var.mo7806b();
            if (!j7Var2.isEmpty()) {
                j7Var.putAll(j7Var2);
            }
        }
        return j7Var;
    }

    /* renamed from: a */
    public final Map<?, ?> mo7849a(Object obj) {
        return (C2513j7) obj;
    }

    /* renamed from: b */
    public final boolean mo7850b(Object obj) {
        return !((C2513j7) obj).f6650e;
    }

    /* renamed from: c */
    public final Map<?, ?> mo7851c(Object obj) {
        return (C2513j7) obj;
    }

    /* renamed from: d */
    public final C2530k7<?, ?> mo7852d(Object obj) {
        C2474h7 h7Var = (C2474h7) obj;
        throw new NoSuchMethodError();
    }

    /* renamed from: e */
    public final Object mo7853e(Object obj) {
        C2513j7 j7Var = C2513j7.f6649f;
        return j7Var.isEmpty() ? new C2513j7() : new C2513j7(j7Var);
    }

    /* renamed from: f */
    public final Object mo7854f(Object obj) {
        ((C2513j7) obj).f6650e = false;
        return obj;
    }
}
