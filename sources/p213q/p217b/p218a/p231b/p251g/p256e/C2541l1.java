package p213q.p217b.p218a.p231b.p251g.p256e;

import android.os.Build.VERSION;
import android.os.UserManager;

/* renamed from: q.b.a.b.g.e.l1 */
public class C2541l1 {

    /* renamed from: a */
    public static UserManager f6699a;

    /* renamed from: b */
    public static volatile boolean f6700b = (!m6100a());

    /* renamed from: a */
    public static boolean m6100a() {
        return VERSION.SDK_INT >= 24;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        if (r3.isUserRunning(android.os.Process.myUserHandle()) != false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0046, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0050, code lost:
        return r1;
     */
    @android.annotation.TargetApi(24)
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m6101a(android.content.Context r7) {
        /*
            boolean r0 = f6700b
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.Class<q.b.a.b.g.e.l1> r0 = p213q.p217b.p218a.p231b.p251g.p256e.C2541l1.class
            monitor-enter(r0)
            boolean r2 = f6700b     // Catch:{ all -> 0x0051 }
            if (r2 == 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            return r1
        L_0x000f:
            r2 = r1
        L_0x0010:
            r3 = 2
            r4 = 0
            r5 = 0
            if (r2 > r3) goto L_0x0046
            android.os.UserManager r3 = f6699a     // Catch:{ all -> 0x0051 }
            if (r3 != 0) goto L_0x0023
            java.lang.Class<android.os.UserManager> r3 = android.os.UserManager.class
            java.lang.Object r3 = r7.getSystemService(r3)     // Catch:{ all -> 0x0051 }
            android.os.UserManager r3 = (android.os.UserManager) r3     // Catch:{ all -> 0x0051 }
            f6699a = r3     // Catch:{ all -> 0x0051 }
        L_0x0023:
            android.os.UserManager r3 = f6699a     // Catch:{ all -> 0x0051 }
            if (r3 != 0) goto L_0x0028
            goto L_0x004b
        L_0x0028:
            boolean r6 = r3.isUserUnlocked()     // Catch:{ NullPointerException -> 0x0039 }
            if (r6 != 0) goto L_0x0047
            android.os.UserHandle r6 = android.os.Process.myUserHandle()     // Catch:{ NullPointerException -> 0x0039 }
            boolean r7 = r3.isUserRunning(r6)     // Catch:{ NullPointerException -> 0x0039 }
            if (r7 != 0) goto L_0x0046
            goto L_0x0047
        L_0x0039:
            r3 = move-exception
            java.lang.String r5 = "DirectBootUtils"
            java.lang.String r6 = "Failed to check if user is unlocked."
            android.util.Log.w(r5, r6, r3)     // Catch:{ all -> 0x0051 }
            f6699a = r4     // Catch:{ all -> 0x0051 }
            int r2 = r2 + 1
            goto L_0x0010
        L_0x0046:
            r1 = r5
        L_0x0047:
            if (r1 == 0) goto L_0x004b
            f6699a = r4     // Catch:{ all -> 0x0051 }
        L_0x004b:
            if (r1 == 0) goto L_0x004f
            f6700b = r1     // Catch:{ all -> 0x0051 }
        L_0x004f:
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            return r1
        L_0x0051:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p251g.p256e.C2541l1.m6101a(android.content.Context):boolean");
    }
}
