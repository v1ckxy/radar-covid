package p423w.p424c0;

import java.util.Arrays;
import p119o.p120a.C0967p0;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4638h;
import p392u.p409w.C4674a;
import p423w.C4881a;
import p423w.C4897j;
import p423w.C4897j.C4898a;

/* renamed from: w.c0.a */
public final class C4889a {

    /* renamed from: a */
    public static final char[] f11655a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    public static final C4897j f11656b = m10940a(new byte[0]);

    static {
        C4898a aVar = C4897j.f11665i;
    }

    /* renamed from: a */
    public static final int m10936a(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        char c2 = 'a';
        if ('a' > c || 'f' < c) {
            c2 = 'A';
            if ('A' > c || 'F' < c) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected hex digit: ");
                sb.append(c);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: a */
    public static final String m10938a(C4897j jVar) {
        if (jVar != null) {
            return C4881a.m10910a(jVar.f11668g, null, 1);
        }
        C4638h.m10271a("$receiver");
        throw null;
    }

    /* renamed from: b */
    public static final C4897j m10945b(String str) {
        if (str != null) {
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    int i2 = i * 2;
                    bArr[i] = (byte) (m10936a(str.charAt(i2 + 1)) + (m10936a(str.charAt(i2)) << 4));
                }
                return new C4897j(bArr);
            }
            throw new IllegalArgumentException(C1965a.m4751a("Unexpected hex string: ", str).toString());
        }
        C4638h.m10271a("$receiver");
        throw null;
    }

    /* renamed from: c */
    public static final C4897j m10948c(String str) {
        if (str != null) {
            byte[] bytes = str.getBytes(C4674a.f10859a);
            C4638h.m10270a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
            C4897j jVar = new C4897j(bytes);
            jVar.f11667f = str;
            return jVar;
        }
        C4638h.m10271a("$receiver");
        throw null;
    }

    /* renamed from: d */
    public static final String m10949d(C4897j jVar) {
        if (jVar != null) {
            byte[] bArr = jVar.f11668g;
            char[] cArr = new char[(bArr.length * 2)];
            int i = 0;
            for (byte b : bArr) {
                int i2 = i + 1;
                char[] cArr2 = f11655a;
                cArr[i] = cArr2[(b >> 4) & 15];
                i = i2 + 1;
                cArr[i2] = cArr2[b & 15];
            }
            return new String(cArr);
        }
        C4638h.m10271a("$receiver");
        throw null;
    }

    /* renamed from: e */
    public static final byte[] m10950e(C4897j jVar) {
        if (jVar != null) {
            return jVar.f11668g;
        }
        C4638h.m10271a("$receiver");
        throw null;
    }

