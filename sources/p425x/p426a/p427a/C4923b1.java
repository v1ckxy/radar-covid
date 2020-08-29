package p425x.p426a.p427a;

import java.util.Arrays;
import p119o.p120a.C0967p0;
import p425x.p426a.p469f.C5167h;

/* renamed from: x.a.a.b1 */
public class C4923b1 extends C4983s {

    /* renamed from: e */
    public final byte[] f11724e;

    public C4923b1(byte[] bArr) {
        this.f11724e = bArr;
    }

    /* renamed from: a */
    public void mo11548a(C4977q qVar, boolean z) {
        qVar.mo11622a(z, 19, this.f11724e);
    }

    /* renamed from: a */
    public boolean mo11549a(C4983s sVar) {
        if (!(sVar instanceof C4923b1)) {
            return false;
        }
        return Arrays.equals(this.f11724e, ((C4923b1) sVar).f11724e);
    }

    /* renamed from: h */
    public int mo11550h() {
        return C4924b2.m11131a(this.f11724e.length) + 1 + this.f11724e.length;
    }

    public int hashCode() {
        return C0967p0.m2248d(this.f11724e);
    }

    /* renamed from: i */
    public boolean mo11552i() {
        return false;
    }

    public String toString() {
        return C5167h.m11600a(this.f11724e);
    }
}
