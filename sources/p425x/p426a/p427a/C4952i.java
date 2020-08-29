package p425x.p426a.p427a;

import java.util.Arrays;
import p119o.p120a.C0967p0;

/* renamed from: x.a.a.i */
public class C4952i extends C4983s {

    /* renamed from: e */
    public byte[] f11835e;

    public C4952i(byte[] bArr) {
        if (bArr.length >= 4) {
            this.f11835e = bArr;
            if (!mo11587e(0) || !mo11587e(1) || !mo11587e(2) || !mo11587e(3)) {
                throw new IllegalArgumentException("illegal characters in GeneralizedTime string");
            }
            return;
        }
        throw new IllegalArgumentException("GeneralizedTime string too short");
    }

    /* renamed from: a */
    public void mo11548a(C4977q qVar, boolean z) {
        qVar.mo11622a(z, 24, this.f11835e);
    }

    /* renamed from: a */
    public boolean mo11549a(C4983s sVar) {
        if (!(sVar instanceof C4952i)) {
            return false;
        }
        return Arrays.equals(this.f11835e, ((C4952i) sVar).f11835e);
    }

    /* renamed from: e */
    public final boolean mo11587e(int i) {
        byte[] bArr = this.f11835e;
        return bArr.length > i && bArr[i] >= 48 && bArr[i] <= 57;
    }

    /* renamed from: h */
    public int mo11550h() {
        int length = this.f11835e.length;
        return C4924b2.m11131a(length) + 1 + length;
    }

    public int hashCode() {
        return C0967p0.m2248d(this.f11835e);
    }

    /* renamed from: i */
    public boolean mo11552i() {
        return false;
    }

    /* renamed from: k */
    public C4983s mo11558k() {
        return new C4988t0(this.f11835e);
    }

    /* renamed from: l */
    public C4983s mo11559l() {
        return new C4988t0(this.f11835e);
    }
}
