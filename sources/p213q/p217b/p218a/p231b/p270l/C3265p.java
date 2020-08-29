package p213q.p217b.p218a.p231b.p270l;

import java.util.concurrent.Executor;

/* renamed from: q.b.a.b.l.p */
public final class C3265p<TResult, TContinuationResult> implements C3243c, C3247e, C3249f<TContinuationResult>, C3246d0<TResult> {

    /* renamed from: a */
    public final Executor f8146a;

    /* renamed from: b */
    public final C3239a<TResult, C3255i<TContinuationResult>> f8147b;

    /* renamed from: c */
    public final C3250f0<TContinuationResult> f8148c;

    public C3265p(Executor executor, C3239a<TResult, C3255i<TContinuationResult>> aVar, C3250f0<TContinuationResult> f0Var) {
        this.f8146a = executor;
        this.f8147b = aVar;
        this.f8148c = f0Var;
    }

    /* renamed from: a */
    public final void mo8915a() {
        this.f8148c.mo8937e();
    }

    /* renamed from: a */
    public final void mo4211a(Exception exc) {
        this.f8148c.mo8929a(exc);
    }

    /* renamed from: a */
    public final void mo4216a(TContinuationResult tcontinuationresult) {
        this.f8148c.mo8930a(tcontinuationresult);
    }

    /* renamed from: a */
    public final void mo8916a(C3255i<TResult> iVar) {
        this.f8146a.execute(new C3267r(this, iVar));
    }
}
