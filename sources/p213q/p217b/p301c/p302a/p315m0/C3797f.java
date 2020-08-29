package p213q.p217b.p301c.p302a.p315m0;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p301c.p302a.C3499a;

/* renamed from: q.b.c.a.m0.f */
public final class C3797f implements C3499a {

    /* renamed from: b */
    public static final ThreadLocal<Cipher> f9352b = new C3798a();

    /* renamed from: a */
    public final SecretKey f9353a;

    /* renamed from: q.b.c.a.m0.f$a */
    public class C3798a extends ThreadLocal<Cipher> {
        public Object initialValue() {
            try {
                return (Cipher) C3778a0.f9323f.mo10023a("AES/GCM/NoPadding");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public C3797f(byte[] bArr) {
        C3817m0.m9175a(bArr.length);
        this.f9353a = new SecretKeySpec(bArr, "AES");
    }

    /* renamed from: a */
    public static AlgorithmParameterSpec m9137a(byte[] bArr, int i, int i2) {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, i, i2);
        } catch (ClassNotFoundException unused) {
            if (C2286e.m5325d()) {
                return new IvParameterSpec(bArr, i, i2);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    /* renamed from: a */
    public byte[] mo9453a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[(bArr.length + 12 + 16)];
            byte[] a = C3806h0.m9148a(12);
            System.arraycopy(a, 0, bArr3, 0, 12);
            ((Cipher) f9352b.get()).init(1, this.f9353a, m9137a(a, 0, a.length));
            if (!(bArr2 == null || bArr2.length == 0)) {
                ((Cipher) f9352b.get()).updateAAD(bArr2);
            }
            int doFinal = ((Cipher) f9352b.get()).doFinal(bArr, 0, bArr.length, bArr3, 12);
            if (doFinal == bArr.length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", new Object[]{Integer.valueOf(16), Integer.valueOf(doFinal - bArr.length)}));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* renamed from: b */
    public byte[] mo9454b(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 28) {
            ((Cipher) f9352b.get()).init(2, this.f9353a, m9137a(bArr, 0, 12));
            if (!(bArr2 == null || bArr2.length == 0)) {
                ((Cipher) f9352b.get()).updateAAD(bArr2);
            }
            return ((Cipher) f9352b.get()).doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
