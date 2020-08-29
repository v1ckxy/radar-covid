package p213q.p217b.p301c.p302a.p313k0;

import com.google.crypto.tink.proto.KeyData.KeyMaterialType;
import com.google.crypto.tink.proto.RsaSsaPssKeyFormat;
import com.google.crypto.tink.proto.RsaSsaPssParams;
import com.google.crypto.tink.proto.RsaSsaPssPrivateKey;
import com.google.crypto.tink.proto.RsaSsaPssPublicKey;
import com.google.crypto.tink.proto.RsaSsaPssPublicKey.Builder;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p301c.p302a.C3574i.C3575a;
import p213q.p217b.p301c.p302a.C3574i.C3576b;
import p213q.p217b.p301c.p302a.C3849t;
import p213q.p217b.p301c.p302a.C3850u;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3635j;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3697r;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3706s0;
import p213q.p217b.p301c.p302a.p315m0.C3778a0;
import p213q.p217b.p301c.p302a.p315m0.C3813k0;
import p213q.p217b.p301c.p302a.p315m0.C3815l0;
import p213q.p217b.p301c.p302a.p315m0.C3817m0;

/* renamed from: q.b.c.a.k0.i */
public final class C3760i extends C3849t<RsaSsaPssPrivateKey, RsaSsaPssPublicKey> {

    /* renamed from: d */
    public static final byte[] f9308d = "Tink and Wycheproof.".getBytes(Charset.forName("UTF-8"));

    /* renamed from: q.b.c.a.k0.i$a */
    public class C3761a extends C3576b<C3850u, RsaSsaPssPrivateKey> {
        public C3761a(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public Object mo9464a(Object obj) {
            RsaSsaPssPrivateKey rsaSsaPssPrivateKey = (RsaSsaPssPrivateKey) obj;
            KeyFactory keyFactory = (KeyFactory) C3778a0.f9328k.mo10023a("RSA");
            RSAPrivateCrtKeySpec rSAPrivateCrtKeySpec = new RSAPrivateCrtKeySpec(new BigInteger(1, rsaSsaPssPrivateKey.getPublicKey().getN().mo9668g()), new BigInteger(1, rsaSsaPssPrivateKey.getPublicKey().getE().mo9668g()), new BigInteger(1, rsaSsaPssPrivateKey.getD().mo9668g()), new BigInteger(1, rsaSsaPssPrivateKey.getP().mo9668g()), new BigInteger(1, rsaSsaPssPrivateKey.getQ().mo9668g()), new BigInteger(1, rsaSsaPssPrivateKey.getDp().mo9668g()), new BigInteger(1, rsaSsaPssPrivateKey.getDq().mo9668g()), new BigInteger(1, rsaSsaPssPrivateKey.getCrt().mo9668g()));
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory.generatePrivate(rSAPrivateCrtKeySpec);
            RsaSsaPssParams params = rsaSsaPssPrivateKey.getPublicKey().getParams();
            C3813k0 k0Var = new C3813k0(rSAPrivateCrtKey, C2286e.m5212a(params.getSigHash()), C2286e.m5212a(params.getMgf1Hash()), params.getSaltLength());
            try {
                new C3815l0((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(new BigInteger(1, rsaSsaPssPrivateKey.getPublicKey().getN().mo9668g()), new BigInteger(1, rsaSsaPssPrivateKey.getPublicKey().getE().mo9668g()))), C2286e.m5212a(params.getSigHash()), C2286e.m5212a(params.getMgf1Hash()), params.getSaltLength()).mo10045a(k0Var.mo10044a(C3760i.f9308d), C3760i.f9308d);
                return k0Var;
            } catch (GeneralSecurityException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Security bug: signing with private key followed by verifying with public key failed");
                sb.append(e);
                throw new RuntimeException(sb.toString());
            }
        }
    }

