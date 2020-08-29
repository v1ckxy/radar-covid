package p213q.p217b.p301c.p302a.p309h0;

import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.HmacKey;
import com.google.crypto.tink.proto.HmacKey.Builder;
import com.google.crypto.tink.proto.HmacKeyFormat;
import com.google.crypto.tink.proto.HmacParams;
import com.google.crypto.tink.proto.KeyData.KeyMaterialType;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;
import p213q.p217b.p301c.p302a.C3574i;
import p213q.p217b.p301c.p302a.C3574i.C3575a;
import p213q.p217b.p301c.p302a.C3574i.C3576b;
import p213q.p217b.p301c.p302a.C3843o;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3635j;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3697r;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3706s0;
import p213q.p217b.p301c.p302a.p315m0.C3799f0;
import p213q.p217b.p301c.p302a.p315m0.C3806h0;
import p213q.p217b.p301c.p302a.p315m0.C3817m0;

/* renamed from: q.b.c.a.h0.b */
public final class C3567b extends C3574i<HmacKey> {

    /* renamed from: q.b.c.a.h0.b$a */
    public class C3568a extends C3576b<C3843o, HmacKey> {
        public C3568a(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public Object mo9464a(Object obj) {
            HmacKey hmacKey = (HmacKey) obj;
            HashType hash = hmacKey.getParams().getHash();
            SecretKeySpec secretKeySpec = new SecretKeySpec(hmacKey.getKeyValue().mo9668g(), "HMAC");
            int tagSize = hmacKey.getParams().getTagSize();
            int ordinal = hash.ordinal();
            if (ordinal == 1) {
                return new C3799f0("HMACSHA1", secretKeySpec, tagSize);
            }
            if (ordinal == 3) {
                return new C3799f0("HMACSHA256", secretKeySpec, tagSize);
            }
            if (ordinal == 4) {
                return new C3799f0("HMACSHA512", secretKeySpec, tagSize);
            }
            throw new GeneralSecurityException("unknown hash");
        }
    }

    /* renamed from: q.b.c.a.h0.b$b */
    public class C3569b extends C3575a<HmacKeyFormat, HmacKey> {
        public C3569b(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public Object mo9465a(C3706s0 s0Var) {
            HmacKeyFormat hmacKeyFormat = (HmacKeyFormat) s0Var;
            Builder newBuilder = HmacKey.newBuilder();
            if (C3567b.this != null) {
                return (HmacKey) newBuilder.setVersion(0).setParams(hmacKeyFormat.getParams()).setKeyValue(C3635j.m8388a(C3806h0.m9148a(hmacKeyFormat.getKeySize()))).build();
            }
            throw null;
        }

        /* renamed from: b */
        public void mo9467b(C3706s0 s0Var) {
            HmacKeyFormat hmacKeyFormat = (HmacKeyFormat) s0Var;
            if (hmacKeyFormat.getKeySize() >= 16) {
                C3567b.m8102a(hmacKeyFormat.getParams());
                return;
            }
            throw new GeneralSecurityException("key too short");
        }

        /* renamed from: a */
        public C3706s0 mo9466a(C3635j jVar) {
            return HmacKeyFormat.parseFrom(jVar, C3697r.m8878a());
        }
    }

    public C3567b() {
        super(HmacKey.class, new C3568a(C3843o.class));
    }

    /* renamed from: a */
    public static void m8102a(HmacParams hmacParams) {
        if (hmacParams.getTagSize() >= 10) {
            int ordinal = hmacParams.getHash().ordinal();
            String str = "tag size too big";
            if (ordinal != 1) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new GeneralSecurityException("unknown hash type");
                    } else if (hmacParams.getTagSize() > 64) {
                        throw new GeneralSecurityException(str);
                    }
                } else if (hmacParams.getTagSize() > 32) {
                    throw new GeneralSecurityException(str);
                }
            } else if (hmacParams.getTagSize() > 20) {
                throw new GeneralSecurityException(str);
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    /* renamed from: a */
    public String mo9459a() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    /* renamed from: a */
    public C3706s0 mo9460a(C3635j jVar) {
        return HmacKey.parseFrom(jVar, C3697r.m8878a());
    }

    /* renamed from: b */
    public C3575a<HmacKeyFormat, HmacKey> mo9462b() {
        return new C3569b(HmacKeyFormat.class);
    }

    /* renamed from: c */
    public KeyMaterialType mo9463c() {
        return KeyMaterialType.SYMMETRIC;
    }

    /* renamed from: a */
    public void mo9461a(C3706s0 s0Var) {
        HmacKey hmacKey = (HmacKey) s0Var;
        C3817m0.m9176a(hmacKey.getVersion(), 0);
        if (hmacKey.getKeyValue().size() >= 16) {
            m8102a(hmacKey.getParams());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
