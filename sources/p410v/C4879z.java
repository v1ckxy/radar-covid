package p410v;

import java.nio.charset.Charset;
import java.util.regex.Pattern;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;

/* renamed from: v.z */
public final class C4879z {

    /* renamed from: d */
    public static final Pattern f11635d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: e */
    public static final Pattern f11636e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: f */
    public static final C4880a f11637f = null;

    /* renamed from: a */
    public final String f11638a;

    /* renamed from: b */
    public final String f11639b;

    /* renamed from: c */
    public final String f11640c;

    /* renamed from: v.z$a */
    public static final class C4880a {
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00ac A[LOOP:0: B:5:0x004b->B:30:0x00ac, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00b1 A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final p410v.C4879z m10908a(java.lang.String r13) {
            /*
                r0 = 0
                if (r13 == 0) goto L_0x0133
                java.util.regex.Pattern r1 = p410v.C4879z.f11635d
                java.util.regex.Matcher r1 = r1.matcher(r13)
                boolean r2 = r1.lookingAt()
                r3 = 34
                if (r2 == 0) goto L_0x0115
                r2 = 1
                java.lang.String r4 = r1.group(r2)
                java.lang.String r5 = "typeSubtype.group(1)"
                p392u.p401r.p403c.C4638h.m10270a(r4, r5)
                java.util.Locale r5 = java.util.Locale.US
                java.lang.String r6 = "Locale.US"
                p392u.p401r.p403c.C4638h.m10270a(r5, r6)
                java.lang.String r9 = r4.toLowerCase(r5)
                java.lang.String r4 = "(this as java.lang.String).toLowerCase(locale)"
                p392u.p401r.p403c.C4638h.m10270a(r9, r4)
                r5 = 2
                java.lang.String r7 = r1.group(r5)
                java.lang.String r8 = "typeSubtype.group(2)"
                p392u.p401r.p403c.C4638h.m10270a(r7, r8)
                java.util.Locale r8 = java.util.Locale.US
                p392u.p401r.p403c.C4638h.m10270a(r8, r6)
                java.lang.String r10 = r7.toLowerCase(r8)
                p392u.p401r.p403c.C4638h.m10270a(r10, r4)
                java.util.regex.Pattern r4 = p410v.C4879z.f11636e
                java.util.regex.Matcher r4 = r4.matcher(r13)
                int r1 = r1.end()
            L_0x004b:
                r11 = r0
            L_0x004c:
                int r0 = r13.length()
                if (r1 >= r0) goto L_0x010c
                int r0 = r13.length()
                r4.region(r1, r0)
                boolean r0 = r4.lookingAt()
                java.lang.String r6 = "\" for: \""
                if (r0 == 0) goto L_0x00e3
                java.lang.String r0 = r4.group(r2)
                if (r0 == 0) goto L_0x00dd
                java.lang.String r1 = "charset"
                boolean r0 = p392u.p409w.C4681g.m10322a(r0, r1, r2)
                if (r0 != 0) goto L_0x0070
                goto L_0x00dd
            L_0x0070:
                java.lang.String r0 = r4.group(r5)
                r1 = 0
                if (r0 != 0) goto L_0x007f
                r0 = 3
                java.lang.String r0 = r4.group(r0)
                java.lang.String r7 = "parameter.group(3)"
                goto L_0x009e
            L_0x007f:
                java.lang.String r7 = "'"
                boolean r8 = p392u.p409w.C4681g.m10327b(r0, r7, r1, r5)
                if (r8 == 0) goto L_0x00a1
                boolean r7 = p392u.p409w.C4681g.m10323a(r0, r7, r1, r5)
                if (r7 == 0) goto L_0x00a1
                int r7 = r0.length()
                if (r7 <= r5) goto L_0x00a1
                int r7 = r0.length()
                int r7 = r7 - r2
                java.lang.String r0 = r0.substring(r2, r7)
                java.lang.String r7 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            L_0x009e:
                p392u.p401r.p403c.C4638h.m10270a(r0, r7)
            L_0x00a1:
                if (r11 == 0) goto L_0x00a9
                boolean r7 = p392u.p409w.C4681g.m10322a(r0, r11, r2)
                if (r7 == 0) goto L_0x00aa
            L_0x00a9:
                r1 = r2
            L_0x00aa:
                if (r1 == 0) goto L_0x00b1
                int r1 = r4.end()
                goto L_0x004b
            L_0x00b1:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Multiple charsets defined: \""
                r1.append(r2)
                r1.append(r11)
                java.lang.String r2 = "\" and: \""
                r1.append(r2)
                r1.append(r0)
                r1.append(r6)
                r1.append(r13)
                r1.append(r3)
                java.lang.String r13 = r1.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r13 = r13.toString()
                r0.<init>(r13)
                throw r0
            L_0x00dd:
                int r1 = r4.end()
                goto L_0x004c
            L_0x00e3:
                java.lang.String r0 = "Parameter is not formatted correctly: \""
                java.lang.StringBuilder r0 = p213q.p214a.p215a.p216a.C1965a.m4756a(r0)
                java.lang.String r1 = r13.substring(r1)
                java.lang.String r2 = "(this as java.lang.String).substring(startIndex)"
                p392u.p401r.p403c.C4638h.m10270a(r1, r2)
                r0.append(r1)
                r0.append(r6)
                r0.append(r13)
                r0.append(r3)
                java.lang.String r13 = r0.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r13 = r13.toString()
                r0.<init>(r13)
                throw r0
            L_0x010c:
                v.z r0 = new v.z
                r12 = 0
                r7 = r0
                r8 = r13
                r7.<init>(r8, r9, r10, r11, r12)
                return r0
            L_0x0115:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "No subtype found for: \""
                r0.append(r1)
                r0.append(r13)
                r0.append(r3)
                java.lang.String r13 = r0.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r13 = r13.toString()
                r0.<init>(r13)
                throw r0
            L_0x0133:
                java.lang.String r13 = "$this$toMediaType"
                p392u.p401r.p403c.C4638h.m10271a(r13)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p410v.C4879z.C4880a.m10908a(java.lang.String):v.z");
        }

        /* renamed from: b */
        public static final C4879z m10909b(String str) {
            if (str != null) {
                try {
                    return m10908a(str);
                } catch (IllegalArgumentException unused) {
                    return null;
                }
            } else {
                C4638h.m10271a("$this$toMediaTypeOrNull");
                throw null;
            }
        }
    }

    public /* synthetic */ C4879z(String str, String str2, String str3, String str4, C4636f fVar) {
        this.f11638a = str;
        this.f11639b = str2;
        this.f11640c = str4;
    }

    /* renamed from: a */
    public static /* synthetic */ Charset m10905a(C4879z zVar, Charset charset, int i) {
        if ((i & 1) != 0) {
            charset = null;
        }
        return zVar.mo11411a(charset);
    }

    /* renamed from: a */
    public static final C4879z m10906a(String str) {
        return C4880a.m10908a(str);
    }

    /* renamed from: a */
    public final Charset mo11411a(Charset charset) {
        try {
            return this.f11640c != null ? Charset.forName(this.f11640c) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C4879z) && C4638h.m10272a((Object) ((C4879z) obj).f11638a, (Object) this.f11638a);
    }

    public int hashCode() {
        return this.f11638a.hashCode();
    }

    public String toString() {
        return this.f11638a;
    }
}
