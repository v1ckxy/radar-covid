package p425x.p426a.p445e.p456c.p458b.p460d;

import java.io.IOException;
import java.security.PublicKey;
import p213q.p214a.p215a.p216a.C1965a;
import p425x.p426a.p427a.C4929d;
import p425x.p426a.p427a.p433h2.C4950a;
import p425x.p426a.p427a.p433h2.C4951b;
import p425x.p426a.p445e.p446a.C5030d;
import p425x.p426a.p445e.p446a.C5031e;
import p425x.p426a.p445e.p447b.p449b.C5060f;

/* renamed from: x.a.e.c.b.d.d */
public class C5132d implements PublicKey {

    /* renamed from: e */
    public C5060f f12296e;

    public C5132d(C5060f fVar) {
        this.f12296e = fVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5132d)) {
            return false;
        }
        C5132d dVar = (C5132d) obj;
        C5060f fVar = this.f12296e;
        int i = fVar.f12119a;
        C5060f fVar2 = dVar.f12296e;
        if (i == fVar2.f12119a && fVar.f12120b == fVar2.f12120b && fVar.f12121c.equals(fVar2.f12121c)) {
            return true;
        }
        return false;
    }

    public String getAlgorithm() {
        return "McEliece";
    }

    public byte[] getEncoded() {
        C5060f fVar = this.f12296e;
        try {
            return new C4951b(new C4950a(C5031e.f11988c), (C4929d) new C5030d(fVar.f12119a, fVar.f12120b, fVar.f12121c)).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        C5060f fVar = this.f12296e;
        return fVar.f12121c.hashCode() + (((fVar.f12120b * 37) + fVar.f12119a) * 37);
    }

    public String toString() {
        String str = "\n";
        StringBuilder b = C1965a.m4763b(C1965a.m4753a(C1965a.m4763b(C1965a.m4753a(C1965a.m4763b("McEliecePublicKey:\n", " length of the code         : "), this.f12296e.f12119a, str), " error correction capability: "), this.f12296e.f12120b, str), " generator matrix           : ");
        b.append(this.f12296e.f12121c);
        return b.toString();
    }
}
