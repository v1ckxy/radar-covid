package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import p124p.p175m.p176a.C1530a;
import p213q.p217b.p218a.p231b.p259h.p261b.C2908b4;
import p213q.p217b.p218a.p231b.p259h.p261b.C2944e4;
import p213q.p217b.p218a.p231b.p259h.p261b.C2969g5;
import p213q.p217b.p218a.p231b.p259h.p261b.C3162x4;
import p213q.p217b.p218a.p231b.p259h.p261b.C3173y4;

public final class AppMeasurementReceiver extends C1530a implements C3162x4 {

    /* renamed from: c */
    public C3173y4 f1113c;

    /* renamed from: a */
    public final void mo1571a(Context context, Intent intent) {
        C1530a.m3912b(context, intent);
    }

    public final void onReceive(Context context, Intent intent) {
        String str;
        C2944e4 e4Var;
        if (this.f1113c == null) {
            this.f1113c = new C3173y4(this);
        }
        C3173y4 y4Var = this.f1113c;
        if (y4Var != null) {
            C2908b4 i = C2969g5.m6914a(context, null, null).mo8285i();
            if (intent == null) {
                e4Var = i.f7156i;
                str = "Receiver called with null intent";
            } else {
                String action = intent.getAction();
                i.f7161n.mo8433a("Local receiver got", action);
                String str2 = "com.google.android.gms.measurement.UPLOAD";
                if (str2.equals(action)) {
                    Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
                    className.setAction(str2);
                    i.f7161n.mo8432a("Starting wakeful intent.");
                    y4Var.f7979a.mo1571a(context, className);
                    return;
                } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                    e4Var = i.f7156i;
                    str = "Install Referrer Broadcasts are deprecated";
                } else {
                    return;
                }
            }
            e4Var.mo8432a(str);
            return;
        }
        throw null;
    }
}
