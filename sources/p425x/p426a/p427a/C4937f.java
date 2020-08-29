package p425x.p426a.p427a;

import java.util.Arrays;
import p119o.p120a.C0967p0;

/* renamed from: x.a.a.f */
public class C4937f extends C4983s {

    /* renamed from: f */
    public static C4937f[] f11788f = new C4937f[12];

    /* renamed from: e */
    public final byte[] f11789e;

    public C4937f(byte[] bArr) {
        if (C4958k.m11233b(bArr)) {
            throw new IllegalArgumentException("malformed enumerated");
        } else if ((bArr[0] & 128) == 0) {
            this.f11789e = C0967p0.m2217a(bArr);
            C4958k.m11234c(bArr);
        } else {
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
    }

    /* renamed from: a */
    public void mo11548a(C4977q qVar, boolean z) {
        qVar.mo11622a(z, 10, this.f11789e);
    }

    /* renamed from: a */
    public boolean mo11549a(C4983s sVar) {
        if (!(sVar instanceof C4937f)) {
            return false;
        }
        return Arrays.equals(this.f11789e, ((C4937f) sVar).f11789e);
    }

    /* renamed from: h */
    public int mo11550h() {
        return C4924b2.m11131a(this.f11789e.length) + 1 + this.f11789e.length;
    }

    public int hashCode() {
        return C0967p0.m2248d(this.f11789e);
    }

    /* renamed from: i */
    public boolean mo11552i() {
        return false;
    }
}
