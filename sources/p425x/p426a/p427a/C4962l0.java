package p425x.p426a.p427a;

import java.util.Enumeration;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: x.a.a.l0 */
public class C4962l0 extends C5005z {
    public C4962l0(boolean z, int i, C4929d dVar) {
        super(z, i, dVar);
    }

    /* renamed from: a */
    public void mo11548a(C4977q qVar, boolean z) {
        Enumeration enumeration;
        qVar.mo11620a(z, 160, this.f11893e);
        qVar.f11861a.write(128);
        if (!this.f11894f) {
            C4929d dVar = this.f11895g;
            if (dVar instanceof C4971o) {
                enumeration = dVar instanceof C4938f0 ? ((C4938f0) dVar).mo11576m() : new C4938f0(((C4971o) dVar).f11858e).mo11576m();
            } else if (dVar instanceof C4986t) {
                enumeration = ((C4986t) dVar).mo11630m();
            } else if (dVar instanceof C4996w) {
                C4996w wVar = (C4996w) dVar;
                if (wVar != null) {
                    enumeration = new C4993v(wVar);
                } else {
                    throw null;
                }
            } else {
                StringBuilder a = C1965a.m4756a("not implemented: ");
                a.append(this.f11895g.getClass().getName());
                throw new C4942g(a.toString());
            }
            qVar.mo11617a(enumeration);
        } else {
            qVar.mo11555a(this.f11895g.mo11569f(), true);
        }
        qVar.f11861a.write(0);
        qVar.f11861a.write(0);
    }

    /* renamed from: h */
    public int mo11550h() {
        int h = this.f11895g.mo11569f().mo11550h();
        if (this.f11894f) {
            return C4924b2.m11131a(h) + C4924b2.m11133b(this.f11893e) + h;
        }
        return C4924b2.m11133b(this.f11893e) + (h - 1);
    }

    /* renamed from: i */
    public boolean mo11552i() {
        return this.f11894f || this.f11895g.mo11569f().mo11552i();
    }
}
