package p213q.p217b.p301c.p302a.p306f0;

import com.google.crypto.tink.proto.AesCtrHmacAeadKey;
import com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat;
import com.google.crypto.tink.proto.AesGcmKey;
import com.google.crypto.tink.proto.AesGcmKeyFormat;
import com.google.crypto.tink.proto.KeyTemplate;
import java.security.GeneralSecurityException;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p301c.p302a.C3855z;
import p213q.p217b.p301c.p302a.p303c0.C3504a;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3606c0;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3697r;
import p213q.p217b.p301c.p302a.p315m0.C3822p;

/* renamed from: q.b.c.a.f0.f */
public class C3553f implements C3822p {

    /* renamed from: a */
    public final String f8926a;

    /* renamed from: b */
    public int f8927b;

    public C3553f(KeyTemplate keyTemplate) {
        String typeUrl = keyTemplate.getTypeUrl();
        this.f8926a = typeUrl;
        if (typeUrl.equals(C3504a.f8902b)) {
            try {
                AesGcmKeyFormat parseFrom = AesGcmKeyFormat.parseFrom(keyTemplate.getValue(), C3697r.m8878a());
                AesGcmKey aesGcmKey = (AesGcmKey) C3855z.m9217a(keyTemplate);
                parseFrom.getKeySize();
            } catch (C3606c0 e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (this.f8926a.equals(C3504a.f8901a)) {
            try {
                AesCtrHmacAeadKeyFormat parseFrom2 = AesCtrHmacAeadKeyFormat.parseFrom(keyTemplate.getValue(), C3697r.m8878a());
                AesCtrHmacAeadKey aesCtrHmacAeadKey = (AesCtrHmacAeadKey) C3855z.m9217a(keyTemplate);
                this.f8927b = parseFrom2.getAesCtrKeyFormat().getKeySize();
                parseFrom2.getHmacKeyFormat().getKeySize();
            } catch (C3606c0 e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        } else {
            StringBuilder a = C1965a.m4756a("unsupported AEAD DEM key type: ");
            a.append(this.f8926a);
            throw new GeneralSecurityException(a.toString());
        }
    }
}
