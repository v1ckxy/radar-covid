package p213q.p217b.p301c.p302a.p306f0;

import com.google.crypto.tink.proto.EciesAeadHkdfParams;
import com.google.crypto.tink.proto.EciesAeadHkdfPublicKey;
import com.google.crypto.tink.proto.EciesHkdfKemParams;
import com.google.crypto.tink.proto.KeyData.KeyMaterialType;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p301c.p302a.C3535e;
import p213q.p217b.p301c.p302a.C3574i;
import p213q.p217b.p301c.p302a.C3574i.C3576b;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3635j;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3697r;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3706s0;
import p213q.p217b.p301c.p302a.p315m0.C3817m0;
import p213q.p217b.p301c.p302a.p315m0.C3827r;

/* renamed from: q.b.c.a.f0.b */
public class C3546b extends C3574i<EciesAeadHkdfPublicKey> {

    /* renamed from: q.b.c.a.f0.b$a */
    public class C3547a extends C3576b<C3535e, EciesAeadHkdfPublicKey> {
        public C3547a(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public Object mo9464a(Object obj) {
            EciesAeadHkdfPublicKey eciesAeadHkdfPublicKey = (EciesAeadHkdfPublicKey) obj;
            EciesAeadHkdfParams params = eciesAeadHkdfPublicKey.getParams();
            EciesHkdfKemParams kemParams = params.getKemParams();
            C3827r rVar = new C3827r(C2286e.m5199a(C2286e.m5213a(kemParams.getCurveType()), eciesAeadHkdfPublicKey.getX().mo9668g(), eciesAeadHkdfPublicKey.getY().mo9668g()), kemParams.getHkdfSalt().mo9668g(), C2286e.m5282b(kemParams.getHkdfHashType()), C2286e.m5215a(params.getEcPointFormat()), new C3553f(params.getDemParams().getAeadDem()));
            return rVar;
        }
    }

    public C3546b() {
        super(EciesAeadHkdfPublicKey.class, new C3547a(C3535e.class));
    }

    /* renamed from: a */
    public String mo9459a() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    /* renamed from: a */
    public C3706s0 mo9460a(C3635j jVar) {
        return EciesAeadHkdfPublicKey.parseFrom(jVar, C3697r.m8878a());
    }

    /* renamed from: c */
    public KeyMaterialType mo9463c() {
        return KeyMaterialType.ASYMMETRIC_PUBLIC;
    }

    /* renamed from: a */
    public void mo9461a(C3706s0 s0Var) {
        EciesAeadHkdfPublicKey eciesAeadHkdfPublicKey = (EciesAeadHkdfPublicKey) s0Var;
        C3817m0.m9176a(eciesAeadHkdfPublicKey.getVersion(), 0);
        C2286e.m5232a(eciesAeadHkdfPublicKey.getParams());
    }
}
