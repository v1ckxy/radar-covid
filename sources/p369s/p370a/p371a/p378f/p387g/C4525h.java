package p369s.p370a.p371a.p378f.p387g;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: s.a.a.f.g.h */
public final class C4525h {

    /* renamed from: a */
    public static final boolean f10726a;

    /* renamed from: b */
    public static final int f10727b;

    /* renamed from: c */
    public static final AtomicReference<ScheduledExecutorService> f10728c = new AtomicReference<>();

    /* renamed from: d */
    public static final Map<ScheduledThreadPoolExecutor, Object> f10729d = new ConcurrentHashMap();

    /* renamed from: s.a.a.f.g.h$a */
    public static final class C4526a implements Runnable {
        public void run() {
            Iterator it = new ArrayList(C4525h.f10729d.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    C4525h.f10729d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a A[SYNTHETIC, Splitter:B:11:0x002a] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0041 A[LOOP:0: B:21:0x0041->B:26:0x006e, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    static {
        /*
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            f10728c = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            f10729d = r0
            java.lang.String r0 = "rx3.purge-enabled"
            r1 = 1
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch:{ all -> 0x001f }
            if (r0 != 0) goto L_0x0018
            goto L_0x0023
        L_0x0018:
            java.lang.String r2 = "true"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x001f }
            goto L_0x0024
        L_0x001f:
            r0 = move-exception
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5312c(r0)
        L_0x0023:
            r0 = r1
        L_0x0024:
            f10726a = r0
            java.lang.String r2 = "rx3.purge-period-seconds"
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = java.lang.System.getProperty(r2)     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x0031
            goto L_0x003a
        L_0x0031:
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x0036 }
            goto L_0x003b
        L_0x0036:
            r0 = move-exception
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5312c(r0)
        L_0x003a:
            r0 = r1
        L_0x003b:
            f10727b = r0
            boolean r0 = f10726a
            if (r0 == 0) goto L_0x0072
        L_0x0041:
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> r0 = f10728c
            java.lang.Object r0 = r0.get()
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0
            if (r0 == 0) goto L_0x004c
            goto L_0x0072
        L_0x004c:
            s.a.a.f.g.e r2 = new s.a.a.f.g.e
            java.lang.String r3 = "RxSchedulerPurge"
            r2.<init>(r3)
            java.util.concurrent.ScheduledExecutorService r4 = java.util.concurrent.Executors.newScheduledThreadPool(r1, r2)
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> r2 = f10728c
            boolean r0 = r2.compareAndSet(r0, r4)
            if (r0 == 0) goto L_0x006e
            s.a.a.f.g.h$a r5 = new s.a.a.f.g.h$a
            r5.<init>()
            int r0 = f10727b
            long r8 = (long) r0
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS
            r6 = r8
            r4.scheduleAtFixedRate(r5, r6, r8, r10)
            goto L_0x0072
        L_0x006e:
            r4.shutdownNow()
            goto L_0x0041
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p369s.p370a.p371a.p378f.p387g.C4525h.<clinit>():void");
    }

    /* renamed from: a */
    public static ScheduledExecutorService m10189a(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (f10726a && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            f10729d.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        return newScheduledThreadPool;
    }
}
