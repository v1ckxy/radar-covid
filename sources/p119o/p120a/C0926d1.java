package p119o.p120a;

/* renamed from: o.a.d1 */
public class C0926d1 extends C0932f1 implements C0972r {

    /* renamed from: f */
    public final boolean f2526f;

    public C0926d1(C0916a1 a1Var) {
        boolean z = true;
        super(true);
        mo4248a(a1Var);
        C0954m mVar = (C0954m) this._parentHandle;
        if (!(mVar instanceof C0957n)) {
            mVar = null;
        }
        C0957n nVar = (C0957n) mVar;
        if (nVar != null) {
            C0932f1 f1Var = (C0932f1) nVar.f2530h;
            if (f1Var != null) {
                while (true) {
                    if (!f1Var.mo4227e()) {
                        C0954m mVar2 = (C0954m) f1Var._parentHandle;
                        if (!(mVar2 instanceof C0957n)) {
                            mVar2 = null;
                        }
                        C0957n nVar2 = (C0957n) mVar2;
                        if (nVar2 == null) {
                            break;
                        }
                        f1Var = (C0932f1) nVar2.f2530h;
                        if (f1Var == null) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        z = false;
        this.f2526f = z;
    }

    /* renamed from: e */
    public boolean mo4227e() {
        return this.f2526f;
    }

    /* renamed from: f */
    public boolean mo4228f() {
        return true;
    }
}
