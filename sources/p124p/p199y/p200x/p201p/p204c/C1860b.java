package p124p.p199y.p200x.p201p.p204c;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p124p.p199y.C1800l;
import p124p.p199y.C1816t;
import p124p.p199y.p200x.C1827e;
import p124p.p199y.p200x.C1842l;
import p124p.p199y.p200x.p209s.C1898g;
import p124p.p199y.p200x.p209s.C1900i;
import p124p.p199y.p200x.p209s.C1913p;
import p124p.p199y.p200x.p209s.C1916r;
import p124p.p199y.p200x.p210t.C1935f;

/* renamed from: p.y.x.p.c.b */
public class C1860b implements C1827e {

    /* renamed from: i */
    public static final String f5444i = C1800l.m4459a("SystemJobScheduler");

    /* renamed from: e */
    public final Context f5445e;

    /* renamed from: f */
    public final JobScheduler f5446f;

    /* renamed from: g */
    public final C1842l f5447g;

    /* renamed from: h */
    public final C1859a f5448h;

    public C1860b(Context context, C1842l lVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        C1859a aVar = new C1859a(context);
        this.f5445e = context;
        this.f5447g = lVar;
        this.f5446f = jobScheduler;
        this.f5448h = aVar;
    }

    /* renamed from: a */
    public static String m4569a(JobInfo jobInfo) {
        String str = "EXTRA_WORK_SPEC_ID";
        PersistableBundle extras = jobInfo.getExtras();
        if (extras != null) {
            try {
                if (extras.containsKey(str)) {
                    return extras.getString(str);
                }
            } catch (NullPointerException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static List<JobInfo> m4570a(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            C1800l.m4460a().mo6783b(f5444i, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<Integer> m4571a(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> a = m4570a(context, jobScheduler);
        if (a == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : a) {
            if (str.equals(m4569a(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m4572a(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            C1800l.m4460a().mo6783b(f5444i, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[]{Integer.valueOf(i)}), th);
        }
    }

    /* renamed from: a */
    public static void m4573a(Context context) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            List<JobInfo> a = m4570a(context, jobScheduler);
            if (a != null && !a.isEmpty()) {
                for (JobInfo id : a) {
                    m4572a(jobScheduler, id.getId());
                }
            }
        }
    }

    /* renamed from: b */
    public static void m4574b(Context context) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            List<JobInfo> a = m4570a(context, jobScheduler);
            if (a != null && !a.isEmpty()) {
                for (JobInfo jobInfo : a) {
                    if (m4569a(jobInfo) == null) {
                        m4572a(jobScheduler, jobInfo.getId());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo6809a(String str) {
        List<Integer> a = m4571a(this.f5445e, this.f5446f, str);
        if (a != null && !a.isEmpty()) {
            for (Integer intValue : a) {
                m4572a(this.f5446f, intValue.intValue());
            }
            ((C1900i) this.f5447g.f5350c.mo1459j()).mo6890b(str);
        }
    }

    /* renamed from: a */
    public boolean mo6811a() {
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo6810a(C1913p... pVarArr) {
        int i;
        int i2;
        WorkDatabase workDatabase = this.f5447g.f5350c;
        C1935f fVar = new C1935f(workDatabase);
        int length = pVarArr.length;
        int i3 = 0;
        while (i3 < length) {
            C1913p pVar = pVarArr[i3];
            workDatabase.mo6416c();
            try {
                C1913p e = ((C1916r) workDatabase.mo1462m()).mo6914e(pVar.f5527a);
                String str = "Skipping scheduling ";
                if (e == null) {
                    C1800l a = C1800l.m4460a();
                    String str2 = f5444i;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(pVar.f5527a);
                    sb.append(" because it's no longer in the DB");
                    a.mo6785d(str2, sb.toString(), new Throwable[0]);
                } else if (e.f5528b != C1816t.ENQUEUED) {
                    C1800l a2 = C1800l.m4460a();
                    String str3 = f5444i;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(pVar.f5527a);
                    sb2.append(" because it is no longer enqueued");
                    a2.mo6785d(str3, sb2.toString(), new Throwable[0]);
                } else {
                    C1898g a3 = ((C1900i) workDatabase.mo1459j()).mo6888a(pVar.f5527a);
                    if (a3 != null) {
                        i = a3.f5513b;
                    } else {
                        i = fVar.mo6925a(this.f5447g.f5349b.f5231g, this.f5447g.f5349b.f5232h);
                    }
                    if (a3 == null) {
                        ((C1900i) this.f5447g.f5350c.mo1459j()).mo6889a(new C1898g(pVar.f5527a, i));
                    }
                    mo6848a(pVar, i);
                    if (VERSION.SDK_INT == 23) {
                        List a4 = m4571a(this.f5445e, this.f5446f, pVar.f5527a);
                        if (a4 != null) {
                            int indexOf = a4.indexOf(Integer.valueOf(i));
                            if (indexOf >= 0) {
                                a4.remove(indexOf);
                            }
                            if (!a4.isEmpty()) {
                                i2 = ((Integer) a4.get(0)).intValue();
                            } else {
                                i2 = fVar.mo6925a(this.f5447g.f5349b.f5231g, this.f5447g.f5349b.f5232h);
                            }
                            mo6848a(pVar, i2);
                        }
                    }
                }
                workDatabase.mo6420g();
                workDatabase.mo6417d();
                i3++;
            } catch (Throwable th) {
                workDatabase.mo6417d();
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if (android.os.Build.VERSION.SDK_INT < 26) goto L_0x002f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6848a(p124p.p199y.p200x.p209s.C1913p r17, int r18) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            p.y.x.p.c.a r0 = r1.f5448h
            if (r0 == 0) goto L_0x019f
            p.y.c r3 = r2.f5536j
            p.y.m r4 = r3.f5244a
            int r5 = r4.ordinal()
            r6 = 26
            r7 = 24
            r8 = 2
            r9 = 1
            r10 = 0
            r11 = 3
            if (r5 == 0) goto L_0x0049
            if (r5 == r9) goto L_0x0047
            if (r5 == r8) goto L_0x0045
            if (r5 == r11) goto L_0x0029
            r12 = 4
            if (r5 == r12) goto L_0x0024
            goto L_0x002f
        L_0x0024:
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r6) goto L_0x002f
            goto L_0x004a
        L_0x0029:
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r7) goto L_0x002f
            r12 = r11
            goto L_0x004a
        L_0x002f:
            p.y.l r5 = p124p.p199y.C1800l.m4460a()
            java.lang.String r12 = p124p.p199y.p200x.p201p.p204c.C1859a.f5442b
            java.lang.Object[] r13 = new java.lang.Object[r9]
            r13[r10] = r4
            java.lang.String r4 = "API version too low. Cannot convert network type value %s"
            java.lang.String r4 = java.lang.String.format(r4, r13)
            java.lang.Throwable[] r13 = new java.lang.Throwable[r10]
            r5.mo6782a(r12, r4, r13)
            goto L_0x0047
        L_0x0045:
            r12 = r8
            goto L_0x004a
        L_0x0047:
            r12 = r9
            goto L_0x004a
        L_0x0049:
            r12 = r10
        L_0x004a:
            android.os.PersistableBundle r4 = new android.os.PersistableBundle
            r4.<init>()
            java.lang.String r5 = r2.f5527a
            java.lang.String r13 = "EXTRA_WORK_SPEC_ID"
            r4.putString(r13, r5)
            boolean r5 = r17.mo6895c()
            java.lang.String r13 = "EXTRA_IS_PERIODIC"
            r4.putBoolean(r13, r5)
            android.app.job.JobInfo$Builder r5 = new android.app.job.JobInfo$Builder
            android.content.ComponentName r0 = r0.f5443a
            r13 = r18
            r5.<init>(r13, r0)
            android.app.job.JobInfo$Builder r0 = r5.setRequiredNetworkType(r12)
            boolean r5 = r3.f5245b
            android.app.job.JobInfo$Builder r0 = r0.setRequiresCharging(r5)
            boolean r5 = r3.f5246c
            android.app.job.JobInfo$Builder r0 = r0.setRequiresDeviceIdle(r5)
            android.app.job.JobInfo$Builder r0 = r0.setExtras(r4)
            boolean r4 = r3.f5246c
            if (r4 != 0) goto L_0x008e
            p.y.a r4 = r2.f5538l
            p.y.a r5 = p124p.p199y.C1784a.LINEAR
            if (r4 != r5) goto L_0x0088
            r4 = r10
            goto L_0x0089
        L_0x0088:
            r4 = r9
        L_0x0089:
            long r14 = r2.f5539m
            r0.setBackoffCriteria(r14, r4)
        L_0x008e:
            long r4 = r17.mo6893a()
            long r14 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r14
            r14 = 0
            long r4 = java.lang.Math.max(r4, r14)
            int r12 = android.os.Build.VERSION.SDK_INT
            r11 = 28
            if (r12 > r11) goto L_0x00a4
            goto L_0x00a8
        L_0x00a4:
            int r11 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r11 <= 0) goto L_0x00ac
        L_0x00a8:
            r0.setMinimumLatency(r4)
            goto L_0x00af
        L_0x00ac:
            r0.setImportantWhileForeground(r9)
        L_0x00af:
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r7) goto L_0x00eb
            p.y.d r4 = r3.f5251h
            int r4 = r4.mo6769a()
            if (r4 <= 0) goto L_0x00bd
            r4 = r9
            goto L_0x00be
        L_0x00bd:
            r4 = r10
        L_0x00be:
            if (r4 == 0) goto L_0x00eb
            p.y.d r4 = r3.f5251h
            java.util.Set<p.y.d$a> r4 = r4.f5260a
            java.util.Iterator r4 = r4.iterator()
        L_0x00c8:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00e1
            java.lang.Object r5 = r4.next()
            p.y.d$a r5 = (p124p.p199y.C1790d.C1791a) r5
            boolean r7 = r5.f5262b
            android.app.job.JobInfo$TriggerContentUri r11 = new android.app.job.JobInfo$TriggerContentUri
            android.net.Uri r5 = r5.f5261a
            r11.<init>(r5, r7)
            r0.addTriggerContentUri(r11)
            goto L_0x00c8
        L_0x00e1:
            long r4 = r3.f5249f
            r0.setTriggerContentUpdateDelay(r4)
            long r4 = r3.f5250g
            r0.setTriggerContentMaxDelay(r4)
        L_0x00eb:
            r0.setPersisted(r10)
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r6) goto L_0x00fc
            boolean r4 = r3.f5247d
            r0.setRequiresBatteryNotLow(r4)
            boolean r3 = r3.f5248e
            r0.setRequiresStorageNotLow(r3)
        L_0x00fc:
            android.app.job.JobInfo r0 = r0.build()
            p.y.l r3 = p124p.p199y.C1800l.m4460a()
            java.lang.String r4 = f5444i
            java.lang.Object[] r5 = new java.lang.Object[r8]
            java.lang.String r6 = r2.f5527a
            r5[r10] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r18)
            r5[r9] = r6
            java.lang.String r6 = "Scheduling work ID %s Job ID %s"
            java.lang.String r5 = java.lang.String.format(r6, r5)
            java.lang.Throwable[] r6 = new java.lang.Throwable[r10]
            r3.mo6782a(r4, r5, r6)
            android.app.job.JobScheduler r3 = r1.f5446f     // Catch:{ IllegalStateException -> 0x013c, all -> 0x0123 }
            r3.schedule(r0)     // Catch:{ IllegalStateException -> 0x013c, all -> 0x0123 }
            goto L_0x013b
        L_0x0123:
            r0 = move-exception
            p.y.l r3 = p124p.p199y.C1800l.m4460a()
            java.lang.String r4 = f5444i
            java.lang.Object[] r5 = new java.lang.Object[r9]
            r5[r10] = r2
            java.lang.String r2 = "Unable to schedule %s"
            java.lang.String r2 = java.lang.String.format(r2, r5)
            java.lang.Throwable[] r5 = new java.lang.Throwable[r9]
            r5[r10] = r0
            r3.mo6783b(r4, r2, r5)
        L_0x013b:
            return
        L_0x013c:
            r0 = move-exception
            android.content.Context r2 = r1.f5445e
            android.app.job.JobScheduler r3 = r1.f5446f
            java.util.List r2 = m4570a(r2, r3)
            if (r2 == 0) goto L_0x014c
            int r2 = r2.size()
            goto L_0x014d
        L_0x014c:
            r2 = r10
        L_0x014d:
            java.util.Locale r3 = java.util.Locale.getDefault()
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4[r10] = r2
            p.y.x.l r2 = r1.f5447g
            androidx.work.impl.WorkDatabase r2 = r2.f5350c
            p.y.x.s.q r2 = r2.mo1462m()
            p.y.x.s.r r2 = (p124p.p199y.p200x.p209s.C1916r) r2
            java.util.List r2 = r2.mo6912d()
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4[r9] = r2
            p.y.x.l r2 = r1.f5447g
            p.y.b r2 = r2.f5349b
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 23
            int r2 = r2.f5233i
            if (r5 != r6) goto L_0x0182
            int r2 = r2 / 2
        L_0x0182:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4[r8] = r2
            java.lang.String r2 = "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d."
            java.lang.String r2 = java.lang.String.format(r3, r2, r4)
            p.y.l r3 = p124p.p199y.C1800l.m4460a()
            java.lang.String r4 = f5444i
            java.lang.Throwable[] r5 = new java.lang.Throwable[r10]
            r3.mo6783b(r4, r2, r5)
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>(r2, r0)
            throw r3
        L_0x019f:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p199y.p200x.p201p.p204c.C1860b.mo6848a(p.y.x.s.p, int):void");
    }
}
