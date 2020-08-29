package p213q.p217b.p301c.p302a.p313k0;

import com.google.crypto.tink.proto.KeyData.KeyMaterialType;
import com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormat;
import com.google.crypto.tink.proto.RsaSsaPkcs1Params;
import com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKey;
import com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey;
import com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey.Builder;
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
import p213q.p217b.p301c.p302a.p315m0.C3809i0;
import p213q.p217b.p301c.p302a.p315m0.C3811j0;
import p213q.p217b.p301c.p302a.p315m0.C3817m0;

/* renamed from: q.b.c.a.k0.g */
public final class C3755g extends C3849t<RsaSsaPkcs1PrivateKey, RsaSsaPkcs1PublicKey> {

    /* renamed from: d */
    public static final byte[] f9306d = "Tink and Wycheproof.".getBytes(Charset.forName("UTF-8"));

    /* renamed from: q.b.c.a.k0.g$a */
    public class C3756a extends C3576b<C3850u, RsaSsaPkcs1PrivateKey> {
        public C3756a(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public Object mo9464a(Object obj) {
            RsaSsaPkcs1PrivateKey rsaSsaPkcs1PrivateKey = (RsaSsaPkcs1PrivateKey) obj;
            KeyFactory keyFactory = (KeyFactory) C3778a0.f9328k.mo10023a("RSA");
            RSAPrivateCrtKeySpec rSAPrivateCrtKeySpec = new RSAPrivateCrtKeySpec(new BigInteger(1, rsaSsaPkcs1PrivateKey.getPublicKey().getN().mo9668g()), new BigInteger(1, rsaSsaPkcs1PrivateKey.getPublicKey().getE().mo9668g()), new BigInteger(1, rsaSsaPkcs1PrivateKey.getD().mo9668g()), new BigInteger(1, rsaSsaPkcs1PrivateKey.getP().mo9668g()), new BigInteger(1, rsaSsaPkcs1PrivateKey.getQ().mo9668g()), new BigInteger(1, rsaSsaPkcs1PrivateKey.getDp().mo9668g()), new BigInteger(1, rsaSsaPkcs1PrivateKey.getDq().mo9668g()), new BigInteger(1, rsaSsaPkcs1PrivateKey.getCrt().mo9668g()));
            C3809i0 i0Var = new C3809i0((RSAPrivateCrtKey) keyFactory.generatePrivate(rSAPrivateCrtKeySpec), C2286e.m5212a(rsaSsaPkcs1PrivateKey.getPublicKey().getParams().getHashType()));
            try {
                new C3811j0((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(new BigInteger(1, rsaSsaPkcs1PrivateKey.getPublicKey().getN().mo9668g()), new BigInteger(1, rsaSsaPkcs1PrivateKey.getPublicKey().getE().mo9668g()))), C2286e.m5212a(rsaSsaPkcs1PrivateKey.getPublicKey().getParams().getHashType())).mo10042a(i0Var.mo10037a(C3755g.f9306d), C3755g.f9306d);
                return i0Var;
            } catch (GeneralSecurityException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Security bug: signing with private key followed by verifying with public key failed");
                sb.append(e);
                throw new RuntimeException(sb.toString());
            }
        }
    }

