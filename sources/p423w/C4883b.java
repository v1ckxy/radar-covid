package p423w;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;

/* renamed from: w.b */
public class C4883b extends C4886b0 {

    /* renamed from: h */
    public static final long f11642h = TimeUnit.SECONDS.toMillis(60);

    /* renamed from: i */
    public static final long f11643i = TimeUnit.MILLISECONDS.toNanos(f11642h);

    /* renamed from: j */
    public static C4883b f11644j;

    /* renamed from: k */
    public static final C4884a f11645k = new C4884a(null);

    /* renamed from: e */
    public boolean f11646e;

    /* renamed from: f */
    public C4883b f11647f;

    /* renamed from: g */
    public long f11648g;

    /* renamed from: w.b$a */
    public static final class C4884a {
        public /* synthetic */ C4884a(C4636f fVar) {
        }

        /* renamed from: a */
        public final C4883b mo11419a() {
            Class<C4883b> cls = C4883b.class;
            C4883b bVar = C4883b.f11644j;
            C4883b bVar2 = null;
            if (bVar != null) {
                C4883b bVar3 = bVar.f11647f;
                long nanoTime = System.nanoTime();
                if (bVar3 == null) {
                    cls.wait(C4883b.f11642h);
                    C4883b bVar4 = C4883b.f11644j;
                    if (bVar4 != null) {
                        if (bVar4.f11647f == null && System.nanoTime() - nanoTime >= C4883b.f11643i) {
                            bVar2 = C4883b.f11644j;
                        }
                        return bVar2;
                    }
                    C4638h.m10269a();
                    throw null;
                }
                long j = bVar3.f11648g - nanoTime;
                if (j > 0) {
                    long j2 = j / 1000000;
                    cls.wait(j2, (int) (j - (1000000 * j2)));
                    return null;
                }
                C4883b bVar5 = C4883b.f11644j;
                if (bVar5 != null) {
                    bVar5.f11647f = bVar3.f11647f;
                    bVar3.f11647f = null;
                    return bVar3;
                }
                C4638h.m10269a();
                throw null;
            }
            C4638h.m10269a();
            throw null;
        }

