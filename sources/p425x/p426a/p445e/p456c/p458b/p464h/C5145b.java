package p425x.p426a.p445e.p456c.p458b.p464h;

import java.io.IOException;
import java.security.PublicKey;
import java.util.Arrays;
import p119o.p120a.C0967p0;
import p425x.p426a.p427a.C4967n;
import p425x.p426a.p427a.p433h2.C4950a;
import p425x.p426a.p427a.p433h2.C4951b;
import p425x.p426a.p434b.p436d.C5018a;
import p425x.p426a.p445e.p446a.C5031e;
import p425x.p426a.p445e.p446a.C5034h;
import p425x.p426a.p445e.p447b.p453f.C5068c;
import p425x.p426a.p445e.p447b.p454g.C5069a;
import p425x.p426a.p445e.p456c.p457a.C5122c;

/* renamed from: x.a.e.c.b.h.b */
public class C5145b implements PublicKey, C5122c {

    /* renamed from: e */
    public transient C4967n f12316e;

    /* renamed from: f */
    public transient C5068c f12317f;

    public C5145b(C4951b bVar) {
        this.f12316e = C5034h.m11489a(bVar.f11833e.f11832f).f12019f.f11831e;
        this.f12317f = (C5068c) C5069a.m11525a(bVar);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5145b)) {
            return false;
        }
        C5145b bVar = (C5145b) obj;
        if (!this.f12316e.mo11626b(bVar.f12316e) || !Arrays.equals(this.f12317f.mo11733a(), bVar.f12317f.mo11733a())) {
            z = false;
        }
        return z;
    }

    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    public byte[] getEncoded() {
        try {
            return (this.f12317f.f12135a != null ? C0967p0.m2188a((C5018a) this.f12317f) : new C4951b(new C4950a(C5031e.f11990e, new C5034h(new C4950a(this.f12316e))), this.f12317f.mo11733a())).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return (C0967p0.m2248d(this.f12317f.mo11733a()) * 37) + this.f12316e.hashCode();
    }
}
