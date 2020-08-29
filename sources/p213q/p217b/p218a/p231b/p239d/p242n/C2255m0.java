package p213q.p217b.p218a.p231b.p239d.p242n;

import android.os.IBinder;
import android.os.IInterface;
import p213q.p217b.p218a.p231b.p251g.p254c.C2324a;

/* renamed from: q.b.a.b.d.n.m0 */
public abstract class C2255m0 extends C2324a implements C2257n0 {
    /* renamed from: a */
    public static C2257n0 m5108a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof C2257n0 ? (C2257n0) queryLocalInterface : new C2261o0(iBinder);
    }
}