        /* renamed from: a */
        public final boolean mo11421a(C4883b bVar) {
            boolean z;
            synchronized (C4883b.class) {
                C4883b bVar2 = C4883b.f11644j;
                while (true) {
                    if (bVar2 == null) {
                        z = true;
                        break;
                    } else if (bVar2.f11647f == bVar) {
                        bVar2.f11647f = bVar.f11647f;
                        bVar.f11647f = null;
                        z = false;
                        break;
                    } else {
                        bVar2 = bVar2.f11647f;
                    }
                }
            }
            return z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x003e A[LOOP:0: B:16:0x003e->B:25:0x0052, LOOP_START, PHI: r10 
          PHI: (r10v2 w.b) = (r10v1 w.b), (r10v3 w.b) binds: [B:15:0x003c, B:25:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x006a A[SYNTHETIC, Splitter:B:37:0x006a] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo11420a(p423w.C4883b r7, long r8, boolean r10) {
            /*
                r6 = this;
                java.lang.Class<w.b> r0 = p423w.C4883b.class
                monitor-enter(r0)
                w.b r1 = p423w.C4883b.f11644j     // Catch:{ all -> 0x0074 }
                if (r1 != 0) goto L_0x0016
                w.b r1 = new w.b     // Catch:{ all -> 0x0074 }
                r1.<init>()     // Catch:{ all -> 0x0074 }
                p423w.C4883b.f11644j = r1     // Catch:{ all -> 0x0074 }
                w.b$b r1 = new w.b$b     // Catch:{ all -> 0x0074 }
                r1.<init>()     // Catch:{ all -> 0x0074 }
                r1.start()     // Catch:{ all -> 0x0074 }
            L_0x0016:
                long r1 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0074 }
                r3 = 0
                int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r3 == 0) goto L_0x002c
                if (r10 == 0) goto L_0x002c
                long r3 = r7.mo11427c()     // Catch:{ all -> 0x0074 }
                long r3 = r3 - r1
                long r8 = java.lang.Math.min(r8, r3)     // Catch:{ all -> 0x0074 }
                goto L_0x002e
            L_0x002c:
                if (r3 == 0) goto L_0x0030
            L_0x002e:
                long r8 = r8 + r1
                goto L_0x0036
            L_0x0030:
                if (r10 == 0) goto L_0x006e
                long r8 = r7.mo11427c()     // Catch:{ all -> 0x0074 }
            L_0x0036:
                r7.f11648g = r8     // Catch:{ all -> 0x0074 }
                long r8 = r8 - r1
                w.b r10 = p423w.C4883b.f11644j     // Catch:{ all -> 0x0074 }
                r3 = 0
                if (r10 == 0) goto L_0x006a
            L_0x003e:
                w.b r4 = r10.f11647f     // Catch:{ all -> 0x0074 }
                if (r4 == 0) goto L_0x005b
                w.b r4 = r10.f11647f     // Catch:{ all -> 0x0074 }
                if (r4 == 0) goto L_0x0057
                long r4 = r4.f11648g     // Catch:{ all -> 0x0074 }
                long r4 = r4 - r1
                int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r4 >= 0) goto L_0x004e
                goto L_0x005b
            L_0x004e:
                w.b r10 = r10.f11647f     // Catch:{ all -> 0x0074 }
                if (r10 == 0) goto L_0x0053
                goto L_0x003e
            L_0x0053:
                p392u.p401r.p403c.C4638h.m10269a()     // Catch:{ all -> 0x0074 }
                throw r3
            L_0x0057:
                p392u.p401r.p403c.C4638h.m10269a()     // Catch:{ all -> 0x0074 }
                throw r3
            L_0x005b:
                w.b r8 = r10.f11647f     // Catch:{ all -> 0x0074 }
                r7.f11647f = r8     // Catch:{ all -> 0x0074 }
                r10.f11647f = r7     // Catch:{ all -> 0x0074 }
                w.b r7 = p423w.C4883b.f11644j     // Catch:{ all -> 0x0074 }
                if (r10 != r7) goto L_0x0068
                r0.notify()     // Catch:{ all -> 0x0074 }
            L_0x0068:
                monitor-exit(r0)
                return
            L_0x006a:
                p392u.p401r.p403c.C4638h.m10269a()     // Catch:{ all -> 0x0074 }
                throw r3
            L_0x006e:
                java.lang.AssertionError r7 = new java.lang.AssertionError     // Catch:{ all -> 0x0074 }
                r7.<init>()     // Catch:{ all -> 0x0074 }
                throw r7     // Catch:{ all -> 0x0074 }
            L_0x0074:
                r7 = move-exception
                monitor-exit(r0)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p423w.C4883b.C4884a.mo11420a(w.b, long, boolean):void");
        }
    }

    /* renamed from: w.b$b */
    public static final class C4885b extends Thread {
        public C4885b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
            if (r1 == null) goto L_0x0000;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0015, code lost:
            r1.mo11159h();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<w.b> r0 = p423w.C4883b.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                w.b$a r1 = p423w.C4883b.f11645k     // Catch:{ all -> 0x0019 }
                w.b r1 = r1.mo11419a()     // Catch:{ all -> 0x0019 }
                w.b r2 = p423w.C4883b.f11644j     // Catch:{ all -> 0x0019 }
                if (r1 != r2) goto L_0x0012
                r1 = 0
                p423w.C4883b.f11644j = r1     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                return
            L_0x0012:
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                if (r1 == 0) goto L_0x0000
                r1.mo11159h()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x0019:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: p423w.C4883b.C4885b.run():void");
        }
    }

    /* renamed from: a */
    public final IOException mo11415a(IOException iOException) {
        if (iOException != null) {
            return !mo11418g() ? iOException : mo11265b(iOException);
        }
        C4638h.m10271a("cause");
        throw null;
    }

    /* renamed from: a */
    public final void mo11416a(boolean z) {
        if (mo11418g() && z) {
            throw mo11265b(null);
        }
    }

    /* renamed from: b */
    public IOException mo11265b(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: f */
    public final void mo11417f() {
        if (!this.f11646e) {
            long j = this.f11652c;
            boolean z = this.f11650a;
            if (j != 0 || z) {
                this.f11646e = true;
                f11645k.mo11420a(this, j, z);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit".toString());
    }

    /* renamed from: g */
    public final boolean mo11418g() {
        if (!this.f11646e) {
            return false;
        }
        this.f11646e = false;
        return f11645k.mo11421a(this);
    }

    /* renamed from: h */
    public void mo11159h() {
    }
}
