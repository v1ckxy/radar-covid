package p425x.p426a.p427a;

import java.util.Arrays;
import p119o.p120a.C0967p0;

/* renamed from: x.a.a.u0 */
public class C4991u0 extends C4983s {

    /* renamed from: e */
    public final byte[] f11871e;

    public C4991u0(byte[] bArr) {
        this.f11871e = C0967p0.m2217a(bArr);
    }

    /* renamed from: a */
    public void mo11548a(C4977q qVar, boolean z) {
        qVar.mo11622a(z, 25, this.f11871e);
    }

    /* renamed from: a */
    public boolean mo11549a(C4983s sVar) {
        if (!(sVar instanceof C4991u0)) {
            return false;
        }
        return Arrays.equals(this.f11871e, ((C4991u0) sVar).f11871e);
    }

    /* renamed from: h */
    public int mo11550h() {
        return C4924b2.m11131a(this.f11871e.length) + 1 + this.f11871e.length;
    }

    public int hashCode() {
        return C0967p0.m2248d(this.f11871e);
    }

    /* renamed from: i */
    public boolean mo11552i() {
        return false;
    }
}
