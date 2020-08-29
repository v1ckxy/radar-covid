package p369s.p370a.p371a.p378f.p387g;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p369s.p370a.p371a.p374b.C4445l;
import p369s.p370a.p371a.p374b.C4445l.C4447b;
import p369s.p370a.p371a.p375c.C4448a;
import p369s.p370a.p371a.p375c.C4450c;
import p369s.p370a.p371a.p378f.p379a.C4464b;

/* renamed from: s.a.a.f.g.b */
public final class C4515b extends C4445l {

    /* renamed from: c */
    public static final C4521e f10691c;

    /* renamed from: d */
    public static final C4521e f10692d;

    /* renamed from: e */
    public static final long f10693e = Long.getLong("rx3.io-keep-alive-time", 60).longValue();

    /* renamed from: f */
    public static final TimeUnit f10694f = TimeUnit.SECONDS;

    /* renamed from: g */
    public static final C4518c f10695g;

    /* renamed from: h */
    public static final C4516a f10696h;

    /* renamed from: a */
    public final ThreadFactory f10697a = f10691c;

    /* renamed from: b */
    public final AtomicReference<C4516a> f10698b = new AtomicReference<>(f10696h);

    /* renamed from: s.a.a.f.g.b$a */
    public static final class C4516a implements Runnable {

        /* renamed from: e */
        public final long f10699e;

        /* renamed from: f */
        public final ConcurrentLinkedQueue<C4518c> f10700f;

        /* renamed from: g */
        public final C4448a f10701g;

        /* renamed from: h */
        public final ScheduledExecutorService f10702h;

        /* renamed from: i */
        public final Future<?> f10703i;

        /* renamed from: j */
        public final ThreadFactory f10704j;

        public C4516a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            Future<?> future;
            this.f10699e = timeUnit != null ? timeUnit.toNanos(j) : 0;
            this.f10700f = new ConcurrentLinkedQueue<>();
            this.f10701g = new C4448a();
            this.f10704j = threadFactory;
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, C4515b.f10692d);
                long j2 = this.f10699e;
                future = scheduledExecutorService.scheduleWithFixedDelay(this, j2, j2, TimeUnit.NANOSECONDS);
            } else {
                future = null;
            }
            this.f10702h = scheduledExecutorService;
            this.f10703i = future;
        }

        public void run() {
            ConcurrentLinkedQueue<C4518c> concurrentLinkedQueue = this.f10700f;
            C4448a aVar = this.f10701g;
            if (!concurrentLinkedQueue.isEmpty()) {
                long nanoTime = System.nanoTime();
                Iterator it = concurrentLinkedQueue.iterator();
                while (it.hasNext()) {
                    C4518c cVar = (C4518c) it.next();
                    if (cVar.f10709g > nanoTime) {
                        return;
                    }
                    if (concurrentLinkedQueue.remove(cVar) && aVar.mo10731b(cVar)) {
                        cVar.mo10714f();
                    }
                }
            }
        }
    }

    /* renamed from: s.a.a.f.g.b$b */
    public static final class C4517b extends C4447b {

        /* renamed from: e */
        public final C4448a f10705e;

        /* renamed from: f */
        public final C4516a f10706f;

        /* renamed from: g */
        public final C4518c f10707g;

        /* renamed from: h */
        public final AtomicBoolean f10708h = new AtomicBoolean();

        public C4517b(C4516a aVar) {
            C4518c cVar;
            C4518c cVar2;
            this.f10706f = aVar;
            this.f10705e = new C4448a();
            if (aVar.f10701g.f10543f) {
                cVar = C4515b.f10695g;
            } else {
                while (true) {
                    if (aVar.f10700f.isEmpty()) {
                        cVar2 = new C4518c(aVar.f10704j);
                        aVar.f10701g.mo10732c(cVar2);
                        break;
                    }
                    cVar2 = (C4518c) aVar.f10700f.poll();
                    if (cVar2 != null) {
                        break;
                    }
                }
                cVar = cVar2;
            }
            this.f10707g = cVar;
        }

        /* renamed from: a */
        public C4450c mo10713a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f10705e.f10543f) {
                return C4464b.INSTANCE;
            }
            return this.f10707g.mo10789a(runnable, j, timeUnit, this.f10705e);
        }

        /* renamed from: f */
        public void mo10714f() {
            if (this.f10708h.compareAndSet(false, true)) {
                this.f10705e.mo10714f();
                C4516a aVar = this.f10706f;
                C4518c cVar = this.f10707g;
                if (aVar != null) {
                    cVar.f10709g = System.nanoTime() + aVar.f10699e;
                    aVar.f10700f.offer(cVar);
                    return;
                }
                throw null;
            }
        }
    }

    /* renamed from: s.a.a.f.g.b$c */
    public static final class C4518c extends C4520d {

        /* renamed from: g */
        public long f10709g = 0;

        public C4518c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        C4518c cVar = new C4518c(new C4521e("RxCachedThreadSchedulerShutdown"));
        f10695g = cVar;
        cVar.mo10714f();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx3.io-priority", 5).intValue()));
        f10691c = new C4521e("RxCachedThreadScheduler", max);
        f10692d = new C4521e("RxCachedWorkerPoolEvictor", max);
        C4516a aVar = new C4516a(0, null, f10691c);
        f10696h = aVar;
        aVar.f10701g.mo10714f();
        Future<?> future = aVar.f10703i;
        if (future != null) {
            future.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = aVar.f10702h;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public C4515b() {
        C4516a aVar = new C4516a(f10693e, f10694f, this.f10697a);
        if (!this.f10698b.compareAndSet(f10696h, aVar)) {
            aVar.f10701g.mo10714f();
            Future<?> future = aVar.f10703i;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = aVar.f10702h;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }
    }

    /* renamed from: a */
    public C4447b mo10711a() {
        return new C4517b((C4516a) this.f10698b.get());
    }
}
