package p410v.p411m0.p412c;

import p392u.p401r.p403c.C4636f;
import p392u.p409w.C4681g;
import p410v.C4696d;
import p410v.C4720i0;
import p410v.C4720i0.C4721a;
import p410v.C4877y;

/* renamed from: v.m0.c.a */
public final class C4739a implements C4877y {

    /* renamed from: b */
    public static final C4740a f11148b = new C4740a(null);

    /* renamed from: a */
    public final C4696d f11149a;

    /* renamed from: v.m0.c.a$a */
    public static final class C4740a {
        public /* synthetic */ C4740a(C4636f fVar) {
        }

        /* renamed from: a */
        public static final /* synthetic */ C4720i0 m10479a(C4740a aVar, C4720i0 i0Var) {
            if (aVar != null) {
                if ((i0Var != null ? i0Var.f11066l : null) == null) {
                    return i0Var;
                }
                if (i0Var != null) {
                    C4721a aVar2 = new C4721a(i0Var);
                    aVar2.f11079g = null;
                    return aVar2.mo11042a();
                }
                throw null;
            }
            throw null;
        }

        /* renamed from: a */
        public final boolean mo11075a(String str) {
            return C4681g.m10322a("Content-Length", str, true) || C4681g.m10322a("Content-Encoding", str, true) || C4681g.m10322a("Content-Type", str, true);
        }

        /* renamed from: b */
        public final boolean mo11076b(String str) {
            return !C4681g.m10322a("Connection", str, true) && !C4681g.m10322a("Keep-Alive", str, true) && !C4681g.m10322a("Proxy-Authenticate", str, true) && !C4681g.m10322a("Proxy-Authorization", str, true) && !C4681g.m10322a("TE", str, true) && !C4681g.m10322a("Trailers", str, true) && !C4681g.m10322a("Transfer-Encoding", str, true) && !C4681g.m10322a("Upgrade", str, true);
        }
    }

