package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import p124p.p175m.p176a.C1530a;
import p213q.p217b.p218a.p231b.p259h.p261b.C2908b4;
import p213q.p217b.p218a.p231b.p259h.p261b.C2969g5;
import p213q.p217b.p218a.p231b.p259h.p261b.C2981h5;
import p213q.p217b.p218a.p231b.p259h.p261b.C3033l9;
import p213q.p217b.p218a.p231b.p259h.p261b.C3122t8;
import p213q.p217b.p218a.p231b.p259h.p261b.C3133u8;
import p213q.p217b.p218a.p231b.p259h.p261b.C3177y8;

public final class AppMeasurementService extends Service implements C3177y8 {

    /* renamed from: e */
    public C3133u8<AppMeasurementService> f1114e;

    /* renamed from: a */
    public final C3133u8<AppMeasurementService> mo1573a() {
        if (this.f1114e == null) {
            this.f1114e = new C3133u8<>(this);
        }
        return this.f1114e;
    }

    /* renamed from: a */
    public final void mo1562a(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo1563a(Intent intent) {
        C1530a.m3911a(intent);
    }

    /* renamed from: a */
    public final boolean mo1564a(int i) {
        return stopSelfResult(i);
    }

    public final IBinder onBind(Intent intent) {
        C3133u8 a = mo1573a();
        if (a == null) {
            throw null;
        } else if (intent == null) {
            a.mo8754a().f7153f.mo8432a("onBind called with null intent");
            return null;
        } else {
            String action = intent.getAction();
            if ("com.google.android.gms.measurement.START".equals(action)) {
                return new C2981h5(C3033l9.m7072a((Context) a.f7906a));
            }
            a.mo8754a().f7156i.mo8433a("onBind received unknown action", action);
            return null;
        }
    }

    public final void onCreate() {
        super.onCreate();
        C2969g5.m6914a(mo1573a().f7906a, null, null).mo8285i().f7161n.mo8432a("Local AppMeasurementService is starting up");
    }

    public final void onDestroy() {
        C2969g5.m6914a(mo1573a().f7906a, null, null).mo8285i().f7161n.mo8432a("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        mo1573a().mo8757b(intent);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        C3133u8 a = mo1573a();
        C2908b4 i3 = C2969g5.m6914a(a.f7906a, null, null).mo8285i();
        if (intent == null) {
            i3.f7156i.mo8432a("AppMeasurementService started with null intent");
        } else {
            String action = intent.getAction();
            i3.f7161n.mo8434a("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
            if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
                a.mo8755a((Runnable) new C3122t8(a, i2, i3, intent));
            }
        }
        return 2;
    }

    public final boolean onUnbind(Intent intent) {
        mo1573a().mo8756a(intent);
        return true;
    }
}
