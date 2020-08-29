package p213q.p217b.p218a.p231b.p259h.p261b;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;

/* renamed from: q.b.a.b.h.b.i9 */
public final class C2997i9 extends C3046m9 {

    /* renamed from: d */
    public final AlarmManager f7415d = ((AlarmManager) this.f7133a.f7332a.getSystemService("alarm"));

    /* renamed from: e */
    public final C2963g f7416e;

    /* renamed from: f */
    public Integer f7417f;

    public C2997i9(C3033l9 l9Var) {
        super(l9Var);
        this.f7416e = new C3021k9(this, l9Var.f7537i, l9Var);
    }

    /* renamed from: o */
    public final boolean mo8276o() {
        this.f7415d.cancel(mo8538u());
        if (VERSION.SDK_INT >= 24) {
            ((JobScheduler) this.f7133a.f7332a.getSystemService("jobscheduler")).cancel(mo8537t());
        }
        return false;
    }

    /* renamed from: s */
    public final void mo8536s() {
        mo8649m();
        mo8285i().f7161n.mo8432a("Unscheduling upload");
        this.f7415d.cancel(mo8538u());
        this.f7416e.mo8459b();
        if (VERSION.SDK_INT >= 24) {
            ((JobScheduler) this.f7133a.f7332a.getSystemService("jobscheduler")).cancel(mo8537t());
        }
    }

    /* renamed from: t */
    public final int mo8537t() {
        if (this.f7417f == null) {
            String str = "measurement";
            String valueOf = String.valueOf(this.f7133a.f7332a.getPackageName());
            this.f7417f = Integer.valueOf((valueOf.length() != 0 ? str.concat(valueOf) : new String(str)).hashCode());
        }
        return this.f7417f.intValue();
    }

    /* renamed from: u */
    public final PendingIntent mo8538u() {
        Context context = this.f7133a.f7332a;
        return PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0);
    }
}
