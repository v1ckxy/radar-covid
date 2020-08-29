package p425x.p426a.p445e.p456c.p458b.p462f;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;
import p119o.p120a.C0967p0;
import p425x.p426a.p427a.C4996w;
import p425x.p426a.p427a.p432g2.C4946b;
import p425x.p426a.p434b.p436d.C5018a;
import p425x.p426a.p445e.p447b.p451d.C5063a;

/* renamed from: x.a.e.c.b.f.a */
public class C5138a implements PrivateKey {

    /* renamed from: e */
    public transient C5063a f12300e;

    /* renamed from: f */
    public transient C4996w f12301f;

    public C5138a(C4946b bVar) {
        this.f12301f = bVar.f11822h;
        this.f12300e = (C5063a) C0967p0.m2190a(bVar);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5138a)) {
            return false;
        }
        C5138a aVar = (C5138a) obj;
        C5063a aVar2 = this.f12300e;
        if (aVar2.f12124a != aVar.f12300e.f12124a || !Arrays.equals(aVar2.mo11728a(), aVar.f12300e.mo11728a())) {
            z = false;
        }
        return z;
    }

    public final String getAlgorithm() {
        return C0967p0.m2229b(this.f12300e.f12124a);
    }

    public byte[] getEncoded() {
        try {
            return C0967p0.m2187a((C5018a) this.f12300e, this.f12301f).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        C5063a aVar = this.f12300e;
        return (C0967p0.m2248d(aVar.mo11728a()) * 37) + aVar.f12124a;
    }
}
