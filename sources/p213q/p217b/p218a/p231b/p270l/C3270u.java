package p213q.p217b.p218a.p231b.p270l;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: q.b.a.b.l.u */
public final class C3270u<TResult> implements C3246d0<TResult> {

    /* renamed from: a */
    public final Executor f8157a;

    /* renamed from: b */
    public final Object f8158b = new Object();
    @GuardedBy("mLock")

    /* renamed from: c */
    public C3245d<TResult> f8159c;

    public C3270u(Executor executor, C3245d<TResult> dVar) {
        this.f8157a = executor;
        this.f8159c = dVar;
    }

    /* renamed from: a */
    public final void mo8916a(C3255i<TResult> iVar) {
        synchronized (this.f8158b) {
            if (this.f8159c != null) {
                this.f8157a.execute(new C3271v(this, iVar));
            }
        }
    }
}
