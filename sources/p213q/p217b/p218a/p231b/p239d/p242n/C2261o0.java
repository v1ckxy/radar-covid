package p213q.p217b.p218a.p231b.p239d.p242n;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p213q.p217b.p218a.p231b.p239d.C2116b0;
import p213q.p217b.p218a.p231b.p249e.C2303a;
import p213q.p217b.p218a.p231b.p251g.p254c.C2325b;
import p213q.p217b.p218a.p231b.p251g.p254c.C2326c;

/* renamed from: q.b.a.b.d.n.o0 */
public final class C2261o0 extends C2325b implements C2257n0 {
    public C2261o0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    /* renamed from: a */
    public final boolean mo7286a(C2116b0 b0Var, C2303a aVar) {
        Parcel d = mo7340d();
        C2326c.m5412a(d, (Parcelable) b0Var);
        C2326c.m5411a(d, (IInterface) aVar);
        Parcel a = mo7338a(5, d);
        boolean z = a.readInt() != 0;
        a.recycle();
        return z;
    }
}
