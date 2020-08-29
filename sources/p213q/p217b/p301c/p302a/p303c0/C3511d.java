package p213q.p217b.p301c.p302a.p303c0;

import com.google.crypto.tink.proto.AesCtrKey;
import com.google.crypto.tink.proto.AesCtrKey.Builder;
import com.google.crypto.tink.proto.AesCtrKeyFormat;
import com.google.crypto.tink.proto.AesCtrParams;
import com.google.crypto.tink.proto.KeyData.KeyMaterialType;
import java.security.GeneralSecurityException;
import p213q.p217b.p301c.p302a.C3574i;
import p213q.p217b.p301c.p302a.C3574i.C3575a;
import p213q.p217b.p301c.p302a.C3574i.C3576b;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3635j;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3697r;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3706s0;
import p213q.p217b.p301c.p302a.p315m0.C3788c;
import p213q.p217b.p301c.p302a.p315m0.C3796e0;
import p213q.p217b.p301c.p302a.p315m0.C3806h0;
import p213q.p217b.p301c.p302a.p315m0.C3817m0;

/* renamed from: q.b.c.a.c0.d */
public class C3511d extends C3574i<AesCtrKey> {

    /* renamed from: q.b.c.a.c0.d$a */
    public class C3512a extends C3576b<C3796e0, AesCtrKey> {
        public C3512a(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public Object mo9464a(Object obj) {
            AesCtrKey aesCtrKey = (AesCtrKey) obj;
            return new C3788c(aesCtrKey.getKeyValue().mo9668g(), aesCtrKey.getParams().getIvSize());
        }
    }

    /* renamed from: q.b.c.a.c0.d$b */
    public class C3513b extends C3575a<AesCtrKeyFormat, AesCtrKey> {
        public C3513b(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public Object mo9465a(C3706s0 s0Var) {
            AesCtrKeyFormat aesCtrKeyFormat = (AesCtrKeyFormat) s0Var;
            Builder keyValue = AesCtrKey.newBuilder().setParams(aesCtrKeyFormat.getParams()).setKeyValue(C3635j.m8388a(C3806h0.m9148a(aesCtrKeyFormat.getKeySize())));
            if (C3511d.this != null) {
                return (AesCtrKey) keyValue.setVersion(0).build();
            }
            throw null;
        }

        /* renamed from: b */
        public void mo9467b(C3706s0 s0Var) {
            AesCtrKeyFormat aesCtrKeyFormat = (AesCtrKeyFormat) s0Var;
            C3817m0.m9175a(aesCtrKeyFormat.getKeySize());
            C3511d.this.mo9468a(aesCtrKeyFormat.getParams());
        }

        /* renamed from: a */
        public C3706s0 mo9466a(C3635j jVar) {
            return AesCtrKeyFormat.parseFrom(jVar, C3697r.m8878a());
        }
    }

    public C3511d() {
        super(AesCtrKey.class, new C3512a(C3796e0.class));
    }

    /* renamed from: a */
    public String mo9459a() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    /* renamed from: a */
    public C3706s0 mo9460a(C3635j jVar) {
        return AesCtrKey.parseFrom(jVar, C3697r.m8878a());
    }

    /* renamed from: a */
    public final void mo9468a(AesCtrParams aesCtrParams) {
        if (aesCtrParams.getIvSize() < 12 || aesCtrParams.getIvSize() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    /* renamed from: b */
    public C3575a<AesCtrKeyFormat, AesCtrKey> mo9462b() {
        return new C3513b(AesCtrKeyFormat.class);
    }

    /* renamed from: c */
    public KeyMaterialType mo9463c() {
        return KeyMaterialType.SYMMETRIC;
    }

    /* renamed from: a */
    public void mo9461a(C3706s0 s0Var) {
        AesCtrKey aesCtrKey = (AesCtrKey) s0Var;
        C3817m0.m9176a(aesCtrKey.getVersion(), 0);
        C3817m0.m9175a(aesCtrKey.getKeyValue().size());
        mo9468a(aesCtrKey.getParams());
    }
}
