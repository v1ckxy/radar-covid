package p213q.p217b.p301c.p302a.p305e0;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p301c.p302a.C3503c;
import p213q.p217b.p301c.p302a.C3844p;
import p213q.p217b.p301c.p302a.C3844p.C3845a;
import p213q.p217b.p301c.p302a.C3846q;

/* renamed from: q.b.c.a.e0.c */
public class C3540c implements C3846q<C3503c> {

    /* renamed from: a */
    public static final Logger f8920a = Logger.getLogger(C3540c.class.getName());

    /* renamed from: q.b.c.a.e0.c$a */
    public static class C3541a implements C3503c {

        /* renamed from: a */
        public C3844p<C3503c> f8921a;

        public C3541a(C3844p<C3503c> pVar) {
            this.f8921a = pVar;
        }

        /* renamed from: a */
        public byte[] mo9455a(byte[] bArr, byte[] bArr2) {
            return C2286e.m5270a(this.f8921a.f9439b.mo10049a(), ((C3503c) this.f8921a.f9439b.f9441a).mo9455a(bArr, bArr2));
        }

        /* renamed from: b */
        public byte[] mo9456b(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (C3845a aVar : this.f8921a.mo10048a(copyOfRange)) {
                    try {
                        return ((C3503c) aVar.f9441a).mo9456b(copyOfRange2, bArr2);
                    } catch (GeneralSecurityException e) {
                        Logger logger = C3540c.f8920a;
                        StringBuilder a = C1965a.m4756a("ciphertext prefix matches a key, but cannot decrypt: ");
                        a.append(e.toString());
                        logger.info(a.toString());
                    }
                }
            }
            for (C3845a aVar2 : this.f8921a.mo10047a()) {
                try {
                    return ((C3503c) aVar2.f9441a).mo9456b(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("decryption failed");
        }
    }

    /* renamed from: a */
    public Class<C3503c> mo9457a() {
        return C3503c.class;
    }

    /* renamed from: a */
    public Object mo9458a(C3844p pVar) {
        return new C3541a(pVar);
    }
}
