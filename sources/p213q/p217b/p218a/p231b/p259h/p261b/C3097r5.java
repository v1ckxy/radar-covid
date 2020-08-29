package p213q.p217b.p218a.p231b.p259h.p261b;

import android.text.TextUtils;
import java.util.List;
import p213q.p217b.p218a.p231b.p251g.p256e.C2424ec;

/* renamed from: q.b.a.b.h.b.r5 */
public final class C3097r5 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C3047n f7823e;

    /* renamed from: f */
    public final /* synthetic */ String f7824f;

    /* renamed from: g */
    public final /* synthetic */ C2981h5 f7825g;

    public C3097r5(C2981h5 h5Var, C3047n nVar, String str) {
        this.f7825g = h5Var;
        this.f7823e = nVar;
        this.f7824f = str;
    }

    public final void run() {
        C3033l9 l9Var;
        String str;
        this.f7825g.f7375a.mo8625o();
        C3033l9 l9Var2 = this.f7825g.f7375a;
        C3047n nVar = this.f7823e;
        String str2 = this.f7824f;
        C2920c4 b = l9Var2.mo8619d().mo8413b(str2);
        if (b == null || TextUtils.isEmpty(b.mo8361p())) {
            l9Var2.f7537i.mo8285i().f7160m.mo8433a("No app data available; dropping event", str2);
            return;
        }
        Boolean b2 = l9Var2.mo8609b(b);
        if (b2 == null) {
            if (!"_ui".equals(nVar.f7582e)) {
                l9Var2.f7537i.mo8285i().f7156i.mo8433a("Could not find package. appId", C2908b4.m6745a(str2));
            }
        } else if (!b2.booleanValue()) {
            l9Var2.f7537i.mo8285i().f7153f.mo8433a("App version does not match; dropping event. appId", C2908b4.m6745a(str2));
            return;
        }
        String i = b.mo8351i();
        String p = b.mo8361p();
        long q = b.mo8362q();
        String r = b.mo8363r();
        long s = b.mo8364s();
        long t = b.mo8365t();
        boolean v = b.mo8367v();
        String m = b.mo8358m();
        long b3 = b.mo8328b();
        boolean c = b.mo8335c();
        boolean d = b.mo8338d();
        String j = b.mo8354j();
        Boolean e = b.mo8339e();
        long u = b.mo8366u();
        List f = b.mo8342f();
        if (C2424ec.m5790b()) {
            l9Var = l9Var2;
            if (l9Var2.f7537i.f7338g.mo8578c(b.mo8345g(), C3069p.f7741o0)) {
                str = b.mo8356k();
                C3189z9 z9Var = r3;
                C3189z9 z9Var2 = new C3189z9(str2, i, p, q, r, s, t, (String) null, v, false, m, b3, 0, 0, c, d, false, j, e, u, f, str);
                l9Var.mo8614b(nVar, z9Var);
            }
        } else {
            l9Var = l9Var2;
        }
        str = null;
        C3189z9 z9Var3 = z9Var2;
        C3189z9 z9Var22 = new C3189z9(str2, i, p, q, r, s, t, (String) null, v, false, m, b3, 0, 0, c, d, false, j, e, u, f, str);
        l9Var.mo8614b(nVar, z9Var3);
    }
}
