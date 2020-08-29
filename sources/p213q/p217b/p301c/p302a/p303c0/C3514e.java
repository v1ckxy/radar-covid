package p213q.p217b.p301c.p302a.p303c0;

import com.google.crypto.tink.proto.AesEaxKey;
import com.google.crypto.tink.proto.AesEaxKey.Builder;
import com.google.crypto.tink.proto.AesEaxKeyFormat;
import com.google.crypto.tink.proto.KeyData.KeyMaterialType;
import java.security.GeneralSecurityException;
import p213q.p217b.p301c.p302a.C3499a;
import p213q.p217b.p301c.p302a.C3574i;
import p213q.p217b.p301c.p302a.C3574i.C3575a;
import p213q.p217b.p301c.p302a.C3574i.C3576b;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3635j;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3697r;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3706s0;
import p213q.p217b.p301c.p302a.p315m0.C3791d;
import p213q.p217b.p301c.p302a.p315m0.C3806h0;
import p213q.p217b.p301c.p302a.p315m0.C3817m0;

/* renamed from: q.b.c.a.c0.e */
public final class C3514e extends C3574i<AesEaxKey> {

    /* renamed from: q.b.c.a.c0.e$a */
    public class C3515a extends C3576b<C3499a, AesEaxKey> {
        public C3515a(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public Object mo9464a(Object obj) {
            AesEaxKey aesEaxKey = (AesEaxKey) obj;
            return new C3791d(aesEaxKey.getKeyValue().mo9668g(), aesEaxKey.getParams().getIvSize());
        }
    }

    /* renamed from: q.b.c.a.c0.e$b */
    public class C3516b extends C3575a<AesEaxKeyFormat, AesEaxKey> {
        public C3516b(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public Object mo9465a(C3706s0 s0Var) {
            AesEaxKeyFormat aesEaxKeyFormat = (AesEaxKeyFormat) s0Var;
            Builder params = AesEaxKey.newBuilder().setKeyValue(C3635j.m8388a(C3806h0.m9148a(aesEaxKeyFormat.getKeySize()))).setParams(aesEaxKeyFormat.getParams());
            if (C3514e.this != null) {
                return (AesEaxKey) params.setVersion(0).build();
            }
            throw null;
        }

        /* renamed from: b */
        public void mo9467b(C3706s0 s0Var) {
            AesEaxKeyFormat aesEaxKeyFormat = (AesEaxKeyFormat) s0Var;
            C3817m0.m9175a(aesEaxKeyFormat.getKeySize());
            if (aesEaxKeyFormat.getParams().getIvSize() != 12 && aesEaxKeyFormat.getParams().getIvSize() != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }

        /* renamed from: a */
        public C3706s0 mo9466a(C3635j jVar) {
            return AesEaxKeyFormat.parseFrom(jVar, C3697r.m8878a());
        }
    }

    public C3514e() {
        super(AesEaxKey.class, new C3515a(C3499a.class));
    }

    /* renamed from: a */
    public String mo9459a() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    /* renamed from: a */
    public C3706s0 mo9460a(C3635j jVar) {
        return AesEaxKey.parseFrom(jVar, C3697r.m8878a());
    }

    /* renamed from: b */
    public C3575a<AesEaxKeyFormat, AesEaxKey> mo9462b() {
        return new C3516b(AesEaxKeyFormat.class);
    }

    /* renamed from: c */
    public KeyMaterialType mo9463c() {
        return KeyMaterialType.SYMMETRIC;
    }

    /* renamed from: a */
    public void mo9461a(C3706s0 s0Var) {
        AesEaxKey aesEaxKey = (AesEaxKey) s0Var;
        C3817m0.m9176a(aesEaxKey.getVersion(), 0);
        C3817m0.m9175a(aesEaxKey.getKeyValue().size());
        if (aesEaxKey.getParams().getIvSize() != 12 && aesEaxKey.getParams().getIvSize() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