    /* renamed from: q.b.c.a.k0.g$b */
    public class C3757b extends C3575a<RsaSsaPkcs1KeyFormat, RsaSsaPkcs1PrivateKey> {
        public C3757b(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public Object mo9465a(C3706s0 s0Var) {
            RsaSsaPkcs1KeyFormat rsaSsaPkcs1KeyFormat = (RsaSsaPkcs1KeyFormat) s0Var;
            RsaSsaPkcs1Params params = rsaSsaPkcs1KeyFormat.getParams();
            KeyPairGenerator keyPairGenerator = (KeyPairGenerator) C3778a0.f9327j.mo10023a("RSA");
            keyPairGenerator.initialize(new RSAKeyGenParameterSpec(rsaSsaPkcs1KeyFormat.getModulusSizeInBits(), new BigInteger(1, rsaSsaPkcs1KeyFormat.getPublicExponent().mo9668g())));
            KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
            RSAPublicKey rSAPublicKey = (RSAPublicKey) generateKeyPair.getPublic();
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) generateKeyPair.getPrivate();
            Builder newBuilder = RsaSsaPkcs1PublicKey.newBuilder();
            if (C3755g.this != null) {
                RsaSsaPkcs1PublicKey rsaSsaPkcs1PublicKey = (RsaSsaPkcs1PublicKey) newBuilder.setVersion(0).setParams(params).setE(C3635j.m8388a(rSAPublicKey.getPublicExponent().toByteArray())).setN(C3635j.m8388a(rSAPublicKey.getModulus().toByteArray())).build();
                RsaSsaPkcs1PrivateKey.Builder newBuilder2 = RsaSsaPkcs1PrivateKey.newBuilder();
                if (C3755g.this != null) {
                    return (RsaSsaPkcs1PrivateKey) newBuilder2.setVersion(0).setPublicKey(rsaSsaPkcs1PublicKey).setD(C3635j.m8388a(rSAPrivateCrtKey.getPrivateExponent().toByteArray())).setP(C3635j.m8388a(rSAPrivateCrtKey.getPrimeP().toByteArray())).setQ(C3635j.m8388a(rSAPrivateCrtKey.getPrimeQ().toByteArray())).setDp(C3635j.m8388a(rSAPrivateCrtKey.getPrimeExponentP().toByteArray())).setDq(C3635j.m8388a(rSAPrivateCrtKey.getPrimeExponentQ().toByteArray())).setCrt(C3635j.m8388a(rSAPrivateCrtKey.getCrtCoefficient().toByteArray())).build();
                }
                throw null;
            }
            throw null;
        }

        /* renamed from: b */
        public void mo9467b(C3706s0 s0Var) {
            RsaSsaPkcs1KeyFormat rsaSsaPkcs1KeyFormat = (RsaSsaPkcs1KeyFormat) s0Var;
            C2286e.m5233a(rsaSsaPkcs1KeyFormat.getParams());
            C3817m0.m9178b(rsaSsaPkcs1KeyFormat.getModulusSizeInBits());
        }

        /* renamed from: a */
        public C3706s0 mo9466a(C3635j jVar) {
            return RsaSsaPkcs1KeyFormat.parseFrom(jVar, C3697r.m8878a());
        }
    }

    public C3755g() {
        super(RsaSsaPkcs1PrivateKey.class, RsaSsaPkcs1PublicKey.class, new C3756a(C3850u.class));
    }

    /* renamed from: a */
    public String mo9459a() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey";
    }

    /* renamed from: a */
    public C3706s0 mo9460a(C3635j jVar) {
        return RsaSsaPkcs1PrivateKey.parseFrom(jVar, C3697r.m8878a());
    }

    /* renamed from: b */
    public C3575a<RsaSsaPkcs1KeyFormat, RsaSsaPkcs1PrivateKey> mo9462b() {
        return new C3757b(RsaSsaPkcs1KeyFormat.class);
    }

    /* renamed from: c */
    public KeyMaterialType mo9463c() {
        return KeyMaterialType.ASYMMETRIC_PRIVATE;
    }

    /* renamed from: a */
    public void mo9461a(C3706s0 s0Var) {
        RsaSsaPkcs1PrivateKey rsaSsaPkcs1PrivateKey = (RsaSsaPkcs1PrivateKey) s0Var;
        C3817m0.m9176a(rsaSsaPkcs1PrivateKey.getVersion(), 0);
        C3817m0.m9178b(new BigInteger(1, rsaSsaPkcs1PrivateKey.getPublicKey().getN().mo9668g()).bitLength());
        C2286e.m5233a(rsaSsaPkcs1PrivateKey.getPublicKey().getParams());
    }
}
