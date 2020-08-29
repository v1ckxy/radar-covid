package p213q.p217b.p301c.p302a.p313k0;

import com.google.crypto.tink.proto.EcdsaKeyFormat;
import com.google.crypto.tink.proto.EcdsaParams;
import com.google.crypto.tink.proto.EcdsaPrivateKey;
import com.google.crypto.tink.proto.EcdsaPublicKey;
import com.google.crypto.tink.proto.EcdsaPublicKey.Builder;
import com.google.crypto.tink.proto.KeyData.KeyMaterialType;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p301c.p302a.C3574i.C3575a;
import p213q.p217b.p301c.p302a.C3574i.C3576b;
import p213q.p217b.p301c.p302a.C3849t;
import p213q.p217b.p301c.p302a.C3850u;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3635j;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3697r;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3706s0;
import p213q.p217b.p301c.p302a.p315m0.C3817m0;
import p213q.p217b.p301c.p302a.p315m0.C3818n;

/* renamed from: q.b.c.a.k0.a */
public final class C3741a extends C3849t<EcdsaPrivateKey, EcdsaPublicKey> {

    /* renamed from: q.b.c.a.k0.a$a */
    public class C3742a extends C3576b<C3850u, EcdsaPrivateKey> {
        public C3742a(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public Object mo9464a(Object obj) {
            EcdsaPrivateKey ecdsaPrivateKey = (EcdsaPrivateKey) obj;
            return new C3818n(C2286e.m5198a(C2286e.m5293b(ecdsaPrivateKey.getPublicKey().getParams().getCurve()), ecdsaPrivateKey.getKeyValue().mo9668g()), C2286e.m5212a(ecdsaPrivateKey.getPublicKey().getParams().getHashType()), C2286e.m5214a(ecdsaPrivateKey.getPublicKey().getParams().getEncoding()));
        }
    }

    /* renamed from: q.b.c.a.k0.a$b */
    public class C3743b extends C3575a<EcdsaKeyFormat, EcdsaPrivateKey> {
        public C3743b(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public Object mo9465a(C3706s0 s0Var) {
            EcdsaParams params = ((EcdsaKeyFormat) s0Var).getParams();
            KeyPair a = C2286e.m5197a(C2286e.m5293b(params.getCurve()));
            ECPublicKey eCPublicKey = (ECPublicKey) a.getPublic();
            ECPrivateKey eCPrivateKey = (ECPrivateKey) a.getPrivate();
            ECPoint w = eCPublicKey.getW();
            Builder newBuilder = EcdsaPublicKey.newBuilder();
            if (C3741a.this != null) {
                EcdsaPublicKey ecdsaPublicKey = (EcdsaPublicKey) newBuilder.setVersion(0).setParams(params).setX(C3635j.m8388a(w.getAffineX().toByteArray())).setY(C3635j.m8388a(w.getAffineY().toByteArray())).build();
                EcdsaPrivateKey.Builder newBuilder2 = EcdsaPrivateKey.newBuilder();
                if (C3741a.this != null) {
                    return (EcdsaPrivateKey) newBuilder2.setVersion(0).setPublicKey(ecdsaPublicKey).setKeyValue(C3635j.m8388a(eCPrivateKey.getS().toByteArray())).build();
                }
                throw null;
            }
            throw null;
        }

        /* renamed from: b */
        public void mo9467b(C3706s0 s0Var) {
            C2286e.m5231a(((EcdsaKeyFormat) s0Var).getParams());
        }

        /* renamed from: a */
        public C3706s0 mo9466a(C3635j jVar) {
            return EcdsaKeyFormat.parseFrom(jVar, C3697r.m8878a());
        }
    }

    public C3741a() {
        super(EcdsaPrivateKey.class, EcdsaPublicKey.class, new C3742a(C3850u.class));
    }

    /* renamed from: a */
    public String mo9459a() {
        return "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey";
    }

    /* renamed from: a */
    public C3706s0 mo9460a(C3635j jVar) {
        return EcdsaPrivateKey.parseFrom(jVar, C3697r.m8878a());
    }

    /* renamed from: b */
    public C3575a<EcdsaKeyFormat, EcdsaPrivateKey> mo9462b() {
        return new C3743b(EcdsaKeyFormat.class);
    }

    /* renamed from: c */
    public KeyMaterialType mo9463c() {
        return KeyMaterialType.ASYMMETRIC_PRIVATE;
    }

    /* renamed from: a */
    public void mo9461a(C3706s0 s0Var) {
        EcdsaPrivateKey ecdsaPrivateKey = (EcdsaPrivateKey) s0Var;
        C3817m0.m9176a(ecdsaPrivateKey.getVersion(), 0);
        C2286e.m5231a(ecdsaPrivateKey.getPublicKey().getParams());
    }
}
