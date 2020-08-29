package p213q.p217b.p218a.p231b.p251g.p256e;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: q.b.a.b.g.e.h3 */
public final class C2470h3 {
    /* renamed from: a */
    public static int m5890a(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    /* renamed from: a */
    public static int m5891a(Object obj, int i) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? ((short[]) obj)[i] & 65535 : ((int[]) obj)[i];
    }

    /* renamed from: a */
    public static int m5892a(@NullableDecl Object obj, @NullableDecl Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, @NullableDecl Object[] objArr2) {
        int i2;
        int i3;
        int i4 = C2286e.m5350i(obj);
        int i5 = i4 & i;
        int a = m5891a(obj3, i5);
        if (a == 0) {
            return -1;
        }
        int i6 = ~i;
        int i7 = i4 & i6;
        int i8 = -1;
        while (true) {
            i2 = a - 1;
            i3 = iArr[i2];
            if ((i3 & i6) != i7 || !C2286e.m5238a(obj, objArr[i2]) || (objArr2 != null && !C2286e.m5238a(obj2, objArr2[i2]))) {
                int i9 = i3 & i;
                if (i9 == 0) {
                    return -1;
                }
                int i10 = i9;
                i8 = i2;
                a = i10;
            }
        }
        int i11 = i3 & i;
        if (i8 == -1) {
            m5894a(obj3, i5, i11);
        } else {
            iArr[i8] = m5890a(iArr[i8], i11, i);
        }
        return i2;
    }

    /* renamed from: a */
    public static Object m5893a(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("must be power of 2 between 2^1 and 2^30: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static void m5894a(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}
