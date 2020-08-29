package p425x.p426a.p427a;

/* renamed from: x.a.a.c1 */
public class C4927c1 extends C4986t {

    /* renamed from: f */
    public int f11729f = -1;

    public C4927c1(C4933e eVar) {
        super(eVar);
    }

    public C4927c1(C4929d[] dVarArr, boolean z) {
        super(dVarArr, z);
    }

    /* renamed from: a */
    public void mo11548a(C4977q qVar, boolean z) {
        if (z) {
            qVar.f11861a.write(48);
        }
        C4919a1 a = qVar.mo11554a();
        int length = this.f11868e.length;
        int i = 0;
        if (this.f11729f >= 0 || length > 16) {
            qVar.mo11616a(mo11568p());
            while (i < length) {
                this.f11868e[i].mo11569f().mo11558k().mo11548a((C4977q) a, true);
                i++;
            }
            return;
        }
        C4983s[] sVarArr = new C4983s[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            C4983s k = this.f11868e[i3].mo11569f().mo11558k();
            sVarArr[i3] = k;
            i2 += k.mo11550h();
        }
        this.f11729f = i2;
        qVar.mo11616a(i2);
        while (i < length) {
            sVarArr[i].mo11548a((C4977q) a, true);
            i++;
        }
    }

    /* renamed from: h */
    public int mo11550h() {
        int p = mo11568p();
        return C4924b2.m11131a(p) + 1 + p;
    }

    /* renamed from: k */
    public C4983s mo11558k() {
        return this;
    }

    /* renamed from: l */
    public C4983s mo11559l() {
        return this;
    }

    /* renamed from: p */
    public final int mo11568p() {
        if (this.f11729f < 0) {
            int i = 0;
            for (C4929d f : this.f11868e) {
                i += f.mo11569f().mo11558k().mo11550h();
            }
            this.f11729f = i;
        }
        return this.f11729f;
    }
}
