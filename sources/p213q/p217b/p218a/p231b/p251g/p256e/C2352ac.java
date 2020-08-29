package p213q.p217b.p218a.p231b.p251g.p256e;

/* renamed from: q.b.a.b.g.e.ac */
public final class C2352ac implements C2752xb {

    /* renamed from: a */
    public static final C2758y1<Boolean> f6318a;

    /* renamed from: b */
    public static final C2758y1<Boolean> f6319b;

    static {
        C2486i2 i2Var = new C2486i2(C2774z1.m6581a("com.google.android.gms.measurement"));
        f6318a = C2758y1.m6560a(i2Var, "measurement.collection.efficient_engagement_reporting_enabled_2", true);
        f6319b = C2758y1.m6560a(i2Var, "measurement.collection.redundant_engagement_removal_enabled", false);
        C2758y1.m6558a(i2Var, "measurement.id.collection.redundant_engagement_removal_enabled", 0);
    }

    /* renamed from: a */
    public final boolean mo7406a() {
        return ((Boolean) f6318a.mo8113b()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo7407b() {
        return ((Boolean) f6319b.mo8113b()).booleanValue();
    }
}
