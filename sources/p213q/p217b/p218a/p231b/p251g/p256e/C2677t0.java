package p213q.p217b.p218a.p231b.p251g.p256e;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: q.b.a.b.g.e.t0 */
public class C2677t0 extends Binder implements IInterface {
    public C2677t0(String str) {
        attachInterface(this, str);
    }

    /* renamed from: a */
    public boolean mo7410a(int i, Parcel parcel, Parcel parcel2, int i2) {
        throw null;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        if (i > 16777215) {
            z = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            return true;
        }
        return mo7410a(i, parcel, parcel2, i2);
    }
}
