package p213q.p217b.p301c.p302a.p315m0;

import java.security.SecureRandom;

/* renamed from: q.b.c.a.m0.h0 */
public final class C3806h0 {

    /* renamed from: a */
    public static final ThreadLocal<SecureRandom> f9380a = new C3807a();

    /* renamed from: q.b.c.a.m0.h0$a */
    public class C3807a extends ThreadLocal<SecureRandom> {
        public Object initialValue() {
            SecureRandom secureRandom = new SecureRandom();
            secureRandom.nextLong();
            return secureRandom;
        }
    }

    /* renamed from: a */
    public static byte[] m9148a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) f9380a.get()).nextBytes(bArr);
        return bArr;
    }
}
