package p213q.p217b.p218a.p231b.p251g.p256e;

/* renamed from: q.b.a.b.g.e.cb */
public final class C2389cb implements C2783za {

    /* renamed from: a */
    public static final C2758y1<Boolean> f6422a;

    /* renamed from: b */
    public static final C2758y1<Boolean> f6423b;

    /* renamed from: c */
    public static final C2758y1<Boolean> f6424c;

    /* renamed from: d */
    public static final C2758y1<Boolean> f6425d;

    static {
        C2486i2 i2Var = new C2486i2(C2774z1.m6581a("com.google.android.gms.measurement"));
        f6422a = C2758y1.m6560a(i2Var, "measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f6423b = C2758y1.m6560a(i2Var, "measurement.audience.refresh_event_count_filters_timestamp", false);
        f6424c = C2758y1.m6560a(i2Var, "measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f6425d = C2758y1.m6560a(i2Var, "measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    /* renamed from: a */
    public final boolean mo7489a() {
        return true;
    }

    /* renamed from: b */
    public final boolean mo7490b() {
        return ((Boolean) f6422a.mo8113b()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo7491c() {
        return ((Boolean) f6423b.mo8113b()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo7492d() {
        return ((Boolean) f6424c.mo8113b()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo7493e() {
        return ((Boolean) f6425d.mo8113b()).booleanValue();
    }
}
