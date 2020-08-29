package p425x.p426a.p445e.p456c.p458b.p460d;

import java.io.IOException;
import java.security.PrivateKey;
import p119o.p120a.C0967p0;
import p425x.p426a.p427a.p432g2.C4946b;
import p425x.p426a.p427a.p433h2.C4950a;
import p425x.p426a.p445e.p446a.C5027a;
import p425x.p426a.p445e.p446a.C5031e;
import p425x.p426a.p445e.p447b.p449b.C5056b;

/* renamed from: x.a.e.c.b.d.a */
public class C5129a implements PrivateKey {

    /* renamed from: e */
    public C5056b f12293e;

    public C5129a(C5056b bVar) {
        this.f12293e = bVar;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C5129a)) {
            C5129a aVar = (C5129a) obj;
            C5056b bVar = this.f12293e;
            int i = bVar.f12103b;
            C5056b bVar2 = aVar.f12293e;
            if (i == bVar2.f12103b && bVar.f12104c == bVar2.f12104c && bVar.f12105d.equals(bVar2.f12105d) && this.f12293e.f12106e.equals(aVar.f12293e.f12106e) && this.f12293e.f12107f.equals(aVar.f12293e.f12107f) && this.f12293e.f12108g.equals(aVar.f12293e.f12108g)) {
                return true;
            }
        }
        return false;
    }

    public String getAlgorithm() {
        return "McEliece-CCA2";
    }

    public byte[] getEncoded() {
        try {
            C5027a aVar = new C5027a(this.f12293e.f12103b, this.f12293e.f12104c, this.f12293e.f12105d, this.f12293e.f12106e, this.f12293e.f12107f, C0967p0.m2232b(this.f12293e.f12102a));
            return new C4946b(new C4950a(C5031e.f11989d), aVar, null, null).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        C5056b bVar = this.f12293e;
        return this.f12293e.f12108g.hashCode() + ((this.f12293e.f12107f.hashCode() + ((bVar.f12106e.hashCode() + (((((bVar.f12104c * 37) + bVar.f12103b) * 37) + bVar.f12105d.f12343b) * 37)) * 37)) * 37);
    }
}
