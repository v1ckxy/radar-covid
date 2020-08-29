package p213q.p217b.p218a.p231b.p239d.p240m.p241k;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2169e.C2170a;

/* renamed from: q.b.a.b.d.m.k.o */
public abstract class C2195o {

    /* renamed from: a */
    public final int f6097a;

    public C2195o(int i) {
        this.f6097a = i;
    }

    /* renamed from: a */
    public static /* synthetic */ Status m5019a(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        sb.append(remoteException.getClass().getSimpleName());
        sb.append(": ");
        sb.append(remoteException.getLocalizedMessage());
        return new Status(19, sb.toString());
    }

    /* renamed from: a */
    public abstract void mo7199a(Status status);

    /* renamed from: a */
    public abstract void mo7200a(Exception exc);

    /* renamed from: a */
    public abstract void mo7201a(C2170a<?> aVar);

    /* renamed from: a */
    public abstract void mo7197a(C2194n0 n0Var, boolean z);
}
