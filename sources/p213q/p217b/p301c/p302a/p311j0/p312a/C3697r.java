package p213q.p217b.p301c.p302a.p311j0.p312a;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3737f;

/* renamed from: q.b.c.a.j0.a.r */
public class C3697r {

    /* renamed from: b */
    public static volatile C3697r f9147b;

    /* renamed from: c */
    public static final C3697r f9148c = new C3697r(true);

    /* renamed from: a */
    public final Map<C3698a, C3737f<?, ?>> f9149a;

    /* renamed from: q.b.c.a.j0.a.r$a */
    public static final class C3698a {

        /* renamed from: a */
        public final Object f9150a;

        /* renamed from: b */
        public final int f9151b;

        public C3698a(Object obj, int i) {
            this.f9150a = obj;
            this.f9151b = i;
        }

        public boolean equals(Object obj) {
            boolean z = false;
            if (!(obj instanceof C3698a)) {
                return false;
            }
            C3698a aVar = (C3698a) obj;
            if (this.f9150a == aVar.f9150a && this.f9151b == aVar.f9151b) {
                z = true;
            }
            return z;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f9150a) * 65535) + this.f9151b;
        }
    }

    public C3697r() {
        this.f9149a = new HashMap();
    }

    public C3697r(boolean z) {
        this.f9149a = Collections.emptyMap();
    }

    /* renamed from: a */
    public static C3697r m8878a() {
        C3697r rVar = f9147b;
        if (rVar == null) {
            synchronized (C3697r.class) {
                rVar = f9147b;
                if (rVar == null) {
                    String str = "getEmptyRegistry";
                    Class<?> cls = C3689q.f9134a;
                    C3697r rVar2 = null;
                    if (cls != null) {
                        try {
                            rVar2 = (C3697r) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                        }
                    }
                    if (rVar2 == null) {
                        rVar2 = f9148c;
                    }
                    f9147b = rVar2;
                    rVar = rVar2;
                }
            }
        }
        return rVar;
    }
}
