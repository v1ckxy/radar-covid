package p425x.p426a.p445e.p456c.p458b.p465i;

import java.io.IOException;
import java.security.PublicKey;
import java.util.Arrays;
import p119o.p120a.C0967p0;
import p425x.p426a.p427a.C4967n;
import p425x.p426a.p427a.p433h2.C4951b;
import p425x.p426a.p434b.p436d.C5018a;
import p425x.p426a.p445e.p447b.p454g.C5069a;
import p425x.p426a.p445e.p447b.p455h.C5107t;

/* renamed from: x.a.e.c.b.i.b */
public class C5148b implements PublicKey {

    /* renamed from: e */
    public transient C4967n f12321e;

    /* renamed from: f */
    public transient C5107t f12322f;

    public C5148b(C4951b bVar) {
        C5107t tVar = (C5107t) C5069a.m11525a(bVar);
        this.f12322f = tVar;
        this.f12321e = C0967p0.m2243c(tVar.f12219e);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5148b)) {
            return false;
        }
        C5148b bVar = (C5148b) obj;
        if (!this.f12321e.mo11626b(bVar.f12321e) || !Arrays.equals(this.f12322f.mo11760a(), bVar.f12322f.mo11760a())) {
            z = false;
        }
        return z;
    }

    public final String getAlgorithm() {
        return "XMSSMT";
    }

    public byte[] getEncoded() {
        try {
            return C0967p0.m2188a((C5018a) this.f12322f).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return (C0967p0.m2248d(this.f12322f.mo11760a()) * 37) + this.f12321e.hashCode();
    }
}
