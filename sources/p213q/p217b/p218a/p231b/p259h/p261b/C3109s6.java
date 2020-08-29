package p213q.p217b.p218a.p231b.p259h.p261b;

import android.os.Bundle;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.h.b.s6 */
public final class C3109s6 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ Bundle f7845e;

    /* renamed from: f */
    public final /* synthetic */ C3018k6 f7846f;

    public C3109s6(C3018k6 k6Var, Bundle bundle) {
        this.f7846f = k6Var;
        this.f7845e = bundle;
    }

    public final void run() {
        C3018k6 k6Var = this.f7846f;
        Bundle bundle = this.f7845e;
        String str = "creation_timestamp";
        String str2 = "origin";
        String str3 = "app_id";
        k6Var.mo8279c();
        k6Var.mo8373v();
        C1061o.m2524b(bundle);
        String str4 = "name";
        C1061o.m2528b(bundle.getString(str4));
        if (!k6Var.f7133a.mo8464b()) {
            k6Var.mo8285i().f7161n.mo8432a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        C3112s9 s9Var = new C3112s9(bundle.getString(str4), 0, null, null);
        try {
            C3047n a = k6Var.mo8287k().mo8782a(bundle.getString(str3), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), bundle.getString(str2), bundle.getLong(str));
            String string = bundle.getString(str3);
            String string2 = bundle.getString(str2);
            long j = bundle.getLong(str);
            boolean z = bundle.getBoolean("active");
            String string3 = bundle.getString("trigger_event_name");
            long j2 = bundle.getLong("trigger_timeout");
            long j3 = bundle.getLong("time_to_live");
            C2998ia iaVar = r3;
            C2998ia iaVar2 = new C2998ia(string, string2, s9Var, j, z, string3, null, j2, null, j3, a);
            k6Var.mo8299q().mo8727a(iaVar);
        } catch (IllegalArgumentException unused) {
        }
    }
}
