package p213q.p217b.p301c.p302a.p315m0;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p301c.p302a.C3843o;

/* renamed from: q.b.c.a.m0.a */
public final class C3777a implements C3843o {

    /* renamed from: a */
    public final SecretKey f9317a;

    /* renamed from: b */
    public final int f9318b;

    /* renamed from: c */
    public byte[] f9319c;

    /* renamed from: d */
    public byte[] f9320d;

    public C3777a(byte[] bArr, int i) {
        C3817m0.m9175a(bArr.length);
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, min is 10 bytes");
        } else if (i <= 16) {
            this.f9317a = new SecretKeySpec(bArr, "AES");
            this.f9318b = i;
            Cipher cipher = (Cipher) C3778a0.f9323f.mo10023a("AES/ECB/NoPadding");
            cipher.init(1, this.f9317a);
            byte[] b = C2286e.m5302b(cipher.doFinal(new byte[16]));
            this.f9319c = b;
            this.f9320d = C2286e.m5302b(b);
        } else {
            throw new InvalidAlgorithmParameterException("tag size too large, max is 16 bytes");
        }
    }

    /* renamed from: a */
    public void mo9477a(byte[] bArr, byte[] bArr2) {
        if (!C2286e.m5301b(bArr, mo9478a(bArr2))) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    /* renamed from: a */
    public byte[] mo9478a(byte[] bArr) {
        Cipher cipher = (Cipher) C3778a0.f9323f.mo10023a("AES/ECB/NoPadding");
        boolean z = true;
        cipher.init(1, this.f9317a);
        int max = Math.max(1, (int) Math.ceil(((double) bArr.length) / 16.0d));
        if (max * 16 != bArr.length) {
            z = false;
        }
        byte[] a = z ? C2286e.m5268a(bArr, (max - 1) * 16, this.f9319c, 0, 16) : C2286e.m5316c(C2286e.m5266a(Arrays.copyOfRange(bArr, (max - 1) * 16, bArr.length)), this.f9320d);
        byte[] bArr2 = new byte[16];
        for (int i = 0; i < max - 1; i++) {
            bArr2 = cipher.doFinal(C2286e.m5268a(bArr2, 0, bArr, i * 16, 16));
        }
        byte[] bArr3 = new byte[this.f9318b];
        System.arraycopy(cipher.doFinal(C2286e.m5316c(a, bArr2)), 0, bArr3, 0, this.f9318b);
        return bArr3;
    }
}
