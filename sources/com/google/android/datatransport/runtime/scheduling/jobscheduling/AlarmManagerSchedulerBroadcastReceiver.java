package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import p213q.p217b.p218a.p219a.p222f.C2006b.C2008b;
import p213q.p217b.p218a.p219a.p222f.C2018i;
import p213q.p217b.p218a.p219a.p222f.C2018i.C2019a;
import p213q.p217b.p218a.p219a.p222f.C2023m;
import p213q.p217b.p218a.p219a.p222f.p225r.p226h.C2050a;
import p213q.p217b.p218a.p219a.p222f.p225r.p226h.C2061g;
import p213q.p217b.p218a.p219a.p222f.p225r.p226h.C2066l;
import p213q.p217b.p218a.p219a.p222f.p230u.C2104a;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    /* renamed from: a */
    public static /* synthetic */ void m876a() {
    }

    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        C2023m.m4807a(context);
        C2019a a = C2018i.m4802a();
        a.mo7005a(queryParameter);
        a.mo7006a(C2104a.m4892a(intValue));
        if (queryParameter2 != null) {
            ((C2008b) a).f5766b = Base64.decode(queryParameter2, 0);
        }
        C2066l lVar = C2023m.m4806a().f5797d;
        lVar.f5888e.execute(new C2061g(lVar, a.mo7007a(), i, C2050a.f5851e));
    }
}
