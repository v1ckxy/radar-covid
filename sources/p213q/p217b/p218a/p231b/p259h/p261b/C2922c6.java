package p213q.p217b.p218a.p231b.p259h.p261b;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import p213q.p217b.p218a.p231b.p251g.p256e.C2626pe;

/* renamed from: q.b.a.b.h.b.c6 */
public final class C2922c6 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C2626pe f7211e;

    /* renamed from: f */
    public final /* synthetic */ AppMeasurementDynamiteService f7212f;

    public C2922c6(AppMeasurementDynamiteService appMeasurementDynamiteService, C2626pe peVar) {
        this.f7212f = appMeasurementDynamiteService;
        this.f7211e = peVar;
    }

    public final void run() {
        C3121t7 t = this.f7212f.f1115a.mo8477t();
        C2626pe peVar = this.f7211e;
        t.mo8279c();
        t.mo8373v();
        t.mo8726a((Runnable) new C3176y7(t, t.mo8725a(false), peVar));
    }
}
