package p213q.p217b.p218a.p231b.p259h.p261b;

import android.os.RemoteException;

/* renamed from: q.b.a.b.h.b.b8 */
public final class C2912b8 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C3044m7 f7166e;

    /* renamed from: f */
    public final /* synthetic */ C3121t7 f7167f;

    public C2912b8(C3121t7 t7Var, C3044m7 m7Var) {
        this.f7167f = t7Var;
        this.f7166e = m7Var;
    }

    public final void run() {
        long j;
        String str;
        String str2;
        String packageName;
        C3121t7 t7Var = this.f7167f;
        C3117t3 t3Var = t7Var.f7868d;
        if (t3Var == null) {
            t7Var.mo8285i().f7153f.mo8432a("Failed to send current screen to service");
            return;
        }
        try {
            if (this.f7166e == null) {
                j = 0;
                str = null;
                str2 = null;
                packageName = t7Var.f7133a.f7332a.getPackageName();
            } else {
                j = this.f7166e.f7569c;
                str = this.f7166e.f7567a;
                str2 = this.f7166e.f7568b;
                packageName = t7Var.f7133a.f7332a.getPackageName();
            }
            t3Var.mo8503a(j, str, str2, packageName);
            this.f7167f.mo8722C();
        } catch (RemoteException e) {
            this.f7167f.mo8285i().f7153f.mo8433a("Failed to send current screen to the service", e);
        }
    }
}
