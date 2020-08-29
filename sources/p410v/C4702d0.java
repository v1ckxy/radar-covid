package p410v;

import java.util.concurrent.atomic.AtomicInteger;
import p116io.jsonwebtoken.lang.Objects;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;
import p410v.p411m0.p413d.C4768m;

/* renamed from: v.d0 */
public final class C4702d0 implements C4708f {

    /* renamed from: e */
    public C4768m f11006e;

    /* renamed from: f */
    public boolean f11007f;

    /* renamed from: g */
    public final C4690b0 f11008g;

    /* renamed from: h */
    public final C4706e0 f11009h;

    /* renamed from: i */
    public final boolean f11010i;

    /* renamed from: v.d0$a */
    public final class C4703a implements Runnable {

        /* renamed from: e */
        public volatile AtomicInteger f11011e;

        /* renamed from: f */
        public final C4711g f11012f;

        /* renamed from: g */
        public final /* synthetic */ C4702d0 f11013g;

        public C4703a(C4702d0 d0Var, C4711g gVar) {
            if (gVar != null) {
                this.f11013g = d0Var;
                this.f11012f = gVar;
                this.f11011e = new AtomicInteger(0);
                return;
            }
            C4638h.m10271a("responseCallback");
            throw null;
        }

        /* renamed from: a */
        public final String mo11007a() {
            return this.f11013g.f11009h.f11029b.f11620e;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0050 A[SYNTHETIC, Splitter:B:21:0x0050] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0070 A[Catch:{ all -> 0x004a, all -> 0x00a2 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r7 = this;
                java.lang.String r0 = "OkHttp "
                java.lang.StringBuilder r0 = p213q.p214a.p215a.p216a.C1965a.m4756a(r0)
                v.d0 r1 = r7.f11013g
                v.e0 r1 = r1.f11009h
                v.x r1 = r1.f11029b
                java.lang.String r1 = r1.mo11395g()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                java.lang.String r2 = "currentThread"
                p392u.p401r.p403c.C4638h.m10270a(r1, r2)
                java.lang.String r2 = r1.getName()
                r1.setName(r0)
                v.d0 r0 = r7.f11013g     // Catch:{ all -> 0x00a2 }
                v.m0.d.m r0 = r0.f11006e     // Catch:{ all -> 0x00a2 }
                r3 = 0
                if (r0 == 0) goto L_0x009c
                v.m0.d.m$b r0 = r0.f11279c     // Catch:{ all -> 0x00a2 }
                r0.mo11417f()     // Catch:{ all -> 0x00a2 }
                v.d0 r0 = r7.f11013g     // Catch:{ IOException -> 0x004c }
                v.i0 r0 = r0.mo11000b()     // Catch:{ IOException -> 0x004c }
                r4 = 1
                v.g r5 = r7.f11012f     // Catch:{ IOException -> 0x0048 }
                v.d0 r6 = r7.f11013g     // Catch:{ IOException -> 0x0048 }
                y.u$a r5 = (p484y.C5338u.C5339a) r5
                r5.mo12058a(r6, r0)     // Catch:{ IOException -> 0x0048 }
                v.d0 r0 = r7.f11013g     // Catch:{ all -> 0x00a2 }
            L_0x0045:
                v.b0 r0 = r0.f11008g     // Catch:{ all -> 0x00a2 }
                goto L_0x0088
            L_0x0048:
                r0 = move-exception
                goto L_0x004e
            L_0x004a:
                r0 = move-exception
                goto L_0x0092
            L_0x004c:
                r0 = move-exception
                r4 = 0
            L_0x004e:
                if (r4 == 0) goto L_0x0070
                v.m0.i.f$a r3 = p410v.p411m0.p418i.C4839f.f11548c     // Catch:{ all -> 0x004a }
                v.m0.i.f r3 = p410v.p411m0.p418i.C4839f.f11546a     // Catch:{ all -> 0x004a }
                r4 = 4
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x004a }
                r5.<init>()     // Catch:{ all -> 0x004a }
                java.lang.String r6 = "Callback failure for "
                r5.append(r6)     // Catch:{ all -> 0x004a }
                v.d0 r6 = r7.f11013g     // Catch:{ all -> 0x004a }
                java.lang.String r6 = r6.mo11001c()     // Catch:{ all -> 0x004a }
                r5.append(r6)     // Catch:{ all -> 0x004a }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x004a }
                r3.mo11298a(r4, r5, r0)     // Catch:{ all -> 0x004a }
                goto L_0x0085
            L_0x0070:
                v.g r4 = r7.f11012f     // Catch:{ all -> 0x004a }
                y.u$a r4 = (p484y.C5338u.C5339a) r4     // Catch:{ all -> 0x004a }
                if (r4 == 0) goto L_0x0091
                y.f r3 = r4.f12634a     // Catch:{ all -> 0x007e }
                y.u r4 = p484y.C5338u.this     // Catch:{ all -> 0x007e }
                r3.mo11952a(r4, r0)     // Catch:{ all -> 0x007e }
                goto L_0x0085
            L_0x007e:
                r0 = move-exception
                p484y.C5282h0.m11763a(r0)     // Catch:{ all -> 0x004a }
                r0.printStackTrace()     // Catch:{ all -> 0x004a }
            L_0x0085:
                v.d0 r0 = r7.f11013g     // Catch:{ all -> 0x00a2 }
                goto L_0x0045
            L_0x0088:
                v.q r0 = r0.f10917e     // Catch:{ all -> 0x00a2 }
                r0.mo11350b(r7)     // Catch:{ all -> 0x00a2 }
                r1.setName(r2)
                return
            L_0x0091:
                throw r3     // Catch:{ all -> 0x004a }
            L_0x0092:
                v.d0 r3 = r7.f11013g     // Catch:{ all -> 0x00a2 }
                v.b0 r3 = r3.f11008g     // Catch:{ all -> 0x00a2 }
                v.q r3 = r3.f10917e     // Catch:{ all -> 0x00a2 }
                r3.mo11350b(r7)     // Catch:{ all -> 0x00a2 }
                throw r0     // Catch:{ all -> 0x00a2 }
            L_0x009c:
                java.lang.String r0 = "transmitter"
                p392u.p401r.p403c.C4638h.m10273b(r0)     // Catch:{ all -> 0x00a2 }
                throw r3
            L_0x00a2:
                r0 = move-exception
                r1.setName(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p410v.C4702d0.C4703a.run():void");
        }
    }

    public /* synthetic */ C4702d0(C4690b0 b0Var, C4706e0 e0Var, boolean z, C4636f fVar) {
        this.f11008g = b0Var;
        this.f11009h = e0Var;
        this.f11010i = z;
    }

    /* renamed from: a */
    public void mo10999a(C4711g gVar) {
        if (gVar != null) {
            synchronized (this) {
                if (!this.f11007f) {
                    this.f11007f = true;
                } else {
                    throw new IllegalStateException("Already Executed".toString());
                }
            }
            C4768m mVar = this.f11006e;
            if (mVar != null) {
                mVar.mo11152a();
                this.f11008g.f10917e.mo11348a(new C4703a(this, gVar));
                return;
            }
            C4638h.m10273b("transmitter");
            throw null;
        }
        C4638h.m10271a("responseCallback");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00af  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p410v.C4720i0 mo11000b() {
        /*
            r14 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            v.b0 r0 = r14.f11008g
            java.util.List<v.y> r0 = r0.f10919g
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5263a(r1, r0)
            v.m0.e.i r0 = new v.m0.e.i
            v.b0 r2 = r14.f11008g
            r0.<init>(r2)
            r1.add(r0)
            v.m0.e.a r0 = new v.m0.e.a
            v.b0 r2 = r14.f11008g
            v.p r2 = r2.f10926n
            r0.<init>(r2)
            r1.add(r0)
            v.m0.c.a r0 = new v.m0.c.a
            v.b0 r2 = r14.f11008g
            v.d r2 = r2.f10927o
            r0.<init>(r2)
            r1.add(r0)
            v.m0.d.a r0 = p410v.p411m0.p413d.C4752a.f11203a
            r1.add(r0)
            boolean r0 = r14.f11010i
            if (r0 != 0) goto L_0x003e
            v.b0 r0 = r14.f11008g
            java.util.List<v.y> r0 = r0.f10920h
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5263a(r1, r0)
        L_0x003e:
            v.m0.e.b r0 = new v.m0.e.b
            boolean r2 = r14.f11010i
            r0.<init>(r2)
            r1.add(r0)
            v.m0.e.g r10 = new v.m0.e.g
            v.m0.d.m r2 = r14.f11006e
            java.lang.String r11 = "transmitter"
            r12 = 0
            if (r2 == 0) goto L_0x00bb
            r3 = 0
            r4 = 0
            v.e0 r5 = r14.f11009h
            v.b0 r0 = r14.f11008g
            int r7 = r0.f10913C
            int r8 = r0.f10914D
            int r9 = r0.f10915E
            r0 = r10
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 0
            v.e0 r1 = r14.f11009h     // Catch:{ IOException -> 0x0090, all -> 0x008e }
            v.i0 r1 = r10.mo11170a(r1)     // Catch:{ IOException -> 0x0090, all -> 0x008e }
            v.m0.d.m r2 = r14.f11006e     // Catch:{ IOException -> 0x0090, all -> 0x008e }
            if (r2 == 0) goto L_0x008a
            boolean r2 = r2.mo11157e()     // Catch:{ IOException -> 0x0090, all -> 0x008e }
            if (r2 != 0) goto L_0x007f
            v.m0.d.m r0 = r14.f11006e
            if (r0 == 0) goto L_0x007b
            r0.mo11148a(r12)
            return r1
        L_0x007b:
            p392u.p401r.p403c.C4638h.m10273b(r11)
            throw r12
        L_0x007f:
            p410v.p411m0.C4737b.m10463a(r1)     // Catch:{ IOException -> 0x0090, all -> 0x008e }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x0090, all -> 0x008e }
            java.lang.String r2 = "Canceled"
            r1.<init>(r2)     // Catch:{ IOException -> 0x0090, all -> 0x008e }
            throw r1     // Catch:{ IOException -> 0x0090, all -> 0x008e }
        L_0x008a:
            p392u.p401r.p403c.C4638h.m10273b(r11)     // Catch:{ IOException -> 0x0090, all -> 0x008e }
            throw r12
        L_0x008e:
            r1 = move-exception
            goto L_0x00ad
        L_0x0090:
            r0 = move-exception
            r1 = 1
            v.m0.d.m r2 = r14.f11006e     // Catch:{ all -> 0x00a9 }
            if (r2 == 0) goto L_0x00a5
            java.io.IOException r0 = r2.mo11148a(r0)     // Catch:{ all -> 0x00a9 }
            if (r0 != 0) goto L_0x00a4
            u.i r0 = new u.i     // Catch:{ all -> 0x00a9 }
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Throwable"
            r0.<init>(r2)     // Catch:{ all -> 0x00a9 }
            throw r0     // Catch:{ all -> 0x00a9 }
        L_0x00a4:
            throw r0     // Catch:{ all -> 0x00a9 }
        L_0x00a5:
            p392u.p401r.p403c.C4638h.m10273b(r11)     // Catch:{ all -> 0x00a9 }
            throw r12
        L_0x00a9:
            r0 = move-exception
            r13 = r1
            r1 = r0
            r0 = r13
        L_0x00ad:
            if (r0 != 0) goto L_0x00ba
            v.m0.d.m r0 = r14.f11006e
            if (r0 != 0) goto L_0x00b7
            p392u.p401r.p403c.C4638h.m10273b(r11)
            throw r12
        L_0x00b7:
            r0.mo11148a(r12)
        L_0x00ba:
            throw r1
        L_0x00bb:
            p392u.p401r.p403c.C4638h.m10273b(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p410v.C4702d0.mo11000b():v.i0");
    }

    /* renamed from: c */
    public final String mo11001c() {
        StringBuilder sb = new StringBuilder();
        C4768m mVar = this.f11006e;
        if (mVar != null) {
            sb.append(mVar.mo11157e() ? "canceled " : Objects.EMPTY_STRING);
            sb.append(this.f11010i ? "web socket" : "call");
            sb.append(" to ");
            sb.append(this.f11009h.f11029b.mo11395g());
            return sb.toString();
        }
        C4638h.m10273b("transmitter");
        throw null;
    }

    public void cancel() {
        C4768m mVar = this.f11006e;
        if (mVar != null) {
            mVar.mo11154b();
        } else {
            C4638h.m10273b("transmitter");
            throw null;
        }
    }

    public Object clone() {
        return m10362a(this.f11008g, this.f11009h, this.f11010i);
    }

    /* renamed from: f */
    public C4720i0 mo11004f() {
        synchronized (this) {
            if (!this.f11007f) {
                this.f11007f = true;
            } else {
                throw new IllegalStateException("Already Executed".toString());
            }
        }
        C4768m mVar = this.f11006e;
        if (mVar != null) {
            mVar.f11279c.mo11417f();
            C4768m mVar2 = this.f11006e;
            if (mVar2 != null) {
                mVar2.mo11152a();
                try {
                    this.f11008g.f10917e.mo11349a(this);
                    return mo11000b();
                } finally {
                    C4859q qVar = this.f11008g.f10917e;
                    qVar.mo11347a(qVar.f11594f, this);
                }
            } else {
                C4638h.m10273b("transmitter");
                throw null;
            }
        } else {
            C4638h.m10273b("transmitter");
            throw null;
        }
    }

    /* renamed from: g */
    public C4706e0 mo11005g() {
        return this.f11009h;
    }

    /* renamed from: h */
    public boolean mo11006h() {
        C4768m mVar = this.f11006e;
        if (mVar != null) {
            return mVar.mo11157e();
        }
        C4638h.m10273b("transmitter");
        throw null;
    }

    /* renamed from: a */
    public static final C4702d0 m10362a(C4690b0 b0Var, C4706e0 e0Var, boolean z) {
        if (b0Var == null) {
            C4638h.m10271a("client");
            throw null;
        } else if (e0Var != null) {
            C4702d0 d0Var = new C4702d0(b0Var, e0Var, z, null);
            d0Var.f11006e = new C4768m(b0Var, d0Var);
            return d0Var;
        } else {
            C4638h.m10271a("originalRequest");
            throw null;
        }
    }
}
