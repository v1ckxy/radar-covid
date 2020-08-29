package p425x.p426a.p427a;

/* renamed from: x.a.a.t1 */
public class C4989t1 extends C5005z {
    public C4989t1(boolean z, int i, C4929d dVar) {
        super(z, i, dVar);
    }

    /* renamed from: a */
    public void mo11548a(C4977q qVar, boolean z) {
        C4983s l = this.f11895g.mo11569f().mo11559l();
        qVar.mo11620a(z, (this.f11894f || l.mo11552i()) ? 160 : 128, this.f11893e);
        if (this.f11894f) {
            qVar.mo11616a(l.mo11550h());
        }
        qVar.mo11556b().mo11555a(l, this.f11894f);
    }

    /* renamed from: h */
    public int mo11550h() {
        int h = this.f11895g.mo11569f().mo11559l().mo11550h();
        if (this.f11894f) {
            return C4924b2.m11131a(h) + C4924b2.m11133b(this.f11893e) + h;
        }
        return C4924b2.m11133b(this.f11893e) + (h - 1);
    }

    /* renamed from: i */
    public boolean mo11552i() {
        return this.f11894f || this.f11895g.mo11569f().mo11559l().mo11552i();
    }

    /* renamed from: l */
    public C4983s mo11559l() {
        return this;
    }
}
