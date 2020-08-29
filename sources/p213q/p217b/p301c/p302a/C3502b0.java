package p213q.p217b.p301c.p302a;

import com.google.crypto.tink.proto.KeyData.KeyMaterialType;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.proto.Keyset.Key;
import com.google.crypto.tink.proto.KeysetInfo;
import com.google.crypto.tink.proto.KeysetInfo.Builder;
import com.google.crypto.tink.proto.KeysetInfo.KeyInfo;
import com.google.crypto.tink.proto.OutputPrefixType;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* renamed from: q.b.c.a.b0 */
public class C3502b0 {
    static {
        Charset.forName("UTF-8");
    }

    /* renamed from: a */
    public static KeysetInfo m7962a(Keyset keyset) {
        Builder primaryKeyId = KeysetInfo.newBuilder().setPrimaryKeyId(keyset.getPrimaryKeyId());
        for (Key key : keyset.getKeyList()) {
            primaryKeyId.addKeyInfo((KeyInfo) KeyInfo.newBuilder().setTypeUrl(key.getKeyData().getTypeUrl()).setStatus(key.getStatus()).setOutputPrefixType(key.getOutputPrefixType()).setKeyId(key.getKeyId()).build());
        }
        return (KeysetInfo) primaryKeyId.build();
    }

    /* renamed from: b */
    public static void m7963b(Keyset keyset) {
        int primaryKeyId = keyset.getPrimaryKeyId();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        for (Key key : keyset.getKeyList()) {
            if (key.getStatus() == KeyStatusType.ENABLED) {
                if (!key.hasKeyData()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(key.getKeyId())}));
                } else if (key.getOutputPrefixType() == OutputPrefixType.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(key.getKeyId())}));
                } else if (key.getStatus() != KeyStatusType.UNKNOWN_STATUS) {
                    if (key.getKeyId() == primaryKeyId) {
                        if (!z2) {
                            z2 = true;
                        } else {
                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                        }
                    }
                    if (key.getKeyData().getKeyMaterialType() != KeyMaterialType.ASYMMETRIC_PUBLIC) {
                        z = false;
                    }
                    i++;
                } else {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(key.getKeyId())}));
                }
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        } else if (!z2 && !z) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
