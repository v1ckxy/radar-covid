package p213q.p217b.p301c.p302a.p313k0;

import com.google.crypto.tink.proto.EcdsaPublicKey;
import com.google.crypto.tink.proto.KeyData.KeyMaterialType;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p301c.p302a.C3574i;
import p213q.p217b.p301c.p302a.C3574i.C3576b;
import p213q.p217b.p301c.p302a.C3851v;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3635j;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3697r;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3706s0;
import p213q.p217b.p301c.p302a.p315m0.C3817m0;
import p213q.p217b.p301c.p302a.p315m0.C3820o;

/* renamed from: q.b.c.a.k0.b */
public class C3744b extends C3574i<EcdsaPublicKey> {

    /* renamed from: q.b.c.a.k0.b$a */
    public class C3745a extends C3576b<C3851v, EcdsaPublicKey> {
        public C3745a(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public Object mo9464a(Object obj) {
            EcdsaPublicKey ecdsaPublicKey = (EcdsaPublicKey) obj;
            return new C3820o(C2286e.m5199a(C2286e.m5293b(ecdsaPublicKey.getParams().getCurve()), ecdsaPublicKey.getX().mo9668g(), ecdsaPublicKey.getY().mo9668g()), C2286e.m5212a(ecdsaPublicKey.getParams().getHashType()), C2286e.m5214a(ecdsaPublicKey.getParams().getEncoding()));
        }
    }

    public C3744b() {
        super(EcdsaPublicKey.class, new C3745a(C3851v.class));
    }

    /* renamed from: a */
    public String mo9459a() {
        return "type.googleapis.com/google.crypto.tink.EcdsaPublicKey";
    }

    /* renamed from: a */
    public C3706s0 mo9460a(C3635j jVar) {
        return EcdsaPublicKey.parseFrom(jVar, C3697r.m8878a());
    }

    /* renamed from: c */
    public KeyMaterialType mo9463c() {
        return KeyMaterialType.ASYMMETRIC_PUBLIC;
    }

    /* renamed from: a */
    public void mo9461a(C3706s0 s0Var) {
        EcdsaPublicKey ecdsaPublicKey = (EcdsaPublicKey) s0Var;
        C3817m0.m9176a(ecdsaPublicKey.getVersion(), 0);
        C2286e.m5231a(ecdsaPublicKey.getParams());
    }
}
