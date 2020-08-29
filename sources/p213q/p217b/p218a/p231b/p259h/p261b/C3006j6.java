package p213q.p217b.p218a.p231b.p259h.p261b;

import android.os.Bundle;
import java.util.Iterator;
import java.util.TreeSet;
import p213q.p217b.p218a.p231b.p251g.p256e.C2442fc;

/* renamed from: q.b.a.b.h.b.j6 */
public final /* synthetic */ class C3006j6 implements Runnable {

    /* renamed from: e */
    public final C3018k6 f7452e;

    /* renamed from: f */
    public final Bundle f7453f;

    public C3006j6(C3018k6 k6Var, Bundle bundle) {
        this.f7452e = k6Var;
        this.f7453f = bundle;
    }

    public final void run() {
        boolean z;
        C3018k6 k6Var = this.f7452e;
        Bundle bundle = this.f7453f;
        if (C2442fc.m5827b() && k6Var.f7133a.f7338g.mo8574a(C3069p.f7693N0)) {
            if (bundle == null) {
                k6Var.mo8288l().f7619C.mo8688a(new Bundle());
                return;
            }
            Bundle a = k6Var.mo8288l().f7619C.mo8687a();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    k6Var.mo8287k();
                    if (C3156w9.m7409a(obj)) {
                        k6Var.mo8287k().mo8783a(27, (String) null, (String) null, 0);
                    }
                    k6Var.mo8285i().f7158k.mo8434a("Invalid default event parameter type. Name, value", str, obj);
                } else if (C3156w9.m7418i(str)) {
                    k6Var.mo8285i().f7158k.mo8433a("Invalid default event parameter name. Name", str);
                } else if (obj == null) {
                    a.remove(str);
                } else if (k6Var.mo8287k().mo8800a("param", str, 100, obj)) {
                    k6Var.mo8287k().mo8786a(a, str, obj);
                }
            }
            k6Var.mo8287k();
            int m = k6Var.f7133a.f7338g.mo8582m();
            if (a.size() > m) {
                Iterator it = new TreeSet(a.keySet()).iterator();
                int i = 0;
                while (true) {
                    z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    String str2 = (String) it.next();
                    i++;
                    if (i > m) {
                        a.remove(str2);
                    }
                }
            } else {
                z = false;
            }
            if (z) {
                k6Var.mo8287k().mo8783a(26, (String) null, (String) null, 0);
                k6Var.mo8285i().f7158k.mo8432a("Too many default event parameters set. Discarding beyond event parameter limit");
            }
            k6Var.mo8288l().f7619C.mo8688a(a);
            C3121t7 q = k6Var.mo8299q();
            q.mo8279c();
            q.mo8373v();
            q.mo8726a((Runnable) new C2948e8(q, a, q.mo8725a(false)));
        }
    }
}
