package p213q.p217b.p218a.p231b.p259h.p261b;

import android.app.job.JobParameters;

/* renamed from: q.b.a.b.h.b.w8 */
public final /* synthetic */ class C3155w8 implements Runnable {

    /* renamed from: e */
    public final C3133u8 f7941e;

    /* renamed from: f */
    public final C2908b4 f7942f;

    /* renamed from: g */
    public final JobParameters f7943g;

    public C3155w8(C3133u8 u8Var, C2908b4 b4Var, JobParameters jobParameters) {
        this.f7941e = u8Var;
        this.f7942f = b4Var;
        this.f7943g = jobParameters;
    }

    public final void run() {
        C3133u8 u8Var = this.f7941e;
        C2908b4 b4Var = this.f7942f;
        JobParameters jobParameters = this.f7943g;
        if (u8Var != null) {
            b4Var.f7161n.mo8432a("AppMeasurementJobService processed last upload request.");
            ((C3177y8) u8Var.f7906a).mo1562a(jobParameters, false);
            return;
        }
        throw null;
    }
}
