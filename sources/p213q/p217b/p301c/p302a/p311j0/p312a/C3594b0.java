package p213q.p217b.p301c.p302a.p311j0.p312a;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: q.b.c.a.j0.a.b0 */
public final class C3594b0 {

    /* renamed from: a */
    public static final Charset f8972a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f8973b;

    /* renamed from: q.b.c.a.j0.a.b0$a */
    public interface C3595a extends C3603i<Boolean> {
    }

    /* renamed from: q.b.c.a.j0.a.b0$b */
    public interface C3596b extends C3603i<Double> {
    }

    /* renamed from: q.b.c.a.j0.a.b0$c */
    public interface C3597c {
        int getNumber();
    }

    /* renamed from: q.b.c.a.j0.a.b0$d */
    public interface C3598d<T extends C3597c> {
        T findValueByNumber(int i);
    }

    /* renamed from: q.b.c.a.j0.a.b0$e */
    public interface C3599e {
        boolean isInRange(int i);
    }

    /* renamed from: q.b.c.a.j0.a.b0$f */
    public interface C3600f extends C3603i<Float> {
    }

    /* renamed from: q.b.c.a.j0.a.b0$g */
    public interface C3601g extends C3603i<Integer> {
    }

    /* renamed from: q.b.c.a.j0.a.b0$h */
    public interface C3602h extends C3603i<Long> {
    }

    /* renamed from: q.b.c.a.j0.a.b0$i */
    public interface C3603i<E> extends List<E>, RandomAccess {
        /* renamed from: b */
        C3603i<E> mo9516b(int i);

        /* renamed from: j */
        void mo9530j();

        /* renamed from: s */
        boolean mo9531s();
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f8973b = bArr;
        ByteBuffer.wrap(bArr);
        byte[] bArr2 = f8973b;
        C3656k.m8447a(bArr2, 0, bArr2.length, false);
    }

    /* renamed from: a */
    public static int m8160a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: a */
    public static int m8161a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: a */
    public static int m8162a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: a */
    public static int m8163a(byte[] bArr) {
        int length = bArr.length;
        int i = length;
        for (int i2 = 0; i2 < 0 + length; i2++) {
            i = (i * 31) + bArr[i2];
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* renamed from: a */
    public static <T> T m8164a(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* renamed from: a */
    public static Object m8165a(Object obj, Object obj2) {
        return ((C3706s0) obj).toBuilder().mergeFrom((C3706s0) obj2).buildPartial();
    }

    /* renamed from: a */
    public static <T> T m8166a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: b */
    public static String m8167b(byte[] bArr) {
        return new String(bArr, f8972a);
    }
}
