package p213q.p217b.p218a.p231b.p251g.p256e;

import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: q.b.a.b.g.e.d9 */
public final class C2404d9 extends C2421e9 {
    /* renamed from: a */
    public final int mo7541a(int i, byte[] bArr, int i2, int i3) {
        while (r9 < i3 && bArr[r9] >= 0) {
            i2 = r9 + 1;
        }
        if (r9 >= i3) {
            return 0;
        }
        while (r9 < i3) {
            int i4 = r9 + 1;
            byte b = bArr[r9];
            if (b < 0) {
                if (b < -32) {
                    if (i4 >= i3) {
                        return b;
                    }
                    if (b >= -62) {
                        r9 = i4 + 1;
                        if (bArr[i4] > -65) {
                        }
                    }
                    return -1;
                } else if (b < -16) {
                    if (i4 >= i3 - 1) {
                        return C2387c9.m5605b(bArr, i4, i3);
                    }
                    int i5 = i4 + 1;
                    byte b2 = bArr[i4];
                    if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                        r9 = i5 + 1;
                        if (bArr[i5] > -65) {
                        }
                    }
                    return -1;
                } else if (i4 >= i3 - 2) {
                    return C2387c9.m5605b(bArr, i4, i3);
                } else {
                    int i6 = i4 + 1;
                    byte b3 = bArr[i4];
                    if (b3 <= -65) {
                        if ((((b3 + 112) + (b << 28)) >> 30) == 0) {
                            int i7 = i6 + 1;
                            if (bArr[i6] <= -65) {
                                i4 = i7 + 1;
                                if (bArr[i7] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
            }
            r9 = i4;
        }
        return 0;
    }

    /* renamed from: a */
    public final int mo7542a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        int length = charSequence.length();
        int i4 = i2 + i;
        int i5 = 0;
        while (i5 < length) {
            int i6 = i5 + i;
            if (i6 >= i4) {
                break;
            }
            char charAt = charSequence.charAt(i5);
            if (charAt >= 128) {
                break;
            }
            bArr[i6] = (byte) charAt;
            i5++;
        }
        if (i5 == length) {
            return i + length;
        }
        int i7 = i + i5;
        while (i5 < length) {
            char charAt2 = charSequence.charAt(i5);
            if (charAt2 < 128 && i7 < i4) {
                i3 = i7 + 1;
                bArr[i7] = (byte) charAt2;
            } else if (charAt2 < 2048 && i7 <= i4 - 2) {
                int i8 = i7 + 1;
                bArr[i7] = (byte) ((charAt2 >>> 6) | 960);
                i7 = i8 + 1;
                bArr[i8] = (byte) ((charAt2 & '?') | 128);
                i5++;
            } else if ((charAt2 < 55296 || 57343 < charAt2) && i7 <= i4 - 3) {
                int i9 = i7 + 1;
                bArr[i7] = (byte) ((charAt2 >>> 12) | 480);
                int i10 = i9 + 1;
                bArr[i9] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i3 = i10 + 1;
                bArr[i10] = (byte) ((charAt2 & '?') | 128);
            } else if (i7 <= i4 - 4) {
                int i11 = i5 + 1;
                if (i11 != charSequence.length()) {
                    char charAt3 = charSequence.charAt(i11);
                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                        int i12 = i7 + 1;
                        bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                        int i13 = i12 + 1;
                        bArr[i12] = (byte) (((codePoint >>> 12) & 63) | 128);
                        int i14 = i13 + 1;
                        bArr[i13] = (byte) (((codePoint >>> 6) & 63) | 128);
                        i7 = i14 + 1;
                        bArr[i14] = (byte) ((codePoint & 63) | 128);
                        i5 = i11;
                        i5++;
                    } else {
                        i5 = i11;
                    }
                }
                throw new C2456g9(i5 - 1, length);
            } else {
                if (55296 <= charAt2 && charAt2 <= 57343) {
                    int i15 = i5 + 1;
                    if (i15 == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i15))) {
                        throw new C2456g9(i5, length);
                    }
                }
                StringBuilder sb = new StringBuilder(37);
                sb.append("Failed writing ");
                sb.append(charAt2);
                sb.append(" at index ");
                sb.append(i7);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
            i7 = i3;
            i5++;
        }
        return i7;
    }

    /* renamed from: a */
    public final String mo7543a(byte[] bArr, int i, int i2) {
        if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (r13 < i3) {
                byte b = bArr[r13];
                if (!C2286e.m5334e(b)) {
                    break;
                }
                i = r13 + 1;
                int i5 = i4 + 1;
                cArr[i4] = (char) b;
                i4 = i5;
            }
            int i6 = i4;
            while (r13 < i3) {
                int i7 = r13 + 1;
                byte b2 = bArr[r13];
                if (C2286e.m5334e(b2)) {
                    int i8 = i6 + 1;
                    cArr[i6] = (char) b2;
                    r13 = i7;
                    while (true) {
                        i6 = i8;
                        if (r13 >= i3) {
                            break;
                        }
                        byte b3 = bArr[r13];
                        if (!C2286e.m5334e(b3)) {
                            break;
                        }
                        r13++;
                        i8 = i6 + 1;
                        cArr[i6] = (char) b3;
                    }
                } else {
                    if (!(b2 < -32)) {
                        if (b2 < -16) {
                            if (i7 < i3 - 1) {
                                int i9 = i7 + 1;
                                int i10 = i9 + 1;
                                int i11 = i6 + 1;
                                C2286e.m5295b(b2, bArr[i7], bArr[i9], cArr, i6);
                                r13 = i10;
                                i6 = i11;
                            } else {
                                throw C2618p6.m6295f();
                            }
                        } else if (i7 < i3 - 2) {
                            int i12 = i7 + 1;
                            byte b4 = bArr[i7];
                            int i13 = i12 + 1;
                            int i14 = i13 + 1;
                            int i15 = i6 + 1;
                            C2286e.m5294b(b2, b4, bArr[i12], bArr[i13], cArr, i6);
                            i6 = i15 + 1;
                            r13 = i14;
                        } else {
                            throw C2618p6.m6295f();
                        }
                    } else if (i7 < i3) {
                        int i16 = i7 + 1;
                        int i17 = i6 + 1;
                        C2286e.m5296b(b2, bArr[i7], cArr, i6);
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
