package p213q.p217b.p218a.p231b.p251g.p256e;

/* renamed from: q.b.a.b.g.e.hc */
public final class C2479hc implements C2502ic {

    /* renamed from: a */
    public static final C2758y1<Boolean> f6604a;

    /* renamed from: b */
    public static final C2758y1<Boolean> f6605b;

    /* renamed from: c */
    public static final C2758y1<Boolean> f6606c;

    static {
        C2486i2 i2Var = new C2486i2(C2774z1.m6581a("com.google.android.gms.measurement"));
        f6604a = C2758y1.m6560a(i2Var, "measurement.client.global_params.dev", false);
        f6605b = C2758y1.m6560a(i2Var, "measurement.service.global_params_in_payload", true);
        f6606c = C2758y1.m6560a(i2Var, "measurement.service.global_params", false);
        C2758y1.m6558a(i2Var, "measurement.id.service.global_params", 0);
    }

    /* renamed from: a */
    public final boolean mo7726a() {
        return true;
    }

    /* renamed from: b */
    public final boolean mo7727b() {
        return ((Boolean) f6604a.mo8113b()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo7728c() {
        return ((Boolean) f6605b.mo8113b()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo7729d() {
        return ((Boolean) f6606c.mo8113b()).booleanValue();
    }
}
