package p213q.p217b.p317d.p347l;

import android.util.Log;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.d.l.j0 */
public final /* synthetic */ class C4240j0 implements Runnable {

    /* renamed from: e */
    public final C4234g0 f10214e;

    public C4240j0(C4234g0 g0Var) {
        this.f10214e = g0Var;
    }

    public final void run() {
        C4234g0 g0Var = this.f10214e;
        String action = g0Var.f10202a.getAction();
        StringBuilder sb = new StringBuilder(C1965a.m4743a(action, 61));
        sb.append("Service took too long to process intent: ");
        sb.append(action);
        sb.append(" App may get closed.");
        Log.w("FirebaseInstanceId", sb.toString());
        g0Var.mo10424a();
    }
}
