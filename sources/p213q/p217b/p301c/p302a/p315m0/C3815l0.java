package p213q.p217b.p301c.p302a.p315m0;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p301c.p302a.C3851v;

/* renamed from: q.b.c.a.m0.l0 */
public final class C3815l0 implements C3851v {

    /* renamed from: a */
    public final RSAPublicKey f9396a;

    /* renamed from: b */
    public final C3790c0 f9397b;

    /* renamed from: c */
    public final C3790c0 f9398c;

    /* renamed from: d */
    public final int f9399d;

    public C3815l0(RSAPublicKey rSAPublicKey, C3790c0 c0Var, C3790c0 c0Var2, int i) {
        C3817m0.m9177a(c0Var);
        C3817m0.m9178b(rSAPublicKey.getModulus().bitLength());
        this.f9396a = rSAPublicKey;
        this.f9397b = c0Var;
        this.f9398c = c0Var2;
        this.f9399d = i;
    }

    /* renamed from: a */
    public void mo10045a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        BigInteger publicExponent = this.f9396a.getPublicExponent();
        BigInteger modulus = this.f9396a.getModulus();
        int bitLength = ((modulus.bitLength() - 1) + 7) / 8;
        if ((modulus.bitLength() + 7) / 8 == bArr3.length) {
            BigInteger bigInteger = new BigInteger(1, bArr3);
            if (bigInteger.compareTo(modulus) < 0) {
                byte[] a = C2286e.m5265a(bigInteger.modPow(publicExponent, modulus), bitLength);
                int bitLength2 = modulus.bitLength() - 1;
                C3817m0.m9177a(this.f9397b);
                MessageDigest messageDigest = (MessageDigest) C3778a0.f9326i.mo10023a(C2286e.m5195a(this.f9397b));
                byte[] digest = messageDigest.digest(bArr2);
                int digestLength = messageDigest.getDigestLength();
                int length = a.length;
                String str = "inconsistent";
                if (length < this.f9399d + digestLength + 2) {
                    throw new GeneralSecurityException(str);
                } else if (a[a.length - 1] == -68) {
                    int i = length - digestLength;
                    int i2 = i - 1;
                    byte[] copyOf = Arrays.copyOf(a, i2);
                    byte[] copyOfRange = Arrays.copyOfRange(a, copyOf.length, copyOf.length + digestLength);
                    int i3 = digestLength;
                    int i4 = 0;
                    while (true) {
                        int i5 = i4;
                        int i6 = length;
                        long j = (((long) length) * 8) - ((long) bitLength2);
                        if (((long) i4) < j) {
                            if (((copyOf[i5 / 8] >> (7 - (i5 % 8))) & 1) == 0) {
                                i4 = i5 + 1;
                                length = i6;
                            } else {
                                throw new GeneralSecurityException(str);
                            }
                        } else {
                            byte[] a2 = C2286e.m5267a(copyOfRange, i2, this.f9398c);
                            int length2 = a2.length;
                            byte[] bArr4 = new byte[length2];
                            for (int i7 = 0; i7 < length2; i7++) {
                                bArr4[i7] = (byte) (a2[i7] ^ copyOf[i7]);
                            }
                            for (int i8 = 0; ((long) i8) <= j; i8++) {
                                int i9 = i8 / 8;
                                int i10 = 7 - (i8 % 8);
                                bArr4[i9] = (byte) ((~(1 << i10)) & bArr4[i9]);
                            }
                            int i11 = 0;
                            while (true) {
                                int i12 = this.f9399d;
                                int i13 = (i - i12) - 2;
                                if (i11 < i13) {
                                    if (bArr4[i11] == 0) {
                                        i11++;
                                    } else {
                                        throw new GeneralSecurityException(str);
                                    }
                                } else if (bArr4[i13] == 1) {
                                    byte[] copyOfRange2 = Arrays.copyOfRange(bArr4, length2 - i12, length2);
                                    int i14 = i3 + 8;
                                    byte[] bArr5 = new byte[(this.f9399d + i14)];
                                    System.arraycopy(digest, 0, bArr5, 8, digest.length);
                                    System.arraycopy(copyOfRange2, 0, bArr5, i14, copyOfRange2.length);
                                    if (!C2286e.m5301b(messageDigest.digest(bArr5), copyOfRange)) {
                                        throw new GeneralSecurityException(str);
                                    }
                                    return;
                                } else {
                                    throw new GeneralSecurityException(str);
                                }
                            }
                        }
                    }
                } else {
                    throw new GeneralSecurityException(str);
                }
            } else {
                throw new GeneralSecurityException("signature out of range");
            }
        } else {
            throw new GeneralSecurityException("invalid signature's length");
        }
    }
}
