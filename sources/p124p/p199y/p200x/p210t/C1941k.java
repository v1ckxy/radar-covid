package p124p.p199y.p200x.p210t;

import androidx.work.impl.WorkDatabase;
import p124p.p199y.C1800l;
import p124p.p199y.C1816t;
import p124p.p199y.p200x.C1825d;
import p124p.p199y.p200x.C1842l;
import p124p.p199y.p200x.p209s.C1915q;
import p124p.p199y.p200x.p209s.C1916r;

/* renamed from: p.y.x.t.k */
public class C1941k implements Runnable {

    /* renamed from: h */
    public static final String f5582h = C1800l.m4459a("StopWorkRunnable");

    /* renamed from: e */
    public final C1842l f5583e;

    /* renamed from: f */
    public final String f5584f;

    /* renamed from: g */
    public final boolean f5585g;

    public C1941k(C1842l lVar, String str, boolean z) {
        this.f5583e = lVar;
        this.f5584f = str;
        this.f5585g = z;
    }

    public void run() {
        boolean z;
        C1842l lVar = this.f5583e;
        WorkDatabase workDatabase = lVar.f5350c;
        C1825d dVar = lVar.f5353f;
        C1915q m = workDatabase.mo1462m();
        workDatabase.mo6416c();
        try {
            boolean c = dVar.mo6803c(this.f5584f);
            if (this.f5585g) {
                z = this.f5583e.f5353f.mo6806f(this.f5584f);
            } else {
                if (!c) {
                    C1916r rVar = (C1916r) m;
                    if (rVar.mo6908b(this.f5584f) == C1816t.RUNNING) {
                        rVar.mo6902a(C1816t.ENQUEUED, this.f5584f);
                    }
                }
                z = this.f5583e.f5353f.mo6807g(this.f5584f);
            }
            C1800l.m4460a().mo6782a(f5582h, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", new Object[]{this.f5584f, Boolean.valueOf(z)}), new Throwable[0]);
            workDatabase.mo6420g();
        } finally {
            workDatabase.mo6417d();
        }
    }
}
