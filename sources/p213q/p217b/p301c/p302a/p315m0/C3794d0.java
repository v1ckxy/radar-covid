package p213q.p217b.p301c.p302a.p315m0;

import java.util.Arrays;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.c.a.m0.d0 */
public final class C3794d0 {

    /* renamed from: a */
    public static final int[] f9347a = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};

    /* renamed from: b */
    public static final int[] f9348b = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};

    /* renamed from: c */
    public static final int[] f9349c = {67108863, 33554431};

    /* renamed from: d */
    public static final int[] f9350d = {26, 25};

    /* renamed from: a */
    public static void m9129a(long[] jArr, long[] jArr2, long[] jArr3) {
        m9128a(new long[]{jArr2[0] * jArr3[0], (jArr2[1] * jArr3[0]) + (jArr2[0] * jArr3[1]), (jArr2[2] * jArr3[0]) + (jArr2[0] * jArr3[2]) + (jArr2[1] * 2 * jArr3[1]), (jArr2[3] * jArr3[0]) + (jArr2[0] * jArr3[3]) + (jArr2[2] * jArr3[1]) + (jArr2[1] * jArr3[2]), (jArr2[4] * jArr3[0]) + (jArr2[0] * jArr3[4]) + (((jArr2[3] * jArr3[1]) + (jArr2[1] * jArr3[3])) * 2) + (jArr2[2] * jArr3[2]), (jArr2[5] * jArr3[0]) + (jArr2[0] * jArr3[5]) + (jArr2[4] * jArr3[1]) + (jArr2[1] * jArr3[4]) + (jArr2[3] * jArr3[2]) + (jArr2[2] * jArr3[3]), (jArr2[6] * jArr3[0]) + (jArr2[0] * jArr3[6]) + (jArr2[4] * jArr3[2]) + (jArr2[2] * jArr3[4]) + C1965a.m4744a(jArr2[5], jArr3[1], (jArr2[1] * jArr3[5]) + (jArr2[3] * jArr3[3]), 2), (jArr2[7] * jArr3[0]) + (jArr2[0] * jArr3[7]) + (jArr2[6] * jArr3[1]) + (jArr2[1] * jArr3[6]) + (jArr2[5] * jArr3[2]) + (jArr2[2] * jArr3[5]) + (jArr2[4] * jArr3[3]) + (jArr2[3] * jArr3[4]), (jArr2[8] * jArr3[0]) + (jArr2[0] * jArr3[8]) + (jArr2[6] * jArr3[2]) + (jArr2[2] * jArr3[6]) + (((jArr2[7] * jArr3[1]) + (jArr2[1] * jArr3[7]) + (jArr2[5] * jArr3[3]) + (jArr2[3] * jArr3[5])) * 2) + (jArr2[4] * jArr3[4]), (jArr2[9] * jArr3[0]) + (jArr2[0] * jArr3[9]) + (jArr2[8] * jArr3[1]) + (jArr2[1] * jArr3[8]) + (jArr2[7] * jArr3[2]) + (jArr2[2] * jArr3[7]) + (jArr2[6] * jArr3[3]) + (jArr2[3] * jArr3[6]) + (jArr2[5] * jArr3[4]) + (jArr2[4] * jArr3[5]), (jArr2[8] * jArr3[2]) + (jArr2[2] * jArr3[8]) + (jArr2[6] * jArr3[4]) + (jArr2[4] * jArr3[6]) + C1965a.m4744a(jArr2[9], jArr3[1], (jArr2[1] * jArr3[9]) + (jArr2[7] * jArr3[3]) + (jArr2[3] * jArr3[7]) + (jArr2[5] * jArr3[5]), 2), (jArr2[9] * jArr3[2]) + (jArr2[2] * jArr3[9]) + (jArr2[8] * jArr3[3]) + (jArr2[3] * jArr3[8]) + (jArr2[7] * jArr3[4]) + (jArr2[4] * jArr3[7]) + (jArr2[6] * jArr3[5]) + (jArr2[5] * jArr3[6]), (jArr2[8] * jArr3[4]) + (jArr2[4] * jArr3[8]) + (((jArr2[9] * jArr3[3]) + (jArr2[3] * jArr3[9]) + (jArr2[7] * jArr3[5]) + (jArr2[5] * jArr3[7])) * 2) + (jArr2[6] * jArr3[6]), (jArr2[9] * jArr3[4]) + (jArr2[4] * jArr3[9]) + (jArr2[8] * jArr3[5]) + (jArr2[5] * jArr3[8]) + (jArr2[7] * jArr3[6]) + (jArr2[6] * jArr3[7]), (jArr2[8] * jArr3[6]) + (jArr2[6] * jArr3[8]) + C1965a.m4744a(jArr2[9], jArr3[5], (jArr2[5] * jArr3[9]) + (jArr2[7] * jArr3[7]), 2), (jArr2[9] * jArr3[6]) + (jArr2[6] * jArr3[9]) + (jArr2[8] * jArr3[7]) + (jArr2[7] * jArr3[8]), (((jArr2[9] * jArr3[7]) + (jArr2[7] * jArr3[9])) * 2) + (jArr2[8] * jArr3[8]), (jArr2[9] * jArr3[8]) + (jArr2[8] * jArr3[9]), jArr2[9] * 2 * jArr3[9]}, jArr);
    }

    /* renamed from: a */
    public static byte[] m9130a(long[] jArr) {
        long[] copyOf = Arrays.copyOf(jArr, 10);
        for (int i = 0; i < 2; i++) {
            int i2 = 0;
            while (i2 < 9) {
                long j = copyOf[i2] & (copyOf[i2] >> 31);
                int[] iArr = f9350d;
                int i3 = i2 & 1;
                int i4 = -((int) (j >> iArr[i3]));
                copyOf[i2] = copyOf[i2] + ((long) (i4 << iArr[i3]));
                i2++;
                copyOf[i2] = copyOf[i2] - ((long) i4);
            }
            int i5 = -((int) (((copyOf[9] >> 31) & copyOf[9]) >> 25));
            copyOf[9] = copyOf[9] + ((long) (i5 << 25));
            copyOf[0] = copyOf[0] - ((long) (i5 * 19));
        }
        int i6 = -((int) ((copyOf[0] & (copyOf[0] >> 31)) >> 26));
        copyOf[0] = copyOf[0] + ((long) (i6 << 26));
        copyOf[1] = copyOf[1] - ((long) i6);
        for (int i7 = 0; i7 < 2; i7++) {
            int i8 = 0;
            while (i8 < 9) {
                int i9 = i8 & 1;
                int i10 = (int) (copyOf[i8] >> f9350d[i9]);
                copyOf[i8] = copyOf[i8] & ((long) f9349c[i9]);
                i8++;
                copyOf[i8] = copyOf[i8] + ((long) i10);
            }
        }
        int i11 = (int) (copyOf[9] >> 25);
        copyOf[9] = copyOf[9] & 33554431;
        copyOf[0] = copyOf[0] + ((long) (i11 * 19));
        int i12 = ~((((int) copyOf[0]) - 67108845) >> 31);
        for (int i13 = 1; i13 < 10; i13++) {
            int i14 = ~(((int) copyOf[i13]) ^ f9349c[i13 & 1]);
            int i15 = i14 & (i14 << 16);
            int i16 = i15 & (i15 << 8);
            int i17 = i16 & (i16 << 4);
            int i18 = i17 & (i17 << 2);
            i12 &= (i18 & (i18 << 1)) >> 31;
        }
        copyOf[0] = copyOf[0] - ((long) (67108845 & i12));
        long j2 = (long) (33554431 & i12);
        copyOf[1] = copyOf[1] - j2;
        for (int i19 = 2; i19 < 10; i19 += 2) {
            copyOf[i19] = copyOf[i19] - ((long) (67108863 & i12));
            int i20 = i19 + 1;
            copyOf[i20] = copyOf[i20] - j2;
        }
        for (int i21 = 0; i21 < 10; i21++) {
            copyOf[i21] = copyOf[i21] << f9348b[i21];
        }
        byte[] bArr = new byte[32];
        for (int i22 = 0; i22 < 10; i22++) {
            int[] iArr2 = f9347a;
            int i23 = iArr2[i22];
            bArr[i23] = (byte) ((int) (((long) bArr[i23]) | (copyOf[i22] & 255)));
            int i24 = iArr2[i22] + 1;
            bArr[i24] = (byte) ((int) (((long) bArr[i24]) | ((copyOf[i22] >> 8) & 255)));
            int i25 = iArr2[i22] + 2;
            bArr[i25] = (byte) ((int) (((long) bArr[i25]) | ((copyOf[i22] >> 16) & 255)));
            int i26 = iArr2[i22] + 3;
            bArr[i26] = (byte) ((int) (((long) bArr[i26]) | ((copyOf[i22] >> 24) & 255)));
        }
        return bArr;
    }

    /* renamed from: a */
    public static long[] m9131a(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i = 0; i < 10; i++) {
            int[] iArr = f9347a;
            jArr[i] = ((((((long) (bArr[iArr[i]] & 255)) | (((long) (bArr[iArr[i] + 1] & 255)) << 8)) | (((long) (bArr[iArr[i] + 2] & 255)) << 16)) | (((long) (bArr[iArr[i] + 3] & 255)) << 24)) >> f9348b[i]) & ((long) f9349c[i & 1]);
        }
        return jArr;
    }

    /* renamed from: b */
    public static void m9132b(long[] jArr, long[] jArr2) {
        m9128a(new long[]{jArr2[0] * jArr2[0], jArr2[0] * 2 * jArr2[1], C1965a.m4744a(jArr2[0], jArr2[2], jArr2[1] * jArr2[1], 2), C1965a.m4744a(jArr2[0], jArr2[3], jArr2[1] * jArr2[2], 2), (jArr2[0] * 2 * jArr2[4]) + (jArr2[1] * 4 * jArr2[3]) + (jArr2[2] * jArr2[2]), C1965a.m4744a(jArr2[0], jArr2[5], (jArr2[1] * jArr2[4]) + (jArr2[2] * jArr2[3]), 2), C1965a.m4744a(jArr2[1] * 2, jArr2[5], (jArr2[0] * jArr2[6]) + (jArr2[2] * jArr2[4]) + (jArr2[3] * jArr2[3]), 2), C1965a.m4744a(jArr2[0], jArr2[7], (jArr2[1] * jArr2[6]) + (jArr2[2] * jArr2[5]) + (jArr2[3] * jArr2[4]), 2), (((((jArr2[3] * jArr2[5]) + (jArr2[1] * jArr2[7])) * 2) + (jArr2[0] * jArr2[8]) + (jArr2[2] * jArr2[6])) * 2) + (jArr2[4] * jArr2[4]), C1965a.m4744a(jArr2[0], jArr2[9], (jArr2[1] * jArr2[8]) + (jArr2[2] * jArr2[7]) + (jArr2[3] * jArr2[6]) + (jArr2[4] * jArr2[5]), 2), ((((jArr2[1] * jArr2[9]) + (jArr2[3] * jArr2[7])) * 2) + (jArr2[2] * jArr2[8]) + (jArr2[4] * jArr2[6]) + (jArr2[5] * jArr2[5])) * 2, C1965a.m4744a(jArr2[2], jArr2[9], (jArr2[3] * jArr2[8]) + (jArr2[4] * jArr2[7]) + (jArr2[5] * jArr2[6]), 2), (((((jArr2[3] * jArr2[9]) + (jArr2[5] * jArr2[7])) * 2) + (jArr2[4] * jArr2[8])) * 2) + (jArr2[6] * jArr2[6]), C1965a.m4744a(jArr2[4], jArr2[9], (jArr2[5] * jArr2[8]) + (jArr2[6] * jArr2[7]), 2), C1965a.m4744a(jArr2[5] * 2, jArr2[9], (jArr2[6] * jArr2[8]) + (jArr2[7] * jArr2[7]), 2), C1965a.m4744a(jArr2[6], jArr2[9], jArr2[7] * jArr2[8], 2), (jArr2[7] * 4 * jArr2[9]) + (jArr2[8] * jArr2[8]), jArr2[8] * 2 * jArr2[9], jArr2[9] * 2 * jArr2[9]}, jArr);
    }

    /* renamed from: b */
    public static void m9133b(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] - jArr3[i];
        }
    }

    /* renamed from: c */
    public static void m9134c(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] + jArr3[i];
        }
    }

    /* renamed from: a */
    public static void m9128a(long[] jArr, long[] jArr2) {
        long[] jArr3 = jArr;
        if (jArr3.length != 19) {
            long[] jArr4 = new long[19];
            System.arraycopy(jArr3, 0, jArr4, 0, jArr3.length);
            jArr3 = jArr4;
        }
        jArr3[8] = jArr3[8] + (jArr3[18] << 4);
        jArr3[8] = jArr3[8] + (jArr3[18] << 1);
        jArr3[8] = jArr3[8] + jArr3[18];
        jArr3[7] = jArr3[7] + (jArr3[17] << 4);
        jArr3[7] = jArr3[7] + (jArr3[17] << 1);
        jArr3[7] = jArr3[7] + jArr3[17];
        jArr3[6] = jArr3[6] + (jArr3[16] << 4);
        jArr3[6] = jArr3[6] + (jArr3[16] << 1);
        jArr3[6] = jArr3[6] + jArr3[16];
        jArr3[5] = jArr3[5] + (jArr3[15] << 4);
        jArr3[5] = jArr3[5] + (jArr3[15] << 1);
        jArr3[5] = jArr3[5] + jArr3[15];
        jArr3[4] = jArr3[4] + (jArr3[14] << 4);
        jArr3[4] = jArr3[4] + (jArr3[14] << 1);
        jArr3[4] = jArr3[4] + jArr3[14];
        jArr3[3] = jArr3[3] + (jArr3[13] << 4);
        jArr3[3] = jArr3[3] + (jArr3[13] << 1);
        jArr3[3] = jArr3[3] + jArr3[13];
        jArr3[2] = jArr3[2] + (jArr3[12] << 4);
        jArr3[2] = jArr3[2] + (jArr3[12] << 1);
        jArr3[2] = jArr3[2] + jArr3[12];
        jArr3[1] = jArr3[1] + (jArr3[11] << 4);
        jArr3[1] = jArr3[1] + (jArr3[11] << 1);
        jArr3[1] = jArr3[1] + jArr3[11];
        jArr3[0] = jArr3[0] + (jArr3[10] << 4);
        jArr3[0] = jArr3[0] + (jArr3[10] << 1);
        jArr3[0] = jArr3[0] + jArr3[10];
        jArr3[10] = 0;
        int i = 0;
        while (i < 10) {
            long j = jArr3[i] / 67108864;
            jArr3[i] = jArr3[i] - (j << 26);
            int i2 = i + 1;
            jArr3[i2] = jArr3[i2] + j;
            long j2 = jArr3[i2] / 33554432;
            jArr3[i2] = jArr3[i2] - (j2 << 25);
            i += 2;
            jArr3[i] = jArr3[i] + j2;
        }
        jArr3[0] = jArr3[0] + (jArr3[10] << 4);
        jArr3[0] = jArr3[0] + (jArr3[10] << 1);
        jArr3[0] = jArr3[0] + jArr3[10];
        jArr3[10] = 0;
        long j3 = jArr3[0] / 67108864;
        jArr3[0] = jArr3[0] - (j3 << 26);
        jArr3[1] = jArr3[1] + j3;
        System.arraycopy(jArr3, 0, jArr2, 0, 10);
    }
}
