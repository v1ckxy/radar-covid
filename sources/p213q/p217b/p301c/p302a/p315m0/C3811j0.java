package p213q.p217b.p301c.p302a.p315m0;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p301c.p302a.C3851v;

/* renamed from: q.b.c.a.m0.j0 */
public final class C3811j0 implements C3851v {

    /* renamed from: a */
    public final RSAPublicKey f9387a;

    /* renamed from: b */
    public final C3790c0 f9388b;

    public C3811j0(RSAPublicKey rSAPublicKey, C3790c0 c0Var) {
        C3817m0.m9177a(c0Var);
        C3817m0.m9178b(rSAPublicKey.getModulus().bitLength());
        this.f9387a = rSAPublicKey;
        this.f9388b = c0Var;
    }

    /* renamed from: a */
    public void mo10042a(byte[] bArr, byte[] bArr2) {
        String str;
        BigInteger publicExponent = this.f9387a.getPublicExponent();
        BigInteger modulus = this.f9387a.getModulus();
        int bitLength = (modulus.bitLength() + 7) / 8;
        if (bitLength == bArr.length) {
            BigInteger bigInteger = new BigInteger(1, bArr);
            if (bigInteger.compareTo(modulus) < 0) {
                byte[] a = C2286e.m5265a(bigInteger.modPow(publicExponent, modulus), bitLength);
                C3790c0 c0Var = this.f9388b;
                C3817m0.m9177a(c0Var);
                MessageDigest messageDigest = (MessageDigest) C3778a0.f9326i.mo10023a(C2286e.m5195a(this.f9388b));
                messageDigest.update(bArr2);
                byte[] digest = messageDigest.digest();
                int ordinal = c0Var.ordinal();
                if (ordinal == 1) {
                    str = "3031300d060960864801650304020105000420";
                } else if (ordinal == 3) {
                    str = "3051300d060960864801650304020305000440";
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unsupported hash ");
                    sb.append(c0Var);
                    throw new GeneralSecurityException(sb.toString());
                }
                byte[] c = C2286e.m5315c(str);
                int length = c.length + digest.length;
                if (bitLength >= length + 11) {
                    byte[] bArr3 = new byte[bitLength];
                    bArr3[0] = 0;
                    int i = 2;
                    bArr3[1] = 1;
                    int i2 = 0;
                    while (i2 < (bitLength - length) - 3) {
                        int i3 = i + 1;
                        bArr3[i] = -1;
                        i2++;
                        i = i3;
                    }
                    int i4 = i + 1;
                    bArr3[i] = 0;
                    System.arraycopy(c, 0, bArr3, i4, c.length);
                    System.arraycopy(digest, 0, bArr3, i4 + c.length, digest.length);
                    if (!C2286e.m5301b(a, bArr3)) {
                        throw new GeneralSecurityException("invalid signature");
                    }
                    return;
                }
                throw new GeneralSecurityException("intended encoded message length too short");
            }
            throw new GeneralSecurityException("signature out of range");
        }
        throw new GeneralSecurityException("invalid signature's length");
    }
}
