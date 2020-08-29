package p213q.p217b.p218a.p231b.p259h.p261b;

import android.os.Handler;
import android.os.Looper;
import p213q.p217b.p218a.p231b.p251g.p256e.C2354ae;

/* renamed from: q.b.a.b.h.b.x8 */
public final class C3166x8 extends C2921c5 {

    /* renamed from: c */
    public Handler f7967c;

    /* renamed from: d */
    public final C2973g9 f7968d = new C2973g9(this);

    /* renamed from: e */
    public final C2949e9 f7969e = new C2949e9(this);

    /* renamed from: f */
    public final C2937d9 f7970f = new C2937d9(this);

    public C3166x8(C2969g5 g5Var) {
        super(g5Var);
    }

    /* renamed from: a */
    public final boolean mo8824a(boolean z, boolean z2, long j) {
        return this.f7969e.mo8441a(z, z2, j);
    }

    /* renamed from: x */
    public final boolean mo8375x() {
        return false;
    }

    /* renamed from: y */
    public final void mo8825y() {
        mo8279c();
        if (this.f7967c == null) {
            this.f7967c = new C2354ae(Looper.getMainLooper());
        }
    }
}
