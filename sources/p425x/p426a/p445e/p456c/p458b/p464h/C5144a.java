package p425x.p426a.p445e.p456c.p458b.p464h;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;
import p119o.p120a.C0967p0;
import p425x.p426a.p427a.C4967n;
import p425x.p426a.p427a.C4996w;
import p425x.p426a.p427a.C5003y0;
import p425x.p426a.p427a.p432g2.C4946b;
import p425x.p426a.p427a.p433h2.C4950a;
import p425x.p426a.p434b.p436d.C5018a;
import p425x.p426a.p445e.p446a.C5031e;
import p425x.p426a.p445e.p446a.C5034h;
import p425x.p426a.p445e.p447b.p453f.C5067b;
import p425x.p426a.p445e.p456c.p457a.C5122c;

/* renamed from: x.a.e.c.b.h.a */
public class C5144a implements PrivateKey, C5122c {

    /* renamed from: e */
    public transient C4967n f12313e;

    /* renamed from: f */
    public transient C5067b f12314f;

    /* renamed from: g */
    public transient C4996w f12315g;

    public C5144a(C4946b bVar) {
        this.f12315g = bVar.f11822h;
        this.f12313e = C5034h.m11489a(bVar.f11820f.f11832f).f12019f.f11831e;
        this.f12314f = (C5067b) C0967p0.m2190a(bVar);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5144a)) {
            return false;
        }
        C5144a aVar = (C5144a) obj;
        if (!this.f12313e.mo11626b(aVar.f12313e) || !Arrays.equals(this.f12314f.mo11732a(), aVar.f12314f.mo11732a())) {
            z = false;
        }
        return z;
    }

    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    public byte[] getEncoded() {
        C4946b bVar;
        try {
            if (this.f12314f.f12135a != null) {
                bVar = C0967p0.m2187a((C5018a) this.f12314f, this.f12315g);
            } else {
                bVar = new C4946b(new C4950a(C5031e.f11990e, new C5034h(new C4950a(this.f12313e))), new C5003y0(this.f12314f.mo11732a()), this.f12315g, null);
            }
            return bVar.getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return (C0967p0.m2248d(this.f12314f.mo11732a()) * 37) + this.f12313e.hashCode();
    }
}
