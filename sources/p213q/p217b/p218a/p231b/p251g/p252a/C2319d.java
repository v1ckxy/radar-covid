package p213q.p217b.p218a.p231b.p251g.p252a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: q.b.a.b.g.a.d */
public final class C2319d implements C2317b, IInterface {

    /* renamed from: a */
    public final IBinder f6284a;

    /* renamed from: b */
    public final String f6285b = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    public C2319d(IBinder iBinder) {
        this.f6284a = iBinder;
    }

    /* renamed from: a */
    public final Parcel mo7330a(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f6284a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f6284a;
    }

    public final String getId() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f6285b);
        Parcel a = mo7330a(1, obtain);
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: a */
    public final boolean mo7328a(boolean z) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f6285b);
        C2316a.m5399a(obtain);
        Parcel a = mo7330a(2, obtain);
        boolean z2 = a.readInt() != 0;
        a.recycle();
        return z2;
    }
}
