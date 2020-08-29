package p119o.p120a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.C4560l;
import p392u.p401r.p402b.C4618l;

/* renamed from: o.a.y0 */
public final class C1009y0 extends C0923c1<C0916a1> {

    /* renamed from: j */
    public static final AtomicIntegerFieldUpdater f2657j = AtomicIntegerFieldUpdater.newUpdater(C1009y0.class, "_invoked");
    public volatile int _invoked = 0;

    /* renamed from: i */
    public final C4618l<Throwable, C4560l> f2658i;

    public C1009y0(C0916a1 a1Var, C4618l<? super Throwable, C4560l> lVar) {
        super(a1Var);
        this.f2658i = lVar;
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object mo3153b(Object obj) {
        mo4271b((Throwable) obj);
        return C4560l.f10773a;
    }

    /* renamed from: b */
    public void mo4271b(Throwable th) {
        if (f2657j.compareAndSet(this, 0, 1)) {
            this.f2658i.mo3153b(th);
        }
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("InvokeOnCancelling[");
        a.append(C1009y0.class.getSimpleName());
        a.append('@');
        a.append(C2286e.m5323d((Object) this));
        a.append(']');
        return a.toString();
    }
}
