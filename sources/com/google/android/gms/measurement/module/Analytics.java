package com.google.android.gms.measurement.module;

import android.content.Context;
import androidx.annotation.Keep;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p259h.p261b.C2969g5;

public class Analytics {

    /* renamed from: a */
    public static volatile Analytics f1121a;

    public Analytics(C2969g5 g5Var) {
        C1061o.m2524b(g5Var);
    }

    @Keep
    public static Analytics getInstance(Context context) {
        if (f1121a == null) {
            synchronized (Analytics.class) {
                if (f1121a == null) {
                    f1121a = new Analytics(C2969g5.m6914a(context, null, null));
                }
            }
        }
        return f1121a;
    }
}
