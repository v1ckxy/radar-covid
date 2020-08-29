package p425x.p426a.p445e.p456c.p458b.p459c;

import java.io.IOException;
import java.security.PublicKey;
import java.util.Arrays;
import p119o.p120a.C0967p0;
import p425x.p426a.p427a.p433h2.C4951b;
import p425x.p426a.p434b.p436d.C5018a;
import p425x.p426a.p445e.p447b.p448a.C5048g;
import p425x.p426a.p445e.p447b.p454g.C5069a;
import p425x.p426a.p445e.p456c.p457a.C5120a;

/* renamed from: x.a.e.c.b.c.b */
public class C5127b implements PublicKey, C5120a {

    /* renamed from: e */
    public transient C5048g f12292e;

    public C5127b(C4951b bVar) {
        this.f12292e = (C5048g) C5069a.m11525a(bVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5127b) {
            try {
                return Arrays.equals(this.f12292e.getEncoded(), ((C5127b) obj).f12292e.getEncoded());
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final String getAlgorithm() {
        return "LMS";
    }

    public byte[] getEncoded() {
        try {
            return C0967p0.m2188a((C5018a) this.f12292e).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        try {
            return C0967p0.m2248d(this.f12292e.getEncoded());
        } catch (IOException unused) {
            return -1;
        }
    }
}
