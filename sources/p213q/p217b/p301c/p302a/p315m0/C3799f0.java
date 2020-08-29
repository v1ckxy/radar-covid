package p213q.p217b.p301c.p302a.p315m0;

import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p301c.p302a.C3843o;

@Immutable
/* renamed from: q.b.c.a.m0.f0 */
public final class C3799f0 implements C3843o {

    /* renamed from: a */
    public final Mac f9354a;

    /* renamed from: b */
    public final int f9355b;

    /* renamed from: c */
    public final String f9356c;

    /* renamed from: d */
    public final Key f9357d;

    public C3799f0(String str, Key key, int i) {
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        } else if (key.getEncoded().length >= 16) {
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1823053428) {
                if (hashCode != 392315118) {
                    if (hashCode == 392317873 && str.equals("HMACSHA512")) {
                        c = 2;
                    }
                } else if (str.equals("HMACSHA256")) {
                    c = 1;
                }
            } else if (str.equals("HMACSHA1")) {
                c = 0;
            }
            String str2 = "tag size too big";
            if (c != 0) {
                if (c != 1) {
                    if (c != 2) {
                        throw new NoSuchAlgorithmException(C1965a.m4751a("unknown Hmac algorithm: ", str));
                    } else if (i > 64) {
                        throw new InvalidAlgorithmParameterException(str2);
                    }
                } else if (i > 32) {
                    throw new InvalidAlgorithmParameterException(str2);
                }
            } else if (i > 20) {
                throw new InvalidAlgorithmParameterException(str2);
            }
            this.f9356c = str;
            this.f9355b = i;
            this.f9357d = key;
            Mac mac = (Mac) C3778a0.f9324g.mo10023a(str);
            this.f9354a = mac;
            mac.init(key);
        } else {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
    }

    /* renamed from: a */
    public void mo9477a(byte[] bArr, byte[] bArr2) {
        if (!C2286e.m5301b(mo9478a(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    /* renamed from: a */
    public byte[] mo9478a(byte[] bArr) {
        Mac mac;
        try {
            mac = (Mac) this.f9354a.clone();
        } catch (CloneNotSupportedException unused) {
            mac = (Mac) C3778a0.f9324g.mo10023a(this.f9356c);
            mac.init(this.f9357d);
        }
        mac.update(bArr);
        byte[] bArr2 = new byte[this.f9355b];
        System.arraycopy(mac.doFinal(), 0, bArr2, 0, this.f9355b);
        return bArr2;
    }
}
