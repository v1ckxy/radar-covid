package p213q.p217b.p301c.p302a.p315m0;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p213q.p217b.p301c.p302a.C3499a;

/* renamed from: q.b.c.a.m0.d */
public final class C3791d implements C3499a {

    /* renamed from: e */
    public static final ThreadLocal<Cipher> f9341e = new C3792a();

    /* renamed from: f */
    public static final ThreadLocal<Cipher> f9342f = new C3793b();

    /* renamed from: a */
    public final byte[] f9343a;

    /* renamed from: b */
    public final byte[] f9344b;

    /* renamed from: c */
    public final SecretKeySpec f9345c;

    /* renamed from: d */
    public final int f9346d;

    /* renamed from: q.b.c.a.m0.d$a */
    public class C3792a extends ThreadLocal<Cipher> {
        public Object initialValue() {
            try {
                return (Cipher) C3778a0.f9323f.mo10023a("AES/ECB/NOPADDING");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    /* renamed from: q.b.c.a.m0.d$b */
    public class C3793b extends ThreadLocal<Cipher> {
        public Object initialValue() {
            try {
                return (Cipher) C3778a0.f9323f.mo10023a("AES/CTR/NOPADDING");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public C3791d(byte[] bArr, int i) {
        if (i == 12 || i == 16) {
            this.f9346d = i;
            C3817m0.m9175a(bArr.length);
            this.f9345c = new SecretKeySpec(bArr, "AES");
            Cipher cipher = (Cipher) f9341e.get();
            cipher.init(1, this.f9345c);
            byte[] a = m9123a(cipher.doFinal(new byte[16]));
            this.f9343a = a;
            this.f9344b = m9123a(a);
            return;
        }
        throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
    }

    /* renamed from: a */
    public static byte[] m9123a(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        int i2 = 0;
        while (i2 < 15) {
            int i3 = i2 + 1;
            bArr2[i2] = (byte) (((bArr[i2] << 1) ^ ((bArr[i3] & 255) >>> 7)) & 255);
            i2 = i3;
        }
        int i4 = bArr[15] << 1;
        if ((bArr[0] & 128) != 0) {
            i = 135;
        }
        bArr2[15] = (byte) (i4 ^ i);
        return bArr2;
    }

    /* renamed from: c */
    public static byte[] m9124c(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    /* renamed from: a */
    public final byte[] mo10029a(Cipher cipher, int i, byte[] bArr, int i2, int i3) {
        byte[] bArr2;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i;
        if (i3 == 0) {
            return cipher.doFinal(m9124c(bArr3, this.f9343a));
        }
        byte[] doFinal = cipher.doFinal(bArr3);
        int i4 = 0;
        while (i3 - i4 > 16) {
            for (int i5 = 0; i5 < 16; i5++) {
                doFinal[i5] = (byte) (doFinal[i5] ^ bArr[(i2 + i4) + i5]);
            }
            doFinal = cipher.doFinal(doFinal);
            i4 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i4 + i2, i2 + i3);
        if (copyOfRange.length == 16) {
            bArr2 = m9124c(copyOfRange, this.f9343a);
        } else {
            byte[] copyOf = Arrays.copyOf(this.f9344b, 16);
            for (int i6 = 0; i6 < copyOfRange.length; i6++) {
                copyOf[i6] = (byte) (copyOf[i6] ^ copyOfRange[i6]);
            }
            copyOf[copyOfRange.length] = (byte) (copyOf[copyOfRange.length] ^ 128);
            bArr2 = copyOf;
        }
        return cipher.doFinal(m9124c(doFinal, bArr2));
    }

    /* renamed from: a */
    public byte[] mo9453a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        int length = bArr3.length;
        int i = this.f9346d;
        if (length <= (Integer.MAX_VALUE - i) - 16) {
            byte[] bArr4 = new byte[(bArr3.length + i + 16)];
            byte[] a = C3806h0.m9148a(i);
            System.arraycopy(a, 0, bArr4, 0, this.f9346d);
            Cipher cipher = (Cipher) f9341e.get();
            cipher.init(1, this.f9345c);
            byte[] a2 = mo10029a(cipher, 0, a, 0, a.length);
            byte[] bArr5 = bArr2 == null ? new byte[0] : bArr2;
            byte[] a3 = mo10029a(cipher, 1, bArr5, 0, bArr5.length);
            Cipher cipher2 = (Cipher) f9342f.get();
            cipher2.init(1, this.f9345c, new IvParameterSpec(a2));
            cipher2.doFinal(bArr, 0, bArr3.length, bArr4, this.f9346d);
            byte[] a4 = mo10029a(cipher, 2, bArr4, this.f9346d, bArr3.length);
            int length2 = bArr3.length + this.f9346d;
            for (int i2 = 0; i2 < 16; i2++) {
                bArr4[length2 + i2] = (byte) ((a3[i2] ^ a2[i2]) ^ a4[i2]);
            }
            return bArr4;
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* renamed from: b */
    public byte[] mo9454b(byte[] bArr, byte[] bArr2) {
        int length = (bArr.length - this.f9346d) - 16;
        if (length >= 0) {
            Cipher cipher = (Cipher) f9341e.get();
            cipher.init(1, this.f9345c);
            byte[] a = mo10029a(cipher, 0, bArr, 0, this.f9346d);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] bArr3 = bArr2;
            byte[] a2 = mo10029a(cipher, 1, bArr3, 0, bArr3.length);
            byte[] a3 = mo10029a(cipher, 2, bArr, this.f9346d, length);
            int length2 = bArr.length - 16;
            byte b = 0;
            for (int i = 0; i < 16; i++) {
                b = (byte) (b | (((bArr[length2 + i] ^ a2[i]) ^ a[i]) ^ a3[i]));
            }
            if (b == 0) {
                Cipher cipher2 = (Cipher) f9342f.get();
                cipher2.init(1, this.f9345c, new IvParameterSpec(a));
                return cipher2.doFinal(bArr, this.f9346d, length);
            }
            throw new AEADBadTagException("tag mismatch");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
