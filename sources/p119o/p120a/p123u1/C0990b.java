package p119o.p120a.p123u1;

import p119o.p120a.C0967p0;
import p119o.p120a.C1010z;
import p119o.p120a.p121a.C0911p;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: o.a.u1.b */
public final class C0990b extends C0991c {

    /* renamed from: k */
    public static final C1010z f2626k;

    /* renamed from: l */
    public static final C0990b f2627l;

    static {
        C0990b bVar = new C0990b();
        f2627l = bVar;
        int i = C0911p.f2506a;
        int a = C0967p0.m2171a("kotlinx.coroutines.io.parallelism", 64 < i ? i : 64, 0, 0, 12, (Object) null);
        if (a > 0) {
            f2626k = new C0993e(bVar, a, 1);
            return;
        }
        throw new IllegalArgumentException(C1965a.m4761b("Expected positive parallelism level, but have ", a).toString());
    }

    public C0990b() {
        super(0, 0, null, 7);
    }

    public void close() {
        throw new UnsupportedOperationException("DefaultDispatcher cannot be closed");
    }

    public String toString() {
        return "DefaultDispatcher";
    }
}
