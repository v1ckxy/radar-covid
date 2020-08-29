package p410v.p411m0.p416g;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.C4557i;
import p392u.C4561m;
import p392u.p401r.p403c.C4638h;
import p410v.C4870w;
import p423w.C4882a0;
import p423w.C4883b;
import p423w.C4886b0;
import p423w.C4892f;
import p423w.C4896i;
import p423w.C4915y;

/* renamed from: v.m0.g.l */
public final class C4817l {

    /* renamed from: a */
    public long f11477a;

    /* renamed from: b */
    public long f11478b;

    /* renamed from: c */
    public long f11479c;

    /* renamed from: d */
    public long f11480d;

    /* renamed from: e */
    public final ArrayDeque<C4870w> f11481e;

    /* renamed from: f */
    public boolean f11482f;

    /* renamed from: g */
    public final C4819b f11483g;

    /* renamed from: h */
    public final C4818a f11484h;

    /* renamed from: i */
    public final C4820c f11485i;

    /* renamed from: j */
    public final C4820c f11486j;

    /* renamed from: k */
    public C4790b f11487k;

    /* renamed from: l */
    public IOException f11488l;

    /* renamed from: m */
    public final int f11489m;

    /* renamed from: n */
    public final C4797f f11490n;

    /* renamed from: v.m0.g.l$a */
    public final class C4818a implements C4915y {

        /* renamed from: e */
        public final C4892f f11491e = new C4892f();

        /* renamed from: f */
        public boolean f11492f;

        /* renamed from: g */
        public boolean f11493g;

        public C4818a(boolean z) {
            this.f11493g = z;
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        public final void mo11262a(boolean z) {
            long min;
            boolean z2;
            synchronized (C4817l.this) {
                C4817l.this.f11486j.mo11417f();
                while (C4817l.this.f11479c >= C4817l.this.f11480d && !this.f11493g && !this.f11492f && C4817l.this.mo11256c() == null) {
                    try {
                        C4817l.this.mo11261h();
                    } catch (Throwable th) {
                        C4817l.this.f11486j.mo11266i();
                        throw th;
                    }
                }
                C4817l.this.f11486j.mo11266i();
                C4817l.this.mo11253b();
                min = Math.min(C4817l.this.f11480d - C4817l.this.f11479c, this.f11491e.f11661f);
                C4817l.this.f11479c += min;
            }
            C4817l.this.f11486j.mo11417f();
            if (z) {
                try {
                    if (min == this.f11491e.f11661f) {
                        z2 = true;
                        C4817l.this.f11490n.mo11211a(C4817l.this.f11489m, z2, this.f11491e, min);
                        C4817l.this.f11486j.mo11266i();
                    }
                } catch (Throwable th2) {
                    C4817l.this.f11486j.mo11266i();
                    throw th2;
                }
            }
            z2 = false;
            C4817l.this.f11490n.mo11211a(C4817l.this.f11489m, z2, this.f11491e, min);
            C4817l.this.f11486j.mo11266i();
        }

        /* renamed from: b */
        public C4886b0 mo11186b() {
            return C4817l.this.f11486j;
        }

        public void close() {
            boolean z;
            boolean z2 = !Thread.holdsLock(C4817l.this);
            if (!C4561m.f10774a || z2) {
                synchronized (C4817l.this) {
                    z = this.f11492f;
                }
                if (!z) {
                    if (!C4817l.this.f11484h.f11493g) {
                        if (this.f11491e.f11661f > 0) {
                            while (this.f11491e.f11661f > 0) {
                                mo11262a(true);
                            }
                        } else {
                            C4817l lVar = C4817l.this;
                            lVar.f11490n.mo11211a(lVar.f11489m, true, null, 0);
                        }
                    }
                    synchronized (C4817l.this) {
                        this.f11492f = true;
                    }
                    C4817l.this.f11490n.f11402w.flush();
                    C4817l.this.mo11249a();
                    return;
                }
                return;
            }
            throw new AssertionError("Assertion failed");
        }

        public void flush() {
            boolean z = !Thread.holdsLock(C4817l.this);
            if (!C4561m.f10774a || z) {
                synchronized (C4817l.this) {
                    C4817l.this.mo11253b();
                }
                while (this.f11491e.f11661f > 0) {
                    mo11262a(false);
                    C4817l.this.f11490n.f11402w.flush();
                }
                return;
            }
            throw new AssertionError("Assertion failed");
        }

        /* renamed from: a */
        public void mo11105a(C4892f fVar, long j) {
            if (fVar != null) {
                boolean z = !Thread.holdsLock(C4817l.this);
                if (!C4561m.f10774a || z) {
                    this.f11491e.mo11105a(fVar, j);
                    while (this.f11491e.f11661f >= 16384) {
                        mo11262a(false);
                    }
                    return;
                }
                throw new AssertionError("Assertion failed");
            }
            C4638h.m10271a("source");
            throw null;
        }
    }

