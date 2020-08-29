package p410v.p411m0.p415f;

import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy.Type;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.C4557i;
import p392u.p401r.p403c.C4638h;
import p392u.p409w.C4681g;
import p410v.C4690b0;
import p410v.C4706e0;
import p410v.C4716h0;
import p410v.C4720i0;
import p410v.C4858p;
import p410v.C4870w;
import p410v.C4870w.C4871a;
import p410v.C4873x;
import p410v.p411m0.C4737b;
import p410v.p411m0.p413d.C4761h;
import p410v.p411m0.p414e.C4775d;
import p410v.p411m0.p414e.C4776e;
import p423w.C4882a0;
import p423w.C4886b0;
import p423w.C4892f;
import p423w.C4895h;
import p423w.C4896i;
import p423w.C4901m;
import p423w.C4915y;

/* renamed from: v.m0.f.a */
public final class C4782a implements C4775d {

    /* renamed from: a */
    public int f11316a;

    /* renamed from: b */
    public long f11317b;

    /* renamed from: c */
    public C4870w f11318c;

    /* renamed from: d */
    public final C4690b0 f11319d;

    /* renamed from: e */
    public final C4761h f11320e;

    /* renamed from: f */
    public final C4896i f11321f;

    /* renamed from: g */
    public final C4895h f11322g;

    /* renamed from: v.m0.f.a$a */
    public abstract class C4783a implements C4882a0 {

        /* renamed from: e */
        public final C4901m f11323e;

        /* renamed from: f */
        public boolean f11324f;

        public C4783a() {
            this.f11323e = new C4901m(C4782a.this.f11321f.mo11078b());
        }

        /* renamed from: a */
        public final void mo11185a() {
            C4782a aVar = C4782a.this;
            int i = aVar.f11316a;
            if (i != 6) {
                if (i == 5) {
                    C4782a.m10601a(aVar, this.f11323e);
                    C4782a.this.f11316a = 6;
                    return;
                }
                StringBuilder a = C1965a.m4756a("state: ");
                a.append(C4782a.this.f11316a);
                throw new IllegalStateException(a.toString());
            }
        }

        /* renamed from: b */
        public long mo11077b(C4892f fVar, long j) {
            if (fVar != null) {
                try {
                    return C4782a.this.f11321f.mo11077b(fVar, j);
                } catch (IOException e) {
                    C4761h hVar = C4782a.this.f11320e;
                    if (hVar == null) {
                        C4638h.m10269a();
                        throw null;
                    }
                    hVar.mo11132c();
                    mo11185a();
                    throw e;
                }
            } else {
                C4638h.m10271a("sink");
                throw null;
            }
        }

        /* renamed from: b */
        public C4886b0 mo11078b() {
            return this.f11323e;
        }
    }

    /* renamed from: v.m0.f.a$b */
    public final class C4784b implements C4915y {

        /* renamed from: e */
        public final C4901m f11326e;

        /* renamed from: f */
        public boolean f11327f;

        public C4784b() {
            this.f11326e = new C4901m(C4782a.this.f11322g.mo11186b());
        }

        /* renamed from: a */
        public void mo11105a(C4892f fVar, long j) {
            if (fVar == null) {
                C4638h.m10271a("source");
                throw null;
            } else if (!(!this.f11327f)) {
                throw new IllegalStateException("closed".toString());
            } else if (j != 0) {
                C4782a.this.f11322g.mo11439a(j);
                String str = "\r\n";
                C4782a.this.f11322g.mo11440a(str);
                C4782a.this.f11322g.mo11105a(fVar, j);
                C4782a.this.f11322g.mo11440a(str);
            }
        }

        /* renamed from: b */
        public C4886b0 mo11186b() {
            return this.f11326e;
        }

        public synchronized void close() {
            if (!this.f11327f) {
                this.f11327f = true;
                C4782a.this.f11322g.mo11440a("0\r\n\r\n");
                C4782a.m10601a(C4782a.this, this.f11326e);
                C4782a.this.f11316a = 3;
            }
        }

        public synchronized void flush() {
            if (!this.f11327f) {
                C4782a.this.f11322g.flush();
            }
        }
    }

    /* renamed from: v.m0.f.a$c */
    public final class C4785c extends C4783a {

        /* renamed from: h */
        public long f11329h;

        /* renamed from: i */
        public boolean f11330i;

        /* renamed from: j */
        public final C4873x f11331j;

        /* renamed from: k */
        public final /* synthetic */ C4782a f11332k;

