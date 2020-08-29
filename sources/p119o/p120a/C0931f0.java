package p119o.p120a;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p116io.jsonwebtoken.lang.Objects;
import p119o.p120a.p121a.C0890a;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.p395p.C4580d;
import p392u.p395p.C4583f;
import p392u.p395p.p397k.p398a.C4596d;

/* renamed from: o.a.f0 */
public final class C0931f0<T> extends C0943i0<T> implements C4596d, C4580d<T> {

    /* renamed from: m */
    public static final AtomicReferenceFieldUpdater f2533m = AtomicReferenceFieldUpdater.newUpdater(C0931f0.class, Object.class, "_reusableCancellableContinuation");
    public volatile Object _reusableCancellableContinuation;

    /* renamed from: h */
    public Object f2534h = C0937g0.f2548a;

    /* renamed from: i */
    public final C4596d f2535i;

    /* renamed from: j */
    public final Object f2536j;

    /* renamed from: k */
    public final C1010z f2537k;

    /* renamed from: l */
    public final C4580d<T> f2538l;

    public C0931f0(C1010z zVar, C4580d<? super T> dVar) {
        super(0);
        this.f2537k = zVar;
        this.f2538l = dVar;
        if (!(dVar instanceof C4596d)) {
            dVar = null;
        }
        this.f2535i = (C4596d) dVar;
        this.f2536j = C0890a.m1969a(mo4219b());
        this._reusableCancellableContinuation = null;
    }

    /* renamed from: a */
    public C4580d<T> mo4239a() {
        return this;
    }

    /* renamed from: a */
    public void mo4217a(Object obj) {
        C4583f b;
        Object b2;
        C4583f b3 = this.f2538l.mo4219b();
        Object h = C2286e.m5348h(obj);
        if (this.f2537k.mo4320b(b3)) {
            this.f2534h = h;
            this.f2559g = 0;
            this.f2537k.mo4301a(b3, this);
            return;
        }
        C0968p1 p1Var = C0968p1.f2584b;
        C0955m0 a = C0968p1.m2253a();
        if (a.mo4297m()) {
            this.f2534h = h;
            this.f2559g = 0;
            a.mo4293a((C0943i0<?>) this);
            return;
        }
        a.mo4296c(true);
        try {
            b = mo4219b();
            b2 = C0890a.m1971b(b, this.f2536j);
            this.f2538l.mo4217a(obj);
            C0890a.m1970a(b, b2);
            do {
            } while (a.mo4299r());
        } catch (Throwable th) {
            try {
                mo4280a(th, (Throwable) null);
            } catch (Throwable th2) {
                a.mo4294a(true);
                throw th2;
            }
        }
        a.mo4294a(true);
    }

    /* renamed from: b */
    public C4583f mo4219b() {
        return this.f2538l.mo4219b();
    }

    /* renamed from: c */
    public Object mo4240c() {
        Object obj = this.f2534h;
        this.f2534h = C0937g0.f2548a;
        return obj;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("DispatchedContinuation[");
        a.append(this.f2537k);
        a.append(Objects.ARRAY_ELEMENT_SEPARATOR);
        a.append(C2286e.m5286b(this.f2538l));
        a.append(']');
        return a.toString();
    }
}
