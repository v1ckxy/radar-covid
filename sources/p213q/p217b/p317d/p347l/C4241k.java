package p213q.p217b.p317d.p347l;

import android.os.IBinder;

/* renamed from: q.b.d.l.k */
public final /* synthetic */ class C4241k implements Runnable {

    /* renamed from: e */
    public final C4230f f10215e;

    /* renamed from: f */
    public final IBinder f10216f;

    public C4241k(C4230f fVar, IBinder iBinder) {
        this.f10215e = fVar;
        this.f10216f = iBinder;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002a, code lost:
        r0.mo10418a(0, r1.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0034, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:5:0x000a, B:9:0x000f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            q.b.d.l.f r0 = r4.f10215e
            android.os.IBinder r1 = r4.f10216f
            monitor-enter(r0)
            r2 = 0
            if (r1 != 0) goto L_0x000f
            java.lang.String r1 = "Null service connection"
            r0.mo10418a(r2, r1)     // Catch:{ all -> 0x0027 }
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return
        L_0x000f:
            q.b.d.l.n r3 = new q.b.d.l.n     // Catch:{ RemoteException -> 0x0029 }
            r3.<init>(r1)     // Catch:{ RemoteException -> 0x0029 }
            r0.f10194c = r3     // Catch:{ RemoteException -> 0x0029 }
            r1 = 2
            r0.f10192a = r1     // Catch:{ all -> 0x0027 }
            q.b.d.l.e r1 = r0.f10197f     // Catch:{ all -> 0x0027 }
            java.util.concurrent.ScheduledExecutorService r1 = r1.f10188b     // Catch:{ all -> 0x0027 }
            q.b.d.l.j r2 = new q.b.d.l.j     // Catch:{ all -> 0x0027 }
            r2.<init>(r0)     // Catch:{ all -> 0x0027 }
            r1.execute(r2)     // Catch:{ all -> 0x0027 }
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return
        L_0x0027:
            r1 = move-exception
            goto L_0x0033
        L_0x0029:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0027 }
            r0.mo10418a(r2, r1)     // Catch:{ all -> 0x0027 }
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p317d.p347l.C4241k.run():void");
    }
}
