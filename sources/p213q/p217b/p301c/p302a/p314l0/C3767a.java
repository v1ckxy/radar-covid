package p213q.p217b.p301c.p302a.p314l0;

import com.google.crypto.tink.proto.AesCtrHmacStreamingKey;
import com.google.crypto.tink.proto.AesCtrHmacStreamingKey.Builder;
import com.google.crypto.tink.proto.AesCtrHmacStreamingKeyFormat;
import com.google.crypto.tink.proto.AesCtrHmacStreamingParams;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.HmacParams;
import com.google.crypto.tink.proto.KeyData.KeyMaterialType;
import java.security.GeneralSecurityException;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p301c.p302a.C3500a0;
import p213q.p217b.p301c.p302a.C3574i;
import p213q.p217b.p301c.p302a.C3574i.C3575a;
import p213q.p217b.p301c.p302a.C3574i.C3576b;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3635j;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3697r;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3706s0;
import p213q.p217b.p301c.p302a.p315m0.C3779b;
import p213q.p217b.p301c.p302a.p315m0.C3806h0;
import p213q.p217b.p301c.p302a.p315m0.C3817m0;

/* renamed from: q.b.c.a.l0.a */
public final class C3767a extends C3574i<AesCtrHmacStreamingKey> {

    /* renamed from: q.b.c.a.l0.a$a */
    public class C3768a extends C3576b<C3500a0, AesCtrHmacStreamingKey> {
        public C3768a(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public Object mo9464a(Object obj) {
            AesCtrHmacStreamingKey aesCtrHmacStreamingKey = (AesCtrHmacStreamingKey) obj;
            C3779b bVar = new C3779b(aesCtrHmacStreamingKey.getKeyValue().mo9668g(), C2286e.m5308c(aesCtrHmacStreamingKey.getParams().getHkdfHashType()), aesCtrHmacStreamingKey.getParams().getDerivedKeySize(), C2286e.m5308c(aesCtrHmacStreamingKey.getParams().getHmacParams().getHash()), aesCtrHmacStreamingKey.getParams().getHmacParams().getTagSize(), aesCtrHmacStreamingKey.getParams().getCiphertextSegmentSize(), 0);
            return bVar;
        }
    }

    /* renamed from: q.b.c.a.l0.a$b */
    public class C3769b extends C3575a<AesCtrHmacStreamingKeyFormat, AesCtrHmacStreamingKey> {
        public C3769b(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public Object mo9465a(C3706s0 s0Var) {
            AesCtrHmacStreamingKeyFormat aesCtrHmacStreamingKeyFormat = (AesCtrHmacStreamingKeyFormat) s0Var;
            Builder params = AesCtrHmacStreamingKey.newBuilder().setKeyValue(C3635j.m8388a(C3806h0.m9148a(aesCtrHmacStreamingKeyFormat.getKeySize()))).setParams(aesCtrHmacStreamingKeyFormat.getParams());
            if (C3767a.this != null) {
                return (AesCtrHmacStreamingKey) params.setVersion(0).build();
            }
            throw null;
        }

        /* renamed from: b */
        public void mo9467b(C3706s0 s0Var) {
            AesCtrHmacStreamingKeyFormat aesCtrHmacStreamingKeyFormat = (AesCtrHmacStreamingKeyFormat) s0Var;
            if (aesCtrHmacStreamingKeyFormat.getKeySize() >= 16) {
                C3767a.m9085a(aesCtrHmacStreamingKeyFormat.getParams());
                return;
            }
            throw new GeneralSecurityException("key_size must be at least 16 bytes");
        }

        /* renamed from: a */
        public C3706s0 mo9466a(C3635j jVar) {
            return AesCtrHmacStreamingKeyFormat.parseFrom(jVar, C3697r.m8878a());
        }
    }

    public C3767a() {
        super(AesCtrHmacStreamingKey.class, new C3768a(C3500a0.class));
    }

    /* renamed from: a */
    public String mo9459a() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey";
    }

    /* renamed from: a */
    public C3706s0 mo9460a(C3635j jVar) {
        return AesCtrHmacStreamingKey.parseFrom(jVar, C3697r.m8878a());
    }

    /* renamed from: b */
    public C3575a<AesCtrHmacStreamingKeyFormat, AesCtrHmacStreamingKey> mo9462b() {
        return new C3769b(AesCtrHmacStreamingKeyFormat.class);
    }

    /* renamed from: c */
    public KeyMaterialType mo9463c() {
        return KeyMaterialType.SYMMETRIC;
    }

    /* renamed from: a */
    public void mo9461a(C3706s0 s0Var) {
        AesCtrHmacStreamingKey aesCtrHmacStreamingKey = (AesCtrHmacStreamingKey) s0Var;
        C3817m0.m9176a(aesCtrHmacStreamingKey.getVersion(), 0);
        if (aesCtrHmacStreamingKey.getKeyValue().size() < 16) {
            throw new GeneralSecurityException("key_value must have at least 16 bytes");
        } else if (aesCtrHmacStreamingKey.getKeyValue().size() >= aesCtrHmacStreamingKey.getParams().getDerivedKeySize()) {
            m9085a(aesCtrHmacStreamingKey.getParams());
        } else {
            throw new GeneralSecurityException("key_value must have at least as many bits as derived keys");
        }
    }

    /* renamed from: a */
    public static void m9085a(AesCtrHmacStreamingParams aesCtrHmacStreamingParams) {
        C3817m0.m9175a(aesCtrHmacStreamingParams.getDerivedKeySize());
        if (aesCtrHmacStreamingParams.getHkdfHashType() == HashType.UNKNOWN_HASH) {
            throw new GeneralSecurityException("unknown HKDF hash type");
        } else if (aesCtrHmacStreamingParams.getHmacParams().getHash() != HashType.UNKNOWN_HASH) {
            HmacParams hmacParams = aesCtrHmacStreamingParams.getHmacParams();
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
                if (aesCtrHmacStreamingParams.getCiphertextSegmentSize() < aesCtrHmacStreamingParams.getHmacParams().getTagSize() + aesCtrHmacStreamingParams.getDerivedKeySize() + 2 + 7) {
                    throw new GeneralSecurityException("ciphertext_segment_size must be at least (derived_key_size + tag_size + NONCE_PREFIX_IN_BYTES + 2)");
                }
                return;
            }
            throw new GeneralSecurityException("tag size too small");
        } else {
            throw new GeneralSecurityException("unknown HMAC hash type");
        }
    }
}