        public C4785c(C4782a aVar, C4873x xVar) {
            if (xVar != null) {
                this.f11332k = aVar;
                super();
                this.f11331j = xVar;
                this.f11329h = -1;
                this.f11330i = true;
                return;
            }
            C4638h.m10271a("url");
            throw null;
        }

        /* renamed from: b */
        public long mo11077b(C4892f fVar, long j) {
            if (fVar != null) {
                boolean z = true;
                if (!(j >= 0)) {
                    throw new IllegalArgumentException(C1965a.m4748a("byteCount < 0: ", j).toString());
                } else if (!(!this.f11324f)) {
                    throw new IllegalStateException("closed".toString());
                } else if (!this.f11330i) {
                    return -1;
                } else {
                    long j2 = this.f11329h;
                    if (j2 == 0 || j2 == -1) {
                        if (this.f11329h != -1) {
                            this.f11332k.f11321f.mo11450d();
                        }
                        try {
                            this.f11329h = this.f11332k.f11321f.mo11467p();
                            String d = this.f11332k.f11321f.mo11450d();
                            if (d != null) {
                                String obj = C4681g.m10328c(d).toString();
                                if (this.f11329h >= 0) {
                                    if (obj.length() <= 0) {
                                        z = false;
                                    }
                                    if (!z || C4681g.m10327b(obj, ";", false, 2)) {
                                        if (this.f11329h == 0) {
                                            this.f11330i = false;
                                            C4782a aVar = this.f11332k;
                                            aVar.f11318c = aVar.mo11184e();
                                            C4782a aVar2 = this.f11332k;
                                            C4690b0 b0Var = aVar2.f11319d;
                                            if (b0Var != null) {
                                                C4858p pVar = b0Var.f10926n;
                                                C4873x xVar = this.f11331j;
                                                C4870w wVar = aVar2.f11318c;
                                                if (wVar != null) {
                                                    C4776e.m10582a(pVar, xVar, wVar);
                                                    mo11185a();
                                                } else {
                                                    C4638h.m10269a();
                                                    throw null;
                                                }
                                            } else {
                                                C4638h.m10269a();
                                                throw null;
                                            }
                                        }
                                        if (!this.f11330i) {
                                            return -1;
                                        }
                                    }
                                }
                                StringBuilder sb = new StringBuilder();
                                sb.append("expected chunk size and optional extensions");
                                sb.append(" but was \"");
                                sb.append(this.f11329h);
                                sb.append(obj);
                                sb.append('\"');
                                throw new ProtocolException(sb.toString());
                            }
                            throw new C4557i("null cannot be cast to non-null type kotlin.CharSequence");
                        } catch (NumberFormatException e) {
                            throw new ProtocolException(e.getMessage());
                        }
                    }
                    long b = super.mo11077b(fVar, Math.min(j, this.f11329h));
                    if (b == -1) {
                        C4761h hVar = this.f11332k.f11320e;
                        if (hVar == null) {
                            C4638h.m10269a();
                            throw null;
                        }
                        hVar.mo11132c();
                        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                        mo11185a();
                        throw protocolException;
                    }
                    this.f11329h -= b;
                    return b;
                }
            } else {
                C4638h.m10271a("sink");
                throw null;
            }
        }

        public void close() {
            if (!this.f11324f) {
                if (this.f11330i && !C4737b.m10469a((C4882a0) this, 100, TimeUnit.MILLISECONDS)) {
                    C4761h hVar = this.f11332k.f11320e;
                    if (hVar != null) {
                        hVar.mo11132c();
                        mo11185a();
                    } else {
                        C4638h.m10269a();
                        throw null;
                    }
                }
                this.f11324f = true;
            }
        }
    }

    /* renamed from: v.m0.f.a$d */
    public final class C4786d extends C4783a {

        /* renamed from: h */
        public long f11333h;

        public C4786d(long j) {
            super();
            this.f11333h = j;
            if (j == 0) {
                mo11185a();
            }
        }

        /* renamed from: b */
        public long mo11077b(C4892f fVar, long j) {
            if (fVar != null) {
                if (!(j >= 0)) {
                    throw new IllegalArgumentException(C1965a.m4748a("byteCount < 0: ", j).toString());
                } else if (!this.f11324f) {
                    long j2 = this.f11333h;
                    if (j2 == 0) {
                        return -1;
                    }
                    long b = super.mo11077b(fVar, Math.min(j2, j));
                    if (b == -1) {
                        C4761h hVar = C4782a.this.f11320e;
                        if (hVar == null) {
                            C4638h.m10269a();
                            throw null;
                        }
                        hVar.mo11132c();
                        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                        mo11185a();
                        throw protocolException;
                    }
                    long j3 = this.f11333h - b;
                    this.f11333h = j3;
                    if (j3 == 0) {
                        mo11185a();
                    }
                    return b;
                } else {
                    throw new IllegalStateException("closed".toString());
                }
            } else {
                C4638h.m10271a("sink");
                throw null;
            }
        }

