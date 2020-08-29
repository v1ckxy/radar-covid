package p369s.p370a.p371a.p378f.p387g;

import java.util.Objects;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p369s.p370a.p371a.p374b.C4445l.C4447b;
import p369s.p370a.p371a.p375c.C4450c;
import p369s.p370a.p371a.p375c.C4451d;
import p369s.p370a.p371a.p378f.p379a.C4464b;

/* renamed from: s.a.a.f.g.d */
public class C4520d extends C4447b implements C4450c {

    /* renamed from: e */
    public final ScheduledExecutorService f10712e;

    /* renamed from: f */
    public volatile boolean f10713f;

    public C4520d(ThreadFactory threadFactory) {
        this.f10712e = C4525h.m10189a(threadFactory);
    }

    /* renamed from: a */
    public C4450c mo10729a(Runnable runnable) {
        return mo10713a(runnable, 0, null);
    }

    /* renamed from: a */
    public C4450c mo10713a(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f10713f ? C4464b.INSTANCE : mo10789a(runnable, j, timeUnit, null);
    }

    /* renamed from: a */
    public C4524g mo10789a(Runnable runnable, long j, TimeUnit timeUnit, C4451d dVar) {
        Future future;
        Objects.requireNonNull(runnable, "run is null");
        C4524g gVar = new C4524g(runnable, dVar);
        if (dVar != null && !dVar.mo10732c(gVar)) {
            return gVar;
        }
        if (j <= 0) {
            try {
                future = this.f10712e.submit(gVar);
            } catch (RejectedExecutionException e) {
                if (dVar != null) {
                    dVar.mo10730a(gVar);
                }
                C2286e.m5298b((Throwable) e);
            }
        } else {
            future = this.f10712e.schedule(gVar, j, timeUnit);
        }
        gVar.mo10794a(future);
        return gVar;
    }

    /* renamed from: f */
    public void mo10714f() {
        if (!this.f10713f) {
            this.f10713f = true;
            this.f10712e.shutdownNow();
        }
    }
}
