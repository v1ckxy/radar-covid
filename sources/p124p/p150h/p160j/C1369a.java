package p124p.p150h.p160j;

import java.util.Locale;

/* renamed from: p.h.j.a */
public final class C1369a {

    /* renamed from: d */
    public static final C1373c f4110d = C1374d.f4130c;

    /* renamed from: e */
    public static final String f4111e = Character.toString(8206);

    /* renamed from: f */
    public static final String f4112f = Character.toString(8207);

    /* renamed from: g */
    public static final C1369a f4113g = new C1369a(false, 2, f4110d);

    /* renamed from: h */
    public static final C1369a f4114h = new C1369a(true, 2, f4110d);

    /* renamed from: a */
    public final boolean f4115a;

    /* renamed from: b */
    public final int f4116b;

    /* renamed from: c */
    public final C1373c f4117c;

    /* renamed from: p.h.j.a$a */
    public static class C1370a {

        /* renamed from: f */
        public static final byte[] f4118f = new byte[1792];

        /* renamed from: a */
        public final CharSequence f4119a;

        /* renamed from: b */
        public final boolean f4120b;

        /* renamed from: c */
        public final int f4121c;

        /* renamed from: d */
        public int f4122d;

        /* renamed from: e */
        public char f4123e;

        static {
            for (int i = 0; i < 1792; i++) {
                f4118f[i] = Character.getDirectionality(i);
            }
        }

