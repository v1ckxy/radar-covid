package p425x.p426a.p445e.p456c.p458b.p462f;

import java.io.IOException;
import java.security.PublicKey;
import java.util.Arrays;
import p119o.p120a.C0967p0;
import p425x.p426a.p427a.p433h2.C4951b;
import p425x.p426a.p434b.p436d.C5018a;
import p425x.p426a.p445e.p447b.p451d.C5064b;
import p425x.p426a.p445e.p447b.p454g.C5069a;

/* renamed from: x.a.e.c.b.f.b */
public class C5139b implements PublicKey {

    /* renamed from: e */
    public transient C5064b f12302e;

    public C5139b(C4951b bVar) {
        this.f12302e = (C5064b) C5069a.m11525a(bVar);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5139b)) {
            return false;
        }
        C5139b bVar = (C5139b) obj;
        C5064b bVar2 = this.f12302e;
        if (bVar2.f12126a != bVar.f12302e.f12126a || !Arrays.equals(bVar2.mo11729a(), bVar.f12302e.mo11729a())) {
            z = false;
        }
        return z;
    }

    public final String getAlgorithm() {
        return C0967p0.m2229b(this.f12302e.f12126a);
    }

    public byte[] getEncoded() {
        try {
            return C0967p0.m2188a((C5018a) this.f12302e).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        C5064b bVar = this.f12302e;
        return (C0967p0.m2248d(bVar.mo11729a()) * 37) + bVar.f12126a;
    }
}
