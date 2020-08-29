package p213q.p217b.p218a.p231b.p259h.p261b;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import p213q.p217b.p218a.p231b.p251g.p256e.C2626pe;

/* renamed from: q.b.a.b.h.b.x9 */
public final class C3167x9 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C2626pe f7971e;

    /* renamed from: f */
    public final /* synthetic */ String f7972f;

    /* renamed from: g */
    public final /* synthetic */ String f7973g;

    /* renamed from: h */
    public final /* synthetic */ AppMeasurementDynamiteService f7974h;

    public C3167x9(AppMeasurementDynamiteService appMeasurementDynamiteService, C2626pe peVar, String str, String str2) {
        this.f7974h = appMeasurementDynamiteService;
        this.f7971e = peVar;
        this.f7972f = str;
        this.f7973g = str2;
    }

    public final void run() {
        C3121t7 t = this.f7974h.f1115a.mo8477t();
        C2626pe peVar = this.f7971e;
        String str = this.f7972f;
        String str2 = this.f7973g;
        t.mo8279c();
        t.mo8373v();
        C3008j8 j8Var = new C3008j8(t, str, str2, t.mo8725a(false), peVar);
        t.mo8726a((Runnable) j8Var);
    }
}
