package p119o.p120a.p123u1;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p119o.p120a.C0928e0;
import p119o.p120a.C0976s0;
import p392u.p395p.C4583f;

/* renamed from: o.a.u1.e */
public final class C0993e extends C0976s0 implements C0997i, Executor {

    /* renamed from: j */
    public static final AtomicIntegerFieldUpdater f2633j = AtomicIntegerFieldUpdater.newUpdater(C0993e.class, "inFlightTasks");

    /* renamed from: f */
    public final ConcurrentLinkedQueue<Runnable> f2634f = new ConcurrentLinkedQueue<>();

    /* renamed from: g */
    public final C0991c f2635g;

    /* renamed from: h */
    public final int f2636h;

    /* renamed from: i */
    public final int f2637i;
    public volatile int inFlightTasks = 0;

    public C0993e(C0991c cVar, int i, int i2) {
        this.f2635g = cVar;
        this.f2636h = i;
        this.f2637i = i2;
    }

    /* renamed from: a */
    public final void mo4350a(Runnable runnable, boolean z) {
        while (f2633j.incrementAndGet(this) > this.f2636h) {
            this.f2634f.add(runnable);
            if (f2633j.decrementAndGet(this) < this.f2636h) {
                runnable = (Runnable) this.f2634f.poll();
                if (runnable == null) {
                    return;
                }
            } else {
                return;
            }
        }
        C0991c cVar = this.f2635g;
        if (cVar != null) {
            try {
                cVar.f2628f.mo4330a(runnable, (C0997i) this, z);
            } catch (RejectedExecutionException unused) {
                C0928e0.f2529l.mo4300a(cVar.f2628f.mo4329a(runnable, this));
            }
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public void mo4301a(C4583f fVar, Runnable runnable) {
        mo4350a(runnable, false);
    }

    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    public void execute(Runnable runnable) {
        mo4350a(runnable, false);
    }

    /* renamed from: f */
    public void mo4353f() {
        Runnable runnable = (Runnable) this.f2634f.poll();
        if (runnable != null) {
            C0991c cVar = this.f2635g;
            if (cVar != null) {
                try {
                    cVar.f2628f.mo4330a(runnable, (C0997i) this, true);
                } catch (RejectedExecutionException unused) {
                    C0928e0.f2529l.mo4300a(cVar.f2628f.mo4329a(runnable, this));
                }
                return;
            }
            throw null;
        }
        f2633j.decrementAndGet(this);
        Runnable runnable2 = (Runnable) this.f2634f.poll();
        if (runnable2 != null) {
            mo4350a(runnable2, true);
        }
    }

    /* renamed from: k */
    public int mo4354k() {
        return this.f2637i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[dispatcher = ");
        sb.append(this.f2635g);
        sb.append(']');
        return sb.toString();
    }
}
