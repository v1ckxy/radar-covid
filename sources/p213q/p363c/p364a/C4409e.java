package p213q.p363c.p364a;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.c.a.e */
public class C4409e {

    /* renamed from: a */
    public final Object f10515a;

    /* renamed from: b */
    public final Method f10516b;

    /* renamed from: c */
    public final int f10517c;

    /* renamed from: d */
    public boolean f10518d = true;

    public C4409e(Object obj, Method method) {
        if (obj == null) {
            throw new NullPointerException("EventProducer target cannot be null.");
        } else if (method != null) {
            this.f10515a = obj;
            this.f10516b = method;
            method.setAccessible(true);
            this.f10517c = obj.hashCode() + ((method.hashCode() + 31) * 31);
        } else {
            throw new NullPointerException("EventProducer method cannot be null.");
        }
    }

    /* renamed from: a */
    public Object mo10704a() {
        if (this.f10518d) {
            try {
                return this.f10516b.invoke(this.f10515a, new Object[0]);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                if (e2.getCause() instanceof Error) {
                    throw ((Error) e2.getCause());
                }
                throw e2;
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(toString());
            sb.append(" has been invalidated and can no longer produce events.");
            throw new IllegalStateException(sb.toString());
        }
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C4409e.class != obj.getClass()) {
            return false;
        }
        C4409e eVar = (C4409e) obj;
        if (!this.f10516b.equals(eVar.f10516b) || this.f10515a != eVar.f10515a) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.f10517c;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("[EventProducer ");
        a.append(this.f10516b);
        a.append("]");
        return a.toString();
    }
}
