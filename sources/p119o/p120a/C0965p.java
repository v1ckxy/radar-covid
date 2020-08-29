package p119o.p120a;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p395p.C4583f;

/* renamed from: o.a.p */
public final class C0965p extends C0976s0 {

    /* renamed from: f */
    public static final int f2580f;

    /* renamed from: g */
    public static final C0965p f2581g = new C0965p();
    public static volatile Executor pool;

    /* renamed from: o.a.p$a */
    public static final class C0966a implements ThreadFactory {

        /* renamed from: e */
        public final /* synthetic */ AtomicInteger f2582e;

        public C0966a(AtomicInteger atomicInteger) {
            this.f2582e = atomicInteger;
        }

        public final Thread newThread(Runnable runnable) {
            StringBuilder a = C1965a.m4756a("CommonPool-worker-");
            a.append(this.f2582e.incrementAndGet());
            Thread thread = new Thread(runnable, a.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0064 A[SYNTHETIC] */
    static {
        /*
            o.a.p r0 = new o.a.p
            r0.<init>()
            f2581g = r0
            r0 = 0
            java.lang.String r1 = "kotlinx.coroutines.default.parallelism"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch:{ all -> 0x000f }
            goto L_0x0010
        L_0x000f:
            r1 = r0
        L_0x0010:
            if (r1 == 0) goto L_0x008d
            r2 = 10
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5143a(r2)
            int r3 = r1.length()
            r4 = 1
            if (r3 != 0) goto L_0x001f
            goto L_0x0070
        L_0x001f:
            r5 = 0
            char r6 = r1.charAt(r5)
            r7 = 48
            r8 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            if (r6 >= r7) goto L_0x003d
            if (r3 != r4) goto L_0x002e
            goto L_0x0070
        L_0x002e:
            r7 = 45
            if (r6 != r7) goto L_0x0036
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4
            goto L_0x003e
        L_0x0036:
            r7 = 43
            if (r6 != r7) goto L_0x0070
            r6 = r4
            r7 = r5
            goto L_0x003f
        L_0x003d:
            r6 = r5
        L_0x003e:
            r7 = r6
        L_0x003f:
            r9 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
            r10 = r9
        L_0x0043:
            if (r6 >= r3) goto L_0x0064
            char r11 = r1.charAt(r6)
            int r11 = java.lang.Character.digit(r11, r2)
            if (r11 >= 0) goto L_0x0050
            goto L_0x0070
        L_0x0050:
            if (r5 >= r10) goto L_0x0059
            if (r10 != r9) goto L_0x0070
            int r10 = r8 / 10
            if (r5 >= r10) goto L_0x0059
            goto L_0x0070
        L_0x0059:
            int r5 = r5 * 10
            int r12 = r8 + r11
            if (r5 >= r12) goto L_0x0060
            goto L_0x0070
        L_0x0060:
            int r5 = r5 - r11
            int r6 = r6 + 1
            goto L_0x0043
        L_0x0064:
            if (r7 == 0) goto L_0x006b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            goto L_0x0070
        L_0x006b:
            int r0 = -r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0070:
            if (r0 == 0) goto L_0x007d
            int r2 = r0.intValue()
            if (r2 < r4) goto L_0x007d
            int r0 = r0.intValue()
            goto L_0x008e
        L_0x007d:
            java.lang.String r0 = "Expected positive number in kotlinx.coroutines.default.parallelism, but has "
            java.lang.String r0 = p213q.p214a.p215a.p216a.C1965a.m4751a(r0, r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x008d:
            r0 = -1
        L_0x008e:
            f2580f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p119o.p120a.C0965p.<clinit>():void");
    }

    /* renamed from: a */
    public void mo4301a(C4583f fVar, Runnable runnable) {
        try {
            Executor executor = pool;
            if (executor == null) {
                executor = mo4315r();
            }
            executor.execute(runnable);
        } catch (RejectedExecutionException unused) {
            C0928e0.f2529l.mo4300a(runnable);
        }
    }

    public void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }

    /* renamed from: m */
    public final ExecutorService mo4313m() {
        return Executors.newFixedThreadPool(mo4316s(), new C0966a(new AtomicInteger()));
    }

    /* renamed from: o */
    public final ExecutorService mo4314o() {
        Class cls;
        ExecutorService executorService;
        Integer num;
        if (System.getSecurityManager() != null) {
            return mo4313m();
        }
        ExecutorService executorService2 = null;
        try {
            cls = Class.forName("java.util.concurrent.ForkJoinPool");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return mo4313m();
        }
        if (f2580f < 0) {
            try {
                Method method = cls.getMethod("commonPool", new Class[0]);
                Object invoke = method != null ? method.invoke(null, new Object[0]) : null;
                if (!(invoke instanceof ExecutorService)) {
                    invoke = null;
                }
                executorService = (ExecutorService) invoke;
            } catch (Throwable unused2) {
                executorService = null;
            }
            if (executorService != null) {
                if (f2581g != null) {
                    executorService.submit(C0969q.f2585e);
                    try {
                        Object invoke2 = cls.getMethod("getPoolSize", new Class[0]).invoke(executorService, new Object[0]);
                        if (!(invoke2 instanceof Integer)) {
                            invoke2 = null;
                        }
                        num = (Integer) invoke2;
                    } catch (Throwable unused3) {
                        num = null;
                    }
                    if (!(num != null && num.intValue() >= 1)) {
                        executorService = null;
                    }
                    if (executorService != null) {
                        return executorService;
                    }
                } else {
                    throw null;
                }
            }
        }
        try {
            Object newInstance = cls.getConstructor(new Class[]{Integer.TYPE}).newInstance(new Object[]{Integer.valueOf(f2581g.mo4316s())});
            if (!(newInstance instanceof ExecutorService)) {
                newInstance = null;
            }
            executorService2 = (ExecutorService) newInstance;
        } catch (Throwable unused4) {
        }
        return executorService2 != null ? executorService2 : mo4313m();
    }

    /* renamed from: r */
    public final synchronized Executor mo4315r() {
        Executor executor;
        executor = pool;
        if (executor == null) {
            executor = mo4314o();
            pool = executor;
        }
        return executor;
    }

    /* renamed from: s */
    public final int mo4316s() {
        Integer valueOf = Integer.valueOf(f2580f);
        int i = 1;
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        int availableProcessors = Runtime.getRuntime().availableProcessors() - 1;
        if (availableProcessors >= 1) {
            i = availableProcessors;
        }
        return i;
    }

    public String toString() {
        return "CommonPool";
    }
}
