package p213q.p217b.p218a.p231b.p251g.p256e;

/* renamed from: q.b.a.b.g.e.fd */
public final class C2443fd implements C2460gd {

    /* renamed from: a */
    public static final C2758y1<Boolean> f6533a;

    /* renamed from: b */
    public static final C2758y1<Double> f6534b;

    /* renamed from: c */
    public static final C2758y1<Long> f6535c;

    /* renamed from: d */
    public static final C2758y1<Long> f6536d;

    /* renamed from: e */
    public static final C2758y1<String> f6537e;

    static {
        C2486i2 i2Var = new C2486i2(C2774z1.m6581a("com.google.android.gms.measurement"));
        f6533a = C2758y1.m6560a(i2Var, "measurement.test.boolean_flag", false);
        f6534b = C2758y1.m6557a(i2Var, "measurement.test.double_flag");
        f6535c = C2758y1.m6558a(i2Var, "measurement.test.int_flag", -2);
        f6536d = C2758y1.m6558a(i2Var, "measurement.test.long_flag", -1);
        f6537e = C2758y1.m6559a(i2Var, "measurement.test.string_flag", "---");
    }

    /* renamed from: a */
    public final boolean mo7655a() {
        return ((Boolean) f6533a.mo8113b()).booleanValue();
    }

    /* renamed from: b */
    public final double mo7656b() {
        return ((Double) f6534b.mo8113b()).doubleValue();
    }

    /* renamed from: c */
    public final long mo7657c() {
        return ((Long) f6535c.mo8113b()).longValue();
    }

    /* renamed from: d */
    public final long mo7658d() {
        return ((Long) f6536d.mo8113b()).longValue();
    }

    /* renamed from: e */
    public final String mo7659e() {
        return (String) f6537e.mo8113b();
    }
}
