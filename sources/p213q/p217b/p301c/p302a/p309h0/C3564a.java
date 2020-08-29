package p213q.p217b.p301c.p302a.p309h0;

import com.google.crypto.tink.proto.AesCmacKey;
import com.google.crypto.tink.proto.AesCmacKeyFormat;
import com.google.crypto.tink.proto.AesCmacParams;
import com.google.crypto.tink.proto.KeyData.KeyMaterialType;
import java.security.GeneralSecurityException;
import p213q.p217b.p301c.p302a.C3574i;
import p213q.p217b.p301c.p302a.C3574i.C3575a;
import p213q.p217b.p301c.p302a.C3574i.C3576b;
import p213q.p217b.p301c.p302a.C3843o;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3635j;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3697r;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3706s0;
import p213q.p217b.p301c.p302a.p315m0.C3777a;
import p213q.p217b.p301c.p302a.p315m0.C3806h0;
import p213q.p217b.p301c.p302a.p315m0.C3817m0;

/* renamed from: q.b.c.a.h0.a */
public final class C3564a extends C3574i<AesCmacKey> {

    /* renamed from: q.b.c.a.h0.a$a */
    public class C3565a extends C3576b<C3843o, AesCmacKey> {
        public C3565a(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public Object mo9464a(Object obj) {
            AesCmacKey aesCmacKey = (AesCmacKey) obj;
            return new C3777a(aesCmacKey.getKeyValue().mo9668g(), aesCmacKey.getParams().getTagSize());
        }
    }

    /* renamed from: q.b.c.a.h0.a$b */
    public class C3566b extends C3575a<AesCmacKeyFormat, AesCmacKey> {
        public C3566b(C3564a aVar, Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public Object mo9465a(C3706s0 s0Var) {
            AesCmacKeyFormat aesCmacKeyFormat = (AesCmacKeyFormat) s0Var;
            return (AesCmacKey) AesCmacKey.newBuilder().setVersion(0).setKeyValue(C3635j.m8388a(C3806h0.m9148a(aesCmacKeyFormat.getKeySize()))).setParams(aesCmacKeyFormat.getParams()).build();
        }

        /* renamed from: b */
        public void mo9467b(C3706s0 s0Var) {
            AesCmacKeyFormat aesCmacKeyFormat = (AesCmacKeyFormat) s0Var;
            C3564a.m8092a(aesCmacKeyFormat.getParams());
            if (aesCmacKeyFormat.getKeySize() != 32) {
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 16 bytes");
            }
        }

        /* renamed from: a */
        public C3706s0 mo9466a(C3635j jVar) {
            return AesCmacKeyFormat.parseFrom(jVar, C3697r.m8878a());
        }
    }

    public C3564a() {
        super(AesCmacKey.class, new C3565a(C3843o.class));
    }

    /* renamed from: a */
    public static void m8092a(AesCmacParams aesCmacParams) {
        if (aesCmacParams.getTagSize() < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (aesCmacParams.getTagSize() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* renamed from: a */
    public String mo9459a() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    /* renamed from: a */
    public C3706s0 mo9460a(C3635j jVar) {
        return AesCmacKey.parseFrom(jVar, C3697r.m8878a());
    }

    /* renamed from: b */
    public C3575a<AesCmacKeyFormat, AesCmacKey> mo9462b() {
        return new C3566b(this, AesCmacKeyFormat.class);
    }

    /* renamed from: c */
    public KeyMaterialType mo9463c() {
        return KeyMaterialType.SYMMETRIC;
    }

    /* renamed from: a */
    public void mo9461a(C3706s0 s0Var) {
        AesCmacKey aesCmacKey = (AesCmacKey) s0Var;
        C3817m0.m9176a(aesCmacKey.getVersion(), 0);
        if (aesCmacKey.getKeyValue().size() == 32) {
            m8092a(aesCmacKey.getParams());
            return;
        }
        throw new GeneralSecurityException("AesCmacKey size wrong, must be 16 bytes");
    }
}
