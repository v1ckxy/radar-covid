package p213q.p217b.p301c.p302a.p315m0;

import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* renamed from: q.b.c.a.m0.b0 */
public interface C3780b0<T> {

    /* renamed from: q.b.c.a.m0.b0$a */
    public static class C3781a implements C3780b0<Cipher> {
        /* renamed from: a */
        public Object mo10024a(String str, Provider provider) {
            return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
        }
    }

    /* renamed from: q.b.c.a.m0.b0$b */
    public static class C3782b implements C3780b0<KeyAgreement> {
        /* renamed from: a */
        public Object mo10024a(String str, Provider provider) {
            return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
        }
    }

    /* renamed from: q.b.c.a.m0.b0$c */
    public static class C3783c implements C3780b0<KeyFactory> {
        /* renamed from: a */
        public Object mo10024a(String str, Provider provider) {
            return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
        }
    }

    /* renamed from: q.b.c.a.m0.b0$d */
    public static class C3784d implements C3780b0<KeyPairGenerator> {
        /* renamed from: a */
        public Object mo10024a(String str, Provider provider) {
            return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
        }
    }

    /* renamed from: q.b.c.a.m0.b0$e */
    public static class C3785e implements C3780b0<Mac> {
        /* renamed from: a */
        public Object mo10024a(String str, Provider provider) {
            return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
        }
    }

    /* renamed from: q.b.c.a.m0.b0$f */
    public static class C3786f implements C3780b0<MessageDigest> {
        /* renamed from: a */
        public Object mo10024a(String str, Provider provider) {
            return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
        }
    }

    /* renamed from: q.b.c.a.m0.b0$g */
    public static class C3787g implements C3780b0<Signature> {
        /* renamed from: a */
        public Object mo10024a(String str, Provider provider) {
            return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
    }

    /* renamed from: a */
    T mo10024a(String str, Provider provider);
}
