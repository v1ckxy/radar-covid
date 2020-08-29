package p425x.p426a.p427a;

/* renamed from: x.a.a.r1 */
public class C4982r1 extends C4996w {

    /* renamed from: g */
    public int f11865g = -1;

    public C4982r1() {
    }

    public C4982r1(C4929d dVar) {
        super(dVar);
    }

    public C4982r1(C4933e eVar) {
        super(eVar, false);
    }

    public C4982r1(boolean z, C4929d[] dVarArr) {
        super(z, dVarArr);
    }

    /* renamed from: a */
    public void mo11548a(C4977q qVar, boolean z) {
        if (z) {
            qVar.f11861a.write(49);
        }
        C4977q b = qVar.mo11556b();
        int length = this.f11878e.length;
        int i = 0;
        if (this.f11865g >= 0 || length > 16) {
            qVar.mo11616a(mo11625m());
            while (i < length) {
                b.mo11555a(this.f11878e[i].mo11569f(), true);
                i++;
            }
            return;
        }
        C4983s[] sVarArr = new C4983s[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            C4983s l = this.f11878e[i3].mo11569f().mo11559l();
            sVarArr[i3] = l;
            i2 += l.mo11550h();
        }
        this.f11865g = i2;
        qVar.mo11616a(i2);
        while (i < length) {
            b.mo11555a(sVarArr[i], true);
            i++;
        }
    }

    /* renamed from: h */
    public int mo11550h() {
        int m = mo11625m();
        return C4924b2.m11131a(m) + 1 + m;
    }

    /* renamed from: l */
    public C4983s mo11559l() {
        return this;
    }

    /* renamed from: m */
    public final int mo11625m() {
        if (this.f11865g < 0) {
            int i = 0;
            for (C4929d f : this.f11878e) {
                i += f.mo11569f().mo11559l().mo11550h();
            }
            this.f11865g = i;
        }
        return this.f11865g;
    }
}
