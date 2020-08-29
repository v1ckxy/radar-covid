package p410v.p422n0;

import java.util.Set;
import p392u.p393n.C4572k;
import p392u.p401r.p403c.C4638h;
import p392u.p409w.C4681g;
import p410v.C4870w;
import p410v.C4877y;

/* renamed from: v.n0.a */
public final class C4855a implements C4877y {

    /* renamed from: a */
    public volatile Set<String> f11580a;

    /* renamed from: b */
    public volatile C4856a f11581b;

    /* renamed from: c */
    public final C4857b f11582c;

    /* renamed from: v.n0.a$a */
    public enum C4856a {
        NONE,
        HEADERS,
        BODY
    }

    /* renamed from: v.n0.a$b */
    public interface C4857b {

        /* renamed from: a */
        public static final C4857b f11587a = new b$a();

        /* renamed from: a */
        void mo11343a(String str);
    }

    public /* synthetic */ C4855a(C4857b bVar, int i) {
        if ((i & 1) != 0) {
            bVar = C4857b.f11587a;
        }
        if (bVar != null) {
            this.f11582c = bVar;
            this.f11580a = C4572k.f10781e;
            this.f11581b = C4856a.NONE;
            return;
        }
        C4638h.m10271a("logger");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x029d, code lost:
        if (r3 != null) goto L_0x02a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0113, code lost:
        if (r13 != null) goto L_0x011b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p410v.C4720i0 mo11074a(p410v.C4877y.C4878a r22) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            if (r0 == 0) goto L_0x0341
            v.n0.a$a r2 = r1.f11581b
            v.e0 r3 = r22.mo11176g()
            v.n0.a$a r4 = p410v.p422n0.C4855a.C4856a.NONE
            if (r2 != r4) goto L_0x0015
            v.i0 r0 = r0.mo11170a(r3)
            return r0
        L_0x0015:
            v.n0.a$a r4 = p410v.p422n0.C4855a.C4856a.BODY
            if (r2 != r4) goto L_0x001b
            r4 = 1
            goto L_0x001c
        L_0x001b:
            r4 = 0
        L_0x001c:
            if (r4 != 0) goto L_0x0025
            v.n0.a$a r5 = p410v.p422n0.C4855a.C4856a.HEADERS
            if (r2 != r5) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r2 = 0
            goto L_0x0026
        L_0x0025:
            r2 = 1
        L_0x0026:
            v.h0 r5 = r3.f11032e
            v.k r6 = r22.mo11172a()
            java.lang.String r7 = "--> "
            java.lang.StringBuilder r7 = p213q.p214a.p215a.p216a.C1965a.m4756a(r7)
            java.lang.String r8 = r3.f11030c
            r7.append(r8)
            r8 = 32
            r7.append(r8)
            v.x r8 = r3.f11029b
            r7.append(r8)
            java.lang.String r8 = ""
            if (r6 == 0) goto L_0x0057
            java.lang.String r9 = " "
            java.lang.StringBuilder r9 = p213q.p214a.p215a.p216a.C1965a.m4756a(r9)
            v.c0 r6 = r6.mo11054a()
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            goto L_0x0058
        L_0x0057:
            r6 = r8
        L_0x0058:
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "-byte body)"
            java.lang.String r9 = " ("
            if (r2 != 0) goto L_0x0079
            if (r5 == 0) goto L_0x0079
            java.lang.StringBuilder r6 = p213q.p214a.p215a.p216a.C1965a.m4763b(r6, r9)
            long r10 = r5.mo10970a()
            r6.append(r10)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
        L_0x0079:
            v.n0.a$b r10 = r1.f11582c
            r10.mo11343a(r6)
            java.lang.String r6 = "-byte body omitted)"
            java.lang.String r10 = "UTF_8"
            if (r2 == 0) goto L_0x017c
            v.w r13 = r3.f11031d
            if (r5 == 0) goto L_0x00d4
            v.z r14 = r5.mo10973b()
            if (r14 == 0) goto L_0x00ac
            java.lang.String r15 = "Content-Type"
            java.lang.String r15 = r13.mo11366a(r15)
            if (r15 != 0) goto L_0x00ac
            v.n0.a$b r15 = r1.f11582c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Content-Type: "
            r11.append(r12)
            r11.append(r14)
            java.lang.String r11 = r11.toString()
            r15.mo11343a(r11)
        L_0x00ac:
            long r11 = r5.mo10970a()
            r14 = -1
            int r11 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r11 == 0) goto L_0x00d4
            java.lang.String r11 = "Content-Length"
            java.lang.String r11 = r13.mo11366a(r11)
            if (r11 != 0) goto L_0x00d4
            v.n0.a$b r11 = r1.f11582c
            java.lang.String r12 = "Content-Length: "
            java.lang.StringBuilder r12 = p213q.p214a.p215a.p216a.C1965a.m4756a(r12)
            long r14 = r5.mo10970a()
            r12.append(r14)
            java.lang.String r12 = r12.toString()
            r11.mo11343a(r12)
        L_0x00d4:
            int r11 = r13.size()
            r12 = 0
        L_0x00d9:
            if (r12 >= r11) goto L_0x00e1
            r1.mo11341a(r13, r12)
            int r12 = r12 + 1
            goto L_0x00d9
        L_0x00e1:
            java.lang.String r11 = "--> END "
            if (r4 == 0) goto L_0x016a
            if (r5 != 0) goto L_0x00e9
            goto L_0x016a
        L_0x00e9:
            v.w r12 = r3.f11031d
            boolean r12 = r1.mo11342a(r12)
            if (r12 == 0) goto L_0x00ff
            v.n0.a$b r5 = r1.f11582c
            java.lang.StringBuilder r11 = p213q.p214a.p215a.p216a.C1965a.m4756a(r11)
            java.lang.String r12 = r3.f11030c
            r11.append(r12)
            java.lang.String r12 = " (encoded body omitted)"
            goto L_0x0172
        L_0x00ff:
            w.f r12 = new w.f
            r12.<init>()
            r5.mo10972a(r12)
            v.z r13 = r5.mo10973b()
            if (r13 == 0) goto L_0x0116
            java.nio.charset.Charset r14 = java.nio.charset.StandardCharsets.UTF_8
            java.nio.charset.Charset r13 = r13.mo11411a(r14)
            if (r13 == 0) goto L_0x0116
            goto L_0x011b
        L_0x0116:
            java.nio.charset.Charset r13 = java.nio.charset.StandardCharsets.UTF_8
            p392u.p401r.p403c.C4638h.m10270a(r13, r10)
        L_0x011b:
            v.n0.a$b r14 = r1.f11582c
            r14.mo11343a(r8)
            boolean r14 = p119o.p120a.C0967p0.m2209a(r12)
            if (r14 == 0) goto L_0x0148
            v.n0.a$b r14 = r1.f11582c
            java.lang.String r12 = r12.mo11438a(r13)
            r14.mo11343a(r12)
            v.n0.a$b r12 = r1.f11582c
            java.lang.StringBuilder r11 = p213q.p214a.p215a.p216a.C1965a.m4756a(r11)
            java.lang.String r13 = r3.f11030c
            r11.append(r13)
            r11.append(r9)
            long r13 = r5.mo10970a()
            r11.append(r13)
            r11.append(r7)
            goto L_0x0162
        L_0x0148:
            v.n0.a$b r12 = r1.f11582c
            java.lang.StringBuilder r11 = p213q.p214a.p215a.p216a.C1965a.m4756a(r11)
            java.lang.String r13 = r3.f11030c
            r11.append(r13)
            java.lang.String r13 = " (binary "
            r11.append(r13)
            long r13 = r5.mo10970a()
            r11.append(r13)
            r11.append(r6)
        L_0x0162:
            java.lang.String r5 = r11.toString()
            r12.mo11343a(r5)
            goto L_0x017c
        L_0x016a:
            v.n0.a$b r5 = r1.f11582c
            java.lang.StringBuilder r11 = p213q.p214a.p215a.p216a.C1965a.m4756a(r11)
            java.lang.String r12 = r3.f11030c
        L_0x0172:
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r5.mo11343a(r11)
        L_0x017c:
            long r11 = java.lang.System.nanoTime()
            v.i0 r0 = r0.mo11170a(r3)     // Catch:{ Exception -> 0x0328 }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r13 = java.lang.System.nanoTime()
            long r13 = r13 - r11
            long r11 = r3.toMillis(r13)
            v.j0 r3 = r0.f11066l
            if (r3 == 0) goto L_0x0323
            long r13 = r3.mo10989f()
            r15 = -1
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 == 0) goto L_0x01af
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r13)
            java.lang.String r15 = "-byte"
            r5.append(r15)
            java.lang.String r5 = r5.toString()
            goto L_0x01b1
        L_0x01af:
            java.lang.String r5 = "unknown-length"
        L_0x01b1:
            v.n0.a$b r15 = r1.f11582c
            java.lang.String r16 = "<-- "
            r17 = r7
            java.lang.StringBuilder r7 = p213q.p214a.p215a.p216a.C1965a.m4756a(r16)
            r18 = r13
            int r13 = r0.f11063i
            r7.append(r13)
            java.lang.String r13 = r0.f11062h
            int r13 = r13.length()
            if (r13 != 0) goto L_0x01cc
            r13 = 1
            goto L_0x01cd
        L_0x01cc:
            r13 = 0
        L_0x01cd:
            if (r13 == 0) goto L_0x01d5
            r13 = 32
            r20 = r6
            r6 = r8
            goto L_0x01f0
        L_0x01d5:
            java.lang.String r13 = r0.f11062h
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r16 = 32
            r20 = r6
            java.lang.String r6 = java.lang.String.valueOf(r16)
            r14.append(r6)
            r14.append(r13)
            java.lang.String r6 = r14.toString()
            r13 = r16
        L_0x01f0:
            r7.append(r6)
            r7.append(r13)
            v.e0 r6 = r0.f11060f
            v.x r6 = r6.f11029b
            r7.append(r6)
            r7.append(r9)
            r7.append(r11)
            java.lang.String r6 = "ms"
            r7.append(r6)
            if (r2 != 0) goto L_0x0213
            java.lang.String r6 = ", "
            java.lang.String r9 = " body"
            java.lang.String r5 = p213q.p214a.p215a.p216a.C1965a.m4752a(r6, r5, r9)
            goto L_0x0214
        L_0x0213:
            r5 = r8
        L_0x0214:
            r7.append(r5)
            r5 = 41
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r15.mo11343a(r5)
            if (r2 == 0) goto L_0x0322
            v.w r2 = r0.f11065k
            int r5 = r2.size()
            r6 = 0
        L_0x022c:
            if (r6 >= r5) goto L_0x0234
            r1.mo11341a(r2, r6)
            int r6 = r6 + 1
            goto L_0x022c
        L_0x0234:
            if (r4 == 0) goto L_0x031b
            boolean r4 = p410v.p411m0.p414e.C4776e.m10583a(r0)
            if (r4 != 0) goto L_0x023e
            goto L_0x031b
        L_0x023e:
            v.w r4 = r0.f11065k
            boolean r4 = r1.mo11342a(r4)
            if (r4 == 0) goto L_0x024c
            v.n0.a$b r2 = r1.f11582c
            java.lang.String r3 = "<-- END HTTP (encoded body omitted)"
            goto L_0x031f
        L_0x024c:
            w.i r4 = r3.mo10991h()
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4.mo11447c(r5)
            w.f r4 = r4.getBuffer()
            java.lang.String r5 = "Content-Encoding"
            java.lang.String r2 = r2.mo11366a(r5)
            java.lang.String r5 = "gzip"
            r6 = 1
            boolean r2 = p392u.p409w.C4681g.m10322a(r5, r2, r6)
            if (r2 == 0) goto L_0x0290
            long r5 = r4.f11661f
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            w.n r5 = new w.n
            w.f r4 = r4.clone()
            r5.<init>(r4)
            w.f r4 = new w.f     // Catch:{ all -> 0x0287 }
            r4.<init>()     // Catch:{ all -> 0x0287 }
            r4.mo11435a(r5)     // Catch:{ all -> 0x0287 }
            r6 = 0
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5235a(r5, r6)
            goto L_0x0291
        L_0x0287:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch:{ all -> 0x028a }
        L_0x028a:
            r0 = move-exception
            r3 = r0
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5235a(r5, r2)
            throw r3
        L_0x0290:
            r2 = 0
        L_0x0291:
            v.z r3 = r3.mo10990g()
            if (r3 == 0) goto L_0x02a0
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8
            java.nio.charset.Charset r3 = r3.mo11411a(r5)
            if (r3 == 0) goto L_0x02a0
            goto L_0x02a5
        L_0x02a0:
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            p392u.p401r.p403c.C4638h.m10270a(r3, r10)
        L_0x02a5:
            boolean r5 = p119o.p120a.C0967p0.m2209a(r4)
            if (r5 != 0) goto L_0x02ca
            v.n0.a$b r2 = r1.f11582c
            r2.mo11343a(r8)
            v.n0.a$b r2 = r1.f11582c
            java.lang.String r3 = "<-- END HTTP (binary "
            java.lang.StringBuilder r3 = p213q.p214a.p215a.p216a.C1965a.m4756a(r3)
            long r4 = r4.f11661f
            r3.append(r4)
            r4 = r20
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.mo11343a(r3)
            return r0
        L_0x02ca:
            r5 = 0
            int r5 = (r18 > r5 ? 1 : (r18 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x02e2
            v.n0.a$b r5 = r1.f11582c
            r5.mo11343a(r8)
            v.n0.a$b r5 = r1.f11582c
            w.f r6 = r4.clone()
            java.lang.String r3 = r6.mo11438a(r3)
            r5.mo11343a(r3)
        L_0x02e2:
            java.lang.String r3 = "<-- END HTTP ("
            if (r2 == 0) goto L_0x0306
            v.n0.a$b r5 = r1.f11582c
            java.lang.StringBuilder r3 = p213q.p214a.p215a.p216a.C1965a.m4756a(r3)
            long r6 = r4.f11661f
            r3.append(r6)
            java.lang.String r4 = "-byte, "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = "-gzipped-byte body)"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r5.mo11343a(r2)
            goto L_0x0322
        L_0x0306:
            v.n0.a$b r2 = r1.f11582c
            java.lang.StringBuilder r3 = p213q.p214a.p215a.p216a.C1965a.m4756a(r3)
            long r4 = r4.f11661f
            r3.append(r4)
            r4 = r17
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            goto L_0x031f
        L_0x031b:
            v.n0.a$b r2 = r1.f11582c
            java.lang.String r3 = "<-- END HTTP"
        L_0x031f:
            r2.mo11343a(r3)
        L_0x0322:
            return r0
        L_0x0323:
            p392u.p401r.p403c.C4638h.m10269a()
            r0 = 0
            throw r0
        L_0x0328:
            r0 = move-exception
            r2 = r0
            v.n0.a$b r0 = r1.f11582c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "<-- HTTP FAILED: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            r0.mo11343a(r3)
            throw r2
        L_0x0341:
            java.lang.String r0 = "chain"
            p392u.p401r.p403c.C4638h.m10271a(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p410v.p422n0.C4855a.mo11074a(v.y$a):v.i0");
    }

    /* renamed from: a */
    public final boolean mo11342a(C4870w wVar) {
        String a = wVar.mo11366a("Content-Encoding");
        return a != null && !C4681g.m10322a(a, "identity", true) && !C4681g.m10322a(a, "gzip", true);
    }

    /* renamed from: a */
    public final void mo11341a(C4870w wVar, int i) {
        String str;
        int i2 = i * 2;
        if (this.f11580a.contains(wVar.f11612e[i2])) {
            str = "██";
        } else {
            str = wVar.f11612e[i2 + 1];
        }
        C4857b bVar = this.f11582c;
        StringBuilder sb = new StringBuilder();
        sb.append(wVar.f11612e[i2]);
        sb.append(": ");
        sb.append(str);
        bVar.mo11343a(sb.toString());
    }
}
