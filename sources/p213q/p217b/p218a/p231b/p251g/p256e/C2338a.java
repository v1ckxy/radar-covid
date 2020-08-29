package p213q.p217b.p218a.p231b.p251g.p256e;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: q.b.a.b.g.e.a */
public class C2338a implements IInterface {

    /* renamed from: a */
    public final IBinder f6298a;

    /* renamed from: b */
    public final String f6299b;

    public C2338a(IBinder iBinder, String str) {
        this.f6298a = iBinder;
        this.f6299b = str;
    }

    /* renamed from: a */
    public final Parcel mo7345a(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f6298a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f6298a;
    }

    /* renamed from: b */
    public final void mo7347b(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f6298a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: d */
    public final Parcel mo7348d() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f6299b);
        return obtain;
    }
}