    /* renamed from: v.m0.g.l$b */
    public final class C4819b implements C4882a0 {

        /* renamed from: e */
        public final C4892f f11495e = new C4892f();

        /* renamed from: f */
        public final C4892f f11496f = new C4892f();

        /* renamed from: g */
        public boolean f11497g;

        /* renamed from: h */
        public final long f11498h;

        /* renamed from: i */
        public boolean f11499i;

        public C4819b(long j, boolean z) {
            this.f11498h = j;
            this.f11499i = z;
        }

        /* renamed from: a */
        public final void mo11263a(C4896i iVar, long j) {
            boolean z;
            boolean z2;
            boolean z3;
            long j2;
            if (iVar != null) {
                boolean z4 = !Thread.holdsLock(C4817l.this);
                if (!C4561m.f10774a || z4) {
                    while (j > 0) {
                        synchronized (C4817l.this) {
                            z = this.f11499i;
                            z2 = false;
                            z3 = this.f11496f.f11661f + j > this.f11498h;
                        }
                        if (z3) {
                            iVar.skip(j);
                            C4817l.this.mo11250a(C4790b.FLOW_CONTROL_ERROR);
                            return;
                        } else if (z) {
                            iVar.skip(j);
                            return;
                        } else {
                            long b = iVar.mo11077b(this.f11495e, j);
                            if (b != -1) {
                                j -= b;
                                synchronized (C4817l.this) {
                                    if (this.f11497g) {
                                        j2 = this.f11495e.f11661f;
                                        C4892f fVar = this.f11495e;
                                        fVar.skip(fVar.f11661f);
                                    } else {
                                        if (this.f11496f.f11661f == 0) {
                                            z2 = true;
                                        }
                                        this.f11496f.mo11435a((C4882a0) this.f11495e);
                                        if (z2) {
                                            C4817l lVar = C4817l.this;
                                            if (lVar != null) {
                                                lVar.notifyAll();
                                            } else {
                                                throw new C4557i("null cannot be cast to non-null type java.lang.Object");
                                            }
                                        }
                                        j2 = 0;
                                    }
                                }
                                if (j2 > 0) {
                                    mo11264d(j2);
                                }
                            } else {
                                throw new EOFException();
                            }
                        }
                    }
                    return;
                }
                throw new AssertionError("Assertion failed");
            }
            C4638h.m10271a("source");
            throw null;
        }

        /* renamed from: b */
        public long mo11077b(C4892f fVar, long j) {
            Throwable th;
            long j2;
            boolean z;
            long j3;
            C4892f fVar2 = fVar;
            long j4 = j;
            if (fVar2 != null) {
                long j5 = 0;
                if (j4 >= 0) {
                    while (true) {
                        synchronized (C4817l.this) {
                            C4817l.this.f11485i.mo11417f();
                            try {
                                if (C4817l.this.mo11256c() != null) {
                                    th = C4817l.this.f11488l;
                                    if (th == null) {
                                        C4790b c = C4817l.this.mo11256c();
                                        if (c != null) {
                                            th = new C4826r(c);
                                        } else {
                                            C4638h.m10269a();
                                            throw null;
                                        }
                                    }
                                } else {
                                    th = null;
                                }
                                if (!this.f11497g) {
                                    if (this.f11496f.f11661f > j5) {
                                        j3 = this.f11496f.mo11077b(fVar2, Math.min(j4, this.f11496f.f11661f));
                                        C4817l.this.f11477a += j3;
                                        long j6 = C4817l.this.f11477a - C4817l.this.f11478b;
                                        if (th == null && j6 >= ((long) (C4817l.this.f11490n.f11395p.mo11286a() / 2))) {
                                            C4817l.this.f11490n.mo11208a(C4817l.this.f11489m, j6);
                                            C4817l.this.f11478b = C4817l.this.f11477a;
                                        }
                                    } else if (this.f11499i || th != null) {
                                        j3 = -1;
                                    } else {
                                        C4817l.this.mo11261h();
                                        z = true;
                                        j2 = -1;
                                    }
                                    long j7 = j3;
                                    z = false;
                                    j2 = j7;
                                } else {
                                    throw new IOException("stream closed");
                                }
                            } finally {
                                C4817l.this.f11485i.mo11266i();
                            }
                        }
                        if (z) {
                            j5 = 0;
                        } else if (j2 != -1) {
                            mo11264d(j2);
                            return j2;
                        } else if (th == null) {
                            return -1;
                        } else {
                            throw th;
                        }
                    }
                } else {
                    throw new IllegalArgumentException(C1965a.m4748a("byteCount < 0: ", j4).toString());
                }
            } else {
                C4638h.m10271a("sink");
                throw null;
            }
        }

