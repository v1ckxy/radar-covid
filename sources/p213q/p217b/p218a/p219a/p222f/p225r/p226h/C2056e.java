package p213q.p217b.p218a.p219a.p222f.p225r.p226h;

import android.app.job.JobParameters;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;

/* renamed from: q.b.a.a.f.r.h.e */
public final /* synthetic */ class C2056e implements Runnable {

    /* renamed from: e */
    public final JobInfoSchedulerService f5863e;

    /* renamed from: f */
    public final JobParameters f5864f;

    public C2056e(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.f5863e = jobInfoSchedulerService;
        this.f5864f = jobParameters;
    }

    public void run() {
        this.f5863e.jobFinished(this.f5864f, false);
    }
}
