package p425x.p426a.p427a;

import java.util.Arrays;
import p119o.p120a.C0967p0;
import p425x.p426a.p469f.C5167h;

/* renamed from: x.a.a.j1 */
public class C4957j1 extends C4983s {

    /* renamed from: e */
    public final byte[] f11841e;

    public C4957j1(byte[] bArr) {
        this.f11841e = bArr;
    }

    /* renamed from: a */
    public void mo11548a(C4977q qVar, boolean z) {
        qVar.mo11622a(z, 26, this.f11841e);
    }

    /* renamed from: a */
    public boolean mo11549a(C4983s sVar) {
        if (!(sVar instanceof C4957j1)) {
            return false;
        }
        return Arrays.equals(this.f11841e, ((C4957j1) sVar).f11841e);
    }

    /* renamed from: h */
    public int mo11550h() {
        return C4924b2.m11131a(this.f11841e.length) + 1 + this.f11841e.length;
    }

    public int hashCode() {
        return C0967p0.m2248d(this.f11841e);
    }

    /* renamed from: i */
    public boolean mo11552i() {
        return false;
    }

    public String toString() {
        return C5167h.m11600a(this.f11841e);
    }
}
