package p213q.p363c.p364a;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.c.a.d */
public class C4408d {

    /* renamed from: a */
    public final Object f10511a;

    /* renamed from: b */
    public final Method f10512b;

    /* renamed from: c */
    public final int f10513c;

    /* renamed from: d */
    public boolean f10514d = true;

    public C4408d(Object obj, Method method) {
        if (obj == null) {
            throw new NullPointerException("EventHandler target cannot be null.");
        } else if (method != null) {
            this.f10511a = obj;
            this.f10512b = method;
            method.setAccessible(true);
            this.f10513c = obj.hashCode() + ((method.hashCode() + 31) * 31);
        } else {
            throw new NullPointerException("EventHandler method cannot be null.");
        }
    }

    /* renamed from: a */
    public void mo10700a(Object obj) {
        if (this.f10514d) {
            try {
                this.f10512b.invoke(this.f10511a, new Object[]{obj});
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
            sb.append(" has been invalidated and can no longer handle events.");
            throw new IllegalStateException(sb.toString());
        }
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C4408d.class != obj.getClass()) {
            return false;
        }
        C4408d dVar = (C4408d) obj;
        if (!this.f10512b.equals(dVar.f10512b) || this.f10511a != dVar.f10511a) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.f10513c;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("[EventHandler ");
        a.append(this.f10512b);
        a.append("]");
        return a.toString();
    }
}
