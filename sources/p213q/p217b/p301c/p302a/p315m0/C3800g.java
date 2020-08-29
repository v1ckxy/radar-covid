package p213q.p217b.p301c.p302a.p315m0;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p301c.p302a.C3503c;

/* renamed from: q.b.c.a.m0.g */
public final class C3800g implements C3503c {

    /* renamed from: c */
    public static final Collection<Integer> f9358c = Arrays.asList(new Integer[]{Integer.valueOf(64)});

    /* renamed from: d */
    public static final byte[] f9359d = new byte[16];

    /* renamed from: e */
    public static final byte[] f9360e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* renamed from: a */
    public final C3777a f9361a;

    /* renamed from: b */
    public final byte[] f9362b;

    public C3800g(byte[] bArr) {
        if (f9358c.contains(Integer.valueOf(bArr.length))) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
            this.f9362b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
            this.f9361a = new C3777a(copyOfRange, 16);
            return;
        }
        throw new InvalidKeyException(C1965a.m4753a(C1965a.m4756a("invalid key size: "), bArr.length, " bytes; key must have 64 bytes"));
    }

    /* renamed from: a */
    public byte[] mo9455a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483631) {
            Cipher cipher = (Cipher) C3778a0.f9323f.mo10023a("AES/CTR/NoPadding");
            byte[] a = mo10033a(bArr2, bArr);
            byte[] bArr3 = (byte[]) a.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            cipher.init(1, new SecretKeySpec(this.f9362b, "AES"), new IvParameterSpec(bArr3));
            return C2286e.m5270a(a, cipher.doFinal(bArr));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* renamed from: a */
    public final byte[] mo10033a(byte[]... bArr) {
        byte[] bArr2;
        if (bArr.length == 0) {
            return this.f9361a.mo9478a(f9360e);
        }
        byte[] a = this.f9361a.mo9478a(f9359d);
        int i = 0;
        while (i < bArr.length - 1) {
            a = C2286e.m5316c(C2286e.m5302b(a), this.f9361a.mo9478a(bArr[i] == null ? new byte[0] : bArr[i]));
            i++;
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        if (bArr3.length < 16) {
            bArr2 = C2286e.m5316c(C2286e.m5266a(bArr3), C2286e.m5302b(a));
        } else if (bArr3.length >= a.length) {
            int length = bArr3.length - a.length;
            bArr2 = Arrays.copyOf(bArr3, bArr3.length);
            for (int i2 = 0; i2 < a.length; i2++) {
                int i3 = length + i2;
                bArr2[i3] = (byte) (bArr2[i3] ^ a[i2]);
            }
        } else {
            throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
        }
        return this.f9361a.mo9478a(bArr2);
    }

    /* renamed from: b */
    public byte[] mo9456b(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 16) {
            Cipher cipher = (Cipher) C3778a0.f9323f.mo10023a("AES/CTR/NoPadding");
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            byte[] bArr3 = (byte[]) copyOfRange.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            cipher.init(2, new SecretKeySpec(this.f9362b, "AES"), new IvParameterSpec(bArr3));
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
            byte[] doFinal = cipher.doFinal(copyOfRange2);
            if (copyOfRange2.length == 0 && doFinal == null && C2286e.m5325d()) {
                doFinal = new byte[0];
            }
            if (C2286e.m5301b(copyOfRange, mo10033a(bArr2, doFinal))) {
                return doFinal;
            }
            throw new AEADBadTagException("Integrity check failed.");
        }
        throw new GeneralSecurityException("Ciphertext too short.");
    }
}