    /* renamed from: q.b.c.a.k0.i$b */
    public class C3762b extends C3575a<RsaSsaPssKeyFormat, RsaSsaPssPrivateKey> {
        public C3762b(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public Object mo9465a(C3706s0 s0Var) {
            RsaSsaPssKeyFormat rsaSsaPssKeyFormat = (RsaSsaPssKeyFormat) s0Var;
            RsaSsaPssParams params = rsaSsaPssKeyFormat.getParams();
            C3817m0.m9178b(rsaSsaPssKeyFormat.getModulusSizeInBits());
            C3817m0.m9177a(C2286e.m5212a(params.getSigHash()));
            KeyPairGenerator keyPairGenerator = (KeyPairGenerator) C3778a0.f9327j.mo10023a("RSA");
            keyPairGenerator.initialize(new RSAKeyGenParameterSpec(rsaSsaPssKeyFormat.getModulusSizeInBits(), new BigInteger(1, rsaSsaPssKeyFormat.getPublicExponent().mo9668g())));
            KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
            RSAPublicKey rSAPublicKey = (RSAPublicKey) generateKeyPair.getPublic();
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) generateKeyPair.getPrivate();
            Builder newBuilder = RsaSsaPssPublicKey.newBuilder();
            if (C3760i.this != null) {
                RsaSsaPssPublicKey rsaSsaPssPublicKey = (RsaSsaPssPublicKey) newBuilder.setVersion(0).setParams(params).setE(C3635j.m8388a(rSAPublicKey.getPublicExponent().toByteArray())).setN(C3635j.m8388a(rSAPublicKey.getModulus().toByteArray())).build();
                RsaSsaPssPrivateKey.Builder newBuilder2 = RsaSsaPssPrivateKey.newBuilder();
                if (C3760i.this != null) {
                    return (RsaSsaPssPrivateKey) newBuilder2.setVersion(0).setPublicKey(rsaSsaPssPublicKey).setD(C3635j.m8388a(rSAPrivateCrtKey.getPrivateExponent().toByteArray())).setP(C3635j.m8388a(rSAPrivateCrtKey.getPrimeP().toByteArray())).setQ(C3635j.m8388a(rSAPrivateCrtKey.getPrimeQ().toByteArray())).setDp(C3635j.m8388a(rSAPrivateCrtKey.getPrimeExponentP().toByteArray())).setDq(C3635j.m8388a(rSAPrivateCrtKey.getPrimeExponentQ().toByteArray())).setCrt(C3635j.m8388a(rSAPrivateCrtKey.getCrtCoefficient().toByteArray())).build();
                }
                throw null;
            }
            throw null;
        }

        /* renamed from: b */
        public void mo9467b(C3706s0 s0Var) {
            RsaSsaPssKeyFormat rsaSsaPssKeyFormat = (RsaSsaPssKeyFormat) s0Var;
            C2286e.m5234a(rsaSsaPssKeyFormat.getParams());
            C3817m0.m9178b(rsaSsaPssKeyFormat.getModulusSizeInBits());
        }

        /* renamed from: a */
        public C3706s0 mo9466a(C3635j jVar) {
            return RsaSsaPssKeyFormat.parseFrom(jVar, C3697r.m8878a());
        }
    }

    public C3760i() {
        super(RsaSsaPssPrivateKey.class, RsaSsaPssPublicKey.class, new C3761a(C3850u.class));
    }

    /* renamed from: a */
    public String mo9459a() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey";
    }

    /* renamed from: a */
    public C3706s0 mo9460a(C3635j jVar) {
        return RsaSsaPssPrivateKey.parseFrom(jVar, C3697r.m8878a());
    }

    /* renamed from: b */
    public C3575a<RsaSsaPssKeyFormat, RsaSsaPssPrivateKey> mo9462b() {
        return new C3762b(RsaSsaPssKeyFormat.class);
    }

    /* renamed from: c */
    public KeyMaterialType mo9463c() {
        return KeyMaterialType.ASYMMETRIC_PRIVATE;
    }

    /* renamed from: a */
    public void mo9461a(C3706s0 s0Var) {
        RsaSsaPssPrivateKey rsaSsaPssPrivateKey = (RsaSsaPssPrivateKey) s0Var;
        C3817m0.m9176a(rsaSsaPssPrivateKey.getVersion(), 0);
        C3817m0.m9178b(new BigInteger(1, rsaSsaPssPrivateKey.getPublicKey().getN().mo9668g()).bitLength());
        C2286e.m5234a(rsaSsaPssPrivateKey.getPublicKey().getParams());
    }
}
