package p425x.p426a.p445e.p456c.p458b.p461e;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;
import p119o.p120a.C0967p0;
import p425x.p426a.p427a.C4996w;
import p425x.p426a.p427a.p432g2.C4946b;
import p425x.p426a.p434b.p436d.C5018a;
import p425x.p426a.p445e.p447b.p450c.C5061a;
import p425x.p426a.p445e.p456c.p457a.C5121b;

/* renamed from: x.a.e.c.b.e.a */
public class C5135a implements C5121b, PrivateKey {

    /* renamed from: e */
    public transient C5061a f12297e;

    /* renamed from: f */
    public transient C4996w f12298f;

    public C5135a(C4946b bVar) {
        this.f12298f = bVar.f11822h;
        this.f12297e = (C5061a) C0967p0.m2190a(bVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5135a)) {
            return false;
        }
        return Arrays.equals(this.f12297e.mo11726a(), ((C5135a) obj).f12297e.mo11726a());
    }

    public final String getAlgorithm() {
        return "NH";
    }

    public byte[] getEncoded() {
        try {
            return C0967p0.m2187a((C5018a) this.f12297e, this.f12298f).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return C0967p0.m2242c(this.f12297e.mo11726a());
    }
}
