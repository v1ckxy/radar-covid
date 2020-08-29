package p213q.p217b.p218a.p231b.p259h.p261b;

import android.content.Context;
import android.content.Intent;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p259h.p261b.C3177y8;

/* renamed from: q.b.a.b.h.b.u8 */
public final class C3133u8<T extends Context & C3177y8> {

    /* renamed from: a */
    public final T f7906a;

    public C3133u8(T t) {
        C1061o.m2524b(t);
        this.f7906a = t;
    }

    /* renamed from: a */
    public final C2908b4 mo8754a() {
        return C2969g5.m6914a(this.f7906a, null, null).mo8285i();
    }

    /* renamed from: a */
    public final void mo8755a(Runnable runnable) {
        C3033l9 a = C3033l9.m7072a((Context) this.f7906a);
        C3184z4 g = a.mo8283g();
        C3144v8 v8Var = new C3144v8(a, runnable);
        g.mo8846n();
        C1061o.m2524b(v8Var);
        g.mo8843a(new C2945e5<>(g, v8Var, "Task exception on worker thread"));
    }

    /* renamed from: b */
    public final void mo8757b(Intent intent) {
        if (intent == null) {
            mo8754a().f7153f.mo8432a("onRebind called with null intent");
            return;
        }
        mo8754a().f7161n.mo8433a("onRebind called. action", intent.getAction());
    }

    /* renamed from: a */
    public final boolean mo8756a(Intent intent) {
        if (intent == null) {
            mo8754a().f7153f.mo8432a("onUnbind called with null intent");
            return true;
        }
        mo8754a().f7161n.mo8433a("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
