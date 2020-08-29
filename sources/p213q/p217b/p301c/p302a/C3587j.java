package p213q.p217b.p301c.p302a;

import com.google.crypto.tink.proto.EncryptedKeyset;
import com.google.crypto.tink.proto.Keyset;
import java.io.IOException;
import java.security.GeneralSecurityException;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p301c.p302a.p307g0.p308a.C3560d;
import p213q.p217b.p301c.p302a.p307g0.p308a.C3561e;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3606c0;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3635j;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3697r;

/* renamed from: q.b.c.a.j */
public final class C3587j {

    /* renamed from: a */
    public final Keyset f8967a;

    public C3587j(Keyset keyset) {
        this.f8967a = keyset;
    }

    /* renamed from: a */
    public static final C3587j m8149a(Keyset keyset) {
        if (keyset != null && keyset.getKeyCount() > 0) {
            return new C3587j(keyset);
        }
        throw new GeneralSecurityException("empty keyset");
    }

    public String toString() {
        return C3502b0.m7962a(this.f8967a).toString();
    }

    /* renamed from: a */
    public <P> P mo9483a(Class<P> cls) {
        C3844p a = C3855z.m9218a(this, cls);
        C3846q qVar = (C3846q) C3855z.f9453e.get(a.f9440c);
        if (qVar != null) {
            return qVar.mo9458a(a);
        }
        StringBuilder a2 = C1965a.m4756a("No wrapper found for ");
        a2.append(a.f9440c.getName());
        throw new GeneralSecurityException(a2.toString());
    }

    /* renamed from: a */
    public static final C3587j m8150a(C3560d dVar, C3499a aVar) {
        EncryptedKeyset parseFrom = EncryptedKeyset.parseFrom(dVar.mo9476a(), C3697r.m8878a());
        String str = "empty keyset";
        if (parseFrom == null || parseFrom.getEncryptedKeyset().size() == 0) {
            throw new GeneralSecurityException(str);
        }
        try {
            Keyset parseFrom2 = Keyset.parseFrom(aVar.mo9454b(parseFrom.getEncryptedKeyset().mo9668g(), new byte[0]), C3697r.m8878a());
            if (parseFrom2 != null && parseFrom2.getKeyCount() > 0) {
                return new C3587j(parseFrom2);
            }
            throw new GeneralSecurityException(str);
        } catch (C3606c0 unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    /* renamed from: a */
    public void mo9484a(C3766l lVar, C3499a aVar) {
        Keyset keyset = this.f8967a;
        byte[] a = aVar.mo9453a(keyset.toByteArray(), new byte[0]);
        try {
            if (Keyset.parseFrom(aVar.mo9454b(a, new byte[0]), C3697r.m8878a()).equals(keyset)) {
                C3561e eVar = (C3561e) lVar;
                if (!eVar.f8945a.putString(eVar.f8946b, C2286e.m5310c(((EncryptedKeyset) EncryptedKeyset.newBuilder().setEncryptedKeyset(C3635j.m8388a(a)).setKeysetInfo(C3502b0.m7962a(keyset)).build()).toByteArray())).commit()) {
                    throw new IOException("Failed to write to SharedPreferences");
                }
                return;
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (C3606c0 unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }
}
