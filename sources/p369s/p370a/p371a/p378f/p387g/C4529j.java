package p369s.p370a.p371a.p378f.p387g;

import java.util.Objects;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p369s.p370a.p371a.p374b.C4445l;
import p369s.p370a.p371a.p374b.C4445l.C4447b;
import p369s.p370a.p371a.p375c.C4449b;
import p369s.p370a.p371a.p375c.C4450c;
import p369s.p370a.p371a.p378f.p379a.C4464b;

/* renamed from: s.a.a.f.g.j */
public final class C4529j extends C4445l {

    /* renamed from: a */
    public static final C4529j f10736a = new C4529j();

    /* renamed from: s.a.a.f.g.j$a */
    public static final class C4530a implements Runnable {

        /* renamed from: e */
        public final Runnable f10737e;

        /* renamed from: f */
        public final C4532c f10738f;

        /* renamed from: g */
        public final long f10739g;

        public C4530a(Runnable runnable, C4532c cVar, long j) {
            this.f10737e = runnable;
            this.f10738f = cVar;
            this.f10739g = j;
        }

        public void run() {
            if (!this.f10738f.f10747h) {
                long a = this.f10738f.mo10728a(TimeUnit.MILLISECONDS);
                long j = this.f10739g;
                if (j > a) {
                    try {
                        Thread.sleep(j - a);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        C2286e.m5298b((Throwable) e);
                        return;
                    }
                }
                if (!this.f10738f.f10747h) {
                    this.f10737e.run();
                }
            }
        }
    }

    /* renamed from: s.a.a.f.g.j$b */
    public static final class C4531b implements Comparable<C4531b> {

        /* renamed from: e */
        public final Runnable f10740e;

        /* renamed from: f */
        public final long f10741f;

        /* renamed from: g */
        public final int f10742g;

        /* renamed from: h */
        public volatile boolean f10743h;

        public C4531b(Runnable runnable, Long l, int i) {
            this.f10740e = runnable;
            this.f10741f = l.longValue();
            this.f10742g = i;
        }

        public int compareTo(Object obj) {
            C4531b bVar = (C4531b) obj;
            int compare = Long.compare(this.f10741f, bVar.f10741f);
            return compare == 0 ? Integer.compare(this.f10742g, bVar.f10742g) : compare;
        }
    }

    /* renamed from: s.a.a.f.g.j$c */
    public static final class C4532c extends C4447b implements C4450c {

        /* renamed from: e */
        public final PriorityBlockingQueue<C4531b> f10744e = new PriorityBlockingQueue<>();

        /* renamed from: f */
        public final AtomicInteger f10745f = new AtomicInteger();

        /* renamed from: g */
        public final AtomicInteger f10746g = new AtomicInteger();

        /* renamed from: h */
        public volatile boolean f10747h;

        /* renamed from: s.a.a.f.g.j$c$a */
        public final class C4533a implements Runnable {

            /* renamed from: e */
            public final C4531b f10748e;

            public C4533a(C4531b bVar) {
                this.f10748e = bVar;
            }

            public void run() {
                this.f10748e.f10743h = true;
                C4532c.this.f10744e.remove(this.f10748e);
            }
        }

        /* renamed from: a */
        public C4450c mo10729a(Runnable runnable) {
            return mo10800a(runnable, mo10728a(TimeUnit.MILLISECONDS));
        }

        /* renamed from: a */
        public C4450c mo10800a(Runnable runnable, long j) {
            if (this.f10747h) {
                return C4464b.INSTANCE;
            }
            C4531b bVar = new C4531b(runnable, Long.valueOf(j), this.f10746g.incrementAndGet());
            this.f10744e.add(bVar);
            if (this.f10745f.getAndIncrement() != 0) {
                return C4449b.m10039a(new C4533a(bVar));
            }
            int i = 1;
            while (!this.f10747h) {
                C4531b bVar2 = (C4531b) this.f10744e.poll();
                if (bVar2 == null) {
                    i = this.f10745f.addAndGet(-i);
                    if (i == 0) {
                        return C4464b.INSTANCE;
                    }
                } else if (!bVar2.f10743h) {
                    bVar2.f10740e.run();
                }
            }
            this.f10744e.clear();
            return C4464b.INSTANCE;
        }

        /* renamed from: a */
        public C4450c mo10713a(Runnable runnable, long j, TimeUnit timeUnit) {
            long millis = timeUnit.toMillis(j) + mo10728a(TimeUnit.MILLISECONDS);
            return mo10800a(new C4530a(runnable, this, millis), millis);
        }

        /* renamed from: f */
        public void mo10714f() {
            this.f10747h = true;
        }
    }

    /* renamed from: a */
    public C4447b mo10711a() {
        return new C4532c();
    }

    /* renamed from: a */
    public C4450c mo10726a(Runnable runnable) {
        Objects.requireNonNull(runnable, "run is null");
        runnable.run();
        return C4464b.INSTANCE;
    }

    /* renamed from: a */
    public C4450c mo10712a(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            Objects.requireNonNull(runnable, "run is null");
            runnable.run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            C2286e.m5298b((Throwable) e);
        }
        return C4464b.INSTANCE;
    }
}
