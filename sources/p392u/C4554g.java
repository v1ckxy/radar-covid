package p392u;

import java.io.Serializable;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4638h;

/* renamed from: u.g */
public final class C4554g<T> implements Serializable {

    /* renamed from: u.g$a */
    public static final class C4555a implements Serializable {

        /* renamed from: e */
        public final Throwable f10768e;

        public C4555a(Throwable th) {
            if (th != null) {
                this.f10768e = th;
            } else {
                C4638h.m10271a("exception");
                throw null;
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof C4555a) && C4638h.m10272a((Object) this.f10768e, (Object) ((C4555a) obj).f10768e);
        }

        public int hashCode() {
            return this.f10768e.hashCode();
        }

        public String toString() {
            StringBuilder a = C1965a.m4756a("Failure(");
            a.append(this.f10768e);
            a.append(')');
            return a.toString();
        }
    }

    /* renamed from: a */
    public static Object m10210a(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public static final Throwable m10211b(Object obj) {
        if (obj instanceof C4555a) {
            return ((C4555a) obj).f10768e;
        }
        return null;
    }

    /* renamed from: c */
    public static final boolean m10212c(Object obj) {
        return obj instanceof C4555a;
    }
}
