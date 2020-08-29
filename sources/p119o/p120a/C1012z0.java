package p119o.p120a;

import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.C4560l;
import p392u.p401r.p402b.C4618l;

/* renamed from: o.a.z0 */
public final class C1012z0 extends C0929e1<C0916a1> {

    /* renamed from: i */
    public final C4618l<Throwable, C4560l> f2660i;

    public C1012z0(C0916a1 a1Var, C4618l<? super Throwable, C4560l> lVar) {
        super(a1Var);
        this.f2660i = lVar;
    }

    /* renamed from: b */
    public Object mo3153b(Object obj) {
        this.f2660i.mo3153b((Throwable) obj);
        return C4560l.f10773a;
    }

    /* renamed from: b */
    public void mo4271b(Throwable th) {
        this.f2660i.mo3153b(th);
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("InvokeOnCompletion[");
        a.append(C1012z0.class.getSimpleName());
        a.append('@');
        a.append(C2286e.m5323d((Object) this));
        a.append(']');
        return a.toString();
    }
}
