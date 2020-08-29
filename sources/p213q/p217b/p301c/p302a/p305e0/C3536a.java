package p213q.p217b.p301c.p302a.p305e0;

import com.google.crypto.tink.proto.AesSivKey;
import com.google.crypto.tink.proto.AesSivKey.Builder;
import com.google.crypto.tink.proto.AesSivKeyFormat;
import com.google.crypto.tink.proto.KeyData.KeyMaterialType;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p301c.p302a.C3503c;
import p213q.p217b.p301c.p302a.C3574i;
import p213q.p217b.p301c.p302a.C3574i.C3575a;
import p213q.p217b.p301c.p302a.C3574i.C3576b;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3635j;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3697r;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3706s0;
import p213q.p217b.p301c.p302a.p315m0.C3800g;
import p213q.p217b.p301c.p302a.p315m0.C3806h0;
import p213q.p217b.p301c.p302a.p315m0.C3817m0;

/* renamed from: q.b.c.a.e0.a */
public final class C3536a extends C3574i<AesSivKey> {

    /* renamed from: q.b.c.a.e0.a$a */
    public class C3537a extends C3576b<C3503c, AesSivKey> {
        public C3537a(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public Object mo9464a(Object obj) {
            return new C3800g(((AesSivKey) obj).getKeyValue().mo9668g());
        }
    }

    /* renamed from: q.b.c.a.e0.a$b */
    public class C3538b extends C3575a<AesSivKeyFormat, AesSivKey> {
        public C3538b(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public Object mo9465a(C3706s0 s0Var) {
            Builder keyValue = AesSivKey.newBuilder().setKeyValue(C3635j.m8388a(C3806h0.m9148a(((AesSivKeyFormat) s0Var).getKeySize())));
            if (C3536a.this != null) {
                return (AesSivKey) keyValue.setVersion(0).build();
            }
            throw null;
        }

        /* renamed from: b */
        public void mo9467b(C3706s0 s0Var) {
            AesSivKeyFormat aesSivKeyFormat = (AesSivKeyFormat) s0Var;
            if (aesSivKeyFormat.getKeySize() != 64) {
                StringBuilder a = C1965a.m4756a("invalid key size: ");
                a.append(aesSivKeyFormat.getKeySize());
                a.append(". Valid keys must have 64 bytes.");
                throw new InvalidAlgorithmParameterException(a.toString());
            }
        }

        /* renamed from: a */
        public C3706s0 mo9466a(C3635j jVar) {
            return AesSivKeyFormat.parseFrom(jVar, C3697r.m8878a());
        }
    }

    public C3536a() {
        super(AesSivKey.class, new C3537a(C3503c.class));
    }

    /* renamed from: a */
    public String mo9459a() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    /* renamed from: a */
    public C3706s0 mo9460a(C3635j jVar) {
        return AesSivKey.parseFrom(jVar, C3697r.m8878a());
    }

    /* renamed from: b */
    public C3575a<AesSivKeyFormat, AesSivKey> mo9462b() {
        return new C3538b(AesSivKeyFormat.class);
    }

    /* renamed from: c */
    public KeyMaterialType mo9463c() {
        return KeyMaterialType.SYMMETRIC;
    }

    /* renamed from: a */
    public void mo9461a(C3706s0 s0Var) {
        AesSivKey aesSivKey = (AesSivKey) s0Var;
        C3817m0.m9176a(aesSivKey.getVersion(), 0);
        if (aesSivKey.getKeyValue().size() != 64) {
            StringBuilder a = C1965a.m4756a("invalid key size: ");
            a.append(aesSivKey.getKeyValue().size());
            a.append(". Valid keys must have 64 bytes.");
            throw new InvalidKeyException(a.toString());
        }
    }
}
