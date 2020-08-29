package p369s.p370a.p371a.p378f.p387g;

import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p369s.p370a.p371a.p374b.C4445l;
import p369s.p370a.p371a.p374b.C4445l.C4447b;
import p369s.p370a.p371a.p375c.C4448a;
import p369s.p370a.p371a.p375c.C4450c;
import p369s.p370a.p371a.p378f.p379a.C4464b;

/* renamed from: s.a.a.f.g.i */
public final class C4527i extends C4445l {

    /* renamed from: b */
    public static final C4521e f10730b = new C4521e("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.single-priority", 5).intValue())), true);

    /* renamed from: c */
    public static final ScheduledExecutorService f10731c;

    /* renamed from: a */
    public final AtomicReference<ScheduledExecutorService> f10732a;

    /* renamed from: s.a.a.f.g.i$a */
    public static final class C4528a extends C4447b {

        /* renamed from: e */
        public final ScheduledExecutorService f10733e;

        /* renamed from: f */
        public final C4448a f10734f = new C4448a();

        /* renamed from: g */
        public volatile boolean f10735g;

        public C4528a(ScheduledExecutorService scheduledExecutorService) {
            this.f10733e = scheduledExecutorService;
        }

        /* renamed from: a */
        public C4450c mo10713a(Runnable runnable, long j, TimeUnit timeUnit) {
            Future future;
            if (this.f10735g) {
                return C4464b.INSTANCE;
            }
            Objects.requireNonNull(runnable, "run is null");
            C4524g gVar = new C4524g(runnable, this.f10734f);
            this.f10734f.mo10732c(gVar);
            if (j <= 0) {
                try {
                    future = this.f10733e.submit(gVar);
                } catch (RejectedExecutionException e) {
                    mo10714f();
                    C2286e.m5298b((Throwable) e);
                    return C4464b.INSTANCE;
                }
            } else {
                future = this.f10733e.schedule(gVar, j, timeUnit);
            }
            gVar.mo10794a(future);
            return gVar;
        }

        /* renamed from: f */
        public void mo10714f() {
            if (!this.f10735g) {
                this.f10735g = true;
                this.f10734f.mo10714f();
            }
        }
    }

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f10731c = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
    }

    public C4527i() {
        C4521e eVar = f10730b;
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f10732a = atomicReference;
        atomicReference.lazySet(C4525h.m10189a(eVar));
    }

    /* renamed from: a */
    public C4447b mo10711a() {
        return new C4528a((ScheduledExecutorService) this.f10732a.get());
    }

    /* renamed from: a */
    public C4450c mo10712a(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        Objects.requireNonNull(runnable, "run is null");
        C4523f fVar = new C4523f(runnable);
        if (j <= 0) {
            try {
                future = ((ScheduledExecutorService) this.f10732a.get()).submit(fVar);
            } catch (RejectedExecutionException e) {
                C2286e.m5298b((Throwable) e);
                return C4464b.INSTANCE;
            }
        } else {
            future = ((ScheduledExecutorService) this.f10732a.get()).schedule(fVar, j, timeUnit);
        }
        fVar.mo10792a(future);
        return fVar;
    }
}
