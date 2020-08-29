package p425x.p426a.p427a;

import java.util.Arrays;
import p119o.p120a.C0967p0;
import p425x.p426a.p469f.C5167h;

/* renamed from: x.a.a.x0 */
public class C5000x0 extends C4983s {

    /* renamed from: e */
    public final byte[] f11886e;

    public C5000x0(byte[] bArr) {
        this.f11886e = bArr;
    }

    /* renamed from: a */
    public void mo11548a(C4977q qVar, boolean z) {
        qVar.mo11622a(z, 18, this.f11886e);
    }

    /* renamed from: a */
    public boolean mo11549a(C4983s sVar) {
        if (!(sVar instanceof C5000x0)) {
            return false;
        }
        return Arrays.equals(this.f11886e, ((C5000x0) sVar).f11886e);
    }

    /* renamed from: h */
    public int mo11550h() {
        return C4924b2.m11131a(this.f11886e.length) + 1 + this.f11886e.length;
    }

    public int hashCode() {
        return C0967p0.m2248d(this.f11886e);
    }

    /* renamed from: i */
    public boolean mo11552i() {
        return false;
    }

    public String toString() {
        return C5167h.m11600a(this.f11886e);
    }
}