    public C4739a(C4696d dVar) {
        this.f11149a = dVar;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r2v2, types: [v.e0, v.i0] */
    /* JADX WARNING: type inference failed for: r2v33 */
    /* JADX WARNING: type inference failed for: r2v35 */
    /* JADX WARNING: type inference failed for: r2v36 */
    /* JADX WARNING: type inference failed for: r2v43 */
    /* JADX WARNING: type inference failed for: r3v18, types: [v.m0.c.e$c] */
    /* JADX WARNING: type inference failed for: r3v19, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r3v22, types: [v.j0] */
    /* JADX WARNING: type inference failed for: r2v58 */
    /* JADX WARNING: type inference failed for: r2v59 */
    /* JADX WARNING: type inference failed for: r2v60 */
    /* JADX WARNING: type inference failed for: r3v23 */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0278, code lost:
        if (r4 > 0) goto L_0x02b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011d, code lost:
        if (r3 != 0) goto L_0x0126;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v2, types: [v.e0, v.i0]
      assigns: []
      uses: [v.e0, v.i0]
      mth insns count: 635
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
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0348  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x03db  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x03eb A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0417  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0431  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x05ec  */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x0672  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0139  */
    /* JADX WARNING: Unknown variable types count: 6 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p410v.C4720i0 mo11074a(p410v.C4877y.C4878a r28) {
        /*
            r27 = this;
            r1 = r27
            r0 = r28
            r2 = 0
            if (r0 == 0) goto L_0x0678
            v.d r3 = r1.f11149a
            java.lang.String r4 = "Content-Type"
            java.lang.String r5 = "request"
            r6 = 0
            r7 = 1
            if (r3 == 0) goto L_0x012e
            v.e0 r8 = r28.mo11176g()
            if (r8 == 0) goto L_0x012a
            v.x r9 = r8.f11029b
            java.lang.String r9 = p410v.C4696d.m10349a(r9)
            v.m0.c.e r3 = r3.f10977e     // Catch:{ IOException -> 0x012e }
            v.m0.c.e$c r3 = r3.mo11083b(r9)     // Catch:{ IOException -> 0x012e }
            if (r3 == 0) goto L_0x012e
            v.d$b r9 = new v.d$b     // Catch:{ IOException -> 0x0126 }
            java.util.List<w.a0> r10 = r3.f11197g     // Catch:{ IOException -> 0x0126 }
            java.lang.Object r10 = r10.get(r6)     // Catch:{ IOException -> 0x0126 }
            w.a0 r10 = (p423w.C4882a0) r10     // Catch:{ IOException -> 0x0126 }
            r9.<init>(r10)     // Catch:{ IOException -> 0x0126 }
            v.w r10 = r9.f10996g
            java.lang.String r10 = r10.mo11366a(r4)
            v.w r11 = r9.f10996g
            java.lang.String r12 = "Content-Length"
            java.lang.String r11 = r11.mo11366a(r12)
            v.e0$a r12 = new v.e0$a
            r12.<init>()
            java.lang.String r13 = r9.f10990a
            if (r13 == 0) goto L_0x0120
            java.lang.String r14 = "ws:"
            boolean r14 = p392u.p409w.C4681g.m10326b(r13, r14, r7)
            if (r14 == 0) goto L_0x0059
            java.lang.String r14 = "http:"
            java.lang.StringBuilder r14 = p213q.p214a.p215a.p216a.C1965a.m4756a(r14)
            r15 = 3
            goto L_0x0068
        L_0x0059:
            java.lang.String r14 = "wss:"
            boolean r14 = p392u.p409w.C4681g.m10326b(r13, r14, r7)
            if (r14 == 0) goto L_0x0078
            java.lang.String r14 = "https:"
            java.lang.StringBuilder r14 = p213q.p214a.p215a.p216a.C1965a.m4756a(r14)
            r15 = 4
        L_0x0068:
            java.lang.String r13 = r13.substring(r15)
            java.lang.String r15 = "(this as java.lang.String).substring(startIndex)"
            p392u.p401r.p403c.C4638h.m10270a(r13, r15)
            r14.append(r13)
            java.lang.String r13 = r14.toString()
        L_0x0078:
            v.x$b r14 = p410v.C4873x.f11615l
            v.x r13 = r14.mo11409b(r13)
            r12.mo11020a(r13)
            java.lang.String r13 = r9.f10992c
            r12.mo11018a(r13, r2)
            v.w r13 = r9.f10991b
            r12.mo11019a(r13)
            v.e0 r12 = r12.mo11021a()
            v.i0$a r13 = new v.i0$a
            r13.<init>()
            r13.f11073a = r12
            v.c0 r12 = r9.f10993d
            r13.mo11038a(r12)
            int r12 = r9.f10994e
            r13.f11075c = r12
            java.lang.String r12 = r9.f10995f
            r13.mo11036a(r12)
            v.w r12 = r9.f10996g
            r13.mo11041a(r12)
            v.d$a r12 = new v.d$a
            r12.<init>(r3, r10, r11)
            r13.f11079g = r12
            v.v r3 = r9.f10997h
            r13.f11077e = r3
            long r10 = r9.f10998i
            r13.f11083k = r10
            long r10 = r9.f10999j
            r13.f11084l = r10
            v.i0 r3 = r13.mo11042a()
            java.lang.String r10 = r9.f10990a
            v.x r11 = r8.f11029b
            java.lang.String r11 = r11.f11625j
            boolean r10 = p392u.p401r.p403c.C4638h.m10272a(r10, r11)
            if (r10 == 0) goto L_0x0119
            java.lang.String r10 = r9.f10992c
            java.lang.String r11 = r8.f11030c
            boolean r10 = p392u.p401r.p403c.C4638h.m10272a(r10, r11)
            if (r10 == 0) goto L_0x0119
            v.w r9 = r9.f10991b
            if (r9 == 0) goto L_0x0113
            v.w r10 = r3.f11065k
            java.util.Set r10 = p410v.C4696d.m10350a(r10)
            boolean r11 = r10 instanceof java.util.Collection
            if (r11 == 0) goto L_0x00eb
            boolean r11 = r10.isEmpty()
            if (r11 == 0) goto L_0x00eb
            goto L_0x010e
        L_0x00eb:
            java.util.Iterator r10 = r10.iterator()
        L_0x00ef:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x010e
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            java.util.List r12 = r9.mo11367b(r11)
            v.w r13 = r8.f11031d
            java.util.List r11 = r13.mo11367b(r11)
            boolean r11 = p392u.p401r.p403c.C4638h.m10272a(r12, r11)
            r11 = r11 ^ r7
            if (r11 == 0) goto L_0x00ef
            r8 = r6
            goto L_0x010f
        L_0x010e:
            r8 = r7
        L_0x010f:
            if (r8 == 0) goto L_0x0119
            r6 = r7
            goto L_0x0119
        L_0x0113:
            java.lang.String r0 = "cachedRequest"
            p392u.p401r.p403c.C4638h.m10271a(r0)
            throw r2
        L_0x0119:
            if (r6 != 0) goto L_0x012f
            v.j0 r3 = r3.f11066l
            if (r3 == 0) goto L_0x012e
            goto L_0x0126
        L_0x0120:
            java.lang.String r0 = "url"
            p392u.p401r.p403c.C4638h.m10271a(r0)
            throw r2
        L_0x0126:
            p410v.p411m0.C4737b.m10463a(r3)
            goto L_0x012e
        L_0x012a:
            p392u.p401r.p403c.C4638h.m10271a(r5)
            throw r2
        L_0x012e:
            r3 = r2
        L_0x012f:
            long r8 = java.lang.System.currentTimeMillis()
            v.e0 r6 = r28.mo11176g()
            if (r6 == 0) goto L_0x0672
            if (r3 == 0) goto L_0x01bb
            long r10 = r3.f11070p
            long r12 = r3.f11071q
            v.w r5 = r3.f11065k
            int r14 = r5.size()
            r15 = 0
            r16 = -1
            r17 = r2
            r18 = r17
            r19 = r18
            r7 = r15
            r21 = r16
            r15 = r19
            r16 = r15
        L_0x0155:
            r22 = r2
            if (r7 >= r14) goto L_0x01b8
            java.lang.String r2 = r5.mo11369e(r7)
            r23 = r10
            java.lang.String r10 = r5.mo11371f(r7)
            java.lang.String r11 = "Date"
            r25 = r5
            r5 = 1
            boolean r11 = p392u.p409w.C4681g.m10322a(r2, r11, r5)
            if (r11 == 0) goto L_0x0175
            java.util.Date r2 = p410v.p411m0.p414e.C4773c.m10573a(r10)
            r19 = r10
            goto L_0x01b1
        L_0x0175:
            java.lang.String r11 = "Expires"
            boolean r11 = p392u.p409w.C4681g.m10322a(r2, r11, r5)
            if (r11 == 0) goto L_0x0185
            java.util.Date r2 = p410v.p411m0.p414e.C4773c.m10573a(r10)
            r15 = r2
        L_0x0182:
            r2 = r22
            goto L_0x01b1
        L_0x0185:
            java.lang.String r11 = "Last-Modified"
            boolean r11 = p392u.p409w.C4681g.m10322a(r2, r11, r5)
            if (r11 == 0) goto L_0x0196
            java.util.Date r2 = p410v.p411m0.p414e.C4773c.m10573a(r10)
            r16 = r2
            r18 = r10
            goto L_0x0182
        L_0x0196:
            java.lang.String r11 = "ETag"
            boolean r11 = p392u.p409w.C4681g.m10322a(r2, r11, r5)
            if (r11 == 0) goto L_0x01a1
            r17 = r10
            goto L_0x0182
        L_0x01a1:
            java.lang.String r11 = "Age"
            boolean r2 = p392u.p409w.C4681g.m10322a(r2, r11, r5)
            if (r2 == 0) goto L_0x0182
            r2 = -1
            int r2 = p410v.p411m0.C4737b.m10472b(r10, r2)
            r21 = r2
            goto L_0x0182
        L_0x01b1:
            int r7 = r7 + 1
            r10 = r23
            r5 = r25
            goto L_0x0155
        L_0x01b8:
            r23 = r10
            goto L_0x01cb
        L_0x01bb:
            r2 = 0
            r21 = -1
            r10 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r12 = 0
        L_0x01cb:
            r5 = r21
            java.lang.String r7 = "Warning"
            if (r3 != 0) goto L_0x01d8
            v.m0.c.d r2 = new v.m0.c.d
            r5 = 0
            r2.<init>(r6, r5)
            goto L_0x01f5
        L_0x01d8:
            v.x r14 = r6.f11029b
            boolean r14 = r14.f11616a
            if (r14 == 0) goto L_0x01e9
            v.v r14 = r3.f11064j
            if (r14 != 0) goto L_0x01e9
            v.m0.c.d r2 = new v.m0.c.d
            r14 = 0
            r2.<init>(r6, r14)
            goto L_0x01f5
        L_0x01e9:
            r14 = 0
            boolean r20 = p410v.p411m0.p412c.C4743d.m10486a(r3, r6)
            if (r20 != 0) goto L_0x01fb
            v.m0.c.d r2 = new v.m0.c.d
            r2.<init>(r6, r14)
        L_0x01f5:
            r20 = r4
            r1 = r6
            r5 = r7
            goto L_0x0390
        L_0x01fb:
            v.e r14 = r6.mo11013a()
            r20 = r4
            boolean r4 = r14.f11015a
            if (r4 != 0) goto L_0x03b8
            java.lang.String r4 = "If-Modified-Since"
            java.lang.String r21 = r6.mo11012a(r4)
            r22 = r4
            java.lang.String r4 = "If-None-Match"
            if (r21 != 0) goto L_0x021b
            java.lang.String r21 = r6.mo11012a(r4)
            if (r21 == 0) goto L_0x0218
            goto L_0x021b
        L_0x0218:
            r21 = 0
            goto L_0x021d
        L_0x021b:
            r21 = 1
        L_0x021d:
            if (r21 == 0) goto L_0x0221
            goto L_0x03b8
        L_0x0221:
            r21 = r4
            v.e r4 = r3.mo11032a()
            if (r2 == 0) goto L_0x023a
            long r23 = r2.getTime()
            long r0 = r12 - r23
            r23 = r6
            r24 = r7
            r6 = 0
            long r0 = java.lang.Math.max(r6, r0)
            goto L_0x0240
        L_0x023a:
            r23 = r6
            r24 = r7
            r0 = 0
        L_0x0240:
            r6 = -1
            if (r5 == r6) goto L_0x0250
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            r7 = r4
            long r4 = (long) r5
            long r4 = r6.toMillis(r4)
            long r0 = java.lang.Math.max(r0, r4)
            goto L_0x0251
        L_0x0250:
            r7 = r4
        L_0x0251:
            long r4 = r12 - r10
            long r8 = r8 - r12
            long r0 = r0 + r4
            long r0 = r0 + r8
            v.e r4 = r3.mo11032a()
            int r4 = r4.f11017c
            r5 = -1
            if (r4 == r5) goto L_0x0267
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            long r8 = (long) r4
            long r4 = r5.toMillis(r8)
            goto L_0x02b2
        L_0x0267:
            if (r15 == 0) goto L_0x027b
            if (r2 == 0) goto L_0x026f
            long r12 = r2.getTime()
        L_0x026f:
            long r4 = r15.getTime()
            long r4 = r4 - r12
            r8 = 0
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x02b0
            goto L_0x02b2
        L_0x027b:
            if (r16 == 0) goto L_0x02b0
            v.e0 r4 = r3.f11060f
            v.x r4 = r4.f11029b
            java.util.List<java.lang.String> r5 = r4.f11623h
            if (r5 != 0) goto L_0x0287
            r4 = 0
            goto L_0x0297
        L_0x0287:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            v.x$b r6 = p410v.C4873x.f11615l
            java.util.List<java.lang.String> r4 = r4.f11623h
            r6.mo11407a(r4, r5)
            java.lang.String r4 = r5.toString()
        L_0x0297:
            if (r4 != 0) goto L_0x02b0
            if (r2 == 0) goto L_0x029f
            long r10 = r2.getTime()
        L_0x029f:
            long r4 = r16.getTime()
            long r10 = r10 - r4
            r4 = 0
            int r4 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x02b0
            r4 = 10
            long r4 = (long) r4
            long r4 = r10 / r4
            goto L_0x02b2
        L_0x02b0:
            r4 = 0
        L_0x02b2:
            int r6 = r14.f11017c
            r8 = -1
            if (r6 == r8) goto L_0x02c2
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS
            long r10 = (long) r6
            long r9 = r9.toMillis(r10)
            long r4 = java.lang.Math.min(r4, r9)
        L_0x02c2:
            int r6 = r14.f11023i
            if (r6 == r8) goto L_0x02ce
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS
            long r10 = (long) r6
            long r9 = r9.toMillis(r10)
            goto L_0x02d0
        L_0x02ce:
            r9 = 0
        L_0x02d0:
            boolean r6 = r7.f11021g
            if (r6 != 0) goto L_0x02e0
            int r6 = r14.f11022h
            if (r6 == r8) goto L_0x02e0
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
            long r11 = (long) r6
            long r11 = r8.toMillis(r11)
            goto L_0x02e2
        L_0x02e0:
            r11 = 0
        L_0x02e2:
            boolean r6 = r7.f11015a
            if (r6 != 0) goto L_0x0329
            long r9 = r9 + r0
            long r11 = r11 + r4
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x0329
            v.i0$a r2 = new v.i0$a
            r2.<init>(r3)
            int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x02fd
            java.lang.String r4 = "110 HttpURLConnection \"Response is stale\""
            r5 = r24
            r2.mo11037a(r5, r4)
            goto L_0x02ff
        L_0x02fd:
            r5 = r24
        L_0x02ff:
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x031b
            v.e r0 = r3.mo11032a()
            int r0 = r0.f11017c
            r1 = -1
            if (r0 != r1) goto L_0x0313
            if (r15 != 0) goto L_0x0313
            r0 = 1
            goto L_0x0314
        L_0x0313:
            r0 = 0
        L_0x0314:
            if (r0 == 0) goto L_0x031b
            java.lang.String r0 = "113 HttpURLConnection \"Heuristic expiration\""
            r2.mo11037a(r5, r0)
        L_0x031b:
            v.m0.c.d r0 = new v.m0.c.d
            v.i0 r1 = r2.mo11042a()
            r2 = 0
            r0.<init>(r2, r1)
            r1 = r23
            goto L_0x03c0
        L_0x0329:
            r5 = r24
            if (r17 == 0) goto L_0x0334
            r0 = r17
            r4 = r21
        L_0x0331:
            r1 = r23
            goto L_0x0340
        L_0x0334:
            if (r16 == 0) goto L_0x033b
            r0 = r18
        L_0x0338:
            r4 = r22
            goto L_0x0331
        L_0x033b:
            if (r2 == 0) goto L_0x03af
            r0 = r19
            goto L_0x0338
        L_0x0340:
            v.w r2 = r1.f11031d
            v.w$a r2 = r2.mo11368c()
            if (r0 == 0) goto L_0x03aa
            r2.mo11380b(r4, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            v.x r7 = r1.f11029b
            java.lang.String r8 = r1.f11030c
            v.h0 r10 = r1.f11032e
            java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = r1.f11033f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0364
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            goto L_0x036e
        L_0x0364:
            java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = r1.f11033f
            if (r0 == 0) goto L_0x03a3
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r0)
            r0 = r4
        L_0x036e:
            v.w r4 = r1.f11031d
            r4.mo11368c()
            v.w r2 = r2.mo11378a()
            v.w$a r2 = r2.mo11368c()
            if (r7 == 0) goto L_0x0397
            v.w r9 = r2.mo11378a()
            java.util.Map r11 = p410v.p411m0.C4737b.m10459a(r0)
            v.e0 r0 = new v.e0
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            v.m0.c.d r2 = new v.m0.c.d
            r2.<init>(r0, r3)
        L_0x0390:
            r0 = 0
            r26 = r2
            r2 = r0
            r0 = r26
            goto L_0x03c0
        L_0x0397:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "url == null"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x03a3:
            java.lang.String r0 = "$this$toMutableMap"
            p392u.p401r.p403c.C4638h.m10271a(r0)
            r0 = 0
            throw r0
        L_0x03aa:
            r0 = 0
            p392u.p401r.p403c.C4638h.m10269a()
            throw r0
        L_0x03af:
            r1 = r23
            r2 = 0
            v.m0.c.d r0 = new v.m0.c.d
            r0.<init>(r1, r2)
            goto L_0x03c0
        L_0x03b8:
            r1 = r6
            r5 = r7
            r2 = 0
            v.m0.c.d r0 = new v.m0.c.d
            r0.<init>(r1, r2)
        L_0x03c0:
            v.e0 r4 = r0.f11154a
            if (r4 == 0) goto L_0x03d1
            v.e r1 = r1.mo11013a()
            boolean r1 = r1.f11024j
            if (r1 == 0) goto L_0x03d1
            v.m0.c.d r0 = new v.m0.c.d
            r0.<init>(r2, r2)
        L_0x03d1:
            v.e0 r1 = r0.f11154a
            v.i0 r2 = r0.f11155b
            r4 = r27
            v.d r6 = r4.f11149a
            if (r6 == 0) goto L_0x03de
            r6.mo10986a(r0)
        L_0x03de:
            if (r3 == 0) goto L_0x03e9
            if (r2 != 0) goto L_0x03e9
            v.j0 r0 = r3.f11066l
            if (r0 == 0) goto L_0x03e9
            p410v.p411m0.C4737b.m10463a(r0)
        L_0x03e9:
            if (r1 != 0) goto L_0x0415
            if (r2 != 0) goto L_0x0415
            v.i0$a r0 = new v.i0$a
            r0.<init>()
            v.e0 r1 = r28.mo11176g()
            r0.mo11039a(r1)
            v.c0 r1 = p410v.C4694c0.HTTP_1_1
            r0.mo11038a(r1)
            r1 = 504(0x1f8, float:7.06E-43)
            r0.f11075c = r1
            java.lang.String r1 = "Unsatisfiable Request (only-if-cached)"
            r0.f11076d = r1
            v.j0 r1 = p410v.p411m0.C4737b.f11142c
            r0.f11079g = r1
            r1 = -1
            r0.f11083k = r1
            long r1 = java.lang.System.currentTimeMillis()
            r0.f11084l = r1
            goto L_0x0427
        L_0x0415:
            if (r1 != 0) goto L_0x0431
            if (r2 == 0) goto L_0x042c
            v.i0$a r0 = new v.i0$a
            r0.<init>(r2)
            v.m0.c.a$a r1 = f11148b
            v.i0 r1 = p410v.p411m0.p412c.C4739a.C4740a.m10479a(r1, r2)
            r0.mo11040a(r1)
        L_0x0427:
            v.i0 r0 = r0.mo11042a()
            return r0
        L_0x042c:
            p392u.p401r.p403c.C4638h.m10269a()
            r0 = 0
            throw r0
        L_0x0431:
            r0 = r28
            v.i0 r0 = r0.mo11170a(r1)     // Catch:{ all -> 0x0666 }
            if (r0 != 0) goto L_0x0442
            if (r3 == 0) goto L_0x0442
            v.j0 r3 = r3.f11066l
            if (r3 == 0) goto L_0x0442
            p410v.p411m0.C4737b.m10463a(r3)
        L_0x0442:
            java.lang.String r3 = "networkResponse"
            r6 = 2
            if (r2 == 0) goto L_0x053b
            if (r0 == 0) goto L_0x0532
            int r7 = r0.f11063i
            r8 = 304(0x130, float:4.26E-43)
            if (r7 != r8) goto L_0x0532
            v.i0$a r1 = new v.i0$a
            r1.<init>(r2)
            v.m0.c.a$a r7 = f11148b
            v.w r8 = r2.f11065k
            v.w r9 = r0.f11065k
            v.w$a r10 = new v.w$a
            r10.<init>()
            int r11 = r8.size()
            r12 = 0
        L_0x0464:
            if (r12 >= r11) goto L_0x049d
            java.lang.String r13 = r8.mo11369e(r12)
            java.lang.String r14 = r8.mo11371f(r12)
            r15 = 1
            boolean r15 = p392u.p409w.C4681g.m10322a(r5, r13, r15)
            if (r15 == 0) goto L_0x0481
            java.lang.String r15 = "1"
            r24 = r5
            r5 = 0
            boolean r5 = p392u.p409w.C4681g.m10327b(r14, r15, r5, r6)
            if (r5 == 0) goto L_0x0483
            goto L_0x0498
        L_0x0481:
            r24 = r5
        L_0x0483:
            boolean r5 = r7.mo11075a(r13)
            if (r5 != 0) goto L_0x0495
            boolean r5 = r7.mo11076b(r13)
            if (r5 == 0) goto L_0x0495
            java.lang.String r5 = r9.mo11366a(r13)
            if (r5 != 0) goto L_0x0498
        L_0x0495:
            r10.mo11380b(r13, r14)
        L_0x0498:
            int r12 = r12 + 1
            r5 = r24
            goto L_0x0464
        L_0x049d:
            r5 = 0
            int r6 = r9.size()
        L_0x04a2:
            if (r5 >= r6) goto L_0x04be
            java.lang.String r8 = r9.mo11369e(r5)
            boolean r11 = r7.mo11075a(r8)
            if (r11 != 0) goto L_0x04bb
            boolean r11 = r7.mo11076b(r8)
            if (r11 == 0) goto L_0x04bb
            java.lang.String r11 = r9.mo11371f(r5)
            r10.mo11380b(r8, r11)
        L_0x04bb:
            int r5 = r5 + 1
            goto L_0x04a2
        L_0x04be:
            v.w r5 = r10.mo11378a()
            r1.mo11041a(r5)
            long r5 = r0.f11070p
            r1.f11083k = r5
            long r5 = r0.f11071q
            r1.f11084l = r5
            v.m0.c.a$a r5 = f11148b
            v.i0 r5 = p410v.p411m0.p412c.C4739a.C4740a.m10479a(r5, r2)
            r1.mo11040a(r5)
            v.m0.c.a$a r5 = f11148b
            v.i0 r5 = p410v.p411m0.p412c.C4739a.C4740a.m10479a(r5, r0)
            r1.mo11043a(r3, r5)
            r1.f11080h = r5
            v.i0 r1 = r1.mo11042a()
            v.j0 r0 = r0.f11066l
            if (r0 == 0) goto L_0x052d
            r0.close()
            v.d r0 = r4.f11149a
            if (r0 == 0) goto L_0x0528
            r0.mo10984a()
            v.d r0 = r4.f11149a
            if (r0 == 0) goto L_0x0526
            v.d$b r0 = new v.d$b
            r0.<init>(r1)
            v.j0 r2 = r2.f11066l
            if (r2 == 0) goto L_0x051e
            v.d$a r2 = (p410v.C4696d.C4697a) r2
            v.m0.c.e$c r2 = r2.f10984h
            v.m0.c.e r3 = r2.f11198h     // Catch:{ IOException -> 0x0517 }
            java.lang.String r5 = r2.f11195e     // Catch:{ IOException -> 0x0517 }
            long r6 = r2.f11196f     // Catch:{ IOException -> 0x0517 }
            v.m0.c.e$a r2 = r3.mo11079a(r5, r6)     // Catch:{ IOException -> 0x0517 }
            if (r2 == 0) goto L_0x051d
            r0.mo10994a(r2)     // Catch:{ IOException -> 0x0518 }
            r2.mo11098b()     // Catch:{ IOException -> 0x0518 }
            goto L_0x051d
        L_0x0517:
            r2 = 0
        L_0x0518:
            if (r2 == 0) goto L_0x051d
            r2.mo11097a()     // Catch:{ IOException -> 0x051d }
        L_0x051d:
            return r1
        L_0x051e:
            u.i r0 = new u.i
            java.lang.String r1 = "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody"
            r0.<init>(r1)
            throw r0
        L_0x0526:
            r0 = 0
            throw r0
        L_0x0528:
            r0 = 0
            p392u.p401r.p403c.C4638h.m10269a()
            throw r0
        L_0x052d:
            r0 = 0
            p392u.p401r.p403c.C4638h.m10269a()
            throw r0
        L_0x0532:
            r5 = 0
            v.j0 r7 = r2.f11066l
            if (r7 == 0) goto L_0x053c
            p410v.p411m0.C4737b.m10463a(r7)
            goto L_0x053c
        L_0x053b:
            r5 = 0
        L_0x053c:
            if (r0 == 0) goto L_0x0661
            v.i0$a r7 = new v.i0$a
            r7.<init>(r0)
            v.m0.c.a$a r8 = f11148b
            v.i0 r2 = p410v.p411m0.p412c.C4739a.C4740a.m10479a(r8, r2)
            r7.mo11040a(r2)
            v.m0.c.a$a r2 = f11148b
            v.i0 r0 = p410v.p411m0.p412c.C4739a.C4740a.m10479a(r2, r0)
            r7.mo11043a(r3, r0)
            r7.f11080h = r0
            v.i0 r0 = r7.mo11042a()
            v.d r2 = r4.f11149a
            if (r2 == 0) goto L_0x0660
            boolean r2 = p410v.p411m0.p414e.C4776e.m10583a(r0)
            java.lang.String r3 = "MOVE"
            java.lang.String r7 = "DELETE"
            java.lang.String r8 = "PUT"
            java.lang.String r9 = "PATCH"
            java.lang.String r10 = "POST"
            java.lang.String r11 = "method"
            if (r2 == 0) goto L_0x062f
            boolean r2 = p410v.p411m0.p412c.C4743d.m10486a(r0, r1)
            if (r2 == 0) goto L_0x062f
            v.d r1 = r4.f11149a
            if (r1 == 0) goto L_0x062d
            v.e0 r2 = r0.f11060f
            java.lang.String r2 = r2.f11030c
            if (r2 == 0) goto L_0x0628
            boolean r10 = p392u.p401r.p403c.C4638h.m10272a(r2, r10)
            if (r10 != 0) goto L_0x059f
            boolean r9 = p392u.p401r.p403c.C4638h.m10272a(r2, r9)
            if (r9 != 0) goto L_0x059f
            boolean r8 = p392u.p401r.p403c.C4638h.m10272a(r2, r8)
            if (r8 != 0) goto L_0x059f
            boolean r7 = p392u.p401r.p403c.C4638h.m10272a(r2, r7)
            if (r7 != 0) goto L_0x059f
            boolean r3 = p392u.p401r.p403c.C4638h.m10272a(r2, r3)
            if (r3 == 0) goto L_0x05a0
        L_0x059f:
            r5 = 1
        L_0x05a0:
            if (r5 == 0) goto L_0x05a8
            v.e0 r2 = r0.f11060f     // Catch:{ IOException -> 0x05e8 }
            r1.mo10985a(r2)     // Catch:{ IOException -> 0x05e8 }
            goto L_0x05e8
        L_0x05a8:
            java.lang.String r3 = "GET"
            boolean r2 = p392u.p401r.p403c.C4638h.m10272a(r2, r3)
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x05b3
            goto L_0x05e8
        L_0x05b3:
            v.w r2 = r0.f11065k
            java.util.Set r2 = p410v.C4696d.m10350a(r2)
            java.lang.String r3 = "*"
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x05c2
            goto L_0x05e8
        L_0x05c2:
            v.d$b r2 = new v.d$b
            r2.<init>(r0)
            v.m0.c.e r3 = r1.f10977e     // Catch:{ IOException -> 0x05e2 }
            v.e0 r5 = r0.f11060f     // Catch:{ IOException -> 0x05e2 }
            v.x r5 = r5.f11029b     // Catch:{ IOException -> 0x05e2 }
            java.lang.String r5 = p410v.C4696d.m10349a(r5)     // Catch:{ IOException -> 0x05e2 }
            r7 = 0
            v.m0.c.e$a r3 = p410v.p411m0.p412c.C4744e.m10487a(r3, r5, r7, r6)     // Catch:{ IOException -> 0x05e2 }
            if (r3 == 0) goto L_0x05e8
            r2.mo10994a(r3)     // Catch:{ IOException -> 0x05e3 }
            v.d$c r2 = new v.d$c     // Catch:{ IOException -> 0x05e3 }
            r2.<init>(r1, r3)     // Catch:{ IOException -> 0x05e3 }
            goto L_0x05e9
        L_0x05e2:
            r3 = 0
        L_0x05e3:
            if (r3 == 0) goto L_0x05e8
            r3.mo11097a()     // Catch:{ IOException -> 0x05e8 }
        L_0x05e8:
            r2 = 0
        L_0x05e9:
            if (r2 != 0) goto L_0x05ec
            goto L_0x0622
        L_0x05ec:
            w.y r1 = r2.mo10996a()
            v.j0 r3 = r0.f11066l
            if (r3 == 0) goto L_0x0623
            w.i r3 = r3.mo10991h()
            w.h r1 = p119o.p120a.C0967p0.m2182a(r1)
            v.m0.c.b r5 = new v.m0.c.b
            r5.<init>(r3, r2, r1)
            r1 = 0
            r2 = r20
            java.lang.String r1 = p410v.C4720i0.m10406a(r0, r2, r1, r6)
            v.j0 r2 = r0.f11066l
            long r2 = r2.mo10989f()
            v.i0$a r6 = new v.i0$a
            r6.<init>(r0)
            v.m0.e.h r0 = new v.m0.e.h
            w.i r5 = p119o.p120a.C0967p0.m2183a(r5)
            r0.<init>(r1, r2, r5)
            r6.f11079g = r0
            v.i0 r0 = r6.mo11042a()
        L_0x0622:
            return r0
        L_0x0623:
            p392u.p401r.p403c.C4638h.m10269a()
            r0 = 0
            throw r0
        L_0x0628:
            r0 = 0
            p392u.p401r.p403c.C4638h.m10271a(r11)
            throw r0
        L_0x062d:
            r0 = 0
            throw r0
        L_0x062f:
            r2 = 1
            java.lang.String r6 = r1.f11030c
            if (r6 == 0) goto L_0x065b
            boolean r10 = p392u.p401r.p403c.C4638h.m10272a(r6, r10)
            if (r10 != 0) goto L_0x0652
            boolean r9 = p392u.p401r.p403c.C4638h.m10272a(r6, r9)
            if (r9 != 0) goto L_0x0652
            boolean r8 = p392u.p401r.p403c.C4638h.m10272a(r6, r8)
            if (r8 != 0) goto L_0x0652
            boolean r7 = p392u.p401r.p403c.C4638h.m10272a(r6, r7)
            if (r7 != 0) goto L_0x0652
            boolean r3 = p392u.p401r.p403c.C4638h.m10272a(r6, r3)
            if (r3 == 0) goto L_0x0653
        L_0x0652:
            r5 = r2
        L_0x0653:
            if (r5 == 0) goto L_0x0660
            v.d r2 = r4.f11149a     // Catch:{ IOException -> 0x0660 }
            r2.mo10985a(r1)     // Catch:{ IOException -> 0x0660 }
            goto L_0x0660
        L_0x065b:
            p392u.p401r.p403c.C4638h.m10271a(r11)
            r0 = 0
            throw r0
        L_0x0660:
            return r0
        L_0x0661:
            r0 = 0
            p392u.p401r.p403c.C4638h.m10269a()
            throw r0
        L_0x0666:
            r0 = move-exception
            r1 = r0
            if (r3 == 0) goto L_0x0671
            v.j0 r0 = r3.f11066l
            if (r0 == 0) goto L_0x0671
            p410v.p411m0.C4737b.m10463a(r0)
        L_0x0671:
            throw r1
        L_0x0672:
            r4 = r1
            p392u.p401r.p403c.C4638h.m10271a(r5)
            r0 = 0
            throw r0
        L_0x0678:
            r4 = r1
            java.lang.String r0 = "chain"
            p392u.p401r.p403c.C4638h.m10271a(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p410v.p411m0.p412c.C4739a.mo11074a(v.y$a):v.i0");
    }
}
