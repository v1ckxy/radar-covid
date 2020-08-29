package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.PersistableBundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import p124p.p199y.C1800l;
import p124p.p199y.p200x.C1823b;
import p124p.p199y.p200x.C1842l;

public class SystemJobService extends JobService implements C1823b {

    /* renamed from: g */
    public static final String f1007g = C1800l.m4459a("SystemJobService");

    /* renamed from: e */
    public C1842l f1008e;

    /* renamed from: f */
    public final Map<String, JobParameters> f1009f = new HashMap();

    /* renamed from: a */
    public static String m853a(JobParameters jobParameters) {
        String str = "EXTRA_WORK_SPEC_ID";
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras != null && extras.containsKey(str)) {
                return extras.getString(str);
            }
        } catch (NullPointerException unused) {
        }
        return null;
    }

    /* renamed from: a */
    public void mo1480a(String str, boolean z) {
        JobParameters jobParameters;
        C1800l.m4460a().mo6782a(f1007g, String.format("%s executed on JobScheduler", new Object[]{str}), new Throwable[0]);
        synchronized (this.f1009f) {
            jobParameters = (JobParameters) this.f1009f.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    public void onCreate() {
        super.onCreate();
        try {
            C1842l a = C1842l.m4517a(getApplicationContext());
            this.f1008e = a;
            a.f5353f.mo6798a((C1823b) this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                C1800l.m4460a().mo6785d(f1007g, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C1842l lVar = this.f1008e;
        if (lVar != null) {
            lVar.f5353f.mo6801b((C1823b) this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0071, code lost:
        if (android.os.Build.VERSION.SDK_INT < 24) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0073, code lost:
        r2 = new androidx.work.WorkerParameters.C0182a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007c, code lost:
        if (r9.getTriggeredContentUris() == null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007e, code lost:
        java.util.Arrays.asList(r9.getTriggeredContentUris());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0089, code lost:
        if (r9.getTriggeredContentAuthorities() == null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008b, code lost:
        java.util.Arrays.asList(r9.getTriggeredContentAuthorities());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0096, code lost:
        if (android.os.Build.VERSION.SDK_INT < 28) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0098, code lost:
        r9.getNetwork();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009b, code lost:
        r9 = r8.f1008e;
        r3 = r9.f5351d;
        ((p124p.p199y.p200x.p210t.p212q.C1963b) r3).f5626a.execute(new p124p.p199y.p200x.p210t.C1940j(r9, r0, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ab, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStartJob(android.app.job.JobParameters r9) {
        /*
            r8 = this;
            p.y.x.l r0 = r8.f1008e
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0017
            p.y.l r0 = p124p.p199y.C1800l.m4460a()
            java.lang.String r3 = f1007g
            java.lang.Throwable[] r4 = new java.lang.Throwable[r2]
            java.lang.String r5 = "WorkManager is not initialized; requesting retry."
            r0.mo6782a(r3, r5, r4)
            r8.jobFinished(r9, r1)
            return r2
        L_0x0017:
            java.lang.String r0 = m853a(r9)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x002f
            p.y.l r9 = p124p.p199y.C1800l.m4460a()
            java.lang.String r0 = f1007g
            java.lang.Throwable[] r1 = new java.lang.Throwable[r2]
            java.lang.String r3 = "WorkSpec id not found!"
            r9.mo6783b(r0, r3, r1)
            return r2
        L_0x002f:
            java.util.Map<java.lang.String, android.app.job.JobParameters> r3 = r8.f1009f
            monitor-enter(r3)
            java.util.Map<java.lang.String, android.app.job.JobParameters> r4 = r8.f1009f     // Catch:{ all -> 0x00ac }
            boolean r4 = r4.containsKey(r0)     // Catch:{ all -> 0x00ac }
            if (r4 == 0) goto L_0x0051
            p.y.l r9 = p124p.p199y.C1800l.m4460a()     // Catch:{ all -> 0x00ac }
            java.lang.String r4 = f1007g     // Catch:{ all -> 0x00ac }
            java.lang.String r5 = "Job is already being executed by SystemJobService: %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00ac }
            r1[r2] = r0     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = java.lang.String.format(r5, r1)     // Catch:{ all -> 0x00ac }
            java.lang.Throwable[] r1 = new java.lang.Throwable[r2]     // Catch:{ all -> 0x00ac }
            r9.mo6782a(r4, r0, r1)     // Catch:{ all -> 0x00ac }
            monitor-exit(r3)     // Catch:{ all -> 0x00ac }
            return r2
        L_0x0051:
            p.y.l r4 = p124p.p199y.C1800l.m4460a()     // Catch:{ all -> 0x00ac }
            java.lang.String r5 = f1007g     // Catch:{ all -> 0x00ac }
            java.lang.String r6 = "onStartJob for %s"
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ all -> 0x00ac }
            r7[r2] = r0     // Catch:{ all -> 0x00ac }
            java.lang.String r6 = java.lang.String.format(r6, r7)     // Catch:{ all -> 0x00ac }
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]     // Catch:{ all -> 0x00ac }
            r4.mo6782a(r5, r6, r2)     // Catch:{ all -> 0x00ac }
            java.util.Map<java.lang.String, android.app.job.JobParameters> r2 = r8.f1009f     // Catch:{ all -> 0x00ac }
            r2.put(r0, r9)     // Catch:{ all -> 0x00ac }
            monitor-exit(r3)     // Catch:{ all -> 0x00ac }
            r2 = 0
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r3 < r4) goto L_0x009b
            androidx.work.WorkerParameters$a r2 = new androidx.work.WorkerParameters$a
            r2.<init>()
            android.net.Uri[] r3 = r9.getTriggeredContentUris()
            if (r3 == 0) goto L_0x0085
            android.net.Uri[] r3 = r9.getTriggeredContentUris()
            java.util.Arrays.asList(r3)
        L_0x0085:
            java.lang.String[] r3 = r9.getTriggeredContentAuthorities()
            if (r3 == 0) goto L_0x0092
            java.lang.String[] r3 = r9.getTriggeredContentAuthorities()
            java.util.Arrays.asList(r3)
        L_0x0092:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r3 < r4) goto L_0x009b
            r9.getNetwork()
        L_0x009b:
            p.y.x.l r9 = r8.f1008e
            p.y.x.t.q.a r3 = r9.f5351d
            p.y.x.t.j r4 = new p.y.x.t.j
            r4.<init>(r9, r0, r2)
            p.y.x.t.q.b r3 = (p124p.p199y.p200x.p210t.p212q.C1963b) r3
            p.y.x.t.i r9 = r3.f5626a
            r9.execute(r4)
            return r1
        L_0x00ac:
            r9 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00ac }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f1008e == null) {
            C1800l.m4460a().mo6782a(f1007g, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String a = m853a(jobParameters);
        if (TextUtils.isEmpty(a)) {
            C1800l.m4460a().mo6783b(f1007g, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        C1800l.m4460a().mo6782a(f1007g, String.format("onStopJob for %s", new Object[]{a}), new Throwable[0]);
        synchronized (this.f1009f) {
            this.f1009f.remove(a);
        }
        this.f1008e.mo6815a(a);
        return !this.f1008e.f5353f.mo6799a(a);
    }
}
