package p213q.p217b.p218a.p231b.p270l;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: q.b.a.b.l.y */
public final class C3274y<TResult> implements C3246d0<TResult> {

    /* renamed from: a */
    public final Executor f8167a;

    /* renamed from: b */
    public final Object f8168b = new Object();
    @GuardedBy("mLock")

    /* renamed from: c */
    public C3249f<? super TResult> f8169c;

    public C3274y(Executor executor, C3249f<? super TResult> fVar) {
        this.f8167a = executor;
        this.f8169c = fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r2.f8167a.execute(new p213q.p217b.p218a.p231b.p270l.C3275z(r2, r3));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8916a(p213q.p217b.p218a.p231b.p270l.C3255i<TResult> r3) {
        /*
            r2 = this;
            boolean r0 = r3.mo8936d()
            if (r0 == 0) goto L_0x001e
            java.lang.Object r0 = r2.f8168b
            monitor-enter(r0)
            q.b.a.b.l.f<? super TResult> r1 = r2.f8169c     // Catch:{ all -> 0x001b }
            if (r1 != 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            java.util.concurrent.Executor r0 = r2.f8167a
            q.b.a.b.l.z r1 = new q.b.a.b.l.z
            r1.<init>(r2, r3)
            r0.execute(r1)
            goto L_0x001e
        L_0x001b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            throw r3
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p270l.C3274y.mo8916a(q.b.a.b.l.i):void");
    }
}
