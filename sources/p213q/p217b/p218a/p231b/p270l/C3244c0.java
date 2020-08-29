package p213q.p217b.p218a.p231b.p270l;

import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: q.b.a.b.l.c0 */
public final class C3244c0<TResult> {

    /* renamed from: a */
    public final Object f8117a = new Object();
    @GuardedBy("mLock")

    /* renamed from: b */
    public Queue<C3246d0<TResult>> f8118b;
    @GuardedBy("mLock")

    /* renamed from: c */
    public boolean f8119c;

    /* renamed from: a */
    public final void mo8917a(C3246d0<TResult> d0Var) {
        synchronized (this.f8117a) {
            if (this.f8118b == null) {
                this.f8118b = new ArrayDeque();
            }
            this.f8118b.add(d0Var);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r1 = r2.f8117a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = (p213q.p217b.p218a.p231b.p270l.C3246d0) r2.f8118b.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        r2.f8119c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0022, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0023, code lost:
        r0.mo8916a(r3);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8918a(p213q.p217b.p218a.p231b.p270l.C3255i<TResult> r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f8117a
            monitor-enter(r0)
            java.util.Queue<q.b.a.b.l.d0<TResult>> r1 = r2.f8118b     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x002a
            boolean r1 = r2.f8119c     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x000c
            goto L_0x002a
        L_0x000c:
            r1 = 1
            r2.f8119c = r1     // Catch:{ all -> 0x002c }
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
        L_0x0010:
            java.lang.Object r1 = r2.f8117a
            monitor-enter(r1)
            java.util.Queue<q.b.a.b.l.d0<TResult>> r0 = r2.f8118b     // Catch:{ all -> 0x0027 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0027 }
            q.b.a.b.l.d0 r0 = (p213q.p217b.p218a.p231b.p270l.C3246d0) r0     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x0022
            r3 = 0
            r2.f8119c = r3     // Catch:{ all -> 0x0027 }
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            return
        L_0x0022:
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            r0.mo8916a(r3)
            goto L_0x0010
        L_0x0027:
            r3 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            throw r3
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return
        L_0x002c:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p270l.C3244c0.mo8918a(q.b.a.b.l.i):void");
    }
}
