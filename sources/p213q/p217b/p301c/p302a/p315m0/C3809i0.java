package p213q.p217b.p301c.p302a.p315m0;

import java.security.KeyFactory;
import java.security.Signature;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import p213q.p217b.p301c.p302a.C3850u;

/* renamed from: q.b.c.a.m0.i0 */
public final class C3809i0 implements C3850u {

    /* renamed from: a */
    public final RSAPrivateCrtKey f9381a;

    /* renamed from: b */
    public final RSAPublicKey f9382b;

    /* renamed from: c */
    public final String f9383c;

    public C3809i0(RSAPrivateCrtKey rSAPrivateCrtKey, C3790c0 c0Var) {
        C3817m0.m9177a(c0Var);
        C3817m0.m9178b(rSAPrivateCrtKey.getModulus().bitLength());
        this.f9381a = rSAPrivateCrtKey;
        C3817m0.m9177a(c0Var);
        StringBuilder sb = new StringBuilder();
        sb.append(c0Var);
        sb.append("withRSA");
        this.f9383c = sb.toString();
        this.f9382b = (RSAPublicKey) ((KeyFactory) C3778a0.f9328k.mo10023a("RSA")).generatePublic(new RSAPublicKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent()));
    }

    /* renamed from: a */
    public byte[] mo10037a(byte[] bArr) {
        Signature signature = (Signature) C3778a0.f9325h.mo10023a(this.f9383c);
        signature.initSign(this.f9381a);
        signature.update(bArr);
        byte[] sign = signature.sign();
        Signature signature2 = (Signature) C3778a0.f9325h.mo10023a(this.f9383c);
        signature2.initVerify(this.f9382b);
        signature2.update(bArr);
        if (signature2.verify(sign)) {
            return sign;
        }
        throw new RuntimeException("Security bug: RSA signature computation error");
    }
}
