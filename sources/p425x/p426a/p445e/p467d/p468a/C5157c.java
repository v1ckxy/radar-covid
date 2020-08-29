package p425x.p426a.p445e.p467d.p468a;

import java.math.BigInteger;

/* renamed from: x.a.e.d.a.c */
public final class C5157c {
    static {
        BigInteger.valueOf(0);
        BigInteger.valueOf(1);
        BigInteger.valueOf(2);
        BigInteger.valueOf(4);
    }

    /* renamed from: a */
    public static int m11588a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i < 0) {
            i = -i;
        }
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 8;
        }
        return i2;
    }
}
