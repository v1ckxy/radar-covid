package p213q.p217b.p301c.p302a.p315m0;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.c.a.m0.b */
public final class C3779b extends C3801g0 {
    public C3779b(byte[] bArr, String str, int i, String str2, int i2, int i3, int i4) {
        int length = bArr.length;
        if (length < 16 || length < i) {
            StringBuilder a = C1965a.m4756a("ikm too short, must be >= ");
            a.append(Math.max(16, i));
            throw new InvalidAlgorithmParameterException(a.toString());
        }
        C3817m0.m9175a(i);
        if (i2 < 10) {
            throw new InvalidAlgorithmParameterException(C1965a.m4761b("tag size too small ", i2));
        } else if ((str2.equals("HmacSha1") && i2 > 20) || ((str2.equals("HmacSha256") && i2 > 32) || (str2.equals("HmacSha512") && i2 > 64))) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        } else if (((((i3 - i4) - i2) - i) - 7) - 1 > 0) {
            Arrays.copyOf(bArr, bArr.length);
        } else {
            throw new InvalidAlgorithmParameterException("ciphertextSegmentSize too small");
        }
    }
}
