package p369s.p370a.p371a.p378f.p387g;

import java.util.Objects;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p369s.p370a.p371a.p374b.C4445l;
import p369s.p370a.p371a.p374b.C4445l.C4447b;
import p369s.p370a.p371a.p375c.C4448a;
import p369s.p370a.p371a.p375c.C4450c;
import p369s.p370a.p371a.p378f.p379a.C4464b;
import p369s.p370a.p371a.p378f.p379a.C4465c;

/* renamed from: s.a.a.f.g.a */
public final class C4511a extends C4445l {

    /* renamed from: c */
    public static final C4513b f10677c;

    /* renamed from: d */
    public static final C4521e f10678d;

    /* renamed from: e */
    public static final int f10679e;

    /* renamed from: f */
    public static final C4514c f10680f;

    /* renamed from: a */
    public final ThreadFactory f10681a = f10678d;

    /* renamed from: b */
    public final AtomicReference<C4513b> f10682b = new AtomicReference<>(f10677c);

    /* renamed from: s.a.a.f.g.a$a */
    public static final class C4512a extends C4447b {

        /* renamed from: e */
        public final C4465c f10683e = new C4465c();

        /* renamed from: f */
        public final C4448a f10684f = new C4448a();

        /* renamed from: g */
        public final C4465c f10685g;

        /* renamed from: h */
        public final C4514c f10686h;

        /* renamed from: i */
        public volatile boolean f10687i;

        public C4512a(C4514c cVar) {
            this.f10686h = cVar;
            C4465c cVar2 = new C4465c();
            this.f10685g = cVar2;
            cVar2.mo10732c(this.f10683e);
            this.f10685g.mo10732c(this.f10684f);
        }

        /* renamed from: a */
        public C4450c mo10729a(Runnable runnable) {
            if (this.f10687i) {
                return C4464b.INSTANCE;
            }
            return this.f10686h.mo10789a(runnable, 0, TimeUnit.MILLISECONDS, this.f10683e);
        }

        /* renamed from: a */
        public C4450c mo10713a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f10687i) {
                return C4464b.INSTANCE;
            }
            return this.f10686h.mo10789a(runnable, j, timeUnit, this.f10684f);
        }

        /* renamed from: f */
        public void mo10714f() {
            if (!this.f10687i) {
                this.f10687i = true;
                this.f10685g.mo10714f();
            }
        }
    }

    /* renamed from: s.a.a.f.g.a$b */
    public static final class C4513b {

        /* renamed from: a */
        public final int f10688a;

        /* renamed from: b */
        public final C4514c[] f10689b;

        /* renamed from: c */
        public long f10690c;

        public C4513b(int i, ThreadFactory threadFactory) {
            this.f10688a = i;
            this.f10689b = new C4514c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f10689b[i2] = new C4514c(threadFactory);
            }
        }

        /* renamed from: a */
        public C4514c mo10787a() {
            int i = this.f10688a;
            if (i == 0) {
                return C4511a.f10680f;
            }
            C4514c[] cVarArr = this.f10689b;
            long j = this.f10690c;
            this.f10690c = 1 + j;
            return cVarArr[(int) (j % ((long) i))];
        }
    }

    /* renamed from: s.a.a.f.g.a$c */
    public static final class C4514c extends C4520d {
        public C4514c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int intValue = Integer.getInteger("rx3.computation-threads", 0).intValue();
        if (intValue > 0 && intValue <= availableProcessors) {
            availableProcessors = intValue;
        }
        f10679e = availableProcessors;
        C4514c cVar = new C4514c(new C4521e("RxComputationShutdown"));
        f10680f = cVar;
        cVar.mo10714f();
        C4521e eVar = new C4521e("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx3.computation-priority", 5).intValue())), true);
        f10678d = eVar;
        C4513b bVar = new C4513b(0, eVar);
        f10677c = bVar;
        for (C4514c f : bVar.f10689b) {
            f.mo10714f();
        }
    }

    public C4511a() {
        C4513b bVar = new C4513b(f10679e, this.f10681a);
        if (!this.f10682b.compareAndSet(f10677c, bVar)) {
            for (C4514c f : bVar.f10689b) {
                f.mo10714f();
            }
        }
    }

    /* renamed from: a */
    public C4447b mo10711a() {
        return new C4512a(((C4513b) this.f10682b.get()).mo10787a());
    }

    /* renamed from: a */
    public C4450c mo10712a(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        C4514c a = ((C4513b) this.f10682b.get()).mo10787a();
        if (a != null) {
            Objects.requireNonNull(runnable, "run is null");
            C4523f fVar = new C4523f(runnable);
            if (j <= 0) {
                try {
                    future = a.f10712e.submit(fVar);
                } catch (RejectedExecutionException e) {
                    C2286e.m5298b((Throwable) e);
                    return C4464b.INSTANCE;
                }
            } else {
                future = a.f10712e.schedule(fVar, j, timeUnit);
            }
            fVar.mo10792a(future);
            return fVar;
        }
        throw null;
    }
}
