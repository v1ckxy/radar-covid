package p213q.p217b.p218a.p231b.p251g.p257f;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: q.b.a.b.g.f.d1 */
public final class C2801d1 extends C2851q implements C2809f1 {
    public C2801d1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
    }

    /* renamed from: a */
    public final void mo8147a(C2844o0 o0Var) {
        Parcel a = mo8206a();
        C2860s0.m6663a(a, (Parcelable) o0Var);
        Parcel obtain = Parcel.obtain();
        try {
            this.f7083a.transact(2011, a, obtain, 0);
            obtain.readException();
        } finally {
            a.recycle();
            obtain.recycle();
        }
    }
}
