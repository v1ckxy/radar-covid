package p119o.p120a;

import java.util.concurrent.CancellationException;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.C4560l;

/* renamed from: o.a.n */
public final class C0957n extends C0923c1<C0932f1> implements C0954m {

    /* renamed from: i */
    public final C0962o f2573i;

    public C0957n(C0932f1 f1Var, C0962o oVar) {
        super(f1Var);
        this.f2573i = oVar;
    }

    /* renamed from: a */
    public boolean mo4290a(Throwable th) {
        C0932f1 f1Var = (C0932f1) this.f2530h;
        if (f1Var == null) {
            throw null;
        } else if (th instanceof CancellationException) {
            return true;
        } else {
            return f1Var.mo4258c((Object) th) && f1Var.mo4227e();
        }
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object mo3153b(Object obj) {
        mo4271b((Throwable) obj);
        return C4560l.f10773a;
    }

    /* renamed from: b */
    public void mo4271b(Throwable th) {
        this.f2573i.mo4251a((C0956m1) this.f2530h);
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("ChildHandle[");
        a.append(this.f2573i);
        a.append(']');
        return a.toString();
    }
}
