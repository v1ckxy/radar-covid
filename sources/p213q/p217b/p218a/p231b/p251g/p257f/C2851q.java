package p213q.p217b.p218a.p231b.p251g.p257f;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: q.b.a.b.g.f.q */
public class C2851q implements IInterface {

    /* renamed from: a */
    public final IBinder f7083a;

    /* renamed from: b */
    public final String f7084b;

    public C2851q(IBinder iBinder, String str) {
        this.f7083a = iBinder;
        this.f7084b = str;
    }

    /* renamed from: a */
    public final Parcel mo8206a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f7084b);
        return obtain;
    }

    /* renamed from: a */
    public final void mo8207a(int i, Parcel parcel) {
        try {
            this.f7083a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f7083a;
    }
}
