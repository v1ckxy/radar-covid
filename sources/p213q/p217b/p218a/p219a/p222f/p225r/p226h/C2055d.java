package p213q.p217b.p218a.p219a.p222f.p225r.p226h;

import android.content.Context;
import p213q.p217b.p218a.p219a.p222f.p225r.p227i.C2076c;

/* renamed from: q.b.a.a.f.r.h.d */
public class C2055d implements C2072r {

    /* renamed from: a */
    public final Context f5860a;

    /* renamed from: b */
    public final C2076c f5861b;

    /* renamed from: c */
    public final C2057f f5862c;

    public C2055d(Context context, C2076c cVar, C2057f fVar) {
        this.f5860a = context;
        this.f5861b = cVar;
        this.f5862c = fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x008d, code lost:
        r6 = false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7043a(p213q.p217b.p218a.p219a.p222f.C2018i r18, int r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            android.content.ComponentName r3 = new android.content.ComponentName
            android.content.Context r4 = r0.f5860a
            java.lang.Class<com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService> r5 = com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService.class
            r3.<init>(r4, r5)
            android.content.Context r4 = r0.f5860a
            java.lang.String r5 = "jobscheduler"
            java.lang.Object r4 = r4.getSystemService(r5)
            android.app.job.JobScheduler r4 = (android.app.job.JobScheduler) r4
            java.util.zip.Adler32 r5 = new java.util.zip.Adler32
            r5.<init>()
            android.content.Context r6 = r0.f5860a
            java.lang.String r6 = r6.getPackageName()
            java.lang.String r7 = "UTF-8"
            java.nio.charset.Charset r8 = java.nio.charset.Charset.forName(r7)
            byte[] r6 = r6.getBytes(r8)
            r5.update(r6)
            r6 = r1
            q.b.a.a.f.b r6 = (p213q.p217b.p218a.p219a.p222f.C2006b) r6
            java.lang.String r8 = r6.f5762a
            java.nio.charset.Charset r7 = java.nio.charset.Charset.forName(r7)
            byte[] r7 = r8.getBytes(r7)
            r5.update(r7)
            r7 = 4
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r7)
            q.b.a.a.b r9 = r6.f5764c
            int r9 = p213q.p217b.p218a.p219a.p222f.p230u.C2104a.m4891a(r9)
            java.nio.ByteBuffer r8 = r8.putInt(r9)
            byte[] r8 = r8.array()
            r5.update(r8)
            byte[] r6 = r6.f5763b
            if (r6 == 0) goto L_0x005e
            r5.update(r6)
        L_0x005e:
            long r5 = r5.getValue()
            int r5 = (int) r5
            java.util.List r6 = r4.getAllPendingJobs()
            java.util.Iterator r6 = r6.iterator()
        L_0x006b:
            boolean r8 = r6.hasNext()
            java.lang.String r9 = "attemptNumber"
            r10 = 1
            r11 = 0
            if (r8 == 0) goto L_0x008d
            java.lang.Object r8 = r6.next()
            android.app.job.JobInfo r8 = (android.app.job.JobInfo) r8
            android.os.PersistableBundle r12 = r8.getExtras()
            int r12 = r12.getInt(r9)
            int r8 = r8.getId()
            if (r8 != r5) goto L_0x006b
            if (r12 < r2) goto L_0x008d
            r6 = r10
            goto L_0x008e
        L_0x008d:
            r6 = r11
        L_0x008e:
            java.lang.String r8 = "JobInfoScheduler"
            if (r6 == 0) goto L_0x0098
            java.lang.String r2 = "Upload for context %s is already scheduled. Returning..."
            p124p.p126b.p127k.C1061o.m2499a(r8, r2, r1)
            return
        L_0x0098:
            q.b.a.a.f.r.i.c r6 = r0.f5861b
            long r12 = r6.mo7059b(r1)
            q.b.a.a.f.r.h.f r6 = r0.f5862c
            android.app.job.JobInfo$Builder r14 = new android.app.job.JobInfo$Builder
            r14.<init>(r5, r3)
            r3 = r1
            q.b.a.a.f.b r3 = (p213q.p217b.p218a.p219a.p222f.C2006b) r3
            q.b.a.a.b r15 = r3.f5764c
            r16 = r8
            long r7 = r6.mo7045a(r15, r12, r2)
            r14.setMinimumLatency(r7)
            q.b.a.a.f.r.h.b r6 = (p213q.p217b.p218a.p219a.p222f.p225r.p226h.C2051b) r6
            java.util.Map<q.b.a.a.b, q.b.a.a.f.r.h.f$a> r6 = r6.f5853b
            java.lang.Object r6 = r6.get(r15)
            q.b.a.a.f.r.h.f$a r6 = (p213q.p217b.p218a.p219a.p222f.p225r.p226h.C2057f.C2058a) r6
            q.b.a.a.f.r.h.c r6 = (p213q.p217b.p218a.p219a.p222f.p225r.p226h.C2052c) r6
            java.util.Set<q.b.a.a.f.r.h.f$b> r6 = r6.f5856c
            q.b.a.a.f.r.h.f$b r7 = p213q.p217b.p218a.p219a.p222f.p225r.p226h.C2057f.C2060b.NETWORK_UNMETERED
            boolean r7 = r6.contains(r7)
            r8 = 2
            if (r7 == 0) goto L_0x00ce
            r14.setRequiredNetworkType(r8)
            goto L_0x00d1
        L_0x00ce:
            r14.setRequiredNetworkType(r10)
        L_0x00d1:
            q.b.a.a.f.r.h.f$b r7 = p213q.p217b.p218a.p219a.p222f.p225r.p226h.C2057f.C2060b.DEVICE_CHARGING
            boolean r7 = r6.contains(r7)
            if (r7 == 0) goto L_0x00dc
            r14.setRequiresCharging(r10)
        L_0x00dc:
            q.b.a.a.f.r.h.f$b r7 = p213q.p217b.p218a.p219a.p222f.p225r.p226h.C2057f.C2060b.DEVICE_IDLE
            boolean r6 = r6.contains(r7)
            if (r6 == 0) goto L_0x00e7
            r14.setRequiresDeviceIdle(r10)
        L_0x00e7:
            android.os.PersistableBundle r6 = new android.os.PersistableBundle
            r6.<init>()
            r6.putInt(r9, r2)
            java.lang.String r7 = r3.f5762a
            java.lang.String r9 = "backendName"
            r6.putString(r9, r7)
            q.b.a.a.b r7 = r3.f5764c
            int r7 = p213q.p217b.p218a.p219a.p222f.p230u.C2104a.m4891a(r7)
            java.lang.String r9 = "priority"
            r6.putInt(r9, r7)
            byte[] r7 = r3.f5763b
            if (r7 == 0) goto L_0x010e
            java.lang.String r7 = android.util.Base64.encodeToString(r7, r11)
            java.lang.String r9 = "extras"
            r6.putString(r9, r7)
        L_0x010e:
            r14.setExtras(r6)
            r6 = 5
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r11] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r6[r10] = r1
            q.b.a.a.f.r.h.f r1 = r0.f5862c
            q.b.a.a.b r3 = r3.f5764c
            long r9 = r1.mo7045a(r3, r12, r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r9)
            r6[r8] = r1
            r1 = 3
            java.lang.Long r3 = java.lang.Long.valueOf(r12)
            r6[r1] = r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            r2 = 4
            r6[r2] = r1
            java.lang.String r1 = "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d"
            r2 = r16
            p124p.p126b.p127k.C1061o.m2501a(r2, r1, r6)
            android.app.job.JobInfo r1 = r14.build()
            r4.schedule(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p219a.p222f.p225r.p226h.C2055d.mo7043a(q.b.a.a.f.i, int):void");
    }
}
