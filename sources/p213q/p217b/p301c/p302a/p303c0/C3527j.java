package p213q.p217b.p301c.p302a.p303c0;

import com.google.crypto.tink.proto.KeyData.KeyMaterialType;
import com.google.crypto.tink.proto.KmsEnvelopeAeadKey;
import com.google.crypto.tink.proto.KmsEnvelopeAeadKey.Builder;
import com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormat;
import p213q.p217b.p301c.p302a.C3499a;
import p213q.p217b.p301c.p302a.C3574i;
import p213q.p217b.p301c.p302a.C3574i.C3575a;
import p213q.p217b.p301c.p302a.C3574i.C3576b;
import p213q.p217b.p301c.p302a.C3842n;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3635j;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3697r;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3706s0;
import p213q.p217b.p301c.p302a.p315m0.C3817m0;

/* renamed from: q.b.c.a.c0.j */
public class C3527j extends C3574i<KmsEnvelopeAeadKey> {

    /* renamed from: q.b.c.a.c0.j$a */
    public class C3528a extends C3576b<C3499a, KmsEnvelopeAeadKey> {
        public C3528a(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public Object mo9464a(Object obj) {
            KmsEnvelopeAeadKey kmsEnvelopeAeadKey = (KmsEnvelopeAeadKey) obj;
            String kekUri = kmsEnvelopeAeadKey.getParams().getKekUri();
            return new C3526i(kmsEnvelopeAeadKey.getParams().getDekTemplate(), C3842n.m9197a(kekUri).mo10021a(kekUri));
        }
    }

    /* renamed from: q.b.c.a.c0.j$b */
    public class C3529b extends C3575a<KmsEnvelopeAeadKeyFormat, KmsEnvelopeAeadKey> {
        public C3529b(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public Object mo9465a(C3706s0 s0Var) {
            Builder params = KmsEnvelopeAeadKey.newBuilder().setParams((KmsEnvelopeAeadKeyFormat) s0Var);
            if (C3527j.this != null) {
                return (KmsEnvelopeAeadKey) params.setVersion(0).build();
            }
            throw null;
        }

        /* renamed from: b */
        public void mo9467b(C3706s0 s0Var) {
            KmsEnvelopeAeadKeyFormat kmsEnvelopeAeadKeyFormat = (KmsEnvelopeAeadKeyFormat) s0Var;
        }

        /* renamed from: a */
        public C3706s0 mo9466a(C3635j jVar) {
            return KmsEnvelopeAeadKeyFormat.parseFrom(jVar, C3697r.m8878a());
        }
    }

    public C3527j() {
        super(KmsEnvelopeAeadKey.class, new C3528a(C3499a.class));
    }

    /* renamed from: a */
    public String mo9459a() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    /* renamed from: a */
    public C3706s0 mo9460a(C3635j jVar) {
        return KmsEnvelopeAeadKey.parseFrom(jVar, C3697r.m8878a());
    }

    /* renamed from: b */
    public C3575a<KmsEnvelopeAeadKeyFormat, KmsEnvelopeAeadKey> mo9462b() {
        return new C3529b(KmsEnvelopeAeadKeyFormat.class);
    }

    /* renamed from: c */
    public KeyMaterialType mo9463c() {
        return KeyMaterialType.REMOTE;
    }

    /* renamed from: a */
    public void mo9461a(C3706s0 s0Var) {
        C3817m0.m9176a(((KmsEnvelopeAeadKey) s0Var).getVersion(), 0);
    }
}
