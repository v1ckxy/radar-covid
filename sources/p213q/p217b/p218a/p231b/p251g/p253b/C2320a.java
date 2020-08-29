package p213q.p217b.p218a.p231b.p251g.p253b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: q.b.a.b.g.b.a */
public class C2320a extends Binder implements IInterface {
    public C2320a(String str) {
        attachInterface(this, str);
    }

    /* renamed from: a */
    public boolean mo7194a(int i, Parcel parcel, Parcel parcel2, int i2) {
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
        return mo7194a(i, parcel, parcel2, i2);
    }
}
