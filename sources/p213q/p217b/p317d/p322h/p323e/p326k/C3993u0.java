package p213q.p217b.p317d.p322h.p323e.p326k;

import android.util.Log;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p270l.C3239a;
import p213q.p217b.p218a.p231b.p270l.C3255i;
import p213q.p217b.p317d.p322h.p323e.C3913b;

/* renamed from: q.b.d.h.e.k.u0 */
public final /* synthetic */ class C3993u0 implements C3239a {

    /* renamed from: a */
    public final C3997w0 f9768a;

    public C3993u0(C3997w0 w0Var) {
        this.f9768a = w0Var;
    }

    /* renamed from: a */
    public Object mo8913a(C3255i iVar) {
        boolean z;
        C3997w0 w0Var = this.f9768a;
        if (w0Var != null) {
            if (iVar.mo8936d()) {
                C3954j0 j0Var = (C3954j0) iVar.mo8931b();
                C3913b bVar = C3913b.f9552c;
                StringBuilder a = C1965a.m4756a("Crashlytics report successfully enqueued to DataTransport: ");
                C3934c cVar = (C3934c) j0Var;
                a.append(cVar.f9599b);
                bVar.mo10108a(a.toString());
                w0Var.f9774b.mo10336a(cVar.f9599b);
                z = true;
            } else {
                C3913b bVar2 = C3913b.f9552c;
                Exception a2 = iVar.mo8920a();
                if (bVar2.mo10110a(3)) {
                    Log.d(bVar2.f9553a, "Crashlytics report could not be enqueued to DataTransport", a2);
                }
                z = false;
            }
            return Boolean.valueOf(z);
        }
        throw null;
    }
}
