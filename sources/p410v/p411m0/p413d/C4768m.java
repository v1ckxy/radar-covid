package p410v.p411m0.p413d;

import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import p392u.C4561m;
import p392u.p401r.p403c.C4638h;
import p410v.C4690b0;
import p410v.C4706e0;
import p410v.C4708f;
import p410v.C4861t;
import p410v.C4877y.C4878a;
import p410v.p411m0.C4737b;
import p410v.p411m0.p414e.C4775d;
import p410v.p411m0.p418i.C4839f;
import p410v.p411m0.p418i.C4839f.C4840a;
import p423w.C4883b;

/* renamed from: v.m0.d.m */
public final class C4768m {

    /* renamed from: a */
    public final C4762i f11277a;

    /* renamed from: b */
    public final C4861t f11278b;

    /* renamed from: c */
    public final C4770b f11279c;

    /* renamed from: d */
    public Object f11280d;

    /* renamed from: e */
    public C4706e0 f11281e;

    /* renamed from: f */
    public C4757d f11282f;

    /* renamed from: g */
    public C4761h f11283g;

    /* renamed from: h */
    public C4754c f11284h;

    /* renamed from: i */
    public boolean f11285i;

    /* renamed from: j */
    public boolean f11286j;

    /* renamed from: k */
    public boolean f11287k;

    /* renamed from: l */
    public boolean f11288l;

    /* renamed from: m */
    public boolean f11289m;

    /* renamed from: n */
    public final C4690b0 f11290n;

    /* renamed from: o */
    public final C4708f f11291o;

    /* renamed from: v.m0.d.m$a */
    public static final class C4769a extends WeakReference<C4768m> {

        /* renamed from: a */
        public final Object f11292a;

        public C4769a(C4768m mVar, Object obj) {
            if (mVar != null) {
                super(mVar);
                this.f11292a = obj;
                return;
            }
            C4638h.m10271a("referent");
            throw null;
        }
    }

    /* renamed from: v.m0.d.m$b */
    public static final class C4770b extends C4883b {

        /* renamed from: l */
        public final /* synthetic */ C4768m f11293l;

        public C4770b(C4768m mVar) {
            this.f11293l = mVar;
        }

        /* renamed from: h */
        public void mo11159h() {
            this.f11293l.mo11154b();
        }
    }

    public C4768m(C4690b0 b0Var, C4708f fVar) {
        if (b0Var == null) {
            C4638h.m10271a("client");
            throw null;
        } else if (fVar != null) {
            this.f11290n = b0Var;
            this.f11291o = fVar;
            this.f11277a = b0Var.f10918f.f11118a;
            this.f11278b = b0Var.f10921i.mo11072a(fVar);
            C4770b bVar = new C4770b(this);
            bVar.mo11425a((long) this.f11290n.f10912B, TimeUnit.MILLISECONDS);
            this.f11279c = bVar;
        } else {
            C4638h.m10271a("call");
            throw null;
        }
    }

    /* renamed from: a */
    public final IOException mo11148a(IOException iOException) {
        synchronized (this.f11277a) {
            this.f11289m = true;
        }
        return mo11149a((E) iOException, false);
    }

