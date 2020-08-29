package p425x.p426a.p445e.p456c.p458b.p461e;

import java.io.IOException;
import java.security.PublicKey;
import java.util.Arrays;
import p119o.p120a.C0967p0;
import p425x.p426a.p427a.p433h2.C4951b;
import p425x.p426a.p434b.p436d.C5018a;
import p425x.p426a.p445e.p447b.p450c.C5062b;
import p425x.p426a.p445e.p447b.p454g.C5069a;
import p425x.p426a.p445e.p456c.p457a.C5121b;

/* renamed from: x.a.e.c.b.e.b */
public class C5136b implements C5121b, PublicKey {

    /* renamed from: e */
    public transient C5062b f12299e;

    public C5136b(C4951b bVar) {
        this.f12299e = (C5062b) C5069a.m11525a(bVar);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C5136b)) {
            return false;
        }
        return Arrays.equals(this.f12299e.mo11727a(), ((C5136b) obj).f12299e.mo11727a());
    }

    public final String getAlgorithm() {
        return "NH";
    }

    public byte[] getEncoded() {
        try {
            return C0967p0.m2188a((C5018a) this.f12299e).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return C0967p0.m2248d(this.f12299e.mo11727a());
    }
}
