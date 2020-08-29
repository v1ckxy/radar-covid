package p213q.p217b.p301c.p302a.p303c0;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p301c.p302a.C3499a;
import p213q.p217b.p301c.p302a.C3844p;
import p213q.p217b.p301c.p302a.C3844p.C3845a;
import p213q.p217b.p301c.p302a.C3846q;

/* renamed from: q.b.c.a.c0.b */
public class C3505b implements C3846q<C3499a> {

    /* renamed from: a */
    public static final Logger f8904a = Logger.getLogger(C3505b.class.getName());

    /* renamed from: q.b.c.a.c0.b$b */
    public static class C3507b implements C3499a {

        /* renamed from: a */
        public final C3844p<C3499a> f8905a;

        public /* synthetic */ C3507b(C3844p pVar, C3506a aVar) {
            this.f8905a = pVar;
        }

        /* renamed from: a */
        public byte[] mo9453a(byte[] bArr, byte[] bArr2) {
            return C2286e.m5270a(this.f8905a.f9439b.mo10049a(), ((C3499a) this.f8905a.f9439b.f9441a).mo9453a(bArr, bArr2));
        }

        /* renamed from: b */
        public byte[] mo9454b(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (C3845a aVar : this.f8905a.mo10048a(copyOfRange)) {
                    try {
                        return ((C3499a) aVar.f9441a).mo9454b(copyOfRange2, bArr2);
                    } catch (GeneralSecurityException e) {
                        Logger logger = C3505b.f8904a;
                        StringBuilder a = C1965a.m4756a("ciphertext prefix matches a key, but cannot decrypt: ");
                        a.append(e.toString());
                        logger.info(a.toString());
                    }
                }
            }
            for (C3845a aVar2 : this.f8905a.mo10047a()) {
                try {
                    return ((C3499a) aVar2.f9441a).mo9454b(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("decryption failed");
        }
    }

    /* renamed from: a */
    public Class<C3499a> mo9457a() {
        return C3499a.class;
    }

    /* renamed from: a */
    public Object mo9458a(C3844p pVar) {
        return new C3507b(pVar, null);
    }
}