        public C1370a(CharSequence charSequence, boolean z) {
            this.f4119a = charSequence;
            this.f4120b = z;
            this.f4121c = charSequence.length();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0082, code lost:
            r7.f4122d = r0;
            r7.f4123e = '>';
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public byte mo5838a() {
            /*
                r7 = this;
                java.lang.CharSequence r0 = r7.f4119a
                int r1 = r7.f4122d
                int r1 = r1 + -1
                char r0 = r0.charAt(r1)
                r7.f4123e = r0
                boolean r0 = java.lang.Character.isLowSurrogate(r0)
                if (r0 == 0) goto L_0x0028
                java.lang.CharSequence r0 = r7.f4119a
                int r1 = r7.f4122d
                int r0 = java.lang.Character.codePointBefore(r0, r1)
                int r1 = r7.f4122d
                int r2 = java.lang.Character.charCount(r0)
                int r1 = r1 - r2
                r7.f4122d = r1
                byte r0 = java.lang.Character.getDirectionality(r0)
                return r0
            L_0x0028:
                int r0 = r7.f4122d
                int r0 = r0 + -1
                r7.f4122d = r0
                char r0 = r7.f4123e
                r1 = 1792(0x700, float:2.511E-42)
                if (r0 >= r1) goto L_0x0039
                byte[] r1 = f4118f
                byte r0 = r1[r0]
                goto L_0x003d
            L_0x0039:
                byte r0 = java.lang.Character.getDirectionality(r0)
            L_0x003d:
                boolean r1 = r7.f4120b
                if (r1 == 0) goto L_0x00aa
                char r1 = r7.f4123e
                r2 = 12
                r3 = 13
                r4 = 62
                if (r1 != r4) goto L_0x0087
                int r0 = r7.f4122d
            L_0x004d:
                int r1 = r7.f4122d
                if (r1 <= 0) goto L_0x0082
                java.lang.CharSequence r5 = r7.f4119a
                int r1 = r1 + -1
                r7.f4122d = r1
                char r1 = r5.charAt(r1)
                r7.f4123e = r1
                r5 = 60
                if (r1 != r5) goto L_0x0062
                goto L_0x00a1
            L_0x0062:
                if (r1 != r4) goto L_0x0065
                goto L_0x0082
            L_0x0065:
                r5 = 34
                if (r1 == r5) goto L_0x006d
                r5 = 39
                if (r1 != r5) goto L_0x004d
            L_0x006d:
                char r1 = r7.f4123e
            L_0x006f:
                int r5 = r7.f4122d
                if (r5 <= 0) goto L_0x004d
                java.lang.CharSequence r6 = r7.f4119a
                int r5 = r5 + -1
                r7.f4122d = r5
                char r5 = r6.charAt(r5)
                r7.f4123e = r5
                if (r5 == r1) goto L_0x004d
                goto L_0x006f
            L_0x0082:
                r7.f4122d = r0
                r7.f4123e = r4
                goto L_0x00a9
            L_0x0087:
                r4 = 59
                if (r1 != r4) goto L_0x00aa
                int r0 = r7.f4122d
            L_0x008d:
                int r1 = r7.f4122d
                if (r1 <= 0) goto L_0x00a5
                java.lang.CharSequence r5 = r7.f4119a
                int r1 = r1 + -1
                r7.f4122d = r1
                char r1 = r5.charAt(r1)
                r7.f4123e = r1
                r5 = 38
                if (r1 != r5) goto L_0x00a3
            L_0x00a1:
                r0 = r2
                goto L_0x00aa
            L_0x00a3:
                if (r1 != r4) goto L_0x008d
            L_0x00a5:
                r7.f4122d = r0
                r7.f4123e = r4
            L_0x00a9:
                r0 = r3
            L_0x00aa:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p124p.p150h.p160j.C1369a.C1370a.mo5838a():byte");
        }
    }

    public C1369a(boolean z, int i, C1373c cVar) {
        this.f4115a = z;
        this.f4116b = i;
        this.f4117c = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00fa, code lost:
        r5 = r5 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        return 1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m3451a(java.lang.CharSequence r13) {
        /*
            p.h.j.a$a r0 = new p.h.j.a$a
            r1 = 0
            r0.<init>(r13, r1)
            r0.f4122d = r1
            r13 = -1
            r2 = 1
            r3 = r1
            r4 = r3
            r5 = r4
        L_0x000d:
            int r6 = r0.f4122d
            int r7 = r0.f4121c
            if (r6 >= r7) goto L_0x00dc
            if (r3 != 0) goto L_0x00dc
            java.lang.CharSequence r7 = r0.f4119a
            char r6 = r7.charAt(r6)
            r0.f4123e = r6
            boolean r6 = java.lang.Character.isHighSurrogate(r6)
            if (r6 == 0) goto L_0x003a
            java.lang.CharSequence r6 = r0.f4119a
            int r7 = r0.f4122d
            int r6 = java.lang.Character.codePointAt(r6, r7)
            int r7 = r0.f4122d
            int r8 = java.lang.Character.charCount(r6)
            int r8 = r8 + r7
            r0.f4122d = r8
            byte r6 = java.lang.Character.getDirectionality(r6)
            goto L_0x00b5
        L_0x003a:
            int r6 = r0.f4122d
            int r6 = r6 + r2
            r0.f4122d = r6
            char r6 = r0.f4123e
            r7 = 1792(0x700, float:2.511E-42)
            if (r6 >= r7) goto L_0x004a
            byte[] r7 = p124p.p150h.p160j.C1369a.C1370a.f4118f
            byte r6 = r7[r6]
            goto L_0x004e
        L_0x004a:
            byte r6 = java.lang.Character.getDirectionality(r6)
        L_0x004e:
            boolean r7 = r0.f4120b
            r8 = 12
            if (r7 == 0) goto L_0x00b5
            char r7 = r0.f4123e
            r9 = 60
            if (r7 != r9) goto L_0x0099
            int r6 = r0.f4122d
        L_0x005c:
            int r7 = r0.f4122d
            int r10 = r0.f4121c
            if (r7 >= r10) goto L_0x0092
            java.lang.CharSequence r10 = r0.f4119a
            int r11 = r7 + 1
            r0.f4122d = r11
            char r7 = r10.charAt(r7)
            r0.f4123e = r7
            r10 = 62
            if (r7 != r10) goto L_0x0073
            goto L_0x00b4
        L_0x0073:
            r10 = 34
            if (r7 == r10) goto L_0x007b
            r10 = 39
            if (r7 != r10) goto L_0x005c
        L_0x007b:
            char r7 = r0.f4123e
        L_0x007d:
            int r10 = r0.f4122d
            int r11 = r0.f4121c
            if (r10 >= r11) goto L_0x005c
            java.lang.CharSequence r11 = r0.f4119a
            int r12 = r10 + 1
            r0.f4122d = r12
            char r10 = r11.charAt(r10)
            r0.f4123e = r10
            if (r10 == r7) goto L_0x005c
            goto L_0x007d
        L_0x0092:
            r0.f4122d = r6
            r0.f4123e = r9
            r6 = 13
            goto L_0x00b5
        L_0x0099:
            r9 = 38
            if (r7 != r9) goto L_0x00b5
        L_0x009d:
            int r6 = r0.f4122d
            int r7 = r0.f4121c
            if (r6 >= r7) goto L_0x00b4
            java.lang.CharSequence r7 = r0.f4119a
            int r9 = r6 + 1
            r0.f4122d = r9
            char r6 = r7.charAt(r6)
            r0.f4123e = r6
            r7 = 59
            if (r6 == r7) goto L_0x00b4
            goto L_0x009d
        L_0x00b4:
            r6 = r8
        L_0x00b5:
            if (r6 == 0) goto L_0x00d6
            if (r6 == r2) goto L_0x00d3
            r7 = 2
            if (r6 == r7) goto L_0x00d3
            r7 = 9
            if (r6 == r7) goto L_0x000d
            switch(r6) {
                case 14: goto L_0x00ce;
                case 15: goto L_0x00ce;
                case 16: goto L_0x00c9;
                case 17: goto L_0x00c9;
                case 18: goto L_0x00c4;
                default: goto L_0x00c3;
            }
        L_0x00c3:
            goto L_0x00d9
        L_0x00c4:
            int r5 = r5 + -1
            r4 = r1
            goto L_0x000d
        L_0x00c9:
            int r5 = r5 + 1
            r4 = r2
            goto L_0x000d
        L_0x00ce:
            int r5 = r5 + 1
            r4 = r13
            goto L_0x000d
        L_0x00d3:
            if (r5 != 0) goto L_0x00d9
            goto L_0x00f4
        L_0x00d6:
            if (r5 != 0) goto L_0x00d9
            goto L_0x00f8
        L_0x00d9:
            r3 = r5
            goto L_0x000d
        L_0x00dc:
            if (r3 != 0) goto L_0x00df
            goto L_0x00fd
        L_0x00df:
            if (r4 == 0) goto L_0x00e3
            r1 = r4
            goto L_0x00fd
        L_0x00e3:
            int r4 = r0.f4122d
            if (r4 <= 0) goto L_0x00fd
            byte r4 = r0.mo5838a()
            switch(r4) {
                case 14: goto L_0x00f6;
                case 15: goto L_0x00f6;
                case 16: goto L_0x00f2;
                case 17: goto L_0x00f2;
                case 18: goto L_0x00ef;
                default: goto L_0x00ee;
            }
        L_0x00ee:
            goto L_0x00e3
        L_0x00ef:
            int r5 = r5 + 1
            goto L_0x00e3
        L_0x00f2:
            if (r3 != r5) goto L_0x00fa
        L_0x00f4:
            r1 = r2
            goto L_0x00fd
        L_0x00f6:
            if (r3 != r5) goto L_0x00fa
        L_0x00f8:
            r1 = r13
            goto L_0x00fd
        L_0x00fa:
            int r5 = r5 + -1
            goto L_0x00e3
        L_0x00fd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p150h.p160j.C1369a.m3451a(java.lang.CharSequence):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        r2 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return 1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m3453b(java.lang.CharSequence r6) {
        /*
            p.h.j.a$a r0 = new p.h.j.a$a
            r1 = 0
            r0.<init>(r6, r1)
            int r6 = r0.f4121c
            r0.f4122d = r6
            r6 = r1
        L_0x000b:
            r2 = r6
        L_0x000c:
            int r3 = r0.f4122d
            r4 = 1
            if (r3 <= 0) goto L_0x0041
            byte r3 = r0.mo5838a()
            if (r3 == 0) goto L_0x0039
            if (r3 == r4) goto L_0x0032
            r5 = 2
            if (r3 == r5) goto L_0x0032
            r5 = 9
            if (r3 == r5) goto L_0x000c
            switch(r3) {
                case 14: goto L_0x002c;
                case 15: goto L_0x002c;
                case 16: goto L_0x0029;
                case 17: goto L_0x0029;
                case 18: goto L_0x0026;
                default: goto L_0x0023;
            }
        L_0x0023:
            if (r6 != 0) goto L_0x000c
            goto L_0x003f
        L_0x0026:
            int r2 = r2 + 1
            goto L_0x000c
        L_0x0029:
            if (r6 != r2) goto L_0x002f
            goto L_0x0034
        L_0x002c:
            if (r6 != r2) goto L_0x002f
            goto L_0x003b
        L_0x002f:
            int r2 = r2 + -1
            goto L_0x000c
        L_0x0032:
            if (r2 != 0) goto L_0x0036
        L_0x0034:
            r1 = r4
            goto L_0x0041
        L_0x0036:
            if (r6 != 0) goto L_0x000c
            goto L_0x003f
        L_0x0039:
            if (r2 != 0) goto L_0x003d
        L_0x003b:
            r1 = -1
            goto L_0x0041
        L_0x003d:
            if (r6 != 0) goto L_0x000c
        L_0x003f:
            r6 = r2
            goto L_0x000b
        L_0x0041:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p150h.p160j.C1369a.m3453b(java.lang.CharSequence):int");
    }

    /* renamed from: a */
    public static C1369a m3452a() {
        boolean z = true;
        if (C1380e.m3464a(Locale.getDefault()) != 1) {
            z = false;
        }
        C1373c cVar = f4110d;
        if (cVar == f4110d) {
            return z ? f4114h : f4113g;
        }
        return new C1369a(z, 2, cVar);
    }
}
