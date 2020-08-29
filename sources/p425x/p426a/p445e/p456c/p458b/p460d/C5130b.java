package p425x.p426a.p445e.p456c.p458b.p460d;

import java.io.IOException;
import java.security.PublicKey;
import p119o.p120a.C0967p0;
import p213q.p214a.p215a.p216a.C1965a;
import p425x.p426a.p427a.C4929d;
import p425x.p426a.p427a.p433h2.C4950a;
import p425x.p426a.p427a.p433h2.C4951b;
import p425x.p426a.p445e.p446a.C5028b;
import p425x.p426a.p445e.p446a.C5031e;
import p425x.p426a.p445e.p447b.p449b.C5057c;

/* renamed from: x.a.e.c.b.d.b */
public class C5130b implements PublicKey {

    /* renamed from: e */
    public C5057c f12294e;

    public C5130b(C5057c cVar) {
        this.f12294e = cVar;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C5130b)) {
            return false;
        }
        C5130b bVar = (C5130b) obj;
        C5057c cVar = this.f12294e;
        int i = cVar.f12109b;
        C5057c cVar2 = bVar.f12294e;
        if (i == cVar2.f12109b && cVar.f12110c == cVar2.f12110c && cVar.f12111d.equals(cVar2.f12111d)) {
            return true;
        }
        return false;
    }

    public String getAlgorithm() {
        return "McEliece-CCA2";
    }

    public byte[] getEncoded() {
        C5057c cVar = this.f12294e;
        try {
            return new C4951b(new C4950a(C5031e.f11989d), (C4929d) new C5028b(cVar.f12109b, cVar.f12110c, cVar.f12111d, C0967p0.m2232b(cVar.f12102a))).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        C5057c cVar = this.f12294e;
        return cVar.f12111d.hashCode() + (((cVar.f12110c * 37) + cVar.f12109b) * 37);
    }

    public String toString() {
        String str = "\n";
        StringBuilder b = C1965a.m4763b(C1965a.m4753a(C1965a.m4763b(C1965a.m4753a(C1965a.m4763b("McEliecePublicKey:\n", " length of the code         : "), this.f12294e.f12109b, str), " error correction capability: "), this.f12294e.f12110c, str), " generator matrix           : ");
        b.append(this.f12294e.f12111d.toString());
        return b.toString();
    }
}
