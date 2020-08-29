package p425x.p426a.p469f.p470i;

/* renamed from: x.a.f.i.d */
public class C5172d {

    /* renamed from: a */
    public static final short[] f12359a = new short[128];

    /* renamed from: b */
    public static final byte[] f12360b = new byte[112];

    static {
        byte[] bArr = new byte[128];
        m11608a(bArr, 0, 15, 1);
        m11608a(bArr, 16, 31, 2);
        m11608a(bArr, 32, 63, 3);
        m11608a(bArr, 64, 65, 0);
        m11608a(bArr, 66, 95, 4);
        m11608a(bArr, 96, 96, 5);
        m11608a(bArr, 97, 108, 6);
        m11608a(bArr, 109, 109, 7);
        m11608a(bArr, 110, 111, 6);
        m11608a(bArr, 112, 112, 8);
        m11608a(bArr, 113, 115, 9);
        m11608a(bArr, 116, 116, 10);
        m11608a(bArr, 117, 127, 0);
        byte[] bArr2 = f12360b;
        m11608a(bArr2, 0, bArr2.length - 1, -2);
        m11608a(f12360b, 8, 11, -1);
        m11608a(f12360b, 24, 27, 0);
        m11608a(f12360b, 40, 43, 16);
        m11608a(f12360b, 58, 59, 0);
        m11608a(f12360b, 72, 73, 0);
        m11608a(f12360b, 89, 91, 16);
        m11608a(f12360b, 104, 104, 16);
        byte[] bArr3 = {0, 0, 0, 0, 31, 15, 15, 15, 7, 7, 7};
        byte[] bArr4 = {-2, -2, -2, -2, 0, 48, 16, 64, 80, 32, 96};
        for (int i = 0; i < 128; i++) {
            byte b = bArr[i];
            byte b2 = bArr3[b] & i;
            f12359a[i] = (short) (bArr4[b] | (b2 << 8));
        }
    }

    /* renamed from: a */
    public static int m11607a(byte[] bArr, char[] cArr) {
        int i = 0;
        int i2 = 0;
        while (i < bArr.length) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b < 0) {
                short s = f12359a[b & Byte.MAX_VALUE];
                int i4 = s >>> 8;
                byte b2 = (byte) s;
                while (b2 >= 0) {
                    if (i3 >= bArr.length) {
                        return -1;
                    }
                    int i5 = i3 + 1;
                    byte b3 = bArr[i3];
                    i4 = (i4 << 6) | (b3 & 63);
                    b2 = f12360b[b2 + ((b3 & 255) >>> 4)];
                    i3 = i5;
                }
                if (b2 == -2) {
                    return -1;
                }
                if (i4 <= 65535) {
                    if (i2 >= cArr.length) {
                        return -1;
                    }
                    int i6 = i2 + 1;
                    cArr[i2] = (char) i4;
                    i2 = i6;
                } else if (i2 >= cArr.length - 1) {
                    return -1;
                } else {
                    int i7 = i2 + 1;
                    cArr[i2] = (char) ((i4 >>> 10) + 55232);
                    i2 = i7 + 1;
                    cArr[i7] = (char) (56320 | (i4 & 1023));
                }
                i = i3;
            } else if (i2 >= cArr.length) {
                return -1;
            } else {
                int i8 = i2 + 1;
                cArr[i2] = (char) b;
                i = i3;
                i2 = i8;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public static void m11608a(byte[] bArr, int i, int i2, byte b) {
        while (i <= i2) {
            bArr[i] = b;
            i++;
        }
    }
}
