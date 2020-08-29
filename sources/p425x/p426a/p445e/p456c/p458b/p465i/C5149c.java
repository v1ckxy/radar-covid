package p425x.p426a.p445e.p456c.p458b.p465i;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;
import p119o.p120a.C0967p0;
import p425x.p426a.p427a.C4967n;
import p425x.p426a.p427a.C4996w;
import p425x.p426a.p427a.p432g2.C4946b;
import p425x.p426a.p434b.p436d.C5018a;
import p425x.p426a.p445e.p446a.C5035i;
import p425x.p426a.p445e.p447b.p455h.C5113x;

/* renamed from: x.a.e.c.b.i.c */
public class C5149c implements PrivateKey {

    /* renamed from: e */
    public transient C5113x f12323e;

    /* renamed from: f */
    public transient C4967n f12324f;

    /* renamed from: g */
    public transient C4996w f12325g;

    public C5149c(C4946b bVar) {
        this.f12325g = bVar.f11822h;
        this.f12324f = C5035i.m11491a(bVar.f11820f.f11832f).f12022g.f11831e;
        this.f12323e = (C5113x) C0967p0.m2190a(bVar);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5149c)) {
            return false;
        }
        C5149c cVar = (C5149c) obj;
        if (!this.f12324f.mo11626b(cVar.f12324f) || !Arrays.equals(this.f12323e.mo11763a(), cVar.f12323e.mo11763a())) {
            z = false;
        }
        return z;
    }

    public String getAlgorithm() {
        return "XMSS";
    }

    public byte[] getEncoded() {
        try {
            return C0967p0.m2187a((C5018a) this.f12323e, this.f12325g).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return (C0967p0.m2248d(this.f12323e.mo11763a()) * 37) + this.f12324f.hashCode();
    }
}
