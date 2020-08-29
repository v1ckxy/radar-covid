package p410v.p411m0.p413d;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.C4557i;
import p392u.C4561m;
import p392u.p401r.p403c.C4638h;
import p410v.C4690b0;
import p410v.C4694c0;
import p410v.C4729k;
import p410v.C4730k0;
import p410v.C4866v;
import p410v.C4873x;
import p410v.C4877y.C4878a;
import p410v.p411m0.p414e.C4775d;
import p410v.p411m0.p415f.C4782a;
import p410v.p411m0.p416g.C4789a;
import p410v.p411m0.p416g.C4790b;
import p410v.p411m0.p416g.C4797f;
import p410v.p411m0.p416g.C4797f.C4799b;
import p410v.p411m0.p416g.C4797f.C4800c;
import p410v.p411m0.p416g.C4797f.C4802d;
import p410v.p411m0.p416g.C4813j;
import p410v.p411m0.p416g.C4817l;
import p410v.p411m0.p416g.C4826r;
import p410v.p411m0.p421k.C4852d;
import p423w.C4895h;
import p423w.C4896i;

/* renamed from: v.m0.d.h */
public final class C4761h extends C4800c implements C4729k {

    /* renamed from: b */
    public Socket f11240b;

    /* renamed from: c */
    public Socket f11241c;

    /* renamed from: d */
    public C4866v f11242d;

    /* renamed from: e */
    public C4694c0 f11243e;

    /* renamed from: f */
    public C4797f f11244f;

    /* renamed from: g */
    public C4896i f11245g;

    /* renamed from: h */
    public C4895h f11246h;

    /* renamed from: i */
    public boolean f11247i;

    /* renamed from: j */
    public int f11248j;

    /* renamed from: k */
    public int f11249k;

    /* renamed from: l */
    public int f11250l;

    /* renamed from: m */
    public int f11251m;

    /* renamed from: n */
    public final List<Reference<C4768m>> f11252n;

    /* renamed from: o */
    public long f11253o;

    /* renamed from: p */
    public final C4762i f11254p;

    /* renamed from: q */
    public final C4730k0 f11255q;

    public C4761h(C4762i iVar, C4730k0 k0Var) {
        if (iVar == null) {
            C4638h.m10271a("connectionPool");
            throw null;
        } else if (k0Var != null) {
            this.f11254p = iVar;
            this.f11255q = k0Var;
            this.f11251m = 1;
            this.f11252n = new ArrayList();
            this.f11253o = RecyclerView.FOREVER_NS;
        } else {
            C4638h.m10271a("route");
            throw null;
        }
    }

