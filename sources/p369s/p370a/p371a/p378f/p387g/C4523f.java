package p369s.p370a.p371a.p378f.p387g;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import p369s.p370a.p371a.p375c.C4450c;
import p369s.p370a.p371a.p378f.p380b.C4467a;

/* renamed from: s.a.a.f.g.f */
public final class C4523f extends C4523f implements Callable<Void>, C4450c {

    /* renamed from: g */
    public static final FutureTask<Void> f10717g = new FutureTask<>(C4467a.f10554a, null);

    /* renamed from: h */
    public static final FutureTask<Void> f10718h = new FutureTask<>(C4467a.f10554a, null);

    /* renamed from: e */
    public final Runnable f10719e;

    /* renamed from: f */
    public Thread f10720f;

    public C4523f(Runnable runnable) {
        this.f10719e = runnable;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [s.a.a.f.g.f, java.util.concurrent.atomic.AtomicReference] */
    /* renamed from: a */
    public final void mo10792a(Future future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 != f10717g) {
                if (future2 == f10718h) {
                    future.cancel(this.f10720f != Thread.currentThread());
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [s.a.a.f.g.f, java.util.concurrent.atomic.AtomicReference] */
    public Object call() {
        this.f10720f = Thread.currentThread();
        try {
            this.f10719e.run();
            return null;
        } finally {
            lazySet(f10717g);
            this.f10720f = null;
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [s.a.a.f.g.f, java.util.concurrent.atomic.AtomicReference] */
    /* renamed from: f */
    public final void mo10714f() {
        Future future = (Future) get();
        if (future != f10717g) {
            FutureTask<Void> futureTask = f10718h;
            if (future != futureTask && compareAndSet(future, futureTask) && future != null) {
                future.cancel(this.f10720f != Thread.currentThread());
            }
        }
    }
}
