package p213q.p217b.p218a.p231b.p259h.p261b;

import android.text.TextUtils;

/* renamed from: q.b.a.b.h.b.s5 */
public final class C3108s5 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C3047n f7842e;

    /* renamed from: f */
    public final /* synthetic */ C3189z9 f7843f;

    /* renamed from: g */
    public final /* synthetic */ C2981h5 f7844g;

    public C3108s5(C2981h5 h5Var, C3047n nVar, C3189z9 z9Var) {
        this.f7844g = h5Var;
        this.f7842e = nVar;
        this.f7843f = z9Var;
    }

    public final void run() {
        C2981h5 h5Var = this.f7844g;
        C3047n nVar = this.f7842e;
        C3189z9 z9Var = this.f7843f;
        if (h5Var != null) {
            boolean z = false;
            if ("_cmp".equals(nVar.f7582e)) {
                C3036m mVar = nVar.f7583f;
                if (!(mVar == null || mVar.f7556e.size() == 0)) {
                    String string = nVar.f7583f.f7556e.getString("_cis");
                    if (!TextUtils.isEmpty(string) && (("referrer broadcast".equals(string) || "referrer API".equals(string)) && h5Var.f7375a.f7537i.f7338g.mo8578c(z9Var.f8017e, C3069p.f7702S))) {
                        z = true;
                    }
                }
            }
            if (z) {
                h5Var.f7375a.mo8285i().f7159l.mo8433a("Event has been filtered ", nVar.toString());
                C3047n nVar2 = new C3047n("_cmpx", nVar.f7583f, nVar.f7584g, nVar.f7585h);
                nVar = nVar2;
            }
            this.f7844g.f7375a.mo8625o();
            this.f7844g.f7375a.mo8604a(nVar, this.f7843f);
            return;
        }
        throw null;
    }
}
