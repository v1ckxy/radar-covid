package p213q.p217b.p218a.p231b.p270l;

import java.util.concurrent.Executor;

/* renamed from: q.b.a.b.l.i */
public abstract class C3255i<TResult> {
    /* renamed from: a */
    public abstract Exception mo8920a();

    /* renamed from: a */
    public abstract <X extends Throwable> TResult mo8921a(Class<X> cls);

    /* renamed from: a */
    public <TContinuationResult> C3255i<TContinuationResult> mo8922a(Executor executor, C3239a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    /* renamed from: a */
    public C3255i<TResult> mo8923a(Executor executor, C3243c cVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    /* renamed from: a */
    public C3255i<TResult> mo8924a(Executor executor, C3245d<TResult> dVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    /* renamed from: a */
    public abstract C3255i<TResult> mo8925a(Executor executor, C3247e eVar);

    /* renamed from: a */
    public abstract C3255i<TResult> mo8926a(Executor executor, C3249f<? super TResult> fVar);

    /* renamed from: a */
    public <TContinuationResult> C3255i<TContinuationResult> mo8927a(Executor executor, C3253h<TResult, TContinuationResult> hVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    /* renamed from: a */
    public <TContinuationResult> C3255i<TContinuationResult> mo8928a(C3239a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    /* renamed from: b */
    public abstract TResult mo8931b();

    /* renamed from: b */
    public <TContinuationResult> C3255i<TContinuationResult> mo8932b(Executor executor, C3239a<TResult, C3255i<TContinuationResult>> aVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    /* renamed from: c */
    public abstract boolean mo8935c();

    /* renamed from: d */
    public abstract boolean mo8936d();
}
