package p124p.p143e;

/* renamed from: p.e.d */
public class C1252d {

    /* renamed from: a */
    public static final int[] f3553a = new int[0];

    /* renamed from: b */
    public static final long[] f3554b = new long[0];

    /* renamed from: c */
    public static final Object[] f3555c = new Object[0];

    /* renamed from: a */
    public static int m3158a(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                return i3;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static int m3159a(int[] iArr, int i, int i2) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else if (i6 <= i2) {
                return i5;
            } else {
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    /* renamed from: a */
    public static int m3160a(long[] jArr, int i, long j) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = (jArr[i4] > j ? 1 : (jArr[i4] == j ? 0 : -1));
            if (i5 < 0) {
                i3 = i4 + 1;
            } else if (i5 <= 0) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    /* renamed from: a */
    public static boolean m3161a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static int m3162b(int i) {
        return m3158a(i * 4) / 4;
    }

    /* renamed from: c */
    public static int m3163c(int i) {
        return m3158a(i * 8) / 8;
    }
}
