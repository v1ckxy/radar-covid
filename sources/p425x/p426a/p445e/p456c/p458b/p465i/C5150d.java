package p425x.p426a.p445e.p456c.p458b.p465i;

import java.io.IOException;
import java.security.PublicKey;
import java.util.Arrays;
import p119o.p120a.C0967p0;
import p425x.p426a.p427a.C4967n;
import p425x.p426a.p427a.p433h2.C4951b;
import p425x.p426a.p434b.p436d.C5018a;
import p425x.p426a.p445e.p447b.p454g.C5069a;
import p425x.p426a.p445e.p447b.p455h.C5116y;

/* renamed from: x.a.e.c.b.i.d */
public class C5150d implements PublicKey {

    /* renamed from: e */
    public transient C5116y f12326e;

    /* renamed from: f */
    public transient C4967n f12327f;

    public C5150d(C4951b bVar) {
        C5116y yVar = (C5116y) C5069a.m11525a(bVar);
        this.f12326e = yVar;
        this.f12327f = C0967p0.m2243c(yVar.f12218e);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5150d) {
            C5150d dVar = (C5150d) obj;
            try {
                if (!this.f12327f.mo11626b(dVar.f12327f) || !Arrays.equals(this.f12326e.getEncoded(), dVar.f12326e.getEncoded())) {
                    z = false;
                }
                return z;
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final String getAlgorithm() {
        return "XMSS";
    }

    public byte[] getEncoded() {
        try {
            return C0967p0.m2188a((C5018a) this.f12326e).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        try {
            return (C0967p0.m2248d(this.f12326e.getEncoded()) * 37) + this.f12327f.hashCode();
        } catch (IOException unused) {
            return this.f12327f.hashCode();
        }
    }
}
