package p213q.p217b.p301c.p302a.p313k0;

import com.google.crypto.tink.proto.Ed25519KeyFormat;
import com.google.crypto.tink.proto.Ed25519PrivateKey;
import com.google.crypto.tink.proto.Ed25519PublicKey;
import com.google.crypto.tink.proto.Ed25519PublicKey.Builder;
import com.google.crypto.tink.proto.KeyData.KeyMaterialType;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import p213q.p217b.p301c.p302a.C3574i.C3575a;
import p213q.p217b.p301c.p302a.C3574i.C3576b;
import p213q.p217b.p301c.p302a.C3849t;
import p213q.p217b.p301c.p302a.C3850u;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3635j;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3697r;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3706s0;
import p213q.p217b.p301c.p302a.p315m0.C3806h0;
import p213q.p217b.p301c.p302a.p315m0.C3817m0;
import p213q.p217b.p301c.p302a.p315m0.C3828s;
import p213q.p217b.p301c.p302a.p315m0.C3836u;

/* renamed from: q.b.c.a.k0.c */
public final class C3746c extends C3849t<Ed25519PrivateKey, Ed25519PublicKey> {

    /* renamed from: q.b.c.a.k0.c$a */
    public class C3747a extends C3576b<C3850u, Ed25519PrivateKey> {
        public C3747a(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public Object mo9464a(Object obj) {
            return new C3836u(((Ed25519PrivateKey) obj).getKeyValue().mo9668g());
        }
    }

    /* renamed from: q.b.c.a.k0.c$b */
    public class C3748b extends C3575a<Ed25519KeyFormat, Ed25519PrivateKey> {
        public C3748b(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public Object mo9465a(C3706s0 s0Var) {
            Ed25519KeyFormat ed25519KeyFormat = (Ed25519KeyFormat) s0Var;
            byte[] a = C3806h0.m9148a(32);
            byte[] b = C3828s.m9188b(C3828s.m9187a(a));
            Builder newBuilder = Ed25519PublicKey.newBuilder();
            if (C3746c.this != null) {
                Ed25519PublicKey ed25519PublicKey = (Ed25519PublicKey) newBuilder.setVersion(0).setKeyValue(C3635j.m8388a(Arrays.copyOf(b, b.length))).build();
                Ed25519PrivateKey.Builder newBuilder2 = Ed25519PrivateKey.newBuilder();
                if (C3746c.this != null) {
                    return (Ed25519PrivateKey) newBuilder2.setVersion(0).setKeyValue(C3635j.m8388a(Arrays.copyOf(a, a.length))).setPublicKey(ed25519PublicKey).build();
                }
                throw null;
            }
            throw null;
        }

        /* renamed from: b */
        public void mo9467b(C3706s0 s0Var) {
            Ed25519KeyFormat ed25519KeyFormat = (Ed25519KeyFormat) s0Var;
        }

        /* renamed from: a */
        public C3706s0 mo9466a(C3635j jVar) {
            return Ed25519KeyFormat.parseFrom(jVar, C3697r.m8878a());
        }
    }

    public C3746c() {
        super(Ed25519PrivateKey.class, Ed25519PublicKey.class, new C3747a(C3850u.class));
    }

    /* renamed from: a */
    public String mo9459a() {
        return "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey";
    }

    /* renamed from: a */
    public C3706s0 mo9460a(C3635j jVar) {
        return Ed25519PrivateKey.parseFrom(jVar, C3697r.m8878a());
    }

    /* renamed from: b */
    public C3575a<Ed25519KeyFormat, Ed25519PrivateKey> mo9462b() {
        return new C3748b(Ed25519KeyFormat.class);
    }

    /* renamed from: c */
    public KeyMaterialType mo9463c() {
        return KeyMaterialType.ASYMMETRIC_PRIVATE;
    }

    /* renamed from: a */
    public void mo9461a(C3706s0 s0Var) {
        Ed25519PrivateKey ed25519PrivateKey = (Ed25519PrivateKey) s0Var;
        C3817m0.m9176a(ed25519PrivateKey.getVersion(), 0);
        new C3749d().mo9461a(ed25519PrivateKey.getPublicKey());
        if (ed25519PrivateKey.getKeyValue().size() != 32) {
            throw new GeneralSecurityException("invalid Ed25519 private key: incorrect key length");
        }
    }
}
