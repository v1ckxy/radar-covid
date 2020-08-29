package p213q.p217b.p301c.p302a.p309h0;

import com.google.crypto.tink.proto.OutputPrefixType;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p301c.p302a.C3843o;
import p213q.p217b.p301c.p302a.C3844p;
import p213q.p217b.p301c.p302a.C3844p.C3845a;
import p213q.p217b.p301c.p302a.C3846q;

/* renamed from: q.b.c.a.h0.d */
public class C3571d implements C3846q<C3843o> {

    /* renamed from: a */
    public static final Logger f8955a = Logger.getLogger(C3571d.class.getName());

    /* renamed from: q.b.c.a.h0.d$b */
    public static class C3573b implements C3843o {

        /* renamed from: a */
        public final C3844p<C3843o> f8956a;

        /* renamed from: b */
        public final byte[] f8957b = {0};

        public /* synthetic */ C3573b(C3844p pVar, C3572a aVar) {
            this.f8956a = pVar;
        }

        /* renamed from: a */
        public byte[] mo9478a(byte[] bArr) {
            if (this.f8956a.f9439b.f9444d.equals(OutputPrefixType.LEGACY)) {
                return C2286e.m5270a(this.f8956a.f9439b.mo10049a(), ((C3843o) this.f8956a.f9439b.f9441a).mo9478a(C2286e.m5270a(bArr, this.f8957b)));
            }
            return C2286e.m5270a(this.f8956a.f9439b.mo10049a(), ((C3843o) this.f8956a.f9439b.f9441a).mo9478a(bArr));
        }

        /* renamed from: a */
        public void mo9477a(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (C3845a aVar : this.f8956a.mo10048a(copyOfRange)) {
                    try {
                        if (aVar.f9444d.equals(OutputPrefixType.LEGACY)) {
                            ((C3843o) aVar.f9441a).mo9477a(copyOfRange2, C2286e.m5270a(bArr2, this.f8957b));
                        } else {
                            ((C3843o) aVar.f9441a).mo9477a(copyOfRange2, bArr2);
                        }
                        return;
                    } catch (GeneralSecurityException e) {
                        Logger logger = C3571d.f8955a;
                        StringBuilder a = C1965a.m4756a("tag prefix matches a key, but cannot verify: ");
                        a.append(e.toString());
                        logger.info(a.toString());
                    }
                }
                for (C3845a aVar2 : this.f8956a.mo10047a()) {
                    try {
                        ((C3843o) aVar2.f9441a).mo9477a(bArr, bArr2);
                        return;
                    } catch (GeneralSecurityException unused) {
                    }
                }
                throw new GeneralSecurityException("invalid MAC");
            }
            throw new GeneralSecurityException("tag too short");
        }
    }

    /* renamed from: a */
    public Class<C3843o> mo9457a() {
        return C3843o.class;
    }

    /* renamed from: a */
    public Object mo9458a(C3844p pVar) {
        return new C3573b(pVar, null);
    }
}
