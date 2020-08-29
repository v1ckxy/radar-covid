package p213q.p217b.p301c.p302a.p315m0;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.regex.Pattern;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.c.a.m0.m0 */
public final class C3817m0 {
    static {
        String str = "([0-9a-zA-Z\\-\\.\\_~])+";
        Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s$", new Object[]{str, str, str, str}), 2);
        Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s/cryptoKeyVersions/%s$", new Object[]{str, str, str, str, str}), 2);
    }

    /* renamed from: a */
    public static String m9174a(String str, String str2) {
        if (str2.toLowerCase().startsWith(str)) {
            return str2.substring(str.length());
        }
        throw new IllegalArgumentException(String.format("key URI must start with %s", new Object[]{str}));
    }

    /* renamed from: a */
    public static void m9175a(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", new Object[]{Integer.valueOf(i * 8)}));
        }
    }

    /* renamed from: a */
    public static void m9176a(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new GeneralSecurityException(String.format("key has version %d; only keys with version in range [0..%d] are supported", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
        }
    }

    /* renamed from: a */
    public static void m9177a(C3790c0 c0Var) {
        int ordinal = c0Var.ordinal();
        if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
            StringBuilder a = C1965a.m4756a("Unsupported hash: ");
            a.append(c0Var.name());
            throw new GeneralSecurityException(a.toString());
        }
    }

    /* renamed from: b */
    public static void m9178b(int i) {
        if (i < 2048) {
            throw new GeneralSecurityException(String.format("Modulus size is %d; only modulus size >= 2048-bit is supported", new Object[]{Integer.valueOf(i)}));
        }
    }
}
