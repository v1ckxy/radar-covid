package p213q.p217b.p218a.p231b.p251g.p256e;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: q.b.a.b.g.e.b */
public abstract class C2355b extends C2677t0 implements C2376c {
    public C2355b() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* renamed from: a */
    public final boolean mo7410a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo7470a(parcel.readString(), parcel.readString(), (Bundle) C2724w.m6504a(parcel, Bundle.CREATOR), parcel.readLong());
            parcel2.writeNoException();
        } else if (i != 2) {
            return false;
        } else {
            int a = mo7469a();
            parcel2.writeNoException();
            parcel2.writeInt(a);
        }
        return true;
    }
}
