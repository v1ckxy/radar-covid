package p423w;

import p392u.p401r.p403c.C4638h;
import p392u.p409w.C4674a;

/* renamed from: w.a */
public final class C4881a {

    /* renamed from: a */
    public static final byte[] f11641a = C4897j.f11665i.mo11511c("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").f11668g;

    static {
        byte[] bArr = C4897j.f11665i.mo11511c("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").f11668g;
    }

    /* renamed from: a */
    public static final byte[] m10911a(String str) {
        int i;
        String str2 = str;
        if (str2 != null) {
            int length = str.length();
            while (length > 0) {
                char charAt = str2.charAt(length - 1);
                if (charAt != '=' && charAt != 10 && charAt != 13 && charAt != ' ' && charAt != 9) {
                    break;
                }
                length--;
            }
            int i2 = (int) ((((long) length) * 6) / 8);
            byte[] bArr = new byte[i2];
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < length; i6++) {
                char charAt2 = str2.charAt(i6);
                if ('A' <= charAt2 && 'Z' >= charAt2) {
                    i = charAt2 - 'A';
                } else if ('a' <= charAt2 && 'z' >= charAt2) {
                    i = charAt2 - 'G';
                } else if ('0' <= charAt2 && '9' >= charAt2) {
                    i = charAt2 + 4;
                } else if (charAt2 == '+' || charAt2 == '-') {
                    i = 62;
                } else if (charAt2 == '/' || charAt2 == '_') {
                    i = 63;
                } else {
                    if (!(charAt2 == 10 || charAt2 == 13 || charAt2 == ' ' || charAt2 == 9)) {
                        return null;
                    }
                }
                i4 = (i4 << 6) | i;
                i3++;
                if (i3 % 4 == 0) {
                    int i7 = i5 + 1;
                    bArr[i5] = (byte) (i4 >> 16);
                    int i8 = i7 + 1;
                    bArr[i7] = (byte) (i4 >> 8);
                    int i9 = i8 + 1;
                    bArr[i8] = (byte) i4;
                    i5 = i9;
                }
            }
            int i10 = i3 % 4;
            if (i10 == 1) {
                return null;
            }
            if (i10 == 2) {
                int i11 = i5 + 1;
                bArr[i5] = (byte) ((i4 << 12) >> 16);
                i5 = i11;
            } else if (i10 == 3) {
                int i12 = i4 << 6;
                int i13 = i5 + 1;
                bArr[i5] = (byte) (i12 >> 16);
                i5 = i13 + 1;
                bArr[i13] = (byte) (i12 >> 8);
            }
            if (i5 == i2) {
                return bArr;
            }
            byte[] bArr2 = new byte[i5];
            System.arraycopy(bArr, 0, bArr2, 0, i5);
            return bArr2;
        }
        C4638h.m10271a("$receiver");
        throw null;
    }

    /* renamed from: a */
    public static String m10910a(byte[] bArr, byte[] bArr2, int i) {
        if ((i & 1) != 0) {
            bArr2 = f11641a;
        }
        if (bArr == null) {
            C4638h.m10271a("$receiver");
            throw null;
        } else if (bArr2 != null) {
            byte[] bArr3 = new byte[(((bArr.length + 2) / 3) * 4)];
            int length = bArr.length - (bArr.length % 3);
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                int i4 = i2 + 1;
                byte b = bArr[i2];
                int i5 = i4 + 1;
                byte b2 = bArr[i4];
                int i6 = i5 + 1;
                byte b3 = bArr[i5];
                int i7 = i3 + 1;
                bArr3[i3] = bArr2[(b & 255) >> 2];
                int i8 = i7 + 1;
                bArr3[i7] = bArr2[((b & 3) << 4) | ((b2 & 255) >> 4)];
                int i9 = i8 + 1;
                bArr3[i8] = bArr2[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
                i3 = i9 + 1;
                bArr3[i9] = bArr2[b3 & 63];
                i2 = i6;
            }
            int length2 = bArr.length - length;
            if (length2 == 1) {
                byte b4 = bArr[i2];
                int i10 = i3 + 1;
                bArr3[i3] = bArr2[(b4 & 255) >> 2];
                int i11 = i10 + 1;
                bArr3[i10] = bArr2[(b4 & 3) << 4];
                int i12 = i11 + 1;
                byte b5 = (byte) 61;
                bArr3[i11] = b5;
                bArr3[i12] = b5;
            } else if (length2 == 2) {
                int i13 = i2 + 1;
                byte b6 = bArr[i2];
                byte b7 = bArr[i13];
                int i14 = i3 + 1;
                bArr3[i3] = bArr2[(b6 & 255) >> 2];
                int i15 = i14 + 1;
                bArr3[i14] = bArr2[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
                int i16 = i15 + 1;
                bArr3[i15] = bArr2[(b7 & 15) << 2];
                bArr3[i16] = (byte) 61;
            }
            return new String(bArr3, C4674a.f10859a);
        } else {
            C4638h.m10271a("map");
            throw null;
        }
    }
}
