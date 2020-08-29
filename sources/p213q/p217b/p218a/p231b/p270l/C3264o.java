package p213q.p217b.p218a.p231b.p270l;

import java.util.concurrent.Executor;

/* renamed from: q.b.a.b.l.o */
public final class C3264o<TResult, TContinuationResult> implements C3246d0<TResult> {

    /* renamed from: a */
    public final Executor f8143a;

    /* renamed from: b */
    public final C3239a<TResult, TContinuationResult> f8144b;

    /* renamed from: c */
    public final C3250f0<TContinuationResult> f8145c;

    public C3264o(Executor executor, C3239a<TResult, TContinuationResult> aVar, C3250f0<TContinuationResult> f0Var) {
        this.f8143a = executor;
        this.f8144b = aVar;
        this.f8145c = f0Var;
    }

    /* renamed from: a */
    public final void mo8916a(C3255i<TResult> iVar) {
        this.f8143a.execute(new C3266q(this, iVar));
    }
}
