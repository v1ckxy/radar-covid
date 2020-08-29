package p425x.p426a.p445e.p456c.p458b.p459c;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;
import p119o.p120a.C0967p0;
import p425x.p426a.p427a.C4996w;
import p425x.p426a.p427a.p432g2.C4946b;
import p425x.p426a.p434b.p436d.C5018a;
import p425x.p426a.p445e.p447b.p448a.C5048g;
import p425x.p426a.p445e.p456c.p457a.C5120a;

/* renamed from: x.a.e.c.b.c.a */
public class C5126a implements PrivateKey, C5120a {

    /* renamed from: e */
    public transient C5048g f12290e;

    /* renamed from: f */
    public transient C4996w f12291f;

    public C5126a(C4946b bVar) {
        this.f12291f = bVar.f11822h;
        this.f12290e = (C5048g) C0967p0.m2190a(bVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5126a)) {
            return false;
        }
        try {
            return Arrays.equals(this.f12290e.getEncoded(), ((C5126a) obj).f12290e.getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("unable to perform equals");
        }
    }

    public String getAlgorithm() {
        return "LMS";
    }

    public byte[] getEncoded() {
        try {
            return C0967p0.m2187a((C5018a) this.f12290e, this.f12291f).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        try {
            return C0967p0.m2248d(this.f12290e.getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("unable to calculate hashCode");
        }
    }
}
