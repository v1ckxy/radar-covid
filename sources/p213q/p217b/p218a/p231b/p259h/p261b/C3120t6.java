package p213q.p217b.p218a.p231b.p259h.p261b;

import android.os.Bundle;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.h.b.t6 */
public final class C3120t6 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ Bundle f7865e;

    /* renamed from: f */
    public final /* synthetic */ C3018k6 f7866f;

    public C3120t6(C3018k6 k6Var, Bundle bundle) {
        this.f7866f = k6Var;
        this.f7865e = bundle;
    }

    public final void run() {
        C3018k6 k6Var = this.f7866f;
        Bundle bundle = this.f7865e;
        String str = "app_id";
        k6Var.mo8279c();
        k6Var.mo8373v();
        C1061o.m2524b(bundle);
        String str2 = "name";
        C1061o.m2528b(bundle.getString(str2));
        String str3 = "origin";
        C1061o.m2528b(bundle.getString(str3));
        String str4 = "value";
        C1061o.m2524b(bundle.get(str4));
        if (!k6Var.f7133a.mo8464b()) {
            k6Var.mo8285i().f7161n.mo8432a("Conditional property not set since app measurement is disabled");
            return;
        }
        C3112s9 s9Var = new C3112s9(bundle.getString(str2), bundle.getLong("triggered_timestamp"), bundle.get(str4), bundle.getString(str3));
        try {
            C3047n a = k6Var.mo8287k().mo8782a(bundle.getString(str), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), bundle.getString(str3), 0);
            C3047n a2 = k6Var.mo8287k().mo8782a(bundle.getString(str), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), bundle.getString(str3), 0);
            C3047n a3 = k6Var.mo8287k().mo8782a(bundle.getString(str), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), bundle.getString(str3), 0);
            String string = bundle.getString(str);
            String string2 = bundle.getString(str3);
            long j = bundle.getLong("creation_timestamp");
            String string3 = bundle.getString("trigger_event_name");
            long j2 = bundle.getLong("trigger_timeout");
            long j3 = bundle.getLong("time_to_live");
            C2998ia iaVar = r3;
            C2998ia iaVar2 = new C2998ia(string, string2, s9Var, j, false, string3, a2, j2, a, j3, a3);
            k6Var.mo8299q().mo8727a(iaVar);
        } catch (IllegalArgumentException unused) {
        }
    }
}