        public void close() {
            long j;
            synchronized (C4817l.this) {
                this.f11497g = true;
                j = this.f11496f.f11661f;
                C4892f fVar = this.f11496f;
                fVar.skip(fVar.f11661f);
                C4817l lVar = C4817l.this;
                if (lVar != null) {
                    lVar.notifyAll();
                } else {
                    throw new C4557i("null cannot be cast to non-null type java.lang.Object");
                }
            }
            if (j > 0) {
                mo11264d(j);
            }
            C4817l.this.mo11249a();
        }

        /* renamed from: d */
        public final void mo11264d(long j) {
            boolean z = !Thread.holdsLock(C4817l.this);
            if (!C4561m.f10774a || z) {
                C4817l.this.f11490n.mo11219d(j);
                return;
            }
            throw new AssertionError("Assertion failed");
        }

        /* renamed from: b */
        public C4886b0 mo11078b() {
            return C4817l.this.f11485i;
        }
    }

    /* renamed from: v.m0.g.l$c */
    public final class C4820c extends C4883b {
        public C4820c() {
        }

        /* renamed from: b */
        public IOException mo11265b(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* renamed from: h */
        public void mo11159h() {
            C4817l.this.mo11250a(C4790b.CANCEL);
        }

        /* renamed from: i */
        public final void mo11266i() {
            if (mo11418g()) {
                throw mo11265b(null);
            }
        }
    }

    public C4817l(int i, C4797f fVar, boolean z, boolean z2, C4870w wVar) {
        if (fVar != null) {
            this.f11489m = i;
            this.f11490n = fVar;
            this.f11480d = (long) fVar.f11396q.mo11286a();
            this.f11481e = new ArrayDeque<>();
            this.f11483g = new C4819b((long) this.f11490n.f11395p.mo11286a(), z2);
            this.f11484h = new C4818a(z);
            this.f11485i = new C4820c();
            this.f11486j = new C4820c();
            boolean e = mo11258e();
            if (wVar != null) {
                if (!e) {
                    this.f11481e.add(wVar);
                    return;
                }
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            } else if (!e) {
                throw new IllegalStateException("remotely-initiated streams should have headers".toString());
            }
        } else {
            C4638h.m10271a("connection");
            throw null;
        }
    }

    /* renamed from: a */
    public final void mo11249a() {
        boolean f;
        boolean z = true;
        boolean z2 = !Thread.holdsLock(this);
        if (!C4561m.f10774a || z2) {
            synchronized (this) {
                if (!this.f11483g.f11499i && this.f11483g.f11497g) {
                    if (!this.f11484h.f11493g) {
                        if (this.f11484h.f11492f) {
                        }
                    }
                    f = mo11259f();
                }
                z = false;
                f = mo11259f();
            }
            if (z) {
                mo11251a(C4790b.CANCEL, (IOException) null);
            } else if (!f) {
                this.f11490n.mo11217c(this.f11489m);
            }
        } else {
            throw new AssertionError("Assertion failed");
        }
    }

    /* renamed from: b */
    public final void mo11253b() {
        C4818a aVar = this.f11484h;
        if (aVar.f11492f) {
            throw new IOException("stream closed");
        } else if (aVar.f11493g) {
            throw new IOException("stream finished");
        } else if (this.f11487k != null) {
            Throwable th = this.f11488l;
            if (th == null) {
                C4790b bVar = this.f11487k;
                if (bVar == null) {
                    C4638h.m10269a();
                    throw null;
                }
                th = new C4826r(bVar);
            }
            throw th;
        }
    }

    /* renamed from: c */
    public final synchronized C4790b mo11256c() {
        return this.f11487k;
    }

    /* renamed from: d */
    public final C4915y mo11257d() {
        synchronized (this) {
            if (!(this.f11482f || mo11258e())) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
        }
        return this.f11484h;
    }

    /* renamed from: e */
    public final boolean mo11258e() {
        return this.f11490n.f11384e == ((this.f11489m & 1) == 1);
    }

