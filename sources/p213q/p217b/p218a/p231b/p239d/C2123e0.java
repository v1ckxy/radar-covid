package p213q.p217b.p218a.p231b.p239d;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.d.e0 */
public final class C2123e0 implements Creator<C2116b0> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C1061o.m2522b(parcel);
        boolean z = false;
        String str = null;
        IBinder iBinder = null;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                str = C1061o.m2548d(parcel, readInt);
            } else if (i == 2) {
                iBinder = C1061o.m2560h(parcel, readInt);
            } else if (i == 3) {
                z = C1061o.m2559g(parcel, readInt);
            } else if (i != 4) {
                C1061o.m2564l(parcel, readInt);
            } else {
                z2 = C1061o.m2559g(parcel, readInt);
            }
        }
        C1061o.m2557f(parcel, b);
        return new C2116b0(str, iBinder, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2116b0[i];
    }
}
