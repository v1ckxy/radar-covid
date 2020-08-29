package p213q.p217b.p317d.p322h;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p213q.p217b.p218a.p231b.p270l.C3253h;
import p213q.p217b.p218a.p231b.p270l.C3255i;
import p213q.p217b.p317d.C3859c;
import p213q.p217b.p317d.p322h.p323e.C3918e;
import p213q.p217b.p317d.p322h.p323e.C3919f;
import p213q.p217b.p317d.p322h.p323e.C3921h;
import p213q.p217b.p317d.p322h.p323e.p326k.C3939e0;
import p213q.p217b.p317d.p322h.p323e.p326k.C3941f0;
import p213q.p217b.p317d.p322h.p323e.p326k.C3959l0;
import p213q.p217b.p317d.p322h.p323e.p326k.C4003z0;
import p213q.p217b.p317d.p322h.p323e.p337s.C4166d;

/* renamed from: q.b.d.h.c */
public class C3910c implements Callable<Void> {

    /* renamed from: e */
    public final /* synthetic */ C3921h f9547e;

    /* renamed from: f */
    public final /* synthetic */ ExecutorService f9548f;

    /* renamed from: g */
    public final /* synthetic */ C4166d f9549g;

    /* renamed from: h */
    public final /* synthetic */ boolean f9550h;

    /* renamed from: i */
    public final /* synthetic */ C3941f0 f9551i;

    public C3910c(C3921h hVar, ExecutorService executorService, C4166d dVar, boolean z, C3941f0 f0Var) {
        this.f9547e = hVar;
        this.f9548f = executorService;
        this.f9549g = dVar;
        this.f9550h = z;
        this.f9551i = f0Var;
    }

    public Object call() {
        C3921h hVar = this.f9547e;
        ExecutorService executorService = this.f9548f;
        C4166d dVar = this.f9549g;
        C3859c cVar = hVar.f9562b;
        cVar.mo10056a();
        String str = cVar.f9461c.f9472b;
        C3959l0 l0Var = hVar.f9573m;
        C4003z0.m9443a((C3255i<T>) l0Var.f9666g.f8128a, l0Var.mo10150b()).mo8927a((Executor) executorService, (C3253h<TResult, TContinuationResult>) new C3919f<TResult,TContinuationResult>(hVar, dVar)).mo8927a((Executor) executorService, (C3253h<TResult, TContinuationResult>) new C3918e<TResult,TContinuationResult>(hVar, str, dVar, executorService));
        if (this.f9550h) {
            C3941f0 f0Var = this.f9551i;
            C4003z0.m9442a((Executor) f0Var.f9618k, (Callable<C3255i<T>>) new C3939e0<C3255i<T>>(f0Var, this.f9549g));
        }
        return null;
    }
}
