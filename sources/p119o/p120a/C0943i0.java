package p119o.p120a;

import p119o.p120a.p121a.C0890a;
import p119o.p120a.p123u1.C0996h;
import p119o.p120a.p123u1.C0997i;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.C4554g;
import p392u.C4557i;
import p392u.C4560l;
import p392u.p395p.C4580d;
import p392u.p395p.C4583f;
import p392u.p401r.p403c.C4638h;

/* renamed from: o.a.i0 */
public abstract class C0943i0<T> extends C0996h {

    /* renamed from: g */
    public int f2559g;

    public C0943i0(int i) {
        this.f2559g = i;
    }

    /* renamed from: a */
    public abstract C4580d<T> mo4239a();

    /* renamed from: a */
    public void mo4279a(Object obj, Throwable th) {
    }

    /* renamed from: a */
    public final void mo4280a(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                C2286e.m5240a(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Fatal exception in coroutines machinery for ");
            sb.append(this);
            sb.append(". ");
            sb.append("Please read KDoc to 'handleFatalException' method and report this incident to maintainers");
            String sb2 = sb.toString();
            if (th != null) {
                C2286e.m5249a(mo4239a().mo4219b(), (Throwable) new C0925d0(sb2, th));
                return;
            }
            C4638h.m10269a();
            throw null;
        }
    }

    /* renamed from: b */
    public <T> T mo4281b(Object obj) {
        return obj;
    }

    /* renamed from: c */
    public abstract Object mo4240c();

    public final void run() {
        Object obj;
        C4583f b;
        Object b2;
        Object obj2;
        Object obj3;
        C0997i iVar = this.f2641f;
        try {
            C4580d a = mo4239a();
            if (a != null) {
                C0931f0 f0Var = (C0931f0) a;
                C4580d<T> dVar = f0Var.f2538l;
                b = dVar.mo4219b();
                Object c = mo4240c();
                b2 = C0890a.m1971b(b, f0Var.f2536j);
                C0975s sVar = (C0975s) (!(c instanceof C0975s) ? null : c);
                Throwable th = sVar != null ? sVar.f2591a : null;
                C0916a1 a1Var = C2286e.m5314c(this.f2559g) ? (C0916a1) b.get(C0916a1.f2512d) : null;
                if (th == null && a1Var != null && !a1Var.mo4208a()) {
                    th = a1Var.mo4209h();
                    mo4279a(c, th);
                } else if (th == null) {
                    obj2 = mo4281b(c);
                    dVar.mo4217a(obj2);
                    C0890a.m1970a(b, b2);
                    iVar.mo4353f();
                    obj3 = C4560l.f10773a;
                    mo4280a((Throwable) null, C4554g.m10211b(obj3));
                    return;
                }
                obj2 = C2286e.m5184a(th);
                dVar.mo4217a(obj2);
                C0890a.m1970a(b, b2);
                try {
                    iVar.mo4353f();
                    obj3 = C4560l.f10773a;
                } catch (Throwable th2) {
                    obj3 = C2286e.m5184a(th2);
                }
                mo4280a((Throwable) null, C4554g.m10211b(obj3));
                return;
            }
            throw new C4557i("null cannot be cast to non-null type kotlinx.coroutines.DispatchedContinuation<T>");
        } catch (Throwable th3) {
            try {
                iVar.mo4353f();
                obj = C4560l.f10773a;
                C4554g.m10210a(obj);
            } catch (Throwable th4) {
                obj = C2286e.m5184a(th4);
            }
            mo4280a(th3, C4554g.m10211b(obj));
        }
    }
}
