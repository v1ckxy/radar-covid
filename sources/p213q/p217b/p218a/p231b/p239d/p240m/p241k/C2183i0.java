package p213q.p217b.p218a.p231b.p239d.p240m.p241k;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import p213q.p217b.p218a.p231b.p239d.C2119d;
import p213q.p217b.p218a.p231b.p239d.p240m.C2133a.C2135b;
import p213q.p217b.p218a.p231b.p239d.p240m.C2147b;
import p213q.p217b.p218a.p231b.p239d.p240m.C2156g;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2169e.C2170a;
import p213q.p217b.p218a.p231b.p270l.C3245d;
import p213q.p217b.p218a.p231b.p270l.C3250f0;
import p213q.p217b.p218a.p231b.p270l.C3257j;
import p213q.p217b.p218a.p231b.p270l.C3259k;

/* renamed from: q.b.a.b.d.m.k.i0 */
public final class C2183i0<ResultT> extends C2179g0 {

    /* renamed from: b */
    public final C2190m<C2135b, ResultT> f6086b;

    /* renamed from: c */
    public final C3257j<ResultT> f6087c;

    /* renamed from: d */
    public final C2160a f6088d;

    public C2183i0(int i, C2190m<C2135b, ResultT> mVar, C3257j<ResultT> jVar, C2160a aVar) {
        super(i);
        this.f6087c = jVar;
        this.f6086b = mVar;
        this.f6088d = aVar;
        if (i == 2 && mVar.f6091b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    /* renamed from: a */
    public final void mo7199a(Status status) {
        C3257j<ResultT> jVar = this.f6087c;
        if (this.f6088d != null) {
            jVar.f8128a.mo8933b(status.f1064h != null ? new C2156g(status) : new C2147b(status));
            return;
        }
        throw null;
    }

    /* renamed from: b */
    public final C2119d[] mo7195b(C2170a<?> aVar) {
        return this.f6086b.f6090a;
    }

    /* renamed from: c */
    public final boolean mo7196c(C2170a<?> aVar) {
        return this.f6086b.f6091b;
    }

    /* renamed from: a */
    public final void mo7201a(C2170a<?> aVar) {
        try {
            C2190m<C2135b, ResultT> mVar = this.f6086b;
            ((C2173e0) mVar).f6079c.f6092a.mo7204a(aVar.f6059b, this.f6087c);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            mo7199a(C2195o.m5019a(e2));
        } catch (RuntimeException e3) {
            this.f6087c.f8128a.mo8933b((Exception) e3);
        }
    }

    /* renamed from: a */
    public final void mo7197a(C2194n0 n0Var, boolean z) {
        C3257j<ResultT> jVar = this.f6087c;
        n0Var.f6096b.put(jVar, Boolean.valueOf(z));
        C3250f0<TResult> f0Var = jVar.f8128a;
        C2196o0 o0Var = new C2196o0(n0Var, jVar);
        if (f0Var != null) {
            f0Var.mo8924a(C3259k.f8131a, (C3245d<TResult>) o0Var);
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo7200a(Exception exc) {
        this.f6087c.f8128a.mo8933b(exc);
    }
}
