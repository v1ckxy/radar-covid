package p119o.p120a;

import java.util.concurrent.CancellationException;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.C4560l;
import p392u.p395p.C4580d;
import p392u.p401r.p403c.C4638h;

/* renamed from: o.a.l */
public final class C0951l extends C0923c1<C0916a1> {

    /* renamed from: i */
    public final C0945j<?> f2568i;

    public C0951l(C0916a1 a1Var, C0945j<?> jVar) {
        super(a1Var);
        this.f2568i = jVar;
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object mo3153b(Object obj) {
        mo4271b((Throwable) obj);
        return C4560l.f10773a;
    }

    /* renamed from: b */
    public void mo4271b(Throwable th) {
        C0945j<?> jVar = this.f2568i;
        J j = this.f2530h;
        if (jVar != null) {
            CancellationException h = j.mo4209h();
            boolean z = false;
            if (jVar.f2559g == 0) {
                C4580d<T> dVar = jVar.f2563i;
                if (!(dVar instanceof C0931f0)) {
                    dVar = null;
                }
                C0931f0 f0Var = (C0931f0) dVar;
                if (f0Var != null) {
                    while (true) {
                        Object obj = f0Var._reusableCancellableContinuation;
                        if (C4638h.m10272a(obj, (Object) C0937g0.f2549b)) {
                            if (C0931f0.f2533m.compareAndSet(f0Var, C0937g0.f2549b, h)) {
                                break;
                            }
                        } else if (obj instanceof Throwable) {
                            break;
                        } else if (C0931f0.f2533m.compareAndSet(f0Var, obj, null)) {
                            break;
                        }
                    }
                    z = true;
                }
            }
            if (!z) {
                jVar.mo4285a((Throwable) h);
                jVar.mo4286d();
                return;
            }
            return;
        }
        throw null;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("ChildContinuation[");
        a.append(this.f2568i);
        a.append(']');
        return a.toString();
    }
}