        public void close() {
            if (!this.f11324f) {
                if (this.f11333h != 0 && !C4737b.m10469a((C4882a0) this, 100, TimeUnit.MILLISECONDS)) {
                    C4761h hVar = C4782a.this.f11320e;
                    if (hVar != null) {
                        hVar.mo11132c();
                        mo11185a();
                    } else {
                        C4638h.m10269a();
                        throw null;
                    }
                }
                this.f11324f = true;
            }
        }
    }

    /* renamed from: v.m0.f.a$e */
    public final class C4787e implements C4915y {

        /* renamed from: e */
        public final C4901m f11335e;

        /* renamed from: f */
        public boolean f11336f;

        public C4787e() {
            this.f11335e = new C4901m(C4782a.this.f11322g.mo11186b());
        }

        /* renamed from: a */
        public void mo11105a(C4892f fVar, long j) {
            if (fVar == null) {
                C4638h.m10271a("source");
                throw null;
            } else if (!this.f11336f) {
                C4737b.m10462a(fVar.f11661f, 0, j);
                C4782a.this.f11322g.mo11105a(fVar, j);
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        /* renamed from: b */
        public C4886b0 mo11186b() {
            return this.f11335e;
        }

        public void close() {
            if (!this.f11336f) {
                this.f11336f = true;
                C4782a.m10601a(C4782a.this, this.f11335e);
                C4782a.this.f11316a = 3;
            }
        }

        public void flush() {
            if (!this.f11336f) {
                C4782a.this.f11322g.flush();
            }
        }
    }

    /* renamed from: v.m0.f.a$f */
    public final class C4788f extends C4783a {

        /* renamed from: h */
        public boolean f11338h;

        public C4788f(C4782a aVar) {
            super();
        }

        /* renamed from: b */
        public long mo11077b(C4892f fVar, long j) {
            if (fVar != null) {
                if (!(j >= 0)) {
                    throw new IllegalArgumentException(C1965a.m4748a("byteCount < 0: ", j).toString());
                } else if (!(!this.f11324f)) {
                    throw new IllegalStateException("closed".toString());
                } else if (this.f11338h) {
                    return -1;
                } else {
                    long b = super.mo11077b(fVar, j);
                    if (b != -1) {
                        return b;
                    }
                    this.f11338h = true;
                    mo11185a();
                    return -1;
                }
            } else {
                C4638h.m10271a("sink");
                throw null;
            }
        }

        public void close() {
            if (!this.f11324f) {
                if (!this.f11338h) {
                    mo11185a();
                }
                this.f11324f = true;
            }
        }
    }

    public C4782a(C4690b0 b0Var, C4761h hVar, C4896i iVar, C4895h hVar2) {
        if (iVar == null) {
            C4638h.m10271a("source");
            throw null;
        } else if (hVar2 != null) {
            this.f11319d = b0Var;
            this.f11320e = hVar;
            this.f11321f = iVar;
            this.f11322g = hVar2;
            this.f11317b = (long) 262144;
        } else {
            C4638h.m10271a("sink");
            throw null;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ void m10601a(C4782a aVar, C4901m mVar) {
        if (aVar != null) {
            C4886b0 b0Var = mVar.f11671e;
            mVar.f11671e = C4886b0.f11649d;
            b0Var.mo11423a();
            b0Var.mo11426b();
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public C4761h mo11163a() {
        return this.f11320e;
    }

    /* renamed from: a */
    public final C4882a0 mo11181a(long j) {
        if (this.f11316a == 4) {
            this.f11316a = 5;
            return new C4786d(j);
        }
        StringBuilder a = C1965a.m4756a("state: ");
        a.append(this.f11316a);
        throw new IllegalStateException(a.toString().toString());
    }

    /* renamed from: b */
    public C4882a0 mo11166b(C4720i0 i0Var) {
        if (i0Var == null) {
            C4638h.m10271a("response");
            throw null;
        } else if (!C4776e.m10583a(i0Var)) {
            return mo11181a(0);
        } else {
            boolean z = true;
            String str = "state: ";
            if (C4681g.m10322a("chunked", C4720i0.m10406a(i0Var, "Transfer-Encoding", null, 2), true)) {
                C4873x xVar = i0Var.f11060f.f11029b;
                if (this.f11316a != 4) {
                    z = false;
                }
                if (z) {
                    this.f11316a = 5;
                    return new C4785c(this, xVar);
                }
                StringBuilder a = C1965a.m4756a(str);
                a.append(this.f11316a);
                throw new IllegalStateException(a.toString().toString());
            }
            long a2 = C4737b.m10454a(i0Var);
            if (a2 != -1) {
                return mo11181a(a2);
            }
            if (this.f11316a != 4) {
                z = false;
            }
            if (z) {
                this.f11316a = 5;
                C4761h hVar = this.f11320e;
                if (hVar != null) {
                    hVar.mo11132c();
                    return new C4788f(this);
                }
                C4638h.m10269a();
                throw null;
            }
            StringBuilder a3 = C1965a.m4756a(str);
            a3.append(this.f11316a);
            throw new IllegalStateException(a3.toString().toString());
        }
    }

    /* renamed from: b */
    public void mo11167b() {
        this.f11322g.flush();
    }

    /* renamed from: c */
    public void mo11168c() {
        this.f11322g.flush();
    }

    public void cancel() {
        C4761h hVar = this.f11320e;
        if (hVar != null) {
            Socket socket = hVar.f11240b;
            if (socket != null) {
                C4737b.m10465a(socket);
            }
        }
    }

    /* renamed from: d */
    public final String mo11183d() {
        String f = this.f11321f.mo11454f(this.f11317b);
        this.f11317b -= (long) f.length();
        return f;
    }

    /* renamed from: e */
    public final C4870w mo11184e() {
        C4871a aVar = new C4871a();
        while (true) {
            String d = mo11183d();
            if (!(d.length() > 0)) {
                return aVar.mo11378a();
            }
            aVar.mo11376a(d);
        }
    }

    /* renamed from: a */
    public C4915y mo11164a(C4706e0 e0Var, long j) {
        if (e0Var != null) {
            C4716h0 h0Var = e0Var.f11032e;
            if (h0Var == null || h0Var != null) {
                boolean z = true;
                String str = "state: ";
                if (C4681g.m10322a("chunked", e0Var.mo11012a("Transfer-Encoding"), true)) {
                    if (this.f11316a != 1) {
                        z = false;
                    }
                    if (z) {
                        this.f11316a = 2;
                        return new C4784b();
                    }
                    StringBuilder a = C1965a.m4756a(str);
                    a.append(this.f11316a);
                    throw new IllegalStateException(a.toString().toString());
                } else if (j != -1) {
                    if (this.f11316a != 1) {
                        z = false;
                    }
                    if (z) {
                        this.f11316a = 2;
                        return new C4787e();
                    }
                    StringBuilder a2 = C1965a.m4756a(str);
                    a2.append(this.f11316a);
                    throw new IllegalStateException(a2.toString().toString());
                } else {
                    throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
                }
            } else {
                throw null;
            }
        } else {
            C4638h.m10271a("request");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
        if (r0 != null) goto L_0x005d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p410v.C4720i0.C4721a mo11162a(boolean r5) {
        /*
            r4 = this;
            int r0 = r4.f11316a
            r1 = 3
            r2 = 1
            if (r0 == r2) goto L_0x000a
            if (r0 != r1) goto L_0x0009
            goto L_0x000a
        L_0x0009:
            r2 = 0
        L_0x000a:
            if (r2 == 0) goto L_0x0069
            java.lang.String r0 = r4.mo11183d()     // Catch:{ EOFException -> 0x0043 }
            v.m0.e.j r0 = p410v.p411m0.p414e.C4781j.m10600a(r0)     // Catch:{ EOFException -> 0x0043 }
            v.i0$a r2 = new v.i0$a     // Catch:{ EOFException -> 0x0043 }
            r2.<init>()     // Catch:{ EOFException -> 0x0043 }
            v.c0 r3 = r0.f11313a     // Catch:{ EOFException -> 0x0043 }
            r2.mo11038a(r3)     // Catch:{ EOFException -> 0x0043 }
            int r3 = r0.f11314b     // Catch:{ EOFException -> 0x0043 }
            r2.f11075c = r3     // Catch:{ EOFException -> 0x0043 }
            java.lang.String r3 = r0.f11315c     // Catch:{ EOFException -> 0x0043 }
            r2.mo11036a(r3)     // Catch:{ EOFException -> 0x0043 }
            v.w r3 = r4.mo11184e()     // Catch:{ EOFException -> 0x0043 }
            r2.mo11041a(r3)     // Catch:{ EOFException -> 0x0043 }
            r3 = 100
            if (r5 == 0) goto L_0x0038
            int r5 = r0.f11314b     // Catch:{ EOFException -> 0x0043 }
            if (r5 != r3) goto L_0x0038
            r2 = 0
            goto L_0x0042
        L_0x0038:
            int r5 = r0.f11314b     // Catch:{ EOFException -> 0x0043 }
            if (r5 != r3) goto L_0x003f
            r4.f11316a = r1     // Catch:{ EOFException -> 0x0043 }
            goto L_0x0042
        L_0x003f:
            r5 = 4
            r4.f11316a = r5     // Catch:{ EOFException -> 0x0043 }
        L_0x0042:
            return r2
        L_0x0043:
            r5 = move-exception
            v.m0.d.h r0 = r4.f11320e
            if (r0 == 0) goto L_0x005b
            v.k0 r0 = r0.f11255q
            if (r0 == 0) goto L_0x005b
            v.a r0 = r0.f11115a
            if (r0 == 0) goto L_0x005b
            v.x r0 = r0.f10881a
            if (r0 == 0) goto L_0x005b
            java.lang.String r0 = r0.mo11395g()
            if (r0 == 0) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            java.lang.String r0 = "unknown"
        L_0x005d:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "unexpected end of stream on "
            java.lang.String r0 = p213q.p214a.p215a.p216a.C1965a.m4751a(r2, r0)
            r1.<init>(r0, r5)
            throw r1
        L_0x0069:
            java.lang.String r5 = "state: "
            java.lang.StringBuilder r5 = p213q.p214a.p215a.p216a.C1965a.m4756a(r5)
            int r0 = r4.f11316a
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p410v.p411m0.p415f.C4782a.mo11162a(boolean):v.i0$a");
    }

    /* renamed from: a */
    public long mo11161a(C4720i0 i0Var) {
        if (i0Var == null) {
            C4638h.m10271a("response");
            throw null;
        } else if (!C4776e.m10583a(i0Var)) {
            return 0;
        } else {
            if (C4681g.m10322a("chunked", C4720i0.m10406a(i0Var, "Transfer-Encoding", null, 2), true)) {
                return -1;
            }
            return C4737b.m10454a(i0Var);
        }
    }

    /* renamed from: a */
    public final void mo11182a(C4870w wVar, String str) {
        if (wVar == null) {
            C4638h.m10271a("headers");
            throw null;
        } else if (str != null) {
            if (this.f11316a == 0) {
                String str2 = "\r\n";
                this.f11322g.mo11440a(str).mo11440a(str2);
                int size = wVar.size();
                for (int i = 0; i < size; i++) {
                    this.f11322g.mo11440a(wVar.mo11369e(i)).mo11440a(": ").mo11440a(wVar.mo11371f(i)).mo11440a(str2);
                }
                this.f11322g.mo11440a(str2);
                this.f11316a = 1;
                return;
            }
            StringBuilder a = C1965a.m4756a("state: ");
            a.append(this.f11316a);
            throw new IllegalStateException(a.toString().toString());
        } else {
            C4638h.m10271a("requestLine");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo11165a(C4706e0 e0Var) {
        if (e0Var != null) {
            C4761h hVar = this.f11320e;
            if (hVar != null) {
                Type type = hVar.f11255q.f11116b.type();
                C4638h.m10270a((Object) type, "realConnection!!.route().proxy.type()");
                StringBuilder sb = new StringBuilder();
                sb.append(e0Var.f11030c);
                sb.append(' ');
                if (!e0Var.f11029b.f11616a && type == Type.HTTP) {
                    sb.append(e0Var.f11029b);
                } else {
                    C4873x xVar = e0Var.f11029b;
                    if (xVar != null) {
                        String b = xVar.mo11388b();
                        String d = xVar.mo11391d();
                        if (d != null) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(b);
                            sb2.append('?');
                            sb2.append(d);
                            b = sb2.toString();
                        }
                        sb.append(b);
                    } else {
                        C4638h.m10271a("url");
                        throw null;
                    }
                }
                sb.append(" HTTP/1.1");
                String sb3 = sb.toString();
                C4638h.m10270a((Object) sb3, "StringBuilder().apply(builderAction).toString()");
                mo11182a(e0Var.f11031d, sb3);
                return;
            }
            C4638h.m10269a();
            throw null;
        }
        C4638h.m10271a("request");
        throw null;
    }
}
