package p425x.p426a.p427a;

/* renamed from: x.a.a.d1 */
public class C4931d1 extends C4996w {

    /* renamed from: g */
    public int f11767g;

    public C4931d1() {
        this.f11767g = -1;
    }

    public C4931d1(boolean z, C4929d[] dVarArr) {
        if (z) {
            super(z, dVarArr);
            this.f11767g = -1;
            return;
        }
        throw new IllegalStateException("DERSet elements should always be in sorted order");
    }

    /* renamed from: a */
    public void mo11548a(C4977q qVar, boolean z) {
        if (z) {
            qVar.f11861a.write(49);
        }
        C4919a1 a = qVar.mo11554a();
        int length = this.f11878e.length;
        int i = 0;
        if (this.f11767g >= 0 || length > 16) {
            qVar.mo11616a(mo11571m());
            while (i < length) {
                this.f11878e[i].mo11569f().mo11558k().mo11548a((C4977q) a, true);
                i++;
            }
            return;
        }
        C4983s[] sVarArr = new C4983s[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            C4983s k = this.f11878e[i3].mo11569f().mo11558k();
            sVarArr[i3] = k;
            i2 += k.mo11550h();
        }
        this.f11767g = i2;
        qVar.mo11616a(i2);
        while (i < length) {
            sVarArr[i].mo11548a((C4977q) a, true);
            i++;
        }
    }

    /* renamed from: h */
    public int mo11550h() {
        int m = mo11571m();
        return C4924b2.m11131a(m) + 1 + m;
    }

    /* renamed from: k */
    public C4983s mo11558k() {
        return this.f11879f ? this : super.mo11558k();
    }

    /* renamed from: l */
    public C4983s mo11559l() {
        return this;
    }

    /* renamed from: m */
    public final int mo11571m() {
        if (this.f11767g < 0) {
            int i = 0;
            for (C4929d f : this.f11878e) {
                i += f.mo11569f().mo11558k().mo11550h();
            }
            this.f11767g = i;
        }
        return this.f11767g;
    }
}
