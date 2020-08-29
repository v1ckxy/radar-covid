package p213q.p217b.p218a.p231b.p251g.p256e;

/* renamed from: q.b.a.b.g.e.z9 */
public final class C2782z9 implements C2350aa {

    /* renamed from: a */
    public static final C2758y1<Boolean> f7011a;

    /* renamed from: b */
    public static final C2758y1<Long> f7012b;

    static {
        C2486i2 i2Var = new C2486i2(C2774z1.m6581a("com.google.android.gms.measurement"));
        f7011a = C2758y1.m6560a(i2Var, "measurement.sdk.attribution.cache", true);
        f7012b = C2758y1.m6558a(i2Var, "measurement.sdk.attribution.cache.ttl", 604800000);
    }

    /* renamed from: a */
    public final boolean mo7403a() {
        return ((Boolean) f7011a.mo8113b()).booleanValue();
    }

    /* renamed from: b */
    public final long mo7404b() {
        return ((Long) f7012b.mo8113b()).longValue();
    }
}
