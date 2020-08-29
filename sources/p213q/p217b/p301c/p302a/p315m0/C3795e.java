package p213q.p217b.p301c.p302a.p315m0;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.c.a.m0.e */
public final class C3795e extends C3801g0 {

    /* renamed from: a */
    public final int f9351a;

    public C3795e(byte[] bArr, String str, int i, int i2, int i3) {
        if (bArr.length < 16 || bArr.length < i) {
            StringBuilder a = C1965a.m4756a("ikm too short, must be >= ");
            a.append(Math.max(16, i));
            throw new InvalidAlgorithmParameterException(a.toString());
        }
        C3817m0.m9175a(i);
        if (i2 > this.f9351a + 1 + 7 + i3 + 16) {
            Arrays.copyOf(bArr, bArr.length);
            this.f9351a = i;
            return;
        }
        throw new InvalidAlgorithmParameterException("ciphertextSegmentSize too small");
    }
}
