package p213q.p217b.p218a.p231b.p251g.p256e;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2494d;

/* renamed from: q.b.a.b.g.e.u5 */
public class C2698u5 {

    /* renamed from: b */
    public static volatile C2698u5 f6912b;

    /* renamed from: c */
    public static volatile C2698u5 f6913c;

    /* renamed from: d */
    public static final C2698u5 f6914d = new C2698u5(true);

    /* renamed from: a */
    public final Map<C2699a, C2494d<?, ?>> f6915a;

    /* renamed from: q.b.a.b.g.e.u5$a */
    public static final class C2699a {

        /* renamed from: a */
        public final Object f6916a;

        /* renamed from: b */
        public final int f6917b;

        public C2699a(Object obj, int i) {
            this.f6916a = obj;
            this.f6917b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C2699a)) {
                return false;
            }
            C2699a aVar = (C2699a) obj;
            return this.f6916a == aVar.f6916a && this.f6917b == aVar.f6917b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f6916a) * 65535) + this.f6917b;
        }
    }

    public C2698u5() {
        this.f6915a = new HashMap();
    }

    public C2698u5(boolean z) {
        this.f6915a = Collections.emptyMap();
    }

    /* renamed from: a */
    public static C2698u5 m6462a() {
        C2698u5 u5Var = f6912b;
        if (u5Var == null) {
            synchronized (C2698u5.class) {
                u5Var = f6912b;
                if (u5Var == null) {
                    u5Var = f6914d;
                    f6912b = u5Var;
                }
            }
        }
        return u5Var;
    }

    /* renamed from: b */
    public static C2698u5 m6463b() {
        Class<C2698u5> cls = C2698u5.class;
        C2698u5 u5Var = f6913c;
        if (u5Var != null) {
            return u5Var;
        }
        synchronized (cls) {
            C2698u5 u5Var2 = f6913c;
            if (u5Var2 != null) {
                return u5Var2;
            }
            C2698u5 a = C2473h6.m5900a(cls);
            f6913c = a;
            return a;
        }
    }
}
