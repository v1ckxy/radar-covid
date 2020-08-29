package p213q.p217b.p218a.p231b.p251g.p254c;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: q.b.a.b.g.c.b */
public class C2325b implements IInterface {

    /* renamed from: a */
    public final IBinder f6288a;

    /* renamed from: b */
    public final String f6289b;

    public C2325b(IBinder iBinder, String str) {
        this.f6288a = iBinder;
        this.f6289b = str;
    }

    /* renamed from: a */
    public final Parcel mo7338a(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f6288a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f6288a;
    }

    /* renamed from: d */
    public final Parcel mo7340d() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f6289b);
        return obtain;
    }
}
