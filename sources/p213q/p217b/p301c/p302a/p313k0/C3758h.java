package p213q.p217b.p301c.p302a.p313k0;

import com.google.crypto.tink.proto.KeyData.KeyMaterialType;
import com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p301c.p302a.C3574i;
import p213q.p217b.p301c.p302a.C3574i.C3576b;
import p213q.p217b.p301c.p302a.C3851v;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3635j;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3697r;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3706s0;
import p213q.p217b.p301c.p302a.p315m0.C3778a0;
import p213q.p217b.p301c.p302a.p315m0.C3811j0;
import p213q.p217b.p301c.p302a.p315m0.C3817m0;

/* renamed from: q.b.c.a.k0.h */
public class C3758h extends C3574i<RsaSsaPkcs1PublicKey> {

    /* renamed from: q.b.c.a.k0.h$a */
    public class C3759a extends C3576b<C3851v, RsaSsaPkcs1PublicKey> {
        public C3759a(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public Object mo9464a(Object obj) {
            RsaSsaPkcs1PublicKey rsaSsaPkcs1PublicKey = (RsaSsaPkcs1PublicKey) obj;
            return new C3811j0((RSAPublicKey) ((KeyFactory) C3778a0.f9328k.mo10023a("RSA")).generatePublic(new RSAPublicKeySpec(new BigInteger(1, rsaSsaPkcs1PublicKey.getN().mo9668g()), new BigInteger(1, rsaSsaPkcs1PublicKey.getE().mo9668g()))), C2286e.m5212a(rsaSsaPkcs1PublicKey.getParams().getHashType()));
        }
    }

    public C3758h() {
        super(RsaSsaPkcs1PublicKey.class, new C3759a(C3851v.class));
    }

    /* renamed from: a */
    public String mo9459a() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey";
    }

    /* renamed from: a */
    public C3706s0 mo9460a(C3635j jVar) {
        return RsaSsaPkcs1PublicKey.parseFrom(jVar, C3697r.m8878a());
    }

    /* renamed from: c */
    public KeyMaterialType mo9463c() {
        return KeyMaterialType.ASYMMETRIC_PUBLIC;
    }

    /* renamed from: a */
    public void mo9461a(C3706s0 s0Var) {
        RsaSsaPkcs1PublicKey rsaSsaPkcs1PublicKey = (RsaSsaPkcs1PublicKey) s0Var;
        C3817m0.m9176a(rsaSsaPkcs1PublicKey.getVersion(), 0);
        C3817m0.m9178b(new BigInteger(1, rsaSsaPkcs1PublicKey.getN().mo9668g()).bitLength());
        C2286e.m5233a(rsaSsaPkcs1PublicKey.getParams());
    }
}
