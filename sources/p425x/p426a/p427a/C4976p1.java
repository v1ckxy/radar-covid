package p425x.p426a.p427a;

/* renamed from: x.a.a.p1 */
public class C4976p1 extends C4986t {

    /* renamed from: f */
    public int f11860f = -1;

    public C4976p1() {
    }

    public C4976p1(C4933e eVar) {
        super(eVar);
    }

    public C4976p1(C4929d[] dVarArr, boolean z) {
        super(dVarArr, z);
    }

    /* renamed from: a */
    public void mo11548a(C4977q qVar, boolean z) {
        if (z) {
            qVar.f11861a.write(48);
        }
        C4977q b = qVar.mo11556b();
        int length = this.f11868e.length;
        int i = 0;
        if (this.f11860f >= 0 || length > 16) {
            qVar.mo11616a(mo11615p());
            while (i < length) {
                b.mo11555a(this.f11868e[i].mo11569f(), true);
                i++;
            }
            return;
        }
        C4983s[] sVarArr = new C4983s[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            C4983s l = this.f11868e[i3].mo11569f().mo11559l();
            sVarArr[i3] = l;
            i2 += l.mo11550h();
        }
        this.f11860f = i2;
        qVar.mo11616a(i2);
        while (i < length) {
            b.mo11555a(sVarArr[i], true);
            i++;
        }
    }

    /* renamed from: h */
    public int mo11550h() {
        int p = mo11615p();
        return C4924b2.m11131a(p) + 1 + p;
    }

    /* renamed from: l */
    public C4983s mo11559l() {
        return this;
    }

    /* renamed from: p */
    public final int mo11615p() {
        if (this.f11860f < 0) {
            int i = 0;
            for (C4929d f : this.f11868e) {
                i += f.mo11569f().mo11559l().mo11550h();
            }
            this.f11860f = i;
        }
        return this.f11860f;
    }
}
