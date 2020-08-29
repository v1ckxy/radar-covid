package p213q.p217b.p218a.p231b.p239d.p240m.p241k;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import p213q.p217b.p218a.p231b.p239d.p240m.C2147b;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2169e.C2170a;
import p213q.p217b.p218a.p231b.p270l.C3257j;

/* renamed from: q.b.a.b.d.m.k.y */
public abstract class C2208y<T> extends C2179g0 {

    /* renamed from: b */
    public final C3257j<T> f6112b;

    public C2208y(int i, C3257j<T> jVar) {
        super(i);
        this.f6112b = jVar;
    }

    /* renamed from: a */
    public void mo7199a(Status status) {
        C3257j<T> jVar = this.f6112b;
        jVar.f8128a.mo8933b((Exception) new C2147b(status));
    }

    /* renamed from: d */
    public abstract void mo7198d(C2170a<?> aVar);

    /* renamed from: a */
    public final void mo7201a(C2170a<?> aVar) {
        try {
            mo7198d(aVar);
        } catch (DeadObjectException e) {
            Status a = C2195o.m5019a((RemoteException) e);
            C3257j<T> jVar = this.f6112b;
            jVar.f8128a.mo8933b((Exception) new C2147b(a));
            throw e;
        } catch (RemoteException e2) {
            Status a2 = C2195o.m5019a(e2);
            C3257j<T> jVar2 = this.f6112b;
            jVar2.f8128a.mo8933b((Exception) new C2147b(a2));
        } catch (RuntimeException e3) {
            this.f6112b.f8128a.mo8933b((Exception) e3);
        }
    }

    /* renamed from: a */
    public void mo7200a(Exception exc) {
        this.f6112b.f8128a.mo8933b(exc);
    }
}
