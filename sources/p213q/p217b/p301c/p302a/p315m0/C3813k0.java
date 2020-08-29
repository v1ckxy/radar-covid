package p213q.p217b.p301c.p302a.p315m0;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import javax.crypto.Cipher;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p301c.p302a.C3850u;

/* renamed from: q.b.c.a.m0.k0 */
public final class C3813k0 implements C3850u {

    /* renamed from: a */
    public final RSAPrivateCrtKey f9389a;

    /* renamed from: b */
    public final RSAPublicKey f9390b;

    /* renamed from: c */
    public final C3790c0 f9391c;

    /* renamed from: d */
    public final C3790c0 f9392d;

    /* renamed from: e */
    public final int f9393e;

    public C3813k0(RSAPrivateCrtKey rSAPrivateCrtKey, C3790c0 c0Var, C3790c0 c0Var2, int i) {
        C3817m0.m9177a(c0Var);
        C3817m0.m9178b(rSAPrivateCrtKey.getModulus().bitLength());
        this.f9389a = rSAPrivateCrtKey;
        this.f9390b = (RSAPublicKey) ((KeyFactory) C3778a0.f9328k.mo10023a("RSA")).generatePublic(new RSAPublicKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent()));
        this.f9391c = c0Var;
        this.f9392d = c0Var2;
        this.f9393e = i;
    }

    /* renamed from: a */
    public byte[] mo10044a(byte[] bArr) {
        byte[] bArr2;
        int bitLength = this.f9390b.getModulus().bitLength() - 1;
        C3817m0.m9177a(this.f9391c);
        MessageDigest messageDigest = (MessageDigest) C3778a0.f9326i.mo10023a(C2286e.m5195a(this.f9391c));
        byte[] digest = messageDigest.digest(bArr);
        int digestLength = messageDigest.getDigestLength();
        int i = ((bitLength - 1) / 8) + 1;
        int i2 = this.f9393e;
        if (i >= digestLength + i2 + 2) {
            byte[] a = C3806h0.m9148a(i2);
            int i3 = digestLength + 8;
            byte[] bArr3 = new byte[(this.f9393e + i3)];
            System.arraycopy(digest, 0, bArr3, 8, digestLength);
            System.arraycopy(a, 0, bArr3, i3, a.length);
            byte[] digest2 = messageDigest.digest(bArr3);
            int i4 = (i - digestLength) - 1;
            byte[] bArr4 = new byte[i4];
            int i5 = (i - this.f9393e) - digestLength;
            bArr4[i5 - 2] = 1;
            System.arraycopy(a, 0, bArr4, i5 - 1, a.length);
            byte[] a2 = C2286e.m5267a(digest2, i4, this.f9392d);
            byte[] bArr5 = new byte[i4];
            for (int i6 = 0; i6 < i4; i6++) {
                bArr5[i6] = (byte) (bArr4[i6] ^ a2[i6]);
            }
            int i7 = 0;
            while (true) {
                bArr2 = digest2;
                if (((long) i7) >= (((long) i) * 8) - ((long) bitLength)) {
                    break;
                }
                int i8 = i7 / 8;
                int i9 = 7 - (i7 % 8);
                bArr5[i8] = (byte) ((~(1 << i9)) & bArr5[i8]);
                i7++;
                digest2 = bArr2;
            }
            int i10 = digestLength + i4;
            byte[] bArr6 = new byte[(i10 + 1)];
            System.arraycopy(bArr5, 0, bArr6, 0, i4);
            byte[] bArr7 = bArr2;
            System.arraycopy(bArr7, 0, bArr6, i4, bArr7.length);
            bArr6[i10] = -68;
            String str = "RSA/ECB/NOPADDING";
            Cipher cipher = (Cipher) C3778a0.f9323f.mo10023a(str);
            cipher.init(2, this.f9389a);
            byte[] doFinal = cipher.doFinal(bArr6);
            Cipher cipher2 = (Cipher) C3778a0.f9323f.mo10023a(str);
            cipher2.init(1, this.f9390b);
            if (new BigInteger(1, bArr6).equals(new BigInteger(1, cipher2.doFinal(doFinal)))) {
                return doFinal;
            }
            throw new RuntimeException("Security bug: RSA signature computation error");
        }
        throw new GeneralSecurityException("encoding error");
    }
}
