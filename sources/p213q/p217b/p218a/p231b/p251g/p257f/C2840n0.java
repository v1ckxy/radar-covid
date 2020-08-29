package p213q.p217b.p218a.p231b.p251g.p257f;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.g.f.n0 */
public final class C2840n0 implements Creator<C2828k0> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C1061o.m2522b(parcel);
        IBinder iBinder = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 1) {
                C1061o.m2564l(parcel, readInt);
            } else {
                iBinder = C1061o.m2560h(parcel, readInt);
            }
        }
        C1061o.m2557f(parcel, b);
        return new C2828k0(iBinder);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2828k0[i];
    }
}
