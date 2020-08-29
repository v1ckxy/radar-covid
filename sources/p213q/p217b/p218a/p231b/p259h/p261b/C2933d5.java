package p213q.p217b.p218a.p231b.p259h.p261b;

import java.util.concurrent.BlockingQueue;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.h.b.d5 */
public final class C2933d5 extends Thread {

    /* renamed from: e */
    public final Object f7241e;

    /* renamed from: f */
    public final BlockingQueue<C2945e5<?>> f7242f;

    /* renamed from: g */
    public boolean f7243g = false;

    /* renamed from: h */
    public final /* synthetic */ C3184z4 f7244h;

    public C2933d5(C3184z4 z4Var, String str, BlockingQueue<C2945e5<?>> blockingQueue) {
        this.f7244h = z4Var;
        C1061o.m2524b(str);
        C1061o.m2524b(blockingQueue);
        this.f7241e = new Object();
        this.f7242f = blockingQueue;
        setName(str);
    }

    /* renamed from: a */
    public final void mo8382a() {
        synchronized (this.f7241e) {
            this.f7241e.notifyAll();
        }
    }

    /* renamed from: a */
    public final void mo8383a(InterruptedException interruptedException) {
        this.f7244h.mo8285i().f7156i.mo8433a(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    /* renamed from: b */
    public final void mo8384b() {
        synchronized (this.f7244h.f8006i) {
            if (!this.f7243g) {
                this.f7244h.f8007j.release();
                this.f7244h.f8006i.notifyAll();
                if (this == this.f7244h.f8000c) {
                    this.f7244h.f8000c = null;
                } else if (this == this.f7244h.f8001d) {
                    this.f7244h.f8001d = null;
                } else {
                    this.f7244h.mo8285i().f7153f.mo8432a("Current scheduler thread is neither worker nor network");
                }
                this.f7243g = true;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006f, code lost:
        mo8384b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0072, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            r0 = 0
        L_0x0001:
            if (r0 != 0) goto L_0x0011
            q.b.a.b.h.b.z4 r1 = r5.f7244h     // Catch:{ InterruptedException -> 0x000c }
            java.util.concurrent.Semaphore r1 = r1.f8007j     // Catch:{ InterruptedException -> 0x000c }
            r1.acquire()     // Catch:{ InterruptedException -> 0x000c }
            r0 = 1
            goto L_0x0001
        L_0x000c:
            r1 = move-exception
            r5.mo8383a(r1)
            goto L_0x0001
        L_0x0011:
            int r0 = android.os.Process.myTid()     // Catch:{ all -> 0x007b }
            int r0 = android.os.Process.getThreadPriority(r0)     // Catch:{ all -> 0x007b }
        L_0x0019:
            java.util.concurrent.BlockingQueue<q.b.a.b.h.b.e5<?>> r1 = r5.f7242f     // Catch:{ all -> 0x007b }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x007b }
            q.b.a.b.h.b.e5 r1 = (p213q.p217b.p218a.p231b.p259h.p261b.C2945e5) r1     // Catch:{ all -> 0x007b }
            if (r1 == 0) goto L_0x0032
            boolean r2 = r1.f7278f     // Catch:{ all -> 0x007b }
            if (r2 == 0) goto L_0x0029
            r2 = r0
            goto L_0x002b
        L_0x0029:
            r2 = 10
        L_0x002b:
            android.os.Process.setThreadPriority(r2)     // Catch:{ all -> 0x007b }
            r1.run()     // Catch:{ all -> 0x007b }
            goto L_0x0019
        L_0x0032:
            java.lang.Object r1 = r5.f7241e     // Catch:{ all -> 0x007b }
            monitor-enter(r1)     // Catch:{ all -> 0x007b }
            java.util.concurrent.BlockingQueue<q.b.a.b.h.b.e5<?>> r2 = r5.f7242f     // Catch:{ all -> 0x0078 }
            java.lang.Object r2 = r2.peek()     // Catch:{ all -> 0x0078 }
            if (r2 != 0) goto L_0x004f
            q.b.a.b.h.b.z4 r2 = r5.f7244h     // Catch:{ all -> 0x0078 }
            boolean r2 = r2.f8008k     // Catch:{ all -> 0x0078 }
            if (r2 != 0) goto L_0x004f
            java.lang.Object r2 = r5.f7241e     // Catch:{ InterruptedException -> 0x004b }
            r3 = 30000(0x7530, double:1.4822E-319)
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x004b }
            goto L_0x004f
        L_0x004b:
            r2 = move-exception
            r5.mo8383a(r2)     // Catch:{ all -> 0x0078 }
        L_0x004f:
            monitor-exit(r1)     // Catch:{ all -> 0x0078 }
            q.b.a.b.h.b.z4 r1 = r5.f7244h     // Catch:{ all -> 0x007b }
            java.lang.Object r1 = r1.f8006i     // Catch:{ all -> 0x007b }
            monitor-enter(r1)     // Catch:{ all -> 0x007b }
            java.util.concurrent.BlockingQueue<q.b.a.b.h.b.e5<?>> r2 = r5.f7242f     // Catch:{ all -> 0x0075 }
            java.lang.Object r2 = r2.peek()     // Catch:{ all -> 0x0075 }
            if (r2 != 0) goto L_0x0073
            q.b.a.b.h.b.z4 r0 = r5.f7244h     // Catch:{ all -> 0x0075 }
            q.b.a.b.h.b.g5 r0 = r0.f7133a     // Catch:{ all -> 0x0075 }
            q.b.a.b.h.b.ka r0 = r0.f7338g     // Catch:{ all -> 0x0075 }
            q.b.a.b.h.b.r3<java.lang.Boolean> r2 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7761y0     // Catch:{ all -> 0x0075 }
            boolean r0 = r0.mo8574a(r2)     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x006e
            r5.mo8384b()     // Catch:{ all -> 0x0075 }
        L_0x006e:
            monitor-exit(r1)     // Catch:{ all -> 0x0075 }
            r5.mo8384b()
            return
        L_0x0073:
            monitor-exit(r1)     // Catch:{ all -> 0x0075 }
            goto L_0x0019
        L_0x0075:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0075 }
            throw r0     // Catch:{ all -> 0x007b }
        L_0x0078:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0078 }
            throw r0     // Catch:{ all -> 0x007b }
        L_0x007b:
            r0 = move-exception
            r5.mo8384b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C2933d5.run():void");
    }
}
