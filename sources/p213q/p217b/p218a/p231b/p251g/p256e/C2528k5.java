package p213q.p217b.p218a.p231b.p251g.p256e;

import android.annotation.TargetApi;
import android.app.job.JobScheduler;
import java.lang.reflect.Method;

@TargetApi(24)
/* renamed from: q.b.a.b.g.e.k5 */
public final class C2528k5 {

    /* renamed from: b */
    public static final Method f6684b;

    /* renamed from: c */
    public static final Method f6685c;

    /* renamed from: a */
    public final JobScheduler f6686a;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    static {
        /*
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.String r2 = "JobSchedulerCompat"
            r3 = 6
            r4 = 0
            r5 = 24
            if (r1 < r5) goto L_0x0033
            java.lang.Class<android.app.job.JobScheduler> r1 = android.app.job.JobScheduler.class
            java.lang.String r6 = "scheduleAsPackage"
            r7 = 4
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch:{ NoSuchMethodException -> 0x0028 }
            r8 = 0
            java.lang.Class<android.app.job.JobInfo> r9 = android.app.job.JobInfo.class
            r7[r8] = r9     // Catch:{ NoSuchMethodException -> 0x0028 }
            r8 = 1
            r7[r8] = r0     // Catch:{ NoSuchMethodException -> 0x0028 }
            r8 = 2
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x0028 }
            r7[r8] = r9     // Catch:{ NoSuchMethodException -> 0x0028 }
            r8 = 3
            r7[r8] = r0     // Catch:{ NoSuchMethodException -> 0x0028 }
            java.lang.reflect.Method r0 = r1.getDeclaredMethod(r6, r7)     // Catch:{ NoSuchMethodException -> 0x0028 }
            goto L_0x0034
        L_0x0028:
            boolean r0 = android.util.Log.isLoggable(r2, r3)
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = "No scheduleAsPackage method available, falling back to schedule"
            android.util.Log.e(r2, r0)
        L_0x0033:
            r0 = r4
        L_0x0034:
            f6684b = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r5) goto L_0x004e
            java.lang.Class<android.os.UserHandle> r0 = android.os.UserHandle.class
            java.lang.String r1 = "myUserId"
            java.lang.reflect.Method r4 = r0.getDeclaredMethod(r1, r4)     // Catch:{ NoSuchMethodException -> 0x0043 }
            goto L_0x004e
        L_0x0043:
            boolean r0 = android.util.Log.isLoggable(r2, r3)
            if (r0 == 0) goto L_0x004e
            java.lang.String r0 = "No myUserId method available"
            android.util.Log.e(r2, r0)
        L_0x004e:
            f6685c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p251g.p256e.C2528k5.<clinit>():void");
    }

    public C2528k5(JobScheduler jobScheduler) {
        this.f6686a = jobScheduler;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043 A[SYNTHETIC, Splitter:B:16:0x0043] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m6084a(android.content.Context r5, android.app.job.JobInfo r6, java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "jobscheduler"
            java.lang.Object r0 = r5.getSystemService(r0)
            android.app.job.JobScheduler r0 = (android.app.job.JobScheduler) r0
            java.lang.reflect.Method r1 = f6684b
            if (r1 == 0) goto L_0x0071
            java.lang.String r1 = "android.permission.UPDATE_DEVICE_STATS"
            int r5 = r5.checkSelfPermission(r1)
            if (r5 == 0) goto L_0x0015
            goto L_0x0071
        L_0x0015:
            q.b.a.b.g.e.k5 r5 = new q.b.a.b.g.e.k5
            r5.<init>(r0)
            java.lang.reflect.Method r0 = f6685c
            r1 = 0
            if (r0 == 0) goto L_0x003e
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ IllegalAccessException -> 0x002f, InvocationTargetException -> 0x002d }
            java.lang.Object r0 = r0.invoke(r2, r3)     // Catch:{ IllegalAccessException -> 0x002f, InvocationTargetException -> 0x002d }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ IllegalAccessException -> 0x002f, InvocationTargetException -> 0x002d }
            int r0 = r0.intValue()     // Catch:{ IllegalAccessException -> 0x002f, InvocationTargetException -> 0x002d }
            goto L_0x003f
        L_0x002d:
            r0 = move-exception
            goto L_0x0030
        L_0x002f:
            r0 = move-exception
        L_0x0030:
            r2 = 6
            java.lang.String r3 = "JobSchedulerCompat"
            boolean r2 = android.util.Log.isLoggable(r3, r2)
            if (r2 == 0) goto L_0x003e
            java.lang.String r2 = "myUserId invocation illegal"
            android.util.Log.e(r3, r2, r0)
        L_0x003e:
            r0 = r1
        L_0x003f:
            java.lang.reflect.Method r2 = f6684b
            if (r2 == 0) goto L_0x006a
            android.app.job.JobScheduler r3 = r5.f6686a     // Catch:{ IllegalAccessException -> 0x0064, InvocationTargetException -> 0x0062 }
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IllegalAccessException -> 0x0064, InvocationTargetException -> 0x0062 }
            r4[r1] = r6     // Catch:{ IllegalAccessException -> 0x0064, InvocationTargetException -> 0x0062 }
            r1 = 1
            r4[r1] = r7     // Catch:{ IllegalAccessException -> 0x0064, InvocationTargetException -> 0x0062 }
            r7 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalAccessException -> 0x0064, InvocationTargetException -> 0x0062 }
            r4[r7] = r0     // Catch:{ IllegalAccessException -> 0x0064, InvocationTargetException -> 0x0062 }
            r7 = 3
            r4[r7] = r8     // Catch:{ IllegalAccessException -> 0x0064, InvocationTargetException -> 0x0062 }
            java.lang.Object r7 = r2.invoke(r3, r4)     // Catch:{ IllegalAccessException -> 0x0064, InvocationTargetException -> 0x0062 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ IllegalAccessException -> 0x0064, InvocationTargetException -> 0x0062 }
            int r5 = r7.intValue()     // Catch:{ IllegalAccessException -> 0x0064, InvocationTargetException -> 0x0062 }
            goto L_0x0070
        L_0x0062:
            r7 = move-exception
            goto L_0x0065
        L_0x0064:
            r7 = move-exception
        L_0x0065:
            java.lang.String r0 = "error calling scheduleAsPackage"
            android.util.Log.e(r8, r0, r7)
        L_0x006a:
            android.app.job.JobScheduler r5 = r5.f6686a
            int r5 = r5.schedule(r6)
        L_0x0070:
            return r5
        L_0x0071:
            int r5 = r0.schedule(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p251g.p256e.C2528k5.m6084a(android.content.Context, android.app.job.JobInfo, java.lang.String, java.lang.String):int");
    }
}
