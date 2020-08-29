package p213q.p217b.p301c.p302a.p303c0;

import com.google.crypto.tink.proto.AesCtrHmacAeadKey;
import com.google.crypto.tink.proto.AesCtrHmacAeadKey.Builder;
import com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat;
import com.google.crypto.tink.proto.AesCtrKey;
import com.google.crypto.tink.proto.HmacKey;
import com.google.crypto.tink.proto.KeyData.KeyMaterialType;
import p213q.p217b.p301c.p302a.C3499a;
import p213q.p217b.p301c.p302a.C3574i;
import p213q.p217b.p301c.p302a.C3574i.C3575a;
import p213q.p217b.p301c.p302a.C3574i.C3576b;
import p213q.p217b.p301c.p302a.C3843o;
import p213q.p217b.p301c.p302a.p309h0.C3567b;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3635j;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3697r;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3706s0;
import p213q.p217b.p301c.p302a.p315m0.C3796e0;
import p213q.p217b.p301c.p302a.p315m0.C3817m0;
import p213q.p217b.p301c.p302a.p315m0.C3841z;

/* renamed from: q.b.c.a.c0.c */
public final class C3508c extends C3574i<AesCtrHmacAeadKey> {

    /* renamed from: q.b.c.a.c0.c$a */
    public class C3509a extends C3576b<C3499a, AesCtrHmacAeadKey> {
        public C3509a(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public Object mo9464a(Object obj) {
            AesCtrHmacAeadKey aesCtrHmacAeadKey = (AesCtrHmacAeadKey) obj;
            return new C3841z((C3796e0) new C3511d().mo9479a(aesCtrHmacAeadKey.getAesCtrKey(), C3796e0.class), (C3843o) new C3567b().mo9479a(aesCtrHmacAeadKey.getHmacKey(), C3843o.class), aesCtrHmacAeadKey.getHmacKey().getParams().getTagSize());
        }
    }

    /* renamed from: q.b.c.a.c0.c$b */
    public class C3510b extends C3575a<AesCtrHmacAeadKeyFormat, AesCtrHmacAeadKey> {
        public C3510b(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public Object mo9465a(C3706s0 s0Var) {
            AesCtrHmacAeadKeyFormat aesCtrHmacAeadKeyFormat = (AesCtrHmacAeadKeyFormat) s0Var;
            AesCtrKey aesCtrKey = (AesCtrKey) new C3511d().mo9462b().mo9465a(aesCtrHmacAeadKeyFormat.getAesCtrKeyFormat());
            Builder hmacKey = AesCtrHmacAeadKey.newBuilder().setAesCtrKey(aesCtrKey).setHmacKey((HmacKey) new C3567b().mo9462b().mo9465a(aesCtrHmacAeadKeyFormat.getHmacKeyFormat()));
            if (C3508c.this != null) {
                return (AesCtrHmacAeadKey) hmacKey.setVersion(0).build();
            }
            throw null;
        }

        /* renamed from: b */
        public void mo9467b(C3706s0 s0Var) {
            AesCtrHmacAeadKeyFormat aesCtrHmacAeadKeyFormat = (AesCtrHmacAeadKeyFormat) s0Var;
            new C3511d().mo9462b().mo9467b(aesCtrHmacAeadKeyFormat.getAesCtrKeyFormat());
            new C3567b().mo9462b().mo9467b(aesCtrHmacAeadKeyFormat.getHmacKeyFormat());
            C3817m0.m9175a(aesCtrHmacAeadKeyFormat.getAesCtrKeyFormat().getKeySize());
        }

        /* renamed from: a */
        public C3706s0 mo9466a(C3635j jVar) {
            return AesCtrHmacAeadKeyFormat.parseFrom(jVar, C3697r.m8878a());
        }
    }

    public C3508c() {
        super(AesCtrHmacAeadKey.class, new C3509a(C3499a.class));
    }

    /* renamed from: a */
    public String mo9459a() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    /* renamed from: a */
    public C3706s0 mo9460a(C3635j jVar) {
        return AesCtrHmacAeadKey.parseFrom(jVar, C3697r.m8878a());
    }

    /* renamed from: b */
    public C3575a<AesCtrHmacAeadKeyFormat, AesCtrHmacAeadKey> mo9462b() {
        return new C3510b(AesCtrHmacAeadKeyFormat.class);
    }

    /* renamed from: c */
    public KeyMaterialType mo9463c() {
        return KeyMaterialType.SYMMETRIC;
    }

    /* renamed from: a */
    public void mo9461a(C3706s0 s0Var) {
        C3817m0.m9176a(((AesCtrHmacAeadKey) s0Var).getVersion(), 0);
    }
}
