package p213q.p217b.p301c.p302a;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.KeyTemplate;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.proto.Keyset.Builder;
import com.google.crypto.tink.proto.Keyset.Key;
import com.google.crypto.tink.proto.OutputPrefixType;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Iterator;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: q.b.c.a.k */
public final class C3740k {
    @GuardedBy("this")

    /* renamed from: a */
    public final Builder f9303a;

    public C3740k(Builder builder) {
        this.f9303a = builder;
    }

    /* renamed from: c */
    public static int m9015c() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        byte b = 0;
        while (b == 0) {
            secureRandom.nextBytes(bArr);
            b = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return b;
    }

    @Deprecated
    /* renamed from: a */
    public synchronized int mo10013a(KeyTemplate keyTemplate, boolean z) {
        Key a;
        a = mo10014a(keyTemplate);
        this.f9303a.addKey(a);
        if (z) {
            this.f9303a.setPrimaryKeyId(a.getKeyId());
        }
        return a.getKeyId();
    }

    /* renamed from: a */
    public final synchronized Key mo10014a(KeyTemplate keyTemplate) {
        KeyData b;
        int b2;
        OutputPrefixType outputPrefixType;
        b = C3855z.m9224b(keyTemplate);
        b2 = mo10018b();
        outputPrefixType = keyTemplate.getOutputPrefixType();
        if (outputPrefixType == OutputPrefixType.UNKNOWN_PREFIX) {
            outputPrefixType = OutputPrefixType.TINK;
        }
        return (Key) Key.newBuilder().setKeyData(b).setKeyId(b2).setStatus(KeyStatusType.ENABLED).setOutputPrefixType(outputPrefixType).build();
    }

    /* renamed from: a */
    public synchronized C3587j mo10015a() {
        return C3587j.m8149a((Keyset) this.f9303a.build());
    }

    /* renamed from: a */
    public synchronized C3740k mo10016a(C3562h hVar) {
        mo10013a(hVar.f8947a, false);
        return this;
    }

    /* renamed from: a */
    public final synchronized boolean mo10017a(int i) {
        boolean z;
        Iterator it = this.f9303a.getKeyList().iterator();
        while (true) {
            if (it.hasNext()) {
                if (((Key) it.next()).getKeyId() == i) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        return z;
    }

    /* renamed from: b */
    public final synchronized int mo10018b() {
        int c;
        do {
            c = m9015c();
        } while (mo10017a(c));
        return c;
    }

    /* renamed from: b */
    public synchronized C3740k mo10019b(int i) {
        int i2 = 0;
        while (i2 < this.f9303a.getKeyCount()) {
            Key key = this.f9303a.getKey(i2);
            if (key.getKeyId() != i) {
                i2++;
            } else if (key.getStatus().equals(KeyStatusType.ENABLED)) {
                this.f9303a.setPrimaryKeyId(i);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("cannot set key as primary because it's not enabled: ");
                sb.append(i);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("key not found: ");
        sb2.append(i);
        throw new GeneralSecurityException(sb2.toString());
        return this;
    }
}
