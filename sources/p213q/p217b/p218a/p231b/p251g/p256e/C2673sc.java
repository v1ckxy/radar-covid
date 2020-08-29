package p213q.p217b.p218a.p231b.p251g.p256e;

/* renamed from: q.b.a.b.g.e.sc */
public final class C2673sc implements C2624pc {

    /* renamed from: a */
    public static final C2758y1<Boolean> f6864a;

    /* renamed from: b */
    public static final C2758y1<Boolean> f6865b;

    /* renamed from: c */
    public static final C2758y1<Boolean> f6866c;

    static {
        C2486i2 i2Var = new C2486i2(C2774z1.m6581a("com.google.android.gms.measurement"));
        C2758y1.m6558a(i2Var, "measurement.id.lifecycle.app_in_background_parameter", 0);
        f6864a = C2758y1.m6560a(i2Var, "measurement.lifecycle.app_backgrounded_engagement", false);
        f6865b = C2758y1.m6560a(i2Var, "measurement.lifecycle.app_backgrounded_tracking", true);
        f6866c = C2758y1.m6560a(i2Var, "measurement.lifecycle.app_in_background_parameter", false);
        C2758y1.m6558a(i2Var, "measurement.id.lifecycle.app_backgrounded_tracking", 0);
    }

    /* renamed from: a */
    public final boolean mo7960a() {
        return ((Boolean) f6864a.mo8113b()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo7961b() {
        return ((Boolean) f6865b.mo8113b()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo7962c() {
        return ((Boolean) f6866c.mo8113b()).booleanValue();
    }
}
