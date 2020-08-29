package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import p213q.p217b.p218a.p219a.p222f.C2006b.C2008b;
import p213q.p217b.p218a.p219a.p222f.C2018i;
import p213q.p217b.p218a.p219a.p222f.C2018i.C2019a;
import p213q.p217b.p218a.p219a.p222f.C2023m;
import p213q.p217b.p218a.p219a.p222f.p225r.p226h.C2056e;
import p213q.p217b.p218a.p219a.p222f.p225r.p226h.C2061g;
import p213q.p217b.p218a.p219a.p222f.p225r.p226h.C2066l;
import p213q.p217b.p218a.p219a.p222f.p230u.C2104a;

public class JobInfoSchedulerService extends JobService {
    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        C2023m.m4807a(getApplicationContext());
        C2019a a = C2018i.m4802a();
        a.mo7005a(string);
        a.mo7006a(C2104a.m4892a(i));
        if (string2 != null) {
            ((C2008b) a).f5766b = Base64.decode(string2, 0);
        }
        C2066l lVar = C2023m.m4806a().f5797d;
        lVar.f5888e.execute(new C2061g(lVar, a.mo7007a(), i2, new C2056e(this, jobParameters)));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
