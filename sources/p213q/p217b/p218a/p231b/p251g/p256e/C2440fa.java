package p213q.p217b.p218a.p231b.p251g.p256e;

/* renamed from: q.b.a.b.g.e.fa */
public final class C2440fa implements C2457ga {

    /* renamed from: a */
    public static final C2758y1<Boolean> f6529a;

    /* renamed from: b */
    public static final C2758y1<Boolean> f6530b;

    static {
        C2486i2 i2Var = new C2486i2(C2774z1.m6581a("com.google.android.gms.measurement"));
        f6529a = C2758y1.m6560a(i2Var, "measurement.service.configurable_service_limits", true);
        f6530b = C2758y1.m6560a(i2Var, "measurement.client.configurable_service_limits", true);
        C2758y1.m6558a(i2Var, "measurement.id.service.configurable_service_limits", 0);
    }

    /* renamed from: a */
    public final boolean mo7650a() {
        return true;
    }

    /* renamed from: b */
    public final boolean mo7651b() {
        return ((Boolean) f6529a.mo8113b()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo7652c() {
        return ((Boolean) f6530b.mo8113b()).booleanValue();
    }
}
