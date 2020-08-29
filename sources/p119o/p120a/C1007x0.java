package p119o.p120a;

import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.C4560l;
import p392u.p401r.p402b.C4618l;

/* renamed from: o.a.x0 */
public final class C1007x0 extends C0939h {

    /* renamed from: e */
    public final C4618l<Throwable, C4560l> f2655e;

    public C1007x0(C4618l<? super Throwable, C4560l> lVar) {
        this.f2655e = lVar;
    }

    /* renamed from: b */
    public Object mo3153b(Object obj) {
        this.f2655e.mo3153b((Throwable) obj);
        return C4560l.f10773a;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("InvokeOnCancel[");
        a.append(C2286e.m5309c((Object) this.f2655e));
        a.append('@');
        a.append(C2286e.m5323d((Object) this));
        a.append(']');
        return a.toString();
    }
}
