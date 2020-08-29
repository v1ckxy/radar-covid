package p213q.p217b.p218a.p231b.p270l;

import java.util.concurrent.Executor;

/* renamed from: q.b.a.b.l.b0 */
public final class C3242b0<TResult, TContinuationResult> implements C3243c, C3247e, C3249f<TContinuationResult>, C3246d0<TResult> {

    /* renamed from: a */
    public final Executor f8114a;

    /* renamed from: b */
    public final C3253h<TResult, TContinuationResult> f8115b;

    /* renamed from: c */
    public final C3250f0<TContinuationResult> f8116c;

    public C3242b0(Executor executor, C3253h<TResult, TContinuationResult> hVar, C3250f0<TContinuationResult> f0Var) {
        this.f8114a = executor;
        this.f8115b = hVar;
        this.f8116c = f0Var;
    }

    /* renamed from: a */
    public final void mo8915a() {
        this.f8116c.mo8937e();
    }

    /* renamed from: a */
    public final void mo4211a(Exception exc) {
        this.f8116c.mo8929a(exc);
    }

    /* renamed from: a */
    public final void mo4216a(TContinuationResult tcontinuationresult) {
        this.f8116c.mo8930a(tcontinuationresult);
    }

    /* renamed from: a */
    public final void mo8916a(C3255i<TResult> iVar) {
        this.f8114a.execute(new C3240a0(this, iVar));
    }
}
