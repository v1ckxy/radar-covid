package p213q.p217b.p218a.p231b.p259h.p261b;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import p213q.p217b.p218a.p231b.p239d.C2124f;
import p213q.p217b.p218a.p231b.p239d.C2129i;
import p213q.p217b.p218a.p231b.p251g.p256e.C2626pe;

/* renamed from: q.b.a.b.h.b.a8 */
public final class C2900a8 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C2626pe f7136e;

    /* renamed from: f */
    public final /* synthetic */ C3047n f7137f;

    /* renamed from: g */
    public final /* synthetic */ String f7138g;

    /* renamed from: h */
    public final /* synthetic */ AppMeasurementDynamiteService f7139h;

    public C2900a8(AppMeasurementDynamiteService appMeasurementDynamiteService, C2626pe peVar, C3047n nVar, String str) {
        this.f7139h = appMeasurementDynamiteService;
        this.f7136e = peVar;
        this.f7137f = nVar;
        this.f7138g = str;
    }

    public final void run() {
        C3121t7 t = this.f7139h.f1115a.mo8477t();
        C2626pe peVar = this.f7136e;
        C3047n nVar = this.f7137f;
        String str = this.f7138g;
        t.mo8279c();
        t.mo8373v();
        C3156w9 k = t.mo8287k();
        if (k == null) {
            throw null;
        } else if (C2124f.f5997b.mo7110a(k.f7133a.f7332a, C2129i.f5999a) != 0) {
            t.mo8285i().f7156i.mo8432a("Not bundling data. Service unavailable or out of date");
            t.mo8287k().mo8794a(peVar, new byte[0]);
        } else {
            t.mo8726a((Runnable) new C2936d8(t, nVar, str, peVar));
        }
    }
}
