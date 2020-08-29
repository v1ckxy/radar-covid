package p213q.p217b.p218a.p231b.p251g.p256e;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2491a;

/* renamed from: q.b.a.b.g.e.l6 */
public final class C2546l6 {

    /* renamed from: a */
    public static final Charset f6704a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f6705b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f6705b = bArr;
        ByteBuffer.wrap(bArr);
        int length = f6705b.length;
        int i = length + 0;
        if (length < 0) {
            throw C2618p6.m6291b();
        } else if ((0 - 0) + length <= Integer.MAX_VALUE) {
            int i2 = i + 0 + 0;
        } else {
            try {
                throw C2618p6.m6290a();
            } catch (C2618p6 e) {
                throw new IllegalArgumentException(e);
            }
        }
    }

    /* renamed from: a */
    public static int m6109a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: a */
    public static int m6110a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: a */
    public static int m6111a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: a */
    public static <T> T m6112a(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* renamed from: a */
    public static Object m6113a(Object obj, Object obj2) {
        C2619p7 p7Var = (C2619p7) obj2;
        C2714v4 v4Var = (C2714v4) ((C2619p7) obj).mo7766e();
        if (v4Var != null) {
            C2491a aVar = (C2491a) v4Var;
            if (aVar.f6617e.getClass().isInstance(p7Var)) {
                aVar.mo7773a((C2490i6) ((C2730w4) p7Var));
                return aVar.mo7777l();
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        throw null;
    }

    /* renamed from: a */
    public static <T> T m6114a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static String m6115a(byte[] bArr) {
        return new String(bArr, f6704a);
    }

    /* renamed from: b */
    public static int m6116b(byte[] bArr) {
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
}
