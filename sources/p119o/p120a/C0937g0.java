package p119o.p120a;

import p119o.p120a.p121a.C0890a;
import p119o.p120a.p121a.C0910o;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.p395p.C4580d;
import p392u.p395p.C4583f;

/* renamed from: o.a.g0 */
public final class C0937g0 {

    /* renamed from: a */
    public static final C0910o f2548a = new C0910o("UNDEFINED");

    /* renamed from: b */
    public static final C0910o f2549b = new C0910o("REUSABLE_CLAIMED");

    /* renamed from: a */
    public static final <T> void m2094a(C4580d<? super T> dVar, Object obj) {
        boolean z;
        C4583f b;
        Object b2;
        if (dVar instanceof C0931f0) {
            C0931f0 f0Var = (C0931f0) dVar;
            Object h = C2286e.m5348h(obj);
            if (f0Var.f2537k.mo4320b(f0Var.mo4219b())) {
                f0Var.f2534h = h;
                f0Var.f2559g = 1;
                f0Var.f2537k.mo4301a(f0Var.mo4219b(), f0Var);
                return;
            }
            C0968p1 p1Var = C0968p1.f2584b;
            C0955m0 a = C0968p1.m2253a();
            if (a.mo4297m()) {
                f0Var.f2534h = h;
                f0Var.f2559g = 1;
                a.mo4293a((C0943i0<?>) f0Var);
                return;
            }
            a.mo4296c(true);
            try {
                C0916a1 a1Var = (C0916a1) f0Var.mo4219b().get(C0916a1.f2512d);
                if (a1Var == null || a1Var.mo4208a()) {
                    z = false;
                } else {
                    f0Var.mo4217a(C2286e.m5184a((Throwable) a1Var.mo4209h()));
                    z = true;
                }
                if (!z) {
                    b = f0Var.mo4219b();
                    b2 = C0890a.m1971b(b, f0Var.f2536j);
                    f0Var.f2538l.mo4217a(obj);
                    C0890a.m1970a(b, b2);
                }
                do {
                } while (a.mo4299r());
            } catch (Throwable th) {
                try {
                    f0Var.mo4280a(th, (Throwable) null);
                } catch (Throwable th2) {
                    a.mo4294a(true);
                    throw th2;
                }
            }
            a.mo4294a(true);
            return;
        }
        dVar.mo4217a(obj);
    }
}
