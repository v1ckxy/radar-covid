package p425x.p426a.p427a;

import java.util.Arrays;
import p119o.p120a.C0967p0;
import p425x.p426a.p469f.C5167h;

/* renamed from: x.a.a.b0 */
public class C4922b0 extends C4983s {

    /* renamed from: e */
    public byte[] f11723e;

    public C4922b0(byte[] bArr) {
        if (bArr.length >= 2) {
            this.f11723e = bArr;
            if (!mo11563e(0) || !mo11563e(1)) {
                throw new IllegalArgumentException("illegal characters in UTCTime string");
            }
            return;
        }
        throw new IllegalArgumentException("UTCTime string too short");
    }

    /* renamed from: a */
    public void mo11548a(C4977q qVar, boolean z) {
        qVar.mo11622a(z, 23, this.f11723e);
    }

    /* renamed from: a */
    public boolean mo11549a(C4983s sVar) {
        if (!(sVar instanceof C4922b0)) {
            return false;
        }
        return Arrays.equals(this.f11723e, ((C4922b0) sVar).f11723e);
    }

    /* renamed from: e */
    public final boolean mo11563e(int i) {
        byte[] bArr = this.f11723e;
        return bArr.length > i && bArr[i] >= 48 && bArr[i] <= 57;
    }

    /* renamed from: h */
    public int mo11550h() {
        int length = this.f11723e.length;
        return C4924b2.m11131a(length) + 1 + length;
    }

    public int hashCode() {
        return C0967p0.m2248d(this.f11723e);
    }

    /* renamed from: i */
    public boolean mo11552i() {
        return false;
    }

    public String toString() {
        return C5167h.m11600a(this.f11723e);
    }
}
