package p425x.p426a.p427a;

import java.util.Arrays;
import p119o.p120a.C0967p0;

/* renamed from: x.a.a.i1 */
public class C4954i1 extends C4983s {

    /* renamed from: e */
    public final byte[] f11837e;

    public C4954i1(byte[] bArr) {
        this.f11837e = C0967p0.m2217a(bArr);
    }

    /* renamed from: a */
    public void mo11548a(C4977q qVar, boolean z) {
        qVar.mo11622a(z, 21, this.f11837e);
    }

    /* renamed from: a */
    public boolean mo11549a(C4983s sVar) {
        if (!(sVar instanceof C4954i1)) {
            return false;
        }
        return Arrays.equals(this.f11837e, ((C4954i1) sVar).f11837e);
    }

    /* renamed from: h */
    public int mo11550h() {
        return C4924b2.m11131a(this.f11837e.length) + 1 + this.f11837e.length;
    }

    public int hashCode() {
        return C0967p0.m2248d(this.f11837e);
    }

    /* renamed from: i */
    public boolean mo11552i() {
        return false;
    }
}
