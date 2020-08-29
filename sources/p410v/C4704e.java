package p410v;

import java.util.concurrent.TimeUnit;
import p116io.jsonwebtoken.lang.Objects;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;
import p392u.p409w.C4681g;

/* renamed from: v.e */
public final class C4704e {

    /* renamed from: n */
    public static final C4705a f11014n = new C4705a(null);

    /* renamed from: a */
    public final boolean f11015a;

    /* renamed from: b */
    public final boolean f11016b;

    /* renamed from: c */
    public final int f11017c;

    /* renamed from: d */
    public final int f11018d;

    /* renamed from: e */
    public final boolean f11019e;

    /* renamed from: f */
    public final boolean f11020f;

    /* renamed from: g */
    public final boolean f11021g;

    /* renamed from: h */
    public final int f11022h;

    /* renamed from: i */
    public final int f11023i;

    /* renamed from: j */
    public final boolean f11024j;

    /* renamed from: k */
    public final boolean f11025k;

    /* renamed from: l */
    public final boolean f11026l;

    /* renamed from: m */
    public String f11027m;

    /* renamed from: v.e$a */
    public static final class C4705a {
        public /* synthetic */ C4705a(C4636f fVar) {
        }

        /* renamed from: a */
        public final int mo11010a(String str, String str2, int i) {
            int length = str.length();
            while (i < length) {
                if (C4681g.m10316a((CharSequence) str2, str.charAt(i), false, 2)) {
                    return i;
                }
                i++;
            }
            return str.length();
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00ca  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00ce  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p410v.C4704e mo11011a(p410v.C4870w r27) {
            /*
                r26 = this;
                r0 = r26
                r1 = r27
                if (r1 == 0) goto L_0x017e
                int r3 = r27.size()
                r6 = 1
                r8 = r6
                r7 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = -1
                r13 = -1
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = -1
                r18 = -1
                r19 = 0
                r20 = 0
                r21 = 0
            L_0x0020:
                if (r7 >= r3) goto L_0x016d
                java.lang.String r2 = r1.mo11369e(r7)
                java.lang.String r4 = r1.mo11371f(r7)
                java.lang.String r5 = "Cache-Control"
                boolean r5 = p392u.p409w.C4681g.m10322a(r2, r5, r6)
                if (r5 == 0) goto L_0x0037
                if (r9 == 0) goto L_0x0035
                goto L_0x003f
            L_0x0035:
                r9 = r4
                goto L_0x0040
            L_0x0037:
                java.lang.String r5 = "Pragma"
                boolean r2 = p392u.p409w.C4681g.m10322a(r2, r5, r6)
                if (r2 == 0) goto L_0x0161
            L_0x003f:
                r8 = 0
            L_0x0040:
                r2 = 0
            L_0x0041:
                int r5 = r4.length()
                if (r2 >= r5) goto L_0x015c
                java.lang.String r5 = "=,;"
                int r5 = r0.mo11010a(r4, r5, r2)
                java.lang.String r2 = r4.substring(r2, r5)
                java.lang.String r6 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                p392u.p401r.p403c.C4638h.m10270a(r2, r6)
                java.lang.CharSequence r2 = p392u.p409w.C4681g.m10328c(r2)
                java.lang.String r2 = r2.toString()
                int r1 = r4.length()
                if (r5 == r1) goto L_0x00b8
                char r1 = r4.charAt(r5)
                r24 = r3
                r3 = 44
                if (r1 == r3) goto L_0x00ba
                char r1 = r4.charAt(r5)
                r3 = 59
                if (r1 != r3) goto L_0x0077
                goto L_0x00ba
            L_0x0077:
                int r5 = r5 + 1
                int r1 = p410v.p411m0.C4737b.m10446a(r4, r5)
                int r3 = r4.length()
                if (r1 >= r3) goto L_0x009f
                char r3 = r4.charAt(r1)
                r5 = 34
                if (r3 != r5) goto L_0x009f
                int r1 = r1 + 1
                r3 = 4
                r25 = r9
                r9 = 0
                int r3 = p392u.p409w.C4681g.m10302a(r4, r5, r1, r9, r3)
                java.lang.String r1 = r4.substring(r1, r3)
                p392u.p401r.p403c.C4638h.m10270a(r1, r6)
                r5 = 1
                int r3 = r3 + r5
                goto L_0x00c1
            L_0x009f:
                r25 = r9
                r9 = 0
                java.lang.String r3 = ",;"
                int r3 = r0.mo11010a(r4, r3, r1)
                java.lang.String r1 = r4.substring(r1, r3)
                p392u.p401r.p403c.C4638h.m10270a(r1, r6)
                java.lang.CharSequence r1 = p392u.p409w.C4681g.m10328c(r1)
                java.lang.String r1 = r1.toString()
                goto L_0x00c1
            L_0x00b8:
                r24 = r3
            L_0x00ba:
                r25 = r9
                r9 = 0
                int r5 = r5 + 1
                r3 = r5
                r1 = 0
            L_0x00c1:
                java.lang.String r5 = "no-cache"
                r6 = 1
                boolean r5 = p392u.p409w.C4681g.m10322a(r5, r2, r6)
                if (r5 == 0) goto L_0x00ce
                r10 = r6
            L_0x00cb:
                r5 = -1
                goto L_0x0153
            L_0x00ce:
                java.lang.String r5 = "no-store"
                boolean r5 = p392u.p409w.C4681g.m10322a(r5, r2, r6)
                if (r5 == 0) goto L_0x00d8
                r11 = r6
                goto L_0x00cb
            L_0x00d8:
                java.lang.String r5 = "max-age"
                boolean r5 = p392u.p409w.C4681g.m10322a(r5, r2, r6)
                if (r5 == 0) goto L_0x00e7
                r5 = -1
                int r12 = p410v.p411m0.C4737b.m10472b(r1, r5)
                goto L_0x0153
            L_0x00e7:
                r5 = -1
                java.lang.String r9 = "s-maxage"
                boolean r9 = p392u.p409w.C4681g.m10322a(r9, r2, r6)
                if (r9 == 0) goto L_0x00f5
                int r13 = p410v.p411m0.C4737b.m10472b(r1, r5)
                goto L_0x0153
            L_0x00f5:
                java.lang.String r5 = "private"
                boolean r5 = p392u.p409w.C4681g.m10322a(r5, r2, r6)
                if (r5 == 0) goto L_0x00ff
                r14 = r6
                goto L_0x00cb
            L_0x00ff:
                java.lang.String r5 = "public"
                boolean r5 = p392u.p409w.C4681g.m10322a(r5, r2, r6)
                if (r5 == 0) goto L_0x0109
                r15 = r6
                goto L_0x00cb
            L_0x0109:
                java.lang.String r5 = "must-revalidate"
                boolean r5 = p392u.p409w.C4681g.m10322a(r5, r2, r6)
                if (r5 == 0) goto L_0x0114
                r16 = r6
                goto L_0x00cb
            L_0x0114:
                java.lang.String r5 = "max-stale"
                boolean r5 = p392u.p409w.C4681g.m10322a(r5, r2, r6)
                if (r5 == 0) goto L_0x0124
                r2 = 2147483647(0x7fffffff, float:NaN)
                int r17 = p410v.p411m0.C4737b.m10472b(r1, r2)
                goto L_0x00cb
            L_0x0124:
                java.lang.String r5 = "min-fresh"
                boolean r5 = p392u.p409w.C4681g.m10322a(r5, r2, r6)
                if (r5 == 0) goto L_0x0132
                r5 = -1
                int r18 = p410v.p411m0.C4737b.m10472b(r1, r5)
                goto L_0x0153
            L_0x0132:
                r5 = -1
                java.lang.String r1 = "only-if-cached"
                boolean r1 = p392u.p409w.C4681g.m10322a(r1, r2, r6)
                if (r1 == 0) goto L_0x013e
                r19 = r6
                goto L_0x0153
            L_0x013e:
                java.lang.String r1 = "no-transform"
                boolean r1 = p392u.p409w.C4681g.m10322a(r1, r2, r6)
                if (r1 == 0) goto L_0x0149
                r20 = r6
                goto L_0x0153
            L_0x0149:
                java.lang.String r1 = "immutable"
                boolean r1 = p392u.p409w.C4681g.m10322a(r1, r2, r6)
                if (r1 == 0) goto L_0x0153
                r21 = r6
            L_0x0153:
                r1 = r27
                r2 = r3
                r3 = r24
                r9 = r25
                goto L_0x0041
            L_0x015c:
                r24 = r3
                r25 = r9
                goto L_0x0164
            L_0x0161:
                r24 = r3
                r2 = r9
            L_0x0164:
                r5 = -1
                int r7 = r7 + 1
                r1 = r27
                r3 = r24
                goto L_0x0020
            L_0x016d:
                r2 = r9
                if (r8 != 0) goto L_0x0173
                r22 = 0
                goto L_0x0175
            L_0x0173:
                r22 = r2
            L_0x0175:
                v.e r1 = new v.e
                r23 = 0
                r9 = r1
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r1
            L_0x017e:
                java.lang.String r1 = "headers"
                p392u.p401r.p403c.C4638h.m10271a(r1)
                r1 = 0
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p410v.C4704e.C4705a.mo11011a(v.w):v.e");
        }
    }

    static {
        new C4704e(true, false, -1, -1, false, false, false, -1, -1, false, false, false, null, null);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (timeUnit != null) {
            int i = Integer.MAX_VALUE;
            long j = (long) Integer.MAX_VALUE;
            long seconds = timeUnit.toSeconds(j);
            if (seconds <= j) {
                i = (int) seconds;
            }
            new C4704e(false, false, -1, -1, false, false, false, i, -1, true, false, false, null, null);
            return;
        }
        C4638h.m10271a("timeUnit");
        throw null;
    }

    public /* synthetic */ C4704e(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str, C4636f fVar) {
        this.f11015a = z;
        this.f11016b = z2;
        this.f11017c = i;
        this.f11018d = i2;
        this.f11019e = z3;
        this.f11020f = z4;
        this.f11021g = z5;
        this.f11022h = i3;
        this.f11023i = i4;
        this.f11024j = z6;
        this.f11025k = z7;
        this.f11026l = z8;
        this.f11027m = str;
    }

    public String toString() {
        String str = this.f11027m;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f11015a) {
                sb.append("no-cache, ");
            }
            if (this.f11016b) {
                sb.append("no-store, ");
            }
            int i = this.f11017c;
            String str2 = Objects.ARRAY_ELEMENT_SEPARATOR;
            if (i != -1) {
                sb.append("max-age=");
                sb.append(this.f11017c);
                sb.append(str2);
            }
            if (this.f11018d != -1) {
                sb.append("s-maxage=");
                sb.append(this.f11018d);
                sb.append(str2);
            }
            if (this.f11019e) {
                sb.append("private, ");
            }
            if (this.f11020f) {
                sb.append("public, ");
            }
            if (this.f11021g) {
                sb.append("must-revalidate, ");
            }
            if (this.f11022h != -1) {
                sb.append("max-stale=");
                sb.append(this.f11022h);
                sb.append(str2);
            }
            if (this.f11023i != -1) {
                sb.append("min-fresh=");
                sb.append(this.f11023i);
                sb.append(str2);
            }
            if (this.f11024j) {
                sb.append("only-if-cached, ");
            }
            if (this.f11025k) {
                sb.append("no-transform, ");
            }
            if (this.f11026l) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                return Objects.EMPTY_STRING;
            }
            sb.delete(sb.length() - 2, sb.length());
            str = sb.toString();
            C4638h.m10270a((Object) str, "StringBuilder().apply(builderAction).toString()");
            this.f11027m = str;
        }
        return str;
    }
}
