package p213q.p217b.p301c.p302a.p313k0;

import com.google.crypto.tink.proto.KeyData.KeyMaterialType;
import com.google.crypto.tink.proto.RsaSsaPssParams;
import com.google.crypto.tink.proto.RsaSsaPssPublicKey;
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
import p213q.p217b.p301c.p302a.p315m0.C3815l0;
import p213q.p217b.p301c.p302a.p315m0.C3817m0;

/* renamed from: q.b.c.a.k0.j */
public class C3763j extends C3574i<RsaSsaPssPublicKey> {

    /* renamed from: q.b.c.a.k0.j$a */
    public class C3764a extends C3576b<C3851v, RsaSsaPssPublicKey> {
        public C3764a(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public Object mo9464a(Object obj) {
            RsaSsaPssPublicKey rsaSsaPssPublicKey = (RsaSsaPssPublicKey) obj;
            RSAPublicKey rSAPublicKey = (RSAPublicKey) ((KeyFactory) C3778a0.f9328k.mo10023a("RSA")).generatePublic(new RSAPublicKeySpec(new BigInteger(1, rsaSsaPssPublicKey.getN().mo9668g()), new BigInteger(1, rsaSsaPssPublicKey.getE().mo9668g())));
            RsaSsaPssParams params = rsaSsaPssPublicKey.getParams();
            return new C3815l0(rSAPublicKey, C2286e.m5212a(params.getSigHash()), C2286e.m5212a(params.getMgf1Hash()), params.getSaltLength());
        }
    }

    public C3763j() {
        super(RsaSsaPssPublicKey.class, new C3764a(C3851v.class));
    }

    /* renamed from: a */
    public String mo9459a() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey";
    }

    /* renamed from: a */
    public C3706s0 mo9460a(C3635j jVar) {
        return RsaSsaPssPublicKey.parseFrom(jVar, C3697r.m8878a());
    }

    /* renamed from: c */
    public KeyMaterialType mo9463c() {
        return KeyMaterialType.ASYMMETRIC_PUBLIC;
    }

    /* renamed from: a */
    public void mo9461a(C3706s0 s0Var) {
        RsaSsaPssPublicKey rsaSsaPssPublicKey = (RsaSsaPssPublicKey) s0Var;
        C3817m0.m9176a(rsaSsaPssPublicKey.getVersion(), 0);
        C3817m0.m9178b(new BigInteger(1, rsaSsaPssPublicKey.getN().mo9668g()).bitLength());
        C2286e.m5234a(rsaSsaPssPublicKey.getParams());
    }
}
