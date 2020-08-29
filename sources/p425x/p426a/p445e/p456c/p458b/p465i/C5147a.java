package p425x.p426a.p445e.p456c.p458b.p465i;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;
import p119o.p120a.C0967p0;
import p425x.p426a.p427a.C4967n;
import p425x.p426a.p427a.C4996w;
import p425x.p426a.p427a.p432g2.C4946b;
import p425x.p426a.p434b.p436d.C5018a;
import p425x.p426a.p445e.p446a.C5036j;
import p425x.p426a.p445e.p447b.p455h.C5104s;

/* renamed from: x.a.e.c.b.i.a */
public class C5147a implements PrivateKey {

    /* renamed from: e */
    public transient C4967n f12318e;

    /* renamed from: f */
    public transient C5104s f12319f;

    /* renamed from: g */
    public transient C4996w f12320g;

    public C5147a(C4946b bVar) {
        this.f12320g = bVar.f11822h;
        this.f12318e = C5036j.m11493a(bVar.f11820f.f11832f).f12026h.f11831e;
        this.f12319f = (C5104s) C0967p0.m2190a(bVar);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5147a)) {
            return false;
        }
        C5147a aVar = (C5147a) obj;
        if (!this.f12318e.mo11626b(aVar.f12318e) || !Arrays.equals(this.f12319f.mo11759a(), aVar.f12319f.mo11759a())) {
            z = false;
        }
        return z;
    }

    public String getAlgorithm() {
        return "XMSSMT";
    }

    public byte[] getEncoded() {
        try {
            return C0967p0.m2187a((C5018a) this.f12319f, this.f12320g).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return (C0967p0.m2248d(this.f12319f.mo11759a()) * 37) + this.f12318e.hashCode();
    }
}
