package p213q.p217b.p301c.p302a.p303c0;

import com.google.crypto.tink.proto.KeyData.KeyMaterialType;
import com.google.crypto.tink.proto.KmsAeadKey;
import com.google.crypto.tink.proto.KmsAeadKey.Builder;
import com.google.crypto.tink.proto.KmsAeadKeyFormat;
import p213q.p217b.p301c.p302a.C3499a;
import p213q.p217b.p301c.p302a.C3574i;
import p213q.p217b.p301c.p302a.C3574i.C3575a;
import p213q.p217b.p301c.p302a.C3574i.C3576b;
import p213q.p217b.p301c.p302a.C3842n;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3635j;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3697r;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3706s0;
import p213q.p217b.p301c.p302a.p315m0.C3817m0;

/* renamed from: q.b.c.a.c0.h */
public class C3523h extends C3574i<KmsAeadKey> {

    /* renamed from: q.b.c.a.c0.h$a */
    public class C3524a extends C3576b<C3499a, KmsAeadKey> {
        public C3524a(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public Object mo9464a(Object obj) {
            String keyUri = ((KmsAeadKey) obj).getParams().getKeyUri();
            return C3842n.m9197a(keyUri).mo10021a(keyUri);
        }
    }

    /* renamed from: q.b.c.a.c0.h$b */
    public class C3525b extends C3575a<KmsAeadKeyFormat, KmsAeadKey> {
        public C3525b(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public Object mo9465a(C3706s0 s0Var) {
            Builder params = KmsAeadKey.newBuilder().setParams((KmsAeadKeyFormat) s0Var);
            if (C3523h.this != null) {
                return (KmsAeadKey) params.setVersion(0).build();
            }
            throw null;
        }

        /* renamed from: b */
        public void mo9467b(C3706s0 s0Var) {
            KmsAeadKeyFormat kmsAeadKeyFormat = (KmsAeadKeyFormat) s0Var;
        }

        /* renamed from: a */
        public C3706s0 mo9466a(C3635j jVar) {
            return KmsAeadKeyFormat.parseFrom(jVar, C3697r.m8878a());
        }
    }

    public C3523h() {
        super(KmsAeadKey.class, new C3524a(C3499a.class));
    }

    /* renamed from: a */
    public String mo9459a() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    /* renamed from: a */
    public C3706s0 mo9460a(C3635j jVar) {
        return KmsAeadKey.parseFrom(jVar, C3697r.m8878a());
    }

    /* renamed from: b */
    public C3575a<KmsAeadKeyFormat, KmsAeadKey> mo9462b() {
        return new C3525b(KmsAeadKeyFormat.class);
    }

    /* renamed from: c */
    public KeyMaterialType mo9463c() {
        return KeyMaterialType.REMOTE;
    }

    /* renamed from: a */
    public void mo9461a(C3706s0 s0Var) {
        C3817m0.m9176a(((KmsAeadKey) s0Var).getVersion(), 0);
    }
}
