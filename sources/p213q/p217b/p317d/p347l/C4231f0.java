package p213q.p217b.p317d.p347l;

import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
import p213q.p217b.p218a.p231b.p269k.C3237a;

/* renamed from: q.b.d.l.f0 */
public final class C4231f0 {

    /* renamed from: a */
    public static final long f10198a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b */
    public static final Object f10199b = new Object();
    @GuardedBy("WakeLockHolder.syncObject")

    /* renamed from: c */
    public static C3237a f10200c;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        return r4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.ComponentName m9723a(android.content.Context r4, android.content.Intent r5) {
        /*
            java.lang.Object r0 = f10199b
            monitor-enter(r0)
            q.b.a.b.k.a r1 = f10200c     // Catch:{ all -> 0x0038 }
            r2 = 1
            if (r1 != 0) goto L_0x0018
            q.b.a.b.k.a r1 = new q.b.a.b.k.a     // Catch:{ all -> 0x0038 }
            java.lang.String r3 = "wake:com.google.firebase.iid.WakeLockHolder"
            r1.<init>(r4, r2, r3)     // Catch:{ all -> 0x0038 }
            f10200c = r1     // Catch:{ all -> 0x0038 }
            android.os.PowerManager$WakeLock r3 = r1.f8101b     // Catch:{ all -> 0x0038 }
            r3.setReferenceCounted(r2)     // Catch:{ all -> 0x0038 }
            r1.f8107h = r2     // Catch:{ all -> 0x0038 }
        L_0x0018:
            java.lang.String r1 = "com.google.firebase.iid.WakeLockHolder.wakefulintent"
            r3 = 0
            boolean r1 = r5.getBooleanExtra(r1, r3)     // Catch:{ all -> 0x0038 }
            java.lang.String r3 = "com.google.firebase.iid.WakeLockHolder.wakefulintent"
            r5.putExtra(r3, r2)     // Catch:{ all -> 0x0038 }
            android.content.ComponentName r4 = r4.startService(r5)     // Catch:{ all -> 0x0038 }
            if (r4 != 0) goto L_0x002d
            r4 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            return r4
        L_0x002d:
            if (r1 != 0) goto L_0x0036
            q.b.a.b.k.a r5 = f10200c     // Catch:{ all -> 0x0038 }
            long r1 = f10198a     // Catch:{ all -> 0x0038 }
            r5.mo8911a(r1)     // Catch:{ all -> 0x0038 }
        L_0x0036:
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            return r4
        L_0x0038:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p317d.p347l.C4231f0.m9723a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }
}
