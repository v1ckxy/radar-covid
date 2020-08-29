package p213q.p217b.p218a.p231b.p259h.p261b;

import android.os.Bundle;

/* renamed from: q.b.a.b.h.b.n7 */
public final class C3055n7 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ Bundle f7603e;

    /* renamed from: f */
    public final /* synthetic */ C3044m7 f7604f;

    /* renamed from: g */
    public final /* synthetic */ C3044m7 f7605g;

    /* renamed from: h */
    public final /* synthetic */ long f7606h;

    /* renamed from: i */
    public final /* synthetic */ C3066o7 f7607i;

    public C3055n7(C3066o7 o7Var, Bundle bundle, C3044m7 m7Var, C3044m7 m7Var2, long j) {
        this.f7607i = o7Var;
        this.f7603e = bundle;
        this.f7604f = m7Var;
        this.f7605g = m7Var2;
        this.f7606h = j;
    }

    public final void run() {
        C3066o7 o7Var = this.f7607i;
        Bundle bundle = this.f7603e;
        C3044m7 m7Var = this.f7604f;
        C3044m7 m7Var2 = this.f7605g;
        long j = this.f7606h;
        if (o7Var != null) {
            if (bundle != null) {
                bundle.remove("screen_name");
                bundle.remove("screen_class");
            }
            o7Var.mo8677a(m7Var, m7Var2, j, true, o7Var.mo8287k().mo8779a((String) null, "screen_view", bundle, null, true, true));
            return;
        }
        throw null;
    }
}
