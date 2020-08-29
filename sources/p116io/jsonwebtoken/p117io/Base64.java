package p116io.jsonwebtoken.p117io;

import java.util.Arrays;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: io.jsonwebtoken.io.Base64 */
public final class Base64 {
    public static final char[] BASE64URL_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".toCharArray();
    public static final int[] BASE64URL_IALPHABET = new int[256];
    public static final char[] BASE64_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
    public static final int[] BASE64_IALPHABET;
    public static final Base64 DEFAULT = new Base64(false);
    public static final int IALPHABET_MAX_INDEX;
    public static final Base64 URL_SAFE = new Base64(true);
    public final char[] ALPHABET;
    public final int[] IALPHABET;
    public final boolean urlsafe;

    static {
        int[] iArr = new int[256];
        BASE64_IALPHABET = iArr;
        IALPHABET_MAX_INDEX = iArr.length - 1;
        Arrays.fill(iArr, -1);
        int[] iArr2 = BASE64_IALPHABET;
        System.arraycopy(iArr2, 0, BASE64URL_IALPHABET, 0, iArr2.length);
        int length = BASE64_ALPHABET.length;
        for (int i = 0; i < length; i++) {
            BASE64_IALPHABET[BASE64_ALPHABET[i]] = i;
            BASE64URL_IALPHABET[BASE64URL_ALPHABET[i]] = i;
        }
        BASE64_IALPHABET[61] = 0;
        BASE64URL_IALPHABET[61] = 0;
    }

    public Base64(boolean z) {
        this.urlsafe = z;
        this.ALPHABET = z ? BASE64URL_ALPHABET : BASE64_ALPHABET;
        this.IALPHABET = z ? BASE64URL_IALPHABET : BASE64_IALPHABET;
    }

    private int ctoi(char c) {
        int i = c > IALPHABET_MAX_INDEX ? -1 : this.IALPHABET[c];
        if (i >= 0) {
            return i;
        }
        StringBuilder a = C1965a.m4756a("Illegal ");
        a.append(getName());
        a.append(" character: '");
        a.append(c);
        a.append("'");
        throw new DecodingException(a.toString());
    }

    private char[] encodeToChar(byte[] bArr, boolean z) {
        byte[] bArr2 = bArr;
        int length = bArr2 != null ? bArr2.length : 0;
        if (length == 0) {
            return new char[0];
        }
        int i = (length / 3) * 3;
        int i2 = length - i;
        int i3 = length - 1;
        int i4 = ((i3 / 3) + 1) << 2;
        int i5 = i4 + (z ? ((i4 - 1) / 76) << 1 : 0);
        int i6 = i2 == 2 ? 1 : i2 == 1 ? 2 : 0;
        char[] cArr = new char[(this.urlsafe ? i5 - i6 : i5)];
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < i) {
            int i10 = i7 + 1;
            int i11 = i10 + 1;
            byte b = ((bArr2[i7] & 255) << 16) | ((bArr2[i10] & 255) << 8);
            int i12 = i11 + 1;
            byte b2 = b | (bArr2[i11] & 255);
            int i13 = i8 + 1;
            char[] cArr2 = this.ALPHABET;
            cArr[i8] = cArr2[(b2 >>> 18) & 63];
            int i14 = i13 + 1;
            cArr[i13] = cArr2[(b2 >>> 12) & 63];
            int i15 = i14 + 1;
            cArr[i14] = cArr2[(b2 >>> 6) & 63];
            i8 = i15 + 1;
            cArr[i15] = cArr2[b2 & 63];
            if (z) {
                i9++;
                if (i9 == 19 && i8 < i5 - 2) {
                    int i16 = i8 + 1;
                    cArr[i8] = 13;
                    int i17 = i16 + 1;
                    cArr[i16] = 10;
                    i8 = i17;
                    i9 = 0;
                }
            }
            i7 = i12;
        }
        if (i2 > 0) {
            int i18 = ((bArr2[i] & 255) << 10) | (i2 == 2 ? (bArr2[i3] & 255) << 2 : 0);
            int i19 = i5 - 4;
            char[] cArr3 = this.ALPHABET;
            cArr[i19] = cArr3[i18 >> 12];
            cArr[i5 - 3] = cArr3[(i18 >>> 6) & 63];
            if (i2 == 2) {
                cArr[i5 - 2] = cArr3[i18 & 63];
            } else if (!this.urlsafe) {
                cArr[i5 - 2] = '=';
            }
            if (!this.urlsafe) {
                cArr[i5 - 1] = '=';
            }
        }
        return cArr;
    }

    private String getName() {
        return this.urlsafe ? "base64url" : "base64";
    }

    public final byte[] decodeFast(char[] cArr) {
        int i;
        int i2 = 0;
        int length = cArr != null ? cArr.length : 0;
        if (length == 0) {
            return new byte[0];
        }
        int i3 = length - 1;
        int i4 = 0;
        while (i4 < i3 && this.IALPHABET[cArr[i4]] < 0) {
            i4++;
        }
        while (i3 > 0 && this.IALPHABET[cArr[i3]] < 0) {
            i3--;
        }
        int i5 = cArr[i3] == '=' ? cArr[i3 + -1] == '=' ? 2 : 1 : 0;
        int i6 = (i3 - i4) + 1;
        if (length > 76) {
            i = (cArr[76] == 13 ? i6 / 78 : 0) << 1;
        } else {
            i = 0;
        }
        int i7 = (((i6 - i) * 6) >> 3) - i5;
        byte[] bArr = new byte[i7];
        int i8 = (i7 / 3) * 3;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i8) {
            int i11 = i4 + 1;
            int i12 = i11 + 1;
            int ctoi = (ctoi(cArr[i4]) << 18) | (ctoi(cArr[i11]) << 12);
            int i13 = i12 + 1;
            int ctoi2 = ctoi | (ctoi(cArr[i12]) << 6);
            int i14 = i13 + 1;
            int ctoi3 = ctoi2 | ctoi(cArr[i13]);
            int i15 = i9 + 1;
            bArr[i9] = (byte) (ctoi3 >> 16);
            int i16 = i15 + 1;
            bArr[i15] = (byte) (ctoi3 >> 8);
            int i17 = i16 + 1;
            bArr[i16] = (byte) ctoi3;
            if (i > 0) {
                i10++;
                if (i10 == 19) {
                    i14 += 2;
                    i10 = 0;
                }
            }
            i4 = i14;
            i9 = i17;
        }
        if (i9 < i7) {
            int i18 = 0;
            while (i4 <= i3 - i5) {
                i2 |= ctoi(cArr[i4]) << (18 - (i18 * 6));
                i18++;
                i4++;
            }
            int i19 = 16;
            while (i9 < i7) {
                int i20 = i9 + 1;
                bArr[i9] = (byte) (i2 >> i19);
                i19 -= 8;
                i9 = i20;
            }
        }
        return bArr;
    }

    public final String encodeToString(byte[] bArr, boolean z) {
        return new String(encodeToChar(bArr, z));
    }
}
