package p213q.p217b.p218a.p231b.p270l;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: q.b.a.b.l.x */
public final class C3273x<TResult> implements C3246d0<TResult> {

    /* renamed from: a */
    public final Executor f8164a;

    /* renamed from: b */
    public final Object f8165b = new Object();
    @GuardedBy("mLock")

    /* renamed from: c */
    public C3247e f8166c;

    public C3273x(Executor executor, C3247e eVar) {
        this.f8164a = executor;
        this.f8166c = eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
        r2.f8164a.execute(new p213q.p217b.p218a.p231b.p270l.C3272w(r2, r3));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8916a(p213q.p217b.p218a.p231b.p270l.C3255i<TResult> r3) {
        /*
            r2 = this;
            boolean r0 = r3.mo8936d()
            if (r0 != 0) goto L_0x0025
            r0 = r3
            q.b.a.b.l.f0 r0 = (p213q.p217b.p218a.p231b.p270l.C3250f0) r0
            boolean r0 = r0.f8123d
            if (r0 != 0) goto L_0x0025
            java.lang.Object r0 = r2.f8165b
            monitor-enter(r0)
            q.b.a.b.l.e r1 = r2.f8166c     // Catch:{ all -> 0x0022 }
            if (r1 != 0) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            java.util.concurrent.Executor r0 = r2.f8164a
            q.b.a.b.l.w r1 = new q.b.a.b.l.w
            r1.<init>(r2, r3)
            r0.execute(r1)
            goto L_0x0025
        L_0x0022:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            throw r3
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p270l.C3273x.mo8916a(q.b.a.b.l.i):void");
    }
}