    /* renamed from: a */
    public final void mo11153a(C4761h hVar) {
        if (hVar != null) {
            boolean holdsLock = Thread.holdsLock(this.f11277a);
            if (!C4561m.f10774a || holdsLock) {
                if (this.f11283g == null) {
                    this.f11283g = hVar;
                    hVar.f11252n.add(new C4769a(this, this.f11280d));
                    return;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            throw new AssertionError("Assertion failed");
        }
        C4638h.m10271a("connection");
        throw null;
    }

    /* renamed from: b */
    public final void mo11154b() {
        C4754c cVar;
        C4761h hVar;
        synchronized (this.f11277a) {
            this.f11287k = true;
            cVar = this.f11284h;
            C4757d dVar = this.f11282f;
            if (dVar != null) {
                boolean holdsLock = Thread.holdsLock(dVar.f11230g);
                if (C4561m.f10774a) {
                    if (!holdsLock) {
                        throw new AssertionError("Assertion failed");
                    }
                }
                hVar = dVar.f11226c;
                if (hVar != null) {
                }
            }
            hVar = this.f11283g;
        }
        if (cVar != null) {
            cVar.f11213f.cancel();
        } else if (hVar != null) {
            Socket socket = hVar.f11240b;
            if (socket != null) {
                C4737b.m10465a(socket);
            }
        }
    }

    /* renamed from: c */
    public final void mo11155c() {
        synchronized (this.f11277a) {
            if (!this.f11289m) {
                this.f11284h = null;
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
    }

    /* renamed from: d */
    public final boolean mo11156d() {
        boolean z;
        synchronized (this.f11277a) {
            z = this.f11284h != null;
        }
        return z;
    }

    /* renamed from: e */
    public final boolean mo11157e() {
        boolean z;
        synchronized (this.f11277a) {
            z = this.f11287k;
        }
        return z;
    }

    /* renamed from: f */
    public final Socket mo11158f() {
        boolean holdsLock = Thread.holdsLock(this.f11277a);
        String str = "Assertion failed";
        if (!C4561m.f10774a || holdsLock) {
            C4761h hVar = this.f11283g;
            if (hVar != null) {
                Iterator it = hVar.f11252n.iterator();
                boolean z = false;
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else if (C4638h.m10272a((Object) (C4768m) ((Reference) it.next()).get(), (Object) this)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i != -1) {
                    C4761h hVar2 = this.f11283g;
                    if (hVar2 != null) {
                        hVar2.f11252n.remove(i);
                        this.f11283g = null;
                        if (hVar2.f11252n.isEmpty()) {
                            hVar2.f11253o = System.nanoTime();
                            C4762i iVar = this.f11277a;
                            if (iVar != null) {
                                boolean holdsLock2 = Thread.holdsLock(iVar);
                                if (!C4561m.f10774a || holdsLock2) {
                                    if (hVar2.f11247i || iVar.f11262f == 0) {
                                        iVar.f11259c.remove(hVar2);
                                        z = true;
                                    } else {
                                        iVar.notifyAll();
                                    }
                                    if (z) {
                                        return hVar2.mo11133d();
                                    }
                                } else {
                                    throw new AssertionError(str);
                                }
                            } else {
                                throw null;
                            }
                        }
                        return null;
                    }
                    C4638h.m10269a();
                    throw null;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            C4638h.m10269a();
            throw null;
        }
        throw new AssertionError(str);
    }

    /* renamed from: a */
    public final void mo11152a() {
        C4840a aVar = C4839f.f11548c;
        this.f11280d = C4839f.f11546a.mo11296a("response.body().close()");
        C4861t tVar = this.f11278b;
        C4708f fVar = this.f11291o;
        if (tVar == null) {
            throw null;
        } else if (fVar == null) {
            C4638h.m10271a("call");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x004b, code lost:
        if (r2 == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x004d, code lost:
        r7 = mo11149a(r7, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0051, code lost:
        return r7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E extends java.io.IOException> E mo11150a(p410v.p411m0.p413d.C4754c r4, boolean r5, boolean r6, E r7) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L_0x0055
            v.m0.d.i r1 = r3.f11277a
            monitor-enter(r1)
            v.m0.d.c r2 = r3.f11284h     // Catch:{ all -> 0x0052 }
            boolean r4 = p392u.p401r.p403c.C4638h.m10272a(r4, r2)     // Catch:{ all -> 0x0052 }
            r2 = 1
            r4 = r4 ^ r2
            if (r4 == 0) goto L_0x0012
            monitor-exit(r1)
            return r7
        L_0x0012:
            r4 = 0
            if (r5 == 0) goto L_0x001b
            boolean r5 = r3.f11285i     // Catch:{ all -> 0x0052 }
            r5 = r5 ^ r2
            r3.f11285i = r2     // Catch:{ all -> 0x0052 }
            goto L_0x001c
        L_0x001b:
            r5 = r4
        L_0x001c:
            if (r6 == 0) goto L_0x0025
            boolean r6 = r3.f11286j     // Catch:{ all -> 0x0052 }
            if (r6 != 0) goto L_0x0023
            r5 = r2
        L_0x0023:
            r3.f11286j = r2     // Catch:{ all -> 0x0052 }
        L_0x0025:
            boolean r6 = r3.f11285i     // Catch:{ all -> 0x0052 }
            if (r6 == 0) goto L_0x0049
            boolean r6 = r3.f11286j     // Catch:{ all -> 0x0052 }
            if (r6 == 0) goto L_0x0049
            if (r5 == 0) goto L_0x0049
            v.m0.d.c r5 = r3.f11284h     // Catch:{ all -> 0x0052 }
            if (r5 == 0) goto L_0x0045
            v.m0.d.h r5 = r5.mo11110a()     // Catch:{ all -> 0x0052 }
            if (r5 == 0) goto L_0x0041
            int r6 = r5.f11249k     // Catch:{ all -> 0x0052 }
            int r6 = r6 + r2
            r5.f11249k = r6     // Catch:{ all -> 0x0052 }
            r3.f11284h = r0     // Catch:{ all -> 0x0052 }
            goto L_0x004a
        L_0x0041:
            p392u.p401r.p403c.C4638h.m10269a()     // Catch:{ all -> 0x0052 }
            throw r0
        L_0x0045:
            p392u.p401r.p403c.C4638h.m10269a()     // Catch:{ all -> 0x0052 }
            throw r0
        L_0x0049:
            r2 = r4
        L_0x004a:
            monitor-exit(r1)
            if (r2 == 0) goto L_0x0051
            java.io.IOException r7 = r3.mo11149a((E) r7, r4)
        L_0x0051:
            return r7
        L_0x0052:
            r4 = move-exception
            monitor-exit(r1)
            throw r4
        L_0x0055:
            java.lang.String r4 = "exchange"
            p392u.p401r.p403c.C4638h.m10271a(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p410v.p411m0.p413d.C4768m.mo11150a(v.m0.d.c, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0014 A[Catch:{ all -> 0x000e }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x009e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E extends java.io.IOException> E mo11149a(E r7, boolean r8) {
        /*
            r6 = this;
            v.m0.d.i r0 = r6.f11277a
            monitor-enter(r0)
            r1 = 0
            r2 = 1
            if (r8 == 0) goto L_0x0011
            v.m0.d.c r3 = r6.f11284h     // Catch:{ all -> 0x000e }
            if (r3 != 0) goto L_0x000c
            goto L_0x0011
        L_0x000c:
            r3 = r1
            goto L_0x0012
        L_0x000e:
            r7 = move-exception
            goto L_0x00aa
        L_0x0011:
            r3 = r2
        L_0x0012:
            if (r3 == 0) goto L_0x009e
            v.m0.d.h r3 = r6.f11283g     // Catch:{ all -> 0x000e }
            v.m0.d.h r4 = r6.f11283g     // Catch:{ all -> 0x000e }
            r5 = 0
            if (r4 == 0) goto L_0x002a
            v.m0.d.c r4 = r6.f11284h     // Catch:{ all -> 0x000e }
            if (r4 != 0) goto L_0x002a
            if (r8 != 0) goto L_0x0025
            boolean r8 = r6.f11289m     // Catch:{ all -> 0x000e }
            if (r8 == 0) goto L_0x002a
        L_0x0025:
            java.net.Socket r8 = r6.mo11158f()     // Catch:{ all -> 0x000e }
            goto L_0x002b
        L_0x002a:
            r8 = r5
        L_0x002b:
            v.m0.d.h r4 = r6.f11283g     // Catch:{ all -> 0x000e }
            if (r4 == 0) goto L_0x0030
            r3 = r5
        L_0x0030:
            boolean r4 = r6.f11289m     // Catch:{ all -> 0x000e }
            if (r4 == 0) goto L_0x003a
            v.m0.d.c r4 = r6.f11284h     // Catch:{ all -> 0x000e }
            if (r4 != 0) goto L_0x003a
            r4 = r2
            goto L_0x003b
        L_0x003a:
            r4 = r1
        L_0x003b:
            monitor-exit(r0)
            if (r8 == 0) goto L_0x0041
            p410v.p411m0.C4737b.m10465a(r8)
        L_0x0041:
            if (r3 == 0) goto L_0x0059
            v.t r8 = r6.f11278b
            v.f r0 = r6.f11291o
            if (r3 == 0) goto L_0x0055
            if (r8 == 0) goto L_0x0054
            if (r0 == 0) goto L_0x004e
            goto L_0x0059
        L_0x004e:
            java.lang.String r7 = "call"
            p392u.p401r.p403c.C4638h.m10271a(r7)
            throw r5
        L_0x0054:
            throw r5
        L_0x0055:
            p392u.p401r.p403c.C4638h.m10269a()
            throw r5
        L_0x0059:
            if (r4 == 0) goto L_0x009d
            if (r7 == 0) goto L_0x005e
            r1 = r2
        L_0x005e:
            boolean r8 = r6.f11288l
            if (r8 == 0) goto L_0x0063
            goto L_0x0079
        L_0x0063:
            v.m0.d.m$b r8 = r6.f11279c
            boolean r8 = r8.mo11418g()
            if (r8 != 0) goto L_0x006c
            goto L_0x0079
        L_0x006c:
            java.io.InterruptedIOException r8 = new java.io.InterruptedIOException
            java.lang.String r0 = "timeout"
            r8.<init>(r0)
            if (r7 == 0) goto L_0x0078
            r8.initCause(r7)
        L_0x0078:
            r7 = r8
        L_0x0079:
            v.t r8 = r6.f11278b
            v.f r0 = r6.f11291o
            if (r1 == 0) goto L_0x0091
            if (r7 == 0) goto L_0x008d
            if (r8 == 0) goto L_0x008c
            if (r0 == 0) goto L_0x0086
            goto L_0x009d
        L_0x0086:
            java.lang.String r7 = "call"
            p392u.p401r.p403c.C4638h.m10271a(r7)
            throw r5
        L_0x008c:
            throw r5
        L_0x008d:
            p392u.p401r.p403c.C4638h.m10269a()
            throw r5
        L_0x0091:
            if (r8 == 0) goto L_0x009c
            if (r0 == 0) goto L_0x0096
            goto L_0x009d
        L_0x0096:
            java.lang.String r7 = "call"
            p392u.p401r.p403c.C4638h.m10271a(r7)
            throw r5
        L_0x009c:
            throw r5
        L_0x009d:
            return r7
        L_0x009e:
            java.lang.String r7 = "cannot release connection while it is in use"
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x000e }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x000e }
            r8.<init>(r7)     // Catch:{ all -> 0x000e }
            throw r8     // Catch:{ all -> 0x000e }
        L_0x00aa:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p410v.p411m0.p413d.C4768m.mo11149a(java.io.IOException, boolean):java.io.IOException");
    }

    /* renamed from: a */
    public final C4754c mo11151a(C4878a aVar, boolean z) {
        if (aVar != null) {
            synchronized (this.f11277a) {
                boolean z2 = true;
                if (!this.f11289m) {
                    if (this.f11284h != null) {
                        z2 = false;
                    }
                    if (!z2) {
                        throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                    }
                } else {
                    throw new IllegalStateException("released".toString());
                }
            }
            C4757d dVar = this.f11282f;
            if (dVar != null) {
                C4690b0 b0Var = this.f11290n;
                if (dVar == null) {
                    throw null;
                } else if (b0Var != null) {
                    try {
                        C4775d a = dVar.mo11116a(aVar.mo11173b(), aVar.mo11174c(), aVar.mo11175d(), b0Var.f10916F, b0Var.f10922j, z).mo11121a(b0Var, aVar);
                        C4708f fVar = this.f11291o;
                        C4861t tVar = this.f11278b;
                        C4757d dVar2 = this.f11282f;
                        if (dVar2 != null) {
                            C4754c cVar = new C4754c(this, fVar, tVar, dVar2, a);
                            synchronized (this.f11277a) {
                                this.f11284h = cVar;
                                this.f11285i = false;
                                this.f11286j = false;
                            }
                            return cVar;
                        }
                        C4638h.m10269a();
                        throw null;
                    } catch (C4765k e) {
                        dVar.mo11120d();
                        throw e;
                    } catch (IOException e2) {
                        dVar.mo11120d();
                        throw new C4765k(e2);
                    }
                } else {
                    C4638h.m10271a("client");
                    throw null;
                }
            } else {
                C4638h.m10269a();
                throw null;
            }
        } else {
            C4638h.m10271a("chain");
            throw null;
        }
    }
}