    /* renamed from: a */
    public C4694c0 mo11054a() {
        C4694c0 c0Var = this.f11243e;
        if (c0Var != null) {
            return c0Var;
        }
        C4638h.m10269a();
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x014a A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11123a(int r16, int r17, int r18, int r19, boolean r20, p410v.C4708f r21, p410v.C4861t r22) {
        /*
            r15 = this;
            r7 = r15
            r8 = r21
            r9 = r22
            r10 = 0
            if (r8 == 0) goto L_0x016f
            if (r9 == 0) goto L_0x0169
            v.c0 r0 = r7.f11243e
            r11 = 1
            r12 = 0
            if (r0 != 0) goto L_0x0012
            r0 = r11
            goto L_0x0013
        L_0x0012:
            r0 = r12
        L_0x0013:
            if (r0 == 0) goto L_0x015d
            v.k0 r0 = r7.f11255q
            v.a r0 = r0.f11115a
            java.util.List<v.m> r0 = r0.f10883c
            v.m0.d.b r13 = new v.m0.d.b
            r13.<init>(r0)
            v.k0 r1 = r7.f11255q
            v.a r1 = r1.f11115a
            javax.net.ssl.SSLSocketFactory r2 = r1.f10886f
            if (r2 != 0) goto L_0x0063
            v.m r1 = p410v.C4734m.f11130h
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0056
            v.k0 r0 = r7.f11255q
            v.a r0 = r0.f11115a
            v.x r0 = r0.f10881a
            java.lang.String r0 = r0.f11620e
            v.m0.i.f$a r1 = p410v.p411m0.p418i.C4839f.f11548c
            v.m0.i.f r1 = p410v.p411m0.p418i.C4839f.f11546a
            boolean r1 = r1.mo11305b(r0)
            if (r1 == 0) goto L_0x0043
            goto L_0x006d
        L_0x0043:
            v.m0.d.k r1 = new v.m0.d.k
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.String r3 = "CLEARTEXT communication to "
            java.lang.String r4 = " not permitted by network security policy"
            java.lang.String r0 = p213q.p214a.p215a.p216a.C1965a.m4752a(r3, r0, r4)
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x0056:
            v.m0.d.k r0 = new v.m0.d.k
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0063:
            java.util.List<v.c0> r0 = r1.f10882b
            v.c0 r1 = p410v.C4694c0.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0150
        L_0x006d:
            r14 = r10
        L_0x006e:
            v.k0 r0 = r7.f11255q     // Catch:{ IOException -> 0x00d8 }
            boolean r0 = r0.mo11055a()     // Catch:{ IOException -> 0x00d8 }
            if (r0 == 0) goto L_0x008e
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r21
            r6 = r22
            r1.mo11124a(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00d8 }
            java.net.Socket r0 = r7.f11240b     // Catch:{ IOException -> 0x00d8 }
            if (r0 != 0) goto L_0x0089
            goto L_0x00a5
        L_0x0089:
            r1 = r16
            r2 = r17
            goto L_0x0095
        L_0x008e:
            r1 = r16
            r2 = r17
            r15.mo11125a(r1, r2, r8, r9)     // Catch:{ IOException -> 0x00d4 }
        L_0x0095:
            r3 = r19
            r15.mo11127a(r13, r3, r8, r9)     // Catch:{ IOException -> 0x00d2 }
            v.k0 r0 = r7.f11255q     // Catch:{ IOException -> 0x00d2 }
            java.net.InetSocketAddress r0 = r0.f11117c     // Catch:{ IOException -> 0x00d2 }
            v.k0 r4 = r7.f11255q     // Catch:{ IOException -> 0x00d2 }
            java.net.Proxy r4 = r4.f11116b     // Catch:{ IOException -> 0x00d2 }
            r9.mo11355a(r8, r0, r4)     // Catch:{ IOException -> 0x00d2 }
        L_0x00a5:
            v.k0 r0 = r7.f11255q
            boolean r0 = r0.mo11055a()
            if (r0 == 0) goto L_0x00bf
            java.net.Socket r0 = r7.f11240b
            if (r0 == 0) goto L_0x00b2
            goto L_0x00bf
        L_0x00b2:
            v.m0.d.k r0 = new v.m0.d.k
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.String r2 = "Too many tunnel connections attempted: 21"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x00bf:
            v.m0.g.f r0 = r7.f11244f
            if (r0 == 0) goto L_0x00d1
            v.m0.d.i r1 = r7.f11254p
            monitor-enter(r1)
            int r0 = r0.mo11220f()     // Catch:{ all -> 0x00ce }
            r7.f11251m = r0     // Catch:{ all -> 0x00ce }
            monitor-exit(r1)
            goto L_0x00d1
        L_0x00ce:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x00d1:
            return
        L_0x00d2:
            r0 = move-exception
            goto L_0x00de
        L_0x00d4:
            r0 = move-exception
        L_0x00d5:
            r3 = r19
            goto L_0x00de
        L_0x00d8:
            r0 = move-exception
            r1 = r16
            r2 = r17
            goto L_0x00d5
        L_0x00de:
            java.net.Socket r4 = r7.f11241c
            if (r4 == 0) goto L_0x00e5
            p410v.p411m0.C4737b.m10465a(r4)
        L_0x00e5:
            java.net.Socket r4 = r7.f11240b
            if (r4 == 0) goto L_0x00ec
            p410v.p411m0.C4737b.m10465a(r4)
        L_0x00ec:
            r7.f11241c = r10
            r7.f11240b = r10
            r7.f11245g = r10
            r7.f11246h = r10
            r7.f11242d = r10
            r7.f11243e = r10
            r7.f11244f = r10
            v.k0 r4 = r7.f11255q
            java.net.InetSocketAddress r5 = r4.f11117c
            java.net.Proxy r4 = r4.f11116b
            if (r5 == 0) goto L_0x014a
            if (r4 == 0) goto L_0x0144
            if (r14 != 0) goto L_0x010c
            v.m0.d.k r14 = new v.m0.d.k
            r14.<init>(r0)
            goto L_0x0113
        L_0x010c:
            java.io.IOException r4 = r14.f11266f
            r4.addSuppressed(r0)
            r14.f11265e = r0
        L_0x0113:
            if (r20 == 0) goto L_0x0143
            r13.f11206c = r11
            boolean r4 = r13.f11205b
            if (r4 != 0) goto L_0x011c
            goto L_0x013e
        L_0x011c:
            boolean r4 = r0 instanceof java.net.ProtocolException
            if (r4 == 0) goto L_0x0121
            goto L_0x013e
        L_0x0121:
            boolean r4 = r0 instanceof java.io.InterruptedIOException
            if (r4 == 0) goto L_0x0126
            goto L_0x013e
        L_0x0126:
            boolean r4 = r0 instanceof javax.net.ssl.SSLHandshakeException
            if (r4 == 0) goto L_0x0133
            java.lang.Throwable r4 = r0.getCause()
            boolean r4 = r4 instanceof java.security.cert.CertificateException
            if (r4 == 0) goto L_0x0133
            goto L_0x013e
        L_0x0133:
            boolean r4 = r0 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r4 == 0) goto L_0x0138
            goto L_0x013e
        L_0x0138:
            boolean r0 = r0 instanceof javax.net.ssl.SSLException
            if (r0 == 0) goto L_0x013e
            r0 = r11
            goto L_0x013f
        L_0x013e:
            r0 = r12
        L_0x013f:
            if (r0 == 0) goto L_0x0143
            goto L_0x006e
        L_0x0143:
            throw r14
        L_0x0144:
            java.lang.String r0 = "proxy"
            p392u.p401r.p403c.C4638h.m10271a(r0)
            throw r10
        L_0x014a:
            java.lang.String r0 = "inetSocketAddress"
            p392u.p401r.p403c.C4638h.m10271a(r0)
            throw r10
        L_0x0150:
            v.m0.d.k r0 = new v.m0.d.k
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x015d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0169:
            java.lang.String r0 = "eventListener"
            p392u.p401r.p403c.C4638h.m10271a(r0)
            throw r10
        L_0x016f:
            java.lang.String r0 = "call"
            p392u.p401r.p403c.C4638h.m10271a(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p410v.p411m0.p413d.C4761h.mo11123a(int, int, int, int, boolean, v.f, v.t):void");
    }

    /* renamed from: a */
    public final void mo11126a(IOException iOException) {
        int i;
        boolean z = !Thread.holdsLock(this.f11254p);
        if (!C4561m.f10774a || z) {
            synchronized (this.f11254p) {
                if (iOException instanceof C4826r) {
                    int ordinal = ((C4826r) iOException).f11519e.ordinal();
                    if (ordinal == 4) {
                        int i2 = this.f11250l + 1;
                        this.f11250l = i2;
                        if (i2 > 1) {
                            this.f11247i = true;
                            i = this.f11248j;
                        }
                    } else if (ordinal != 5) {
                        this.f11247i = true;
                        i = this.f11248j;
                    }
                } else if (!mo11131b() || (iOException instanceof C4789a)) {
                    this.f11247i = true;
                    if (this.f11249k == 0) {
                        if (iOException != null) {
                            this.f11254p.mo11138a(this.f11255q, iOException);
                        }
                        i = this.f11248j;
                    }
                }
                this.f11248j = i + 1;
            }
            return;
        }
        throw new AssertionError("Assertion failed");
    }

    /* renamed from: b */
    public final boolean mo11131b() {
        return this.f11244f != null;
    }

    /* renamed from: c */
    public final void mo11132c() {
        boolean z = !Thread.holdsLock(this.f11254p);
        if (!C4561m.f10774a || z) {
            synchronized (this.f11254p) {
                this.f11247i = true;
            }
            return;
        }
        throw new AssertionError("Assertion failed");
    }

    /* renamed from: d */
    public Socket mo11133d() {
        Socket socket = this.f11241c;
        if (socket != null) {
            return socket;
        }
        C4638h.m10269a();
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0049, code lost:
        if (r1 != null) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r2 = this;
            java.lang.String r0 = "Connection{"
            java.lang.StringBuilder r0 = p213q.p214a.p215a.p216a.C1965a.m4756a(r0)
            v.k0 r1 = r2.f11255q
            v.a r1 = r1.f11115a
            v.x r1 = r1.f10881a
            java.lang.String r1 = r1.f11620e
            r0.append(r1)
            r1 = 58
            r0.append(r1)
            v.k0 r1 = r2.f11255q
            v.a r1 = r1.f11115a
            v.x r1 = r1.f10881a
            int r1 = r1.f11621f
            r0.append(r1)
            r1 = 44
            r0.append(r1)
            java.lang.String r1 = " proxy="
            r0.append(r1)
            v.k0 r1 = r2.f11255q
            java.net.Proxy r1 = r1.f11116b
            r0.append(r1)
            java.lang.String r1 = " hostAddress="
            r0.append(r1)
            v.k0 r1 = r2.f11255q
            java.net.InetSocketAddress r1 = r1.f11117c
            r0.append(r1)
            java.lang.String r1 = " cipherSuite="
            r0.append(r1)
            v.v r1 = r2.f11242d
            if (r1 == 0) goto L_0x004c
            v.j r1 = r1.f11607c
            if (r1 == 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            java.lang.String r1 = "none"
        L_0x004e:
            r0.append(r1)
            java.lang.String r1 = " protocol="
            r0.append(r1)
            v.c0 r1 = r2.f11243e
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p410v.p411m0.p413d.C4761h.toString():java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0094  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11125a(int r6, int r7, p410v.C4708f r8, p410v.C4861t r9) {
        /*
            r5 = this;
            v.k0 r0 = r5.f11255q
            java.net.Proxy r1 = r0.f11116b
            v.a r0 = r0.f11115a
            java.net.Proxy$Type r2 = r1.type()
            r3 = 0
            if (r2 != 0) goto L_0x000e
            goto L_0x001c
        L_0x000e:
            int[] r4 = p410v.p411m0.p413d.C4758e.f11234a
            int r2 = r2.ordinal()
            r2 = r4[r2]
            r4 = 1
            if (r2 == r4) goto L_0x0022
            r4 = 2
            if (r2 == r4) goto L_0x0022
        L_0x001c:
            java.net.Socket r0 = new java.net.Socket
            r0.<init>(r1)
            goto L_0x002a
        L_0x0022:
            javax.net.SocketFactory r0 = r0.f10885e
            java.net.Socket r0 = r0.createSocket()
            if (r0 == 0) goto L_0x0095
        L_0x002a:
            r5.f11240b = r0
            v.k0 r1 = r5.f11255q
            java.net.InetSocketAddress r1 = r1.f11117c
            if (r9 == 0) goto L_0x0094
            if (r8 == 0) goto L_0x008e
            if (r1 == 0) goto L_0x0088
            r0.setSoTimeout(r7)
            v.m0.i.f$a r7 = p410v.p411m0.p418i.C4839f.f11548c     // Catch:{ ConnectException -> 0x006d }
            v.m0.i.f r7 = p410v.p411m0.p418i.C4839f.f11546a     // Catch:{ ConnectException -> 0x006d }
            v.k0 r8 = r5.f11255q     // Catch:{ ConnectException -> 0x006d }
            java.net.InetSocketAddress r8 = r8.f11117c     // Catch:{ ConnectException -> 0x006d }
            r7.mo11300a(r0, r8, r6)     // Catch:{ ConnectException -> 0x006d }
            w.a0 r6 = p119o.p120a.C0967p0.m2231b(r0)     // Catch:{ NullPointerException -> 0x0059 }
            w.i r6 = p119o.p120a.C0967p0.m2183a(r6)     // Catch:{ NullPointerException -> 0x0059 }
            r5.f11245g = r6     // Catch:{ NullPointerException -> 0x0059 }
            w.y r6 = p119o.p120a.C0967p0.m2186a(r0)     // Catch:{ NullPointerException -> 0x0059 }
            w.h r6 = p119o.p120a.C0967p0.m2182a(r6)     // Catch:{ NullPointerException -> 0x0059 }
            r5.f11246h = r6     // Catch:{ NullPointerException -> 0x0059 }
            goto L_0x0066
        L_0x0059:
            r6 = move-exception
            java.lang.String r7 = r6.getMessage()
            java.lang.String r8 = "throw with null exception"
            boolean r7 = p392u.p401r.p403c.C4638h.m10272a(r7, r8)
            if (r7 != 0) goto L_0x0067
        L_0x0066:
            return
        L_0x0067:
            java.io.IOException r7 = new java.io.IOException
            r7.<init>(r6)
            throw r7
        L_0x006d:
            r6 = move-exception
            java.net.ConnectException r7 = new java.net.ConnectException
            java.lang.String r8 = "Failed to connect to "
            java.lang.StringBuilder r8 = p213q.p214a.p215a.p216a.C1965a.m4756a(r8)
            v.k0 r9 = r5.f11255q
            java.net.InetSocketAddress r9 = r9.f11117c
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            r7.initCause(r6)
            throw r7
        L_0x0088:
            java.lang.String r6 = "inetSocketAddress"
            p392u.p401r.p403c.C4638h.m10271a(r6)
            throw r3
        L_0x008e:
            java.lang.String r6 = "call"
            p392u.p401r.p403c.C4638h.m10271a(r6)
            throw r3
        L_0x0094:
            throw r3
        L_0x0095:
            p392u.p401r.p403c.C4638h.m10269a()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p410v.p411m0.p413d.C4761h.mo11125a(int, int, v.f, v.t):void");
    }

    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5, types: [java.lang.Throwable, v.b0, v.m0.d.h] */
    /* JADX WARNING: type inference failed for: r5v10 */
    /* JADX WARNING: type inference failed for: r5v16 */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: type inference failed for: r5v18 */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* JADX WARNING: type inference failed for: r5v20 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v4
      assigns: []
      uses: []
      mth insns count: 155
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11124a(int r17, int r18, int r19, p410v.C4708f r20, p410v.C4861t r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = r20
            r3 = r21
            v.e0$a r4 = new v.e0$a
            r4.<init>()
            v.k0 r5 = r0.f11255q
            v.a r5 = r5.f11115a
            v.x r5 = r5.f10881a
            r4.mo11020a(r5)
            r5 = 0
            java.lang.String r6 = "CONNECT"
            r4.mo11018a(r6, r5)
            v.k0 r6 = r0.f11255q
            v.a r6 = r6.f11115a
            v.x r6 = r6.f10881a
            r7 = 1
            java.lang.String r6 = p410v.p411m0.C4737b.m10456a(r6, r7)
            java.lang.String r8 = "Host"
            r4.mo11017a(r8, r6)
            java.lang.String r6 = "Proxy-Connection"
            java.lang.String r8 = "Keep-Alive"
            r4.mo11017a(r6, r8)
            java.lang.String r6 = "User-Agent"
            java.lang.String r8 = "okhttp/4.2.1"
            r4.mo11017a(r6, r8)
            v.e0 r4 = r4.mo11021a()
            v.i0$a r6 = new v.i0$a
            r6.<init>()
            r6.f11073a = r4
            v.c0 r8 = p410v.C4694c0.HTTP_1_1
            r6.mo11038a(r8)
            r8 = 407(0x197, float:5.7E-43)
            r6.f11075c = r8
            java.lang.String r8 = "Preemptive Authenticate"
            r6.f11076d = r8
            v.j0 r8 = p410v.p411m0.C4737b.f11142c
            r6.f11079g = r8
            r8 = -1
            r6.f11083k = r8
            r6.f11084l = r8
            v.w$a r8 = r6.f11078f
            java.lang.String r9 = "Proxy-Authenticate"
            java.lang.String r10 = "OkHttp-Preemptive"
            r8.mo11382c(r9, r10)
            v.i0 r6 = r6.mo11042a()
            v.k0 r8 = r0.f11255q
            v.a r9 = r8.f11115a
            v.c r9 = r9.f10889i
            v.e0 r6 = r9.mo10978a(r8, r6)
            if (r6 == 0) goto L_0x0076
            r4 = r6
        L_0x0076:
            v.x r6 = r4.f11029b
            r8 = 21
            r9 = 0
        L_0x007b:
            if (r9 >= r8) goto L_0x018a
            r8 = r17
            r0.mo11125a(r8, r1, r2, r3)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "CONNECT "
            r10.append(r11)
            java.lang.String r7 = p410v.p411m0.C4737b.m10456a(r6, r7)
            r10.append(r7)
            java.lang.String r7 = " HTTP/1.1"
            r10.append(r7)
            java.lang.String r7 = r10.toString()
        L_0x009c:
            w.i r10 = r0.f11245g
            if (r10 == 0) goto L_0x0186
            w.h r11 = r0.f11246h
            if (r11 == 0) goto L_0x0182
            v.m0.f.a r12 = new v.m0.f.a
            r12.<init>(r5, r5, r10, r11)
            w.b0 r5 = r10.mo11078b()
            long r13 = (long) r1
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.MILLISECONDS
            r5.mo11425a(r13, r15)
            w.b0 r5 = r11.mo11186b()
            r13 = r19
            long r14 = (long) r13
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r5.mo11425a(r14, r1)
            v.w r1 = r4.f11031d
            r12.mo11182a(r1, r7)
            w.h r1 = r12.f11322g
            r1.flush()
            r1 = 0
            v.i0$a r1 = r12.mo11162a(r1)
            if (r1 == 0) goto L_0x017d
            r1.f11073a = r4
            v.i0 r1 = r1.mo11042a()
            long r4 = p410v.p411m0.C4737b.m10454a(r1)
            r14 = -1
            int r14 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r14 != 0) goto L_0x00e1
            goto L_0x00f0
        L_0x00e1:
            w.a0 r4 = r12.mo11181a(r4)
            r5 = 2147483647(0x7fffffff, float:NaN)
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS
            p410v.p411m0.C4737b.m10475b(r4, r5, r12)
            r4.close()
        L_0x00f0:
            int r4 = r1.f11063i
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 == r5) goto L_0x013b
            r5 = 407(0x197, float:5.7E-43)
            if (r4 != r5) goto L_0x0126
            v.k0 r4 = r0.f11255q
            v.a r5 = r4.f11115a
            v.c r5 = r5.f10889i
            v.e0 r4 = r5.mo10978a(r4, r1)
            if (r4 == 0) goto L_0x011e
            r5 = 2
            java.lang.String r10 = "Connection"
            r11 = 0
            java.lang.String r1 = p410v.C4720i0.m10406a(r1, r10, r11, r5)
            java.lang.String r5 = "close"
            r10 = 1
            boolean r1 = p392u.p409w.C4681g.m10322a(r5, r1, r10)
            if (r1 == 0) goto L_0x0119
            r7 = r10
            goto L_0x0152
        L_0x0119:
            r5 = 0
            r1 = r18
            goto L_0x009c
        L_0x011e:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Failed to authenticate with proxy"
            r1.<init>(r2)
            throw r1
        L_0x0126:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "Unexpected response code for CONNECT: "
            java.lang.StringBuilder r3 = p213q.p214a.p215a.p216a.C1965a.m4756a(r3)
            int r1 = r1.f11063i
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x013b:
            r1 = 1
            w.f r4 = r10.getBuffer()
            boolean r4 = r4.mo11460i()
            if (r4 == 0) goto L_0x0175
            w.f r4 = r11.getBuffer()
            boolean r4 = r4.mo11460i()
            if (r4 == 0) goto L_0x0175
            r4 = 0
            r7 = r1
        L_0x0152:
            if (r4 == 0) goto L_0x018a
            java.net.Socket r1 = r0.f11240b
            if (r1 == 0) goto L_0x015b
            p410v.p411m0.C4737b.m10465a(r1)
        L_0x015b:
            r1 = 0
            r0.f11240b = r1
            r0.f11246h = r1
            r0.f11245g = r1
            v.k0 r1 = r0.f11255q
            java.net.InetSocketAddress r5 = r1.f11117c
            java.net.Proxy r1 = r1.f11116b
            r3.mo11355a(r2, r5, r1)
            int r9 = r9 + 1
            r5 = 0
            r1 = 21
            r8 = r1
            r1 = r18
            goto L_0x007b
        L_0x0175:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TLS tunnel buffered too many bytes!"
            r1.<init>(r2)
            throw r1
        L_0x017d:
            p392u.p401r.p403c.C4638h.m10269a()
            r1 = 0
            throw r1
        L_0x0182:
            p392u.p401r.p403c.C4638h.m10269a()
            throw r5
        L_0x0186:
            p392u.p401r.p403c.C4638h.m10269a()
            throw r5
        L_0x018a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p410v.p411m0.p413d.C4761h.mo11124a(int, int, int, v.f, v.t):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0196  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11127a(p410v.p411m0.p413d.C4753b r9, int r10, p410v.C4708f r11, p410v.C4861t r12) {
        /*
            r8 = this;
            v.k0 r0 = r8.f11255q
            v.a r0 = r0.f11115a
            javax.net.ssl.SSLSocketFactory r1 = r0.f10886f
            if (r1 != 0) goto L_0x0027
            java.util.List<v.c0> r9 = r0.f10882b
            v.c0 r11 = p410v.C4694c0.H2_PRIOR_KNOWLEDGE
            boolean r9 = r9.contains(r11)
            if (r9 == 0) goto L_0x001e
            java.net.Socket r9 = r8.f11240b
            r8.f11241c = r9
            v.c0 r9 = p410v.C4694c0.H2_PRIOR_KNOWLEDGE
            r8.f11243e = r9
            r8.mo11122a(r10)
            return
        L_0x001e:
            java.net.Socket r9 = r8.f11240b
            r8.f11241c = r9
            v.c0 r9 = p410v.C4694c0.HTTP_1_1
            r8.f11243e = r9
            return
        L_0x0027:
            r2 = 0
            if (r12 == 0) goto L_0x01a0
            if (r11 == 0) goto L_0x019a
            if (r1 == 0) goto L_0x0186
            java.net.Socket r11 = r8.f11240b     // Catch:{ all -> 0x018a }
            v.x r12 = r0.f10881a     // Catch:{ all -> 0x018a }
            java.lang.String r12 = r12.f11620e     // Catch:{ all -> 0x018a }
            v.x r3 = r0.f10881a     // Catch:{ all -> 0x018a }
            int r3 = r3.f11621f     // Catch:{ all -> 0x018a }
            r4 = 1
            java.net.Socket r11 = r1.createSocket(r11, r12, r3, r4)     // Catch:{ all -> 0x018a }
            if (r11 == 0) goto L_0x017e
            javax.net.ssl.SSLSocket r11 = (javax.net.ssl.SSLSocket) r11     // Catch:{ all -> 0x018a }
            v.m r9 = r9.mo11107a(r11)     // Catch:{ all -> 0x017b }
            boolean r12 = r9.f11132b     // Catch:{ all -> 0x017b }
            if (r12 == 0) goto L_0x0056
            v.m0.i.f$a r12 = p410v.p411m0.p418i.C4839f.f11548c     // Catch:{ all -> 0x017b }
            v.m0.i.f r12 = p410v.p411m0.p418i.C4839f.f11546a     // Catch:{ all -> 0x017b }
            v.x r1 = r0.f10881a     // Catch:{ all -> 0x017b }
            java.lang.String r1 = r1.f11620e     // Catch:{ all -> 0x017b }
            java.util.List<v.c0> r3 = r0.f10882b     // Catch:{ all -> 0x017b }
            r12.mo11301a(r11, r1, r3)     // Catch:{ all -> 0x017b }
        L_0x0056:
            r11.startHandshake()     // Catch:{ all -> 0x017b }
            javax.net.ssl.SSLSession r12 = r11.getSession()     // Catch:{ all -> 0x017b }
            v.v$a r1 = p410v.C4866v.f11604f     // Catch:{ all -> 0x017b }
            java.lang.String r3 = "sslSocketSession"
            p392u.p401r.p403c.C4638h.m10270a(r12, r3)     // Catch:{ all -> 0x017b }
            v.v r1 = r1.mo11364a(r12)     // Catch:{ all -> 0x017b }
            javax.net.ssl.HostnameVerifier r3 = r0.f10887g     // Catch:{ all -> 0x017b }
            if (r3 == 0) goto L_0x0177
            v.x r5 = r0.f10881a     // Catch:{ all -> 0x017b }
            java.lang.String r5 = r5.f11620e     // Catch:{ all -> 0x017b }
            boolean r12 = r3.verify(r5, r12)     // Catch:{ all -> 0x017b }
            if (r12 != 0) goto L_0x0111
            java.util.List r9 = r1.mo11360a()     // Catch:{ all -> 0x017b }
            boolean r10 = r9.isEmpty()     // Catch:{ all -> 0x017b }
            r10 = r10 ^ r4
            if (r10 == 0) goto L_0x00f1
            r10 = 0
            java.lang.Object r9 = r9.get(r10)     // Catch:{ all -> 0x017b }
            if (r9 == 0) goto L_0x00e9
            java.security.cert.X509Certificate r9 = (java.security.cert.X509Certificate) r9     // Catch:{ all -> 0x017b }
            javax.net.ssl.SSLPeerUnverifiedException r10 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x017b }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x017b }
            r12.<init>()     // Catch:{ all -> 0x017b }
            java.lang.String r1 = "\n              |Hostname "
            r12.append(r1)     // Catch:{ all -> 0x017b }
            v.x r0 = r0.f10881a     // Catch:{ all -> 0x017b }
            java.lang.String r0 = r0.f11620e     // Catch:{ all -> 0x017b }
            r12.append(r0)     // Catch:{ all -> 0x017b }
            java.lang.String r0 = " not verified:\n              |    certificate: "
            r12.append(r0)     // Catch:{ all -> 0x017b }
            v.h$a r0 = p410v.C4713h.f11044d     // Catch:{ all -> 0x017b }
            java.lang.String r0 = r0.mo11025a(r9)     // Catch:{ all -> 0x017b }
            r12.append(r0)     // Catch:{ all -> 0x017b }
            java.lang.String r0 = "\n              |    DN: "
            r12.append(r0)     // Catch:{ all -> 0x017b }
            java.security.Principal r0 = r9.getSubjectDN()     // Catch:{ all -> 0x017b }
            java.lang.String r1 = "cert.subjectDN"
            p392u.p401r.p403c.C4638h.m10270a(r0, r1)     // Catch:{ all -> 0x017b }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x017b }
            r12.append(r0)     // Catch:{ all -> 0x017b }
            java.lang.String r0 = "\n              |    subjectAltNames: "
            r12.append(r0)     // Catch:{ all -> 0x017b }
            v.m0.k.d r0 = p410v.p411m0.p421k.C4852d.f11565a     // Catch:{ all -> 0x017b }
            r1 = 7
            java.util.List r1 = r0.mo11335a(r9, r1)     // Catch:{ all -> 0x017b }
            r3 = 2
            java.util.List r9 = r0.mo11335a(r9, r3)     // Catch:{ all -> 0x017b }
            java.util.List r9 = p392u.p393n.C4568g.m10218a(r1, r9)     // Catch:{ all -> 0x017b }
            r12.append(r9)     // Catch:{ all -> 0x017b }
            java.lang.String r9 = "\n              "
            r12.append(r9)     // Catch:{ all -> 0x017b }
            java.lang.String r9 = r12.toString()     // Catch:{ all -> 0x017b }
            java.lang.String r9 = p392u.p409w.C4681g.m10310a(r9, r2, r4)     // Catch:{ all -> 0x017b }
            r10.<init>(r9)     // Catch:{ all -> 0x017b }
            throw r10     // Catch:{ all -> 0x017b }
        L_0x00e9:
            u.i r9 = new u.i     // Catch:{ all -> 0x017b }
            java.lang.String r10 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            r9.<init>(r10)     // Catch:{ all -> 0x017b }
            throw r9     // Catch:{ all -> 0x017b }
        L_0x00f1:
            javax.net.ssl.SSLPeerUnverifiedException r9 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x017b }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x017b }
            r10.<init>()     // Catch:{ all -> 0x017b }
            java.lang.String r12 = "Hostname "
            r10.append(r12)     // Catch:{ all -> 0x017b }
            v.x r12 = r0.f10881a     // Catch:{ all -> 0x017b }
            java.lang.String r12 = r12.f11620e     // Catch:{ all -> 0x017b }
            r10.append(r12)     // Catch:{ all -> 0x017b }
            java.lang.String r12 = " not verified (no certificates)"
            r10.append(r12)     // Catch:{ all -> 0x017b }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x017b }
            r9.<init>(r10)     // Catch:{ all -> 0x017b }
            throw r9     // Catch:{ all -> 0x017b }
        L_0x0111:
            v.h r12 = r0.f10888h     // Catch:{ all -> 0x017b }
            if (r12 == 0) goto L_0x0173
            v.v r3 = new v.v     // Catch:{ all -> 0x017b }
            v.l0 r4 = r1.f11606b     // Catch:{ all -> 0x017b }
            v.j r5 = r1.f11607c     // Catch:{ all -> 0x017b }
            java.util.List<java.security.cert.Certificate> r6 = r1.f11608d     // Catch:{ all -> 0x017b }
            v.m0.d.f r7 = new v.m0.d.f     // Catch:{ all -> 0x017b }
            r7.<init>(r12, r1, r0)     // Catch:{ all -> 0x017b }
            r3.<init>(r4, r5, r6, r7)     // Catch:{ all -> 0x017b }
            r8.f11242d = r3     // Catch:{ all -> 0x017b }
            v.x r0 = r0.f10881a     // Catch:{ all -> 0x017b }
            java.lang.String r0 = r0.f11620e     // Catch:{ all -> 0x017b }
            v.m0.d.g r1 = new v.m0.d.g     // Catch:{ all -> 0x017b }
            r1.<init>(r8)     // Catch:{ all -> 0x017b }
            r12.mo11022a(r0, r1)     // Catch:{ all -> 0x017b }
            boolean r9 = r9.f11132b     // Catch:{ all -> 0x017b }
            if (r9 == 0) goto L_0x013f
            v.m0.i.f$a r9 = p410v.p411m0.p418i.C4839f.f11548c     // Catch:{ all -> 0x017b }
            v.m0.i.f r9 = p410v.p411m0.p418i.C4839f.f11546a     // Catch:{ all -> 0x017b }
            java.lang.String r2 = r9.mo11303b(r11)     // Catch:{ all -> 0x017b }
        L_0x013f:
            r8.f11241c = r11     // Catch:{ all -> 0x017b }
            w.a0 r9 = p119o.p120a.C0967p0.m2231b(r11)     // Catch:{ all -> 0x017b }
            w.i r9 = p119o.p120a.C0967p0.m2183a(r9)     // Catch:{ all -> 0x017b }
            r8.f11245g = r9     // Catch:{ all -> 0x017b }
            w.y r9 = p119o.p120a.C0967p0.m2186a(r11)     // Catch:{ all -> 0x017b }
            w.h r9 = p119o.p120a.C0967p0.m2182a(r9)     // Catch:{ all -> 0x017b }
            r8.f11246h = r9     // Catch:{ all -> 0x017b }
            if (r2 == 0) goto L_0x015e
            v.c0$a r9 = p410v.C4694c0.f10975m     // Catch:{ all -> 0x017b }
            v.c0 r9 = r9.mo10983a(r2)     // Catch:{ all -> 0x017b }
            goto L_0x0160
        L_0x015e:
            v.c0 r9 = p410v.C4694c0.HTTP_1_1     // Catch:{ all -> 0x017b }
        L_0x0160:
            r8.f11243e = r9     // Catch:{ all -> 0x017b }
            v.m0.i.f$a r9 = p410v.p411m0.p418i.C4839f.f11548c
            v.m0.i.f r9 = p410v.p411m0.p418i.C4839f.f11546a
            r9.mo11318a(r11)
            v.c0 r9 = r8.f11243e
            v.c0 r11 = p410v.C4694c0.HTTP_2
            if (r9 != r11) goto L_0x0172
            r8.mo11122a(r10)
        L_0x0172:
            return
        L_0x0173:
            p392u.p401r.p403c.C4638h.m10269a()     // Catch:{ all -> 0x017b }
            throw r2
        L_0x0177:
            p392u.p401r.p403c.C4638h.m10269a()     // Catch:{ all -> 0x017b }
            throw r2
        L_0x017b:
            r9 = move-exception
            r2 = r11
            goto L_0x018b
        L_0x017e:
            u.i r9 = new u.i     // Catch:{ all -> 0x018a }
            java.lang.String r10 = "null cannot be cast to non-null type javax.net.ssl.SSLSocket"
            r9.<init>(r10)     // Catch:{ all -> 0x018a }
            throw r9     // Catch:{ all -> 0x018a }
        L_0x0186:
            p392u.p401r.p403c.C4638h.m10269a()     // Catch:{ all -> 0x018a }
            throw r2
        L_0x018a:
            r9 = move-exception
        L_0x018b:
            if (r2 == 0) goto L_0x0194
            v.m0.i.f$a r10 = p410v.p411m0.p418i.C4839f.f11548c
            v.m0.i.f r10 = p410v.p411m0.p418i.C4839f.f11546a
            r10.mo11318a(r2)
        L_0x0194:
            if (r2 == 0) goto L_0x0199
            p410v.p411m0.C4737b.m10465a(r2)
        L_0x0199:
            throw r9
        L_0x019a:
            java.lang.String r9 = "call"
            p392u.p401r.p403c.C4638h.m10271a(r9)
            throw r2
        L_0x01a0:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p410v.p411m0.p413d.C4761h.mo11127a(v.m0.d.b, int, v.f, v.t):void");
    }

    /* renamed from: a */
    public final C4775d mo11121a(C4690b0 b0Var, C4878a aVar) {
        if (b0Var == null) {
            C4638h.m10271a("client");
            throw null;
        } else if (aVar != null) {
            Socket socket = this.f11241c;
            if (socket != null) {
                C4896i iVar = this.f11245g;
                if (iVar != null) {
                    C4895h hVar = this.f11246h;
                    if (hVar != null) {
                        C4797f fVar = this.f11244f;
                        if (fVar != null) {
                            return new C4813j(b0Var, this, aVar, fVar);
                        }
                        socket.setSoTimeout(aVar.mo11174c());
                        iVar.mo11078b().mo11425a((long) aVar.mo11174c(), TimeUnit.MILLISECONDS);
                        hVar.mo11186b().mo11425a((long) aVar.mo11175d(), TimeUnit.MILLISECONDS);
                        return new C4782a(b0Var, this, iVar, hVar);
                    }
                    C4638h.m10269a();
                    throw null;
                }
                C4638h.m10269a();
                throw null;
            }
            C4638h.m10269a();
            throw null;
        } else {
            C4638h.m10271a("chain");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo11128a(C4797f fVar) {
        if (fVar != null) {
            synchronized (this.f11254p) {
                this.f11251m = fVar.mo11220f();
            }
            return;
        }
        C4638h.m10271a("connection");
        throw null;
    }

    /* renamed from: a */
    public void mo11129a(C4817l lVar) {
        if (lVar != null) {
            lVar.mo11251a(C4790b.REFUSED_STREAM, (IOException) null);
        } else {
            C4638h.m10271a("stream");
            throw null;
        }
    }

    /* renamed from: a */
    public final void mo11122a(int i) {
        Socket socket = this.f11241c;
        if (socket != null) {
            C4896i iVar = this.f11245g;
            if (iVar != null) {
                C4895h hVar = this.f11246h;
                if (hVar != null) {
                    socket.setSoTimeout(0);
                    C4799b bVar = new C4799b(true);
                    String str = this.f11255q.f11115a.f10881a.f11620e;
                    if (str == null) {
                        C4638h.m10271a("connectionName");
                        throw null;
                    } else if (iVar == null) {
                        C4638h.m10271a("source");
                        throw null;
                    } else if (hVar != null) {
                        bVar.f11406a = socket;
                        bVar.f11407b = str;
                        bVar.f11408c = iVar;
                        bVar.f11409d = hVar;
                        bVar.f11410e = this;
                        bVar.f11412g = i;
                        C4797f fVar = new C4797f(bVar);
                        this.f11244f = fVar;
                        fVar.f11402w.mo11267a();
                        fVar.f11402w.mo11278b(fVar.f11395p);
                        int a = fVar.f11395p.mo11286a();
                        if (a != 65535) {
                            fVar.f11402w.mo11270a(0, (long) (a - 65535));
                        }
                        C4802d dVar = fVar.f11403x;
                        StringBuilder a2 = C1965a.m4756a("OkHttp ");
                        a2.append(fVar.f11387h);
                        new Thread(dVar, a2.toString()).start();
                    } else {
                        C4638h.m10271a("sink");
                        throw null;
                    }
                } else {
                    C4638h.m10269a();
                    throw null;
                }
            } else {
                C4638h.m10269a();
                throw null;
            }
        } else {
            C4638h.m10269a();
            throw null;
        }
    }

    /* renamed from: a */
    public final boolean mo11130a(C4873x xVar) {
        if (xVar != null) {
            C4873x xVar2 = this.f11255q.f11115a.f10881a;
            boolean z = false;
            if (xVar.f11621f != xVar2.f11621f) {
                return false;
            }
            if (C4638h.m10272a((Object) xVar.f11620e, (Object) xVar2.f11620e)) {
                return true;
            }
            C4866v vVar = this.f11242d;
            if (vVar != null) {
                C4852d dVar = C4852d.f11565a;
                String str = xVar.f11620e;
                if (vVar != null) {
                    Object obj = vVar.mo11360a().get(0);
                    if (obj == null) {
                        throw new C4557i("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    } else if (dVar.mo11336a(str, (X509Certificate) obj)) {
                        z = true;
                    }
                } else {
                    C4638h.m10269a();
                    throw null;
                }
            }
            return z;
        }
        C4638h.m10271a("url");
        throw null;
    }
}
