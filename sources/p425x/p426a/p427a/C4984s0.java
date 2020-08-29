package p425x.p426a.p427a;

import java.util.Arrays;
import p119o.p120a.C0967p0;
import p425x.p426a.p469f.C5167h;

/* renamed from: x.a.a.s0 */
public class C4984s0 extends C4983s {

    /* renamed from: e */
    public final byte[] f11866e;

    public C4984s0(byte[] bArr) {
        this.f11866e = bArr;
    }

    /* renamed from: a */
    public void mo11548a(C4977q qVar, boolean z) {
        qVar.mo11622a(z, 27, this.f11866e);
    }

    /* renamed from: a */
    public boolean mo11549a(C4983s sVar) {
        if (!(sVar instanceof C4984s0)) {
            return false;
        }
        return Arrays.equals(this.f11866e, ((C4984s0) sVar).f11866e);
    }

    /* renamed from: h */
    public int mo11550h() {
        return C4924b2.m11131a(this.f11866e.length) + 1 + this.f11866e.length;
    }

    public int hashCode() {
        return C0967p0.m2248d(this.f11866e);
    }

    /* renamed from: i */
    public boolean mo11552i() {
        return false;
    }

    public String toString() {
        return C5167h.m11600a(this.f11866e);
    }
}
