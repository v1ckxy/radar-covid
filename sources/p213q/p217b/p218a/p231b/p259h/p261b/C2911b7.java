package p213q.p217b.p218a.p231b.p259h.p261b;

import android.content.SharedPreferences.Editor;

/* renamed from: q.b.a.b.h.b.b7 */
public final class C2911b7 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ boolean f7164e;

    /* renamed from: f */
    public final /* synthetic */ C3018k6 f7165f;

    public C2911b7(C3018k6 k6Var, boolean z) {
        this.f7165f = k6Var;
        this.f7164e = z;
    }

    public final void run() {
        C3018k6 k6Var = this.f7165f;
        boolean z = this.f7164e;
        k6Var.mo8279c();
        k6Var.mo8277a();
        k6Var.mo8373v();
        k6Var.mo8285i().f7160m.mo8433a("Setting app measurement enabled (FE)", Boolean.valueOf(z));
        C3063o4 l = k6Var.mo8288l();
        l.mo8279c();
        Editor edit = l.mo8667s().edit();
        edit.putBoolean("measurement_enabled", z);
        edit.apply();
        k6Var.mo8554B();
    }
}
