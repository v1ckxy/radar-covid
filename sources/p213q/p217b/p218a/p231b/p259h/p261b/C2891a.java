package p213q.p217b.p218a.p231b.p259h.p261b;

import android.os.Bundle;
import java.util.Map;
import p124p.p126b.p127k.C1061o;
import p124p.p143e.C1248a;

/* renamed from: q.b.a.b.h.b.a */
public final class C2891a extends C2906b2 {

    /* renamed from: b */
    public final Map<String, Long> f7112b = new C1248a();

    /* renamed from: c */
    public final Map<String, Integer> f7113c = new C1248a();

    /* renamed from: d */
    public long f7114d;

    public C2891a(C2969g5 g5Var) {
        super(g5Var);
    }

    /* renamed from: a */
    public final void mo8254a(long j) {
        C3044m7 a = mo8300r().mo8671a(false);
        for (String str : this.f7112b.keySet()) {
            mo8257a(str, j - ((Long) this.f7112b.get(str)).longValue(), a);
        }
        if (!this.f7112b.isEmpty()) {
            mo8255a(j - this.f7114d, a);
        }
        mo8258b(j);
    }

    /* renamed from: a */
    public final void mo8255a(long j, C3044m7 m7Var) {
        if (m7Var == null) {
            mo8285i().f7161n.mo8432a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            mo8285i().f7161n.mo8433a("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            C3066o7.m7152a(m7Var, bundle, true);
            mo8297o().mo8561a("am", "_xa", bundle);
        }
    }

    /* renamed from: b */
    public final void mo8258b(long j) {
        for (String put : this.f7112b.keySet()) {
            this.f7112b.put(put, Long.valueOf(j));
        }
        if (!this.f7112b.isEmpty()) {
            this.f7114d = j;
        }
    }

    /* renamed from: b */
    public final void mo8259b(String str, long j) {
        if (str == null || str.length() == 0) {
            mo8285i().f7153f.mo8432a("Ad unit id must be a non-empty string");
            return;
        }
        C3184z4 g = mo8283g();
        C3179z zVar = new C3179z(this, str, j);
        g.mo8846n();
        C1061o.m2524b(zVar);
        g.mo8843a(new C2945e5<>(g, zVar, "Task exception on worker thread"));
    }

    /* renamed from: a */
    public final void mo8256a(String str, long j) {
        if (str == null || str.length() == 0) {
            mo8285i().f7153f.mo8432a("Ad unit id must be a non-empty string");
            return;
        }
        C3184z4 g = mo8283g();
        C2893a1 a1Var = new C2893a1(this, str, j);
        g.mo8846n();
        C1061o.m2524b(a1Var);
        g.mo8843a(new C2945e5<>(g, a1Var, "Task exception on worker thread"));
    }

    /* renamed from: a */
    public final void mo8257a(String str, long j, C3044m7 m7Var) {
        if (m7Var == null) {
            mo8285i().f7161n.mo8432a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            mo8285i().f7161n.mo8433a("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            C3066o7.m7152a(m7Var, bundle, true);
            mo8297o().mo8561a("am", "_xu", bundle);
        }
    }
}
