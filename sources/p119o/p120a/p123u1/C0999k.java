package p119o.p120a.p123u1;

import java.util.concurrent.TimeUnit;
import p119o.p120a.C0967p0;
import p119o.p120a.p121a.C0911p;
import p392u.p406t.C4656d;

/* renamed from: o.a.u1.k */
public final class C0999k {

    /* renamed from: a */
    public static final long f2643a = C0967p0.m2175a("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, (Object) null);

    /* renamed from: b */
    public static final int f2644b;

    /* renamed from: c */
    public static final int f2645c = C0967p0.m2171a("kotlinx.coroutines.scheduler.max.pool.size", C4656d.m10288a(C0911p.f2506a * 128, f2644b, 2097150), 0, 2097150, 4, (Object) null);

    /* renamed from: d */
    public static final long f2646d = TimeUnit.SECONDS.toNanos(C0967p0.m2175a("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, (Object) null));

    /* renamed from: e */
    public static C1000l f2647e = C0994f.f2638a;

    static {
        C0967p0.m2171a("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12, (Object) null);
        int i = C0911p.f2506a;
        f2644b = C0967p0.m2171a("kotlinx.coroutines.scheduler.core.pool.size", i < 2 ? 2 : i, 1, 0, 8, (Object) null);
    }
}
