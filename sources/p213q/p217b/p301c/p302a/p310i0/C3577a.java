package p213q.p217b.p301c.p302a.p310i0;

import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.HkdfPrfKey;
import com.google.crypto.tink.proto.HkdfPrfKey.Builder;
import com.google.crypto.tink.proto.HkdfPrfKeyFormat;
import com.google.crypto.tink.proto.HkdfPrfParams;
import com.google.crypto.tink.proto.KeyData.KeyMaterialType;
import java.security.GeneralSecurityException;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p301c.p302a.C3574i;
import p213q.p217b.p301c.p302a.C3574i.C3575a;
import p213q.p217b.p301c.p302a.C3574i.C3576b;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3635j;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3697r;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3706s0;
import p213q.p217b.p301c.p302a.p315m0.C3790c0;
import p213q.p217b.p301c.p302a.p315m0.C3806h0;
import p213q.p217b.p301c.p302a.p315m0.C3817m0;
import p213q.p217b.p301c.p302a.p315m0.p316p0.C3823a;
import p213q.p217b.p301c.p302a.p315m0.p316p0.C3824b;
import p213q.p217b.p301c.p302a.p315m0.p316p0.C3825c;

/* renamed from: q.b.c.a.i0.a */
public class C3577a extends C3574i<HkdfPrfKey> {

    /* renamed from: q.b.c.a.i0.a$a */
    public class C3578a extends C3576b<C3825c, HkdfPrfKey> {
        public C3578a(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public Object mo9464a(Object obj) {
            HkdfPrfKey hkdfPrfKey = (HkdfPrfKey) obj;
            return new C3823a(C3577a.m8128a(hkdfPrfKey.getParams().getHash()), hkdfPrfKey.getKeyValue().mo9668g(), hkdfPrfKey.getParams().getSalt().mo9668g());
        }
    }

    /* renamed from: q.b.c.a.i0.a$b */
    public class C3579b extends C3576b<C3583d, HkdfPrfKey> {
        public C3579b(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public Object mo9464a(Object obj) {
            HkdfPrfKey hkdfPrfKey = (HkdfPrfKey) obj;
            return new C3581b(this, new C3824b(new C3823a(C3577a.m8128a(hkdfPrfKey.getParams().getHash()), hkdfPrfKey.getKeyValue().mo9668g(), hkdfPrfKey.getParams().getSalt().mo9668g())));
        }
    }

    /* renamed from: q.b.c.a.i0.a$c */
    public class C3580c extends C3575a<HkdfPrfKeyFormat, HkdfPrfKey> {
        public C3580c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public Object mo9465a(C3706s0 s0Var) {
            HkdfPrfKeyFormat hkdfPrfKeyFormat = (HkdfPrfKeyFormat) s0Var;
            Builder keyValue = HkdfPrfKey.newBuilder().setKeyValue(C3635j.m8388a(C3806h0.m9148a(hkdfPrfKeyFormat.getKeySize())));
            if (C3577a.this != null) {
                return (HkdfPrfKey) keyValue.setVersion(0).setParams(hkdfPrfKeyFormat.getParams()).build();
            }
            throw null;
        }

        /* renamed from: b */
        public void mo9467b(C3706s0 s0Var) {
            HkdfPrfKeyFormat hkdfPrfKeyFormat = (HkdfPrfKeyFormat) s0Var;
            if (hkdfPrfKeyFormat.getKeySize() >= 32) {
                C3577a.m8129a(hkdfPrfKeyFormat.getParams());
                return;
            }
            throw new GeneralSecurityException("Invalid HkdfPrfKey/HkdfPrfKeyFormat: Key size too short");
        }

        /* renamed from: a */
        public C3706s0 mo9466a(C3635j jVar) {
            return HkdfPrfKeyFormat.parseFrom(jVar, C3697r.m8878a());
        }
    }

    public C3577a() {
        super(HkdfPrfKey.class, new C3578a(C3825c.class), new C3579b(C3583d.class));
    }

    /* renamed from: a */
    public static /* synthetic */ C3790c0 m8128a(HashType hashType) {
        int ordinal = hashType.ordinal();
        if (ordinal == 1) {
            return C3790c0.SHA1;
        }
        if (ordinal == 2) {
            return C3790c0.SHA384;
        }
        if (ordinal == 3) {
            return C3790c0.SHA256;
        }
        if (ordinal == 4) {
            return C3790c0.SHA512;
        }
        StringBuilder a = C1965a.m4756a("HashType ");
        a.append(hashType.name());
        a.append(" not known in");
        throw new GeneralSecurityException(a.toString());
    }

    /* renamed from: a */
    public static void m8129a(HkdfPrfParams hkdfPrfParams) {
        if (hkdfPrfParams.getHash() != HashType.SHA256 && hkdfPrfParams.getHash() != HashType.SHA512) {
            throw new GeneralSecurityException("Invalid HkdfPrfKey/HkdfPrfKeyFormat: Unsupported hash");
        }
    }

    /* renamed from: a */
    public String mo9459a() {
        return "type.googleapis.com/google.crypto.tink.HkdfPrfKey";
    }

    /* renamed from: b */
    public C3575a<HkdfPrfKeyFormat, HkdfPrfKey> mo9462b() {
        return new C3580c(HkdfPrfKeyFormat.class);
    }

    /* renamed from: c */
    public KeyMaterialType mo9463c() {
        return KeyMaterialType.SYMMETRIC;
    }

    /* renamed from: a */
    public C3706s0 mo9460a(C3635j jVar) {
        return HkdfPrfKey.parseFrom(jVar, C3697r.m8878a());
    }

    /* renamed from: a */
    public void mo9461a(C3706s0 s0Var) {
        HkdfPrfKey hkdfPrfKey = (HkdfPrfKey) s0Var;
        C3817m0.m9176a(hkdfPrfKey.getVersion(), 0);
        if (hkdfPrfKey.getKeyValue().size() >= 32) {
            m8129a(hkdfPrfKey.getParams());
            return;
        }
        throw new GeneralSecurityException("Invalid HkdfPrfKey/HkdfPrfKeyFormat: Key size too short");
    }
}
