package p484y;

import p119o.p120a.C0942i;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.p401r.p403c.C4638h;

/* renamed from: y.p */
public final class C5333p implements C5271f<T> {

    /* renamed from: a */
    public final /* synthetic */ C0942i f12618a;

    public C5333p(C0942i iVar) {
        this.f12618a = iVar;
    }

    /* renamed from: a */
    public void mo11952a(C5264d<T> dVar, Throwable th) {
        if (dVar == null) {
            C4638h.m10271a("call");
            throw null;
        } else if (th != null) {
            this.f12618a.mo4217a(C2286e.m5184a(th));
        } else {
            C4638h.m10271a("t");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo11953a(C5264d<T> dVar, C5263c0<T> c0Var) {
        T t;
        C0942i iVar;
        if (dVar == null) {
            C4638h.m10271a("call");
            throw null;
        } else if (c0Var != null) {
            if (c0Var.mo11985a()) {
                iVar = this.f12618a;
                t = c0Var.f12550b;
            } else {
                iVar = this.f12618a;
                t = C2286e.m5184a((Throwable) new C5304j(c0Var));
            }
            iVar.mo4217a(t);
        } else {
            C4638h.m10271a("response");
            throw null;
        }
    }
}
