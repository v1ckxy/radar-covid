package p213q.p217b.p218a.p231b.p269k;

import android.content.Context;
import android.os.PowerManager.WakeLock;
import android.os.WorkSource;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* renamed from: q.b.a.b.k.a */
public class C3237a {

    /* renamed from: l */
    public static ScheduledExecutorService f8099l;

    /* renamed from: a */
    public final Object f8100a;

    /* renamed from: b */
    public final WakeLock f8101b;

    /* renamed from: c */
    public WorkSource f8102c;

    /* renamed from: d */
    public final int f8103d;

    /* renamed from: e */
    public final String f8104e;

    /* renamed from: f */
    public final String f8105f;

    /* renamed from: g */
    public final Context f8106g;

    /* renamed from: h */
    public boolean f8107h;

    /* renamed from: i */
    public final Map<String, Integer[]> f8108i;

    /* renamed from: j */
    public int f8109j;

    /* renamed from: k */
    public AtomicInteger f8110k;

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0108  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3237a(android.content.Context r8, int r9, java.lang.String r10) {
        /*
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L_0x0005
            r1 = r0
            goto L_0x0009
        L_0x0005:
            java.lang.String r1 = r8.getPackageName()
        L_0x0009:
            r7.<init>()
            r7.f8100a = r7
            r2 = 1
            r7.f8107h = r2
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r7.f8108i = r3
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.Collections.synchronizedSet(r3)
            java.util.concurrent.atomic.AtomicInteger r3 = new java.util.concurrent.atomic.AtomicInteger
            r4 = 0
            r3.<init>(r4)
            r7.f8110k = r3
            java.lang.String r3 = "WakeLock: context must not be null"
            p124p.p126b.p127k.C1061o.m2525b(r8, r3)
            java.lang.String r3 = "WakeLock: wakeLockName must not be empty"
            p124p.p126b.p127k.C1061o.m2467a(r10, r3)
            r7.f8103d = r9
            r7.f8105f = r0
            android.content.Context r3 = r8.getApplicationContext()
            r7.f8106g = r3
            java.lang.String r3 = r8.getPackageName()
            java.lang.String r5 = "com.google.android.gms"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L_0x0062
            java.lang.String r3 = "*gcore*:"
            java.lang.String r5 = java.lang.String.valueOf(r10)
            int r6 = r5.length()
            if (r6 == 0) goto L_0x0059
            java.lang.String r3 = r3.concat(r5)
            goto L_0x005f
        L_0x0059:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r3)
            r3 = r5
        L_0x005f:
            r7.f8104e = r3
            goto L_0x0064
        L_0x0062:
            r7.f8104e = r10
        L_0x0064:
            java.lang.String r3 = "power"
            java.lang.Object r3 = r8.getSystemService(r3)
            android.os.PowerManager r3 = (android.os.PowerManager) r3
            android.os.PowerManager$WakeLock r9 = r3.newWakeLock(r9, r10)
            r7.f8101b = r9
            boolean r9 = p213q.p217b.p218a.p231b.p239d.p246q.C2289h.m5357a(r8)
            if (r9 == 0) goto L_0x011e
            boolean r9 = p213q.p217b.p218a.p231b.p239d.p246q.C2288g.m5355a(r1)
            if (r9 == 0) goto L_0x0082
            java.lang.String r1 = r8.getPackageName()
        L_0x0082:
            java.lang.String r9 = "WorkSourceUtil"
            android.content.pm.PackageManager r10 = r8.getPackageManager()
            if (r10 == 0) goto L_0x00f3
            if (r1 != 0) goto L_0x008d
            goto L_0x00f3
        L_0x008d:
            q.b.a.b.d.r.a r8 = p213q.p217b.p218a.p231b.p239d.p248r.C2294b.m5363b(r8)     // Catch:{ NameNotFoundException -> 0x00dd }
            android.content.Context r8 = r8.f6270a     // Catch:{ NameNotFoundException -> 0x00dd }
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00dd }
            android.content.pm.ApplicationInfo r8 = r8.getApplicationInfo(r1, r4)     // Catch:{ NameNotFoundException -> 0x00dd }
            if (r8 != 0) goto L_0x00ac
            java.lang.String r8 = "Could not get applicationInfo from package: "
            int r10 = r1.length()
            if (r10 == 0) goto L_0x00a6
            goto L_0x00e5
        L_0x00a6:
            java.lang.String r10 = new java.lang.String
            r10.<init>(r8)
            goto L_0x00ef
        L_0x00ac:
            int r8 = r8.uid
            android.os.WorkSource r10 = new android.os.WorkSource
            r10.<init>()
            java.lang.reflect.Method r3 = p213q.p217b.p218a.p231b.p239d.p246q.C2289h.f6260b
            if (r3 == 0) goto L_0x00c6
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x00d6 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x00d6 }
            r5[r4] = r8     // Catch:{ Exception -> 0x00d6 }
            r5[r2] = r1     // Catch:{ Exception -> 0x00d6 }
            r3.invoke(r10, r5)     // Catch:{ Exception -> 0x00d6 }
            goto L_0x00f4
        L_0x00c6:
            java.lang.reflect.Method r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2289h.f6259a
            if (r1 == 0) goto L_0x00f4
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00d6 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x00d6 }
            r3[r4] = r8     // Catch:{ Exception -> 0x00d6 }
            r1.invoke(r10, r3)     // Catch:{ Exception -> 0x00d6 }
            goto L_0x00f4
        L_0x00d6:
            r8 = move-exception
            java.lang.String r1 = "Unable to assign blame through WorkSource"
            android.util.Log.wtf(r9, r1, r8)
            goto L_0x00f4
        L_0x00dd:
            java.lang.String r8 = "Could not find package: "
            int r10 = r1.length()
            if (r10 == 0) goto L_0x00ea
        L_0x00e5:
            java.lang.String r8 = r8.concat(r1)
            goto L_0x00f0
        L_0x00ea:
            java.lang.String r10 = new java.lang.String
            r10.<init>(r8)
        L_0x00ef:
            r8 = r10
        L_0x00f0:
            android.util.Log.e(r9, r8)
        L_0x00f3:
            r10 = r0
        L_0x00f4:
            r7.f8102c = r10
            if (r10 == 0) goto L_0x011e
            android.content.Context r8 = r7.f8106g
            boolean r8 = p213q.p217b.p218a.p231b.p239d.p246q.C2289h.m5357a(r8)
            if (r8 == 0) goto L_0x011e
            android.os.WorkSource r8 = r7.f8102c
            if (r8 == 0) goto L_0x0108
            r8.add(r10)
            goto L_0x010a
        L_0x0108:
            r7.f8102c = r10
        L_0x010a:
            android.os.WorkSource r8 = r7.f8102c
            android.os.PowerManager$WakeLock r9 = r7.f8101b     // Catch:{ IllegalArgumentException -> 0x0114, ArrayIndexOutOfBoundsException -> 0x0112 }
            r9.setWorkSource(r8)     // Catch:{ IllegalArgumentException -> 0x0114, ArrayIndexOutOfBoundsException -> 0x0112 }
            goto L_0x011e
        L_0x0112:
            r8 = move-exception
            goto L_0x0115
        L_0x0114:
            r8 = move-exception
        L_0x0115:
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "WakeLock"
            android.util.Log.wtf(r9, r8)
        L_0x011e:
            java.util.concurrent.ScheduledExecutorService r8 = f8099l
            if (r8 != 0) goto L_0x0138
            q.b.a.b.d.o.a r8 = p124p.p126b.p127k.C1061o.m2475a()
            q.b.a.b.d.o.b r8 = (p213q.p217b.p218a.p231b.p239d.p244o.C2276b) r8
            if (r8 == 0) goto L_0x0137
            q.b.a.b.g.c.e r8 = p213q.p217b.p218a.p231b.p251g.p254c.C2327d.f6290a
            java.util.concurrent.ScheduledExecutorService r8 = java.util.concurrent.Executors.newScheduledThreadPool(r2)
            java.util.concurrent.ScheduledExecutorService r8 = java.util.concurrent.Executors.unconfigurableScheduledExecutorService(r8)
            f8099l = r8
            goto L_0x0138
        L_0x0137:
            throw r0
        L_0x0138:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p269k.C3237a.<init>(android.content.Context, int, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        if (r2 == false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006b, code lost:
        if (r1.f8109j == 0) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006d, code lost:
        r2 = p213q.p217b.p218a.p231b.p239d.p245p.C2279c.f6246a;
        r3 = r1.f8106g;
        r0 = java.lang.String.valueOf(java.lang.String.valueOf((((long) android.os.Process.myPid()) << 32) | ((long) java.lang.System.identityHashCode(r1.f8101b))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
        if (android.text.TextUtils.isEmpty(r7) == false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008f, code lost:
        r4 = p116io.jsonwebtoken.lang.Objects.EMPTY_STRING;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0092, code lost:
        r4 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0093, code lost:
        r4 = java.lang.String.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009b, code lost:
        if (r4.length() == 0) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009d, code lost:
        r4 = r0.concat(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a3, code lost:
        r4 = new java.lang.String(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a8, code lost:
        r2.mo7301a(r3, r4, 7, r1.f8104e, r7, null, r1.f8103d, p213q.p217b.p218a.p231b.p239d.p246q.C2289h.m5356a(r1.f8102c), r17);
        r1.f8109j++;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8911a(long r17) {
        /*
            r16 = this;
            r1 = r16
            r13 = r17
            java.util.concurrent.atomic.AtomicInteger r0 = r1.f8110k
            r0.incrementAndGet()
            boolean r0 = r1.f8107h
            r2 = 0
            if (r0 == 0) goto L_0x0016
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0016
            r7 = r2
            goto L_0x0019
        L_0x0016:
            java.lang.String r0 = r1.f8105f
            r7 = r0
        L_0x0019:
            java.lang.Object r15 = r1.f8100a
            monitor-enter(r15)
            java.util.Map<java.lang.String, java.lang.Integer[]> r0 = r1.f8108i     // Catch:{ all -> 0x00d8 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00d8 }
            r2 = 0
            if (r0 == 0) goto L_0x0029
            int r0 = r1.f8109j     // Catch:{ all -> 0x00d8 }
            if (r0 <= 0) goto L_0x0038
        L_0x0029:
            android.os.PowerManager$WakeLock r0 = r1.f8101b     // Catch:{ all -> 0x00d8 }
            boolean r0 = r0.isHeld()     // Catch:{ all -> 0x00d8 }
            if (r0 != 0) goto L_0x0038
            java.util.Map<java.lang.String, java.lang.Integer[]> r0 = r1.f8108i     // Catch:{ all -> 0x00d8 }
            r0.clear()     // Catch:{ all -> 0x00d8 }
            r1.f8109j = r2     // Catch:{ all -> 0x00d8 }
        L_0x0038:
            boolean r0 = r1.f8107h     // Catch:{ all -> 0x00d8 }
            r11 = 1
            if (r0 == 0) goto L_0x0065
            java.util.Map<java.lang.String, java.lang.Integer[]> r0 = r1.f8108i     // Catch:{ all -> 0x00d8 }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x00d8 }
            java.lang.Integer[] r0 = (java.lang.Integer[]) r0     // Catch:{ all -> 0x00d8 }
            if (r0 != 0) goto L_0x0056
            java.util.Map<java.lang.String, java.lang.Integer[]> r0 = r1.f8108i     // Catch:{ all -> 0x00d8 }
            java.lang.Integer[] r3 = new java.lang.Integer[r11]     // Catch:{ all -> 0x00d8 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x00d8 }
            r3[r2] = r4     // Catch:{ all -> 0x00d8 }
            r0.put(r7, r3)     // Catch:{ all -> 0x00d8 }
            r2 = r11
            goto L_0x0063
        L_0x0056:
            r3 = r0[r2]     // Catch:{ all -> 0x00d8 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x00d8 }
            int r3 = r3 + r11
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00d8 }
            r0[r2] = r3     // Catch:{ all -> 0x00d8 }
        L_0x0063:
            if (r2 != 0) goto L_0x006d
        L_0x0065:
            boolean r0 = r1.f8107h     // Catch:{ all -> 0x00d8 }
            if (r0 != 0) goto L_0x00bf
            int r0 = r1.f8109j     // Catch:{ all -> 0x00d8 }
            if (r0 != 0) goto L_0x00bf
        L_0x006d:
            q.b.a.b.d.p.c r2 = p213q.p217b.p218a.p231b.p239d.p245p.C2279c.f6246a     // Catch:{ all -> 0x00d8 }
            android.content.Context r3 = r1.f8106g     // Catch:{ all -> 0x00d8 }
            android.os.PowerManager$WakeLock r0 = r1.f8101b     // Catch:{ all -> 0x00d8 }
            int r4 = android.os.Process.myPid()     // Catch:{ all -> 0x00d8 }
            long r4 = (long) r4     // Catch:{ all -> 0x00d8 }
            r6 = 32
            long r4 = r4 << r6
            int r0 = java.lang.System.identityHashCode(r0)     // Catch:{ all -> 0x00d8 }
            long r8 = (long) r0     // Catch:{ all -> 0x00d8 }
            long r4 = r4 | r8
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x00d8 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00d8 }
            boolean r4 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x00d8 }
            if (r4 == 0) goto L_0x0092
            java.lang.String r4 = ""
            goto L_0x0093
        L_0x0092:
            r4 = r7
        L_0x0093:
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x00d8 }
            int r5 = r4.length()     // Catch:{ all -> 0x00d8 }
            if (r5 == 0) goto L_0x00a3
            java.lang.String r0 = r0.concat(r4)     // Catch:{ all -> 0x00d8 }
            r4 = r0
            goto L_0x00a8
        L_0x00a3:
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x00d8 }
            r4.<init>(r0)     // Catch:{ all -> 0x00d8 }
        L_0x00a8:
            r5 = 7
            java.lang.String r6 = r1.f8104e     // Catch:{ all -> 0x00d8 }
            r8 = 0
            int r9 = r1.f8103d     // Catch:{ all -> 0x00d8 }
            android.os.WorkSource r0 = r1.f8102c     // Catch:{ all -> 0x00d8 }
            java.util.List r10 = p213q.p217b.p218a.p231b.p239d.p246q.C2289h.m5356a(r0)     // Catch:{ all -> 0x00d8 }
            r0 = r11
            r11 = r17
            r2.mo7301a(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x00d8 }
            int r2 = r1.f8109j     // Catch:{ all -> 0x00d8 }
            int r2 = r2 + r0
            r1.f8109j = r2     // Catch:{ all -> 0x00d8 }
        L_0x00bf:
            monitor-exit(r15)     // Catch:{ all -> 0x00d8 }
            android.os.PowerManager$WakeLock r0 = r1.f8101b
            r0.acquire()
            r2 = 0
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d7
            java.util.concurrent.ScheduledExecutorService r0 = f8099l
            q.b.a.b.k.b r2 = new q.b.a.b.k.b
            r2.<init>(r1)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r2, r13, r3)
        L_0x00d7:
            return
        L_0x00d8:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x00d8 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p269k.C3237a.mo8911a(long):void");
    }
}