    /* renamed from: f */
    public static final C4897j m10951f(C4897j jVar) {
        if (jVar != null) {
            int i = 0;
            while (true) {
                byte[] bArr = jVar.f11668g;
                if (i >= bArr.length) {
                    return jVar;
                }
                byte b = bArr[i];
                byte b2 = (byte) 65;
                if (b >= b2) {
                    byte b3 = (byte) 90;
                    if (b <= b3) {
                        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                        C4638h.m10270a((Object) copyOf, "java.util.Arrays.copyOf(this, size)");
                        copyOf[i] = (byte) (b + 32);
                        for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                            byte b4 = copyOf[i2];
                            if (b4 >= b2 && b4 <= b3) {
                                copyOf[i2] = (byte) (b4 + 32);
                            }
                        }
                        return new C4897j(copyOf);
                    }
                }
                i++;
            }
        } else {
            C4638h.m10271a("$receiver");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x011b, code lost:
        if (r5 == 64) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0124, code lost:
        if (r5 == 64) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0162, code lost:
        if (r5 == 64) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0175, code lost:
        if (r5 == 64) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0186, code lost:
        if (r5 == 64) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0195, code lost:
        if (r5 == 64) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x01ab, code lost:
        if (r5 == 64) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x01b3, code lost:
        if (r5 == 64) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x01ba, code lost:
        if (r5 == 64) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x01ef, code lost:
        if (r5 == 64) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x01f2, code lost:
        r4 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x008d, code lost:
        if (r5 == 64) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x009e, code lost:
        if (r5 == 64) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00a9, code lost:
        if (r5 == 64) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x00e7, code lost:
        if (r5 == 64) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x00fa, code lost:
        if (r5 == 64) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0109, code lost:
        if (r5 == 64) goto L_0x01f3;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m10952g(p423w.C4897j r17) {
        /*
            r0 = r17
            if (r0 == 0) goto L_0x02d5
            byte[] r1 = r0.f11668g
            int r1 = r1.length
            if (r1 != 0) goto L_0x000b
            r1 = 1
            goto L_0x000c
        L_0x000b:
            r1 = 0
        L_0x000c:
            if (r1 == 0) goto L_0x0011
            java.lang.String r0 = "[size=0]"
            return r0
        L_0x0011:
            byte[] r1 = r0.f11668g
            int r2 = r1.length
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0017:
            r6 = 64
            if (r3 >= r2) goto L_0x01f3
            byte r7 = r1[r3]
            r8 = 13
            r9 = 10
            r10 = 31
            r11 = 65533(0xfffd, float:9.1831E-41)
            r12 = 159(0x9f, float:2.23E-43)
            r13 = 127(0x7f, float:1.78E-43)
            r14 = 65536(0x10000, float:9.18355E-41)
            if (r7 < 0) goto L_0x0082
            int r16 = r5 + 1
            if (r5 != r6) goto L_0x0034
            goto L_0x01f3
        L_0x0034:
            if (r7 == r9) goto L_0x0046
            if (r7 == r8) goto L_0x0046
            if (r7 < 0) goto L_0x003c
            if (r10 >= r7) goto L_0x0041
        L_0x003c:
            if (r13 <= r7) goto L_0x003f
            goto L_0x0043
        L_0x003f:
            if (r12 < r7) goto L_0x0043
        L_0x0041:
            r5 = 1
            goto L_0x0044
        L_0x0043:
            r5 = 0
        L_0x0044:
            if (r5 != 0) goto L_0x01f2
        L_0x0046:
            if (r7 != r11) goto L_0x004a
            goto L_0x01f2
        L_0x004a:
            if (r7 >= r14) goto L_0x004e
            r5 = 1
            goto L_0x004f
        L_0x004e:
            r5 = 2
        L_0x004f:
            int r4 = r4 + r5
            int r3 = r3 + 1
        L_0x0052:
            r5 = r16
            if (r3 >= r2) goto L_0x0017
            byte r7 = r1[r3]
            if (r7 < 0) goto L_0x0017
            int r7 = r3 + 1
            byte r3 = r1[r3]
            int r16 = r5 + 1
            if (r5 != r6) goto L_0x0064
            goto L_0x01f3
        L_0x0064:
            if (r3 == r9) goto L_0x0076
            if (r3 == r8) goto L_0x0076
            if (r3 < 0) goto L_0x006c
            if (r10 >= r3) goto L_0x0071
        L_0x006c:
            if (r13 <= r3) goto L_0x006f
            goto L_0x0073
        L_0x006f:
            if (r12 < r3) goto L_0x0073
        L_0x0071:
            r5 = 1
            goto L_0x0074
        L_0x0073:
            r5 = 0
        L_0x0074:
            if (r5 != 0) goto L_0x01f2
        L_0x0076:
            if (r3 != r11) goto L_0x007a
            goto L_0x01f2
        L_0x007a:
            if (r3 >= r14) goto L_0x007e
            r3 = 1
            goto L_0x007f
        L_0x007e:
            r3 = 2
        L_0x007f:
            int r4 = r4 + r3
            r3 = r7
            goto L_0x0052
        L_0x0082:
            int r11 = r7 >> 5
            r14 = -2
            r15 = 128(0x80, float:1.794E-43)
            if (r11 != r14) goto L_0x00d9
            int r7 = r3 + 1
            if (r2 > r7) goto L_0x0091
            if (r5 != r6) goto L_0x01f2
            goto L_0x01f3
        L_0x0091:
            byte r11 = r1[r3]
            byte r7 = r1[r7]
            r14 = r7 & 192(0xc0, float:2.69E-43)
            if (r14 != r15) goto L_0x009b
            r14 = 1
            goto L_0x009c
        L_0x009b:
            r14 = 0
        L_0x009c:
            if (r14 != 0) goto L_0x00a2
            if (r5 != r6) goto L_0x01f2
            goto L_0x01f3
        L_0x00a2:
            r7 = r7 ^ 3968(0xf80, float:5.56E-42)
            int r11 = r11 << 6
            r7 = r7 ^ r11
            if (r7 >= r15) goto L_0x00ad
            if (r5 != r6) goto L_0x01f2
            goto L_0x01f3
        L_0x00ad:
            int r11 = r5 + 1
            if (r5 != r6) goto L_0x00b3
            goto L_0x01f3
        L_0x00b3:
            if (r7 == r9) goto L_0x00c5
            if (r7 == r8) goto L_0x00c5
            if (r7 < 0) goto L_0x00bb
            if (r10 >= r7) goto L_0x00c0
        L_0x00bb:
            if (r13 <= r7) goto L_0x00be
            goto L_0x00c2
        L_0x00be:
            if (r12 < r7) goto L_0x00c2
        L_0x00c0:
            r5 = 1
            goto L_0x00c3
        L_0x00c2:
            r5 = 0
        L_0x00c3:
            if (r5 != 0) goto L_0x01f2
        L_0x00c5:
            r5 = 65533(0xfffd, float:9.1831E-41)
            if (r7 != r5) goto L_0x00cc
            goto L_0x01f2
        L_0x00cc:
            r5 = 65536(0x10000, float:9.18355E-41)
            if (r7 >= r5) goto L_0x00d2
            r15 = 1
            goto L_0x00d3
        L_0x00d2:
            r15 = 2
        L_0x00d3:
            int r4 = r4 + r15
            int r3 = r3 + 2
            r5 = r11
            goto L_0x0017
        L_0x00d9:
            int r10 = r7 >> 4
            r11 = 55296(0xd800, float:7.7486E-41)
            r12 = 57343(0xdfff, float:8.0355E-41)
            if (r10 != r14) goto L_0x015a
            int r7 = r3 + 2
            if (r2 > r7) goto L_0x00eb
            if (r5 != r6) goto L_0x01f2
            goto L_0x01f3
        L_0x00eb:
            byte r10 = r1[r3]
            int r13 = r3 + 1
            byte r13 = r1[r13]
            r14 = r13 & 192(0xc0, float:2.69E-43)
            if (r14 != r15) goto L_0x00f7
            r14 = 1
            goto L_0x00f8
        L_0x00f7:
            r14 = 0
        L_0x00f8:
            if (r14 != 0) goto L_0x00fe
            if (r5 != r6) goto L_0x01f2
            goto L_0x01f3
        L_0x00fe:
            byte r7 = r1[r7]
            r14 = r7 & 192(0xc0, float:2.69E-43)
            if (r14 != r15) goto L_0x0106
            r14 = 1
            goto L_0x0107
        L_0x0106:
            r14 = 0
        L_0x0107:
            if (r14 != 0) goto L_0x010d
            if (r5 != r6) goto L_0x01f2
            goto L_0x01f3
        L_0x010d:
            r14 = -123008(0xfffffffffffe1f80, float:NaN)
            r7 = r7 ^ r14
            int r13 = r13 << 6
            r7 = r7 ^ r13
            int r10 = r10 << 12
            r7 = r7 ^ r10
            r10 = 2048(0x800, float:2.87E-42)
            if (r7 >= r10) goto L_0x011f
            if (r5 != r6) goto L_0x01f2
            goto L_0x01f3
        L_0x011f:
            if (r11 <= r7) goto L_0x0122
            goto L_0x0128
        L_0x0122:
            if (r12 < r7) goto L_0x0128
            if (r5 != r6) goto L_0x01f2
            goto L_0x01f3
        L_0x0128:
            int r10 = r5 + 1
            if (r5 != r6) goto L_0x012e
            goto L_0x01f3
        L_0x012e:
            if (r7 == r9) goto L_0x0146
            if (r7 == r8) goto L_0x0146
            if (r7 < 0) goto L_0x0138
            r5 = 31
            if (r5 >= r7) goto L_0x0141
        L_0x0138:
            r5 = 127(0x7f, float:1.78E-43)
            if (r5 <= r7) goto L_0x013d
            goto L_0x0143
        L_0x013d:
            r5 = 159(0x9f, float:2.23E-43)
            if (r5 < r7) goto L_0x0143
        L_0x0141:
            r5 = 1
            goto L_0x0144
        L_0x0143:
            r5 = 0
        L_0x0144:
            if (r5 != 0) goto L_0x01f2
        L_0x0146:
            r5 = 65533(0xfffd, float:9.1831E-41)
            if (r7 != r5) goto L_0x014d
            goto L_0x01f2
        L_0x014d:
            r5 = 65536(0x10000, float:9.18355E-41)
            if (r7 >= r5) goto L_0x0153
            r15 = 1
            goto L_0x0154
        L_0x0153:
            r15 = 2
        L_0x0154:
            int r4 = r4 + r15
            int r3 = r3 + 3
            r5 = r10
            goto L_0x0017
        L_0x015a:
            int r7 = r7 >> 3
            if (r7 != r14) goto L_0x01ef
            int r7 = r3 + 3
            if (r2 > r7) goto L_0x0166
            if (r5 != r6) goto L_0x01f2
            goto L_0x01f3
        L_0x0166:
            byte r8 = r1[r3]
            int r10 = r3 + 1
            byte r10 = r1[r10]
            r13 = r10 & 192(0xc0, float:2.69E-43)
            if (r13 != r15) goto L_0x0172
            r13 = 1
            goto L_0x0173
        L_0x0172:
            r13 = 0
        L_0x0173:
            if (r13 != 0) goto L_0x0179
            if (r5 != r6) goto L_0x01f2
            goto L_0x01f3
        L_0x0179:
            int r13 = r3 + 2
            byte r13 = r1[r13]
            r14 = r13 & 192(0xc0, float:2.69E-43)
            if (r14 != r15) goto L_0x0183
            r14 = 1
            goto L_0x0184
        L_0x0183:
            r14 = 0
        L_0x0184:
            if (r14 != 0) goto L_0x018a
            if (r5 != r6) goto L_0x01f2
            goto L_0x01f3
        L_0x018a:
            byte r7 = r1[r7]
            r14 = r7 & 192(0xc0, float:2.69E-43)
            if (r14 != r15) goto L_0x0192
            r14 = 1
            goto L_0x0193
        L_0x0192:
            r14 = 0
        L_0x0193:
            if (r14 != 0) goto L_0x0199
            if (r5 != r6) goto L_0x01f2
            goto L_0x01f3
        L_0x0199:
            r14 = 3678080(0x381f80, float:5.154088E-39)
            r7 = r7 ^ r14
            int r13 = r13 << 6
            r7 = r7 ^ r13
            int r10 = r10 << 12
            r7 = r7 ^ r10
            int r8 = r8 << 18
            r7 = r7 ^ r8
            r8 = 1114111(0x10ffff, float:1.561202E-39)
            if (r7 <= r8) goto L_0x01ae
            if (r5 != r6) goto L_0x01f2
            goto L_0x01f3
        L_0x01ae:
            if (r11 <= r7) goto L_0x01b1
            goto L_0x01b6
        L_0x01b1:
            if (r12 < r7) goto L_0x01b6
            if (r5 != r6) goto L_0x01f2
            goto L_0x01f3
        L_0x01b6:
            r8 = 65536(0x10000, float:9.18355E-41)
            if (r7 >= r8) goto L_0x01bd
            if (r5 != r6) goto L_0x01f2
            goto L_0x01f3
        L_0x01bd:
            int r8 = r5 + 1
            if (r5 != r6) goto L_0x01c2
            goto L_0x01f3
        L_0x01c2:
            if (r7 == r9) goto L_0x01dc
            r5 = 13
            if (r7 == r5) goto L_0x01dc
            if (r7 < 0) goto L_0x01ce
            r5 = 31
            if (r5 >= r7) goto L_0x01d7
        L_0x01ce:
            r5 = 127(0x7f, float:1.78E-43)
            if (r5 <= r7) goto L_0x01d3
            goto L_0x01d9
        L_0x01d3:
            r5 = 159(0x9f, float:2.23E-43)
            if (r5 < r7) goto L_0x01d9
        L_0x01d7:
            r5 = 1
            goto L_0x01da
        L_0x01d9:
            r5 = 0
        L_0x01da:
            if (r5 != 0) goto L_0x01f2
        L_0x01dc:
            r5 = 65533(0xfffd, float:9.1831E-41)
            if (r7 != r5) goto L_0x01e2
            goto L_0x01f2
        L_0x01e2:
            r5 = 65536(0x10000, float:9.18355E-41)
            if (r7 >= r5) goto L_0x01e8
            r15 = 1
            goto L_0x01e9
        L_0x01e8:
            r15 = 2
        L_0x01e9:
            int r4 = r4 + r15
            int r3 = r3 + 4
            r5 = r8
            goto L_0x0017
        L_0x01ef:
            if (r5 != r6) goto L_0x01f2
            goto L_0x01f3
        L_0x01f2:
            r4 = -1
        L_0x01f3:
            r1 = 93
            java.lang.String r2 = "…]"
            java.lang.String r3 = "[size="
            r5 = -1
            if (r4 != r5) goto L_0x026f
            byte[] r4 = r0.f11668g
            int r4 = r4.length
            if (r4 > r6) goto L_0x0216
            java.lang.String r2 = "[hex="
            java.lang.StringBuilder r2 = p213q.p214a.p215a.p216a.C1965a.m4756a(r2)
            java.lang.String r0 = r17.mo11504h()
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            goto L_0x024f
        L_0x0216:
            java.lang.StringBuilder r1 = p213q.p214a.p215a.p216a.C1965a.m4756a(r3)
            byte[] r3 = r0.f11668g
            int r3 = r3.length
            r1.append(r3)
            java.lang.String r3 = " hex="
            r1.append(r3)
            byte[] r3 = r0.f11668g
            int r3 = r3.length
            if (r6 > r3) goto L_0x022c
            r3 = 1
            goto L_0x022d
        L_0x022c:
            r3 = 0
        L_0x022d:
            if (r3 == 0) goto L_0x0250
            byte[] r3 = r0.f11668g
            int r4 = r3.length
            if (r6 != r4) goto L_0x0235
            goto L_0x0241
        L_0x0235:
            byte[] r0 = new byte[r6]
            r4 = 0
            p119o.p120a.C0967p0.m2235b(r3, r4, r0, r4, r6)
            w.j r3 = new w.j
            r3.<init>(r0)
            r0 = r3
        L_0x0241:
            java.lang.String r0 = r0.mo11504h()
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
        L_0x024f:
            return r0
        L_0x0250:
            java.lang.String r1 = "endIndex > length("
            java.lang.StringBuilder r1 = p213q.p214a.p215a.p216a.C1965a.m4756a(r1)
            byte[] r0 = r0.f11668g
            int r0 = r0.length
            r1.append(r0)
            r0 = 41
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x026f:
            java.lang.String r5 = m10953h(r17)
            if (r5 == 0) goto L_0x02cd
            r6 = 0
            java.lang.String r7 = r5.substring(r6, r4)
            java.lang.String r8 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            p392u.p401r.p403c.C4638h.m10270a(r7, r8)
            r8 = 4
            java.lang.String r9 = "\\"
            java.lang.String r10 = "\\\\"
            java.lang.String r7 = p392u.p409w.C4681g.m10312a(r7, r9, r10, r6, r8)
            java.lang.String r9 = "\n"
            java.lang.String r10 = "\\n"
            java.lang.String r7 = p392u.p409w.C4681g.m10312a(r7, r9, r10, r6, r8)
            java.lang.String r9 = "\r"
            java.lang.String r10 = "\\r"
            java.lang.String r6 = p392u.p409w.C4681g.m10312a(r7, r9, r10, r6, r8)
            int r5 = r5.length()
            if (r4 >= r5) goto L_0x02b8
            java.lang.StringBuilder r1 = p213q.p214a.p215a.p216a.C1965a.m4756a(r3)
            byte[] r0 = r0.f11668g
            int r0 = r0.length
            r1.append(r0)
            java.lang.String r0 = " text="
            r1.append(r0)
            r1.append(r6)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            goto L_0x02cc
        L_0x02b8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "[text="
            r0.append(r2)
            r0.append(r6)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x02cc:
            return r0
        L_0x02cd:
            u.i r0 = new u.i
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r1)
            throw r0
        L_0x02d5:
            java.lang.String r0 = "$receiver"
            p392u.p401r.p403c.C4638h.m10271a(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p423w.p424c0.C4889a.m10952g(w.j):java.lang.String");
    }

    /* renamed from: h */
    public static final String m10953h(C4897j jVar) {
        String str = "$receiver";
        if (jVar != null) {
            String str2 = jVar.f11667f;
            if (str2 != null) {
                return str2;
            }
            byte[] j = jVar.mo11506j();
            if (j != null) {
                String str3 = new String(j, C4674a.f10859a);
                jVar.f11667f = str3;
                return str3;
            }
            C4638h.m10271a(str);
            throw null;
        }
        C4638h.m10271a(str);
        throw null;
    }

    /* renamed from: b */
    public static final int m10944b(C4897j jVar) {
        if (jVar != null) {
            return jVar.f11668g.length;
        }
        C4638h.m10271a("$receiver");
        throw null;
    }

    /* renamed from: a */
    public static final int m10937a(C4897j jVar, C4897j jVar2) {
        if (jVar == null) {
            C4638h.m10271a("$receiver");
            throw null;
        } else if (jVar2 != null) {
            int g = jVar.mo11503g();
            int g2 = jVar2.mo11503g();
            int min = Math.min(g, g2);
            int i = 0;
            while (true) {
                int i2 = -1;
                if (i < min) {
                    byte a = jVar.mo11495a(i) & 255;
                    byte a2 = jVar2.mo11495a(i) & 255;
                    if (a == a2) {
                        i++;
                    } else {
                        if (a >= a2) {
                            i2 = 1;
                        }
                        return i2;
                    }
                } else if (g == g2) {
                    return 0;
                } else {
                    if (g >= g2) {
                        i2 = 1;
                    }
                    return i2;
                }
            }
        } else {
            C4638h.m10271a("other");
            throw null;
        }
    }

    /* renamed from: b */
    public static final boolean m10946b(C4897j jVar, C4897j jVar2) {
        if (jVar == null) {
            C4638h.m10271a("$receiver");
            throw null;
        } else if (jVar2 != null) {
            return jVar.mo11498a(0, jVar2, 0, jVar2.mo11503g());
        } else {
            C4638h.m10271a("prefix");
            throw null;
        }
    }

    /* renamed from: c */
    public static final int m10947c(C4897j jVar) {
        if (jVar != null) {
            int i = jVar.f11666e;
            if (i != 0) {
                return i;
            }
            int hashCode = Arrays.hashCode(jVar.f11668g);
            jVar.f11666e = hashCode;
            return hashCode;
        }
        C4638h.m10271a("$receiver");
        throw null;
    }

    /* renamed from: a */
    public static final C4897j m10939a(String str) {
        if (str != null) {
            byte[] a = C4881a.m10911a(str);
            if (a != null) {
                return new C4897j(a);
            }
            return null;
        }
        C4638h.m10271a("$receiver");
        throw null;
    }

    /* renamed from: a */
    public static final boolean m10943a(C4897j jVar, Object obj) {
        if (jVar == null) {
            C4638h.m10271a("$receiver");
            throw null;
        } else if (obj == jVar) {
            return true;
        } else {
            if (obj instanceof C4897j) {
                C4897j jVar2 = (C4897j) obj;
                int g = jVar2.mo11503g();
                byte[] bArr = jVar.f11668g;
                if (g == bArr.length && jVar2.mo11499a(0, bArr, 0, bArr.length)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    public static final byte m10935a(C4897j jVar, int i) {
        if (jVar != null) {
            return jVar.f11668g[i];
        }
        C4638h.m10271a("$receiver");
        throw null;
    }

    /* renamed from: a */
    public static final C4897j m10940a(byte[] bArr) {
        if (bArr != null) {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            C4638h.m10270a((Object) copyOf, "java.util.Arrays.copyOf(this, size)");
            return new C4897j(copyOf);
        }
        C4638h.m10271a("data");
        throw null;
    }

    /* renamed from: a */
    public static final boolean m10941a(C4897j jVar, int i, C4897j jVar2, int i2, int i3) {
        if (jVar == null) {
            C4638h.m10271a("$receiver");
            throw null;
        } else if (jVar2 != null) {
            return jVar2.mo11499a(i2, jVar.f11668g, i, i3);
        } else {
            C4638h.m10271a("other");
            throw null;
        }
    }

    /* renamed from: a */
    public static final boolean m10942a(C4897j jVar, int i, byte[] bArr, int i2, int i3) {
        if (jVar == null) {
            C4638h.m10271a("$receiver");
            throw null;
        } else if (bArr != null) {
            if (i >= 0) {
                byte[] bArr2 = jVar.f11668g;
                if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C0967p0.m2210a(bArr2, i, bArr, i2, i3)) {
                    return true;
                }
            }
            return false;
        } else {
            C4638h.m10271a("other");
            throw null;
        }
    }
}
