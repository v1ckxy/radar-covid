package p410v.p411m0.p414e;

import p392u.p401r.p403c.C4638h;
import p392u.p409w.C4681g;
import p410v.C4720i0;
import p410v.p411m0.C4737b;
import p423w.C4897j;

/* renamed from: v.m0.e.e */
public final class C4776e {
    static {
        C4897j.f11665i.mo11511c("\"\\");
        C4897j.f11665i.mo11511c("\t ,=");
    }

    /* renamed from: a */
    public static final boolean m10583a(C4720i0 i0Var) {
        if (i0Var == null) {
            C4638h.m10271a("$this$promisesBody");
            throw null;
        } else if (C4638h.m10272a((Object) i0Var.f11060f.f11030c, (Object) "HEAD")) {
            return false;
        } else {
            int i = i0Var.f11063i;
            if (((i >= 100 && i < 200) || i == 204 || i == 304) && C4737b.m10454a(i0Var) == -1) {
                if (C4681g.m10322a("chunked", C4720i0.m10406a(i0Var, "Transfer-Encoding", null, 2), true)) {
                    return true;
                }
                return false;
            }
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01a1, code lost:
        if (okhttp3.internal.publicsuffix.PublicSuffixDatabase.f2663g.mo4367a(r12) == null) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x018c, code lost:
        if (r3 == false) goto L_0x01a3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01ea A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m10582a(p410v.C4858p r35, p410v.C4873x r36, p410v.C4870w r37) {
        /*
            r1 = r35
            r2 = r36
            r0 = r37
            if (r1 == 0) goto L_0x021d
            if (r2 == 0) goto L_0x0216
            if (r0 == 0) goto L_0x020f
            v.p r4 = p410v.C4858p.f11588a
            if (r1 != r4) goto L_0x0011
            return
        L_0x0011:
            v.n r4 = p410v.C4854n.f11570n
            java.lang.String r4 = "Set-Cookie"
            java.util.List r4 = r0.mo11367b(r4)
            int r5 = r4.size()
            r6 = 0
            r7 = r6
            r8 = 0
        L_0x0020:
            if (r7 >= r5) goto L_0x01f6
            java.lang.Object r0 = r4.get(r7)
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L_0x01ef
            long r10 = java.lang.System.currentTimeMillis()
            r12 = 6
            r13 = 59
            int r0 = p410v.p411m0.C4737b.m10445a(r9, r13, r6, r6, r12)
            r14 = 61
            int r15 = p410v.p411m0.C4737b.m10444a(r9, r14, r6, r0)
            if (r15 != r0) goto L_0x0041
        L_0x003e:
            r9 = r6
            goto L_0x01dc
        L_0x0041:
            java.lang.String r17 = p410v.p411m0.C4737b.m10477c(r9, r6, r15)
            int r16 = r17.length()
            r3 = 1
            if (r16 != 0) goto L_0x004f
            r16 = r3
            goto L_0x0051
        L_0x004f:
            r16 = r6
        L_0x0051:
            if (r16 != 0) goto L_0x003e
            int r12 = p410v.p411m0.C4737b.m10471b(r17)
            r6 = -1
            if (r12 == r6) goto L_0x005c
            goto L_0x01a3
        L_0x005c:
            int r15 = r15 + 1
            java.lang.String r18 = p410v.p411m0.C4737b.m10477c(r9, r15, r0)
            int r12 = p410v.p411m0.C4737b.m10471b(r18)
            if (r12 == r6) goto L_0x006a
            goto L_0x01a3
        L_0x006a:
            int r0 = r0 + 1
            int r6 = r9.length()
            r19 = -1
            r26 = r3
            r21 = r19
            r12 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r28 = 0
            r29 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
        L_0x0084:
            r31 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r33 = -9223372036854775808
            if (r0 >= r6) goto L_0x0129
            int r15 = p410v.p411m0.C4737b.m10444a(r9, r13, r0, r6)
            int r13 = p410v.p411m0.C4737b.m10444a(r9, r14, r0, r15)
            java.lang.String r0 = p410v.p411m0.C4737b.m10477c(r9, r0, r13)
            if (r13 >= r15) goto L_0x00a2
            int r13 = r13 + 1
            java.lang.String r13 = p410v.p411m0.C4737b.m10477c(r9, r13, r15)
            goto L_0x00a4
        L_0x00a2:
            java.lang.String r13 = ""
        L_0x00a4:
            java.lang.String r14 = "expires"
            boolean r14 = p392u.p409w.C4681g.m10322a(r0, r14, r3)
            if (r14 == 0) goto L_0x00b6
            int r0 = r13.length()     // Catch:{ IllegalArgumentException -> 0x0120 }
            r14 = 0
            long r29 = p410v.C4854n.m10825a(r13, r14, r0)     // Catch:{ IllegalArgumentException -> 0x0120 }
            goto L_0x00eb
        L_0x00b6:
            java.lang.String r14 = "max-age"
            boolean r14 = p392u.p409w.C4681g.m10322a(r0, r14, r3)
            if (r14 == 0) goto L_0x00ef
            long r13 = java.lang.Long.parseLong(r13)     // Catch:{ NumberFormatException -> 0x00ce }
            r21 = 0
            int r0 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r0 > 0) goto L_0x00c9
            goto L_0x00cb
        L_0x00c9:
            r33 = r13
        L_0x00cb:
            r21 = r33
            goto L_0x00eb
        L_0x00ce:
            r0 = move-exception
            r14 = r0
            u.w.c r0 = new u.w.c     // Catch:{  }
            java.lang.String r3 = "-?\\d+"
            r0.<init>(r3)     // Catch:{  }
            boolean r0 = r0.mo10964a(r13)     // Catch:{  }
            if (r0 == 0) goto L_0x00ee
            java.lang.String r0 = "-"
            r3 = 2
            r14 = 0
            boolean r0 = p392u.p409w.C4681g.m10327b(r13, r0, r14, r3)     // Catch:{  }
            if (r0 == 0) goto L_0x00e9
            r31 = r33
        L_0x00e9:
            r21 = r31
        L_0x00eb:
            r25 = 1
            goto L_0x0120
        L_0x00ee:
            throw r14     // Catch:{  }
        L_0x00ef:
            java.lang.String r3 = "domain"
            r14 = 1
            boolean r3 = p392u.p409w.C4681g.m10322a(r0, r3, r14)
            if (r3 == 0) goto L_0x0100
            java.lang.String r0 = p410v.C4854n.m10826a(r13)     // Catch:{ IllegalArgumentException -> 0x0120 }
            r12 = r0
            r26 = 0
            goto L_0x0120
        L_0x0100:
            java.lang.String r3 = "path"
            boolean r3 = p392u.p409w.C4681g.m10322a(r0, r3, r14)
            if (r3 == 0) goto L_0x010b
            r28 = r13
            goto L_0x0120
        L_0x010b:
            java.lang.String r3 = "secure"
            boolean r3 = p392u.p409w.C4681g.m10322a(r0, r3, r14)
            if (r3 == 0) goto L_0x0116
            r23 = r14
            goto L_0x0120
        L_0x0116:
            java.lang.String r3 = "httponly"
            boolean r0 = p392u.p409w.C4681g.m10322a(r0, r3, r14)
            if (r0 == 0) goto L_0x0120
            r24 = 1
        L_0x0120:
            int r0 = r15 + 1
            r3 = 1
            r13 = 59
            r14 = 61
            goto L_0x0084
        L_0x0129:
            int r0 = (r21 > r33 ? 1 : (r21 == r33 ? 0 : -1))
            if (r0 != 0) goto L_0x0130
            r19 = r33
            goto L_0x015a
        L_0x0130:
            int r0 = (r21 > r19 ? 1 : (r21 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x0158
            r13 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r0 = (r21 > r13 ? 1 : (r21 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x0142
            r0 = 1000(0x3e8, float:1.401E-42)
            long r13 = (long) r0
            long r31 = r21 * r13
        L_0x0142:
            long r31 = r10 + r31
            int r0 = (r31 > r10 ? 1 : (r31 == r10 ? 0 : -1))
            r9 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            if (r0 < 0) goto L_0x0155
            int r0 = (r31 > r9 ? 1 : (r31 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0152
            goto L_0x0155
        L_0x0152:
            r19 = r31
            goto L_0x015a
        L_0x0155:
            r19 = r9
            goto L_0x015a
        L_0x0158:
            r19 = r29
        L_0x015a:
            java.lang.String r0 = r2.f11620e
            if (r12 != 0) goto L_0x0160
            r12 = r0
            goto L_0x018f
        L_0x0160:
            boolean r3 = p392u.p401r.p403c.C4638h.m10272a(r0, r12)
            if (r3 == 0) goto L_0x0168
            r3 = 1
            goto L_0x018c
        L_0x0168:
            r3 = 2
            r6 = 0
            boolean r9 = p392u.p409w.C4681g.m10323a(r0, r12, r6, r3)
            if (r9 == 0) goto L_0x018b
            int r3 = r0.length()
            int r6 = r12.length()
            int r3 = r3 - r6
            r6 = 1
            int r3 = r3 - r6
            char r3 = r0.charAt(r3)
            r9 = 46
            if (r3 != r9) goto L_0x018b
            boolean r3 = p410v.p411m0.C4737b.m10467a(r0)
            if (r3 != 0) goto L_0x018b
            r3 = r6
            goto L_0x018c
        L_0x018b:
            r3 = 0
        L_0x018c:
            if (r3 != 0) goto L_0x018f
            goto L_0x01a3
        L_0x018f:
            int r0 = r0.length()
            int r3 = r12.length()
            if (r0 == r3) goto L_0x01a5
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f2664h
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f2663g
            java.lang.String r0 = r0.mo4367a(r12)
            if (r0 != 0) goto L_0x01a5
        L_0x01a3:
            r9 = 0
            goto L_0x01dc
        L_0x01a5:
            java.lang.String r0 = "/"
            r3 = r28
            if (r3 == 0) goto L_0x01b7
            r6 = 2
            r9 = 0
            boolean r6 = p392u.p409w.C4681g.m10327b(r3, r0, r9, r6)
            if (r6 != 0) goto L_0x01b4
            goto L_0x01b8
        L_0x01b4:
            r22 = r3
            goto L_0x01d0
        L_0x01b7:
            r9 = 0
        L_0x01b8:
            java.lang.String r3 = r36.mo11388b()
            r6 = 47
            r10 = 6
            int r6 = p392u.p409w.C4681g.m10324b(r3, r6, r9, r9, r10)
            if (r6 == 0) goto L_0x01ce
            java.lang.String r0 = r3.substring(r9, r6)
            java.lang.String r3 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            p392u.p401r.p403c.C4638h.m10270a(r0, r3)
        L_0x01ce:
            r22 = r0
        L_0x01d0:
            v.n r0 = new v.n
            r27 = 0
            r16 = r0
            r21 = r12
            r16.<init>(r17, r18, r19, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x01dd
        L_0x01dc:
            r0 = 0
        L_0x01dd:
            if (r0 == 0) goto L_0x01ea
            if (r8 != 0) goto L_0x01e7
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r8 = r3
        L_0x01e7:
            r8.add(r0)
        L_0x01ea:
            int r7 = r7 + 1
            r6 = r9
            goto L_0x0020
        L_0x01ef:
            java.lang.String r0 = "setCookie"
            p392u.p401r.p403c.C4638h.m10271a(r0)
            r1 = 0
            throw r1
        L_0x01f6:
            if (r8 == 0) goto L_0x0202
            java.util.List r0 = java.util.Collections.unmodifiableList(r8)
            java.lang.String r3 = "Collections.unmodifiableList(cookies)"
            p392u.p401r.p403c.C4638h.m10270a(r0, r3)
            goto L_0x0204
        L_0x0202:
            u.n.i r0 = p392u.p393n.C4570i.f10779e
        L_0x0204:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x020b
            return
        L_0x020b:
            r1.mo11345a(r2, r0)
            return
        L_0x020f:
            java.lang.String r0 = "headers"
            p392u.p401r.p403c.C4638h.m10271a(r0)
            r1 = 0
            throw r1
        L_0x0216:
            r1 = 0
            java.lang.String r0 = "url"
            p392u.p401r.p403c.C4638h.m10271a(r0)
            throw r1
        L_0x021d:
            r1 = 0
            java.lang.String r0 = "$this$receiveHeaders"
            p392u.p401r.p403c.C4638h.m10271a(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p410v.p411m0.p414e.C4776e.m10582a(v.p, v.x, v.w):void");
    }
}
