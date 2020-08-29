package p213q.p217b.p301c.p302a.p303c0;

import com.google.crypto.tink.proto.ChaCha20Poly1305Key;
import com.google.crypto.tink.proto.ChaCha20Poly1305Key.Builder;
import com.google.crypto.tink.proto.ChaCha20Poly1305KeyFormat;
import com.google.crypto.tink.proto.KeyData.KeyMaterialType;
import java.security.GeneralSecurityException;
import p213q.p217b.p301c.p302a.C3499a;
import p213q.p217b.p301c.p302a.C3574i;
import p213q.p217b.p301c.p302a.C3574i.C3575a;
import p213q.p217b.p301c.p302a.C3574i.C3576b;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3635j;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3697r;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3706s0;
import p213q.p217b.p301c.p302a.p315m0.C3806h0;
import p213q.p217b.p301c.p302a.p315m0.C3812k;
import p213q.p217b.p301c.p302a.p315m0.C3817m0;

/* renamed from: q.b.c.a.c0.g */
public class C3520g extends C3574i<ChaCha20Poly1305Key> {

    /* renamed from: q.b.c.a.c0.g$a */
    public class C3521a extends C3576b<C3499a, ChaCha20Poly1305Key> {
        public C3521a(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public Object mo9464a(Object obj) {
            return new C3812k(((ChaCha20Poly1305Key) obj).getKeyValue().mo9668g());
        }
    }

    /* renamed from: q.b.c.a.c0.g$b */
    public class C3522b extends C3575a<ChaCha20Poly1305KeyFormat, ChaCha20Poly1305Key> {
        public C3522b(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public Object mo9465a(C3706s0 s0Var) {
            ChaCha20Poly1305KeyFormat chaCha20Poly1305KeyFormat = (ChaCha20Poly1305KeyFormat) s0Var;
            Builder newBuilder = ChaCha20Poly1305Key.newBuilder();
            if (C3520g.this != null) {
                return (ChaCha20Poly1305Key) newBuilder.setVersion(0).setKeyValue(C3635j.m8388a(C3806h0.m9148a(32))).build();
            }
            throw null;
        }

        /* renamed from: b */
        public void mo9467b(C3706s0 s0Var) {
            ChaCha20Poly1305KeyFormat chaCha20Poly1305KeyFormat = (ChaCha20Poly1305KeyFormat) s0Var;
        }

        /* renamed from: a */
        public C3706s0 mo9466a(C3635j jVar) {
            return ChaCha20Poly1305KeyFormat.parseFrom(jVar, C3697r.m8878a());
        }
    }

    public C3520g() {
        super(ChaCha20Poly1305Key.class, new C3521a(C3499a.class));
    }

    /* renamed from: a */
    public String mo9459a() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    /* renamed from: a */
    public C3706s0 mo9460a(C3635j jVar) {
        return ChaCha20Poly1305Key.parseFrom(jVar, C3697r.m8878a());
    }

    /* renamed from: b */
    public C3575a<ChaCha20Poly1305KeyFormat, ChaCha20Poly1305Key> mo9462b() {
        return new C3522b(ChaCha20Poly1305KeyFormat.class);
    }

    /* renamed from: c */
    public KeyMaterialType mo9463c() {
        return KeyMaterialType.SYMMETRIC;
    }

    /* renamed from: a */
    public void mo9461a(C3706s0 s0Var) {
        ChaCha20Poly1305Key chaCha20Poly1305Key = (ChaCha20Poly1305Key) s0Var;
        C3817m0.m9176a(chaCha20Poly1305Key.getVersion(), 0);
        if (chaCha20Poly1305Key.getKeyValue().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}
