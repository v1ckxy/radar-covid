package p213q.p217b.p218a.p231b.p251g.p256e;

/* renamed from: q.b.a.b.g.e.c9 */
public final class C2387c9 {

    /* renamed from: a */
    public static final C2421e9 f6419a = ((!(C2366b9.f6346h && C2366b9.f6345g) || C2777z4.m6583a()) ? new C2404d9() : new C2439f9());

    /* renamed from: a */
    public static /* synthetic */ int m5600a(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* renamed from: a */
    public static /* synthetic */ int m5601a(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* renamed from: a */
    public static int m5602a(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* renamed from: a */
    public static int m5603a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new C2456g9(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        long j = ((long) i3) + 4294967296L;
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static boolean m5604a(byte[] bArr, int i, int i2) {
        return f6419a.mo7541a(0, bArr, i, i2) == 0;
    }

    /* renamed from: b */
    public static /* synthetic */ int m5605b(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        byte b2 = -1;
        if (i3 == 0) {
            if (b > -12) {
                b = -1;
            }
            return b;
        } else if (i3 == 1) {
            byte b3 = bArr[i];
            if (b <= -12 && b3 <= -65) {
                b2 = b ^ (b3 << 8);
            }
            return b2;
        } else if (i3 == 2) {
            return m5602a((int) b, (int) bArr[i], (int) bArr[i + 1]);
        } else {
            throw new AssertionError();
        }
    }
}
