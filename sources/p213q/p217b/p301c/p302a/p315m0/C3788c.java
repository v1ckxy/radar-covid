package p213q.p217b.p301c.p302a.p315m0;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.c.a.m0.c */
public final class C3788c implements C3796e0 {

    /* renamed from: d */
    public static final ThreadLocal<Cipher> f9332d = new C3789a();

    /* renamed from: a */
    public final SecretKeySpec f9333a;

    /* renamed from: b */
    public final int f9334b;

    /* renamed from: c */
    public final int f9335c;

    /* renamed from: q.b.c.a.m0.c$a */
    public class C3789a extends ThreadLocal<Cipher> {
        public Object initialValue() {
            try {
                return (Cipher) C3778a0.f9323f.mo10023a("AES/CTR/NoPadding");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public C3788c(byte[] bArr, int i) {
        C3817m0.m9175a(bArr.length);
        this.f9333a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f9332d.get()).getBlockSize();
        this.f9335c = blockSize;
        if (i < 12 || i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f9334b = i;
    }

    /* renamed from: a */
    public final void mo10025a(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3, boolean z) {
        Cipher cipher = (Cipher) f9332d.get();
        byte[] bArr4 = new byte[this.f9335c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f9334b);
        cipher.init(z ? 1 : 2, this.f9333a, new IvParameterSpec(bArr4));
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) != i2) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }

    /* renamed from: a */
    public byte[] mo10026a(byte[] bArr) {
        int length = bArr.length;
        int i = this.f9334b;
        if (length <= Integer.MAX_VALUE - i) {
            byte[] bArr2 = new byte[(bArr.length + i)];
            byte[] a = C3806h0.m9148a(i);
            System.arraycopy(a, 0, bArr2, 0, this.f9334b);
            mo10025a(bArr, 0, bArr.length, bArr2, this.f9334b, a, true);
            return bArr2;
        }
        StringBuilder a2 = C1965a.m4756a("plaintext length can not exceed ");
        a2.append(Integer.MAX_VALUE - this.f9334b);
        throw new GeneralSecurityException(a2.toString());
    }

    /* renamed from: b */
    public byte[] mo10027b(byte[] bArr) {
        int length = bArr.length;
        int i = this.f9334b;
        if (length >= i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            int length2 = bArr.length;
            int i2 = this.f9334b;
            byte[] bArr3 = new byte[(length2 - i2)];
            mo10025a(bArr, i2, bArr.length - i2, bArr3, 0, bArr2, false);
            return bArr3;
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
