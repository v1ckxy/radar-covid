package p213q.p217b.p218a.p231b.p259h.p261b;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.h.b.z4 */
public final class C3184z4 extends C3185z5 {

    /* renamed from: l */
    public static final AtomicLong f7999l = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c */
    public C2933d5 f8000c;

    /* renamed from: d */
    public C2933d5 f8001d;

    /* renamed from: e */
    public final PriorityBlockingQueue<C2945e5<?>> f8002e = new PriorityBlockingQueue<>();

    /* renamed from: f */
    public final BlockingQueue<C2945e5<?>> f8003f = new LinkedBlockingQueue();

    /* renamed from: g */
    public final UncaughtExceptionHandler f8004g = new C2909b5(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: h */
    public final UncaughtExceptionHandler f8005h = new C2909b5(this, "Thread death: Uncaught exception on network thread");

    /* renamed from: i */
    public final Object f8006i = new Object();

    /* renamed from: j */
    public final Semaphore f8007j = new Semaphore(2);

    /* renamed from: k */
    public volatile boolean f8008k;

    public C3184z4(C2969g5 g5Var) {
        super(g5Var);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:15|16|(1:18)(1:19)|20|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        if (r7.length() == 0) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        r6 = r6.concat(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        r6 = new java.lang.String(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        r5.mo8432a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r5 = mo8285i().f7156i;
        r6 = "Interrupted waiting for ";
        r7 = java.lang.String.valueOf(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        if (r7.length() != 0) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
        r6 = r6.concat(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        r6 = new java.lang.String(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
        r5.mo8432a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        r4 = r4.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r4 != null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        r5 = mo8285i().f7156i;
        r6 = "Timed out waiting for ";
        r7 = java.lang.String.valueOf(r7);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0040 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T mo8840a(java.util.concurrent.atomic.AtomicReference<T> r4, long r5, java.lang.String r7, java.lang.Runnable r8) {
        /*
            r3 = this;
            monitor-enter(r4)
            q.b.a.b.h.b.z4 r0 = r3.mo8283g()     // Catch:{ all -> 0x0063 }
            r0.mo8846n()     // Catch:{ all -> 0x0063 }
            p124p.p126b.p127k.C1061o.m2524b(r8)     // Catch:{ all -> 0x0063 }
            q.b.a.b.h.b.e5 r1 = new q.b.a.b.h.b.e5     // Catch:{ all -> 0x0063 }
            java.lang.String r2 = "Task exception on worker thread"
            r1.<init>(r0, r8, r2)     // Catch:{ all -> 0x0063 }
            r0.mo8843a(r1)     // Catch:{ all -> 0x0063 }
            r4.wait(r5)     // Catch:{ InterruptedException -> 0x0040 }
            monitor-exit(r4)     // Catch:{ all -> 0x0063 }
            java.lang.Object r4 = r4.get()
            if (r4 != 0) goto L_0x003f
            q.b.a.b.h.b.b4 r5 = r3.mo8285i()
            q.b.a.b.h.b.e4 r5 = r5.f7156i
            java.lang.String r6 = "Timed out waiting for "
            java.lang.String r7 = java.lang.String.valueOf(r7)
            int r8 = r7.length()
            if (r8 == 0) goto L_0x0036
            java.lang.String r6 = r6.concat(r7)
            goto L_0x003c
        L_0x0036:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r6)
            r6 = r7
        L_0x003c:
            r5.mo8432a(r6)
        L_0x003f:
            return r4
        L_0x0040:
            q.b.a.b.h.b.b4 r5 = r3.mo8285i()     // Catch:{ all -> 0x0063 }
            q.b.a.b.h.b.e4 r5 = r5.f7156i     // Catch:{ all -> 0x0063 }
            java.lang.String r6 = "Interrupted waiting for "
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0063 }
            int r8 = r7.length()     // Catch:{ all -> 0x0063 }
            if (r8 == 0) goto L_0x0057
            java.lang.String r6 = r6.concat(r7)     // Catch:{ all -> 0x0063 }
            goto L_0x005d
        L_0x0057:
            java.lang.String r7 = new java.lang.String     // Catch:{ all -> 0x0063 }
            r7.<init>(r6)     // Catch:{ all -> 0x0063 }
            r6 = r7
        L_0x005d:
            r5.mo8432a(r6)     // Catch:{ all -> 0x0063 }
            r5 = 0
            monitor-exit(r4)     // Catch:{ all -> 0x0063 }
            return r5
        L_0x0063:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0063 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C3184z4.mo8840a(java.util.concurrent.atomic.AtomicReference, long, java.lang.String, java.lang.Runnable):java.lang.Object");
    }

    /* renamed from: a */
    public final void mo8842a(Runnable runnable) {
        mo8846n();
        C1061o.m2524b(runnable);
        mo8843a(new C2945e5<>(this, runnable, "Task exception on worker thread"));
    }

    /* renamed from: a */
    public final void mo8843a(C2945e5<?> e5Var) {
        synchronized (this.f8006i) {
            this.f8002e.add(e5Var);
            if (this.f8000c == null) {
                C2933d5 d5Var = new C2933d5(this, "Measurement Worker", this.f8002e);
                this.f8000c = d5Var;
                d5Var.setUncaughtExceptionHandler(this.f8004g);
                this.f8000c.start();
            } else {
                this.f8000c.mo8382a();
            }
        }
    }

    /* renamed from: b */
    public final void mo8278b() {
        if (Thread.currentThread() != this.f8001d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    /* renamed from: b */
    public final void mo8844b(Runnable runnable) {
        mo8846n();
        C1061o.m2524b(runnable);
        C2945e5 e5Var = new C2945e5(this, runnable, "Task exception on network thread");
        synchronized (this.f8006i) {
            this.f8003f.add(e5Var);
            if (this.f8001d == null) {
                C2933d5 d5Var = new C2933d5(this, "Measurement Network", this.f8003f);
                this.f8001d = d5Var;
                d5Var.setUncaughtExceptionHandler(this.f8005h);
                this.f8001d.start();
            } else {
                this.f8001d.mo8382a();
            }
        }
    }

    /* renamed from: c */
    public final void mo8279c() {
        if (Thread.currentThread() != this.f8000c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* renamed from: q */
    public final boolean mo8306q() {
        return false;
    }

    /* renamed from: s */
    public final boolean mo8845s() {
        return Thread.currentThread() == this.f8000c;
    }

    /* renamed from: a */
    public final <V> Future<V> mo8841a(Callable<V> callable) {
        mo8846n();
        C1061o.m2524b(callable);
        C2945e5 e5Var = new C2945e5(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f8000c) {
            if (!this.f8002e.isEmpty()) {
                mo8285i().f7156i.mo8432a("Callable skipped the worker queue.");
            }
            e5Var.run();
        } else {
            mo8843a(e5Var);
        }
        return e5Var;
    }
}
