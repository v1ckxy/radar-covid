package p213q.p217b.p218a.p231b.p270l;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.l.f0 */
public final class C3250f0<TResult> extends C3255i<TResult> {

    /* renamed from: a */
    public final Object f8120a = new Object();

    /* renamed from: b */
    public final C3244c0<TResult> f8121b = new C3244c0<>();
    @GuardedBy("mLock")

    /* renamed from: c */
    public boolean f8122c;

    /* renamed from: d */
    public volatile boolean f8123d;
    @GuardedBy("mLock")

    /* renamed from: e */
    public TResult f8124e;
    @GuardedBy("mLock")

    /* renamed from: f */
    public Exception f8125f;

    /* renamed from: a */
    public final Exception mo8920a() {
        Exception exc;
        synchronized (this.f8120a) {
            exc = this.f8125f;
        }
        return exc;
    }

    /* renamed from: a */
    public final <X extends Throwable> TResult mo8921a(Class<X> cls) {
        TResult tresult;
        synchronized (this.f8120a) {
            C1061o.m2534b(this.f8122c, (Object) "Task is not yet complete");
            if (this.f8123d) {
                throw new CancellationException("Task is already canceled.");
            } else if (cls.isInstance(this.f8125f)) {
                throw ((Throwable) cls.cast(this.f8125f));
            } else if (this.f8125f == null) {
                tresult = this.f8124e;
            } else {
                throw new C3251g(this.f8125f);
            }
        }
        return tresult;
    }

    /* renamed from: a */
    public final <TContinuationResult> C3255i<TContinuationResult> mo8922a(Executor executor, C3239a<TResult, TContinuationResult> aVar) {
        C3250f0 f0Var = new C3250f0();
        C3244c0<TResult> c0Var = this.f8121b;
        C3252g0.m7579a(executor);
        c0Var.mo8917a((C3246d0<TResult>) new C3264o<TResult>(executor, aVar, f0Var));
        mo8938f();
        return f0Var;
    }

    /* renamed from: a */
    public final C3255i<TResult> mo8923a(Executor executor, C3243c cVar) {
        C3244c0<TResult> c0Var = this.f8121b;
        C3252g0.m7579a(executor);
        c0Var.mo8917a((C3246d0<TResult>) new C3269t<TResult>(executor, cVar));
        mo8938f();
        return this;
    }

    /* renamed from: a */
    public final C3255i<TResult> mo8924a(Executor executor, C3245d<TResult> dVar) {
        C3244c0<TResult> c0Var = this.f8121b;
        C3252g0.m7579a(executor);
        c0Var.mo8917a((C3246d0<TResult>) new C3270u<TResult>(executor, dVar));
        mo8938f();
        return this;
    }

    /* renamed from: a */
    public final C3255i<TResult> mo8925a(Executor executor, C3247e eVar) {
        C3244c0<TResult> c0Var = this.f8121b;
        C3252g0.m7579a(executor);
        c0Var.mo8917a((C3246d0<TResult>) new C3273x<TResult>(executor, eVar));
        mo8938f();
        return this;
    }

    /* renamed from: a */
    public final C3255i<TResult> mo8926a(Executor executor, C3249f<? super TResult> fVar) {
        C3244c0<TResult> c0Var = this.f8121b;
        C3252g0.m7579a(executor);
        c0Var.mo8917a((C3246d0<TResult>) new C3274y<TResult>(executor, fVar));
        mo8938f();
        return this;
    }

    /* renamed from: a */
    public final <TContinuationResult> C3255i<TContinuationResult> mo8927a(Executor executor, C3253h<TResult, TContinuationResult> hVar) {
        C3250f0 f0Var = new C3250f0();
        C3244c0<TResult> c0Var = this.f8121b;
        C3252g0.m7579a(executor);
        c0Var.mo8917a((C3246d0<TResult>) new C3242b0<TResult>(executor, hVar, f0Var));
        mo8938f();
        return f0Var;
    }

    /* renamed from: a */
    public final <TContinuationResult> C3255i<TContinuationResult> mo8928a(C3239a<TResult, TContinuationResult> aVar) {
        return mo8922a(C3259k.f8131a, aVar);
    }

    /* renamed from: b */
    public final TResult mo8931b() {
        TResult tresult;
        synchronized (this.f8120a) {
            C1061o.m2534b(this.f8122c, (Object) "Task is not yet complete");
            if (this.f8123d) {
                throw new CancellationException("Task is already canceled.");
            } else if (this.f8125f == null) {
                tresult = this.f8124e;
            } else {
                throw new C3251g(this.f8125f);
            }
        }
        return tresult;
    }

    /* renamed from: b */
    public final <TContinuationResult> C3255i<TContinuationResult> mo8932b(Executor executor, C3239a<TResult, C3255i<TContinuationResult>> aVar) {
        C3250f0 f0Var = new C3250f0();
        C3244c0<TResult> c0Var = this.f8121b;
        C3252g0.m7579a(executor);
        c0Var.mo8917a((C3246d0<TResult>) new C3265p<TResult>(executor, aVar, f0Var));
        mo8938f();
        return f0Var;
    }

    /* renamed from: b */
    public final boolean mo8933b(Exception exc) {
        C1061o.m2525b(exc, (Object) "Exception must not be null");
        synchronized (this.f8120a) {
            if (this.f8122c) {
                return false;
            }
            this.f8122c = true;
            this.f8125f = exc;
            this.f8121b.mo8918a((C3255i<TResult>) this);
            return true;
        }
    }

    /* renamed from: b */
    public final boolean mo8934b(TResult tresult) {
        synchronized (this.f8120a) {
            if (this.f8122c) {
                return false;
            }
            this.f8122c = true;
            this.f8124e = tresult;
            this.f8121b.mo8918a((C3255i<TResult>) this);
            return true;
        }
    }

    /* renamed from: c */
    public final boolean mo8935c() {
        boolean z;
        synchronized (this.f8120a) {
            z = this.f8122c;
        }
        return z;
    }

    /* renamed from: d */
    public final boolean mo8936d() {
        boolean z;
        synchronized (this.f8120a) {
            z = this.f8122c && !this.f8123d && this.f8125f == null;
        }
        return z;
    }

    /* renamed from: e */
    public final boolean mo8937e() {
        synchronized (this.f8120a) {
            if (this.f8122c) {
                return false;
            }
            this.f8122c = true;
            this.f8123d = true;
            this.f8121b.mo8918a((C3255i<TResult>) this);
            return true;
        }
    }

    /* renamed from: f */
    public final void mo8938f() {
        synchronized (this.f8120a) {
            if (this.f8122c) {
                this.f8121b.mo8918a((C3255i<TResult>) this);
            }
        }
    }

    /* renamed from: a */
    public final void mo8929a(Exception exc) {
        C1061o.m2525b(exc, (Object) "Exception must not be null");
        synchronized (this.f8120a) {
            if (!this.f8122c) {
                this.f8122c = true;
                this.f8125f = exc;
            } else {
                throw C3241b.m7548a(this);
            }
        }
        this.f8121b.mo8918a((C3255i<TResult>) this);
    }

    /* renamed from: a */
    public final void mo8930a(TResult tresult) {
        synchronized (this.f8120a) {
            if (!this.f8122c) {
                this.f8122c = true;
                this.f8124e = tresult;
            } else {
                throw C3241b.m7548a(this);
            }
        }
        this.f8121b.mo8918a((C3255i<TResult>) this);
    }
}
