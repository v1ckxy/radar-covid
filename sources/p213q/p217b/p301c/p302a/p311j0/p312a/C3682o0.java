package p213q.p217b.p301c.p302a.p311j0.p312a;

import java.util.Map;
import java.util.Map.Entry;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3667l0.C3668a;

/* renamed from: q.b.c.a.j0.a.o0 */
public class C3682o0 implements C3679n0 {
    /* renamed from: a */
    public int mo9850a(int i, Object obj, Object obj2) {
        C3676m0 m0Var = (C3676m0) obj;
        C3667l0 l0Var = (C3667l0) obj2;
        int i2 = 0;
        if (!m0Var.isEmpty()) {
            for (Entry entry : m0Var.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (l0Var != null) {
                    i2 += C3670m.m8656e(C3667l0.m8633a(key, value)) + C3670m.m8669h(i);
                } else {
                    throw null;
                }
            }
        }
        return i2;
    }

    /* renamed from: b */
    public boolean mo9853b(Object obj) {
        return !((C3676m0) obj).f9115e;
    }

    /* renamed from: c */
    public Object mo9854c(Object obj) {
        ((C3676m0) obj).f9115e = false;
        return obj;
    }

    /* renamed from: d */
    public C3668a<?, ?> mo9855d(Object obj) {
        if (((C3667l0) obj) != null) {
            return null;
        }
        throw null;
    }

    /* renamed from: e */
    public Map<?, ?> mo9856e(Object obj) {
        return (C3676m0) obj;
    }

    /* renamed from: f */
    public Map<?, ?> mo9857f(Object obj) {
        return (C3676m0) obj;
    }

    /* renamed from: a */
    public Object mo9852a(Object obj, Object obj2) {
        C3676m0 m0Var = (C3676m0) obj;
        C3676m0 m0Var2 = (C3676m0) obj2;
        if (!m0Var2.isEmpty()) {
            if (!m0Var.f9115e) {
                m0Var = m0Var.isEmpty() ? new C3676m0() : new C3676m0(m0Var);
            }
            m0Var.mo9829b();
            if (!m0Var2.isEmpty()) {
                m0Var.putAll(m0Var2);
            }
        }
        return m0Var;
    }

    /* renamed from: a */
    public Object mo9851a(Object obj) {
        C3676m0 m0Var = C3676m0.f9114f;
        return m0Var.isEmpty() ? new C3676m0() : new C3676m0(m0Var);
    }
}
