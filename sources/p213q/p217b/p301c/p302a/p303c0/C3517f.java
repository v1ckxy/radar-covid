package p213q.p217b.p301c.p302a.p303c0;

import com.google.crypto.tink.proto.AesGcmKey;
import com.google.crypto.tink.proto.AesGcmKey.Builder;
import com.google.crypto.tink.proto.AesGcmKeyFormat;
import com.google.crypto.tink.proto.KeyData.KeyMaterialType;
import p213q.p217b.p301c.p302a.C3499a;
import p213q.p217b.p301c.p302a.C3574i;
import p213q.p217b.p301c.p302a.C3574i.C3575a;
import p213q.p217b.p301c.p302a.C3574i.C3576b;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3635j;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3697r;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3706s0;
import p213q.p217b.p301c.p302a.p315m0.C3797f;
import p213q.p217b.p301c.p302a.p315m0.C3806h0;
import p213q.p217b.p301c.p302a.p315m0.C3817m0;

/* renamed from: q.b.c.a.c0.f */
public final class C3517f extends C3574i<AesGcmKey> {

    /* renamed from: q.b.c.a.c0.f$a */
    public class C3518a extends C3576b<C3499a, AesGcmKey> {
        public C3518a(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public Object mo9464a(Object obj) {
            return new C3797f(((AesGcmKey) obj).getKeyValue().mo9668g());
        }
    }

    /* renamed from: q.b.c.a.c0.f$b */
    public class C3519b extends C3575a<AesGcmKeyFormat, AesGcmKey> {
        public C3519b(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public Object mo9465a(C3706s0 s0Var) {
            Builder keyValue = AesGcmKey.newBuilder().setKeyValue(C3635j.m8388a(C3806h0.m9148a(((AesGcmKeyFormat) s0Var).getKeySize())));
            if (C3517f.this != null) {
                return (AesGcmKey) keyValue.setVersion(0).build();
            }
            throw null;
        }

        /* renamed from: b */
        public void mo9467b(C3706s0 s0Var) {
            C3817m0.m9175a(((AesGcmKeyFormat) s0Var).getKeySize());
        }

        /* renamed from: a */
        public C3706s0 mo9466a(C3635j jVar) {
            return AesGcmKeyFormat.parseFrom(jVar, C3697r.m8878a());
        }
    }

    public C3517f() {
        super(AesGcmKey.class, new C3518a(C3499a.class));
    }

    /* renamed from: a */
    public String mo9459a() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    /* renamed from: a */
    public C3706s0 mo9460a(C3635j jVar) {
        return AesGcmKey.parseFrom(jVar, C3697r.m8878a());
    }

    /* renamed from: b */
    public C3575a<AesGcmKeyFormat, AesGcmKey> mo9462b() {
        return new C3519b(AesGcmKeyFormat.class);
    }

    /* renamed from: c */
    public KeyMaterialType mo9463c() {
        return KeyMaterialType.SYMMETRIC;
    }

    /* renamed from: a */
    public void mo9461a(C3706s0 s0Var) {
        AesGcmKey aesGcmKey = (AesGcmKey) s0Var;
        C3817m0.m9176a(aesGcmKey.getVersion(), 0);
        C3817m0.m9175a(aesGcmKey.getKeyValue().size());
    }
}
