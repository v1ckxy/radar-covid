package p213q.p217b.p301c.p302a.p313k0;

import com.google.crypto.tink.proto.Ed25519PublicKey;
import com.google.crypto.tink.proto.KeyData.KeyMaterialType;
import java.security.GeneralSecurityException;
import p213q.p217b.p301c.p302a.C3574i;
import p213q.p217b.p301c.p302a.C3574i.C3576b;
import p213q.p217b.p301c.p302a.C3851v;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3635j;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3697r;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3706s0;
import p213q.p217b.p301c.p302a.p315m0.C3817m0;
import p213q.p217b.p301c.p302a.p315m0.C3837v;

/* renamed from: q.b.c.a.k0.d */
public class C3749d extends C3574i<Ed25519PublicKey> {

    /* renamed from: q.b.c.a.k0.d$a */
    public class C3750a extends C3576b<C3851v, Ed25519PublicKey> {
        public C3750a(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public Object mo9464a(Object obj) {
            return new C3837v(((Ed25519PublicKey) obj).getKeyValue().mo9668g());
        }
    }

    public C3749d() {
        super(Ed25519PublicKey.class, new C3750a(C3851v.class));
    }

    /* renamed from: a */
    public String mo9459a() {
        return "type.googleapis.com/google.crypto.tink.Ed25519PublicKey";
    }

    /* renamed from: a */
    public C3706s0 mo9460a(C3635j jVar) {
        return Ed25519PublicKey.parseFrom(jVar, C3697r.m8878a());
    }

    /* renamed from: a */
    public void mo9461a(Ed25519PublicKey ed25519PublicKey) {
        C3817m0.m9176a(ed25519PublicKey.getVersion(), 0);
        if (ed25519PublicKey.getKeyValue().size() != 32) {
            throw new GeneralSecurityException("invalid Ed25519 public key: incorrect key length");
        }
    }

    /* renamed from: c */
    public KeyMaterialType mo9463c() {
        return KeyMaterialType.ASYMMETRIC_PUBLIC;
    }
}
