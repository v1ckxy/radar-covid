package p213q.p217b.p317d.p322h.p323e.p326k;

import java.util.concurrent.Callable;
import p213q.p217b.p317d.p322h.p323e.C3913b;

/* renamed from: q.b.d.h.e.k.g0 */
public class C3947g0 implements Callable<Boolean> {

    /* renamed from: e */
    public final /* synthetic */ C3941f0 f9639e;

    public C3947g0(C3941f0 f0Var) {
        this.f9639e = f0Var;
    }

    public Object call() {
        boolean z;
        C3975t tVar = this.f9639e.f9614g;
        if (!tVar.f9720c.mo10142b().exists()) {
            String a = tVar.mo10164a();
            z = a != null && tVar.f9732o.mo10107d(a);
        } else {
            C3913b.f9552c.mo10108a("Found previous crash marker.");
            tVar.f9720c.mo10142b().delete();
            z = Boolean.TRUE.booleanValue();
        }
        return Boolean.valueOf(z);
    }
}
