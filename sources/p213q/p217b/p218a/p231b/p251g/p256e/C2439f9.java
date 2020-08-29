package p213q.p217b.p218a.p231b.p251g.p256e;

import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: q.b.a.b.g.e.f9 */
public final class C2439f9 extends C2421e9 {
    /* renamed from: a */
    public static int m5818a(byte[] bArr, int i, long j, int i2) {
        if (i2 == 0) {
            return C2387c9.m5600a(i);
        }
        if (i2 == 1) {
            return C2387c9.m5601a(i, C2366b9.m5478a(bArr, j));
        }
        if (i2 == 2) {
            return C2387c9.m5602a(i, (int) C2366b9.m5478a(bArr, j), (int) C2366b9.m5478a(bArr, j + 1));
        }
        throw new AssertionError();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0065, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ba, code lost:
        return -1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo7541a(int r18, byte[] r19, int r20, int r21) {
        /*
            r17 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r1 | r2
            int r4 = r0.length
            int r4 = r4 - r2
            r3 = r3 | r4
            r4 = 2
            r5 = 3
            r6 = 0
            if (r3 < 0) goto L_0x00bb
            long r7 = (long) r1
            long r1 = (long) r2
            long r1 = r1 - r7
            int r1 = (int) r1
            r2 = 16
            r9 = 1
            if (r1 >= r2) goto L_0x001c
            r2 = r6
            goto L_0x002e
        L_0x001c:
            r2 = r6
            r11 = r7
        L_0x001e:
            if (r2 >= r1) goto L_0x002d
            long r13 = r11 + r9
            byte r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5478a(r0, r11)
            if (r3 >= 0) goto L_0x0029
            goto L_0x002e
        L_0x0029:
            int r2 = r2 + 1
            r11 = r13
            goto L_0x001e
        L_0x002d:
            r2 = r1
        L_0x002e:
            int r1 = r1 - r2
            long r2 = (long) r2
            long r7 = r7 + r2
        L_0x0031:
            r2 = r6
        L_0x0032:
            if (r1 <= 0) goto L_0x0045
            long r2 = r7 + r9
            byte r7 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5478a(r0, r7)
            if (r7 < 0) goto L_0x0042
            int r1 = r1 + -1
            r15 = r2
            r2 = r7
            r7 = r15
            goto L_0x0032
        L_0x0042:
            r15 = r2
            r2 = r7
            r7 = r15
        L_0x0045:
            if (r1 != 0) goto L_0x0048
            return r6
        L_0x0048:
            int r1 = r1 + -1
            r3 = -32
            r11 = -65
            r12 = -1
            if (r2 >= r3) goto L_0x0066
            if (r1 != 0) goto L_0x0054
            return r2
        L_0x0054:
            int r1 = r1 + -1
            r3 = -62
            if (r2 < r3) goto L_0x0065
            long r2 = r7 + r9
            byte r7 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5478a(r0, r7)
            if (r7 <= r11) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r7 = r2
            goto L_0x0031
        L_0x0065:
            return r12
        L_0x0066:
            r13 = -16
            if (r2 >= r13) goto L_0x0090
            if (r1 >= r4) goto L_0x0071
            int r0 = m5818a(r0, r2, r7, r1)
            return r0
        L_0x0071:
            int r1 = r1 + -2
            long r13 = r7 + r9
            byte r7 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5478a(r0, r7)
            if (r7 > r11) goto L_0x008f
            r8 = -96
            if (r2 != r3) goto L_0x0081
            if (r7 < r8) goto L_0x008f
        L_0x0081:
            r3 = -19
            if (r2 != r3) goto L_0x0087
            if (r7 >= r8) goto L_0x008f
        L_0x0087:
            long r7 = r13 + r9
            byte r2 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5478a(r0, r13)
            if (r2 <= r11) goto L_0x0031
        L_0x008f:
            return r12
        L_0x0090:
            if (r1 >= r5) goto L_0x0097
            int r0 = m5818a(r0, r2, r7, r1)
            return r0
        L_0x0097:
            int r1 = r1 + -3
            long r13 = r7 + r9
            byte r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5478a(r0, r7)
            if (r3 > r11) goto L_0x00ba
            int r2 = r2 << 28
            int r3 = r3 + 112
            int r3 = r3 + r2
            int r2 = r3 >> 30
            if (r2 != 0) goto L_0x00ba
            long r2 = r13 + r9
            byte r7 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5478a(r0, r13)
            if (r7 > r11) goto L_0x00ba
            long r7 = r2 + r9
            byte r2 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5478a(r0, r2)
            if (r2 <= r11) goto L_0x0031
        L_0x00ba:
            return r12
        L_0x00bb:
            java.lang.ArrayIndexOutOfBoundsException r3 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.Object[] r5 = new java.lang.Object[r5]
            int r0 = r0.length
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5[r6] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            r1 = 1
            r5[r1] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
            r5[r4] = r0
            java.lang.String r0 = "Array length=%d, index=%d, limit=%d"
            java.lang.String r0 = java.lang.String.format(r0, r5)
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p251g.p256e.C2439f9.mo7541a(int, byte[], int, int):int");
    }

    /* renamed from: a */
    public final int mo7542a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        char c;
        long j;
        long j2;
        char c2;
        long j3;
        CharSequence charSequence2 = charSequence;
        byte[] bArr2 = bArr;
        int i3 = i;
        int i4 = i2;
        long j4 = (long) i3;
        long j5 = ((long) i4) + j4;
        int length = charSequence.length();
        String str = " at index ";
        String str2 = "Failed writing ";
        if (length > i4 || bArr2.length - i4 < i3) {
            char charAt = charSequence2.charAt(length - 1);
            int i5 = i3 + i4;
            StringBuilder sb = new StringBuilder(37);
            sb.append(str2);
            sb.append(charAt);
            sb.append(str);
            sb.append(i5);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int i6 = 0;
        while (true) {
            c = 128;
            j = 1;
            if (i6 >= length) {
                break;
            }
            char charAt2 = charSequence2.charAt(i6);
            if (charAt2 >= 128) {
                break;
            }
            long j6 = 1 + j4;
            C2366b9.m5486a(bArr2, j4, (byte) charAt2);
            i6++;
            j4 = j6;
        }
        if (i6 == length) {
            return (int) j4;
        }
        while (i6 < length) {
            char charAt3 = charSequence2.charAt(i6);
            if (charAt3 < c && j4 < j5) {
                long j7 = j4 + j;
                C2366b9.m5486a(bArr2, j4, (byte) charAt3);
                j3 = j;
                j2 = j7;
                c2 = c;
            } else if (charAt3 < 2048 && j4 <= j5 - 2) {
                long j8 = j4 + j;
                C2366b9.m5486a(bArr2, j4, (byte) ((charAt3 >>> 6) | 960));
                long j9 = j8 + j;
                C2366b9.m5486a(bArr2, j8, (byte) ((charAt3 & '?') | 128));
                long j10 = j;
                c2 = 128;
                j2 = j9;
                j3 = j10;
            } else if ((charAt3 < 55296 || 57343 < charAt3) && j4 <= j5 - 3) {
                long j11 = j4 + j;
                C2366b9.m5486a(bArr2, j4, (byte) ((charAt3 >>> 12) | 480));
                long j12 = j11 + j;
                C2366b9.m5486a(bArr2, j11, (byte) (((charAt3 >>> 6) & 63) | 128));
                long j13 = j12 + 1;
                C2366b9.m5486a(bArr2, j12, (byte) ((charAt3 & '?') | 128));
                j2 = j13;
                j3 = 1;
                c2 = 128;
            } else if (j4 <= j5 - 4) {
                int i7 = i6 + 1;
                if (i7 != length) {
                    char charAt4 = charSequence2.charAt(i7);
                    if (Character.isSurrogatePair(charAt3, charAt4)) {
                        int codePoint = Character.toCodePoint(charAt3, charAt4);
                        long j14 = j4 + 1;
                        C2366b9.m5486a(bArr2, j4, (byte) ((codePoint >>> 18) | 240));
                        long j15 = j14 + 1;
                        c2 = 128;
                        C2366b9.m5486a(bArr2, j14, (byte) (((codePoint >>> 12) & 63) | 128));
                        long j16 = j15 + 1;
                        C2366b9.m5486a(bArr2, j15, (byte) (((codePoint >>> 6) & 63) | 128));
                        j3 = 1;
                        j2 = j16 + 1;
                        C2366b9.m5486a(bArr2, j16, (byte) ((codePoint & 63) | 128));
                        i6 = i7;
                    } else {
                        i6 = i7;
                    }
                }
                throw new C2456g9(i6 - 1, length);
            } else {
                if (55296 <= charAt3 && charAt3 <= 57343) {
                    int i8 = i6 + 1;
                    if (i8 == length || !Character.isSurrogatePair(charAt3, charSequence2.charAt(i8))) {
                        throw new C2456g9(i6, length);
                    }
                }
                StringBuilder sb2 = new StringBuilder(46);
                sb2.append(str2);
                sb2.append(charAt3);
                sb2.append(str);
                sb2.append(j4);
                throw new ArrayIndexOutOfBoundsException(sb2.toString());
            }
            i6++;
            c = c2;
            long j17 = j3;
            j4 = j2;
            j = j17;
        }
        return (int) j4;
    }

    /* renamed from: a */
    public final String mo7543a(byte[] bArr, int i, int i2) {
        if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (r13 < i3) {
                byte a = C2366b9.m5478a(bArr, (long) r13);
                if (!C2286e.m5334e(a)) {
                    break;
                }
                i = r13 + 1;
                int i5 = i4 + 1;
                cArr[i4] = (char) a;
                i4 = i5;
            }
            int i6 = i4;
            while (r13 < i3) {
                int i7 = r13 + 1;
                byte a2 = C2366b9.m5478a(bArr, (long) r13);
                if (C2286e.m5334e(a2)) {
                    int i8 = i6 + 1;
                    cArr[i6] = (char) a2;
                    r13 = i7;
                    while (true) {
                        i6 = i8;
                        if (r13 >= i3) {
                            break;
                        }
                        byte a3 = C2366b9.m5478a(bArr, (long) r13);
                        if (!C2286e.m5334e(a3)) {
                            break;
                        }
                        r13++;
                        i8 = i6 + 1;
                        cArr[i6] = (char) a3;
                    }
                } else {
                    if (!(a2 < -32)) {
                        if (a2 < -16) {
                            if (i7 < i3 - 1) {
                                int i9 = i7 + 1;
                                int i10 = i9 + 1;
                                int i11 = i6 + 1;
                                C2286e.m5295b(a2, C2366b9.m5478a(bArr, (long) i7), C2366b9.m5478a(bArr, (long) i9), cArr, i6);
                                r13 = i10;
                                i6 = i11;
                            } else {
                                throw C2618p6.m6295f();
                            }
                        } else if (i7 < i3 - 2) {
                            int i12 = i7 + 1;
                            byte a4 = C2366b9.m5478a(bArr, (long) i7);
                            int i13 = i12 + 1;
                            int i14 = i13 + 1;
                            int i15 = i6 + 1;
                            C2286e.m5294b(a2, a4, C2366b9.m5478a(bArr, (long) i12), C2366b9.m5478a(bArr, (long) i13), cArr, i6);
                            i6 = i15 + 1;
                            r13 = i14;
                        } else {
                            throw C2618p6.m6295f();
                        }
                    } else if (i7 < i3) {
                        int i16 = i7 + 1;
                        int i17 = i6 + 1;
                        C2286e.m5296b(a2, C2366b9.m5478a(bArr, (long) i7), cArr, i6);
                        r13 = i16;
                        i6 = i17;
                    } else {
                        throw C2618p6.m6295f();
                    }
                }
            }
            return new String(cArr, 0, i6);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
    }
}
