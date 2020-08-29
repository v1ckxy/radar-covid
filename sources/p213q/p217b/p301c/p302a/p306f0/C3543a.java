package p213q.p217b.p301c.p302a.p306f0;

import com.google.crypto.tink.proto.EciesAeadHkdfKeyFormat;
import com.google.crypto.tink.proto.EciesAeadHkdfParams;
import com.google.crypto.tink.proto.EciesAeadHkdfPrivateKey;
import com.google.crypto.tink.proto.EciesAeadHkdfPublicKey;
import com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.Builder;
import com.google.crypto.tink.proto.EciesHkdfKemParams;
import com.google.crypto.tink.proto.KeyData.KeyMaterialType;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p301c.p302a.C3533d;
import p213q.p217b.p301c.p302a.C3574i.C3575a;
import p213q.p217b.p301c.p302a.C3574i.C3576b;
import p213q.p217b.p301c.p302a.C3849t;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3635j;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3697r;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3706s0;
import p213q.p217b.p301c.p302a.p315m0.C3817m0;
import p213q.p217b.p301c.p302a.p315m0.C3826q;

/* renamed from: q.b.c.a.f0.a */
public final class C3543a extends C3849t<EciesAeadHkdfPrivateKey, EciesAeadHkdfPublicKey> {

    /* renamed from: q.b.c.a.f0.a$a */
    public class C3544a extends C3576b<C3533d, EciesAeadHkdfPrivateKey> {
        public C3544a(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public Object mo9464a(Object obj) {
            EciesAeadHkdfPrivateKey eciesAeadHkdfPrivateKey = (EciesAeadHkdfPrivateKey) obj;
            EciesAeadHkdfParams params = eciesAeadHkdfPrivateKey.getPublicKey().getParams();
            EciesHkdfKemParams kemParams = params.getKemParams();
            C3826q qVar = new C3826q(C2286e.m5198a(C2286e.m5213a(kemParams.getCurveType()), eciesAeadHkdfPrivateKey.getKeyValue().mo9668g()), kemParams.getHkdfSalt().mo9668g(), C2286e.m5282b(kemParams.getHkdfHashType()), C2286e.m5215a(params.getEcPointFormat()), new C3553f(params.getDemParams().getAeadDem()));
            return qVar;
        }
    }

    /* renamed from: q.b.c.a.f0.a$b */
    public class C3545b extends C3575a<EciesAeadHkdfKeyFormat, EciesAeadHkdfPrivateKey> {
        public C3545b(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public Object mo9465a(C3706s0 s0Var) {
            EciesAeadHkdfKeyFormat eciesAeadHkdfKeyFormat = (EciesAeadHkdfKeyFormat) s0Var;
            KeyPair a = C2286e.m5197a(C2286e.m5213a(eciesAeadHkdfKeyFormat.getParams().getKemParams().getCurveType()));
            ECPublicKey eCPublicKey = (ECPublicKey) a.getPublic();
            ECPrivateKey eCPrivateKey = (ECPrivateKey) a.getPrivate();
            ECPoint w = eCPublicKey.getW();
            Builder newBuilder = EciesAeadHkdfPublicKey.newBuilder();
            if (C3543a.this != null) {
                EciesAeadHkdfPublicKey eciesAeadHkdfPublicKey = (EciesAeadHkdfPublicKey) newBuilder.setVersion(0).setParams(eciesAeadHkdfKeyFormat.getParams()).setX(C3635j.m8388a(w.getAffineX().toByteArray())).setY(C3635j.m8388a(w.getAffineY().toByteArray())).build();
                EciesAeadHkdfPrivateKey.Builder newBuilder2 = EciesAeadHkdfPrivateKey.newBuilder();
                if (C3543a.this != null) {
                    return (EciesAeadHkdfPrivateKey) newBuilder2.setVersion(0).setPublicKey(eciesAeadHkdfPublicKey).setKeyValue(C3635j.m8388a(eCPrivateKey.getS().toByteArray())).build();
                }
                throw null;
            }
            throw null;
        }

        /* renamed from: b */
        public void mo9467b(C3706s0 s0Var) {
            C2286e.m5232a(((EciesAeadHkdfKeyFormat) s0Var).getParams());
        }

        /* renamed from: a */
        public C3706s0 mo9466a(C3635j jVar) {
            return EciesAeadHkdfKeyFormat.parseFrom(jVar, C3697r.m8878a());
        }
    }

    public C3543a() {
        super(EciesAeadHkdfPrivateKey.class, EciesAeadHkdfPublicKey.class, new C3544a(C3533d.class));
    }

    /* renamed from: a */
    public String mo9459a() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    /* renamed from: a */
    public C3706s0 mo9460a(C3635j jVar) {
        return EciesAeadHkdfPrivateKey.parseFrom(jVar, C3697r.m8878a());
    }

    /* renamed from: b */
    public C3575a<EciesAeadHkdfKeyFormat, EciesAeadHkdfPrivateKey> mo9462b() {
        return new C3545b(EciesAeadHkdfKeyFormat.class);
    }

    /* renamed from: c */
    public KeyMaterialType mo9463c() {
        return KeyMaterialType.ASYMMETRIC_PRIVATE;
    }

    /* renamed from: a */
    public void mo9461a(C3706s0 s0Var) {
        EciesAeadHkdfPrivateKey eciesAeadHkdfPrivateKey = (EciesAeadHkdfPrivateKey) s0Var;
        if (!(eciesAeadHkdfPrivateKey.getKeyValue().size() == 0)) {
            C3817m0.m9176a(eciesAeadHkdfPrivateKey.getVersion(), 0);
            C2286e.m5232a(eciesAeadHkdfPrivateKey.getPublicKey().getParams());
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }
}
