package p119o.p120a;

import p119o.p120a.p121a.C0890a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.C4552e;
import p392u.C4557i;
import p392u.C4560l;
import p392u.p395p.C4580d;
import p392u.p395p.C4583f;
import p392u.p395p.p396j.C4590a;
import p392u.p401r.p402b.C4622p;
import p392u.p401r.p403c.C4638h;
import p392u.p401r.p403c.C4645o;

/* renamed from: o.a.d */
public abstract class C0924d<T> extends C0932f1 implements C0916a1, C4580d<T>, C0919b0 {

    /* renamed from: f */
    public final C4583f f2524f;

    /* renamed from: g */
    public final C4583f f2525g;

    public C0924d(C4583f fVar, boolean z) {
        super(z);
        this.f2525g = fVar;
        this.f2524f = fVar.plus(this);
    }

    /* renamed from: a */
    public final void mo4217a(Object obj) {
        Object f = mo4261f(C2286e.m5348h(obj));
        if (f != C0938g1.f2551b) {
            mo4191i(f);
        }
    }

    /* renamed from: a */
    public final <R> void mo4218a(C0922c0 c0Var, R r, C4622p<? super R, ? super C4580d<? super T>, ? extends Object> pVar) {
        Object obj;
        C4583f b;
        Object b2;
        mo4225m();
        int ordinal = c0Var.ordinal();
        if (ordinal == 0) {
            C0967p0.m2204a(pVar, r, (C4580d<? super T>) this);
        } else if (ordinal == 1) {
        } else {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    try {
                        b = mo4219b();
                        b2 = C0890a.m1971b(b, null);
                        if (pVar != null) {
                            C4645o.m10278a((Object) pVar, 2);
                            obj = pVar.mo3781a(r, this);
                            C0890a.m1970a(b, b2);
                            if (obj == C4590a.COROUTINE_SUSPENDED) {
                                return;
                            }
                            mo4217a(obj);
                            return;
                        }
                        throw new C4557i("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                    } catch (Throwable th) {
                        obj = C2286e.m5184a(th);
                    }
                } else {
                    throw new C4552e();
                }
            } else if (pVar != null) {
                C2286e.m5218a(C2286e.m5219a(pVar, r, (C4580d<? super T>) this)).mo4217a(C4560l.f10773a);
            } else {
                C4638h.m10271a("$this$startCoroutine");
                throw null;
            }
        }
    }

    /* renamed from: a */
    public boolean mo4208a() {
        return super.mo4208a();
    }

    /* renamed from: b */
    public final C4583f mo4219b() {
        return this.f2524f;
    }

    /* renamed from: c */
    public C4583f mo4170c() {
        return this.f2524f;
    }

    /* renamed from: c */
    public final void mo4220c(Throwable th) {
        C2286e.m5249a(this.f2524f, th);
    }

    /* renamed from: d */
    public String mo4221d() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" was cancelled");
        return sb.toString();
    }

    /* renamed from: g */
    public final void mo4222g(Object obj) {
        if (obj instanceof C0975s) {
            C0975s sVar = (C0975s) obj;
            Throwable th = sVar.f2591a;
            int i = sVar._handled;
        }
    }

    /* renamed from: i */
    public void mo4191i(Object obj) {
        mo4190b(obj);
    }

    /* renamed from: k */
    public String mo4223k() {
        C1006x.m2302a(this.f2524f);
        return super.mo4223k();
    }

    /* renamed from: l */
    public final void mo4224l() {
        mo4226n();
    }

    /* renamed from: m */
    public final void mo4225m() {
        mo4248a((C0916a1) this.f2525g.get(C0916a1.f2512d));
    }

    /* renamed from: n */
    public void mo4226n() {
    }
}
