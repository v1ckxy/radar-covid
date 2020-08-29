package p213q.p217b.p218a.p231b.p251g.p256e;

/* renamed from: q.b.a.b.g.e.nc */
public final class C2587nc implements C2604oc {

    /* renamed from: a */
    public static final C2758y1<Boolean> f6751a;

    /* renamed from: b */
    public static final C2758y1<Boolean> f6752b;

    /* renamed from: c */
    public static final C2758y1<Boolean> f6753c;

    /* renamed from: d */
    public static final C2758y1<Boolean> f6754d;

    static {
        C2486i2 i2Var = new C2486i2(C2774z1.m6581a("com.google.android.gms.measurement"));
        f6751a = C2758y1.m6560a(i2Var, "measurement.sdk.collection.enable_extend_user_property_size", true);
        f6752b = C2758y1.m6560a(i2Var, "measurement.sdk.collection.last_deep_link_referrer2", true);
        f6753c = C2758y1.m6560a(i2Var, "measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        f6754d = C2758y1.m6560a(i2Var, "measurement.sdk.collection.last_gclid_from_referrer2", false);
        C2758y1.m6558a(i2Var, "measurement.id.sdk.collection.last_deep_link_referrer2", 0);
    }

    /* renamed from: a */
    public final boolean mo7898a() {
        return ((Boolean) f6751a.mo8113b()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo7899b() {
        return ((Boolean) f6752b.mo8113b()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo7900c() {
        return ((Boolean) f6753c.mo8113b()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo7901d() {
        return ((Boolean) f6754d.mo8113b()).booleanValue();
    }
}
