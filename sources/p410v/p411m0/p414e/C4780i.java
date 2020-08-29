package p410v.p411m0.p414e;

import p392u.p401r.p403c.C4638h;
import p392u.p409w.C4677c;
import p410v.C4690b0;
import p410v.C4706e0;
import p410v.C4706e0.C4707a;
import p410v.C4716h0;
import p410v.C4720i0;
import p410v.C4873x;
import p410v.C4877y;
import p410v.p411m0.C4737b;

/* renamed from: v.m0.e.i */
public final class C4780i implements C4877y {

    /* renamed from: a */
    public final C4690b0 f11312a;

    public C4780i(C4690b0 b0Var) {
        if (b0Var != null) {
            this.f11312a = b0Var;
        } else {
            C4638h.m10271a("client");
            throw null;
        }
    }

    /* renamed from: a */
    public final int mo11177a(C4720i0 i0Var, int i) {
        String a = C4720i0.m10406a(i0Var, "Retry-After", null, 2);
        if (a == null) {
            return i;
        }
        if (!new C4677c("\\d+").mo10964a(a)) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(a);
        C4638h.m10270a((Object) valueOf, "Integer.valueOf(header)");
        return valueOf.intValue();
    }

    /* renamed from: a */
    public final C4706e0 mo11178a(C4720i0 i0Var, String str) {
        C4716h0 h0Var = null;
        if (!this.f11312a.f10924l) {
            return null;
        }
        String a = C4720i0.m10406a(i0Var, "Location", null, 2);
        if (a != null) {
            C4873x b = i0Var.f11060f.f11029b.mo11389b(a);
            if (b != null) {
                if (!C4638h.m10272a((Object) b.f11617b, (Object) i0Var.f11060f.f11029b.f11617b) && !this.f11312a.f10925m) {
                    return null;
                }
                C4706e0 e0Var = i0Var.f11060f;
                if (e0Var != null) {
                    C4707a aVar = new C4707a(e0Var);
                    if (C4777f.m10584a(str)) {
                        String str2 = "PROPFIND";
                        boolean a2 = C4638h.m10272a((Object) str, (Object) str2);
                        if (!C4638h.m10272a((Object) str, (Object) str2)) {
                            str = "GET";
                        } else if (a2) {
                            h0Var = i0Var.f11060f.f11032e;
                        }
                        aVar.mo11018a(str, h0Var);
                        if (!a2) {
                            aVar.mo11016a("Transfer-Encoding");
                            aVar.mo11016a("Content-Length");
                            aVar.mo11016a("Content-Type");
                        }
                    }
                    if (!C4737b.m10468a(i0Var.f11060f.f11029b, b)) {
                        aVar.mo11016a("Authorization");
                    }
                    aVar.f11034a = b;
                    return aVar.mo11021a();
                }
                throw null;
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Throwable, v.m0.d.d, java.io.IOException] */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r22v0, types: [v.h] */
    /* JADX WARNING: type inference failed for: r21v0, types: [javax.net.ssl.HostnameVerifier] */
    /* JADX WARNING: type inference failed for: r20v0, types: [javax.net.ssl.SSLSocketFactory] */
    /* JADX WARNING: type inference failed for: r20v1 */
    /* JADX WARNING: type inference failed for: r21v1 */
    /* JADX WARNING: type inference failed for: r22v1 */
    /* JADX WARNING: type inference failed for: r5v10, types: [javax.net.ssl.SSLSocketFactory] */
    /* JADX WARNING: type inference failed for: r7v8, types: [javax.net.ssl.HostnameVerifier] */
    /* JADX WARNING: type inference failed for: r0v34, types: [v.h] */
    /* JADX WARNING: type inference failed for: r22v2 */
    /* JADX WARNING: type inference failed for: r20v2 */
    /* JADX WARNING: type inference failed for: r21v2 */
    /* JADX WARNING: type inference failed for: r0v36 */
    /* JADX WARNING: type inference failed for: r0v37 */
    /* JADX WARNING: type inference failed for: r20v3 */
    /* JADX WARNING: type inference failed for: r21v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01a1, code lost:
        if ((p392u.p401r.p403c.C4638h.m10272a((java.lang.Object) r6, (java.lang.Object) "HEAD") ^ r5) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x021c, code lost:
        r10.mo11155c();
        r12 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0142, code lost:
        if (r6.f11063i == 408) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x014a, code lost:
        if (r4.mo11177a(r1, 0) > 0) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0175, code lost:
        if (r2.f11063i == 503) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x017f, code lost:
        if (r4.mo11177a(r1, Integer.MAX_VALUE) != 0) goto L_0x01a3;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v1, types: [java.lang.Throwable, v.m0.d.d, java.io.IOException]
      assigns: []
      uses: [?[OBJECT, ARRAY], java.io.IOException, v.m0.d.d, java.lang.Throwable]
      mth insns count: 250
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
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x01ab A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x022d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x019a  */
    /* JADX WARNING: Unknown variable types count: 11 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p410v.C4720i0 mo11074a(p410v.C4877y.C4878a r30) {
        /*
            r29 = this;
            r1 = r29
            r0 = 0
            if (r30 == 0) goto L_0x023f
            v.e0 r2 = r30.mo11176g()
            r3 = r30
            v.m0.e.g r3 = (p410v.p411m0.p414e.C4778g) r3
            v.m0.d.m r10 = r3.f11301c
            r4 = 0
            r11 = r2
            r12 = r4
            r2 = r0
        L_0x0013:
            if (r11 == 0) goto L_0x0237
            v.e0 r4 = r10.f11281e
            java.lang.String r13 = "Check failed."
            r5 = 1
            if (r4 == 0) goto L_0x0057
            v.x r4 = r4.f11029b
            v.x r6 = r11.f11029b
            boolean r4 = p410v.p411m0.C4737b.m10468a(r4, r6)
            if (r4 == 0) goto L_0x003a
            v.m0.d.d r4 = r10.f11282f
            if (r4 == 0) goto L_0x0036
            boolean r4 = r4.mo11117a()
            if (r4 == 0) goto L_0x003a
            r30 = r12
            r28 = r13
            goto L_0x00bf
        L_0x0036:
            p392u.p401r.p403c.C4638h.m10269a()
            throw r0
        L_0x003a:
            v.m0.d.c r4 = r10.f11284h
            if (r4 != 0) goto L_0x0040
            r4 = r5
            goto L_0x0041
        L_0x0040:
            r4 = 0
        L_0x0041:
            if (r4 == 0) goto L_0x004d
            v.m0.d.d r4 = r10.f11282f
            if (r4 == 0) goto L_0x0057
            r10.mo11149a(r0, r5)
            r10.f11282f = r0
            goto L_0x0057
        L_0x004d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = r13.toString()
            r0.<init>(r2)
            throw r0
        L_0x0057:
            r10.f11281e = r11
            v.m0.d.d r14 = new v.m0.d.d
            v.m0.d.i r6 = r10.f11277a
            v.x r4 = r11.f11029b
            boolean r5 = r4.f11616a
            if (r5 == 0) goto L_0x007c
            v.b0 r0 = r10.f11290n
            javax.net.ssl.SSLSocketFactory r5 = r0.f10933u
            if (r5 == 0) goto L_0x0074
            javax.net.ssl.HostnameVerifier r7 = r0.f10937y
            v.h r0 = r0.f10938z
            r22 = r0
            r20 = r5
            r21 = r7
            goto L_0x0082
        L_0x0074:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "CLEARTEXT-only client"
            r0.<init>(r2)
            throw r0
        L_0x007c:
            r20 = r0
            r21 = r20
            r22 = r21
        L_0x0082:
            v.a r7 = new v.a
            java.lang.String r0 = r4.f11620e
            int r4 = r4.f11621f
            v.b0 r5 = r10.f11290n
            v.s r8 = r5.f10928p
            javax.net.SocketFactory r9 = r5.f10932t
            v.c r15 = r5.f10931s
            r30 = r12
            java.net.Proxy r12 = r5.f10929q
            r28 = r13
            java.util.List<v.c0> r13 = r5.f10936x
            java.util.List<v.m> r1 = r5.f10935w
            java.net.ProxySelector r5 = r5.f10930r
            r23 = r15
            r15 = r7
            r16 = r0
            r17 = r4
            r18 = r8
            r19 = r9
            r24 = r12
            r25 = r13
            r26 = r1
            r27 = r5
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            v.f r8 = r10.f11291o
            v.t r9 = r10.f11278b
            r0 = 1
            r4 = r14
            r5 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r10.f11282f = r14
            r5 = r0
        L_0x00bf:
            boolean r0 = r10.mo11157e()
            if (r0 != 0) goto L_0x022d
            r0 = 0
            v.i0 r1 = r3.mo11171a(r11, r10, r0)     // Catch:{ k -> 0x020f, IOException -> 0x01fc, all -> 0x01f8 }
            if (r2 == 0) goto L_0x00fb
            if (r1 == 0) goto L_0x00fa
            v.i0$a r4 = new v.i0$a
            r4.<init>(r1)
            v.i0$a r1 = new v.i0$a
            r1.<init>(r2)
            r1.f11079g = r0
            v.i0 r0 = r1.mo11042a()
            v.j0 r1 = r0.f11066l
            if (r1 != 0) goto L_0x00e4
            r1 = r5
            goto L_0x00e5
        L_0x00e4:
            r1 = 0
        L_0x00e5:
            if (r1 == 0) goto L_0x00ee
            r4.f11082j = r0
            v.i0 r1 = r4.mo11042a()
            goto L_0x00fb
        L_0x00ee:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "priorResponse.body != null"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00fa:
            throw r0
        L_0x00fb:
            v.m0.d.c r0 = r1.f11072r
            if (r0 == 0) goto L_0x0108
            v.m0.d.h r2 = r0.mo11110a()
            if (r2 == 0) goto L_0x0108
            v.k0 r2 = r2.f11255q
            goto L_0x0109
        L_0x0108:
            r2 = 0
        L_0x0109:
            int r4 = r1.f11063i
            v.e0 r6 = r1.f11060f
            java.lang.String r6 = r6.f11030c
            r7 = 307(0x133, float:4.3E-43)
            if (r4 == r7) goto L_0x018f
            r7 = 308(0x134, float:4.32E-43)
            if (r4 == r7) goto L_0x018f
            r7 = 401(0x191, float:5.62E-43)
            if (r4 == r7) goto L_0x0184
            r7 = 503(0x1f7, float:7.05E-43)
            if (r4 == r7) goto L_0x016d
            r7 = 407(0x197, float:5.7E-43)
            if (r4 == r7) goto L_0x014d
            r2 = 408(0x198, float:5.72E-43)
            if (r4 == r2) goto L_0x0132
            switch(r4) {
                case 300: goto L_0x012e;
                case 301: goto L_0x012e;
                case 302: goto L_0x012e;
                case 303: goto L_0x012e;
                default: goto L_0x012a;
            }
        L_0x012a:
            r4 = r29
            goto L_0x01a3
        L_0x012e:
            r4 = r29
            goto L_0x01a5
        L_0x0132:
            r4 = r29
            v.b0 r6 = r4.f11312a
            boolean r6 = r6.f10922j
            if (r6 != 0) goto L_0x013c
            goto L_0x01a3
        L_0x013c:
            v.i0 r6 = r1.f11069o
            if (r6 == 0) goto L_0x0145
            int r6 = r6.f11063i
            if (r6 != r2) goto L_0x0145
            goto L_0x01a3
        L_0x0145:
            r2 = 0
            int r2 = r4.mo11177a(r1, r2)
            if (r2 <= 0) goto L_0x0181
            goto L_0x01a3
        L_0x014d:
            r4 = r29
            if (r2 == 0) goto L_0x0168
            java.net.Proxy r6 = r2.f11116b
            java.net.Proxy$Type r6 = r6.type()
            java.net.Proxy$Type r7 = java.net.Proxy.Type.HTTP
            if (r6 != r7) goto L_0x0160
            v.b0 r6 = r4.f11312a
            v.c r6 = r6.f10931s
            goto L_0x018a
        L_0x0160:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            r0.<init>(r1)
            throw r0
        L_0x0168:
            p392u.p401r.p403c.C4638h.m10269a()
            r0 = 0
            throw r0
        L_0x016d:
            r4 = r29
            v.i0 r2 = r1.f11069o
            if (r2 == 0) goto L_0x0178
            int r2 = r2.f11063i
            if (r2 != r7) goto L_0x0178
            goto L_0x01a3
        L_0x0178:
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r2 = r4.mo11177a(r1, r2)
            if (r2 != 0) goto L_0x01a3
        L_0x0181:
            v.e0 r2 = r1.f11060f
            goto L_0x01a9
        L_0x0184:
            r4 = r29
            v.b0 r6 = r4.f11312a
            v.c r6 = r6.f10923k
        L_0x018a:
            v.e0 r2 = r6.mo10978a(r2, r1)
            goto L_0x01a9
        L_0x018f:
            r4 = r29
            java.lang.String r2 = "GET"
            boolean r2 = p392u.p401r.p403c.C4638h.m10272a(r6, r2)
            r2 = r2 ^ r5
            if (r2 == 0) goto L_0x01a5
            java.lang.String r2 = "HEAD"
            boolean r2 = p392u.p401r.p403c.C4638h.m10272a(r6, r2)
            r2 = r2 ^ r5
            if (r2 == 0) goto L_0x01a5
        L_0x01a3:
            r2 = 0
            goto L_0x01a9
        L_0x01a5:
            v.e0 r2 = r4.mo11178a(r1, r6)
        L_0x01a9:
            if (r2 != 0) goto L_0x01c9
            if (r0 == 0) goto L_0x01c8
            boolean r0 = r0.f11208a
            if (r0 == 0) goto L_0x01c8
            boolean r0 = r10.f11288l
            r0 = r0 ^ r5
            if (r0 == 0) goto L_0x01be
            r10.f11288l = r5
            v.m0.d.m$b r0 = r10.f11279c
            r0.mo11418g()
            goto L_0x01c8
        L_0x01be:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r28.toString()
            r0.<init>(r1)
            throw r0
        L_0x01c8:
            return r1
        L_0x01c9:
            v.j0 r6 = r1.f11066l
            if (r6 == 0) goto L_0x01d0
            p410v.p411m0.C4737b.m10463a(r6)
        L_0x01d0:
            boolean r6 = r10.mo11156d()
            if (r6 == 0) goto L_0x01e3
            if (r0 == 0) goto L_0x01e3
            v.m0.e.d r6 = r0.f11213f
            r6.cancel()
            v.m0.d.m r6 = r0.f11209b
            r7 = 0
            r6.mo11150a(r0, r5, r5, r7)
        L_0x01e3:
            int r12 = r30 + 1
            r0 = 20
            if (r12 > r0) goto L_0x01ec
            r11 = r2
            r2 = r1
            goto L_0x0221
        L_0x01ec:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Too many follow-up requests: "
            java.lang.String r1 = p213q.p214a.p215a.p216a.C1965a.m4761b(r1, r12)
            r0.<init>(r1)
            throw r0
        L_0x01f8:
            r0 = move-exception
            r4 = r29
            goto L_0x0229
        L_0x01fc:
            r0 = move-exception
            r4 = r29
            r1 = r0
            boolean r0 = r1 instanceof p410v.p411m0.p416g.C4789a     // Catch:{ all -> 0x0228 }
            if (r0 != 0) goto L_0x0206
            goto L_0x0207
        L_0x0206:
            r5 = 0
        L_0x0207:
            boolean r0 = r4.mo11179a(r1, r10, r5, r11)     // Catch:{ all -> 0x0228 }
            if (r0 == 0) goto L_0x020e
            goto L_0x021c
        L_0x020e:
            throw r1     // Catch:{ all -> 0x0228 }
        L_0x020f:
            r0 = move-exception
            r4 = r29
            r1 = r0
            java.io.IOException r0 = r1.f11265e     // Catch:{ all -> 0x0228 }
            r5 = 0
            boolean r0 = r4.mo11179a(r0, r10, r5, r11)     // Catch:{ all -> 0x0228 }
            if (r0 == 0) goto L_0x0225
        L_0x021c:
            r10.mo11155c()
            r12 = r30
        L_0x0221:
            r0 = 0
            r1 = r4
            goto L_0x0013
        L_0x0225:
            java.io.IOException r0 = r1.f11266f     // Catch:{ all -> 0x0228 }
            throw r0     // Catch:{ all -> 0x0228 }
        L_0x0228:
            r0 = move-exception
        L_0x0229:
            r10.mo11155c()
            throw r0
        L_0x022d:
            r4 = r29
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Canceled"
            r0.<init>(r1)
            throw r0
        L_0x0237:
            r4 = r1
            java.lang.String r0 = "request"
            p392u.p401r.p403c.C4638h.m10271a(r0)
            r0 = 0
            throw r0
        L_0x023f:
            r4 = r1
            java.lang.String r1 = "chain"
            p392u.p401r.p403c.C4638h.m10271a(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p410v.p411m0.p414e.C4780i.mo11074a(v.y$a):v.i0");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0058 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0059 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo11179a(java.io.IOException r3, p410v.p411m0.p413d.C4768m r4, boolean r5, p410v.C4706e0 r6) {
        /*
            r2 = this;
            v.b0 r0 = r2.f11312a
            boolean r0 = r0.f10922j
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            if (r5 == 0) goto L_0x0011
            v.h0 r6 = r6.f11032e
            boolean r6 = r3 instanceof java.io.FileNotFoundException
            if (r6 == 0) goto L_0x0011
            return r1
        L_0x0011:
            boolean r6 = r3 instanceof java.net.ProtocolException
            r0 = 1
            if (r6 == 0) goto L_0x0017
            goto L_0x0023
        L_0x0017:
            boolean r6 = r3 instanceof java.io.InterruptedIOException
            if (r6 == 0) goto L_0x0025
            boolean r3 = r3 instanceof java.net.SocketTimeoutException
            if (r3 == 0) goto L_0x0023
            if (r5 != 0) goto L_0x0023
        L_0x0021:
            r3 = r0
            goto L_0x0037
        L_0x0023:
            r3 = r1
            goto L_0x0037
        L_0x0025:
            boolean r5 = r3 instanceof javax.net.ssl.SSLHandshakeException
            if (r5 == 0) goto L_0x0032
            java.lang.Throwable r5 = r3.getCause()
            boolean r5 = r5 instanceof java.security.cert.CertificateException
            if (r5 == 0) goto L_0x0032
            goto L_0x0023
        L_0x0032:
            boolean r3 = r3 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r3 == 0) goto L_0x0021
            goto L_0x0023
        L_0x0037:
            if (r3 != 0) goto L_0x003a
            return r1
        L_0x003a:
            v.m0.d.d r3 = r4.f11282f
            r5 = 0
            if (r3 == 0) goto L_0x005a
            boolean r3 = r3.mo11118b()
            if (r3 == 0) goto L_0x0055
            v.m0.d.d r3 = r4.f11282f
            if (r3 == 0) goto L_0x0051
            boolean r3 = r3.mo11117a()
            if (r3 == 0) goto L_0x0055
            r3 = r0
            goto L_0x0056
        L_0x0051:
            p392u.p401r.p403c.C4638h.m10269a()
            throw r5
        L_0x0055:
            r3 = r1
        L_0x0056:
            if (r3 != 0) goto L_0x0059
            return r1
        L_0x0059:
            return r0
        L_0x005a:
            p392u.p401r.p403c.C4638h.m10269a()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p410v.p411m0.p414e.C4780i.mo11179a(java.io.IOException, v.m0.d.m, boolean, v.e0):boolean");
    }
}
