package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import p213q.p217b.p218a.p231b.p259h.p261b.C2908b4;
import p213q.p217b.p218a.p231b.p259h.p261b.C2969g5;
import p213q.p217b.p218a.p231b.p259h.p261b.C3133u8;
import p213q.p217b.p218a.p231b.p259h.p261b.C3155w8;
import p213q.p217b.p218a.p231b.p259h.p261b.C3177y8;

@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements C3177y8 {

    /* renamed from: e */
    public C3133u8<AppMeasurementJobService> f1112e;

    /* renamed from: a */
    public final C3133u8<AppMeasurementJobService> mo1561a() {
        if (this.f1112e == null) {
            this.f1112e = new C3133u8<>(this);
        }
        return this.f1112e;
    }

    @TargetApi(24)
    /* renamed from: a */
    public final void mo1562a(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    /* renamed from: a */
    public final void mo1563a(Intent intent) {
    }

    /* renamed from: a */
    public final boolean mo1564a(int i) {
        throw new UnsupportedOperationException();
    }

    public final void onCreate() {
        super.onCreate();
        C2969g5.m6914a(mo1561a().f7906a, null, null).mo8285i().f7161n.mo8432a("Local AppMeasurementService is starting up");
    }

    public final void onDestroy() {
        C2969g5.m6914a(mo1561a().f7906a, null, null).mo8285i().f7161n.mo8432a("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        mo1561a().mo8757b(intent);
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        C3133u8 a = mo1561a();
        C2908b4 i = C2969g5.m6914a(a.f7906a, null, null).mo8285i();
        String string = jobParameters.getExtras().getString("action");
        i.f7161n.mo8433a("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            a.mo8755a((Runnable) new C3155w8(a, i, jobParameters));
        }
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onUnbind(Intent intent) {
        mo1561a().mo8756a(intent);
        return true;
    }
}
