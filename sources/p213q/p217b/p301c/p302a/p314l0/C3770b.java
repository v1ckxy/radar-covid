package p213q.p217b.p301c.p302a.p314l0;

import com.google.crypto.tink.proto.AesGcmHkdfStreamingKey;
import com.google.crypto.tink.proto.AesGcmHkdfStreamingKey.Builder;
import com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyFormat;
import com.google.crypto.tink.proto.AesGcmHkdfStreamingParams;
import com.google.crypto.tink.proto.HashType;
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
import p213q.p217b.p301c.p302a.p315m0.C3795e;
import p213q.p217b.p301c.p302a.p315m0.C3806h0;
import p213q.p217b.p301c.p302a.p315m0.C3817m0;

/* renamed from: q.b.c.a.l0.b */
public final class C3770b extends C3574i<AesGcmHkdfStreamingKey> {

    /* renamed from: q.b.c.a.l0.b$a */
    public class C3771a extends C3576b<C3500a0, AesGcmHkdfStreamingKey> {
        public C3771a(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public Object mo9464a(Object obj) {
            AesGcmHkdfStreamingKey aesGcmHkdfStreamingKey = (AesGcmHkdfStreamingKey) obj;
            C3795e eVar = new C3795e(aesGcmHkdfStreamingKey.getKeyValue().mo9668g(), C2286e.m5308c(aesGcmHkdfStreamingKey.getParams().getHkdfHashType()), aesGcmHkdfStreamingKey.getParams().getDerivedKeySize(), aesGcmHkdfStreamingKey.getParams().getCiphertextSegmentSize(), 0);
            return eVar;
        }
    }

    /* renamed from: q.b.c.a.l0.b$b */
    public class C3772b extends C3575a<AesGcmHkdfStreamingKeyFormat, AesGcmHkdfStreamingKey> {
        public C3772b(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public Object mo9465a(C3706s0 s0Var) {
            AesGcmHkdfStreamingKeyFormat aesGcmHkdfStreamingKeyFormat = (AesGcmHkdfStreamingKeyFormat) s0Var;
            Builder params = AesGcmHkdfStreamingKey.newBuilder().setKeyValue(C3635j.m8388a(C3806h0.m9148a(aesGcmHkdfStreamingKeyFormat.getKeySize()))).setParams(aesGcmHkdfStreamingKeyFormat.getParams());
            if (C3770b.this != null) {
                return (AesGcmHkdfStreamingKey) params.setVersion(0).build();
            }
            throw null;
        }

        /* renamed from: b */
        public void mo9467b(C3706s0 s0Var) {
            AesGcmHkdfStreamingKeyFormat aesGcmHkdfStreamingKeyFormat = (AesGcmHkdfStreamingKeyFormat) s0Var;
            if (aesGcmHkdfStreamingKeyFormat.getKeySize() >= 16) {
                C3770b.m9095a(aesGcmHkdfStreamingKeyFormat.getParams());
                return;
            }
            throw new GeneralSecurityException("key_size must be at least 16 bytes");
        }

        /* renamed from: a */
        public C3706s0 mo9466a(C3635j jVar) {
            return AesGcmHkdfStreamingKeyFormat.parseFrom(jVar, C3697r.m8878a());
        }
    }

    public C3770b() {
        super(AesGcmHkdfStreamingKey.class, new C3771a(C3500a0.class));
    }

    /* renamed from: a */
    public static void m9095a(AesGcmHkdfStreamingParams aesGcmHkdfStreamingParams) {
        C3817m0.m9175a(aesGcmHkdfStreamingParams.getDerivedKeySize());
        if (aesGcmHkdfStreamingParams.getHkdfHashType() == HashType.UNKNOWN_HASH) {
            throw new GeneralSecurityException("unknown HKDF hash type");
        } else if (aesGcmHkdfStreamingParams.getCiphertextSegmentSize() < aesGcmHkdfStreamingParams.getDerivedKeySize() + 7 + 16 + 2) {
            throw new GeneralSecurityException("ciphertext_segment_size must be at least (derived_key_size + NONCE_PREFIX_IN_BYTES + TAG_SIZE_IN_BYTES + 2)");
        }
    }

    /* renamed from: a */
    public String mo9459a() {
        return "type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey";
    }

    /* renamed from: a */
    public C3706s0 mo9460a(C3635j jVar) {
        return AesGcmHkdfStreamingKey.parseFrom(jVar, C3697r.m8878a());
    }

    /* renamed from: b */
    public C3575a<AesGcmHkdfStreamingKeyFormat, AesGcmHkdfStreamingKey> mo9462b() {
        return new C3772b(AesGcmHkdfStreamingKeyFormat.class);
    }

    /* renamed from: c */
    public KeyMaterialType mo9463c() {
        return KeyMaterialType.SYMMETRIC;
    }

    /* renamed from: a */
    public void mo9461a(C3706s0 s0Var) {
        AesGcmHkdfStreamingKey aesGcmHkdfStreamingKey = (AesGcmHkdfStreamingKey) s0Var;
        C3817m0.m9176a(aesGcmHkdfStreamingKey.getVersion(), 0);
        m9095a(aesGcmHkdfStreamingKey.getParams());
    }
}
