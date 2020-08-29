package p213q.p217b.p218a.p231b.p239d.p240m.p241k;

import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.C2115b;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2169e.C2171b;
import p213q.p217b.p218a.p231b.p239d.p242n.C2241h;
import p213q.p217b.p218a.p231b.p239d.p242n.C2273y;
import p213q.p217b.p218a.p231b.p267j.p268b.C3231n;

/* renamed from: q.b.a.b.d.m.k.c0 */
public final class C2166c0 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C3231n f6038e;

    /* renamed from: f */
    public final /* synthetic */ C2161a0 f6039f;

    public C2166c0(C2161a0 a0Var, C3231n nVar) {
        this.f6039f = a0Var;
        this.f6038e = nVar;
    }

    public final void run() {
        C2161a0 a0Var = this.f6039f;
        C3231n nVar = this.f6038e;
        if (a0Var != null) {
            C2115b bVar = nVar.f8093f;
            if (bVar.mo7093c()) {
                C2273y yVar = nVar.f8094g;
                C1061o.m2524b(yVar);
                bVar = yVar.f6238g;
                if (!bVar.mo7093c()) {
                    String valueOf = String.valueOf(bVar);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 48);
                    sb.append("Sign-in succeeded with resolve account failure: ");
                    sb.append(valueOf);
                    Log.wtf("SignInCoordinator", sb.toString(), new Exception());
                } else {
                    C2163b0 b0Var = a0Var.f6029g;
                    C2241h c = yVar.mo7295c();
                    Set<Scope> set = a0Var.f6026d;
                    C2171b bVar2 = (C2171b) b0Var;
                    if (bVar2 == null) {
                        throw null;
                    } else if (c == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        bVar2.mo7188b(new C2115b(4));
                        a0Var.f6028f.mo7136i();
                        return;
                    } else {
                        bVar2.f6073c = c;
                        bVar2.f6074d = set;
                        if (bVar2.f6075e) {
                            bVar2.f6071a.mo7127a(c, set);
                        }
                        a0Var.f6028f.mo7136i();
                        return;
                    }
                }
            }
            ((C2171b) a0Var.f6029g).mo7188b(bVar);
            a0Var.f6028f.mo7136i();
            return;
        }
        throw null;
    }
}
