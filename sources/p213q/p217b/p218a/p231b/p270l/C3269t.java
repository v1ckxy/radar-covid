package p213q.p217b.p218a.p231b.p270l;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: q.b.a.b.l.t */
public final class C3269t<TResult> implements C3246d0<TResult> {

    /* renamed from: a */
    public final Executor f8154a;

    /* renamed from: b */
    public final Object f8155b = new Object();
    @GuardedBy("mLock")

    /* renamed from: c */
    public C3243c f8156c;

    public C3269t(Executor executor, C3243c cVar) {
        this.f8154a = executor;
        this.f8156c = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r1.f8154a.execute(new p213q.p217b.p218a.p231b.p270l.C3268s(r1));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8916a(p213q.p217b.p218a.p231b.p270l.C3255i<TResult> r2) {
        /*
            r1 = this;
            q.b.a.b.l.f0 r2 = (p213q.p217b.p218a.p231b.p270l.C3250f0) r2
            boolean r2 = r2.f8123d
            if (r2 == 0) goto L_0x001e
            java.lang.Object r2 = r1.f8155b
            monitor-enter(r2)
            q.b.a.b.l.c r0 = r1.f8156c     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x000f
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            return
        L_0x000f:
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            java.util.concurrent.Executor r2 = r1.f8154a
            q.b.a.b.l.s r0 = new q.b.a.b.l.s
            r0.<init>(r1)
            r2.execute(r0)
            goto L_0x001e
        L_0x001b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            throw r0
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p270l.C3269t.mo8916a(q.b.a.b.l.i):void");
    }
}