    /* renamed from: f */
    public final synchronized boolean mo11259f() {
        if (this.f11487k != null) {
            return false;
        }
        if ((this.f11483g.f11499i || this.f11483g.f11497g) && ((this.f11484h.f11493g || this.f11484h.f11492f) && this.f11482f)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: g */
    public final synchronized C4870w mo11260g() {
        Object removeFirst;
        this.f11485i.mo11417f();
        while (this.f11481e.isEmpty() && this.f11487k == null) {
            try {
                mo11261h();
            } catch (Throwable th) {
                this.f11485i.mo11266i();
                throw th;
            }
        }
        this.f11485i.mo11266i();
        if (!this.f11481e.isEmpty()) {
            removeFirst = this.f11481e.removeFirst();
            C4638h.m10270a(removeFirst, "headersQueue.removeFirst()");
        } else {
            Throwable th2 = this.f11488l;
            if (th2 == null) {
                C4790b bVar = this.f11487k;
                if (bVar == null) {
                    C4638h.m10269a();
                    throw null;
                }
                th2 = new C4826r(bVar);
            }
            throw th2;
        }
        return (C4870w) removeFirst;
    }

    /* renamed from: h */
    public final void mo11261h() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* renamed from: b */
    public final boolean mo11255b(C4790b bVar, IOException iOException) {
        boolean z = !Thread.holdsLock(this);
        if (!C4561m.f10774a || z) {
            synchronized (this) {
                if (this.f11487k != null) {
                    return false;
                }
                if (this.f11483g.f11499i && this.f11484h.f11493g) {
                    return false;
                }
                this.f11487k = bVar;
                this.f11488l = iOException;
                notifyAll();
                this.f11490n.mo11217c(this.f11489m);
                return true;
            }
        }
        throw new AssertionError("Assertion failed");
    }

    /* renamed from: b */
    public final synchronized void mo11254b(C4790b bVar) {
        String str = "errorCode";
        if (bVar == null) {
            C4638h.m10271a(str);
            throw null;
        } else if (this.f11487k == null) {
            this.f11487k = bVar;
            notifyAll();
        }
    }

    /* renamed from: a */
    public final void mo11251a(C4790b bVar, IOException iOException) {
        if (bVar == null) {
            C4638h.m10271a("rstStatusCode");
            throw null;
        } else if (mo11255b(bVar, iOException)) {
            C4797f fVar = this.f11490n;
            fVar.f11402w.mo11271a(this.f11489m, bVar);
        }
    }

    /* renamed from: a */
    public final void mo11250a(C4790b bVar) {
        if (bVar == null) {
            C4638h.m10271a("errorCode");
            throw null;
        } else if (mo11255b(bVar, null)) {
            this.f11490n.mo11210a(this.f11489m, bVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x002f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11252a(p410v.C4870w r5, boolean r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L_0x0048
            boolean r1 = java.lang.Thread.holdsLock(r4)
            r2 = 1
            r1 = r1 ^ r2
            boolean r3 = p392u.C4561m.f10774a
            if (r3 == 0) goto L_0x0018
            if (r1 == 0) goto L_0x0010
            goto L_0x0018
        L_0x0010:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            java.lang.String r6 = "Assertion failed"
            r5.<init>(r6)
            throw r5
        L_0x0018:
            monitor-enter(r4)
            boolean r1 = r4.f11482f     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x0026
            if (r6 != 0) goto L_0x0020
            goto L_0x0026
        L_0x0020:
            v.m0.g.l$b r5 = r4.f11483g     // Catch:{ all -> 0x0045 }
            if (r5 == 0) goto L_0x0025
            goto L_0x002d
        L_0x0025:
            throw r0     // Catch:{ all -> 0x0045 }
        L_0x0026:
            r4.f11482f = r2     // Catch:{ all -> 0x0045 }
            java.util.ArrayDeque<v.w> r0 = r4.f11481e     // Catch:{ all -> 0x0045 }
            r0.add(r5)     // Catch:{ all -> 0x0045 }
        L_0x002d:
            if (r6 == 0) goto L_0x0033
            v.m0.g.l$b r5 = r4.f11483g     // Catch:{ all -> 0x0045 }
            r5.f11499i = r2     // Catch:{ all -> 0x0045 }
        L_0x0033:
            boolean r5 = r4.mo11259f()     // Catch:{ all -> 0x0045 }
            r4.notifyAll()     // Catch:{ all -> 0x0045 }
            monitor-exit(r4)
            if (r5 != 0) goto L_0x0044
            v.m0.g.f r5 = r4.f11490n
            int r6 = r4.f11489m
            r5.mo11217c(r6)
        L_0x0044:
            return
        L_0x0045:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x0048:
            java.lang.String r5 = "headers"
            p392u.p401r.p403c.C4638h.m10271a(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p410v.p411m0.p416g.C4817l.mo11252a(v.w, boolean):void");
    }
}
