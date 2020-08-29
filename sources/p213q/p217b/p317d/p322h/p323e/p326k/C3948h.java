package p213q.p217b.p317d.p322h.p323e.p326k;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p231b.p270l.C3239a;
import p213q.p217b.p218a.p231b.p270l.C3255i;

/* renamed from: q.b.d.h.e.k.h */
public class C3948h {

    /* renamed from: a */
    public final ExecutorService f9640a;

    /* renamed from: b */
    public C3255i<Void> f9641b = C2286e.m5291b(null);

    /* renamed from: c */
    public final Object f9642c = new Object();

    /* renamed from: d */
    public ThreadLocal<Boolean> f9643d = new ThreadLocal<>();

    /* renamed from: q.b.d.h.e.k.h$a */
    public class C3949a implements Runnable {
        public C3949a() {
        }

        public void run() {
            C3948h.this.f9643d.set(Boolean.valueOf(true));
        }
    }

    public C3948h(ExecutorService executorService) {
        this.f9640a = executorService;
        executorService.submit(new C3949a());
    }

    /* renamed from: a */
    public void mo10138a() {
        if (!Boolean.TRUE.equals(this.f9643d.get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    /* renamed from: b */
    public <T> C3255i<T> mo10139b(Callable<C3255i<T>> callable) {
        C3255i<T> b;
        synchronized (this.f9642c) {
            b = this.f9641b.mo8932b(this.f9640a, new C3953j(this, callable));
            this.f9641b = b.mo8922a((Executor) this.f9640a, (C3239a<TResult, TContinuationResult>) new C3955k<TResult,TContinuationResult>(this));
        }
        return b;
    }

    /* renamed from: a */
    public <T> C3255i<T> mo10137a(Callable<T> callable) {
        C3255i<T> a;
        synchronized (this.f9642c) {
            a = this.f9641b.mo8922a((Executor) this.f9640a, (C3239a<TResult, TContinuationResult>) new C3953j<TResult,TContinuationResult>(this, callable));
            this.f9641b = a.mo8922a((Executor) this.f9640a, (C3239a<TResult, TContinuationResult>) new C3955k<TResult,TContinuationResult>(this));
        }
        return a;
    }
}
