package p369s.p370a.p371a.p374b;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p369s.p370a.p371a.p375c.C4450c;
import p369s.p370a.p371a.p378f.p387g.C4520d;

/* renamed from: s.a.a.b.l */
public abstract class C4445l {

    /* renamed from: s.a.a.b.l$a */
    public static final class C4446a implements C4450c, Runnable {

        /* renamed from: e */
        public final Runnable f10539e;

        /* renamed from: f */
        public final C4447b f10540f;

        /* renamed from: g */
        public Thread f10541g;

        public C4446a(Runnable runnable, C4447b bVar) {
            this.f10539e = runnable;
            this.f10540f = bVar;
        }

        /* renamed from: f */
        public void mo10714f() {
            if (this.f10541g == Thread.currentThread()) {
                C4447b bVar = this.f10540f;
                if (bVar instanceof C4520d) {
                    C4520d dVar = (C4520d) bVar;
                    if (!dVar.f10713f) {
                        dVar.f10713f = true;
                        dVar.f10712e.shutdown();
                        return;
                    }
                    return;
                }
            }
            this.f10540f.mo10714f();
        }

        public void run() {
            this.f10541g = Thread.currentThread();
            try {
                this.f10539e.run();
            } finally {
                mo10714f();
                this.f10541g = null;
            }
        }
    }

    /* renamed from: s.a.a.b.l$b */
    public static abstract class C4447b implements C4450c {
        /* renamed from: a */
        public long mo10728a(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        /* renamed from: a */
        public C4450c mo10729a(Runnable runnable) {
            return mo10713a(runnable, 0, TimeUnit.NANOSECONDS);
        }

        /* renamed from: a */
        public abstract C4450c mo10713a(Runnable runnable, long j, TimeUnit timeUnit);
    }

    static {
        TimeUnit.MINUTES.toNanos(Long.getLong("rx3.scheduler.drift-tolerance", 15).longValue());
    }

    /* renamed from: a */
    public abstract C4447b mo10711a();

    /* renamed from: a */
    public C4450c mo10726a(Runnable runnable) {
        return mo10712a(runnable, 0, TimeUnit.NANOSECONDS);
    }

    /* renamed from: a */
    public C4450c mo10712a(Runnable runnable, long j, TimeUnit timeUnit) {
        C4447b a = mo10711a();
        Objects.requireNonNull(runnable, "run is null");
        C4446a aVar = new C4446a(runnable, a);
        a.mo10713a(aVar, j, timeUnit);
        return aVar;
    }
}
